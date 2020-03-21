/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Controller;

import Inventory.BO.Item;
import Inventory.Handler.POFInventoryPurchaseHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Mission
 */
public class POFInventoryPurchaseController {

    POFInventoryPurchaseHandler hdlUpdtQty = new POFInventoryPurchaseHandler();

    public List<Item> selectItemSearch(String itmDesc, String itmNo, String veri) {

        return hdlUpdtQty.selectItemSearch(itmDesc, itmNo, veri);
    }

    public List<Item> selectFolicSearch(String folicSearchId, String folicItemNo,
            String sts) {
        return hdlUpdtQty.selectFolicSearch(folicSearchId, folicItemNo, sts);
    }

    public boolean updateData(Item updatefolic) {

        //ret = true;
        boolean ret = hdlUpdtQty.updateItem(updatefolic);
        if (ret) {
            ret = hdlUpdtQty.updatePofTable(updatefolic);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public Item selectPOFItemSearch(String refItemId) {
        return hdlUpdtQty.selectPOFItemSearch(refItemId);
    }

    public boolean updateQuantityProcess() {
        boolean ret = false;
        List<Item> listItem = hdlUpdtQty.selectforUpdateQuantity();
        for (int i = 0; i < listItem.size(); i++) {
            Item item = listItem.get(i);
            item.setId(hdlUpdtQty.selectHMISItemId(item.getRefItemId()));
            item.setStoreId(Constants.storeId);
            
            System.err.println("\n\n Heaving Item " + i + " itemId =  " 
                    + item.getId() + " RefId =" + item.getRefItemId() + "\n\n");
            
            ret = hdlUpdtQty.insertPOFItemUpdateHistory(item);
            if (ret) {
                ret = hdlUpdtQty.updateQtySWI(item);
            }
            if (ret) {
                ret = hdlUpdtQty.updateQtySWIDetail(item);
            }
            if (ret) {
                ret = hdlUpdtQty.insertStoreItemHistory(item);
            }
            if (ret) {
                ret = hdlUpdtQty.insertItemLedger(item);
            }
            if(ret){
                ret = hdlUpdtQty.updateStatusInPOAceptFolio(item);
            }
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
        }

        return ret;
    }

    public List<Item> selectPOFItemUpdateHistory() {
        return hdlUpdtQty.selectPOFItemUpdateHistory();
    }

    public boolean updatePOFItemUpdateHistory(List<Item> listItem) {
        boolean ret = hdlUpdtQty.updatePOFItemUpdateHistory(listItem);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
