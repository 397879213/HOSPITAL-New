/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POF_Process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Raheel Ansari
 */
public class Handler {
    

    int patId = 16784481;
    
    public List<BO> selectPofEmployee(){
    
        String columns[] = {"-","PL_NO","EMPLOYEE_NAME","FATHER_NAME","CNIC","DOB",
            "PERMANENT_ADDRESS", "CONTACT_NUMBER","TEMPORARY_ADDRESS","BLOOD_GROUP",
            "DEPARTMENT","GENDER","GRADE","MARITAL_STATUS","RELIGION","DESIGNATION",
            "DESG_DESC","DEP_DESC","GRD_DESC"};
        
        String query = " SELECT EMP_PLNO    PL_NO  ,                    \n"
                + " EMP_NAME                EMPLOYEE_NAME,              \n"
                + " NVL(EMP.EMP_FNAME,' ')  FATHER_NAME,                \n"
                + " NVL(EMP.EMP_NID,' ')    CNIC,                       \n"
                + " TO_CHAR(EMP.EMP_DOB,'DD-MM-YYYY')  DOB ,            \n"
                + " NVL(EMP_PADD1,' ')      PERMANENT_ADDRESS,          \n"
                + " NVL(EMP.EMP_CELL1,' ')  CONTACT_NUMBER,             \n"
                + " NVL(EMP_ADD1, ' ')      TEMPORARY_ADDRESS,          \n"
                + " DSG.HMIS_ID             DESIGNATION,                \n"
                + " DSG.POF_DESCRIPTION     DESG_DESC,                \n"
                + " BLD.HMIS_ID             BLOOD_GROUP ,               \n"
                + " DEP.HMIS_ID             DEPARTMENT ,                \n"
                + " DEP.POF_DESCRIPTION     DEP_DESC,                \n"
                + " GEN.HMIS_ID             GENDER    ,                 \n"
                + " GRD.HMIS_ID             GRADE,                      \n"
                + " GRD.POF_DESCRIPTION     GRD_DESC,                      \n"
                + " MAR.HMIS_ID             MARITAL_STATUS,             \n"
                + " RLG.HMIS_ID             RELIGION         FROM       \n"
                + Database.DCMS.PofEmployee + "       EMP,              \n"
                + Database.DCMS.pofEmpMapper + "         DSG,              \n"
                + Database.DCMS.pofEmpMapper + "         BLD,              \n"
                + Database.DCMS.pofEmpMapper + "         GEN,              \n"
                + Database.DCMS.pofEmpMapper + "         RLG,              \n"
                + Database.DCMS.pofEmpMapper + "         DEP,              \n"
                + Database.DCMS.pofEmpMapper + "         MAR,              \n"
                + Database.DCMS.pofEmpMapper + "         GRD               \n"
                + " WHERE EMP.IS_UPDATED = 'N'                          \n"
                + " AND BLD.ACTION_ID = 5                               \n"
                + " AND BLD.POF_ID = EMP.EMP_BLOOD                      \n"
                + " AND DSG.ACTION_ID = 16                              \n"
                + " AND DSG.POF_ID  = EMP.EMP_DSG                       \n"
                + " AND GEN.ACTION_ID = '1'                             \n"
                + " AND GEN.POF_ID = EMP.EMP_SEX                        \n"
                + " AND RLG.ACTION_ID = 28                              \n"
                + " AND RLG.POF_ID = EMP.EMP_RLG                        \n"
                + " AND DEP.ACTION_ID = 15                              \n"
                + " AND DEP.POF_ID = EMP.EMP_SEC                        \n"
                + " AND MAR.ACTION_ID = 22                              \n"
                + " AND MAR.POF_ID = EMP.EMP_MSTAT                      \n"
                + " AND GRD.ACTION_ID = 85                              \n"
                + " AND GRD.POF_ID = EMP.EMP_BSC                        \n";
        
        System.out.println("query select = \n " + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BO> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BO obj = new BO();
            
            obj.setPlNo(map.get("PL_NO").toString());
            obj.setFullName(map.get("EMPLOYEE_NAME").toString());
            obj.setFatherName(map.get("FATHER_NAME").toString());
            obj.setDob(map.get("DOB").toString());
            obj.setCnic(map.get("CNIC").toString());
            obj.setPermanentAddress(map.get("PERMANENT_ADDRESS").toString());
            obj.setContactNo(map.get("CONTACT_NUMBER").toString());
            obj.setTemporaryAddress(map.get("TEMPORARY_ADDRESS").toString());
            obj.setDesignation(map.get("DESIGNATION").toString());
            obj.setDesignationDescription(map.get("DESG_DESC").toString());
            obj.setBloodGroup(map.get("BLOOD_GROUP").toString());
            obj.setDepartmentDescription(map.get("DEP_DESC").toString());
            obj.setDepartment(map.get("DEPARTMENT").toString());
            obj.setGenderId(map.get("GENDER").toString());
            obj.setGradeDescription(map.get("GRD_DESC").toString());
            obj.setMaritalStatus(map.get("MARITAL_STATUS").toString());
            obj.setReligion(map.get("RELIGION").toString());
           // obj.setRankId(map.get("RANK").toString());
            obj.setActive("Y");
            
            lisVerRep.add(obj);
        }
        
        return lisVerRep;
    }
    
