/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Handler;

import Inventory.BO.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Status;

/**
 *
 * @author Mission
 */
public class POFInventoryPurchaseHandler {

    public List<Item> selectItemSearch(String itmDesc, String itmNo, String veri) {

        String cols[] = {"-", "ITEM_ID", "ITEM_DESCRIPTION", "CATEGORY",
            "ACTIVE", "FORMULARY", "REF_ITEM_ID", "FORMULARY"};

        String query = " SELECT ITM.ID  ITEM_ID ,ITM.DESCRIPTION  ITEM_DESCRIPTION,  \n"
                + " ITM.ACTIVE,ITM.FORMULARY, CAT.DESCRIPTION CATEGORY,      \n"
                + " ITM.REF_ITEM_ID  REF_ITEM_ID                         \n"
                + " FROM  " + Database.DCMS.item + " ITM,                   \n"
                + Database.DCMS.definitionTypeDetail + " CAT              \n"
                + " WHERE ITM.ACTIVE = 'Y'                                  \n"
                + " AND ITM.CATEGORY_ID = CAT.ID                            \n";

        if (!itmDesc.equalsIgnoreCase("")) {
            query += " AND UPPER(ITM.DESCRIPTION) LIKE UPPER('%" + itmDesc + "%')   \n";
        }

        if (!itmNo.equalsIgnoreCase("")) {
            query += "AND ITM.ID = '" + itmNo + "'              \n";
        }

        if (veri.equalsIgnoreCase("N")) {
            query += "AND ITM.REF_ITEM_ID = '0'              \n";
        }

        if (veri.equalsIgnoreCase("Y")) {
            query += "AND ITM.REF_ITEM_ID != '0'              \n";
        }

        query += " ORDER BY ITM.ID                                  \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);
        List<Item> lisVerRep = new ArrayList<>();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            Item objData = new Item();
            objData.setId(map.get("ITEM_ID").toString());
            objData.setDescription(map.get("ITEM_DESCRIPTION").toString());
            objData.setCategoryDescription(map.get("CATEGORY").toString());
            objData.setActive(map.get("ACTIVE").toString());
            objData.setIsFormulary(map.get("FORMULARY").toString());
            objData.setRefItemId(map.get("REF_ITEM_ID").toString());
            objData.setFormulary(map.get("FORMULARY").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public List<Item> selectFolicSearch(String folicSearchId, String folicItemNo,
            String sts) {

        String cols[] = {"-", "ITM_FOLIO", "ITM_NOMEN1",
            "HMIS_ITEM_ID"};

        String query = "  SELECT ITM_FOLIO   ,ITM_NOMEN1,       \n"
                + " HMIS_ITEM_ID                                \n"
                + "FROM  " + Database.Inventory.folicItem + " FITM    \n"
                + "WHERE ITM_PRO = 'Y'                      \n";

        if (!folicSearchId.equalsIgnoreCase("")) {
            query += " AND UPPER(FITM.ITM_FOLIO) LIKE UPPER('%" + folicSearchId + "%')   \n";
        }

        if (!folicItemNo.equalsIgnoreCase("")) {
            query += "AND FITM.ITM_FOLIO = '" + folicItemNo + "'              \n";
        }

        if (sts.equalsIgnoreCase("N")) {
            //sts = "0";
            query += "AND FITM.HMIS_ITEM_ID = 0              \n";
        }
        if (sts.equalsIgnoreCase("Y")) {
            //sts = "0";
            query += "AND FITM.HMIS_ITEM_ID != 0              \n";
        }

        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);
        List<Item> listRep = new ArrayList<>();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            Item objfol = new Item();
            objfol.setRefItemId(map.get("ITM_FOLIO").toString());
            objfol.setFolicItemDesc(map.get("ITM_NOMEN1").toString());
            objfol.setId(map.get("HMIS_ITEM_ID").toString());
            listRep.add(objfol);
        }
        return listRep;
    }

    public boolean updateItem(Item updatefolic) {

        String query
                = " UPDATE " + Database.DCMS.item + "\n SET "
                + " REF_ITEM_ID = '" + updatefolic.getRefItemId().trim() + "'\n"
                + " WHERE  ID  = '" + updatefolic.getId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }

