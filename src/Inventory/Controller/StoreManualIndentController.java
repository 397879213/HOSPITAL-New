package Inventory.Controller;

import Inventory.BO.StoreManualIndent;
import Inventory.Handler.StoreManualIndentHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

public class StoreManualIndentController {

    StoreManualIndentHandler hdlOutreachPath = new StoreManualIndentHandler();

    public StoreManualIndent checkManualIndentBookNo(String manualIndentNo,
            String indentId) {
        return hdlOutreachPath.checkManualBookIndentNo(manualIndentNo,
                indentId);
    }

    public boolean insertManualIndentMaster(StoreManualIndent obj) {

        boolean ret = hdlOutreachPath.insertManualIndentMaster(obj);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

//    public boolean insertManualIndentDetail(StoreManualIndent obj) {
//        boolean ret = hdlOutreachPath.insertManualIndentDetail(obj);
//        if (ret) {
//            Constants.dao.commitTransaction();
//        }
//        if (!ret) {
//            Constants.dao.rollBack();
//        }
//        return ret;
//    }
    public StoreManualIndent selectManualIndentMaster() {
        return hdlOutreachPath.selectManualIndentMaster();
    }

    public List<StoreManualIndent> selectManualIndentDetail(String manualIndentId) {
        return hdlOutreachPath.selectManualIndentDetail(manualIndentId);
    }

    public boolean UpdateItemQtyDetail(List<StoreManualIndent> listUpdt,
            String indentId, String status, List<StoreManualIndent> listHis) {
        boolean ret = hdlOutreachPath.UpdateItemQtyDetail(listUpdt);
        if (ret) {
            ret = hdlOutreachPath.insertIssueRequestHistory(listHis);
        }
        if (ret) {
            ret = hdlOutreachPath.updateIndentStatus(indentId, status);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateStoresStock(List<StoreManualIndent> listItems,
            StoreManualIndent master) {
        List<String> listUpdates = new ArrayList();
        boolean ret = true;
        for (int i = 0; i < listItems.size(); i++) {
            StoreManualIndent indent = listItems.get(i);
            String query
                    = " UPDATE " + Database.Inventory.storeWiseItems + " SWI\n"
                    + " SET SWI.QTY = SWI.QTY + " + indent.getQuantity() + "\n"
                    + " WHERE SWI.STORE_ID =  " + master.getToStoreId() + "   \n"
                    + " AND SWI.ITEM_ID =  " + indent.getItemId() + "       \n";
            listUpdates.add(query);

            String query1
                    = " UPDATE " + Database.Inventory.storeWiseItems + " SWI \n"
                    + " SET SWI.QTY = SWI.QTY - " + indent.getQuantity() + " \n"
                    + " WHERE SWI.STORE_ID =  " + master.getFromStoreId() + "\n"
                    + " AND SWI.ITEM_ID =  " + indent.getItemId() + "       \n";
            listUpdates.add(query1);

            ret = hdlOutreachPath.insertItemLedger(master, indent);
            if (!ret) {
                break;
            }
        }
        if (ret) {
            ret = Constants.dao.executeUpdates(listUpdates);
        }
        if (ret) {
            String query = " UPDATE "
                    + Database.Inventory.manualIndentMaster + "             \n"
                    + " SET ACTION_DATE = SYSDATE,                          \n"
                    + " ACTION_BY = '" + Constants.userId + "',             \n"
                    + " ACTION_TERMINAL_ID = '" + Constants.terminalId + "',\n"
                    + " ORDER_STATUS_ID = " + Status.indentClose + "        \n"
                    + " WHERE ID = " + master.getManualIndentId() + "       \n";
            ret = Constants.dao.executeUpdate(query, false);
        }

        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean cancelIndent(StoreManualIndent indent) {
        boolean ret = hdlOutreachPath.cancelIndent(indent);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean cancelManualIndent(String indentId) {

        String query = "UPDATE " + Database.Inventory.manualIndentMaster + "\n"
                + " SET MANUAL_INDENT_NO = NULL,                            \n"
                + " ACTION_DATE = SYSDATE,                                  \n"
                + " ACTION_BY = '" + Constants.userId + "',                 \n"
                + " ACTION_TERMINAL_ID = '" + Constants.terminalId + "',    \n"
                + " ORDER_STATUS_ID = " + Status.canceled + "               \n"
                + " WHERE ID = " + indentId + "                             \n";
        return Constants.dao.executeUpdate(query, true);
    }

    public boolean updateManualIndentMaster(StoreManualIndent indent) {

        String query = " UPDATE "
                + Database.Inventory.manualIndentMaster + "             \n"
                + " SET MANUAL_INDENT_NO='"
                + indent.getManualBookIndentNo().toUpperCase() + "',    \n"
                + " MANUAL_INDENT_DATE =TO_DATE('"
                + indent.getManualBookIndentDate() + "','DD-MON-YYYY'), \n"
                + " FROM_STORE_ID =" + indent.getFromStoreId() + ",     \n"
                + " TO_STORE_ID =" + indent.getToStoreId() + "            \n"
                + " WHERE ID = " + indent.getManualIndentId() + "       \n";
        return Constants.dao.executeUpdate(query, true);
    }
}
