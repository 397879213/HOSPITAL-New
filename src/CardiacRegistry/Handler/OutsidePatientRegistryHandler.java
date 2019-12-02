/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.OutsidePatientRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author bilal
 */
public class OutsidePatientRegistryHandler {

     
    public boolean insertOutsidePatientRegister(OutsidePatientRegistry
            outsidePatient) {
        
         String[] columns = {Database.DCMS.outsidePatient,"ID", "PATIENT_ID",
            "FIRST_NAME", "LAST_NAME", "FULL_NAME", "FATHER_NAME",
            "HUSBAND_NAME","MARITAL_STATUS_ID","GENDER","AGE","CNIC","DOB",
            "CITY_ID","INSTITUTE_ID","RELIGION_ID","CATEGORY_ID",
            "BLOOD_GROUP_ID","CONTACT_NO","ADDRESS","ORDER_STATUS_ID",
            "CRTD_DATE","CRTD_BY","CRTD_TERMINAL_ID","GUARDIAN_NAME","RELATION_ID"
                 ,"PRI_PHYSICIAN","REG_DATE"
        };
        HashMap mapOutsidePat = new HashMap();

        //mapOutsidePat.put("ID", "'" + key.generatePrimaryKey(Keys.outsidePatient) + "'");
        mapOutsidePat.put("ID", "'" + outsidePatient.getId() + "'");
        mapOutsidePat.put("PATIENT_ID", "'" + outsidePatient.getPatientId() + "'");
        mapOutsidePat.put("FIRST_NAME", "'" + outsidePatient.getPatientFirstName() + "'");
        mapOutsidePat.put("LAST_NAME", "'" + outsidePatient.getPatientLastName() + "'");
        mapOutsidePat.put("FULL_NAME", "'" + outsidePatient.getPatientFullName() + "'");
        mapOutsidePat.put("FATHER_NAME", "'" + outsidePatient.getFatherName() + "'");
        mapOutsidePat.put("HUSBAND_NAME", "'" + outsidePatient.getHusbandName() + "'");
        mapOutsidePat.put("MARITAL_STATUS_ID", "'" + outsidePatient.getMaritalStatusId() + "'");
        mapOutsidePat.put("GENDER", "'" + outsidePatient.getGender() + "'");
        mapOutsidePat.put("AGE", "'" + outsidePatient.getAge() + "'");
        mapOutsidePat.put("CNIC", "'" + outsidePatient.getCnic() + "'");
        mapOutsidePat.put("DOB", "'" + outsidePatient.getDob() + "'");
        mapOutsidePat.put("CITY_ID", "'" + outsidePatient.getCityId()+ "'");
        mapOutsidePat.put("INSTITUTE_ID", "'" + outsidePatient.getInstituteId() + "'");
        mapOutsidePat.put("RELIGION_ID", "'" + outsidePatient.getReligionId() + "'");
        mapOutsidePat.put("CATEGORY_ID", "'" + outsidePatient.getCategoryId() + "'");
        mapOutsidePat.put("BLOOD_GROUP_ID", "'" + outsidePatient.getBloodGroupId() + "'");
        mapOutsidePat.put("CONTACT_NO", "'" + outsidePatient.getContactNo() + "'");
        mapOutsidePat.put("ADDRESS", "'" + outsidePatient.getAddress().replaceAll(",", " ") + "'");
        mapOutsidePat.put("RELATION_ID", "'" + outsidePatient.getRelationId()+ "'");
        mapOutsidePat.put("PRI_PHYSICIAN", "'" + outsidePatient.getPrimaryPhysician()+ "'");
        mapOutsidePat.put("REG_DATE", "SYSDATE");
        mapOutsidePat.put("ORDER_STATUS_ID", "'" + outsidePatient.getOrderStatusId() + "'");       
        mapOutsidePat.put("CRTD_DATE", "" + Constants.today );
        mapOutsidePat.put("CRTD_BY", "'" + Constants.userId + "'");
        mapOutsidePat.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listUsers = new ArrayList();
        listUsers.add(mapOutsidePat);
        return Constants.dao.insertData(listUsers, columns); 
          
        
    }

