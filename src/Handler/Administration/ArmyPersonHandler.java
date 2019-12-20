/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.ArmyPersonBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author admin
 */
public class ArmyPersonHandler {

    public List<ArmyPersonBO> selectArmyPerson(ArmyPersonBO objSrch) {

        String[] columns = {"-", "ID", "PATIENT_ID", "PL_NUMBER", "RANK_ID", "FULL_NAME",
            "RANK_DESC", "MARITAL_STATUS_ID", "MARITAL_STATUS_DESC", "BLOOD_GROUP_ID",
            "BLOOD_GROUP_DESC", "CITY_ID", "CITY_DESC", "UNIT", "DOB", "DAY_OF_BIRTH",
            "AGE", "ADDRESS", "CRTD_BY", "CRTD_NAME", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query = "SELECT AP.ID, AP.PATIENT_ID, AP.FULL_NAME,\n"
                + "       AP.PL_NUMBER,\n"
                + "       AP.DOB,\n"
                + "        trunc(months_between(sysdate,AP.DOB) / 12)||' (Y) ' ||\n"
                + "   trunc(months_between(sysdate,AP.DOB) -\n"
                + "   (trunc(months_between(sysdate,AP.DOB) / 12) * 12))||' (M) '||\n"
                + "   (trunc(sysdate) - add_months(AP.DOB,trunc(months_between(sysdate,AP.DOB)))) ||' (D) ' AGE,\n"
                + "  NVL(ROUND(AP.DOB - (SYSDATE+1)), 0) DAY_OF_BIRTH,     \n"
                + "       AP.RANK_ID,\n"
                + "       RNK.DESCRIPTION      RANK_DESC,\n"
                + "       AP.MARITAL_STATUS_ID,\n"
                + "       MSI.DESCRIPTION      MARITAL_STATUS_DESC,\n"
                + "       AP.BLOOD_GROUP_ID,\n"
                + "       BGI.DESCRIPTION      BLOOD_GROUP_DESC,\n"
                + "       AP.CITY_ID,\n"
                + "       CTI.DESCRIPTION      CITY_DESC,\n"
                + "       AP.UNIT,\n"
                + "       AP.ADDRESS,\n"
                + "       AP.CRTD_BY,\n"
                + "       USR.NAME CRTD_NAME,\n"
                + "       AP.CRTD_DATE,\n"
                + "       AP.CRTD_TERMINAL_ID\n"
                + "  FROM " + Database.DCMS.regArmyPerson + " AP,\n"
                + Database.DCMS.definitionTypeDetail + "   RNK,\n"
                + Database.DCMS.definitionTypeDetail + "  MSI,\n"
                + Database.DCMS.definitionTypeDetail + "  BGI,\n"
                + Database.DCMS.definitionTypeDetail + "  CTI,\n"
                + Database.DCMS.users + "  USR\n"
                + " WHERE 1 = 1                         \n";
//        if (objSrch.getArmyPersonId().length() != 0) {
//            query += " AND AP.ID = '" + objSrch.getArmyPersonId() + "'\n";
//        }
        if (objSrch.getPatientId().length() != 0) {
            query += " AND AP.PATIENT_ID = '" + objSrch.getPatientId() + "'\n";
        }
        if (objSrch.getPlNo().length() != 0) {
            query += " AND AP.PL_NUMBER = '" + objSrch.getPlNo() + "'\n";
        }
        if (objSrch.getFullName().length() != 0) {
            query += " AND UPPER(AP.FULL_NAME) LIKE '%" + objSrch.getFullName().toUpperCase() + "%'\n";
        }
        query += "   AND AP.RANK_ID = RNK.ID\n"
                + "   AND AP.MARITAL_STATUS_ID = MSI.ID\n"
                + "   AND AP.BLOOD_GROUP_ID = BGI.ID\n"
                + "   AND AP.CITY_ID = CTI.ID"
                + "   AND AP.CRTD_BY = USR.USER_NAME";

        List list = Constants.dao.selectData(query, columns);
        List<ArmyPersonBO> listArmy = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(i);
            ArmyPersonBO mod = new ArmyPersonBO();
            mod.setArmyPersonId(map.get("ID").toString());
            mod.setPatientId(map.get("PATIENT_ID").toString());
            mod.setPlNo(map.get("PL_NUMBER").toString());
            mod.setDayOfBirth(map.get("DAY_OF_BIRTH").toString());
            mod.setAge(map.get("AGE").toString());
            mod.setDob(map.get("DOB").toString());
            mod.setFullName(map.get("FULL_NAME").toString());
            mod.setRankId(map.get("RANK_ID").toString());
            mod.setRankDesc(map.get("RANK_DESC").toString());
            mod.setMaritalStatusId(map.get("MARITAL_STATUS_ID").toString());
            mod.setMaritalStatusDesc(map.get("MARITAL_STATUS_DESC").toString());
            mod.setBloodGroupId(map.get("BLOOD_GROUP_ID").toString());
            mod.setBloodGroupDesc(map.get("BLOOD_GROUP_DESC").toString());
            mod.setCityId(map.get("CITY_ID").toString());
            mod.setCityDesc(map.get("CITY_DESC").toString());
            mod.setUnit(map.get("UNIT").toString());
            mod.setAddress(map.get("ADDRESS").toString());
            mod.setCrtdBy(map.get("CRTD_BY").toString());
            mod.setCrtdUserName(map.get("CRTD_NAME").toString());
            mod.setCrtdDate(map.get("CRTD_DATE").toString());
            mod.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            listArmy.add(mod);
        }
        return listArmy;
    }