    public Item selectPOFItemSearch(String refItemId) {

        String cols[] = {"-", "ITM_FOLIO", "ITM_STOCK", "ITM_NOMEN1"};

        String query = " SELECT                             \n"
                + " NVL(ITM_FOLIO, ' ') ITM_FOLIO,          \n"
                + " ITM_STOCK,                              \n"
                + " ITM_NOMEN1                              \n"
                + " FROM  " + Database.Inventory.folicItem + " FLC           \n"
                + " WHERE FLC.ITM_FOLIO = '" + refItemId + "'                \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);
        if (listmap.isEmpty()) {
            return null;
        }
        HashMap map = (HashMap) listmap.get(0);
        Item objData = new Item();
        objData.setRefItemId(map.get("ITM_FOLIO").toString());
        objData.setFolicItemStock(map.get("ITM_STOCK").toString());
        objData.setFolicItemDesc(map.get("ITM_NOMEN1").toString());
        return objData;
    }

    public boolean updatePofTable(Item updatefolic) {

        String query
                = " UPDATE " + Database.Inventory.folicItem + "\n SET "
                + " HMIS_ITEM_ID = '" + updatefolic.getId().trim() + "'\n"
                + " WHERE  ITM_FOLIO  = '" + updatefolic.getRefItemId() + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public List<Item> selectforUpdateQuantity() {

        String cols[] = {"-", "DIS_FOLIO", "DIS_RECEIVED"};

        String query = " SELECT DIS_FOLIO, DIS_RECEIVED FROM            \n"
                + Database.Inventory.purchaseAcceptedFolio + "          \n"
                + " WHERE TRANSFER = 'N'                                \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);

        List<Item> list = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            Item objData = new Item();
            objData.setRefItemId(map.get("DIS_FOLIO").toString());
            objData.setQuantity(map.get("DIS_RECEIVED").toString());
            list.add(objData);
        }
        return list;
    }

    public boolean updateStatusInPOAceptFolio(Item updatefolic) {

        String query
                = " UPDATE " + Database.Inventory.purchaseAcceptedFolio + "\n SET "
                + " TRANSFER = 'Y' \n"
                + " WHERE DIS_FOLIO = '" + updatefolic.getRefItemId() + "'\n"
                + " AND DIS_RECEIVED = " + updatefolic.getQuantity() + "\n";
        return Constants.dao.executeUpdate(query, false);
    }