    public boolean insertOutsidePatientRegisterUpdate(OutsidePatientRegistry
            outsidePatient) {
        
          GenerateKeys key = new GenerateKeys();
          
         String[] columns = {Database.DCMS.outsidePatientUpdate,"ID", "PATIENT_ID",
            "FIRST_NAME", "LAST_NAME", "FULL_NAME", "FATHER_NAME",
            "HUSBAND_NAME","MARITAL_STATUS_ID","GENDER","AGE","CNIC","DOB",
            "CITY_ID","INSTITUTE_ID","RELIGION_ID","CATEGORY_ID",
            "BLOOD_GROUP_ID","CONTACT_NO","ADDRESS","ORDER_STATUS_ID",
            "CRTD_DATE","CRTD_BY","CRTD_TERMINAL_ID","GUARDIAN_NAME","RELATION_ID"
                 ,"PRI_PHYSICIAN","REG_DATE"
        };

        HashMap mapOutsidePat = new HashMap();

        //mapOutsidePat.put("ID", "'" + key.generatePrimaryKey(Keys.outsidePatient) + "'");
        mapOutsidePat.put("ID", "'" + outsidePatient.getId() + "'");
        mapOutsidePat.put("PATIENT_ID", "'" + outsidePatient.getPatientId() + "'");
        mapOutsidePat.put("FIRST_NAME", "'" + outsidePatient.getPatientFirstName() + "'");
        mapOutsidePat.put("LAST_NAME", "'" + outsidePatient.getPatientLastName() + "'");
        mapOutsidePat.put("FULL_NAME", "'" + outsidePatient.getPatientFullName() + "'");
        mapOutsidePat.put("FATHER_NAME", "'" + outsidePatient.getFatherName() + "'");
        mapOutsidePat.put("HUSBAND_NAME", "'" + outsidePatient.getHusbandName() + "'");
        mapOutsidePat.put("MARITAL_STATUS_ID", "'" + outsidePatient.getMaritalStatusId() + "'");
        mapOutsidePat.put("GENDER", "'" + outsidePatient.getGender() + "'");
        mapOutsidePat.put("AGE", "'" + outsidePatient.getAge() + "'");
        mapOutsidePat.put("CNIC", "'" + outsidePatient.getCnic() + "'");
        mapOutsidePat.put("DOB", "'" + outsidePatient.getDob() + "'");
        mapOutsidePat.put("CITY_ID", "'" + outsidePatient.getCityId()+ "'");
        mapOutsidePat.put("INSTITUTE_ID", "'" + outsidePatient.getInstituteId() + "'");
        mapOutsidePat.put("RELIGION_ID", "'" + outsidePatient.getReligionId() + "'");
        mapOutsidePat.put("CATEGORY_ID", "'" + outsidePatient.getCategoryId() + "'");
        mapOutsidePat.put("BLOOD_GROUP_ID", "'" + outsidePatient.getBloodGroupId() + "'");
        mapOutsidePat.put("CONTACT_NO", "'" + outsidePatient.getContactNo() + "'");
        mapOutsidePat.put("ADDRESS", "'" + outsidePatient.getAddress().replaceAll(",", " ") + "'");
        mapOutsidePat.put("RELATION_ID", "'" + outsidePatient.getRelationId()+ "'");
        mapOutsidePat.put("PRI_PHYSICIAN", "'" + outsidePatient.getPrimaryPhysicianId()+ "'");
        mapOutsidePat.put("REG_DATE", "SYSDATE");
        mapOutsidePat.put("ORDER_STATUS_ID", "'" + outsidePatient.getOrderStatusId() + "'");       
        mapOutsidePat.put("CRTD_DATE", "" + Constants.today + "");
        mapOutsidePat.put("CRTD_BY", "'" + Constants.userId + "'");
        mapOutsidePat.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listUsers = new ArrayList();
        listUsers.add(mapOutsidePat);
        return Constants.dao.insertData(listUsers, columns); 
          
        
    }
    
