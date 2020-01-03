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
            "CARDIAC_ID", "PATIENT_ID", "PERFUSIONNIST_ID", "ASSISTANT_PERFUSIONNIST_ID",
            "ASSISTANT_ID", "ANESTHERIST_ID", "HEPARINIZED", "REDO", "OPERATION_ID",
            "OXYGENATOR", "CPG_SYSTEM", "VENOUS", "ANTEGRADE", "CANN_AORTIC", 
            "RETROGRADE", "HEMOFILTER", "SUMP_VENT", "CONNECTORS", "AORTIC",
            "MITRAL", "PULMONARY", "VALUE", "UREA", "CREATININE", "EF", "LMS", 
            "HBS_HCV", "DIABETIC", "ALLERGIES", "OTHER", "HEIGHT", "WEIGHT", "HB",
            "SURFACE_AREA", "BLOOD_FLOW", "BLOOD_GROUP_ID", "HARTMANNS", "HEPARIN",
            "MANNITOL", "BLOOD_RBC", "", "", "", "",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();

        map.put("ID", "'" + insert.getBloodGasesId() + "'");
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
        map.put("PATIENT_ID", "'" + insert.getPatientId()+ "'");
        map.put("PERFUSIONNIST_ID", "'" + insert.getPerfusionId()+ "'");
        map.put("ASSISTANT_PERFUSIONNIST_ID", "'" + insert.getAsstPerfusionistId()+ "'");
        map.put("ASSISTANT_ID", "'" + insert.getAssistantSurgeonId()+ "'");
        map.put("ANESTHERIST_ID", "'" + insert.getAnesthetistId()+ "'");
        map.put("HEPARINIZED", "'" + insert.getHeparinized()+ "'");
        map.put("REDO", "'" + insert.getRedo()+ "'");
        map.put("OPERATION_ID", "'" + insert.getOperationId()+ "'");
        map.put("OXYGENATOR", "'" + insert.getOxygenator()+ "'");
        map.put("CPG_SYSTEM", "'" + insert.getCpgSystem()+ "'");
        map.put("VENOUS", "'" + insert.getVenous()+ "'");
        map.put("ANTEGRADE", "'" + insert.getAntegrade()+ "'");
        map.put("CANN_AORTIC", "'" + insert.getAorticCannulae()+ "'");
        map.put("RETROGRADE", "'" + insert.getRetrograde()+ "'");
        map.put("HEMOFILTER", "'" + insert.getHemofilter()+ "'");
        map.put("SUMP_VENT", "'" + insert.getSumpVent()+ "'");
        map.put("CONNECTORS", "'" + insert.getConnectors()+ "'");
        map.put("AORTIC", "'" + insert.getAortic()+ "'");
        map.put("MITRAL", "'" + insert.getMitral()+ "'");
        map.put("PULMONARY", "'" + insert.getPulmonary()+ "'");
        map.put("VALUE", "'" + insert.getValve()+ "'");
        map.put("UREA", "'" + insert.getUrea()+ "'");
        map.put("CREATININE", "'" + insert.getCreatinine()+ "'");
        map.put("EF", "'" + insert.getEF()+ "'");
        map.put("LMS", "'" + insert.getLMS()+ "'");
        map.put("HBS_HCV", "'" + insert.getHBsAntiHcv()+ "'");
        map.put("DIABETIC", "'" + insert.getDiabetic()+ "'");
        map.put("ALLERGIES", "'" + insert.getAllergies()+ "'");
        map.put("OTHER", "'" + insert.getOtherPerfusion()+ "'");
        map.put("HEIGHT", "'" + insert.getHeight()+ "'");
        map.put("WEIGHT", "'" + insert.getWeight()+ "'");
        map.put("HB", "'" + insert.getHb()+ "'");
        map.put("SURFACE_AREA", "'" + insert.getSurfaceArea()+ "'");
        map.put("BLOOD_FLOW", "'" + insert.getBloodFlow()+ "'");
        map.put("BLOOD_GROUP_ID", "'" + insert.getBloodGroupId()+ "'");
        map.put("HARTMANNS", "'" + insert.getHartmanns()+ "'");
        map.put("HEPARIN", "'" + insert.getHeparin()+ "'");
        map.put("MANNITOL", "'" + insert.getMannitol()+ "'");
        map.put("BLOOD_RBC", "'" + insert.getBloodRBC()+ "'");
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
