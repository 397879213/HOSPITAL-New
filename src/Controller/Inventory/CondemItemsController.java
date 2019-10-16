/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Inventory;

import BO.Inventory.CondemItems;
import Handler.Inventory.CondemItemsHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Talha Khan
 */
public class CondemItemsController {

    CondemItemsHandler hdlCondemItems = new CondemItemsHandler();

    public List<CondemItems> selectCondemMaster(CondemItems objSrch) {
        return hdlCondemItems.selectCondemMaster(objSrch);
    }

    public List<CondemItems> selectCondemDetail(String condemId,
            String statusId) {
        return hdlCondemItems.selectCondemDetail(condemId, statusId);
    }

    public String condemId() {
        return hdlCondemItems.condemId();
    }

    public String checkMaster(String condemId) {
        return hdlCondemItems.checkMaster(condemId);
    }

    public boolean insertCondumMaster(CondemItems obj) {
        boolean ret = hdlCondemItems.insertCondumMaster(obj);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertCondumDetail(CondemItems obj) {
        boolean ret = hdlCondemItems.insertCondumDetail(obj);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deleteCondemDetailItem(CondemItems obj) {
        boolean ret = hdlCondemItems.deleteCondemDetailItem(obj);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public String checkMasterForUpdate(String condemId) {
        return hdlCondemItems.checkMasterForUpdate(condemId);
    }

    public boolean updateCondemMaster(CondemItems obj) {
        boolean ret = hdlCondemItems.updateCondemMaster(obj);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCondemDetail(List<CondemItems> listUpdate,
            String lessStoreId, String addStoreId, String isRequseted) {
        boolean ret = hdlCondemItems.updateCondemDetail(listUpdate);
        if (ret) {
            ret = hdlCondemItems.updateStoreStock(listUpdate, lessStoreId, isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.updateForDiscartedItem(listUpdate, addStoreId,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.insertItemLedger(listUpdate);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateRejectRequest(List<CondemItems> listUpdate,
            String lessStoreId, String addStoreId, String isRequseted) {
        boolean ret = hdlCondemItems.updateRejectRequest(listUpdate);
        if (ret) {
            ret = hdlCondemItems.updateStoreStock(listUpdate, lessStoreId,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.updateForDiscartedItem(listUpdate, addStoreId,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.insertItemLedger(listUpdate);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateRequestStoreStocks(List<CondemItems> listUpdate,
            String lessStoreId, String addStoreId, String isRequseted) {
        CondemItems condemItem = listUpdate.get(0);
        boolean ret = hdlCondemItems.updateForRequestInMaster(condemItem);
        if (ret) {
            ret = hdlCondemItems.updateForRequestInDetail(listUpdate);
        }
        if (ret) {
            hdlCondemItems.updateStoreStock(listUpdate, lessStoreId,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.updateForDiscartedItem(listUpdate, addStoreId,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.insertItemLedger(listUpdate);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean cancelCondemItem(CondemItems objDlt) {
        boolean ret = hdlCondemItems.cancelCondemItem(objDlt);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
