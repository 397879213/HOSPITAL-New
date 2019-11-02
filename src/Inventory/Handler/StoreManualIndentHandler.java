package Inventory.Handler;

//import Inventory.BO.IssueNoteDetail;
//import Inventory.BO.IssueNoteMaster;
import Inventory.BO.StoreManualIndent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Status;

public class StoreManualIndentHandler {

    public boolean insertManualIndentMaster(StoreManualIndent obj) {
        String[] columns = {Database.Inventory.issueRequestMaster, "ISSUE_REQUEST_NO",
            "CLOSING_DATE", "STATUS", "FROM_STORE_ID", "TO_STORE_ID", "INDENT_TYPE",
            "INDENT_MONTH", "REMARKS", "CRTD_BY", "CRTD_TERMINAL_ID", "CRTD_DATE",
            "REQUEST_TYPE"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();
        map.put("ISSUE_REQUEST_NO", "(SELECT NVL(MAX(ISSUE_REQUEST_NO)+1, 1) FROM "
                + Database.Inventory.issueRequestMaster + ")");
        System.err.println(" \n Reqq\n " + obj.getRequestTypeId());
        map.put("REQUEST_TYPE", "'" + obj.getRequestTypeId() + "'");
        map.put("CLOSING_DATE", "TO_DATE('"
                + obj.getIndentClosingDate().toUpperCase() + "', 'DD-MON-YYYY') ");
        map.put("STATUS", "'" + obj.getOrderStatusId() + "'");
        map.put("FROM_STORE_ID", "'" + obj.getFromStoreId() + "'");
        map.put("TO_STORE_ID", "'" + obj.getToStoreId() + "'");
        map.put("INDENT_TYPE", "'" + obj.getIndenType() + "'");
        map.put("INDENT_MONTH", "'" + obj.getIndentMonth() + "'");
        map.put("REMARKS", "'" + obj.getRemarks() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public boolean insertIssueRequestHistory(List<StoreManualIndent> list) {

        String[] columns = {Database.DCMS.indentRequestEditHist, "INDENT_NO",
            "ITEM_ID", "APPROVED_QTY", "REQUESTED_QTY", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            StoreManualIndent obj = list.get(i);
            HashMap map = new HashMap();
            map.put("INDENT_NO", obj.getManualIndentId());
            map.put("ITEM_ID", "'" + obj.getItemId() + "'");
            map.put("APPROVED_QTY", "'" + obj.getApprovedQty() + "'");
            map.put("REQUESTED_QTY", "'" + obj.getRequiredQty() + "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_DATE", Constants.today);
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean insertIssueRequestDetail(List<StoreManualIndent> list) {

        String[] columns = {Database.Inventory.issueRequestDetail,
            "ISSUE_REQUEST_NO", "SERIAL_NO", "ITEM_ID", "QTY", "RCV_QTY", "ID",
            "REQUESTED_QTY", "CLOSING_QTY",};

        List lstInr = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            StoreManualIndent obj = list.get(i);
            HashMap map = new HashMap();
            map.put("ISSUE_REQUEST_NO", obj.getManualIndentId());
            map.put("SERIAL_NO", "'" + (i + 1) + "'");
            map.put("ITEM_ID", "'" + obj.getApprovedQty() + "'");
            map.put("QTY", "'" + obj.getApprovedQty() + "'");
            map.put("RCV_QTY", "'" + obj.getApprovedQty() + "'");
            map.put("ID", "(SELECT MAX(ID)+1 FROM "
                    + Database.Inventory.issueRequestDetail + ")");
            map.put("REQUESTED_QTY", "'" + obj.getRequiredQty() + "'");
            map.put("CLOSING_QTY", "'" + obj.getRequiredQty() + "'");

            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

    public StoreManualIndent selectManualIndentMaster() {

        String[] selectColumns = {"-", "ID", "CLOSING_DATE", "STATUS",
            "STATUS_DESC", "INDENT_TYPE", "TO_STORE_ID", "INDENT_MONTH", "REMARKS",
            "CRTD_BY", "CRTD_TERMINAL_ID", "CRTD_DATE", "TO_STORE_NAME", "CRTD_USER",
            "FROM_STORE_NAME", "FROM_STORE_ID", "CLOSING_DAY", "REQUEST_TYPE_DESC",
            "REQUEST_TYPE"};

        String query
                = " SELECT MIM.ISSUE_REQUEST_NO ID,                         \n"
                + " MIM.STATUS,STS.DESCRIPTION STATUS_DESC,                 \n"
                + " FSI.DESCRIPTION FROM_STORE_NAME, MIM.FROM_STORE_ID,     \n"
                + " TSI.DESCRIPTION TO_STORE_NAME, MIM.TO_STORE_ID,         \n"
                + " TO_CHAR(MIM.CLOSING_DATE, 'DD-MON-YYYY') CLOSING_DATE,  \n"
                + " ROUND(MIM.CLOSING_DATE - (SYSDATE +1)) CLOSING_DAY,     \n"
                + " MIM.REQUEST_TYPE,                                       \n"
                + " IRQ.DESCRIPTION REQUEST_TYPE_DESC,                      \n"
                + " MIM.INDENT_TYPE,                                        \n"
                + " MIM.TO_STORE_ID,                                        \n"
                + " MIM.INDENT_MONTH,                                       \n"
                + " NVL(MIM.REMARKS, ' ') REMARKS,                          \n"
                + " MIM.CRTD_BY, USR.NAME CRTD_USER,                        \n"
                + " TO_CHAR(MIM.CRTD_DATE, 'DD-MON-YYYY') CRTD_DATE,        \n"
                + " MIM.CRTD_TERMINAL_ID  FROM                              \n"
                + Database.Inventory.issueRequestMaster + " MIM,            \n"
                + Database.DCMS.store + " TSI,                              \n"
                + Database.DCMS.store + " FSI,                              \n"
                + Database.DCMS.users + " USR,                              \n"
                + Database.DCMS.definitionTypeDetail + " STS,               \n"
                + Database.DCMS.definitionTypeDetail + " IRQ                \n"
                + " WHERE MIM.FROM_STORE_ID = '" + Constants.storeId + "'   \n"
                + " AND MIM.CRTD_BY = '" + Constants.userId + "'              \n"
                + " AND MIM.STATUS = '" + Status.entered + "'               \n"
                + " AND MIM.FROM_STORE_ID = FSI.ID                          \n"
                + " AND MIM.TO_STORE_ID = TSI.ID                            \n"
                + " AND MIM.CRTD_BY = USR.USER_NAME                         \n"
                + " AND MIM.STATUS = STS.ID                                 \n"
                + " AND MIM.REQUEST_TYPE = IRQ.ID                           \n"
                + " ORDER BY MIM.CRTD_DATE                                  \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, selectColumns);
        if (list.isEmpty()) {
            return null;
        }

        HashMap map = list.get(0);
        StoreManualIndent indent = new StoreManualIndent();
        indent.setManualIndentId(map.get("ID").toString());
        indent.setManualBookIndentDate(map.get("CLOSING_DATE").toString());
        indent.setIndenType(map.get("INDENT_TYPE").toString());
        indent.setIndentMonth(map.get("INDENT_MONTH").toString());
        indent.setToStoreId(map.get("TO_STORE_ID").toString());
        indent.setToStoreName(map.get("TO_STORE_NAME").toString());
        indent.setFromStoreId(map.get("FROM_STORE_ID").toString());
        indent.setFromStoreName(map.get("FROM_STORE_NAME").toString());
        indent.setOrderStatusId(map.get("STATUS").toString());
        indent.setOrderStatus(map.get("STATUS_DESC").toString());
        indent.setRemarks(map.get("REMARKS").toString());
        indent.setCrtdBy(map.get("CRTD_BY").toString());
        indent.setCrtdByName(map.get("CRTD_USER").toString());
        indent.setCrtdDate(map.get("CRTD_DATE").toString());
        indent.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
        indent.setClosingDay(map.get("CLOSING_DAY").toString());
        indent.setRequestTypeId(map.get("REQUEST_TYPE").toString());
        indent.setRequestTypeDesc(map.get("REQUEST_TYPE_DESC").toString());
        return indent;
    }

    public List<StoreManualIndent> selectManualIndentDetail(String manualIndentId) {

        String[] cols = {"-", "ISSUE_REQUEST_NO", "ITEM_ID", "ITEM_NAME", "STATUS",
            "OPENING_BALANCE", "CLOSING_QTY", "REQUESTED_QTY", "RCV_QTY"}; //"CONSUMED_QTY",

        String query = "SELECT MID.ISSUE_REQUEST_NO, MID.ITEM_ID,MIM.STATUS,\n"
                + " ITM.DESCRIPTION ITEM_NAME, MID.CLOSING_QTY OPENING_BALANCE,\n"
                + "  MID.CLOSING_QTY, MID.REQUESTED_QTY, MID.RCV_QTY  FROM  \n"
                + Database.Inventory.issueRequestDetail + " MID,    \n"
                + Database.Inventory.issueRequestMaster + " MIM,    \n"
                + Database.DCMS.item + " ITM                        \n"
                + " WHERE MID.ISSUE_REQUEST_NO = " + manualIndentId + "\n"
                + " AND MID.ISSUE_REQUEST_NO = MIM.ISSUE_REQUEST_NO \n"
                + " AND MID.ITEM_ID = ITM.ID                        \n"
                + " ORDER BY ITM.DESCRIPTION                        \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);

        List<StoreManualIndent> listItems = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);

            StoreManualIndent setItems = new StoreManualIndent();
            setItems.setManualIndentId(map.get("ISSUE_REQUEST_NO").toString());
            setItems.setItemId(map.get("ITEM_ID").toString());
            setItems.setItemDescription(map.get("ITEM_NAME").toString());
            setItems.setOrderStatusId(map.get("STATUS").toString());
            setItems.setOpeningBalance(map.get("OPENING_BALANCE").toString());
            setItems.setConsumedQty("0");
            setItems.setClosingBalance(map.get("CLOSING_QTY").toString());
            setItems.setRequiredQty(map.get("REQUESTED_QTY").toString());
            if (setItems.getOrderStatusId().equalsIgnoreCase(Status.entered)) {
                setItems.setApprovedQty(map.get("REQUESTED_QTY").toString());
            } else {
                setItems.setApprovedQty(map.get("RCV_QTY").toString());
            }
            listItems.add(setItems);
        }
        return listItems;
    }

    public List<StoreManualIndent> selectCCItems(String itemType) {

        String[] cols = {"-", "ITEM_ID", "ITEM_NAME", "OPENING_BALANCE",
            "CLOSING_QTY", "REQUESTED_QTY", "RCV_QTY", "CONSUMED_QTY"};

        String query
                = "SELECT CI.ITEM_ID,               \n"
                + "       ITM.DESCRIPTION ITEM_NAME,\n"
                + "       '0' OPENING_BALANCE,      \n"
                + "       '0' CONSUMED_QTY,         \n"
                + "       '0' CLOSING_QTY,          \n"
                + "       '0' REQUESTED_QTY,        \n"
                + "       '0' RCV_QTY               \n"
                + "  FROM                           \n"
                + Database.DCMS.item + " ITM,       \n"
                + Database.Inventory.ccItemConfiguration + " CI \n"
                + " WHERE CI.ITEM_TYPE = '" + itemType + "'\n"
                + "   AND ITM.ID = CI.ITEM_ID       \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);

        List<StoreManualIndent> listItems = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);

            StoreManualIndent setItems = new StoreManualIndent();
            setItems.setItemId(map.get("ITEM_ID").toString());
            setItems.setItemDescription(map.get("ITEM_NAME").toString());
            setItems.setOpeningBalance(map.get("OPENING_BALANCE").toString());
            setItems.setClosingBalance(map.get("CLOSING_QTY").toString());
            setItems.setRequiredQty(map.get("REQUESTED_QTY").toString());
            setItems.setApprovedQty(map.get("REQUESTED_QTY").toString());
            setItems.setConsumedQty(map.get("CONSUMED_QTY").toString());
            setItems.setApprovedQty(map.get("RCV_QTY").toString());
            listItems.add(setItems);
        }
        return listItems;
    }

    public boolean UpdateItemQtyDetail(List<StoreManualIndent> listUpdt) {

        boolean ret = true;
        for (int i = 0; i < listUpdt.size(); i++) {
            StoreManualIndent objUpdt = listUpdt.get(i);

            String query
                    = " UPDATE  " + Database.Inventory.issueRequestDetail + "\n"
                    //                    + "  OPENING_BALANCE =  " + objUpdt.getOpeningBalance() + ",\n"
                    //                    + " CONSUMED_QTY =  " + objUpdt.getConsumedQty() + ",  \n"
                    + " SET CLOSING_QTY =  " + objUpdt.getClosingBalance() + ",\n"
                    + " REQUESTED_QTY =  " + objUpdt.getRequiredQty() + ",  \n"
                    + " RCV_QTY =  " + objUpdt.getApprovedQty() + "   \n"
                    + " WHERE ISSUE_REQUEST_NO =  " + objUpdt.getManualIndentId() + "\n"
                    + " AND ITEM_ID = '" + objUpdt.getItemId() + "'        \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean updateIndentStatus(String indentId, String status) {
        String query
                = " UPDATE " + Database.Inventory.issueRequestMaster + "\n"
                + " SET STATUS = " + status + "               \n"
                + " WHERE ISSUE_REQUEST_NO = " + indentId + " \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public StoreManualIndent checkManualBookIndentNo(String indentNo,
            String indentId) {

        String[] selectColumns = {"-", "USER_NAME", "MANUAL_INDENT_NO",
            "CRTD_DATE", "STORE_NAME"};

        String query
                = " SELECT MIM.MANUAL_INDENT_NO, CRU.NAME USER_NAME,    \n"
                + " NVL(STR.DESCRIPTION, ' ') STORE_NAME,               \n"
                + " TO_CHAR(MANUAL_INDENT_DATE, 'DD-MON-YY')CRTD_DATE   \n"
                + " FROM                                                \n"
                + Database.Inventory.manualIndentMaster + " MIM,        \n"
                + Database.DCMS.store + " STR,                          \n"
                + Database.DCMS.users + " CRU                           \n"
                + " WHERE MIM.MANUAL_INDENT_NO = '" + indentNo + "'     \n"
                + " AND MIM.TO_STORE_ID = STR.ID                        \n"
                + " AND MIM.CRTD_BY = CRU.USER_NAME                     \n";

        if (indentId.trim().length() != 0) {
            query += " AND MIM.ID != " + indentId + "                    \n";
        }
        List<HashMap> list = Constants.dao.selectDatainList(query, selectColumns);
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = list.get(0);
        StoreManualIndent indent = new StoreManualIndent();
        indent.setCrtdByName(map.get("USER_NAME").toString());
        indent.setManualBookIndentNo(map.get("MANUAL_INDENT_NO").toString());
        indent.setManualBookIndentDate(map.get("CRTD_DATE").toString());
        indent.setToStoreName(map.get("STORE_NAME").toString());
        return indent;
    }

    public String selectManualIndentMasterId() {
        String[] columns = {"-", "ID"};
        String query = " SELECT NVL(MAX(ID) + 1, 1) ID FROM     \n"
                + Database.Inventory.manualIndentMaster + "     \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    GenerateKeys key = new GenerateKeys();

    public boolean insertItemLedger(StoreManualIndent indent,
            StoreManualIndent item) {

        String[] columns = {Database.Inventory.itemLedgers, "SERIAL",
            "TRANSACTION_TYPE_ID", "TRANSACTION_NO", "ITEM_ID", "STORE_ID",
            "QTY_IN", "QTY_OUT", "VALUE_IN", "VALUE_OUT", "COST", "CRTD_BY",
            "CRTD_TERMINAL_ID", "REF_STORE_ID"};
        List vec = new ArrayList();

        HashMap out = new HashMap();
        out.put("SERIAL", "" + key.generatePrimaryKey(Keys.itemLedger, false));
        out.put("TRANSACTION_NO", "" + indent.getManualIndentId());
        out.put("TRANSACTION_TYPE_ID", "'" + Status.ledgerOut + "'");
        out.put("ITEM_ID", "" + item.getItemId());
        out.put("STORE_ID", "" + indent.getFromStoreId());
        out.put("QTY_IN", "" + 0);
        out.put("QTY_OUT", "" + item.getQuantity());
        out.put("VALUE_IN", "" + 0);
        out.put("REF_STORE_ID", "" + indent.getToStoreId());
        out.put("VALUE_OUT", "" + indent.getValue()
                * Integer.parseInt(item.getQuantity()));
        out.put("COST", "" + item.getValue());
        out.put("CRTD_BY", "'" + Constants.userId + "'");
        out.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        vec.add(out);

        HashMap in = new HashMap();
        in.put("SERIAL", "" + key.generatePrimaryKey(Keys.itemLedger, false));
        in.put("TRANSACTION_NO", "" + indent.getManualIndentId());
        in.put("TRANSACTION_TYPE_ID", "'" + Status.ledgerIn + "'");
        in.put("ITEM_ID", "" + item.getItemId());
        in.put("STORE_ID", "" + indent.getToStoreId());
        in.put("QTY_IN", "" + item.getQuantity());
        in.put("QTY_OUT", "" + 0);
        in.put("VALUE_IN", "" + indent.getValue()
                * Integer.parseInt(item.getQuantity()));
        in.put("VALUE_OUT", "" + 0);
        in.put("REF_STORE_ID", "" + indent.getFromStoreId());
        in.put("COST", "" + item.getValue());
        in.put("CRTD_BY", "'" + Constants.userId + "'");
        in.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        vec.add(in);

        return Constants.dao.insertData(vec, columns);
    }

    public boolean cancelIndent(StoreManualIndent indent) {
        String query
                = " UPDATE " + Database.Inventory.manualIndentMaster + "\n"
                + " SET STATUS_ID = " + Status.canceled + "               \n"
                + " WHERE ID = " + indent.getManualIndentId() + "       \n";

        return Constants.dao.executeUpdate(query, false);
    }
}
