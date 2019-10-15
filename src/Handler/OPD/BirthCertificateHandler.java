 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.OPD;




import BO.OPD.PatientHospitalVisit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author 
 */
public class BirthCertificateHandler {
    
    
     public List<PatientHospitalVisit> selectPatientSearch(String patientId, 
     String admissionNo) {
         
          String columns[] = {"-","ID","PATIENT_ID","ADMISSION_NO", "BABY_NAME",
              "BABY_PATIENT_ID", "PREGNANCY_WEEKS","GENDER_ID","GENDER","DOB",
          "BIRTH_WEIGHT","PRIMARY_PHYSICIAN_ID","METHOD_INDICATION","COMPLICATIONS",
          "B_F_VACCINATION","PREESENT_STATUS","FATHER_NAME","FATHER_CNIC","FATHER_OCCUPATION",
          "PLACE","PRESENT_ADRESSS","CRTD_BY","CRTD_DATE","CRTD_TERMINAL_ID", "DOB_DATE"};
          
          String query =" SELECT PH.ID             ID,                       \n"
                  +" PH.PATIENT_ID                  PATIENT_ID,              \n"
                  +" PH.ADMISSION_NO                ADMISSION_NO,            \n"
                  +" PH.BABY_NAME                   BABY_NAME,               \n"
                  +" PH.BABY_PATIENT_ID             BABY_PATIENT_ID,         \n"
                  +" PH.PREGNANCY_WEEKS             PREGNANCY_WEEKS,         \n"
                  +" PH.GENDER_ID                   GENDER_ID,               \n"
                  +" GEN.DESCRIPTION                GENDER,                  \n"
                  +" TO_CHAR(PH.DOB, 'DD-MON-YY')   DOB,                      \n"
                  +" ROUND(PH.DOB - SYSDATE +1)     DOB_DATE,              \n"
                  +" PH.BIRTH_WEIGHT                BIRTH_WEIGHT,            \n"
                  +" PH.PRIMARY_PHYSICIAN_ID        PRIMARY_PHYSICIAN_ID,    \n"
                  +" NVL(PH.METHOD_INDICATION, ' ') METHOD_INDICATION,       \n"
                  +" NVL(PH.COMPLICATIONS, ' ')     COMPLICATIONS,           \n"
                  +" NVL(PH.B_F_VACCINATION, ' ')   B_F_VACCINATION,         \n"
                  +"NVL(PH.PREESENT_STATUS, ' ')    PREESENT_STATUS,         \n"
                  +"PH.FATHER_NAME                  FATHER_NAME,             \n"
                  +"PH.FATHER_CNIC                  FATHER_CNIC,             \n"
                  +"PH.FATHER_OCCUPATION            FATHER_OCCUPATION,       \n"
                  +"PH.PLACE                        PLACE,                   \n"
                  +"PH.PRESENT_ADRESSS              PRESENT_ADRESSS,         \n"
                  +"PH.CRTD_BY                      CRTD_BY,                 \n"
                  +"PH.CRTD_DATE                    CRTD_DATE,               \n"
                  +"PH.CRTD_TERMINAL_ID             CRTD_TERMINAL_ID         \n"
                  + "FROM  " + Database.DCMS.pregnancyHistory+ " PH,         \n"
                  + Database.DCMS.patient+ " PAT,                            \n"
                  + Database.DCMS.definitionTypeDetail+"GEN                  \n"
                  + "WHERE PH.PATIENT_ID = '"+patientId+"'                   \n"
                  +"AND PH.ADMISSION_NO = '"+admissionNo+"'                  \n"
                  +"AND PH.PATIENT_ID = PAT.PATIENT_ID                       \n"
                  +"AND PH.GENDER_ID = GEN.ID                                \n";
         System.out.println(query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<PatientHospitalVisit> lisVerRep = new ArrayList<>();
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              PatientHospitalVisit objData = new PatientHospitalVisit();
              
//              objData.setId(map.get("ID").toString());
//              objData.setPatientId(map.get("PATIENT_ID").toString());
//              objData.setAdmissionNumber(map.get("ADMISSION_NO").toString());
//              objData.setBabyName(map.get("BABY_NAME").toString());
//              objData.setBabyPatientId(map.get("BABY_PATIENT_ID").toString());
//              objData.setPregnancyWeeks(map.get("PREGNANCY_WEEKS").toString());
//              objData.setBabyGenderId(map.get("GENDER_ID").toString());
//              objData.setBabyGenderDescription(map.get("GENDER").toString());
//              objData.setDob(map.get("DOB").toString());
//              objData.setDayOfBirth(map.get("DOB_DATE").toString());
//              objData.setBirthWeight(map.get("BIRTH_WEIGHT").toString());
//              objData.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
//              objData.setMethodIndication(map.get("METHOD_INDICATION").toString());
//              objData.setComplications(map.get("COMPLICATIONS").toString());
//              objData.setBFVaccination(map.get("B_F_VACCINATION").toString());
//              objData.setPresentStatus(map.get("PREESENT_STATUS").toString());
//              objData.setFatherName(map.get("FATHER_NAME").toString());
//              objData.setFatherCnic(map.get("FATHER_CNIC").toString());
//              objData.setFatherOccupation(map.get("FATHER_OCCUPATION").toString());
//              objData.setPlace(map.get("PLACE").toString());
//              objData.setPresentAddress(map.get("PRESENT_ADRESSS").toString());
//              objData.setCrtdDate(map.get("CRTD_BY").toString());
//              objData.setCrtdBy(map.get("CRTD_DATE").toString());
//              objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
     
     
      public boolean updateBirthCertificate(PatientHospitalVisit objRv) {

        String query
                = " UPDATE " + Database.DCMS.pregnancyHistory + "            \n";
//                + " SET  BABY_NAME ='" + objRv.getBabyName()+ "',            \n"
//                + " BABY_PATIENT_ID = '" + objRv.getBabyPatientId()+ "' ,    \n"
//                + " PREGNANCY_WEEKS = '" + objRv.getPregnancyWeeks()+ "',    \n"
//                + " GENDER_ID =  '" + objRv.getBabyGenderId()+ "',           \n"
//                + " DOB = '" + objRv.getDob()+ "',                            \n"
//                + " BIRTH_WEIGHT = '" + objRv.getBirthWeight()+ "',           \n"
//                + " PRIMARY_PHYSICIAN_ID = '" + objRv.getPrimaryPhysicianId()+ "',\n"
//                + " METHOD_INDICATION = '" + objRv.getMethodIndication()+ "', \n"
//                + " COMPLICATIONS = '" + objRv.getComplications()+ "',        \n"
//                + " B_F_VACCINATION = '" + objRv.getBFVaccination()+ "',      \n"
//                + " PREESENT_STATUS = '" + objRv.getPresentAddress()+ "',     \n"
//                + " FATHER_NAME = '" + objRv.getFatherName()+ "',             \n"
//                + " FATHER_CNIC = '" + objRv.getFatherCnic()+ "',             \n"
//                + " FATHER_OCCUPATION = '" + objRv.getFatherOccupation()+ "', \n"
//                + " PLACE = '" + objRv.getPlace()+ "',                        \n"
//                + " PRESENT_ADRESSS = '" + objRv.getPresentAddress()+ "'     \n"
//               + "WHERE ID = '"+objRv.getId()+"'                             \n";
        
        return Constants.dao.executeUpdate(query, false);

    }
      
       public boolean insertupdateBirthCertificate(PatientHospitalVisit objData){
        
         String columns[] = { Database.DCMS.pregnancyHistory ,"ID","PATIENT_ID",
          "ADMISSION_NO", "BABY_NAME", "BABY_PATIENT_ID", "PREGNANCY_WEEKS","GENDER_ID","DOB",
          "BIRTH_WEIGHT","PRIMARY_PHYSICIAN_ID","METHOD_INDICATION","COMPLICATIONS",
          "B_F_VACCINATION","PREESENT_STATUS","FATHER_NAME","FATHER_CNIC","FATHER_OCCUPATION",
          "PLACE","PRESENT_ADRESSS","CRTD_BY","CRTD_DATE","CRTD_TERMINAL_ID"};
        
        HashMap map = new HashMap();
        map.put("ID", " (SELECT NVL(MAX(ID)+ 1, '1') ID FROM " + Database.DCMS.pregnancyHistory +")\n");
        map.put("PATIENT_ID", "'" + objData.getPatientId()+ "'");
        map.put("ADMISSION_NO", "'" + objData.getAdmissionNumber()+ "'");
//        map.put("BABY_NAME", "'" + objData.getBabyName()+ "'");
//        map.put("BABY_PATIENT_ID",  "'" + objData.getBabyPatientId()+ "'");
//        map.put("PREGNANCY_WEEKS", "'" + objData.getPregnancyWeeks()+ "'");
//        map.put("GENDER_ID", "'" + objData.getBabyGenderId()+ "'");
//        map.put("DOB", "'" + objData.getDob()+ "'");
//        map.put("BIRTH_WEIGHT", "'" + objData.getBirthWeight()+ "'");
//        map.put("PRIMARY_PHYSICIAN_ID", "'" + objData.getPrimaryPhysicianId()+ "'");
//        map.put("METHOD_INDICATION", "'" + objData.getMethodIndication()+ "'");
//        map.put("COMPLICATIONS", "'" + objData.getComplications()+ "'");
//        map.put("B_F_VACCINATION", "'" + objData.getBFVaccination()+ "'");
//        map.put("PREESENT_STATUS", "'" + objData.getPresentStatus()+ "'");
//        map.put("FATHER_NAME", "'" + objData.getFatherName()+ "'");
//        map.put("FATHER_CNIC", "'" + objData.getFatherCnic()+ "'");
//        map.put("FATHER_OCCUPATION", "'" + objData.getFatherOccupation()+ "'");
//        map.put("PLACE", "'" + objData.getPlace()+ "'");
//        map.put("PRESENT_ADRESSS", "'" + objData.getPresentAddress()+ "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE",Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listItem = new ArrayList();
        listItem.add(map);
        
        return Constants.dao.insertData(listItem, columns);
        
    }
       
       
       
}
