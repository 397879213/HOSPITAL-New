/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.PerfusionistBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class PerfusionistHandler {

    public boolean insertBloodGases(PerfusionistBO insert) {

        String[] columns = {Database.DCMS.perfusionBloodGases, "ID",
            "CARDIAC_ID", "B_FLOW", "TEMPERATURE", "FIO2", "G_FLOW", "PH", "PCO2",
            "PO2", "HCO2", "BE", "O2_SAT", "TCO2", "NA", "K", "CA", "LAC", "HB",
            "SUGAR", "ACT", "HEPARIN", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();

        map.put("ID", "'" + insert.getBloodGasesId() + "'");
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
        map.put("B_FLOW", "'" + insert.getBloodFlow() + "'");
        map.put("TEMPERATURE", "'" + insert.getTemperature() + "'");
        map.put("FIO2", "'" + insert.getFIO2() + "'");
        map.put("G_FLOW", "'" + insert.getgFlow() + "'");
        map.put("PH", "'" + insert.getpH() + "'");
        map.put("PCO2", "'" + insert.getPCO2() + "'");
        map.put("PO2", "'" + insert.getPO2() + "'");
        map.put("HCO2", "'" + insert.getHCO2() + "'");
        map.put("BE", "'" + insert.getBE() + "'");
        map.put("O2_SAT", "'" + insert.getO2Sat() + "'");
        map.put("TCO2", "'" + insert.getTCO2() + "'");
        map.put("NA", "'" + insert.getNa() + "'");
        map.put("K", "'" + insert.getK() + "'");
        map.put("CA", "'" + insert.getCa() + "'");
        map.put("LAC", "'" + insert.getLac() + "'");
        map.put("HB", "'" + insert.getHb() + "'");
        map.put("SUGAR", "'" + insert.getSugar() + "'");
        map.put("ACT", "'" + insert.getACT() + "'");
        map.put("HEPARIN", "'" + insert.getHeparinKU() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<PerfusionistBO> selectBloodGases(String cardiacId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "BG_ID", "BLOOD_GASSES",
            "ON_VENT", "DBP_1", "DBP_2", "DBP_3", "DBP_4", "DBP_5", "DBP_6", 
            "DBP_7", "DBP_8", "DBP_9", "DBP_10","CRTD_BY", "CRTD_DATE", 
            "CRTD_TERMINAL_ID"};

        String query
                = "SELECT BG.ID, BG.CARDIAC_ID, BG.BG_ID,\n"
                + "       DTD.DESCRIPTION BLOOD_GASSES,\n"
                + " NVL(BG.ON_VENT, 0) ON_VENT, NVL(BG.DBP_1, 0) DBP_1,\n"
                + " NVL(BG.DBP_2, 0) DBP_2, NVL(BG.DBP_3, 0) DBP_3,\n"
                + " NVL(BG.DBP_4, 0) DBP_4, NVL(BG.DBP_5, 0) DBP_5,\n"
                + " NVL(BG.DBP_6, 0) DBP_6, NVL(BG.DBP_7, 0) DBP_7,\n"
                + " NVL(BG.DBP_8, 0) DBP_8, NVL(BG.DBP_9, 0) DBP_9,\n"
                + " NVL(BG.DBP_10, 0) DBP_10, BG.CRTD_BY,\n"
                + " TO_CHAR(BG.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,\n"
                + " BG.CRTD_TERMINAL_ID\n"
                + "  FROM " + Database.DCMS.perfusionBloodGases + " BG, \n"
                + "DEFINITION_TYPE_DETAIL DTD\n"
                + " WHERE BG.CARDIAC_ID = " + cardiacId + "\n"
                + "   AND BG.BG_ID = DTD.ID";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<PerfusionistBO> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PerfusionistBO objData = new PerfusionistBO();

            objData.setBloodGasesId(map.get("ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setBloodGasesId(map.get("BG_ID").toString());
            objData.setBloodGasesDescription(map.get("BLOOD_GASSES").toString());
            objData.setOnVent(map.get("ON_VENT").toString());
            objData.setDBP1(map.get("DBP_1").toString());
            objData.setDBP2(map.get("DBP_2").toString());
            objData.setDBP3(map.get("DBP_3").toString());
            objData.setDBP4(map.get("DBP_4").toString());
            objData.setDBP5(map.get("DBP_5").toString());
            objData.setDBP6(map.get("DBP_6").toString());
            objData.setDBP7(map.get("DBP_7").toString());
            objData.setDBP8(map.get("DBP_8").toString());
            objData.setDBP9(map.get("DBP_9").toString());
            objData.setDBP10(map.get("DBP_10").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }
}