    public List<OutsidePatientRegistry> searchPatient(String patientId,
            String contactNo,String patName,String cnic,String fromDate
            ,String toDate,String physician) {
        
        String[] columns = {"-", "ID", "PATIENT_ID",
            "FIRST_NAME", "LAST_NAME", "FULL_NAME", "FATHER_NAME",
            "HUSBAND_NAME","MARITAL_STATUS_ID","MARITAL_STATUS","GENDER"
             ,"AGE","CNIC","DOB","DAY_OF_BIRTH","CITY_ID","CITY","INSTITUTE_ID","INSTITUTE",
             "RELIGION_ID","RELIGION","CATEGORY_ID","CATEGORY","BLOOD_GROUP_ID",
             "BLOOD_GROUP","CONTACT_NO","ADDRESS","GUARDIAN_NAME","PRI_PHYSICIAN_ID",
            "PRI_PHYSICIAN","REG_DATE","RELATION_ID","RELATION", "DAY_OF_REG",
            "CRTD_DATE","CRTD_BY","CRTD_TERMINAL"};
        
        String query = " SELECT OSP.ID                  ID ,                \n"
                + "  OSP.PATIENT_ID                     PATIENT_ID,         \n"
                + "  NVL(OSP.FIRST_NAME, ' ')           FIRST_NAME,         \n"
                + "  NVL(OSP.LAST_NAME, ' ')            LAST_NAME,          \n"
                + "  NVL(OSP.FULL_NAME, ' ')            FULL_NAME,          \n"
                + "  NVL(OSP.FATHER_NAME, ' ')          FATHER_NAME,        \n"
                + "  NVL(OSP.HUSBAND_NAME, ' ')         HUSBAND_NAME,       \n"
                + "  OSP.MARITAL_STATUS_ID              MARITAL_STATUS_ID,  \n"
                + "  MAR.DESCRIPTION                    MARITAL_STATUS,     \n"
                + "  OSP.GENDER                         GENDER,             \n"
                + "  OSP.AGE                            AGE,                \n"
                + "  OSP.CNIC                           CNIC ,              \n"
                + "  NVL(ROUND(OSP.DOB - (SYSDATE+1)), 0) DAY_OF_BIRTH,     \n"
                + "  TO_CHAR(OSP.DOB,'DD-MM-YY HH24:MI') DOB,               \n"
                + "  NVL(OSP.CITY_ID,'')                CITY_ID,            \n"
                + "  CTY.DESCRIPTION                    CITY,               \n"
                + "  OSP.INSTITUTE_ID                   INSTITUTE_ID,       \n"
                + "  INS.DESCRIPTION                    INSTITUTE,          \n"
                + "  OSP.RELIGION_ID                    RELIGION_ID,        \n"
                + "  RLG.DESCRIPTION                    RELIGION,           \n"
                + "  OSP.CATEGORY_ID                    CATEGORY_ID,        \n"
                + "  CAT.DESCRIPTION                    CATEGORY,           \n"
                + "  OSP.BLOOD_GROUP_ID                 BLOOD_GROUP_ID,     \n"
                + "  BLD.DESCRIPTION                    BLOOD_GROUP,        \n"
                + "  OSP.CONTACT_NO                     CONTACT_NO,         \n"
                + "  NVL(OSP.ADDRESS, ' ')              ADDRESS,            \n"
                + "  NVL(OSP.GUARDIAN_NAME, ' ')        GUARDIAN_NAME,      \n"
                + "  OSP.PRI_PHYSICIAN                  PRI_PHYSICIAN_ID,   \n"
                + "  PPI.NAME                           PRI_PHYSICIAN,      \n"
                + "  NVL(ROUND(OSP.REG_DATE - (SYSDATE+1)), 0) DAY_OF_REG,  \n"
                + "  TO_CHAR(OSP.REG_DATE, 'DD-MM-YY HH24:MI')  REG_DATE,   \n"
                + "  NVL(OSP.RELATION_ID, '')           RELATION_ID,        \n"
                + "  REL.DESCRIPTION                    RELATION,           \n"
                + "  TO_CHAR(OSP.CRTD_DATE, 'DD-MM-YY HH24:MI')  CRTD_DATE, \n"
                + "  OSP.CRTD_BY                        CRTD_BY ,       \n"
                + "  OSP.CRTD_TERMINAL_ID               CRTD_TERMINAL   \n"
                + "  FROM "
                + Database.DCMS.outsidePatient + "              OSP,    \n" 
                + Database.DCMS.definitionTypeDetail + "        MAR,    \n" 
                + Database.DCMS.definitionTypeDetail + "        CTY,    \n" 
                + Database.DCMS.definitionTypeDetail + "        INS,    \n" 
                + Database.DCMS.definitionTypeDetail + "        RLG,    \n" 
                + Database.DCMS.definitionTypeDetail + "        CAT,    \n" 
                + Database.DCMS.definitionTypeDetail + "        REL,    \n" 
                + Database.DCMS.definitionTypeDetail + "        BLD,    \n"                
                + Database.DCMS.users + "                       PPI     \n"                
                + " WHERE  OSP.MARITAL_STATUS_ID = MAR.ID               \n"
                + " AND   OSP.CITY_ID = CTY.ID                          \n"
                + " AND   OSP.INSTITUTE_ID = INS.ID                     \n"
                + " AND   OSP.RELIGION_ID =  RLG.ID                     \n"
                + " AND   OSP.CATEGORY_ID =  CAT.ID                     \n"
                + " AND   OSP.RELATION_ID =  REL.ID                     \n"
                + " AND   NVL(OSP.PRI_PHYSICIAN, 'GENERAL') =  NVL(PPI.USER_NAME, 'GENERAL')  \n"
                + " AND   OSP.BLOOD_GROUP_ID = BLD.ID                   \n";
                 
        
         if (!patientId.equalsIgnoreCase("")) {
            query += "AND OSP.PATIENT_ID = '" + patientId + "'              \n";
         }
         if (!contactNo.equalsIgnoreCase("")) {
            query += "AND OSP.CONTACT_NO = '" + contactNo + "'              \n";
         }
         if (!patName.equalsIgnoreCase("")) {
            query += " AND UPPER(OSP.FIRST_NAME) LIKE UPPER('%" + patName + "%')   \n";
        }
         if (!cnic.equalsIgnoreCase("")) {
            query += "AND OSP.CNIC = '" + cnic + "'              \n";
         }
         if (!fromDate.equalsIgnoreCase("")&&!toDate.equalsIgnoreCase("")) {
            query += " AND OSP.REG_DATE BETWEEN '" + fromDate + "' AND '" + toDate + "' \n";
        }
        if (!physician.equalsIgnoreCase("")) {
            query += " AND UPPER(OSP.PRI_PHYSICIAN) LIKE UPPER('%" + physician + "%')   \n";
        }
         
        List list = Constants.dao.selectData(query, columns);
         List<OutsidePatientRegistry> listPat = new ArrayList();
         for (int i = 0; i < list.size(); i++) {

            HashMap map = (HashMap) list.get(i);
            OutsidePatientRegistry pat = new OutsidePatientRegistry();
            pat.setId(map.get("ID").toString());
            pat.setPatientId(map.get("PATIENT_ID").toString());
            pat.setPatientFirstName(map.get("FIRST_NAME").toString());
            pat.setPatientLastName(map.get("LAST_NAME").toString());
            pat.setPatientFullName(map.get("FULL_NAME").toString());
            pat.setAge(map.get("AGE").toString());
            pat.setDayOfBirth(map.get("DAY_OF_BIRTH").toString());
            pat.setDob(map.get("DOB").toString());
            pat.setGender(map.get("GENDER").toString());
            pat.setContactNo(map.get("CONTACT_NO").toString());
            pat.setFatherName(map.get("FATHER_NAME").toString());
            pat.setHusbandName(map.get("HUSBAND_NAME").toString());
            pat.setMaritalStatusId(map.get("MARITAL_STATUS_ID").toString());
            pat.setMaritalStatus(map.get("MARITAL_STATUS").toString());
            pat.setCnic(map.get("CNIC").toString());
            pat.setCityId(map.get("CITY_ID").toString());
            pat.setCity(map.get("CITY").toString());
            pat.setReligionId(map.get("RELIGION_ID").toString());
            pat.setReligion(map.get("RELIGION").toString());
            pat.setBloodGroupId(map.get("BLOOD_GROUP_ID").toString());
            pat.setBloodGroup(map.get("BLOOD_GROUP").toString());
            pat.setRelationId(map.get("RELATION_ID").toString());
            pat.setRelation(map.get("RELATION").toString());
            pat.setPrimaryPhysicianId(map.get("PRI_PHYSICIAN_ID").toString());
            pat.setPrimaryPhysician(map.get("PRI_PHYSICIAN").toString());
            pat.setGuardian(map.get("GUARDIAN_NAME").toString());
            pat.setInstituteId(map.get("INSTITUTE_ID").toString());
            pat.setInstitute(map.get("INSTITUTE").toString());
            pat.setDayOfRegistration(map.get("DAY_OF_REG").toString());
            pat.setRegistrationDate(map.get("REG_DATE").toString());
            pat.setCategory(map.get("CATEGORY").toString());
            pat.setCategoryId(map.get("CATEGORY_ID").toString());
            pat.setAddress(map.get("ADDRESS").toString());
            listPat.add(pat);
        }
                 

        return listPat; 
     }

