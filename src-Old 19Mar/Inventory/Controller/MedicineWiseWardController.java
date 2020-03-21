/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Controller;

import Inventory.BO.MedicineRequestBO;
import Inventory.Handler.MedicineRequestHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Adeel
 */
public class MedicineWiseWardController {

    MedicineRequestHandler hdlMR = new MedicineRequestHandler();

    public List<MedicineRequestBO> selectMedicineRequest(String wardId, String userId) {
        return hdlMR.selectMedicineRequest(wardId, userId);
    }

    public List<MedicineRequestBO> selectSearchMedicineRequest(MedicineRequestBO MR) {
        return hdlMR.selectSearchMedicineRequest(MR);
    }

    public boolean InsertWardWiseMedicine(MedicineRequestBO MR) {
        boolean ret = hdlMR.InsertWardWiseMedicine(MR);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean UpdateMedicine(MedicineRequestBO MR) {
        boolean ret = hdlMR.UpdateMedicine(MR);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
