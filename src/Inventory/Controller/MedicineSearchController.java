/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Controller;

import Inventory.BO.Item;
import Inventory.Handler.MedicineSearchHandler;
import java.util.List;
import org.bridj.demangling.Demangler;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class MedicineSearchController {

    MedicineSearchHandler hdlMedSrch = new MedicineSearchHandler();

    public List<Item> searchMedicineDetail(Item objSrch) {
        return hdlMedSrch.searchMedicineDetail(objSrch);
    }

    public boolean updateMedicineInfo(Item item) {
        boolean ret = hdlMedSrch.updateMedicineInfo(item);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean verifyItemInfo(String item) {
        boolean ret = hdlMedSrch.verifyItemInfo(item);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
