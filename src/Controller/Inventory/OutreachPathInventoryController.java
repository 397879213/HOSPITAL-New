/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Inventory;

import BO.Inventory.OutreachPathInventory;
import Handler.Inventory.OutreachPathInventoryHandler;
import Inventory.BO.StoreWiseItems;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class OutreachPathInventoryController {
    
    OutreachPathInventoryHandler hdlOutreachPath = new OutreachPathInventoryHandler();
    
    public String storeName(String storeId) {
        return hdlOutreachPath.storeName(storeId);
    }
    
    public String manualIndentId() {
        return hdlOutreachPath.manualIndentId();
    }
    
    public String checkMaster() {
        return hdlOutreachPath.checkMaster();
    }
    
    public boolean insertManualIndentMaster(StoreWiseItems obj) {
        boolean ret = hdlOutreachPath.insertManualIndentMaster(obj);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertManualIndentDetail(StoreWiseItems obj) {
        boolean ret = hdlOutreachPath.insertManualIndentDetail(obj);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<StoreWiseItems> selecttManualIndentMaster(StoreWiseItems obj) {
        return hdlOutreachPath.selecttManualIndentMaster(obj);
    }
    
    public List<StoreWiseItems> selecttManualIndentDetail(String manualIndentId) {
        return hdlOutreachPath.selecttManualIndentDetail(manualIndentId);
    }
    
    public boolean saveUpdateStoresStock(List<StoreWiseItems> listUpdate,
            StoreWiseItems objUpdate) {
        boolean ret = hdlOutreachPath.updateStoreStock(listUpdate);
        if(ret){
            ret = hdlOutreachPath.updateIndentmasterStatus(objUpdate);
        }
        if(ret){
            ret = hdlOutreachPath.addManualStoreStock(listUpdate);
        }
        if(ret){
            ret = hdlOutreachPath.insertItemLedger(listUpdate);
        }
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteManualIndentDetail(String indentId, int itemId) {
        boolean ret = hdlOutreachPath.deleteManualIndentDetail(indentId, itemId);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteManualIndent(String indentId, int itemId) {
        boolean ret = hdlOutreachPath.deleteManualIndentDetail(indentId, itemId);
        if(ret){
            ret = hdlOutreachPath.deleteManualIndentMaster(indentId);
        }
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}
