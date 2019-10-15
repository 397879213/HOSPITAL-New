/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;



import BO.Hospital.TraumaPerformVisitBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Muhammad Talha Khan
 */
public class TraumaPerformVisitHandler {
    
    
    
    public List<TraumaPerformVisitBO> selectPatientSearch(String patientId, String categoryId,
    String complaintId, String fromDate, String toDate) {
         
          String columns[] = {"-","CONSULTANCY_ID","FULL_NAME","PATIENT_ID",
              "VISIT_DATE","CATEGORY_ID", "CAT_DESCRIPTION","ORDER_STATUS_ID",
          "STATUS"};
          
     String query =" SELECT EPV.ID            CONSULTANCY_ID,                \n"
                  +" PAT.FULL_NAME            FULL_NAME,                     \n"
                  +" SUBSTR(EPV.PATIENT_ID,4) PATIENT_ID,                    \n"
                  +" TO_CHAR(EPV.CRTD_DATE, 'DD-MON-YY HH12:MI:SS')VISIT_DATE,\n"
                  +" EPV.ER_CATEGORY_ID       CATEGORY_ID,                   \n"
                  +" CAT.DESCRIPTION          CAT_DESCRIPTION,               \n"
                  +" EPV.ORDER_STATUS_ID      ORDER_STATUS_ID,               \n"
                  +" STA.DESCRIPTION          STATUS                         \n"
     //             +" PS.SELECTION_ID          COMPLAINT_ID,                  \n"
     //             +" COMP.DESCRIPTION         COMPLAINT                      \n"
                  +" FROM " +Database.DCMS.emergencyPerformedVisit+"EPV,     \n"
                  +  Database.DCMS.patient+  "PAT,                           \n"
      //            +  Database.DCMS.patientSymptoms + "PS,                    \n"
                  +  Database.DCMS.definitionTypeDetail + "CAT,              \n"
                  +  Database.DCMS.definitionTypeDetail + "STA               \n"
    //              +  Database.DCMS.definitionTypeDetail + "COMP             \n"
                  + " WHERE 1=1                                              \n";
                 
                   if (patientId.length() != 0) {
                  query += "AND EPV.PATIENT_ID ='"+patientId+"'              \n";
                   }
                  if (categoryId.length() != 0) {
                  query += " AND EPV.ER_CATEGORY_ID ='" + categoryId + "'    \n";
                   }
                  
//                  if (complaintId.length() != 0) {
//                  query += " AND PS.SELECTION_ID = '" + complaintId + "'     \n";
//                   }
                  
                   if(fromDate.length() != 0 && toDate.length() != 0){
                      query += " AND TRUNC(EPV.CRTD_DATE) BETWEEN '" + fromDate +  
                    "' AND '" + toDate + "'                                  \n";
                  }
                  
                  query +=" AND EPV.PATIENT_ID = PAT.PATIENT_ID              \n"
         //         +" AND EPV.ID = PS.CONSULTANCY_ID                        \n"
                  +" AND EPV.ER_CATEGORY_ID = CAT.ID                         \n"
                  +" AND EPV.ORDER_STATUS_ID = STA.ID                        \n";
         //         +" AND PS.SELECTION_ID = COMP.ID                         \n";
                  
                  
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<TraumaPerformVisitBO> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              TraumaPerformVisitBO objData = new TraumaPerformVisitBO();
              
              objData.setConsultancyId(map.get("CONSULTANCY_ID").toString());
              objData.setFullName(map.get("FULL_NAME").toString());
              objData.setPatientId(map.get("PATIENT_ID").toString());
              objData.setVisitDate(map.get("VISIT_DATE").toString());
              objData.setCategoryId(map.get("CATEGORY_ID").toString());
              objData.setCatDescription(map.get("CAT_DESCRIPTION").toString());
        //      objData.setComplaint(map.get("COMPLAINT_ID").toString());
        //     objData.setComplaint(map.get("COMPLAINT").toString());
             objData.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
             objData.setStatus(map.get("STATUS").toString());
               lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
    
     public List<TraumaPerformVisitBO> selectVisitOrders(String traumaVisitId ) {
         
          String columns[] = {"-","TRAUMA_VISIT_ID","CPT_ID","CPT_NAME",
              "ORDER_DATE", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID",
              "ORDER_STATUS_ID","STATUS","ORDER_BY","USER_NAME"};
          
     String query ="  SELECT OM.TRAUMA_VISIT_ID       TRAUMA_VISIT_ID,       \n"
                  +"  OD.CPT_ID                       CPT_ID,                \n"
                  +"  CPT.DESCRIPTION                 CPT_NAME,              \n"
                  +"  OM.ORDER_DATE                   ORDER_DATE,            \n"
                  +"  OM.COMPLETE_ORDER_NO            COMPLETE_ORDER_NO,     \n"
                  +"  OD.ORDER_DETAIL_ID              ORDER_DETAIL_ID,       \n"
                  +"  OD.ORDER_STATUS_ID              ORDER_STATUS_ID,       \n"
                  +"  STA.DESCRIPTION                 STATUS,                \n"
                  +"  OM.ORDER_BY                     ORDER_BY,              \n"
                  +"  USR.NAME                        USER_NAME              \n"
                  +" FROM " +Database.DCMS.orderMaster + " OM,               \n"
                  +  Database.DCMS.orderDetail+ " OD,                        \n"
                  +  Database.DCMS.CPT +"  CPT,                              \n"
                  +  Database.DCMS.definitionTypeDetail +"  STA,             \n"
                  +  Database.DCMS.users + "USR,                             \n"
                  +" WHERE  OM.TRAUMA_VISIT_ID ='"+traumaVisitId+"'          \n"
                  +"  AND OM.COMPLETE_ORDER_NO = OD.COMPLETE_ORDER_NO        \n"
                  +" AND OD.CPT_ID = CPT.CPT_ID                              \n"
                  +" AND OD.ORDER_STATUS_ID = STA.ID                         \n"
                  +" AND OM.ORDER_BY = USR.USER_NAME                         \n"
                  +" ORDER BY CPT.DESCRIPTION                                \n";
                  
          //System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<TraumaPerformVisitBO> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              TraumaPerformVisitBO objData = new TraumaPerformVisitBO();
              
              objData.setTraumaVisitId(map.get("TRAUMA_VISIT_ID").toString());
              objData.setCptId(map.get("CPT_ID").toString());
              objData.setCptName(map.get("CPT_NAME").toString());
              objData.setOrderDate(map.get("ORDER_DATE").toString());
              objData.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
              objData.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
              objData.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
              objData.setStatus(map.get("STATUS").toString());
              objData.setOrderby(map.get("ORDER_BY").toString());
              objData.setUserName(map.get("USER_NAME").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
}
