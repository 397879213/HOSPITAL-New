/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Inventory;

import Inventory.BO.StoreWiseItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Stores;

/**
 *
 * @author raheelansari
 */
public class OutreachPathInventoryHandler {

    public String storeName(String storeId) {
        String[] columns = {"-", "STORE_DESC"};
        String query
                = " SELECT DESCRIPTION STORE_DESC FROM              \n"
                + Database.Inventory.store + "         "
                + " WHERE ID = " + storeId + "\n";
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("STORE_DESC").toString();
    }

    public String manualIndentId() {
        String[] columns = {"-", "ID"};
        String query
                = " SELECT NVL(MAX(ID) + 1, 1) ID FROM              \n"
                + Database.Inventory.manualIndentMaster + "         \n";
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    public boolean insertManualIndentMaster(StoreWiseItems obj) {
        String[] columns = {Database.Inventory.manualIndentMaster, "ID", "MANUAL_INDENT_NO",
            "STORE_ID", "USER_ID", "STATUS_ID", "MOVE_STORE_ID", "CRTD_DATE",
            "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();
        map.put("ID", obj.getIndentId());
        map.put("MANUAL_INDENT_NO", obj.getManualIndentNo());
        map.put("USER_ID", "'" + obj.getRequestedUserId() + "'");
        map.put("STATUS_ID", "'" + obj.getStatusId() + "'");
        map.put("STORE_ID", "'" + obj.getStoreId() + "'");
        map.put("MOVE_STORE_ID", "'" + obj.getMoveStoreId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public boolean insertManualIndentDetail(StoreWiseItems obj) {
        String[] columns = {Database.Inventory.manualIndentDetail, "MANUAL_ID",
            "ITEM_ID", "QTY"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();
        map.put("MANUAL_ID", obj.getIndentId());
        map.put("ITEM_ID", "'" + obj.getItemId() + "'");
        map.put("QTY", "'" + obj.getQty() + "'");
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public List<StoreWiseItems> selecttManualIndentMaster(StoreWiseItems obj) {

        String[] selectColumns = {"-", "ID", "USER_ID", "MANUAL_INDENT_NO",
            "REQUESTED_USER_NAME", "MOVE_STORE_ID", "MOVE_STORE_DESC", "CRTD_DATE",
            "CRTD_BY", "CRTD_USER", "CRTD_TERMINAL_ID", "STATUS_ID", "STATUS_DESCRIPTION"};

        String query
                = "SELECT   MIM.ID,                                          \n"
                + "         MIM.MANUAL_INDENT_NO,                            \n"
                + "         MIM.USER_ID,                                     \n"
                + "         MIM.STATUS_ID,                                   \n"
                + "         STS.DESCRIPTION STATUS_DESCRIPTION,              \n"
                + "         RES.NAME REQUESTED_USER_NAME,                    \n"
                + "         MIM.MOVE_STORE_ID,                               \n"
                + " NVL(STR.DESCRIPTION, ' ') MOVE_STORE_DESC,               \n"
                + "        MIM.CRTD_BY,                                      \n"
                + "         CRU.NAME CRTD_USER,                              \n"
                + " TO_CHAR(MIM.CRTD_DATE, 'DD-MON-YY HH12:MI PM') CRTD_DATE,\n"
                + "         MIM.CRTD_TERMINAL_ID  FROM                       \n"
                + Database.Inventory.manualIndentMaster + " MIM,             \n";
        if (obj.getItemId() != 0) {
            query += Database.Inventory.manualIndentDetail + " MID,  \n";
        }

        query += Database.DCMS.users + " RES,                        \n"
                + Database.DCMS.store + " STR,                               \n"
                + Database.DCMS.definitionTypeDetail + " STS,                \n"
                + Database.DCMS.users + " CRU                                \n"
                + " WHERE 1 = 1                                              \n";
        if (obj.getIndentId().length() != 0) {
            query += " AND MIM.ID = " + obj.getIndentId() + "     \n";
        }
        if (obj.getManualIndentNo().length() != 0) {
            query += " AND MIM.MANUAL_INDENT_NO = " + obj.getManualIndentNo() + "     \n";
        }
        if (obj.getFromDate().length() != 0 && obj.getToDate().length() != 0) {
            query += " AND MIM.CRTD_DATE BETWEEN '" + obj.getFromDate()
                    + "' AND '" + obj.getToDate() + "'\n";
        }
        if (obj.getStoreId() != 0) {
            query += " AND MIM.MOVE_STORE_ID = " + obj.getStoreId() + "  ";
                    }
        if (obj.getItemId() != 0) {
            query += " AND MID.ITEM_ID = " + obj.getItemId() + "    \n"             
                    + "AND MIM.ID = MID.MANUAL_ID                   \n";
        }
        query += "   AND MIM.STATUS_ID = "+ obj.getStatusId() +"     \n"
                + "  AND MIM.USER_ID = RES.USER_NAME                 \n"
                + "  AND MIM.MOVE_STORE_ID = STR.ID                  \n"
                + "  AND MIM.CRTD_BY = CRU.USER_NAME                 \n"
                + "  AND MIM.STATUS_ID = STS.ID                      \n"
                + "  ORDER BY MIM.ID                                 \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<StoreWiseItems> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            StoreWiseItems setCondem = new StoreWiseItems();

            setCondem.setIndentId(map.get("ID").toString());
            setCondem.setManualIndentNo(map.get("MANUAL_INDENT_NO").toString());
            setCondem.setRequestedUserId(map.get("USER_ID").toString());
            setCondem.setRequestedUserName(map.get("REQUESTED_USER_NAME").toString());
            setCondem.setMoveStoreId(map.get("MOVE_STORE_ID").hashCode());
            setCondem.setMoveStoreDesc(map.get("MOVE_STORE_DESC").toString());
            setCondem.setMoveStoreDesc(map.get("STATUS_ID").toString());
            setCondem.setMoveStoreDesc(map.get("STATUS_DESCRIPTION").toString());
            setCondem.setCrtdBy(map.get("CRTD_BY").toString());
            setCondem.setCrtdByName(map.get("CRTD_USER").toString());
            setCondem.setCrtdDate(map.get("CRTD_DATE").toString());
            setCondem.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setCondem);
        }
        return list;
    }

    public List<StoreWiseItems> selecttManualIndentDetail(String manualIndentId) {

        String[] selectColumns = {"-", "MANUAL_ID", "ITEM_ID", "ITEM_NAME", "QTY"};

        String query
                = "SELECT MID.MANUAL_ID,                       \n"
                + "       MID.ITEM_ID,                         \n"
                + "       ITM.DESCRIPTION ITEM_NAME,           \n"
                + "       MID.QTY FROM                         \n"
                + Database.Inventory.manualIndentDetail + " MID, \n"
                + Database.DCMS.item + " ITM                     \n"
                + " WHERE MID.MANUAL_ID = " + manualIndentId + "   \n"
                + " AND MID.ITEM_ID = ITM.ID                     \n"
                + " ORDER BY MID.MANUAL_ID                       \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<StoreWiseItems> listItems = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            StoreWiseItems setItems = new StoreWiseItems();

            setItems.setIndentId(map.get("MANUAL_ID").toString());
            setItems.setItemId(Integer.parseInt(map.get("ITEM_ID").toString()));
            setItems.setItemDescription(map.get("ITEM_NAME").toString());
            setItems.setQty(Integer.parseInt(map.get("QTY").toString()));
            listItems.add(setItems);
        }
        return listItems;
    }

    public String checkMaster() {
        String[] columns = {"-", "ID"};

        String query
                = " SELECT NVL(MAX(ID), 0) ID FROM              \n"
                + Database.Inventory.manualIndentMaster + "     \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    public boolean updateIndentmasterStatus(StoreWiseItems objUpdate) {
        boolean ret = true;

        String query
                = " UPDATE " + Database.Inventory.manualIndentMaster + "\n"
                + " SET STATUS_ID = " + objUpdate.getStatusId() + "  \n"
                + " WHERE ID =  " + objUpdate.getIndentId() + "      \n";
        ret = Constants.dao.executeUpdate(query, false);
        return ret;
    }

    public boolean updateStoreStock(List<StoreWiseItems> listUpdate) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            StoreWiseItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.storeWiseItems + " SWI \n"
                    + " SET SWI.QTY = SWI.QTY - " + objUpdate.getQty() + "     \n"
                    + " WHERE SWI.STORE_ID =  " + objUpdate.getStoreId() + " \n"
                    + " AND SWI.ITEM_ID =  " + objUpdate.getItemId() + "     \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean addManualStoreStock(List<StoreWiseItems> listUpdate) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            StoreWiseItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.storeWiseItems + " SWI \n"
                    + " SET SWI.QTY = SWI.QTY + " + objUpdate.getQty() + "     \n"
                    + " WHERE SWI.STORE_ID =  " + Stores.pathologyManualStore + "\n"
                    + " AND SWI.ITEM_ID =  " + objUpdate.getItemId() + "     \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean insertItemLedger(List<StoreWiseItems> listSave) {

        String[] columns = {Database.Inventory.itemLedger, "SERIAL",
            "TRANSACTION_TYPE_ID", "TRANSACTION_NO", "ITEM_ID", "STORE_ID",
            "QTY_IN", "QTY_OUT", "VALUE_IN", "VALUE_OUT", "COST", "TOTAL_QTY",
            "TOTAL_VALUE", "REF_STORE_ID", "BATCH_NO", "EXPIRY_DATE", "CRTD_DATE",
            "CRTD_BY", "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listSave.size(); i++) {
            StoreWiseItems objSave = listSave.get(i);
            HashMap insertFormAttach = new HashMap();
            insertFormAttach.put("SERIAL", "(SELECT MAX(SERIAL) + 1 FROM "
                    + Database.Inventory.itemLedger + ")");
            insertFormAttach.put("TRANSACTION_TYPE_ID", "3006");
            insertFormAttach.put("TRANSACTION_NO", "'12345'");
            insertFormAttach.put("ITEM_ID", "'" + objSave.getItemId() + "'");
            insertFormAttach.put("STORE_ID", "'" + objSave.getStoreId() + "'");
            insertFormAttach.put("QTY_IN", "'" + objSave.getQty() + "'");
            insertFormAttach.put("QTY_OUT", "'0'");
            insertFormAttach.put("VALUE_IN", "0");
            insertFormAttach.put("VALUE_OUT", "0");
            insertFormAttach.put("COST", "0");
            insertFormAttach.put("TOTAL_QTY", "'0'");
            insertFormAttach.put("TOTAL_VALUE", "'0'");
            insertFormAttach.put("REF_STORE_ID", "'0'");
            insertFormAttach.put("BATCH_NO", "'0'");
            insertFormAttach.put("EXPIRY_DATE", "''");
            insertFormAttach.put("CRTD_BY", "'" + Constants.userId + "'");
            insertFormAttach.put("CRTD_DATE", "SYSDATE");
            insertFormAttach.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            lstInr.add(insertFormAttach);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean deleteManualIndentMaster(String indentId) {
        String query
                = " DELETE FROM " + Database.Inventory.manualIndentMaster + "\n"
                + " WHERE ID = " + indentId + "                             \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean deleteManualIndentDetail(String indentId, int itemId) {
        String query
                = " DELETE FROM " + Database.Inventory.manualIndentDetail + "\n"
                + " WHERE MANUAL_ID = " + indentId + "              \n";
        if (itemId != 0) {
            query += " AND ITEM_ID = " + itemId + "                  \n";
        }
        return Constants.dao.executeUpdate(query, false);
    }
}
