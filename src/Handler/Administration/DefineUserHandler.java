/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;



import BO.Administration.BODefineUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;

/**
 *
 * @author Muhammad Talha Khan
 */
public class DefineUserHandler {
    
    
     public List<BODefineUser> selectUserSearch(String userId, String name,
             String userName, String departmentId, String sectionId) {
         
          String columns[] = {"-","FULL_NAME","TYPEE", "ACTIVE", "USER_NAME",
              "USER_ID", "LOCATION_ID", "LOCATIONS","DEPARTMENT_ID","DEPARTMENT",
              "SECTION_ID","SECTIONS","DESIGNATION_ID","DESIGNATION","SPECIALITY_ID",
              "SPECIALITY","E_ADDRESS","DEGREES"};
          
          String query =" SELECT DUSR.NAME          FULL_NAME,               \n"
                  +"  DUSR.TYPE                     TYPEE,                   \n"
                  +"  DUSR.ACTIVE                   ACTIVE,                  \n"
                  +"  DUSR.USER_NAME                USER_NAME,               \n"
                  +"  DUSR.USER_ID                  USER_ID,                 \n"
                  +"  DUSR.LOCATION_ID              LOCATION_ID,             \n"
                  +"  LOC.DESCRIPTION               LOCATIONS,               \n" 
                  +"  DUSR.DEPARTMENT_ID            DEPARTMENT_ID,           \n"
                  +"  DEP.DESCRIPTION               DEPARTMENT,              \n"
                  +"  DUSR.SECTION_ID               SECTION_ID,              \n"
                  +"  SEC.DESCRIPTION               SECTIONS,                \n"
                  +"  DUSR.DESIGNATION_ID           DESIGNATION_ID,          \n"
                  +"  DES.DESCRIPTION               DESIGNATION,             \n"
                  +"  DUSR.SPECIALITY_ID            SPECIALITY_ID,           \n"
                  +"  SPE.DESCRIPTION               SPECIALITY,              \n"
                  +"  NVL(DUSR.E_ADDRESS, ' ')      E_ADDRESS,               \n"
                  +"  NVL(DUSR.DEGREES,' ')         DEGREES                  \n"
                  +"FROM " +Database.DCMS.defineUsers+"DUSR,                 \n"
                 +Database.DCMS.location+"LOC,                               \n"
                  +Database.DCMS.definitionTypeDetail+"DEP,                  \n"
                  +Database.DCMS.definitionTypeDetail+"DES,                  \n"
                  +Database.DCMS.definitionTypeDetail+"SPE,                  \n"
                  +Database.DCMS.section+"SEC                                \n"
                  +"WHERE 1 = 1                                              \n";
          
                 if(userId.length() != 0){
                      query +=" AND DUSR.USER_ID = '"+userId+"'              \n";
                  }
                 
                 if(name.length() != 0){
                      query +=" AND DUSR.NAME = '"+name+"'                   \n";
                  }
                 
                 
                 if(userName.length() != 0){
                      query +=" AND DUSR.USER_NAME = '"+userName+"'          \n";
                  }
                 
                 if(departmentId.length() != 0){
                      query +=" AND DUSR.DEPARTMENT_ID = '"+departmentId+"'  \n";
                  }
                 
                 if(sectionId.length() != 0){
                      query += " AND DUSR.SECTION_ID = '"+sectionId+"'       \n";
                  }
                 
                  query +=" AND DUSR.LOCATION_ID = LOC.ID                    \n"
                  +" AND DUSR.DEPARTMENT_ID = DEP.ID                         \n"
                  +" AND DUSR.SECTION_ID = SEC.SECTION_ID                    \n"
                  +" AND DUSR.DESIGNATION_ID = DES.ID                        \n"
                  +" AND DUSR.SPECIALITY_ID = SPE.ID                         \n";
                  
          //System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<BODefineUser> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              BODefineUser objData = new BODefineUser();
              
              objData.setFullName(map.get("FULL_NAME").toString());
              objData.setTypee(map.get("TYPEE").toString());
              objData.setActive(map.get("ACTIVE").toString());
              objData.setUserName(map.get("USER_NAME").toString());
              objData.setUserId(map.get("USER_ID").toString());
              objData.setLocationId(map.get("LOCATION_ID").toString());
              objData.setLocations(map.get("LOCATIONS").toString());
              objData.setDepartmentId(map.get("DEPARTMENT_ID").toString());
              objData.setDepartment(map.get("DEPARTMENT").toString());
              objData.setSectionId(map.get("SECTION_ID").toString());
              objData.setSections(map.get("SECTIONS").toString());
              objData.setDesignationId(map.get("DESIGNATION_ID").toString());
              objData.setDesignation(map.get("DESIGNATION").toString());
              objData.setSpecialityId(map.get("SPECIALITY_ID").toString());
              objData.setSpeciality(map.get("SPECIALITY").toString());
              objData.seteAddress(map.get("E_ADDRESS").toString());
              objData.setDegrees(map.get("DEGREES").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
     
      public boolean updateUserInfo(BODefineUser objRv) {

        String query
                = " UPDATE " + Database.DCMS.defineUsers + "DU               \n"
                + " SET DU.TYPE ='" + objRv.getTypee() + "',             \n"
                + " DU.NAME = '" + objRv.getFullName() + "' ,                \n"
                + " DU.ACTIVE = '" + objRv.getActive() + "',                 \n"
                + " DU.USER_NAME = '" + objRv.getUserName() + "',            \n"
                + " DU.USER_ID = '" + objRv.getUserId() + "',                \n"
                + "DU.LOCATION_ID = '"+objRv.getLocationId()+"',             \n"
                + "DU.DEPARTMENT_ID = '"+objRv.getDepartmentId()+"',         \n"
                + "DU.SECTION_ID = '"+objRv.getSectionId()+"',               \n"
                + "DU.DESIGNATION_ID = '"+objRv.getDesignationId()+"',       \n"
                + "DU.SPECIALITY_ID = '"+objRv.getSpecialityId()+"',         \n"
                + "DU.DEGREES = '"+objRv.getDegrees()+"'                     \n"
                + "WHERE DU.USER_ID = '"+objRv.getUserId()+"'                \n";
        
        return Constants.dao.executeUpdate(query, false);

    }
      
      
    
    public boolean insertUserId(BODefineUser objSave){
    
    
    String[] columns={Database.DCMS.defineUsers, "USER_ID","LOCATION_ID" , "NAME" , 
        "REGISTRATION_DATE","CONTACT_NO" , "DESIGNATION_ID" ,"ADDRESS", "ACTIVE" , "PASSWORD" , 
        "DEPARTMENT_ID" , "TYPE" , "DEGREES" , "SPECIALITY_ID",
        "SECTION_ID" , "CRTD_BY" , "CRTD_TERMINAL_ID","E_ADDRESS","USER_NAME"};
    
            HashMap insertMem = new HashMap();
            insertMem.put("USER_ID", "'"+objSave.getUserId()+"'");                   
            insertMem.put("LOCATION_ID","'" +objSave.getLocationId()+"'");
            insertMem.put("NAME","'" +objSave.getFullName()+"'");
            insertMem.put("REGISTRATION_DATE", Constants.today);
            insertMem.put("CONTACT_NO","'" +objSave.getContact()+"'");
            insertMem.put("DESIGNATION_ID","'" +objSave.getDesignationId()+"'");
            insertMem.put("ADDRESS","'" +objSave.getAddress()+"'");
            insertMem.put("ACTIVE","'" +objSave.getActive()+"'");
            insertMem.put("PASSWORD","'" +objSave.getPassword()+"'");
            insertMem.put("DEPARTMENT_ID","'" +objSave.getDepartmentId()+"'");
            insertMem.put("TYPE","'" +objSave.getTypee()+"'");
            insertMem.put("DEGREES","'" +objSave.getDegrees()+"'");
            insertMem.put("SPECIALITY_ID","'" +objSave.getSpecialityId()+"'");
            insertMem.put("SECTION_ID","'" +objSave.getSectionId()+"'");
            insertMem.put("CRTD_BY","'" +Constants.userId +"'");
            insertMem.put("CRTD_TERMINAL_ID","'" + Constants.terminalId +"'");
            insertMem.put("E_ADDRESS","'" +objSave.geteAddress()+"'");
            insertMem.put("USER_NAME","'" +objSave.getUserName()+"'");
           
             List lstMember = new ArrayList();
             lstMember.add(insertMem);
              return Constants.dao.insertData(lstMember, columns);
            
    
    }
}