    public boolean updateOutsidePatientData(OutsidePatientRegistry outsidePatRegistry) {
        
         String query
                    = " UPDATE " + Database.DCMS.outsidePatient +   "\n SET "
                    + " FIRST_NAME  = '" + outsidePatRegistry.getPatientFirstName() + "', \n"
                    + " LAST_NAME  = '" + outsidePatRegistry.getPatientLastName() + "', \n"
                     + " AGE  = '" + outsidePatRegistry.getAge() + "', \n"
                     //+ " DOB  = '" + outsidePatRegistry.getDob() + "', \n"
                     + " GENDER  = '" + outsidePatRegistry.getGender() + "', \n"
                     + " CONTACT_NO  = '" + outsidePatRegistry.getContactNo() + "', \n"
                     + " PATIENT_ID  = '" + outsidePatRegistry.getPatientId() + "', \n"
                     + " CNIC  = '" + outsidePatRegistry.getCnic() + "', \n"
                     + " FATHER_NAME  = '" + outsidePatRegistry.getFatherName() + "', \n"
                     + " HUSBAND_NAME  = '" + outsidePatRegistry.getHusbandName() + "', \n"
                     + " RELIGION_ID  = '" + outsidePatRegistry.getReligionId() + "', \n"
                     + " MARITAL_STATUS_ID  = '" + outsidePatRegistry.getMaritalStatusId() + "', \n"
                     + " BLOOD_GROUP_ID  = '" + outsidePatRegistry.getBloodGroupId() + "', \n"
                     + " CITY_ID  = '" + outsidePatRegistry.getCityId() + "', \n"
                     + " GUARDIAN_NAME  = '" + outsidePatRegistry.getGuardian() + "', \n"
                     + " RELATION_ID  = '" + outsidePatRegistry.getRelationId() + "', \n"
                     + " INSTITUTE_ID  = '" + outsidePatRegistry.getInstituteId() + "', \n"
                     + " PRI_PHYSICIAN  = '" + outsidePatRegistry.getPrimaryPhysicianId()+ "', \n"
                     + " REG_DATE  = '" + outsidePatRegistry.getRegistrationDate() + "', \n"
                     + " CATEGORY_ID  = '" + outsidePatRegistry.getCategoryId() + "', \n"
                     + " ADDRESS  = '" + outsidePatRegistry.getAddress() + "'  \n"
                     + " WHERE ID = '" + outsidePatRegistry.getId() + "'";
 
            return Constants.dao.executeUpdate(query, false);
        
     }
    
    
    
