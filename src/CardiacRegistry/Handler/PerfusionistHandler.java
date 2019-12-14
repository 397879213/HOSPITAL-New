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

        String columns[] = {"-", "ID", "CARDIAC_ID", "B_FLOW", "TEMPERATURE",
            "FIO2", "G_FLOW", "PH", "PCO2", "PO2", "HCO2", "BE", "O2_SAT", "TCO2",
            "NA", "K", "CA", "LAC", "HB", "SUGAR", "ACT", "HEPARIN", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT BG.ID, BG.CARDIAC_ID, BG.B_FLOW, BG.TEMPERATURE,      \n"
                + "       BG.FIO2, BG.G_FLOW, BG.PH, BG.PCO2, BG.PO2, BG.HCO2,  \n"
                + "       BG.BE, BG.O2_SAT, BG.TCO2, BG.NA, BG.K, BG.CA, BG.LAC,\n"
                + "       BG.HB, BG.SUGAR, BG.ACT, BG.HEPARIN, BG.CRTD_BY,      \n"
                + " TO_CHAR(BG.CRTD_DATE, 'DD-MON-YY') CRTD_DATE, BG.CRTD_TERMINAL_ID\n"
                + "  FROM "+Database.DCMS.perfusionBloodGases+" BG\n"
                + "  WHERE BG.CARDIAC_ID = "+ cardiacId +"";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<PerfusionistBO> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PerfusionistBO objData = new PerfusionistBO();

            objData.setBloodGasesId(map.get("ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setBloodFlow(map.get("B_FLOW").toString());
            objData.setTemperature(map.get("TEMPERATURE").toString());
            objData.setFIO2(map.get("FIO2").toString());
            objData.setgFlow(map.get("G_FLOW").toString());
            objData.setpH(map.get("PH").toString());
            objData.setPCO2(map.get("PCO2").toString());
            objData.setPO2(map.get("PO2").toString());
            objData.setHCO2(map.get("HCO2").toString());
            objData.setBE(map.get("BE").toString());
            objData.setO2Sat(map.get("O2_SAT").toString());
            objData.setTCO2(map.get("TCO2").toString());
            objData.setNa(map.get("NA").toString());
            objData.setK(map.get("K").toString());
            objData.setCa(map.get("CA").toString());
            objData.setLac(map.get("LAC").toString());
            objData.setHb(map.get("HB").toString());
            objData.setSugar(map.get("SUGAR").toString());
            objData.setACT(map.get("ACT").toString());
            objData.setHeparinKU(map.get("HEPARIN").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }
}
