/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;


import BO.Administration.BOOPDConsultant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Muhammad Talha Khan
 */
public class OPDConsultantHandler {
    
    
     public List<BOOPDConsultant> selectConsultantSearch(String fromDate, 
             String toDate, String userId, String SpecialityId) {
         
          String columns[] = {"-","TOTAL","DOC_NAME","CONSULTANT_ID", "TYPEE",
              "DESIGNATION", "SPECIALITY"};
          
          String query ="SELECT COUNT(OPC.ID) TOTAL,                         \n"
                  +"USR.NAME DOC_NAME,                                       \n"
                  +"OPC.CONSULTANT_ID CONSULTANT_ID,                         \n"
                  +"USR.TYPE TYPEE,                                          \n"
                  +"DEF.DESCRIPTION DESIGNATION,                             \n"
                  +"SPE.DESCRIPTION SPECIALITY                               \n"
                  + "FROM  " + Database.DCMS.opdPerformedConsultancy+ " OPC,   \n"
                 +Database.DCMS.invoiceDetail+"IVD,                          \n"
                  +Database.DCMS.definitionTypeDetail+"DEF,                  \n"
                  +Database.DCMS.definitionTypeDetail+"SPE,                  \n"
                  +Database.DCMS.users+"USR                                  \n"
                  +"WHERE 1 = 1                                              \n";
                
                  if(fromDate.length() != 0 && toDate.length() != 0){
                      query += "AND IVD.TRN_DATE BETWEEN '" + fromDate +  
                    "' AND '" + toDate + "'                                  \n";
                  }
                  query +="AND OPC.COMPLETE_ORDER_NO=IVD.COMPLETE_ORDER_NO   \n"
                  +"AND OPC.ORDER_DETAIL_ID=IVD.ORDER_DETAIL_ID              \n"
                  +"AND IVD.CPT_ID=OPC.CPT_ID                                \n"
                  +"AND OPC.CONSULTANT_ID=USR.USER_NAME                      \n";
                  if(SpecialityId.length() != 0){
                      query += "AND USR.SPECIALITY_ID = "+SpecialityId+"                     \n";
                  }
                  
                  if(userId.length() != 0){
                      query += "AND OPC.CONSULTANT_ID = '"+userId+"'                     \n";
                  }
                  
                  query +="AND OPC.CONSULTANT_ID !='PLC'\n"
                  +"AND USR.DESIGNATION_ID=DEF.ID\n"
                  +"AND USR.SPECIALITY_ID=SPE.ID \n"
                  +"GROUP BY SPE.DESCRIPTION,DEF.DESCRIPTION,USR.NAME,USR.TYPE,OPC.CONSULTANT_ID \n"
                  +"ORDER BY SPE.DESCRIPTION,DEF.DESCRIPTION \n";                   
          //System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<BOOPDConsultant> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              BOOPDConsultant objData = new BOOPDConsultant();
              
              objData.setTotal(map.get("TOTAL").toString());
              objData.setDocName(map.get("DOC_NAME").toString());
              objData.setConsultantId(map.get("CONSULTANT_ID").toString());
              objData.setTypee(map.get("TYPEE").toString());
              objData.setDesignation(map.get("DESIGNATION").toString());
              objData.setSpeciality(map.get("SPECIALITY").toString());
              
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
     
     public List<BOOPDConsultant> selectPatientHistory(String fromDate, String toDate,String userId){
         
         String columns[] = {"-","PATIENT_ID","PATIENT_NAME", "INVOICE_NO", "ORDER_STATUS_ID",
              "TOKEN_NO","COMPLETE_ORDER_NO", "INVOICE_DATE","CONSULTATION_ROOM","ID"};
         
         String query ="SELECT SUBSTR(OPC.PATIENT_ID,'4')PATIENT_ID,         \n"
                 +"PAT.FULL_NAME                        PATIENT_NAME,        \n"
                 +"OPC.INVOICE_NO                       INVOICE_NO,          \n"
                 +"OPC.ORDER_STATUS_ID                  ORDER_STATUS_ID,     \n"
                 +"OPC.TOKEN_NO                         TOKEN_NO,            \n"
                 +"OPC.COMPLETE_ORDER_NO                COMPLETE_ORDER_NO,   \n"
                 +"TO_CHAR(OPC.CRTD_DATE,'DD-MON-YY  HH12:MI:SS AM') INVOICE_DATE,  \n"
                 +"ROM.DESCRIPTION                      CONSULTATION_ROOM ,  \n"
                 +"OPC.ID                               ID                   \n"
                 +" FROM " +Database.DCMS.opdPerformedConsultancy+" OPC,     \n"
                 +Database.DCMS.definitionTypeDetail+"           ROM,        \n"
                 +Database.DCMS.patient+"                        PAT         \n"
                 +"WHERE OPC.CONSULTANT_ID = '"+userId+"'                    \n" 
                 +"AND OPC.CONSULTANT_ID !='PLC'                             \n"
                 +"AND OPC.CRTD_DATE BETWEEN  TO_DATE('"+fromDate+"', 'DD-MON-YY HH24:MI:SS') AND TO_DATE('"+toDate+"' , 'DD-MON-YY HH24:MI:SS') \n"
                 +"AND OPC.PATIENT_ID = PAT.PATIENT_ID                       \n"
                 +"AND OPC.CONSULTATION_ROOM_ID = ROM.ID                     \n"
                 +"AND OPC.ORDER_STATUS_ID IN (5,12)                         \n"
                 +"ORDER BY OPC.ORDER_STATUS_ID , OPC.CRTD_DATE ASC          \n";
               
         
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<BOOPDConsultant> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              BOOPDConsultant objData = new BOOPDConsultant();
              
              objData.setPatientId(map.get("PATIENT_ID").toString());
              objData.setPatientName(map.get("PATIENT_NAME").toString());
              objData.setInvoiceNo(map.get("INVOICE_NO").toString());
              objData.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
              objData.setTokenNo(map.get("TOKEN_NO").toString());
              objData.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
              objData.setInvoiceDate(map.get("INVOICE_DATE").toString());
              objData.setConsultationRoom(map.get("CONSULTATION_ROOM").toString());
              objData.setId(map.get("ID").toString());
              
               lisVerRep.add(objData);
         }
          
        return lisVerRep;
 }
}