     public boolean updateOutsidePatientRegistryData(OutsidePatientRegistry outsidePatRegistry) {
        
         String query
                    = " UPDATE " + Database.DCMS.outsidePatientUpdate +   "\n SET "
                    + " FIRST_NAME  = '" + outsidePatRegistry.getPatientFirstName() + "', \n"
                    + " LAST_NAME  = '" + outsidePatRegistry.getPatientLastName() + "', \n"
                     + " AGE  = '" + outsidePatRegistry.getAge() + "', \n"
                     //+ " DOB  = '" + outsidePatRegistry.getDob() + "', \n"
                     + " GENDER  = '" + outsidePatRegistry.getGender() + "', \n"
                     + " CONTACT_NO  = '" + outsidePatRegistry.getContactNo() + "', \n"
                     + " PATIENT_ID  = '" + outsidePatRegistry.getPatientId() + "', \n"
                     + " CNIC  = '" + outsidePatRegistry.getCnic() + "', \n"
                     + " FATHER_NAME  = '" + outsidePatRegistry.getFatherName() + "', \n"
                     + " HUSBAND_NAME  = '" + outsidePatRegistry.getHusbandName() + "', \n"
                     + " RELIGION_ID  = '" + outsidePatRegistry.getReligionId() + "', \n"
                     + " MARITAL_STATUS_ID  = '" + outsidePatRegistry.getMaritalStatusId() + "', \n"
                     + " BLOOD_GROUP_ID  = '" + outsidePatRegistry.getBloodGroupId() + "', \n"
                     + " CITY_ID  = '" + outsidePatRegistry.getCityId() + "', \n"
                     + " GUARDIAN_NAME  = '" + outsidePatRegistry.getGuardian() + "', \n"
                     + " RELATION_ID  = '" + outsidePatRegistry.getRelationId() + "', \n"
                     + " INSTITUTE_ID  = '" + outsidePatRegistry.getInstituteId() + "', \n"
                     + " PRI_PHYSICIAN  = '" + outsidePatRegistry.getPrimaryPhysicianId()+ "', \n"
                     //+ " REG_DATE  = '" + outsidePatRegistry.getRegistrationDate() + "', \n"
                     + " CATEGORY_ID  = '" + outsidePatRegistry.getCategoryId() + "', \n"
                     + " ADDRESS  = '" + outsidePatRegistry.getAddress() + "', \n"
                     + " CRTD_TERMINAL_ID = '" + Constants.terminalId + "',\n"
                     + " CRTD_BY  = '" + Constants.userId + "',\n"
                     + " CRTD_DATE  = SYSDATE  \n"
                
                     + " WHERE ID = '" + outsidePatRegistry.getId() + "'";
 
            return Constants.dao.executeUpdate(query, false);
        
     }
    
    
  }
