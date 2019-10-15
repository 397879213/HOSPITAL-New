
package OPD.Handler;

//import BO.OPD.Dosage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;


public class DosageHandler {
    
//    public List<Dosage> selectDoseByAction(String actionId, String description){
//        
//        String[] columns = {"-","ACTION","ID","DESCRIPTION","ACTION_ID","COUNT","IMAGE_PATH",
//        "ACTIVE","CRTD_BY","CRTD_TERMINAL_ID","CRTD_DATE"};
//        
//        String query = " SELECT DECODE( MF.ACTION_ID , 1, 'DOSE(1+1)', 2, 'DOSE(Q6H)' , 3, 'IN WORDS', 4 ,'INSTRUCTIONS' ) ACTION,  \n"
//                + " MF.ID, MF.DESCRIPTION, MF.ACTION_ID, MF.COUNT, NVL(MF.IMAGE_PATH,' ') IMAGE_PATH,                               \n"
//                + " MF.ACTIVE, MF.CRTD_BY, MF.CRTD_TERMINAL_ID, MF.CRTD_DATE                                                        \n"
//                + " FROM " + Database.DCMS.medicineFrequency + " MF                                                                 \n"
//                + " WHERE MF.ACTION_ID = '" + actionId + "'                                                                         \n"
//                + " AND MF.ACTIVE = 'Y'";
//        
//        if(!description.equalsIgnoreCase("") && description != null){
//            query += " AND MF.DESCRIPTION LIKE '%" + description + "%'";
//        }
//        
//        query += " ORDER BY MF.ID";
//        
//        List<HashMap> list = Constants.dao.selectData(query, columns);
//        List<Dosage> listDose = new ArrayList<>();
//        
//        for (int i = 0; i < list.size(); i++) {
//            
//            HashMap map = list.get(i);
//            Dosage dose = new Dosage();
//            dose.setAction(map.get("ACTION").toString());
//            dose.setId(map.get("ID").toString());
//            dose.setDescription(map.get("DESCRIPTION").toString());
//            dose.setActionId(map.get("ACTION_ID").toString());
//            dose.setCount(map.get("COUNT").toString());
//            dose.setImagePath(map.get("IMAGE_PATH").toString());
//            dose.setActive(map.get("ACTIVE").toString());
//            dose.setCrtdBy(map.get("CRTD_BY").toString());
//            dose.setCrtdDate(map.get("CRTD_DATE").toString());
//            dose.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
//            
//            listDose.add(dose);
//        }
//        
//        return listDose;
//    }
    
//    public boolean insertDose(Dosage dose){
//        
//        String[] columns = {Database.DCMS.medicineFrequency, "ID", "DESCRIPTION", "ACTION_ID",
//        "COUNT","ACTIVE", "CRTD_BY", "CRTD_TERMINAL_ID"};
//        
//        HashMap map = new HashMap();
//        map.put("ID", "'" + dose.getId() + "'");
//        map.put("DESCRIPTION", "'" + dose.getDescription() + "'");
//        map.put("ACTION_ID", "'" + dose.getActionId() + "'");
//        map.put("COUNT", "'" + dose.getCount() + "'");
//        map.put("ACTIVE", "'" + dose.getActive() + "'");
//        map.put("CRTD_BY", "'" + Constants.userId + "'");
//        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
//
//        List listItem = new ArrayList();
//        listItem.add(map);
//        
//        return Constants.dao.insertData(listItem, columns);
//        
//    }
    
    public boolean editDose(String dose, String count, String id){
    
        String query = "UPDATE " + Database.DCMS.medicineFrequency
              + " SET DESCRIPTION = '" + dose + "',                      \n"
              + " COUNT = '" + count + "'                                \n"
              + " WHERE ID = '" + id + "'";
        
        return Constants.dao.executeUpdate(query, true);
        
    }
    
    public boolean deleteDose(String id,String actionId){
        
        String query = " UPDATE " + Database.DCMS.medicineFrequency  + " MF     \n"
                + " SET MF.ACTIVE = 'N'                                         \n"
                + " WHERE MF.ID = '" + id + "'                                  \n"
                + " AND MF.ACTION_ID = '" + actionId + "'                       \n";
        
        return Constants.dao.executeUpdate(query, true);
    }
    
    public String getId(){
        
        String[] col = {"", "ID"};
        String query = "SELECT MAX(MF.ID+1) ID FROM " + Database.DCMS.medicineFrequency + " MF";
        
        List<HashMap> list = Constants.dao.selectData(query, col);
        HashMap map = list.get(0);
        
        return map.get("ID").toString();
    }
    

}
