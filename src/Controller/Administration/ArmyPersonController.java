/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.ArmyPersonBO;
import Handler.Administration.ArmyPersonHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class ArmyPersonController {

    ArmyPersonHandler hdlAP = new ArmyPersonHandler();

    public List<ArmyPersonBO> selectArmyPerson(ArmyPersonBO objSrch) {
        return hdlAP.selectArmyPerson(objSrch);
    }

    public boolean insertArmyPerson(ArmyPersonBO objAP) {
        boolean ret = hdlAP.insertArmyPerson(objAP);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateArmyPerson(ArmyPersonBO objAP) {
        boolean ret = hdlAP.updateArmyPerson(objAP);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
