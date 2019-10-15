/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;


import BO.Administration.BOpatientUpdateHistory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Muhammad Talha Khan
 */
public class patientUpdateHistoryHandler {
    
    
     public List<BOpatientUpdateHistory> selectPatientSearch(String patientID) {
         
          String columns[] = {"-","PATIENT_ID","FIRST_NAME", "LAST_NAME", "FULL_NAME",
              "AGE", "DOB", "GENDER","CONTACT_NO","FATHER_NAME","HUSBAND_NAME",
              "CNIC","CITY_NAME","MARITAL_STATUS","CLIENT_NAME","REGISTRATION_DATE",
              "REG_BY","USER_NAME","UPTD_TERMINAL"};
          
          String query ="SELECT PAT.PATIENT_ID             PATIENT_ID,       \n"
                  +"NVL(PAT.FIRST_NAME, ' ')               FIRST_NAME,       \n"
                  +"NVL(PAT.LAST_NAME, ' ')                LAST_NAME,        \n"
                  +"PAT.FULL_NAME                          FULL_NAME,        \n"
                  +"PAT.AGE                                AGE,              \n"
                  +"TO_CHAR(PAT.DOB, 'DD-MON-YYYY')        DOB,              \n"
                  +"GEN.DESCRIPTION                        GENDER,           \n"
                  +"PAT.CONTACT_NO                         CONTACT_NO,       \n"
                  +"NVL(PAT.FATHER_NAME, ' ')              FATHER_NAME,      \n"
                  +"NVL(PAT.HUSBAND_NAME, ' ')             HUSBAND_NAME,     \n"
                  +"NVL(PAT.CNIC,' ')                      CNIC,             \n"
                  +"CIT.DESCRIPTION                        CITY_NAME,        \n"
                  +"MART.DESCRIPTION                       MARITAL_STATUS,   \n"
                  +"CLT.DESCRIPTION                        CLIENT_NAME,      \n"
                  +"TO_CHAR(PAT.REGISTRATION_DATE, 'DD-MON-YY HH12:MI:SS AM')REGISTRATION_DATE, \n"
                  +"PAT.REGISTERED_BY                      REG_BY,           \n"
                  +"USR.NAME                               USER_NAME,        \n"
                  +"NVL(PAT.UPTD_TERMINAL,' ')             UPTD_TERMINAL     \n"
                  +"FROM " +Database.DCMS.patient+"PAT,                      \n"
                 +Database.DCMS.definitionTypeDetail+"GEN,                   \n"
                  +Database.DCMS.definitionTypeDetail+"MART,                 \n"
                  +Database.DCMS.client+"CLT,                                \n"
                  +Database.DCMS.users+"USR,                                  \n"
                  +Database.DCMS.city+"CIT                                   \n"
                  +"WHERE PAT.PATIENT_ID ='" + patientID + "'                \n"
                  +"AND PAT.GENDER_ID = GEN.ID                               \n"
                  +"AND PAT.CITY_ID = CIT.ID                                 \n"
                  +"AND PAT.MARITAL_STATUS_ID = MART.ID                      \n"
                  +"AND PAT.CLIENT_ID = CLT.ID                               \n"
                  +"AND PAT.REGISTERED_BY = USR.USER_NAME                    \n";
          //System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<BOpatientUpdateHistory> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              BOpatientUpdateHistory objData = new BOpatientUpdateHistory();
              
              objData.setPatientID(map.get("PATIENT_ID").toString());
              objData.setFirstName(map.get("FIRST_NAME").toString());
              objData.setLastName(map.get("LAST_NAME").toString());
              objData.setFullName(map.get("FULL_NAME").toString());
              objData.setAge(map.get("AGE").toString());
              objData.setDOB(map.get("DOB").toString());
              objData.setGender(map.get("GENDER").toString());
              objData.setContactNo(map.get("CONTACT_NO").toString());
              objData.setFatherName(map.get("FATHER_NAME").toString());
              objData.setHusbandName(map.get("HUSBAND_NAME").toString());
              objData.setCNIC(map.get("CNIC").toString());
              objData.setCityName(map.get("CITY_NAME").toString());
              objData.setMaritalStatus(map.get("MARITAL_STATUS").toString());
              objData.setClientName(map.get("CLIENT_NAME").toString());
              objData.setRegistrationDate(map.get("REGISTRATION_DATE").toString());
              objData.setRegBy(map.get("REG_BY").toString());
              objData.setUserName(map.get("USER_NAME").toString());
              objData.setUpdtTerminal(map.get("UPTD_TERMINAL").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
     
     public List<BOpatientUpdateHistory> selectPatientHistory(String patientID){
         
         String columns[] = {"-","FULL_NAME","CONTACT_NO", "DOB", "CLIENT_NAME",
              "UPTD_BY","USER_NAME", "UPTD_DATE","UPTD_TERMINAL"};
         
         String query =" SELECT  PUH.FULL_NAME                FULL_NAME,     \n"
                 +"PUH.CONTACT_NO                             CONTACT_NO,    \n"
                 +"TO_CHAR(PUH.DOB, 'DD-MON-YYYY')            DOB,           \n"
                 +"CLT.DESCRIPTION                            CLIENT_NAME,   \n"
                 +"PUH.UPTD_BY                                UPTD_BY,       \n"
                 +"USR.NAME                                   USER_NAME,     \n"
                 +"TO_CHAR(PUH.UPTD_DATE , 'DD-MON-YY HH12:MI:SS AM')UPTD_DATE,\n"
                 +"PUH.UPTD_TERMINAL                          UPTD_TERMINAL  \n"
                 +"FROM " +Database.DCMS.patient+"PAT,                       \n"
                 +Database.DCMS.patientUpdateHistory+"PUH,                   \n"
                 +Database.DCMS.users+"USR,                                  \n"
                 +Database.DCMS.client+"CLT                                  \n"
                 +"WHERE PAT.PATIENT_ID ='" + patientID + "'                 \n"
                 +"AND PAT.PATIENT_ID = PUH.PATIENT_ID                       \n"
                 +"AND PUH.UPTD_BY = USR.USER_NAME                           \n"
                 +"AND PUH.CLIENT_ID = CLT.ID                                \n";
               
         
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<BOpatientUpdateHistory> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              BOpatientUpdateHistory objData = new BOpatientUpdateHistory();
              
              
              objData.setFullName(map.get("FULL_NAME").toString());
              objData.setContactNo(map.get("CONTACT_NO").toString());
              objData.setDOB(map.get("DOB").toString());
              objData.setClientName(map.get("CLIENT_NAME").toString());
              objData.setUpdtBy(map.get("UPTD_BY").toString());
              objData.setUserName(map.get("USER_NAME").toString());
              objData.setUpdtDate(map.get("UPTD_DATE").toString());
              objData.setUpdtTerminal(map.get("UPTD_TERMINAL").toString());
               lisVerRep.add(objData);
         }
          
        return lisVerRep;
 }
}
