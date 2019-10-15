/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Inventory;

import BMT.BO.CompoundingBO;
import BO.Inventory.PartyTenderItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Talha Khan
 */
public class PartyTenderItemsHandler {
    
    public List<PartyTenderItems> selectTenderWiseParty(String tenderId,
            String partyId) {

        String[] selectColumns = {"-", "ID", "DESCRIPTION", "PHONE_NO"};

        String query
                = " SELECT PRT.ID, PRT.DESCRIPTION, PRT.PHONE_NO         \n"
                + "FROM " + Database.Inventory.party + " PRT,             \n"
                + Database.Inventory.tenderWiseParties + " TWP           \n"
                + " WHERE TWP.TENDER_ID = '" + tenderId + "'             \n";
                if(partyId.length() != 0){
                    query += " AND PRT.ID = '" + partyId + "'            \n";
                }
                query += " AND PRT.ID = TWP.PARTY_ID                     \n"
                + " AND PRT.ACTIVE = 'Y'                                 \n"
                + " ORDER BY PRT.ID                                      \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PartyTenderItems> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PartyTenderItems setCompound = new PartyTenderItems();

            setCompound.setPartyId(map.get("ID").toString());
            setCompound.setPartyName(map.get("DESCRIPTION").toString());
            setCompound.setPartyContactNo(map.get("PHONE_NO").toString());
            list.add(setCompound);
        }
        return list;
    }
    
    public List<PartyTenderItems> selectPartyWiseItems(String tenderId, String partyId,
            String itemId) {

        String[] selectColumns = {"-", "ID", "DESCRIPTION", "TENDER_ID", "PARTY_ID",
        "TENDER_ITEM_ID", "PRICE", "MANUFACTURER_ID", "ORIGIN_ID", "PACK_SIZE",
        "MOH", "UNIT", "AU", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID",
        "MANUFACTURER", "USER_NAME"};

        String query
                = " SELECT ITM.ID, ITM.DESCRIPTION, TPI.TENDER_ID, TPI.PARTY_ID,\n"
                + " TPI.TENDER_ITEM_ID, TPI.PRICE, MAN.DESCRIPTION MANUFACTURER,\n"
                + " TPI.MANUFACTURER_ID, TPI.ORIGIN_ID, TPI.PACK_SIZE,          \n"
                + " TPI.MOH, TPI.UNIT, TPI.AU,                                  \n"
                + " TO_CHAR(TPI.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,              \n"
                + "  TPI.CRTD_BY, USR.NAME USER_NAME, TPI.CRTD_TERMINAL_ID      \n"
                + "FROM " + Database.DCMS.item + " ITM,                         \n"
                + Database.Inventory.tenderWisePartyItems + " TPI,              \n"
                + Database.DCMS.definitionTypeDetail + " MAN,                   \n"
                + Database.DCMS.users + " USR                                   \n"
                + " WHERE TPI.TENDER_ID = '" + tenderId + "'                    \n"
                + " AND TPI.PARTY_ID = '" + partyId + "'                        \n";
                if(itemId.length() != 0){
                    query += " AND TPI.ITEM_ID = '" + itemId + "'               \n";
                }
                
                query += " AND ITM.ACTIVE = 'Y'                                 \n"
                + " AND ITM.ID = TPI.ITEM_ID                                    \n"
                + " AND MAN.ID = TPI.MANUFACTURER_ID                            \n"
                + " AND USR.USER_NAME = TPI.CRTD_BY                             \n"
                + " ORDER BY TPI.PARTY_ID                                       \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PartyTenderItems> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PartyTenderItems setCompound = new PartyTenderItems();

            setCompound.setItemId(map.get("ID").toString());
            setCompound.setItemDesc(map.get("DESCRIPTION").toString());
            setCompound.setTenderId(map.get("TENDER_ID").toString());
            setCompound.setPartyId(map.get("PARTY_ID").toString());
            setCompound.setTenderItemId(map.get("TENDER_ITEM_ID").toString());
            setCompound.setPrice(map.get("PRICE").toString());
            setCompound.setManufacturerId(map.get("MANUFACTURER_ID").toString());
            setCompound.setManufacturerDesc(map.get("MANUFACTURER").toString());
            setCompound.setOrigin(map.get("ORIGIN_ID").toString());
            setCompound.setPackSize(map.get("PACK_SIZE").toString());
            setCompound.setMOH(map.get("MOH").toString());
            setCompound.setUnit(map.get("UNIT").toString());
            setCompound.setAU(map.get("AU").toString());
            setCompound.setCrtdDate(map.get("CRTD_DATE").toString());
            setCompound.setCrtdBy(map.get("CRTD_BY").toString());
            setCompound.setCrtdByUser(map.get("USER_NAME").toString());
            setCompound.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setCompound);
        }
        return list;
    }
    
    public boolean deletePartyItem(PartyTenderItems objDlt){
        String query
                = " DELETE FROM  " + Database.Inventory.tenderWisePartyItems + "\n"
                + " WHERE TENDER_ID = '" + objDlt.getTenderId() + "'"
                + " AND PARTY_ID = '" + objDlt.getPartyId() + "'"
                + " AND ITEM_ID = '" + objDlt.getItemId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean updatePartyWiseItem(PartyTenderItems objUpdate) {
        String query
                = " UPDATE " + Database.Inventory.tenderWisePartyItems + "\n"
                + " SET PRICE  = '" + objUpdate.getPrice() + "',\n"
                + " MANUFACTURER_ID  = '" + objUpdate.getManufacturerId()+ "',\n"
                + " TENDER_ITEM_ID  = '" + objUpdate.getTenderItemId() + "'\n"
                + " WHERE TENDER_ID = '" + objUpdate.getTenderId() + "'"
                + " AND PARTY_ID = '" + objUpdate.getPartyId() + "'"
                + " AND ITEM_ID = '" + objUpdate.getItemId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean addPartyItem(PartyTenderItems obj) {

        String[] columns = {Database.Inventory.tenderWisePartyItems, "TENDER_ID", 
        "PARTY_ID", "ITEM_ID", "TENDER_ITEM_ID", "PRICE", "MANUFACTURER_ID", 
        "ORIGIN_ID", "PACK_SIZE", "MOH", "UNIT", "AU", "CRTD_DATE", "CRTD_BY", 
        "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();

        map.put("TENDER_ID", obj.getTenderId());
        map.put("PARTY_ID", "'" + obj.getPartyId()+ "'");
        map.put("ITEM_ID", "'" + obj.getItemId()+ "'");
        map.put("TENDER_ITEM_ID", "'" + obj.getTenderItemId()+ "'");
        map.put("PRICE", "'" + obj.getPrice()+ "'");
        map.put("MANUFACTURER_ID", "'" + obj.getManufacturerId()+ "'");
        map.put("ORIGIN_ID", "'1'");
        map.put("PACK_SIZE", "'"+ obj.getPackSize() +"'");
        map.put("MOH", "0");
        map.put("UNIT", "'" + obj.getUnit()+ "'");
        map.put("AU", "'Tabs'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today );
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        list.add(map);

        return Constants.dao.insertData(list, columns);

    }
    
    public List<PartyTenderItems> selectFromItems(String itemId) {

        String[] selectColumns = {"-", "PACK_SIZE", "UNIT"};

        String query
                = " SELECT ITM.PACK_SIZE, ITM.UNIT                              \n"
                + "FROM " + Database.DCMS.item + " ITM                          \n"
                + " WHERE ITM.ID = " + itemId + "                               \n"
                + " AND ITM.ACTIVE = 'Y'                                        \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PartyTenderItems> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PartyTenderItems setCompound = new PartyTenderItems();

            setCompound.setPackSize(map.get("PACK_SIZE").toString());
            setCompound.setUnit(map.get("UNIT").toString());
            list.add(setCompound);
        }
        return list;
    }
    
    public boolean addPartyInTender(PartyTenderItems obj) {

        String[] columns = {Database.Inventory.tenderWiseParties, "TENDER_ID", 
        "PARTY_ID", "CRTD_DATE", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        List<HashMap> list = new ArrayList();

        map.put("TENDER_ID", obj.getTenderId());
        map.put("PARTY_ID",  obj.getPartyId());
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE",  Constants.today );
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        list.add(map);
        return Constants.dao.insertData(list, columns);

    }
    
    public boolean deleteTenderParty(PartyTenderItems objDlt){
        String query
                = " DELETE FROM  " + Database.Inventory.tenderWiseParties + "\n"
                + " WHERE TENDER_ID = " + objDlt.getTenderId() + "  \n"
                + " AND PARTY_ID = " + objDlt.getPartyId() + "      \n";

        return Constants.dao.executeUpdate(query, false);
    }
}
