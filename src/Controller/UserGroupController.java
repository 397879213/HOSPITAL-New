/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BO.SetupColumnDetail;
import Handler.UserGroupHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Pacslink
 */
public class UserGroupController {

    UserGroupHandler hdlUserGroup = new UserGroupHandler();
    
    public boolean copyLocationDepartStorePerformingRights(String fromUser, String toUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<SetupColumnDetail> selectUserProprties(String userId) {
        return hdlUserGroup.selectUserProprties(userId);
    }
    
    public boolean updateClientSetupProprties(List<SetupColumnDetail> listProperties) {
        SetupColumnDetail property = listProperties.get(0);
        boolean ret = hdlUserGroup.insertUserPropertyHist(property);
        if (ret) {
            ret = hdlUserGroup.updateUserSetupProprties(listProperties);
        }

        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
}
