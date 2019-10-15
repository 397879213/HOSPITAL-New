/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Management;

import BO.Management.formAttachBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Sequences;

/**
 *
 * @author razas
 */
public class FormAttachHandler {
    
    public List<formAttachBO> SearchformAttach(String title){
    
    String columns[] = {"-","FORM_ID","TITLE","MENU_NAME","FORM_NAME","POSITION","ACTIVE",
        "DESCRIPTION","WEB_URL","WEB_ENABLED","DESKTOP_ENABLED"};
        
        String query = " SELECT F.ID            FORM_ID,              \n"
                + "F.NAME                       TITLE,                \n"
                + "M.NAME                       MENU_NAME,            \n"
                + "F.FORM_NAME                  FORM_NAME,            \n"
                + "F.POSITION                   POSITION,            \n"
                + "F.ACTIVE                     ACTIVE,               \n"
                + "F.DESCRIPTION                DESCRIPTION,          \n"
                + "NVL(F.WEB_URL,' ')            WEB_URL,              \n"
                + "F.WEB_ENABLED                WEB_ENABLED,          \n"
                + "F.DESKTOP_ENABLED            DESKTOP_ENABLED       \n"
                + " FROM " + Database.DCMS.form + " F,                \n"
                + Database.DCMS.menu + " M                            \n"
                + " WHERE UPPER(F.NAME) LIKE '%" 
                    + title.trim().toUpperCase() + "%'                \n"
                + " AND F.MENU_ID = M.ID " ;  
        
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<formAttachBO> lisadd = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            formAttachBO objBO = new formAttachBO();
            
            objBO.setId(map.get("FORM_ID").toString());
            objBO.setTitle(map.get("TITLE").toString());
            objBO.setMenuName(map.get("MENU_NAME").toString());
            objBO.setFormName(map.get("FORM_NAME").toString());
            objBO.setPosition(map.get("POSITION").toString());
            objBO.setActive(map.get("ACTIVE").toString());
            objBO.setDescription(map.get("DESCRIPTION").toString());
            objBO.setWebURL(map.get("WEB_URL").toString());
            objBO.setWebEnabled(map.get("WEB_ENABLED").toString());
            objBO.setDesktopEnabled(map.get("DESKTOP_ENABLED").toString());
            lisadd.add(objBO);
        }
        
        return lisadd;
    }

    
     public boolean insertFormAttach(formAttachBO objSave){
    
    
    String[] columns={Database.DCMS.form,"NAME","MENU_ID","FORM_NAME","POSITION","ACTIVE",
        "DESCRIPTION","ID","WEB_URL","CRTD_BY","CRTD_DATE","WEB_ENABLED","DESKTOP_ENABLED"};
    
            HashMap insertFormAttach = new HashMap();                  
            insertFormAttach.put("NAME","'" +objSave.getTitle()+"'");
            insertFormAttach.put("MENU_ID","'" +objSave.getMenuId()+"'");
            insertFormAttach.put("FORM_NAME","'" +objSave.getFormName()+"'");
            insertFormAttach.put("POSITION","'" +objSave.getPosition()+"'");
            insertFormAttach.put("ACTIVE","'" +objSave.getActive()+"'");
            insertFormAttach.put("DESCRIPTION","'" +objSave.getDescription()+"'");
//            insertFormAttach.put("ID", Sequences.formSeq); 
            insertFormAttach.put("WEB_URL","'" +objSave.getWebURL()+"'");
            insertFormAttach.put("CRTD_BY","'" + Constants.userId +"'");
            insertFormAttach.put("CRTD_DATE","SYSDATE");
            insertFormAttach.put("WEB_ENABLED","'" +objSave.getWebEnabled()+"'");
            insertFormAttach.put("DESKTOP_ENABLED","'" +objSave.getDesktopEnabled()+"'");
           
             List lstFormAttach = new ArrayList();
             lstFormAttach.add(insertFormAttach);
              return Constants.dao.insertData(lstFormAttach, columns);
            
    
    }
     
     
     public boolean  UpdateFormAttach(formAttachBO objSave){
    
       String query 
                   = " UPDATE " + Database.DCMS.form + "\n SET "
                   + "NAME =             '" +objSave.getTitle().trim() +"',            \n";
                   
               if(!objSave.getMenuId().equalsIgnoreCase("")){
                   query 
                   += "MENU_ID =          '" +objSave.getMenuId().trim() +"',           \n";
                           }
                   query 
                   += "FORM_NAME =        '" +objSave.getFormName().trim() +"',         \n"
                   + "POSITION =         '" +objSave.getPosition().trim() +"',         \n"  
                   + "ACTIVE =          '"+ objSave.getActive() +"',                   \n"
                   + "DESCRIPTION =      '" +objSave.getDescription().trim() +"',      \n"
                   + "WEB_URL =          '" +objSave.getWebURL() +"',                  \n"
                   + "UPTD_BY =          '" + Constants.userId +"',                    \n"
                   + "UPTD_DATE =        SYSDATE ,                                     \n"
                   + "WEB_ENABLED =     '"+ objSave.getWebEnabled() +"' ,              \n"
                   + "DESKTOP_ENABLED = '"+ objSave.getDesktopEnabled() +"'            \n";
             query += "WHERE  ID =       '" + objSave.getId().trim() +    "'           \n";
               
       return Constants.dao.executeUpdate(query, false);
       
    }

          
}
