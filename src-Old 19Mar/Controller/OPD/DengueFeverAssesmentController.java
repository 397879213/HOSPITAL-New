/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.DengueFeverAssesmentBO;
import Handler.OPD.DengueFeverAssesmentHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class DengueFeverAssesmentController {

    DengueFeverAssesmentHandler hdlDengue = new DengueFeverAssesmentHandler();

    public List<DengueFeverAssesmentBO> selectDengueAssetmentMaster(String con,
            String odi) {
        return hdlDengue.selectDengueAssetmentMaster(con, odi);
    }
    
    public List<DengueFeverAssesmentBO> selectDengueDefinitions(String defTypeId,
            String con, String odi) {
        return hdlDengue.selectDengueDefinitions(defTypeId, con, odi);
    }

    public boolean insertDefinitionsInDengueMaster(String con, String odi) {
        boolean ret = hdlDengue.insertDefinitionsInDengueMaster(con, odi);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateDengueAsst(DengueFeverAssesmentBO objUpdt) {
        boolean ret = hdlDengue.updateDengueAsst(objUpdt);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateRemarks(DengueFeverAssesmentBO objUpdt) {
        boolean ret = hdlDengue.updateRemarks(objUpdt);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
