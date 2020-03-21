/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Handler;

import Inventory.BO.Party;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author Mission
 */
public class POFSuppHandler {

    GenerateKeys key = new GenerateKeys();

    public List<Party> selectSupplier(String suppDesc, String suppId) {

        String cols[] = {"-", "ID", "REF_SUPPLIER_CODE","DESCRIPTION", "ADDRESS"};

        String query = " SELECT SUP.ID ,SUP.DESCRIPTION,        \n"
                + " SUP.ADDRESS,REF_SUPPLIER_CODE               \n"
                + " FROM  " + Database.Inventory.party + " SUP  \n"
                + " WHERE SUP.ACTIVE = 'Y'                      \n";

        if (!suppDesc.equalsIgnoreCase("")) {
            query += " AND UPPER(SUP.DESCRIPTION) LIKE UPPER('%" + suppDesc + "%')   \n";
        }
        if (!suppId.equalsIgnoreCase("")) {
            query += "AND SUP.ID = '" + suppId + "'             \n";
        }
        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);
        List<Party> lisVerRep = new ArrayList<>();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            Party objData = new Party();
            objData.setPartyId(map.get("ID").toString());
            objData.setPartyDescription(map.get("DESCRIPTION").toString());
            objData.setPartyAddress(map.get("ADDRESS").toString());
            objData.setPartyRefId(map.get("REF_SUPPLIER_CODE").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public List<Party> selectPOFSupplier() {

        String cols[] = {"-", "SUP_CODE", "SUP_NAME", "SUP_ADD1", "SUP_PHONE",
            "SUP_EMAIL"};

        String query = "SELECT SUP_CODE, SUP_NAME, NVL(SUP_ADD1, ' ') SUP_ADD1, \n"
                + " NVL(SUP_PHONE, ' ') SUP_PHONE, NVL(SUP_EMAIL, ' ') SUP_EMAIL,\n"
                + " TRANSFER FROM                   \n"
                + Database.Inventory.POFSupplier + "           \n"
                + " WHERE TRANSFER = 'N'                       \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, cols);
        List<Party> lisVerRep = new ArrayList<>();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            Party objData = new Party();
            objData.setPartyRefId(map.get("SUP_CODE").toString());
            objData.setPartyDescription(map.get("SUP_NAME").toString());
            objData.setPartyAddress(map.get("SUP_ADD1").toString());
            objData.setPartyPhoneNo(map.get("SUP_PHONE").toString());
            objData.setPartyEmail(map.get("SUP_EMAIL").toString());
            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public boolean insertParty(Party supp) {

        String[] columns = {Database.Inventory.party,
            "ID", "DESCRIPTION", "ADDRESS", "EMAIL_ADDRESS", "NTN",
            "SALES_TAX_NO", "PHONE_NO", "ACTIVE", "REF_SUPPLIER_CODE",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap inrSupp = new HashMap();
        inrSupp.put("ID", "'" + key.generatePrimaryKey(Keys.party, false) + "'");
        inrSupp.put("DESCRIPTION", "'" + supp.getPartyDescription()+ "'");
        inrSupp.put("ADDRESS", "'" + supp.getPartyAddress()+ "'");
        inrSupp.put("EMAIL_ADDRESS", "'" + supp.getPartyEmail()+ "'");
        inrSupp.put("NTN", "'0'");
        inrSupp.put("SALES_TAX_NO", "'0'");
        inrSupp.put("PHONE_NO", "'" + supp.getPartyPhoneNo()+ "'");
        inrSupp.put("ACTIVE", "'Y'");
        inrSupp.put("REF_SUPPLIER_CODE", "'" + supp.getPartyRefId()+ "'");
        inrSupp.put("CRTD_BY", "'" + Constants.userId + "'");
        inrSupp.put("CRTD_DATE", "" + Constants.today + "");
        inrSupp.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List listParty = new ArrayList();
        listParty.add(inrSupp);
        return Constants.dao.insertData(listParty, columns);
    }
    
    public boolean updateTransferStatus(Party supp) {
        String query
                = " UPDATE " + Database.Inventory.POFSupplier + "\n SET "
                + " TRANSFER  = 'Y' \n"
                + " WHERE SUP_CODE = '" + supp.getPartyId()+ "'";
        System.err.println(query);
        return Constants.dao.executeUpdate(query, true);
    }
}
