/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Handler;



import OPD.BO.BOMedicineFrequencySetup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author 
 */
public class MedicineFrequencySetupHandler {
    
    
     public List<BOMedicineFrequencySetup> selectMedicineSearch(int actionId, 
     String description) {
         
          String columns[] = {"-","ID","DESCRIPTION","ACTION_ID", "POSITION",
              "COUNT", "URDU_TEXT","ACTIVE"};
          
          String query ="  SELECT ID                 ,                       \n"
                  +" DESCRIPTION                     ,                       \n"
                  +" ACTION_ID                       ,                       \n"
                  +" POSITION                        ,                       \n"
                  +" COUNT                           ,                       \n"
                  +" URDU_TEXT                       ,                       \n"
                  + "ACTIVE                                                  \n"
                  + "FROM  " + Database.DCMS.medicineFrequency+ "            \n"
                  + "WHERE ACTIVE = 'Y'                                        \n";
          if (actionId != 0) {
             query += " AND ACTION_ID = '"+actionId+"'            \n";
         }
            if (description.length() != 0) {
             query += " AND DESCRIPTION LIKE '%" + description + "%'          \n";
         }
        query += " ORDER BY ID                                               \n";
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<BOMedicineFrequencySetup> lisVerRep = new ArrayList<>();
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              BOMedicineFrequencySetup objData = new BOMedicineFrequencySetup();
              
              objData.setId(map.get("ID").toString());
              objData.setDescription(map.get("DESCRIPTION").toString());
              objData.setActionId(map.get("ACTION_ID").toString());
              objData.setPosition(map.get("POSITION").toString());
              objData.setCount(map.get("COUNT").toString());
              objData.setUrduText(map.get("URDU_TEXT").toString());
              objData.setActive(map.get("ACTIVE").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
     
     
      public boolean updateMediInfo(BOMedicineFrequencySetup objRv) {

        String query
                = " UPDATE " + Database.DCMS.medicineFrequency + "MF         \n"
                + " SET  MF.DESCRIPTION ='" + objRv.getDescription() + "',   \n"
                + " MF.COUNT = '" + objRv.getCount()+ "' ,                   \n"
                + " MF.ACTIVE = '" + objRv.getActive() + "',                 \n"
                + " MF.URDU_TEXT =  '" + objRv.getUrduText()+ "',            \n"
                + " MF.POSITION = '" + objRv.getPosition()+ "'               \n"
               + "WHERE MF.ID = '"+objRv.getId()+"'                          \n";
        
        return Constants.dao.executeUpdate(query, false);

    }
      
       public boolean insertMedicineInfo(BOMedicineFrequencySetup objData){
        
        String[] columns = {Database.DCMS.medicineFrequency, "ID", "DESCRIPTION", "ACTION_ID",
        "COUNT","ACTIVE","POSITION","URDU_TEXT","CRTD_BY","CRTD_DATE", "CRTD_TERMINAL_ID"};
        
        HashMap map = new HashMap();
        map.put("ID", " (SELECT MAX(ID)+ 1 FROM " + Database.DCMS.medicineFrequency +")\n");
        map.put("DESCRIPTION", "'" + objData.getDescription() + "'");
        map.put("ACTION_ID", "'" + objData.getActionId() + "'");
        map.put("COUNT", "'" + objData.getCount() + "'");
        map.put("ACTIVE", "'Y'");
        map.put("POSITION", "'" + objData.getPosition()+ "'");
        map.put("URDU_TEXT", "'" + objData.getUrduText()+ "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE",Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listItem = new ArrayList();
        listItem.add(map);
        
        return Constants.dao.insertData(listItem, columns);
        
    }
       
       
       
}
