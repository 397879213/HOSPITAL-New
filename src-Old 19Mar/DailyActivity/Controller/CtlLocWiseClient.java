/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DailyActivity.Controller;

import DailyActivity.BO.BOLocWiseClient;
import DailyActivity.Handler.LocationWiseClientHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Raheel Ansari
 */
public class CtlLocWiseClient {
    LocationWiseClientHandler objHdl = new LocationWiseClientHandler();
    
    public List<BOLocWiseClient> selectAttachedClient(String locId){
    
        return objHdl.selectAttachedClient(locId);
    }
    
    public List<BOLocWiseClient> unAttachedClient(String locId){
    
        return objHdl.selectUnAttachedClient(locId);
    }
    
    public boolean insertLocWiseClient(List<BOLocWiseClient> addClient, String locId){
    
        Boolean ret = objHdl.insertForSelectedBeds(addClient, locId);
        
    if(ret){
            Constants.dao.commitTransaction();
    }
        
    if(!ret){
        Constants.dao.rollBack();
    }
        return ret;
    }
    
    public boolean UnAttachClient(List<BOLocWiseClient> unAttachClient) {
    
        Boolean ret = objHdl.dltUnAttachClient(unAttachClient);
        
        if(ret){
            Constants.dao.commitTransaction();
    }
        
    if(!ret){
        Constants.dao.rollBack();
    }
        return ret;
    }
    
}
