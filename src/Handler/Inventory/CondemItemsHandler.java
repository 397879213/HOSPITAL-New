/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Inventory;

import BO.Inventory.CondemItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

/**
 *
 * @author Talha Khan
 */
public class CondemItemsHandler {

    public boolean insertCondumMaster(CondemItems obj) {
        String[] columns = {Database.Inventory.itemCondemMaster, "ID",
            "REQUEST_BY", "STORE_ID", "ORDER_STATUS_ID", "CRTD_DATE", "CRTD_BY",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();

        map.put("ID", "(SELECT NVL(MAX(ID), 0) + 1 ID FROM "+Database.Inventory.itemCondemMaster+")");
        map.put("REQUEST_BY", "'" + obj.getRequestedBy() + "'");
        map.put("STORE_ID", "'" + obj.getStoreId() + "'");
        map.put("ORDER_STATUS_ID", "'" + obj.getOrderStatusId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        list.add(map);
        return Constants.dao.insertData(list, columns);

    }

    public boolean insertCondumDetail(CondemItems obj) {
        String[] columns = {Database.Inventory.itemCondemDetail, "CONDEM_ID",
            "ITEM_ID", "REQUESTED_QTY", "APPROVED_QTY", "ORDER_STATUS_ID", "REJECT_DATE",
            "REJECT_BY", "REJECT_TERMINAL_ID", "REJECT_REMARKS"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();

        map.put("CONDEM_ID", obj.getCondemId());
        map.put("ITEM_ID", "'" + obj.getItemId() + "'");
        map.put("REQUESTED_QTY", "'" + obj.getRequestedQuantity() + "'");
        map.put("APPROVED_QTY", "'" + obj.getApprovedQuantity() + "'");
        map.put("ORDER_STATUS_ID", "'" + obj.getOrderStatusId() + "'");
        map.put("REJECT_BY", "'" + obj.getRejectBy() + "'");
        map.put("REJECT_DATE", obj.getRejectDate());
        map.put("REJECT_TERMINAL_ID", "'" + obj.getRejectTerminalId() + "'");
        map.put("REJECT_REMARKS", "'" + obj.getRejectRemarks() + "'");

        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public String condemId() {

        String[] columns = {"-", "ID"};

        String query
                = " SELECT NVL(MAX(ID) + 1, 1) ID FROM          \n"
                + Database.Inventory.itemCondemMaster + "        \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    public String checkMaster(String condemId) {
        String[] columns = {"-", "ID"};

        String query
                = " SELECT NVL(MAX(ID), 0) ID FROM              \n"
                + Database.Inventory.itemCondemMaster + "       \n";
//                + "WHERE ID = " + condemId + "                  \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    public List<CondemItems> selectCondemMaster(CondemItems objSrch) {

        String[] selectColumns = {"-", "ID", "REQUEST_BY", "REQUETED_USER_NAME",
            "STORE_ID", "STORE_DESC", "ORDER_STATUS_ID", "ORDER_STATUS", "CRTD_BY",
            "CRTD_USER", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = " SELECT CM.ID, CM.REQUEST_BY,                    \n"
                + " RES.NAME REQUETED_USER_NAME,                    \n"
                + " CM.STORE_ID,                                    \n"
                + " STR.DESCRIPTION STORE_DESC,                     \n"
                + " CM.ORDER_STATUS_ID,                             \n"
                + " OSI.DESCRIPTION ORDER_STATUS,                   \n"
                + " CM.CRTD_BY,                                     \n"
                + " CRU.NAME CRTD_USER,                             \n"
                + " TO_CHAR(CM.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,   \n"
                + " CM.CRTD_TERMINAL_ID  FROM                       \n"
                + Database.Inventory.itemCondemMaster + " CM,       \n"
                + Database.DCMS.users + " RES,                      \n"
                + Database.DCMS.store + " STR,                      \n"
                + Database.DCMS.definitionTypeDetail + " OSI,       \n"
                + Database.DCMS.users + " CRU                       \n"
                + " WHERE 1=1                                       \n";
        if (objSrch.getCondemId().length() != 0) {
            query += " AND CM.ID = " + objSrch.getCondemId() + "    \n"
                    + " AND CM.ORDER_STATUS_ID = "+ Status.admissionRequest +"\n";
        }
        if (objSrch.getCondemId().length() == 0) {
            query += " AND CM.CRTD_BY = '"+objSrch.getRequestedBy()+"'\n"
                   + " AND CM.ORDER_STATUS_ID = " + objSrch.getOrderStatusId() + "\n";
        }

        query  += " AND CM.REQUEST_BY = RES.USER_NAME              \n"
                + " AND CM.STORE_ID = STR.ID                       \n"
                + " AND CM.ORDER_STATUS_ID = OSI.ID                \n"
                + " AND CM.CRTD_BY = CRU.USER_NAME                 \n"
                + " ORDER BY CM.ID                                 \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<CondemItems> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            CondemItems setCondem = new CondemItems();

            setCondem.setCondemId(map.get("ID").toString());
            setCondem.setRequestedBy(map.get("REQUEST_BY").toString());
            setCondem.setRequestedByName(map.get("REQUETED_USER_NAME").toString());
            setCondem.setStoreId(map.get("STORE_ID").toString());
            setCondem.setStoreDescription(map.get("STORE_DESC").toString());
            setCondem.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            setCondem.setOrderStatusDesc(map.get("ORDER_STATUS").toString());
            setCondem.setCrtdBy(map.get("CRTD_BY").toString());
            setCondem.setCrtdByName(map.get("CRTD_USER").toString());
            setCondem.setCrtdDate(map.get("CRTD_DATE").toString());
            setCondem.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setCondem);
        }
        return list;
    }

    public List<CondemItems> selectCondemDetail(String condemId,
            String statusId) {

        String[] selectColumns = {"-", "CONDEM_ID", "ITEM_ID", "ITEM_DESC", "STORE_ID",
            "REQUESTED_QTY", "APPROVED_QTY", "ORDER_STATUS_ID", "ORDER_STATUS",
            "REJECT_BY", "REJECT_DATE", "REJECT_TERMINAL_ID", //"REJECT_BY_NAME",
            "REJECT_REMARKS"};

        String query
                = " SELECT ICD.CONDEM_ID, ICD.ITEM_ID,                  \n"
                + " ICM.STORE_ID, ITM.DESCRIPTION ITEM_DESC,            \n"
                + " ICD.REQUESTED_QTY, NVL(ICD.APPROVED_QTY, 0) APPROVED_QTY,\n"
                + " ICD.ORDER_STATUS_ID, STS.DESCRIPTION ORDER_STATUS,  \n"
                + " NVL(ICD.REJECT_BY, ' ') REJECT_BY,                  \n"
                + " NVL(ICD.REJECT_DATE, SYSDATE) REJECT_DATE,          \n"
                + " NVL(ICD.REJECT_TERMINAL_ID, ' ') REJECT_TERMINAL_ID,\n"
                + " NVL(ICD.REJECT_REMARKS, ' ') REJECT_REMARKS   FROM  \n"
                + Database.Inventory.itemCondemMaster + " ICM,          \n"
                + Database.Inventory.itemCondemDetail + " ICD,          \n"
                + Database.DCMS.definitionTypeDetail + " STS,           \n"
                + Database.DCMS.item + " ITM                            \n"
                + " WHERE 1 = 1                                         \n";
        if (condemId.length() != 0) {
            query += " AND  ICD.CONDEM_ID =  " + condemId + "           \n";
        }
        if (statusId.length() != 0) {
            query += "  AND ICD.ORDER_STATUS_ID = " + statusId + "      \n";
        }
        query += " AND ICD.CONDEM_ID = ICM.ID                           \n"
                + " AND ICD.ITEM_ID = ITM.ID                            \n"
                + " AND ICD.ORDER_STATUS_ID = STS.ID                    \n";
//                + " AND ICD.REJECT_BY = RJB.USER_NAME                 \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<CondemItems> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            CondemItems setCondem = new CondemItems();

            setCondem.setCondemId(map.get("CONDEM_ID").toString());
            setCondem.setItemId(map.get("ITEM_ID").toString());
            setCondem.setStoreId(map.get("STORE_ID").toString());
            setCondem.setItemDescription(map.get("ITEM_DESC").toString());
            setCondem.setRequestedQuantity(map.get("REQUESTED_QTY").toString());
            setCondem.setApprovedQuantity(map.get("APPROVED_QTY").toString());
            setCondem.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            setCondem.setOrderStatusDesc(map.get("ORDER_STATUS").toString());
            setCondem.setRejectBy(map.get("REJECT_BY").toString());
//            setCondem.setRejectByName(map.get("REJECT_BY_NAME").toString());
            setCondem.setRejectDate(map.get("REJECT_DATE").toString());
            setCondem.setRejectTerminalId(map.get("REJECT_TERMINAL_ID").toString());
            setCondem.setRejectRemarks(map.get("REJECT_REMARKS").toString());
            list.add(setCondem);
        }
        return list;
    }
    
    public boolean cancelCondemItemDetail(List<CondemItems> listDlt) {
        
        boolean ret = true;
        for (int i = 0; i < listDlt.size(); i++) {
            CondemItems objDlt = listDlt.get(i);

            String query
                = " UPDATE  " + Database.Inventory.itemCondemDetail + " \n"
                + " SET ORDER_STATUS_ID =  " + Status.canceled + "      \n"
                + " WHERE CONDEM_ID =  " + objDlt.getCondemId()+ "      \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
    
    public boolean cancelCondemItemMaster(CondemItems objUpdate) {
        String query
                = " UPDATE " + Database.Inventory.itemCondemMaster + " \n"
                + " SET ORDER_STATUS_ID  = " + Status.canceled + ",    \n"
                + " ACTION_BY = '"+ Constants.userId +"',              \n"
                + " ACTION_DATE = "+ Constants.today +",               \n"
                + " ACTION_TERMINAL_ID = '"+ Constants.terminalId +"'  \n"
                + " WHERE ID =  " + objUpdate.getCondemId() + "        \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean deleteCondemDetailItem(CondemItems objDlt) {
        String query
                = " DELETE FROM  " + Database.Inventory.itemCondemDetail + "    \n"
                + " WHERE CONDEM_ID =  " + objDlt.getCondemId() + "             \n"
                + " AND ITEM_ID =  " + objDlt.getItemId() + "                   \n"
                + " AND ORDER_STATUS_ID = " + Status.admissionRequest + "       \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateCondemDetail(List<CondemItems> listUpdate) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            CondemItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.itemCondemDetail + "      \n"
                    + " SET ORDER_STATUS_ID  = '" + objUpdate.getOrderStatusId() + "',\n"
                    + " APPROVED_QTY  = '" + objUpdate.getApprovedQuantity() + "'\n"
                    + " WHERE CONDEM_ID =  " + objUpdate.getCondemId() + "      \n"
                    + " AND ITEM_ID =  " + objUpdate.getItemId() + "            \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public String checkMasterForUpdate(String condemId) {
        String[] columns = {"-", "CONDEM_ID"};

        String query
                = " SELECT NVL(CONDEM_ID, 0) CONDEM_ID FROM               \n"
                + Database.Inventory.itemCondemDetail + "                   \n"
                + "WHERE CONDEM_ID = " + condemId + "                       \n"
                + "AND ORDER_STATUS_ID = " + Status.admissionRequest + "    \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        if (list.isEmpty()) {
            return "";
        } else {
            return list.get(0).get("CONDOM_ID").toString();
        }
    }

    public boolean updateCondemMaster(CondemItems objUpdate) {
        String query
                = " UPDATE " + Database.Inventory.itemCondemMaster + "          \n"
                + " SET ORDER_STATUS_ID  = " + Status.verified + "              \n"
                + " WHERE ID =  " + objUpdate.getCondemId() + "                 \n"
                + " AND ORDER_STATUS_ID = " + Status.admissionRequest + "       \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateForRequestInMaster(CondemItems objUpdate) {
        String query
                = " UPDATE " + Database.Inventory.itemCondemMaster + "          \n"
                + " SET ORDER_STATUS_ID  = " + Status.admissionRequest + "              \n"
                + " WHERE ID =  " + objUpdate.getCondemId() + "                 \n"
                + " AND ORDER_STATUS_ID = " + Status.pending + "       \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean updateForRequestInDetail(List<CondemItems> listUpdate) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            CondemItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.itemCondemDetail + "      \n"
                    + " SET ORDER_STATUS_ID  = '" + Status.admissionRequest + "',       \n"
                    + " REJECT_REMARKS  = '" + objUpdate.getRejectRemarks() + "'\n"
                    + " WHERE CONDEM_ID =  " + objUpdate.getCondemId() + "      \n"
                    + " AND ITEM_ID =  " + objUpdate.getItemId() + "            \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
    
    public boolean updateRejectRequest(List<CondemItems> listUpdate) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            CondemItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.itemCondemDetail + "      \n"
                    + " SET ORDER_STATUS_ID  = '" + Status.rejected + "',       \n"
                    + " REJECT_DATE  = " + Constants.today + ",                 \n"
                    + " REJECT_BY  = '" + Constants.userId + "',                \n"
                    + " REJECT_TERMINAL_ID  = '" + Constants.terminalId + "',   \n"
                    + " REJECT_REMARKS  = '" + objUpdate.getRejectRemarks() + "'\n"
                    + " WHERE CONDEM_ID =  " + objUpdate.getCondemId() + "      \n"
                    + " AND ITEM_ID =  " + objUpdate.getItemId() + "            \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean updateStoreStock(List<CondemItems> listUpdate, String lessStoreId,
            String isRequseted) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            CondemItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.storeWiseItems + " SWI    \n";
            if (isRequseted.length() != 0) {
                query += " SET SWI.QTY = SWI.QTY - "
                        + objUpdate.getRequestedQuantity() + " \n";
            } else {
                query += " SET SWI.QTY = SWI.QTY - "
                        + objUpdate.getApprovedQuantity() + " \n";
            }

            query += " WHERE SWI.STORE_ID =  " + lessStoreId + "   \n"
                    + " AND SWI.ITEM_ID =  " + objUpdate.getItemId() + "        \n";
            System.out.println("LESS STORE UPDATE,,/,//./....");
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean updateForAddStock(List<CondemItems> listUpdate,
            String addStoreId, String isRequseted) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            CondemItems objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.Inventory.storeWiseItems + " SWI \n";
            if (isRequseted.length() != 0) {
                query += " SET SWI.QTY = SWI.QTY + "
                        + objUpdate.getRequestedQuantity() + "          \n";
            } else {
                query += " SET SWI.QTY = SWI.QTY + "
                        + objUpdate.getApprovedQuantity() + "           \n";
            }
            query += " WHERE SWI.STORE_ID =  " + addStoreId + "         \n"
                    + " AND SWI.ITEM_ID =  " + objUpdate.getItemId() + "\n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean insertItemLedger(List<CondemItems> listSave) {

        String[] columns = {Database.Inventory.itemLedger, "SERIAL",
            "TRANSACTION_TYPE_ID", "TRANSACTION_NO", "ITEM_ID", "STORE_ID",
            "QTY_IN", "QTY_OUT", "VALUE_IN", "VALUE_OUT", "COST", "TOTAL_QTY",
            "TOTAL_VALUE", "REF_STORE_ID", "BATCH_NO", "EXPIRY_DATE", "CRTD_DATE",
            "CRTD_BY", "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listSave.size(); i++) {
            CondemItems objSave = listSave.get(i);
            HashMap insertFormAttach = new HashMap();
            insertFormAttach.put("SERIAL", "(SELECT MAX(SERIAL) + 1 FROM "
                    + Database.Inventory.itemLedger + ")");
            insertFormAttach.put("TRANSACTION_TYPE_ID", "3006");
            insertFormAttach.put("TRANSACTION_NO", "'12345'");
            insertFormAttach.put("ITEM_ID", "'" + objSave.getItemId() + "'");
            insertFormAttach.put("STORE_ID", "'" + objSave.getStoreId() + "'");
            insertFormAttach.put("QTY_IN", "'" + objSave.getRequestedQuantity() + "'");
            insertFormAttach.put("QTY_OUT", "'" + objSave.getApprovedQuantity() + "'");
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
        System.out.println("ITM LEDGER UPDATE,,/,//./....");
        return Constants.dao.insertData(lstInr, columns);
    }
}
