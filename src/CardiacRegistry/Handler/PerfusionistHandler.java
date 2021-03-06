/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.BloodGasses;
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
            "PATIENT_ID", "PERFUSIONNIST_ID", "ASSISTANT_PERFUSIONNIST_ID", "SURGEON_ID",
            "ASSISTANT_ID", "ANESTHESIST_ID", "HEPARINIZED", "REDO", "OPERATION_ID",
            "OXYGENATOR", "CPG_SYSTEM", "IAB_CATHER", "IAB_CATHER_TIME", "VENOUS",
            "ANTEGRADE", "CANN_AORTIC", "RETROGRADE", "HEMOFILTER", "SUMP_VENT",
            "CONNECTORS", "AORTIC", "MITRAL", "PULMONARY", "VALVE", "UREA",
            "CREATININE", "EF", "LMS", "HBS_HCV", "DIABETIC", "ALLERGIES", "OTHER",
            "HEIGHT", "WEIGHT", "HB", "SURFACE_AREA", "BLOOD_FLOW", "BLOOD_GROUP_ID",
            "HARTMANNS", "HEPARIN", "MANNITOL", "BLOOD_RBC", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();

        map.put("ID", "'" + insert.getPerfusionId() + "'");
        map.put("CARDIAC_ID", "'" + insert.getCardiacId() + "'");
        map.put("PATIENT_ID", "'" + insert.getPatientId() + "'");
        map.put("PERFUSIONNIST_ID", "'" + insert.getPerfusionistId() + "'");
        map.put("ASSISTANT_PERFUSIONNIST_ID", "'" + insert.getAsstPerfusionistId() + "'");
        map.put("SURGEON_ID", "'" + insert.getSurgeonId() + "'");
        map.put("ASSISTANT_ID", "'" + insert.getAssistantSurgeonId() + "'");
        map.put("ANESTHESIST_ID", "'" + insert.getAnesthetistId() + "'");
        map.put("HEPARINIZED", "'" + insert.getHeparinized() + "'");
        map.put("REDO", "'" + insert.getRedo() + "'");
        map.put("OPERATION_ID", "'" + insert.getOperationId() + "'");
        map.put("OXYGENATOR", "'" + insert.getOxygenator() + "'");
        map.put("CPG_SYSTEM", "'" + insert.getCpgSystem() + "'");
        map.put("IAB_CATHER", "'" + insert.getIABCatheter() + "'");
        map.put("IAB_CATHER_TIME", "'" + insert.getIABCatheterTime() + "'");
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

    public boolean updatePerfusionInformation(PerfusionistBO update) {
        String query
                = " UPDATE " + Database.DCMS.perfusionInformation + " SET \n"
                + " PERFUSIONNIST_ID = '" + update.getPerfusionistId() + "',\n"
                + " ASSISTANT_PERFUSIONNIST_ID = '" + update.getAsstPerfusionistId() + "',\n"
                + " SURGEON_ID = '" + update.getSurgeonId() + "',\n"
                + " ASSISTANT_ID = '" + update.getAssistantSurgeonId() + "',\n"
                + " ANESTHESIST_ID = '" + update.getAnesthetistId() + "',\n"
                + " HEPARINIZED = '" + update.getHeparinized() + "',\n"
                + " REDO = '" + update.getRedo() + "',\n"
                + " OPERATION_ID = '" + update.getOperationId() + "',\n"
                + " OXYGENATOR = '" + update.getOxygenator() + "',\n"
                + " CPG_SYSTEM = '" + update.getCpgSystem() + "',\n"
                + " IAB_CATHER = '" + update.getIABCatheter() + "',\n"
                + " IAB_CATHER_TIME = '" + update.getIABCatheterTime() + "',\n"
                + " VENOUS = '" + update.getVenous() + "',\n"
                + " ANTEGRADE = '" + update.getAntegrade() + "',\n"
                + " CANN_AORTIC = '" + update.getAorticCannulae() + "',\n"
                + " RETROGRADE = '" + update.getRetrograde() + "',\n"
                + " HEMOFILTER = '" + update.getHemofilter() + "',\n"
                + " SUMP_VENT = '" + update.getSumpVent() + "',\n"
                + " CONNECTORS = '" + update.getConnectors() + "',\n"
                + " AORTIC = '" + update.getAortic() + "',\n"
                + " MITRAL = '" + update.getMitral() + "',\n"
                + " PULMONARY = '" + update.getPulmonary() + "',\n"
                + " VALVE = '" + update.getValve() + "',\n"
                + " UREA = '" + update.getUrea() + "',\n"
                + " CREATININE = '" + update.getCreatinine() + "',\n"
                + " EF = '" + update.getEF() + "',\n"
                + " LMS = '" + update.getLMS() + "',\n"
                + " HBS_HCV = '" + update.getHBsAntiHcv() + "',\n"
                + " DIABETIC = '" + update.getDiabetic() + "',\n"
                + " ALLERGIES = '" + update.getAllergies() + "',\n"
                + " OTHER = '" + update.getOtherPerfusion() + "',\n"
                + " HEIGHT = '" + update.getHeight() + "',\n"
                + " WEIGHT = '" + update.getWeight() + "',\n"
                + " HB = '" + update.getHb() + "',\n"
                + " SURFACE_AREA = '" + update.getSurfaceArea() + "',\n"
                + " BLOOD_FLOW = '" + update.getBloodFlow() + "',\n"
                + " BLOOD_GROUP_ID = '" + update.getBloodGroupId() + "',\n"
                + " HARTMANNS = '" + update.getHartmanns() + "',\n"
                + " HEPARIN = '" + update.getHeparin() + "',\n"
                + " MANNITOL = '" + update.getMannitol() + "',\n"
                + " BLOOD_RBC = '" + update.getBloodRBC() + "',\n"
                + " IS_FINAL = '" + update.getIsFinal() + "',\n"
                + " FINAL_BY = '" + update.getFinalBy() + "',\n"
                + " FINAL_DATE = " + update.getFinalDate() + ",\n"
                + " FINAL_TERMINAL_ID = '" + update.getFinalTerminalId() + "'\n"
                + " WHERE ID = '" + update.getPerfusionId() + "'\n";

        return Constants.dao.executeUpdate(query, false);
    }

    public PerfusionistBO selectPerfusionInfo(String cardiacId, String patientId) {

        String columns[] = {"-", "ID", "PATIENT_ID", "CARDIAC_ID", "PERFUSIONNIST_ID",
            "PERFUSIONNIST_NAME", "ASST_PERFUSIONNIST_ID", "SURGEON_ID", "SURGEON_NAME",
            "ASSISTANT_PERFUSIONNIST_NAME", "ASSISTANT_ID", "ASSISTANT_NAME",
            "ANESTHESIST_ID", "ANESTHESIST_NAME", "HEPARINIZED", "REDO", "OPERATION_ID",
            "OPERATION_DESC", "OXYGENATOR", "CPG_SYSTEM", "IAB_CATHER",
            "IAB_CATHER_TIME", "VENOUS", "ANTEGRADE", "CANN_AORTIC", "RETROGRADE",
            "HEMOFILTER", "SUMP_VENT", "CONNECTORS", "AORTIC", "MITRAL", "PULMONARY",
            "VALVE", "UREA", "CREATININE", "EF", "LMS", "HBS_HCV", "DIABETIC",
            "ALLERGIES", "OTHER", "HEIGHT", "WEIGHT", "HB", "SURFACE_AREA",
            "BLOOD_FLOW", "BLOOD_GROUP_ID", "BLOOD_GROUP_DESC",
            "HARTMANNS", "HEPARIN", "MANNITOL", "BLOOD_RBC", "CRTD_DATE",
            "CRTD_BY", "CRTD_TERMINAL_ID", "IS_FINAL"};

        String query
                = "SELECT CRP.ID,\n"
                + "       CRP.PATIENT_ID,\n"
                + "       CRP.CARDIAC_ID,\n"
                + "       CRP.PERFUSIONNIST_ID,\n"
                + "       PRI.DESCRIPTION PERFUSIONNIST_NAME,\n"
                + " NVL(CRP.ASSISTANT_PERFUSIONNIST_ID, -1) ASST_PERFUSIONNIST_ID,\n"
                + "       API.DESCRIPTION ASSISTANT_PERFUSIONNIST_NAME,\n"
                + " NVL(CRP.SURGEON_ID, -1) SURGEON_ID,\n"
                + " SUR.DESCRIPTION SURGEON_NAME,\n"
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
                + "  NVL(CRP.IAB_CATHER, ' ') IAB_CATHER,\n"
                + "  NVL(CRP.IAB_CATHER_TIME, ' ') IAB_CATHER_TIME,\n"
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
                + "  NVL(CRP.LMS, 0) LMS,\n"
                + "  NVL(CRP.HBS_HCV, ' ') HBS_HCV,\n"
                + "  NVL(CRP.DIABETIC, ' ') DIABETIC,\n"
                + "  NVL(CRP.ALLERGIES, ' ') ALLERGIES,\n"
                + "  NVL(CRP.OTHER, ' ') OTHER,\n"
                + "  NVL(CRP.HEIGHT, 0) HEIGHT,\n"
                + "  NVL(CRP.WEIGHT, 0) WEIGHT,\n"
                + "  NVL(CRP.HB, 0) HB,\n"
                + "  NVL(CRP.SURFACE_AREA, 0) SURFACE_AREA,\n"
                + "  NVL(CRP.BLOOD_FLOW, 0) BLOOD_FLOW,\n"
                + "  NVL(CRP.BLOOD_GROUP_ID, -1) BLOOD_GROUP_ID,\n"
                + "  BGI.DESCRIPTION BLOOD_GROUP_DESC,\n"
                + "  NVL(CRP.HARTMANNS, ' ') HARTMANNS,\n"
                + "  NVL(CRP.HEPARIN, ' ') HEPARIN,\n"
                + "  NVL(CRP.MANNITOL, ' ') MANNITOL,\n"
                + "  NVL(CRP.BLOOD_RBC, ' ') BLOOD_RBC,\n"
                + "       CRP.CRTD_DATE,\n"
                + "       CRP.CRTD_BY,\n"
                + "       CRP.CRTD_TERMINAL_ID,\n"
                + "       CRP.IS_FINAL\n"
                + "  FROM " + Database.DCMS.perfusionInformation + " CRP,\n"
                + Database.DCMS.definitionTypeDetail + " PRI,\n"
                + Database.DCMS.definitionTypeDetail + " API,\n"
                + Database.DCMS.definitionTypeDetail + " SUR,\n"
                + Database.DCMS.definitionTypeDetail + " AST,\n"
                + Database.DCMS.definitionTypeDetail + " ANT,\n"
                + Database.DCMS.definitionTypeDetail + " OPE,\n"
                + Database.DCMS.definitionTypeDetail + " BGI\n"
                + "  WHERE CRP.CARDIAC_ID = " + cardiacId + "\n"
                + " AND CRP.PATIENT_ID = " + patientId + "\n"
                + "  AND CRP.PERFUSIONNIST_ID = PRI.ID\n"
                + "  AND CRP.ASSISTANT_PERFUSIONNIST_ID = API.ID\n"
                + "  AND CRP.SURGEON_ID = SUR.ID\n"
                + "  AND CRP.ASSISTANT_ID = AST.ID\n"
                + "  AND CRP.ANESTHESIST_ID = ANT.ID\n"
                + "  AND CRP.OPERATION_ID = OPE.ID\n"
                + "  AND CRP.BLOOD_GROUP_ID = BGI.ID\n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        if (listmap.isEmpty()) {
            return null;
        }

        HashMap map = (HashMap) listmap.get(0);
        PerfusionistBO objData = new PerfusionistBO();

        objData.setPerfusionId(map.get("ID").toString());
        objData.setPatientId(map.get("PATIENT_ID").toString());
        objData.setCardiacId(map.get("CARDIAC_ID").toString());
        objData.setPerfusionistId(map.get("PERFUSIONNIST_ID").toString());
        objData.setPerfusionistName(map.get("PERFUSIONNIST_NAME").toString());
        objData.setSurgeonId(map.get("SURGEON_ID").toString());
        objData.setSurgeonName(map.get("SURGEON_NAME").toString());
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
        objData.setIABCatheter(map.get("IAB_CATHER").toString());
        objData.setIABCatheterTime(map.get("IAB_CATHER_TIME").toString());
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
        objData.setIsFinal(map.get("IS_FINAL").toString());
        return objData;
    }

    public boolean insertPerfusionPressureGraph(PerfusionistBO perGraph) {

        String[] columns = {Database.DCMS.perfusionPressureGraph, "ID", "CARDIAC_ID",
            "PATIENT_ID", "PER_PRESSURE", "TIME_MIN", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", " (SELECT NVL(MAX(ID)+1, 1) ID FROM "
                + Database.DCMS.perfusionPressureGraph + ")");
        map.put("CARDIAC_ID", "'" + perGraph.getCardiacId() + "'");
        map.put("PATIENT_ID", "'" + perGraph.getPatientId() + "'");
        map.put("PER_PRESSURE", "'" + perGraph.getPerPressure() + "'");
        map.put("TIME_MIN", "'" + perGraph.getTimeMin() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<PerfusionistBO> selectPerfusionPressureGraph(String cardiacId,
            String patientId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "PATIENT_ID", "PER_PRESSURE",
            "TIME_MIN", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT PPG.ID,\n"
                + "       PPG.CARDIAC_ID,\n"
                + "       PPG.PATIENT_ID,\n"
                + "       PPG.PER_PRESSURE,\n"
                + "       PPG.TIME_MIN,\n"
                + "       PPG.CRTD_BY,\n"
                + "       PPG.CRTD_DATE,\n"
                + "       PPG.CRTD_TERMINAL_ID\n"
                + "  FROM " + Database.DCMS.perfusionPressureGraph + " PPG\n"
                + "  WHERE PPG.PATIENT_ID = '" + patientId + "'\n"
                + "  AND PPG.CARDIAC_ID = '" + cardiacId + "'\n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<PerfusionistBO> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PerfusionistBO objData = new PerfusionistBO();

            objData.setPerfusionGraphId(map.get("ID").toString());
            objData.setCardiacId(map.get("CARDIAC_ID").toString());
            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setPerPressure(map.get("PER_PRESSURE").toString());
            objData.setTimeMin(map.get("TIME_MIN").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }

    public boolean deletePerfusionPressureGraph(String id) {
        String query
                = " DELETE FROM " + Database.DCMS.perfusionPressureGraph + "\n"
                + " WHERE ID = " + id + "\n";
        return Constants.dao.executeUpdate(query, false);
    }

    public List<PerfusionistBO> selectPerfusionCheckList(String cardiacId,
            String patientId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "PATIENT_ID", "CHK_LIST_ID",
            "CHK_LIST_DESC", "CHECKED", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT PCL.ID, PCL.CARDIAC_ID,\n"
                + "       PCL.PATIENT_ID,\n"
                + "       PCL.CHK_LIST_ID,\n"
                + "       CLI.DESCRIPTION CHK_LIST_DESC,\n"
                + "       PCL.CHECKED,\n"
                + "       PCL.CRTD_DATE,\n"
                + "       PCL.CRTD_BY,\n"
                + "       PCL.CRTD_TERMINAL_ID\n"
                + "  FROM " + Database.DCMS.perfusionCheckList + "  PCL,\n"
                + Database.DCMS.definitionTypeDetail + " CLI\n"
                + "  WHERE PCL.PATIENT_ID = '" + patientId + "'\n"
                + "  AND PCL.CARDIAC_ID = '" + cardiacId + "'\n"
                + "  AND PCL.CHK_LIST_ID = CLI.ID\n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<PerfusionistBO> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PerfusionistBO objData = new PerfusionistBO();

            objData.setCheckListPK(map.get("ID").toString());
            objData.setCardiacId(map.get("CARDIAC_ID").toString());
            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setCheckListId(map.get("CHK_LIST_ID").toString());
            objData.setCheckListDescription(map.get("CHK_LIST_DESC").toString());
            objData.setChecked(map.get("CHECKED").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }

    public boolean updateCheckList(PerfusionistBO objUpdt) {
        String query
                = " UPDATE " + Database.DCMS.perfusionCheckList + "\n"
                + " SET CHECKED = '" + objUpdt.getChecked() + "'\n"
                + " WHERE ID = " + objUpdt.getCheckListPK() + "\n"
                + " AND CHK_LIST_ID = " + objUpdt.getCheckListId() + "\n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertBloodGases(BloodGasses bloodGasses) {
        String[] columns = {Database.DCMS.perfusionBloodGases, "ID",
            "CARDIAC_ID", "TIME", "ON_VENT_DB", "B_FLOW", "TEMPERATURE", "FIO2",
            "G_FLOW", "PH", "PCO2", "HCO2", "BE", "O2_SAT", "TCO2", "NA",
            "K", "CA", "LAC", "HB", "SUGAR", "ACT", "HEPARIN", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", bloodGasses.getBloodGasesId());
        map.put("CARDIAC_ID", "'" + bloodGasses.getCardiacId() + "'");
        map.put("TIME", "TO_DATE('" + bloodGasses.getTime() + "', 'DD-MM-YY HH24:MI:SS')");
        map.put("ON_VENT_DB", "'" + bloodGasses.getOnVentDBP() + "'");
        map.put("B_FLOW", "'" + bloodGasses.getBloodFlow() + "'");
        map.put("TEMPERATURE", "'" + bloodGasses.getTemperature() + "'");
        map.put("FIO2", "'" + bloodGasses.getFIO2() + "'");
        map.put("G_FLOW", "'" + bloodGasses.getGFlow() + "'");
        map.put("PH", "'" + bloodGasses.getPH() + "'");
        map.put("PCO2", "'" + bloodGasses.getPCO2() + "'");
        map.put("HCO2", "'" + bloodGasses.getHCO2() + "'");
        map.put("BE", "'" + bloodGasses.getBE() + "'");
        map.put("O2_SAT", "'" + bloodGasses.getO2Sat() + "'");
        map.put("TCO2", "'" + bloodGasses.getTCO2() + "'");
        map.put("NA", "'" + bloodGasses.getNA() + "'");
        map.put("K", "'" + bloodGasses.getK() + "'");
        map.put("CA", "'" + bloodGasses.getCA() + "'");
        map.put("LAC", "'" + bloodGasses.getLAC() + "'");
        map.put("HB", "'" + bloodGasses.getHB() + "'");
        map.put("SUGAR", "'" + bloodGasses.getSugar() + "'");
        map.put("ACT", "'" + bloodGasses.getACT() + "'");
        map.put("HEPARIN", "'" + bloodGasses.getHeparin() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<BloodGasses> selectBloodGases(String cardiacId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "TIME", "ON_VENT_DB", "B_FLOW",
            "TEMPERATURE", "FIO2", "G_FLOW", "PH", "PCO2", "HCO2", "BE",
            "O2_SAT", "TCO2", "NA", "K", "CA", "LAC", "HB", "SUGAR", "ACT",
            "HEPARIN", "CRTD_BY", "CRTD_DATE"};

        String query
                = "SELECT BG.ID, BG.CARDIAC_ID, TO_CHAR(BG.TIME, 'HH24:MI:SS') TIME, "
                + "BG.ON_VENT_DB, BG.B_FLOW, "
                + "\n BG.TEMPERATURE, BG.FIO2, BG.G_FLOW, BG.PH, BG.PCO2,"
                + "\n BG.HCO2, BG.BE, BG.O2_SAT, BG.TCO2, BG.NA, BG.K,"
                + "\n BG.CA, BG.LAC, BG.HB, BG.SUGAR, BG.ACT, BG.HEPARIN,"
                + "\n BG.CRTD_BY,  BG.CRTD_DATE "
                + "\n FROM " + Database.DCMS.perfusionBloodGases + " BG"
                + "\n WHERE BG.CARDIAC_ID = " + cardiacId;

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<BloodGasses> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            BloodGasses objData = new BloodGasses();

            objData.setBloodGasesId(map.get("ID").toString());
            objData.setCardiacId(map.get("CARDIAC_ID").toString());
            objData.setTime(map.get("TIME").toString());
            objData.setOnVentDBP(map.get("ON_VENT_DB").toString());
            objData.setBloodFlow(map.get("B_FLOW").toString());
            objData.setTemperature(map.get("TEMPERATURE").toString());
            objData.setFIO2(map.get("FIO2").toString());
            objData.setGFlow(map.get("G_FLOW").toString());
            objData.setPH(map.get("PH").toString());
            objData.setPCO2(map.get("PCO2").toString());
            objData.setHCO2(map.get("HCO2").toString());
            objData.setBE(map.get("BE").toString());
            objData.setO2Sat(map.get("O2_SAT").toString());
            objData.setTCO2(map.get("TCO2").toString());
            objData.setNA(map.get("NA").toString());
            objData.setK(map.get("K").toString());
            objData.setCA(map.get("CA").toString());
            objData.setLAC(map.get("LAC").toString());
            objData.setHB(map.get("HB").toString());
            objData.setSugar(map.get("SUGAR").toString());
            objData.setACT(map.get("ACT").toString());
            objData.setHeparin(map.get("HEPARIN").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }

    public boolean insertPerfusionTime(PerfusionistBO perTime) {
        String[] columns = {Database.DCMS.perfusionTime, "ID", "CARDIAC_ID",
            "START_TIME", "END_TIME", "ACTION_ID", "TEMPERATURE", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", perTime.getPerTimePk());
        map.put("CARDIAC_ID", perTime.getCardiacId());
        map.put("START_TIME", "TO_DATE('" + perTime.getStartTime() + "', 'DD-MM-YY HH24:MI:SS')");
        map.put("END_TIME", "TO_DATE('" + perTime.getEndTime() + "', 'DD-MM-YY HH24:MI:SS')");
        map.put("ACTION_ID", "'" + perTime.getActionId() + "'");
        map.put("TEMPERATURE", "'" + perTime.getTemperature() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<PerfusionistBO> selectPerfusionTime(String cardiacId, int actionId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "START_TIME", "END_TIME",
            "TOTAL_TIME", "ACTION_ID", "TEMPERATURE", "CRTD_BY", "CRTD_DATE"};

        String query
                = "SELECT PT.ID, PT.CARDIAC_ID, PT.ACTION_ID, "
                + "\n NVL(PT.TEMPERATURE,' ') TEMPERATURE,"
                + "\n TO_CHAR(PT.START_TIME, 'HH24:MI:SS') START_TIME, "
                + "\n TO_CHAR(PT.END_TIME, 'HH24:MI:SS') END_TIME,  PT.CRTD_BY,"
                + "\n SUBSTR(TO_CHAR(((END_TIME - START_TIME) * 1440)), 0, 2) TOTAL_TIME," //24 * 60 = 1440
                + "\n TO_CHAR(PT.CRTD_DATE, 'DD-MON-YY HH24:MI:SS') CRTD_DATE" //24 hours in a day * 60 minutes in an hour
                + "\n FROM " + Database.DCMS.perfusionTime + " PT"
                + "\n WHERE PT.CARDIAC_ID = " + cardiacId
                + "\n AND PT.ACTION_ID = " + actionId;

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<PerfusionistBO> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PerfusionistBO objData = new PerfusionistBO();

            objData.setPerTimePk(map.get("ID").toString());
            objData.setCardiacId(map.get("CARDIAC_ID").toString());
            objData.setStartTime(map.get("START_TIME").toString());
            objData.setEndTime(map.get("END_TIME").toString());
            objData.setTotalTime(map.get("TOTAL_TIME").toString());
            objData.setActionId(map.get("ACTION_ID").toString());
            objData.setTemperature(map.get("TEMPERATURE").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }

    public boolean insertValveInformation(PerfusionistBO perTime) {
        String[] columns = {Database.DCMS.valveInformation, "ID", "CARDIAC_ID",
            "VALVE_ID", "ACTION_ID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", perTime.getValvePk());
        map.put("CARDIAC_ID", perTime.getCardiacId());
        map.put("VALVE_ID", "'" + perTime.getValveId() + "'");
        map.put("ACTION_ID", "'" + perTime.getActionId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<PerfusionistBO> selectValveInformation(String cardiacId, int actionId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "VALVE_ID", "VALVE_DESC",
            "ACTION_ID", "CRTD_BY", "CRTD_DATE", "NAME"};

        String query
                = "SELECT PT.ID, PT.CARDIAC_ID, PT.VALVE_ID, VLI.DESCRIPTION VALVE_DESC,"
                + "\n PT.ACTION_ID, PT.CRTD_BY, USR.NAME,"
                + "\n TO_CHAR(PT.CRTD_DATE, 'DD-MON-YY HH24:MI:SS') CRTD_DATE"
                + "\n FROM " + Database.DCMS.valveInformation + " PT,"
                + "\n " + Database.DCMS.definitionTypeDetail + " VLI,"
                + "\n " + Database.DCMS.users + " USR"
                + "\n WHERE PT.CARDIAC_ID = " + cardiacId
                + "\n AND PT.ACTION_ID = " + actionId
                + "\n AND PT.VALVE_ID = VLI.ID"
                + "\n AND PT.CRTD_BY = USR.USER_NAME";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<PerfusionistBO> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PerfusionistBO objData = new PerfusionistBO();

            objData.setValvePk(map.get("ID").toString());
            objData.setCardiacId(map.get("CARDIAC_ID").toString());
            objData.setValveId(map.get("VALVE_ID").toString());
            objData.setValveDescription(map.get("VALVE_DESC").toString());
            objData.setActionId(map.get("ACTION_ID").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdByName(map.get("NAME").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }
}
