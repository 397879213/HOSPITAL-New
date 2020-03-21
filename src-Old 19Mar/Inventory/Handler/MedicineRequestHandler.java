/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Handler;

import Inventory.BO.MedicineRequestBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Adeel
 */
public class MedicineRequestHandler {

    public List<MedicineRequestBO> selectMedicineRequest(String wardId, String UserId) {

        String[] columns = {"-", "ID", "ITEM_NAME", "WARD_ID", "WARD_NAME", "QTY",
            "USER_ID", "USER_NAME"};
        String query = "SELECT ITM.ID,ITM.DESCRIPTION  ITEM_NAME,"
                + "WAR.ID WARD_ID ,WAR.DESCRIPTION WARD_NAME ,MF.QTY,"
                + "MF.USER_ID,USR.NAME USER_NAME            \n"
                + "FROM EMR.ITEM ITM,                       \n"
                + "EMR.MEDICINE_REQUEST MF,                 \n"
                + "EMR.WARD WAR,                            \n"
                + "EMR.USERS USR                            \n"
                + "WHERE MF.ITEM_ID = ITM.ID                \n"
                + "AND WAR.ID = MF.WARD_ID                  \n"
                + "AND MF.ACTIVE = 'Y'                  \n"
                + "AND MF.WARD_ID = " + wardId + "\n"
                + "AND MF.USER_ID = '" + UserId + "'          \n"
                + "AND MF.USER_ID = USR.USER_NAME";

        List vec = Constants.dao.selectData(query, columns);
        List<MedicineRequestBO> listMedicine = new ArrayList();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            MedicineRequestBO MD = new MedicineRequestBO();
            MD.setItemId(map.get("ID").toString());
            MD.setItemName(map.get("ITEM_NAME").toString());
            MD.setWardId(map.get("WARD_ID").toString());
            MD.setWardName(map.get("WARD_NAME").toString());
            MD.setQty(map.get("QTY").toString());
            MD.setUserId(map.get("USER_ID").toString());
            MD.setUserName(map.get("USER_NAME").toString());

            listMedicine.add(MD);
        }
        return listMedicine;

    }

    public List<MedicineRequestBO> selectSearchMedicineRequest(MedicineRequestBO MR) {

        String[] columns = {"-", "ID", "ITEM_NAME", "WARD_ID", "WARD_NAME", "QTY",
            "USER_ID", "USER_NAME"};
        String query = "SELECT ITM.ID,ITM.DESCRIPTION  ITEM_NAME,"
                + "WAR.ID WARD_ID ,WAR.DESCRIPTION WARD_NAME ,MF.QTY,"
                + "MF.USER_ID,USR.NAME USER_NAME            \n"
                + "FROM EMR.ITEM ITM,                       \n"
                + "EMR.MEDICINE_REQUEST MF,                 \n"
                + "EMR.WARD WAR,                            \n"
                + "EMR.USERS USR                            \n"
                + "WHERE MF.ITEM_ID = ITM.ID                \n"
                + "AND WAR.ID = MF.WARD_ID                  \n"
                + "AND MF.ACTIVE = 'Y'                      \n";
        if (MR.getWardId().trim().length() != 0) {
            query += " AND  WAR.ID = '" + MR.getWardId().toUpperCase().trim() + "' \n";
        }
        if (MR.getUserId().trim().length() != 0) {
            query += " AND  MF.USER_ID = '" + MR.getUserId().toUpperCase().trim() + "' \n";
        }
        if (MR.getItemId().trim().length() != 0) {
            query += " AND  MF.ITEM_ID = '" + MR.getItemId().toUpperCase().trim() + "' \n";
        }
        query += "AND MF.USER_ID = USR.USER_NAME";

        List vec = Constants.dao.selectData(query, columns);
        List<MedicineRequestBO> listMedicine = new ArrayList();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            MedicineRequestBO MD = new MedicineRequestBO();
            MD.setItemId(map.get("ID").toString());
            MD.setItemName(map.get("ITEM_NAME").toString());
            MD.setWardId(map.get("WARD_ID").toString());
            MD.setWardName(map.get("WARD_NAME").toString());
            MD.setQty(map.get("QTY").toString());
            MD.setUserId(map.get("USER_ID").toString());
            MD.setUserName(map.get("USER_NAME").toString());

            listMedicine.add(MD);
        }
        return listMedicine;

    }

    public boolean InsertWardWiseMedicine(MedicineRequestBO mr) {

        String[] columns = {Database.DCMS.medicineRequest,
            "ITEM_ID", "WARD_ID", "USER_ID", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ITEM_ID", "'" + mr.getItemId() + "'");
        map.put("WARD_ID", "'" + mr.getWardId() + "'");
        map.put("USER_ID", "'" + mr.getUserId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean UpdateMedicine(MedicineRequestBO mr) {

        String query = " UPDATE " + Database.DCMS.medicineRequest + " MR \n"
                + " SET MR.ACTIVE = '" + mr.getStatus() + "',\n"
                + " MR.ACTION_BY = '" + mr.getActionUserId() + "',\n"
                //+ " MR.ACTION_DATE = '" + mr.getActionDate() + ",'\n"
                + " MR.ACTION_TERMINAL_ID = '" + mr.getActionTerminalId() + "'\n"
                + " WHERE  MR.ITEM_ID = '" + mr.getItemId() + "'\n"
                + " AND MR.USER_ID = '" + mr.getUserId() + "'\n"
                + " AND MR.WARD_ID = '" + mr.getWardId() + "'";
        return Constants.dao.executeUpdate(query, false);
    }

}