    public boolean insertArmyPerson(ArmyPersonBO pat) {

        String[] columns = {Database.DCMS.regArmyPerson, "ID", "PATIENT_ID", "PL_NUMBER",
            "FULL_NAME", "RANK_ID", "MARITAL_STATUS_ID", "BLOOD_GROUP_ID", "CITY_ID",
            "DOB", "UNIT", "ADDRESS", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();

        map.put("ID", "'" + pat.getArmyPersonId() + "'");
        map.put("PATIENT_ID", "'" + pat.getPatientId() + "'");
        map.put("FULL_NAME", "'" + pat.getFullName() + "'");
        map.put("PL_NUMBER", "'" + pat.getPlNo() + "'");
        map.put("DOB", "'" + pat.getDob()+ "'");
        map.put("RANK_ID", "'" + pat.getRankId() + "'");
        map.put("MARITAL_STATUS_ID", "'" + pat.getMaritalStatusId() + "'");
        map.put("BLOOD_GROUP_ID", "'" + pat.getBloodGroupId() + "'");
        map.put("CITY_ID", "'" + pat.getCityId() + "'");
        map.put("UNIT", "'" + pat.getUnit() + "'");
        map.put("ADDRESS", "'" + pat.getAddress() + "'");
        map.put("CRTD_DATE", "" + Constants.today + "");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List list = new ArrayList();
        list.add(map);
        return Constants.dao.insertData(list, columns);
    }

    public boolean updateArmyPerson(ArmyPersonBO objAP) {

        String query
                = " UPDATE " + Database.DCMS.regArmyPerson + "\n SET "
                //                + " PL_NUMBER = '" + objAP.getPlNo() + "', "
                //                + " DOB = '" + objAP.getDob() + "' ,"
                + " RANK_ID = '" + objAP.getRankId() + "', "
                + " MARITAL_STATUS_ID = '" + objAP.getMaritalStatusId() + "', "
                //                + " BLOOD_GROUP_ID = '" + objAP.getBloodGroupId() + "', "
                + " DOB = '" + objAP.getDob()+ "', "
                + " CITY_ID = '" + objAP.getCityId() + "', "
                + " UNIT = '" + objAP.getUnit() + "', "
                + " ADDRESS = '" + objAP.getAddress().replaceAll(",", " ") + "', "
                + " CRTD_BY = '" + Constants.userId + "', "
                + " CRTD_DATE = " + Constants.today + ", "
                + " CRTD_TERMINAL_ID = '" + Constants.terminalId + "' "
                + " WHERE ID  = '" + objAP.getArmyPersonId() + "'";

        return Constants.dao.executeUpdate(query, false);

    }
}