    public boolean insertClientWiseEmployeeMaster(BO obj){
        
    String[] columns={Database.DCMS.clientWiseEmployee,"EMPLOYEE_ID","DESIGNATION",
        "GRADE", "DEPENDENTS", "DEPARTMENT", "CLIENT_ID", "ACTIVE", "RANK_ID",
        "TEMPORARY_ADDRESS", "PERMANENT_ADDRESS", "CRTD_BY", "CRTD_DATE",
        "CRTD_TERMINAL_ID"};
    
            HashMap insertEmp = new HashMap();
            
            insertEmp.put("EMPLOYEE_ID","'" + obj.getPlNo() +"'");
            insertEmp.put("DESIGNATION","'" + obj.getDesignationDescription()+"'");
            insertEmp.put("GRADE","'" + obj.getGradeDescription()+"'");
            insertEmp.put("DEPENDENTS","'2'");
            insertEmp.put("DEPARTMENT","'" + obj.getDepartmentDescription()+"'");
            insertEmp.put("CLIENT_ID","'1'"); //POF BOARD 
            insertEmp.put("ACTIVE","'" + obj.getActive()+"'");
            insertEmp.put("RANK_ID","'225'"); //" + obj.getRankId()+"
            insertEmp.put("TEMPORARY_ADDRESS","'" + obj.getTemporaryAddress()+"'");
            insertEmp.put("PERMANENT_ADDRESS","'" + obj.getPermanentAddress()+"'");
            insertEmp.put("CRTD_BY","'ADMIN'");  //" + Constants.userId +"
            insertEmp.put("CRTD_DATE","SYSDATE");
            insertEmp.put("CRTD_TERMINAL_ID","'ADMLAN'"); //" + Constants.terminalId +"
           
             List lstEmp = new ArrayList();
             lstEmp.add(insertEmp);
              return Constants.dao.insertData(lstEmp, columns);
    }
    
        public boolean insertClientEmployeeDetail(BO obj){
        
    String[] columns={Database.DCMS.clientEmployeeDetail,"CLIENT_WISE_EMP_ID", 
        "FULL_NAME","AGE","DOB", "CNIC_NO", "GENDER_ID", "CONTACT_NO","RELATION_ID",
        "MARITAL_STATUS_ID","ID","PATIENT_ID", " ADDRESS", "CLIENT_ID","ACTIVE",
        "PIC_UPLOADED", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};
    
            HashMap insertEmp = new HashMap();
            
            insertEmp.put("CLIENT_WISE_EMP_ID","'" + obj.getPlNo() +"'");
            insertEmp.put("FULL_NAME","'" + obj.getFullName()+"'");
            insertEmp.put("AGE","'20'");
            insertEmp.put("DOB","SYSDATE");  //'" + obj.getDob() +"'
            insertEmp.put("CNIC_NO","'" + obj.getCnic()+"'");
            insertEmp.put("GENDER_ID","'" + obj.getGenderId()+"'");
            insertEmp.put("CONTACT_NO","'" + obj.getContactNo()+"'");
            insertEmp.put("RELATION_ID","'6161'");
            insertEmp.put("MARITAL_STATUS_ID","'" + obj.getMaritalStatus()+"'");
            insertEmp.put("ID","'12346'");
            insertEmp.put("PATIENT_ID","'"+ obj.getPatientId()+"'");
            insertEmp.put("ADDRESS","'" + obj.getTemporaryAddress() +"'");
            insertEmp.put("CLIENT_ID","'1'");  //'" + obj.getClientId() +"'
            insertEmp.put("ACTIVE","'" + obj.getActive() +"'");
            insertEmp.put("PIC_UPLOADED","'N'");
            insertEmp.put("CRTD_BY","'ADMIN'");  //" + Constants.userId +"
            insertEmp.put("CRTD_DATE","SYSDATE");
            insertEmp.put("CRTD_TERMINAL_ID","'PLC'"); //" + Constants.terminalId +"
           
             List lstEmp = new ArrayList();
             lstEmp.add(insertEmp);
              return Constants.dao.insertData(lstEmp, columns);
    }
        
