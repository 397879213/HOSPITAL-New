/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import BO.Management.BOLocWiseClient;
import java.util.Vector;
import static utilities.Constants.dao;
import utilities.Sequences;

/**
 *
 * @author Raheel Ansari
 */
public class HdlLocWiseClient {
    
    
    public List<BOLocWiseClient> selectAttachedClient(String locId){
    
        String columns[] = {"-" ,"ID","CLIENT_NAME","LOCATION_NAME"};
        
        String query = "SELECT CWL.ID       ID,                         \n" 
        +"  CL.DESCRIPTION                  CLIENT_NAME,                \n" 
        +"  LOC.DESCRIPTION                 LOCATION_NAME               \n"
        +"  FROM " + Database.DCMS.clientWiseLocation + " CWL,          \n"
        +"  " + Database.DCMS.client + " CL,                            \n" 
        + Database.DCMS.location + " LOC                                \n" 
        + "  WHERE CWL.LOCATION_ID = '" +  locId + "'                   \n" 
        + "  AND CWL.CLIENT_ID = CL.ID                                  \n"
        + "  AND CWL.LOCATION_ID = LOC.ID                               \n"
        + "  ORDER BY CL.DESCRIPTION                                 \n";
        
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BOLocWiseClient> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BOLocWiseClient objBO = new BOLocWiseClient();
            
            objBO.setId(map.get("ID").toString());
            objBO.setClientDescription(map.get("CLIENT_NAME").toString());
            objBO.setLocationDescription(map.get("LOCATION_NAME").toString());
            
            
            lisVerRep.add(objBO);
        }
        
        return lisVerRep;
    }
    
    
    public List<BOLocWiseClient> selectUnAttachedClient(String locId){
    
        String columns[] = {"-" ,"ID", "CLIENT_NAME", "TRANSACTION_TYPE"};
        
        String query = " SELECT CL.ID           ID,                     \n" 
        +"  CL.DESCRIPTION                      CLIENT_NAME,            \n" 
        +"  CL.TRANSACTION_TYPE                 TRANSACTION_TYPE        \n" 
        +"  FROM " + Database.DCMS.client + "   CL                      \n" 
        + " WHERE CL.ID NOT IN (                                  \n" 
        + " SELECT CWL.CLIENT_ID FROM                                   \n"
        + Database.DCMS.clientWiseLocation + " CWL                     \n"
        + " WHERE CWL.LOCATION_ID =  '" +  locId + "' )                   \n"
        + " AND CL.ACTIVE = 'Y'                                         \n"
        + " ORDER BY CL.DESCRIPTION                                 \n";
        
        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BOLocWiseClient> lisVerRep = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BOLocWiseClient objBO = new BOLocWiseClient();
            
            objBO.setClientId(map.get("ID").toString());
            objBO.setClientDescription(map.get("CLIENT_NAME").toString());
            objBO.setTransectionType(map.get("TRANSACTION_TYPE").toString());
            
            lisVerRep.add(objBO);
        }
        
        return lisVerRep;
    }
    
    public boolean insertForSelectedBeds(List<BOLocWiseClient> addClient, String locId){
    
    
    String[] columns={Database.DCMS.clientWiseLocation,"ID", "CLIENT_ID" , 
                                    "LOCATION_ID"};
    
            Vector vec = new Vector();
            int i = 1;
        for (BOLocWiseClient objBO : addClient) {
            
            HashMap record = new HashMap();  
        
//            record.put("ID",  Sequences.clientWiseLoc_Seq );
            record.put("CLIENT_ID","'" +objBO.getClientId()+"'");
            record.put("LOCATION_ID","'" + locId +"'");
           
            vec.add(record);
        }
              return dao.insertData(vec, columns); 
    }
    
    public boolean dltUnAttachClient(List<BOLocWiseClient> unAttachClient) {

        boolean ret = true;
        
        for (int i = 0; i < unAttachClient.size(); i++) {
            BOLocWiseClient dlt = unAttachClient.get(i);
            String query = "DELETE FROM " + Database.DCMS.clientWiseLocation + " \n"
                    + " WHERE ID = '" + dlt.getId() + "'            \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
}
