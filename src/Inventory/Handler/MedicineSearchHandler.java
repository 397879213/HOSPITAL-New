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
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class MedicineSearchHandler {

    public List<Item> searchCondemMaster(Item objSrch) {

        String[] selectColumns = {"-", "ID", "ITEM_NAME", "ITEM_TYPE_ID",
            "ITEM_TYPE_DESC", "GENERIC_ID", "GENERIC_DESCRIPTION", 
            "STRENGTH", "FORMULARY", "GROUP_ID", "GROUP_DESCRIPTION"};

        String query
                = "SELECT ITM.ID,\n"
                + "       ITM.DESCRIPTION ITEM_NAME,\n"
                + "       ITM.ITEM_TYPE_ID,\n"
                + "       ITT.DESCRIPTION  ITEM_TYPE_DESC,\n"
                + "       ITM.GENERIC_ID,\n"
                + "       GEN.DESCRIPTION  GENERIC_DESCRIPTION,\n"
                + "       ITM.STRENGTH,\n"
                + "       ITM.FORMULARY,\n"
                + "       ITM.GROUP_ID,\n"
                + "       ITG.DESCRIPTION GROUP_DESCRIPTION  FROM\n"
                + Database.DCMS.item + " ITM,\n"
                + Database.DCMS.definitionTypeDetail + " ITT,\n"
                + Database.DCMS.definitionTypeDetail + " GEN,\n"
                + Database.DCMS.definitionTypeDetail + " ITG\n"
                + " WHERE 1 = 1                             \n";
        if (objSrch.getId().length() != 0) {
            query += " AND ITM.ID = " + objSrch.getId() + "    \n";
        }
        if (objSrch.getIsFormulary().length() != 0) {
            query += " AND CM.STORE_ID = '" + objSrch.getIsFormulary() + "'\n";
        }
        if (objSrch.getGenericId().length() != 0) {
            query += " AND CM.STORE_ID = '" + objSrch.getGenericId() + "'\n";
        }
        if (objSrch.getItemTypeId().length() != 0) {
            query += " AND CM.STORE_ID = '" + objSrch.getItemTypeId() + "'\n";
        }
        query += "   AND ITM.ITEM_TYPE_ID = ITT.ID\n"
                + "   AND ITM.GENERIC_ID = GEN.ID\n"
                + "   AND ITM.GROUP_ID = ITG.ID";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<Item> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            Item setCondem = new Item();
            
            setCondem.setId(map.get("ID").toString());
            setCondem.setDescription(map.get("ITEM_NAME").toString());
            setCondem.setItemTypeId(map.get("ITEM_TYPE_ID").toString());
            setCondem.setItemTypeDescription(map.get("ITEM_TYPE_DESC").toString());
            setCondem.setGenericId(map.get("GENERIC_ID").toString());
            setCondem.setGenericDescription(map.get("GENERIC_DESCRIPTION").toString());
            setCondem.setStrength(map.get("STRENGTH").toString());
            setCondem.setFormulary(map.get("FORMULARY").toString());
            setCondem.setGroupId(map.get("GROUP_ID").toString());
            setCondem.setGroupDescription(map.get("GROUP_DESCRIPTION").toString());
            list.add(setCondem);
        }
        return list;
    }
}
