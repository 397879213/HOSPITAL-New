/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Controller;

import Inventory.BO.Item;
import Inventory.Handler.MedicineSearchHandler;
import java.util.List;

/**
 *
 * @author admin
 */
public class MedicineSearchController {
    
    MedicineSearchHandler hdlMedSrch = new MedicineSearchHandler();
    
    public List<Item> searchMedicineDetail(Item objSrch) {
        return hdlMedSrch.searchMedicineDetail(objSrch);
    }
}