    public String selectHMISItemId(String refId) {
        String[] columns = {"-", "ID"};
        String query = " SELECT ID FROM             \n"
                + Database.DCMS.item + "            \n"
                + " WHERE REF_ITEM_ID = " + refId + "\n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Update the Folio Id = "
                    + refId + ".\nPrior to Update the Quantity.");
        }
        return list.get(0).get("ID").toString();
    }

    public boolean updateQtySWI(Item updatefolic) {

        String query
                = " UPDATE " + Database.Inventory.storeWiseItems + "\n SET "
                + " QTY = QTY + " + updatefolic.getQuantity().trim() + " \n"
                + " WHERE STORE_ID = " + updatefolic.getStoreId() + "\n"
                + " AND ITEM_ID  = '" + updatefolic.getId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateQtySWIDetail(Item updatefolic) {

        String query
                = " UPDATE " + Database.Inventory.storeWiseItemDetail + "\n SET "
                + " QTY = QTY + " + updatefolic.getQuantity().trim() + " \n"
                + " WHERE STORE_ID = " + updatefolic.getStoreId() + "\n"
                + " AND ITEM_ID  = '" + updatefolic.getId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertStoreItemHistory(Item itm) {

        String[] columns = {Database.Inventory.storeWiseItemsHistory, "STORE_ID",
            "ITEM_ID", "QTY", "ACTIVE", "UPTD_BY", "UPTD_DATE", "UPTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("STORE_ID", "'" + itm.getStoreId() + "'");
        map.put("ITEM_ID", "'" + itm.getId() + "'");
        map.put("QTY", "'" + itm.getQuantity() + "'");
        map.put("ACTIVE", "'Y'");
        map.put("UPTD_BY", "'" + Constants.userId + "'");
        map.put("UPTD_DATE", Constants.today);
        map.put("UPTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    GenerateKeys key = new GenerateKeys();

    public boolean insertItemLedger(Item item) {

        String[] columns = {Database.Inventory.itemLedger, "SERIAL",
            "TRANSACTION_TYPE_ID", "TRANSACTION_NO", "ITEM_ID", "STORE_ID",
            "QTY_IN", "QTY_OUT", "VALUE_IN", "VALUE_OUT", "COST", "CRTD_BY",
            "CRTD_TERMINAL_ID"};
        List vec = new ArrayList();

        HashMap in = new HashMap();
        in.put("SERIAL", "" + key.generatePrimaryKey(Keys.itemLedger, false));
        in.put("TRANSACTION_NO", "001");
        in.put("TRANSACTION_TYPE_ID", "'" + Status.ledgerIn + "'");
        in.put("ITEM_ID", "" + item.getId());
        in.put("STORE_ID", "" + item.getStoreId());
        in.put("QTY_IN", "" + item.getQuantity());
        in.put("QTY_OUT", "" + 0);
        in.put("VALUE_IN", "" + item.getQuantity());
        in.put("VALUE_OUT", "" + 0);
        in.put("REF_STORE_ID", "" + item.getStoreId());
        in.put("COST", "0");
        in.put("CRTD_BY", "'" + Constants.userId + "'");
        in.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        vec.add(in);

        return Constants.dao.insertData(vec, columns);
    }

    public boolean insertPOFItemUpdateHistory(Item itm) {

        String[] columns = {Database.Inventory.POFItemUpdateHistory, "STORE_ID",
            "ITEM_ID", "REF_ITEM_ID", "QTY", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        HashMap map = new HashMap();
        map.put("STORE_ID", "'" + itm.getStoreId() + "'");
        map.put("ITEM_ID", "'" + itm.getId() + "'");
        map.put("REF_ITEM_ID", "'" + itm.getRefItemId() + "'");
        map.put("QTY", "'" + itm.getQuantity() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        lstInr.add(map);

        return Constants.dao.insertData(lstInr, columns);
    }

    public List<Item> selectPOFItemUpdateHistory() {

        String cols[] = {"-", "ITEM_ID", "DESCRIPTION", "REF_ITEM_ID", "STORE_ID",
            "QTY", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query = " SELECT IUH.ITEM_ID, ITM.DESCRIPTION, IUH.REF_ITEM_ID,  \n"
                + " IUH.STORE_ID, IUH.QTY, IUH.CRTD_BY,                 \n"
                + " TO_CHAR(IUH.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,      \n"
                + " IUH.CRTD_TERMINAL_ID                                \n"
                + " FROM  " + Database.Inventory.POFItemUpdateHistory + " IUH,\n"
                + Database.DCMS.item + " ITM                            \n"
                + " WHERE VIEWED = 'N'                                  \n"
                + " AND IUH.ITEM_ID = ITM.ID                            \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);

        List<Item> list = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            Item objData = new Item();
            objData.setId(map.get("ITEM_ID").toString());
            objData.setDescription(map.get("DESCRIPTION").toString());
            objData.setRefItemId(map.get("REF_ITEM_ID").toString());
            objData.setStoreId(map.get("STORE_ID").toString());
            objData.setQuantity(map.get("QTY").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminal(map.get("CRTD_TERMINAL_ID").toString());
            list.add(objData);
        }
        return list;
    }

    public boolean updatePOFItemUpdateHistory(List<Item> listItem) {
        boolean ret = true;

        for (int i = 0; i < listItem.size(); i++) {
            Item itm = listItem.get(i);

            String query
                    = " UPDATE " + Database.Inventory.POFItemUpdateHistory + "\n"
                    + " SET VIEWED  = 'Y'                       \n"
                    + " WHERE ITEM_ID = '" + itm.getId() + "'   \n"
                    + " AND VIEWED  = 'N'                       \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
}
