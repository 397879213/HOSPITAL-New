/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Setup;

import BO.Setup.FormActionBO;
import Handler.Setup.FormActionHndler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class FormActionController {

    FormActionHndler hdlAction = new FormActionHndler();

    public List<FormActionBO> selectIdWiseAction(String actionId) {
        return hdlAction.selectIdWiseAction(actionId);
    }

    public List<FormActionBO> selectNameWiseAction(String actionDesc) {
        return hdlAction.selectNameWiseAction(actionDesc);
    }

    public List<FormActionBO> selectFormWiseAction(String fromId) {
        return hdlAction.selectFormWiseAction(fromId);
    }

    public boolean insertFormAction(FormActionBO action) {
        boolean ret = hdlAction.insertFormAction(action);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateFormAction(FormActionBO action) {
        boolean ret = hdlAction.updateFormAction(action);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}
