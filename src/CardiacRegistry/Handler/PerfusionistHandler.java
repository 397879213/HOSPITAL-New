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

    public boolean insertPerfusionInformation(PerfusionistBO insert) {

        String[] columns = {Database.DCMS.perfusionInformation, "ID", "CARDIAC_ID",
            "PATIENT_ID", "PERFUSIONNIST_ID", "ASSISTANT_PERFUSIONNIST_ID",
            "ASSISTANT_ID", "ANESTHESIST_ID", "HEPARINIZED", "REDO", "OPERATION_ID",
            "OXYGENATOR", "CPG_SYSTEM", "VENOUS", "ANTEGRADE", "CANN_AORTIC",
            "RETROGRADE", "HEMOFILTER", "SUMP_VENT", "CONNECTORS", "AORTIC",
            "MITRAL", "PULMONARY", "VALVE", "UREA", "CREATININE", "EF", "LMS",
            "HBS_HCV", "DIABETIC", "ALLERGIES", "OTHER", "HEIGHT", "WEIGHT", "HB",
            "SURFACE_AREA", "BLOOD_FLOW", "BLOOD_GROUP_ID", "HARTMANNS", "HEPARIN",
            "MANNITOL", "BLOOD_RBC", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();

        map.put("ID", "'" + insert.getBloodGasesId() + "'");
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
        map.put("PATIENT_ID", "'" + insert.getPatientId() + "'");
        map.put("PERFUSIONNIST_ID", "'" + insert.getPerfusionistId() + "'");
        map.put("ASSISTANT_PERFUSIONNIST_ID", "'" + insert.getAsstPerfusionistId() + "'");
        map.put("ASSISTANT_ID", "'" + insert.getAssistantSurgeonId() + "'");
        map.put("ANESTHESIST_ID", "'" + insert.getAnesthetistId() + "'");
        map.put("HEPARINIZED", "'" + insert.getHeparinized() + "'");
        map.put("REDO", "'" + insert.getRedo() + "'");
        map.put("OPERATION_ID", "'" + insert.getOperationId() + "'");
        map.put("OXYGENATOR", "'" + insert.getOxygenator() + "'");
        map.put("CPG_SYSTEM", "'" + insert.getCpgSystem() + "'");
        map.put("VENOUS", "'" + insert.getVenous() + "'");
        map.put("ANTEGRADE", "'" + insert.getAntegrade() + "'");
        map.put("CANN_AORTIC", "'" + insert.getAorticCannulae() + "'");
        map.put("RETROGRADE", "'" + insert.getRetrograde() + "'");
        map.put("HEMOFILTER", "'" + insert.getHemofilter() + "'");
        map.put("SUMP_VENT", "'" + insert.getSumpVent() + "'");
        map.put("CONNECTORS", "'" + insert.getConnectors() + "'");
        map.put("AORTIC", "'" + insert.getAortic() + "'");
        map.put("MITRAL", "'" + insert.getMitral() + "'");
        map.put("PULMONARY", "'" + insert.getPulmonary() + "'");
        map.put("VALVE", "'" + insert.getValve() + "'");
        map.put("UREA", "'" + insert.getUrea() + "'");
        map.put("CREATININE", "'" + insert.getCreatinine() + "'");
        map.put("EF", "'" + insert.getEF() + "'");
        map.put("LMS", "'" + insert.getLMS() + "'");
        map.put("HBS_HCV", "'" + insert.getHBsAntiHcv() + "'");
        map.put("DIABETIC", "'" + insert.getDiabetic() + "'");
        map.put("ALLERGIES", "'" + insert.getAllergies() + "'");
        map.put("OTHER", "'" + insert.getOtherPerfusion() + "'");
        map.put("HEIGHT", "'" + insert.getHeight() + "'");
        map.put("WEIGHT", "'" + insert.getWeight() + "'");
        map.put("HB", "'" + insert.getHb() + "'");
        map.put("SURFACE_AREA", "'" + insert.getSurfaceArea() + "'");
        map.put("BLOOD_FLOW", "'" + insert.getBloodFlow() + "'");
        map.put("BLOOD_GROUP_ID", "'" + insert.getBloodGroupId() + "'");
        map.put("HARTMANNS", "'" + insert.getHartmanns() + "'");
        map.put("HEPARIN", "'" + insert.getHeparin() + "'");
        map.put("MANNITOL", "'" + insert.getMannitol() + "'");
        map.put("BLOOD_RBC", "'" + insert.getBloodRBC() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public PerfusionistBO selectPerfusionInfo(String cardiacId) {

        String columns[] = {"-", "ID", "PATIENT_ID", "CARDIAC_ID",
            "PERFUSIONNIST_ID", "PERFUSIONNIST_NAME", "ASST_PERFUSIONNIST_ID",
            "ASSISTANT_PERFUSIONNIST_NAME", "ASSISTANT_ID", "ASSISTANT_NAME",
            "ANESTHESIST_ID", "ANESTHESIST_NAME", "HEPARINIZED", "REDO", "OPERATION_ID",
            "OPERATION_DESC", "OXYGENATOR", "CPG_SYSTEM", "VENOUS", "ANTEGRADE",
            "CANN_AORTIC", "RETROGRADE", "HEMOFILTER", "SUMP_VENT", "CONNECTORS",
            "AORTIC", "MITRAL", "PULMONARY", "VALVE", "UREA", "CREATININE", "EF",
            "LMS", "HBS_HCV", "DIABETIC", "ALLERGIES", "OTHER", "HEIGHT", "WEIGHT",
            "HB", "SURFACE_AREA", "BLOOD_FLOW", "BLOOD_GROUP_ID", "BLOOD_GROUP_DESC",
            "HARTMANNS", "HEPARIN", "MANNITOL", "BLOOD_RBC", "CRTD_DATE",
            "CRTD_BY", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT CRP.ID,\n"
                + "       CRP.PATIENT_ID,\n"
                + "       CRP.CARDIAC_ID,\n"
                + "       CRP.PERFUSIONNIST_ID,\n"
                + "       PRI.DESCRIPTION PERFUSIONNIST_NAME,\n"
                + " NVL(CRP.ASSISTANT_PERFUSIONNIST_ID, -1) ASST_PERFUSIONNIST_ID,\n"
                + "       API.DESCRIPTION ASSISTANT_PERFUSIONNIST_NAME,\n"
                + " NVL(CRP.ASSISTANT_ID, -1) ASSISTANT_ID,\n"
                + "       AST.DESCRIPTION ASSISTANT_NAME,\n"
                + " NVL(CRP.ANESTHESIST_ID, -1) ANESTHESIST_ID,\n"
                + "       ANT.DESCRIPTION ANESTHESIST_NAME,\n"
                + "       CRP.HEPARINIZED,\n"
                + "       CRP.REDO,\n"
                + "  NVL(CRP.OPERATION_ID, -1) OPERATION_ID,\n"
                + "       OPE.DESCRIPTION OPERATION_DESC,\n"
                + "  NVL(CRP.OXYGENATOR, ' ') OXYGENATOR,\n"
                + "  NVL(CRP.CPG_SYSTEM, ' ') CPG_SYSTEM,\n"
                + "  NVL(CRP.VENOUS, ' ') VENOUS,\n"
                + "  NVL(CRP.ANTEGRADE, ' ') ANTEGRADE,\n"
                + "  NVL(CRP.CANN_AORTIC, ' ') CANN_AORTIC,\n"
                + "  NVL(CRP.RETROGRADE, ' ') RETROGRADE,\n"
                + "  NVL(CRP.HEMOFILTER, ' ') HEMOFILTER,\n"
                + "  NVL(CRP.SUMP_VENT, ' ') SUMP_VENT,\n"
                + "  NVL(CRP.CONNECTORS, ' ') CONNECTORS,\n"
                + "  NVL(CRP.AORTIC, ' ') AORTIC,\n"
                + "  NVL(CRP.MITRAL, ' ') MITRAL,\n"
                + "  NVL(CRP.PULMONARY, ' ') PULMONARY,\n"
                + "  NVL(CRP.VALVE, ' ') VALVE,\n"
                + "  NVL(CRP.UREA, ' ') UREA,\n"
                + "  NVL(CRP.CREATININE, ' ') CREATININE,\n"
                + "  NVL(CRP.EF, ' ') EF,\n"
                + "  NVL(CRP.LMS, ' ') LMS,\n"
                + "  NVL(CRP.HBS_HCV, ' ') HBS_HCV,\n"
                + "  NVL(CRP.DIABETIC, ' ') DIABETIC,\n"
                + "  NVL(CRP.ALLERGIES, ' ') ALLERGIES,\n"
                + "  NVL(CRP.OTHER, ' ') OTHER,\n"
                + "  NVL(CRP.HEIGHT, ' ') HEIGHT,\n"
                + "  NVL(CRP.WEIGHT, ' ') WEIGHT,\n"
                + "  NVL(CRP.HB, ' ') HB,\n"
                + "  NVL(CRP.SURFACE_AREA, ' ') SURFACE_AREA,\n"
                + "  NVL(CRP.BLOOD_FLOW, ' ') BLOOD_FLOW,\n"
                + "  NVL(CRP.BLOOD_GROUP_ID, -1) BLOOD_GROUP_ID,\n"
                + "  BGI.DESCRIPTION BLOOD_GROUP_DESC,\n"
                + "  NVL(CRP.HARTMANNS, ' ') HARTMANNS,\n"
                + "  NVL(CRP.HEPARIN, ' ') HEPARIN,\n"
                + "  NVL(CRP.MANNITOL, ' ') MANNITOL,\n"
                + "  NVL(CRP.BLOOD_RBC, ' ') BLOOD_RBC,\n"
                + "       CRP.CRTD_DATE,\n"
                + "       CRP.CRTD_BY,\n"
                + "       CRP.CRTD_TERMINAL_ID\n"
                + "  FROM " + Database.DCMS.perfusionInformation + " CRP,\n"
                + Database.DCMS.definitionTypeDetail + " PRI,\n"
                + Database.DCMS.definitionTypeDetail + " API,\n"
                + Database.DCMS.definitionTypeDetail + " AST,\n"
                + Database.DCMS.definitionTypeDetail + " ANT,\n"
                + Database.DCMS.definitionTypeDetail + " OPE,\n"
                + Database.DCMS.definitionTypeDetail + " BGI\n"
                + "  WHERE CRP.ID = " + cardiacId + "\n"
                + "  AND CRP.PERFUSIONNIST_ID = PRI.ID\n"
                + "  AND CRP.ASSISTANT_PERFUSIONNIST_ID = API.ID\n"
                + "  AND CRP.ASSISTANT_ID = AST.ID\n"
                + "  AND CRP.ANESTHESIST_ID = ANT.ID\n"
                + "  AND CRP.OPERATION_ID = OPE.ID\n"
                + "  AND CRP.BLOOD_GROUP_ID = BGI.ID\n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        if(listmap.isEmpty()){
            return null;
        }

        HashMap map = (HashMap) listmap.get(0);
        PerfusionistBO objData = new PerfusionistBO();

        objData.setPerfusionId(map.get("ID").toString());
        objData.setPatientId(map.get("PATIENT_ID").toString());
        objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
        objData.setPerfusionistId(map.get("PERFUSIONNIST_ID").toString());
        objData.setPerfusionistName(map.get("PERFUSIONNIST_NAME").toString());
        objData.setAsstPerfusionistId(map.get("ASST_PERFUSIONNIST_ID").toString());
        objData.setAsstPerfusionistName(map.get("ASSISTANT_PERFUSIONNIST_NAME").toString());
        objData.setAssistantSurgeonId(map.get("ASSISTANT_ID").toString());
        objData.setAssistantSurgeonName(map.get("ASSISTANT_NAME").toString());
        objData.setAnesthetistId(map.get("ANESTHESIST_ID").toString());
        objData.setAnesthetistName(map.get("ANESTHESIST_NAME").toString());
        objData.setHeparinized(map.get("HEPARINIZED").toString());
        objData.setRedo(map.get("REDO").toString());
        objData.setOperationId(map.get("OPERATION_ID").toString());
        objData.setOperationDescription(map.get("OPERATION_DESC").toString());
        objData.setOxygenator(map.get("OXYGENATOR").toString());
        objData.setCpgSystem(map.get("CPG_SYSTEM").toString());
        objData.setVenous(map.get("VENOUS").toString());
        objData.setAntegrade(map.get("ANTEGRADE").toString());
        objData.setAorticCannulae(map.get("CANN_AORTIC").toString());
        objData.setRetrograde(map.get("RETROGRADE").toString());
        objData.setHemofilter(map.get("HEMOFILTER").toString());
        objData.setSumpVent(map.get("SUMP_VENT").toString());
        objData.setConnectors(map.get("CONNECTORS").toString());
        objData.setAortic(map.get("AORTIC").toString());
        objData.setMitral(map.get("MITRAL").toString());
        objData.setPulmonary(map.get("PULMONARY").toString());
        objData.setValve(map.get("VALVE").toString());
        objData.setUrea(map.get("UREA").toString());
        objData.setCreatinine(map.get("CREATININE").toString());
        objData.setEF(map.get("EF").toString());
        objData.setLMS(map.get("LMS").toString());
        objData.setHBsAntiHcv(map.get("HBS_HCV").toString());
        objData.setDiabetic(map.get("DIABETIC").toString());
        objData.setAllergies(map.get("ALLERGIES").toString());
        objData.setOtherPerfusion(map.get("OTHER").toString());
        objData.setHeight(map.get("HEIGHT").toString());
        objData.setWeight(map.get("WEIGHT").toString());
        objData.setHb(map.get("HB").toString());
        objData.setSurfaceArea(map.get("SURFACE_AREA").toString());
        objData.setBloodFlow(map.get("BLOOD_FLOW").toString());
        objData.setBloodGroupId(map.get("BLOOD_GROUP_ID").toString());
        objData.setBloodGroupDescription(map.get("BLOOD_GROUP_DESC").toString());
        objData.setHartmanns(map.get("HARTMANNS").toString());
        objData.setHeparin(map.get("HEPARIN").toString());
        objData.setMannitol(map.get("MANNITOL").toString());
        objData.setBloodRBC(map.get("BLOOD_RBC").toString());
        objData.setCrtdDate(map.get("CRTD_DATE").toString());
        objData.setCrtdBy(map.get("CRTD_BY").toString());
        objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
//            lisPatient.add(objData);
//        }
//        return lisPatient;
        return objData;
    }

    public List<PerfusionistBO> selectBloodGases(String cardiacId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "BG_ID", "BLOOD_GASSES",
            "ON_VENT", "DBP_1", "DBP_2", "DBP_3", "DBP_4", "DBP_5", "DBP_6",
            "DBP_7", "DBP_8", "DBP_9", "DBP_10", "CRTD_BY", "CRTD_DATE",
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