        public boolean insertPatient(BO obj){
        
    String[] columns={Database.DCMS.patient,"PATIENT_ID","FIRST_NAME",
        "MIDDLE_NAME", "LAST_NAME", "FULL_NAME", "FATHER_NAME", "HUSBAND_NAME",
        "PATIENT_TYPE_ID","COMPANY_ID", "CLIENT_ID", "GENDER_ID", "MARITAL_STATUS_ID",
        "AGE","CNIC","DOB","RELIGION_ID","BLOOD_GROUP_ID","CITY_ID","CONTACT_NO",
        "EMERGENCY_CONTACT_NO","ADDRESS","EMAIL_ADDRESS","LOCATION_ID","TITLE_ID",
        "PATIENT_STATUS_ID","PASSPORT_NO","OLD_MRNO","REGISTRATION_DATE",
        "REGISTERED_BY","ATTACHED_MRNO","ACTIVE","ORG_ID","OTHER_INFO",
        "IS_ADMITTED","NATIONALITY_ID"};
    
            HashMap insertPat = new HashMap();
            
            patId ++;
            String s = Integer.toString(patId);
            System.out.println("pat id == " + s);
            insertPat.put("PATIENT_ID", s);
           
            insertPat.put("FIRST_NAME","'" + obj.getFullName() +"'");
            insertPat.put("MIDDLE_NAME","'" +obj.getMiddleName()+"'");
            insertPat.put("LAST_NAME","'" + obj.getLastName()+"'");
            insertPat.put("FULL_NAME","'" + obj.getFullName()+"'");
            insertPat.put("FATHER_NAME","'" + obj.getFatherName()+"'");
            insertPat.put("HUSBAND_NAME","'" + obj.getHusbandName()+"'");
            insertPat.put("PATIENT_TYPE_ID","'210'");
            insertPat.put("COMPANY_ID","'87'");
            
            insertPat.put("CLIENT_ID","'1'"); //" + obj.getClientId()+"
            
            insertPat.put("GENDER_ID","1");
            insertPat.put("MARITAL_STATUS_ID","'192'" );
            insertPat.put("AGE","'25'");
            insertPat.put("CNIC","'" + obj.getCnic()+"'");
            insertPat.put("DOB","SYSDATE"); //'" + obj.getDob()+"'
            insertPat.put("RELIGION_ID","'" + obj.getGenderId()+"'");
            if(obj.getBloodGroup().equalsIgnoreCase("") || obj.getBloodGroup().isEmpty()){
            
                insertPat.put("BLOOD_GROUP_ID","'52'");
            }
            
            insertPat.put("BLOOD_GROUP_ID","'" + obj.getBloodGroup() + "'");
            insertPat.put("CITY_ID","'" + obj.getCityId()+ "'");
            insertPat.put("CONTACT_NO","'" + obj.getContactNo()+"'");
            insertPat.put("EMERGENCY_CONTACT_NO","'" + obj.getEmergencyContactNo()+"'");
            insertPat.put("ADDRESS","'" + obj.getPermanentAddress()+"'");
            insertPat.put("EMAIL_ADDRESS","'" + obj.getEmailAddress()+"'");
            insertPat.put("LOCATION_ID","'001'");
            
            if(obj.getGenderId().equalsIgnoreCase("1")){
            insertPat.put("TITLE_ID","'301'");  //MR
            }
            if(obj.getGenderId().equalsIgnoreCase("2")){
            insertPat.put("TITLE_ID","'302'");  //MRS
            }
            
            insertPat.put("PATIENT_STATUS_ID","'208'");
            insertPat.put("PASSPORT_NO","'" + obj.getPassportNo()+"'");
            insertPat.put("OLD_MRNO","'" + obj.getOldMrNo()+"'");
            insertPat.put("REGISTRATION_DATE","SYSDATE"); 
            insertPat.put("REGISTERED_BY","'PLC'"); //Constants.userId
            insertPat.put("ATTACHED_MRNO","'" + obj.getAttachedMRNo()+"'");
            insertPat.put("ACTIVE","'" + obj.getActive()+"'");
            insertPat.put("ORG_ID","'332'");
            insertPat.put("OTHER_INFO","'" + obj.getOtherInfo()+"'");
            insertPat.put("IS_ADMITTED","'N'");
            insertPat.put("NATIONALITY_ID","'1695'");
            //insertPat.put("OCCUPATION","' '"); 
           
             List lstEmp = new ArrayList();
             lstEmp.add(insertPat);
              return Constants.dao.insertData(lstEmp, columns);
    }
        
        
        public boolean updateClientWiseEmployeeMaster(BO obj){
    
            String query 
                   = " UPDATE " + Database.DCMS.clientWiseEmployee + "        \n"
                    + " SET DESIGNATION =   '" + obj.getDesignation() +"',    \n"
                    + "GRADE =   '" + obj.getGradeDescription()+"',                      \n" 
                    + "DEPENDENTS =   '1',                                    \n"
                    + "DEPARTMENT =  '" + obj.getDepartmentDescription()+"',            \n"
                    + "DESIGNATION = '" + obj.getDesignationDescription()+"',           \n"
                    + "CLIENT_ID = '1',                \n"//" + obj.getClientId() +"
                    + "ACTIVE = '" + obj.getActive() +"',                     \n"
                    + "RANK_ID =  '" + obj.getRankId() +"',                   \n"
                    + "TEMPORARY_ADDRESS = '" + obj.getTemporaryAddress() +"',\n"
                    + "PERMANENT_ADDRESS = '" + obj.getPermanentAddress() +"' \n"
                    + "WHERE  EMPLOYEE_ID =  '" + obj.getPlNo()+"'            \n";
            
            return Constants.dao.executeUpdate(query, false);
    }
        
