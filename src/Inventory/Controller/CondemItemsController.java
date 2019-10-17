
package Inventory.Controller;

import Inventory.BO.CondemItems;
import Inventory.Handler.CondemItemsHandler;
import java.util.List;
import utilities.Constants;
import utilities.Stores;


public class CondemItemsController {

    CondemItemsHandler hdlCondemItems = new CondemItemsHandler();

    public List<CondemItems> selectCondemMaster(CondemItems objSrch) {
        return hdlCondemItems.selectCondemMaster(objSrch);
    }

    public List<CondemItems> selectCondemDetail(String condemId,
            String statusId) {
        return hdlCondemItems.selectCondemDetail(condemId, statusId);
    }
    
    public List<CondemItems> searchCondemMaster(CondemItems objSrch) {
        return hdlCondemItems.searchCondemMaster(objSrch);
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
            ret = hdlCondemItems.updateForAddStock(listUpdate, addStoreId,
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
            ret = hdlCondemItems.updateForAddStock(listUpdate, Stores.discartedStore,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.updateStoreStock(listUpdate, lessStoreId,
                    isRequseted);
        }
        if (ret) {
            ret = hdlCondemItems.updateForAddStock(listUpdate, addStoreId,
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
            ret = hdlCondemItems.updateForAddStock(listUpdate, addStoreId,
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

    public boolean cancelCondemItem(List<CondemItems> listDlt) {
        CondemItems objDlt = listDlt.get(0);
        boolean ret = hdlCondemItems.cancelCondemItemDetail(listDlt);
        if(ret){
            ret = hdlCondemItems.cancelCondemItemMaster(objDlt);
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