        public List<BO> selectPofEmployeeForUpdate(){
    
        String columns[] = {"-","PL_NO","EMPLOYEE_NAME","FATHER_NAME","CNIC","DOB",
            "PERMANENT_ADDRESS", "CONTACT_NUMBER","TEMPORARY_ADDRESS","BLOOD_GROUP",
            "DEPARTMENT","GENDER","GRADE","MARITAL_STATUS","RELIGION","DESIGNATION",
            "DESG_DESC","DEP_DESC","GRD_DESC"};
        
        String query = " SELECT EMP_PLNO    PL_NO  ,                    \n"
                + " EMP_NAME                EMPLOYEE_NAME,              \n"
                + " NVL(EMP.EMP_FNAME,' ')  FATHER_NAME,                \n"
                + " NVL(EMP.EMP_NID,' ')    CNIC,                       \n"
                + " TO_CHAR(EMP.EMP_DOB,'DD-MM-YYYY')  DOB ,            \n"
                + " NVL(EMP_PADD1,' ')      PERMANENT_ADDRESS,          \n"
                + " NVL(EMP.EMP_CELL1,' ')  CONTACT_NUMBER,             \n"
                + " NVL(EMP_ADD1, ' ')      TEMPORARY_ADDRESS,          \n"
                + " DSG.HMIS_ID             DESIGNATION,                \n"
                + " DSG.POF_DESCRIPTION     DESG_DESC,                \n"
                + " BLD.HMIS_ID             BLOOD_GROUP ,               \n"
                + " DEP.HMIS_ID             DEPARTMENT ,                \n"
                + " DEP.POF_DESCRIPTION     DEP_DESC,                \n"
                + " GEN.HMIS_ID             GENDER    ,                 \n"
                + " GRD.HMIS_ID             GRADE,                      \n"
                + " GRD.POF_DESCRIPTION     GRD_DESC,                      \n"
                + " MAR.HMIS_ID             MARITAL_STATUS,             \n"
                + " RLG.HMIS_ID             RELIGION         FROM       \n"
                + Database.DCMS.PofEmployee + "       EMP,              \n"
                + Database.DCMS.pofEmpMapper + "         DSG,              \n"
                + Database.DCMS.pofEmpMapper + "         BLD,              \n"
                + Database.DCMS.pofEmpMapper + "         GEN,              \n"
                + Database.DCMS.pofEmpMapper + "         RLG,              \n"
                + Database.DCMS.pofEmpMapper + "         DEP,              \n"
                + Database.DCMS.pofEmpMapper + "         MAR,              \n"
                + Database.DCMS.pofEmpMapper + "         GRD               \n"
                + " WHERE EMP.IS_UPDATED = 'N'                          \n"
                + " AND BLD.ACTION_ID = 5                               \n"
                + " AND BLD.POF_ID = EMP.EMP_BLOOD                      \n"
                + " AND DSG.ACTION_ID = 16                              \n"
                + " AND DSG.POF_ID  = EMP.EMP_DSG                       \n"
                + " AND GEN.ACTION_ID = '1'                             \n"
                + " AND GEN.POF_ID = EMP.EMP_SEX                        \n"
                + " AND RLG.ACTION_ID = 28                              \n"
                + " AND RLG.POF_ID = EMP.EMP_RLG                        \n"
                + " AND DEP.ACTION_ID = 15                              \n"
                + " AND DEP.POF_ID = EMP.EMP_SEC                        \n"
                + " AND MAR.ACTION_ID = 22                              \n"
                + " AND MAR.POF_ID = EMP.EMP_MSTAT                      \n"
                + " AND GRD.ACTION_ID = 85                              \n"
                + " AND GRD.POF_ID = EMP.EMP_BSC                        \n"
                + " AND EMP.EMP_PLNO IN (SELECT CWEM.EMPLOYEE_ID FROM   \n"
                + Database.DCMS.clientWiseEmployee +"  CWEM)   \n";
        
        System.out.println("query select = \n " + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BO> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BO obj = new BO();
            
            obj.setPlNo(map.get("PL_NO").toString());
            obj.setFullName(map.get("EMPLOYEE_NAME").toString());
            obj.setFatherName(map.get("FATHER_NAME").toString());
            obj.setDob(map.get("DOB").toString());
            obj.setCnic(map.get("CNIC").toString());
            obj.setPermanentAddress(map.get("PERMANENT_ADDRESS").toString());
            obj.setContactNo(map.get("CONTACT_NUMBER").toString());
            obj.setTemporaryAddress(map.get("TEMPORARY_ADDRESS").toString());
            obj.setDesignation(map.get("DESIGNATION").toString());
            obj.setDesignationDescription(map.get("DESG_DESC").toString());
            obj.setBloodGroup(map.get("BLOOD_GROUP").toString());
            obj.setDepartmentDescription(map.get("DEP_DESC").toString());
            obj.setGenderId(map.get("GENDER").toString());
            obj.setGradeDescription(map.get("GRD_DESC").toString());
            obj.setMaritalStatus(map.get("MARITAL_STATUS").toString());
            obj.setReligion(map.get("RELIGION").toString());
           // obj.setRankId(map.get("RANK").toString());
            obj.setActive("Y");
            
            lisVerRep.add(obj);
        }
        
        return lisVerRep;
    }
        
        public boolean updatePofEmployee(){
    
            String query 
                   = " UPDATE " + Database.DCMS.PofEmployee + "  EMP    \n"
                   + " SET IS_UPDATED =   'Y'                           \n"
                   + " WHERE IS_UPDATED = 'N'                           \n";
            
            System.out.println("update query = \n " + query);
            
            return Constants.dao.executeUpdate(query, false);
    }
}