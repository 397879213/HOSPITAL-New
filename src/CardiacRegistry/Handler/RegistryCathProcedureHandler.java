/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.CardiacRegistryCathProcedure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class RegistryCathProcedureHandler {
    
    public boolean insertCardiacProcedureDetail(CardiacRegistryCathProcedure insert) {

        String[] columns = {Database.DCMS.cathCardiacDetail, "ID",
            "CARDIAC_ID", "PROCEDURE_TYPE", "PROCEDURE_ID", "DATE_OF_PROCEDURE",
            "INSTITUTE_ID", "PERFORMING_PHYSICIAN_ID", "EJECTION_FRACTION",
            "LEFT_MAIN_DISEASE", "DISEASE_EXTENT", "LVEDP", "PAPS", "PAWP",
            "ANTEROBASAL", "ANTEROLATERAL", "APICAL", "DIAPHRAGMATIC", "POSTEROBASAL",
            "CSS_PERFORMED", "REMARKS", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID)+1, 1) ID FROM " + Database.DCMS.cathCardiacDetail + ")");
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
        map.put("PROCEDURE_TYPE", "'" + insert.getProcedureType() + "'");
        map.put("PROCEDURE_ID", "'" + insert.getProcedureId() + "'");
        map.put("DATE_OF_PROCEDURE", "'" + insert.getDateOfProcedure() + "'");
        map.put("INSTITUTE_ID", "'" + insert.getInstituteId() + "'");
        map.put("PERFORMING_PHYSICIAN_ID", "'" + insert.getPerformingPhysicianId() + "'");
        map.put("EJECTION_FRACTION", "'" + insert.getEjectionFraction() + "'");
        map.put("LEFT_MAIN_DISEASE", "'" + insert.getLeftMainDisease() + "'");
        map.put("DISEASE_EXTENT", "'" + insert.getExtentofDisease() + "'");
        map.put("LVEDP", "'" + insert.getLVEDP() + "'");
        map.put("PAPS", "'" + insert.getPAPS() + "'");
        map.put("PAWP", "'" + insert.getPAWP() + "'");
        map.put("ANTEROBASAL", "'" + insert.getAnterobasal() + "'");
        map.put("ANTEROLATERAL", "'" + insert.getAnterolateral() + "'");
        map.put("APICAL", "'" + insert.getApical() + "'");
        map.put("DIAPHRAGMATIC", "'" + insert.getDiaphragmatic() + "'");
        map.put("POSTEROBASAL", "'" + insert.getPosterobasal() + "'");
        map.put("CSS_PERFORMED", "'" + insert.getCSSPerformed() + "'");
        map.put("REMARKS", "'" + insert.getProcedureRemarks() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateCardiacProcedureDetail(CardiacRegistryCathProcedure cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cathCardiacDetail + "\n"
                + " SET DATE_OF_PROCEDURE  = '" + cardiac.getDateOfProcedure() + "',\n"
                + " PROCEDURE_ID = '" + cardiac.getInstituteId() + "',\n"
                + " PERFORMING_PHYSICIAN_ID  = '" + cardiac.getPerformingPhysicianId() + "',\n"
                + " EJECTION_FRACTION  = '" + cardiac.getEjectionFraction() + "',\n"
                + " LEFT_MAIN_DISEASE  = '" + cardiac.getLeftMainDisease() + "',\n"
                + " DISEASE_EXTENT  = '" + cardiac.getExtentofDisease() + "',\n"
                + " LVEDP  = '" + cardiac.getLVEDP() + "',\n"
                + " PAPS  = '" + cardiac.getPAPS() + "',\n"
                + " PAWP  = '" + cardiac.getPAWP() + "',\n"
                + " ANTEROBASAL  = '" + cardiac.getAnterobasal() + "',\n"
                + " ANTEROLATERAL  = '" + cardiac.getAnterolateral() + "',\n"
                + " APICAL  = '" + cardiac.getApical() + "',\n"
                + " DIAPHRAGMATIC  = '" + cardiac.getDiaphragmatic() + "',\n"
                + " POSTEROBASAL  = '" + cardiac.getPosterobasal() + "',\n"
                + " CSS_PERFORMED  = '" + cardiac.getCSSPerformed() + "',\n"
                + " REMARKS  = '" + cardiac.getProcedureRemarks() + "'\n"
                + " WHERE CARDIAC_ID = '" + cardiac.getCardiacRegistryId() + "' \n"
                + " AND ID = '" + cardiac.getCathProcId() + "' \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public List<CardiacRegistryCathProcedure> selectCardiacProcedureDetail(String cardiacId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "PROCEDURE_TYPE", "PROCEDURE_ID",
            "PROCEDURE_DESC", "DATE_OF_PROCEDURE", "INSTITUTE_ID", "INSTITUTE_DESC",
            "PERFORMING_PHYSICIAN_ID", "PERFORMING_PHY_NAME", "REMARKS",
            "EJECTION_FRACTION", "LEFT_MAIN_DISEASE", "DISEASE_EXTENT", "LVEDP",
            "PAPS", "PAWP", "ANTEROBASAL", "ANTEROLATERAL", "APICAL", "DIAPHRAGMATIC",
            "POSTEROBASAL", "CSS_PERFORMED", "REMARKS", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID", "CRTD_BY_NAME", "DAY_OF_PROCEDURE"};

        String query
                = "SELECT CPD.ID, CPD.CARDIAC_ID,                   \n"
                + "       CPD.PROCEDURE_TYPE,                       \n"
                + "       CPD.PROCEDURE_ID,                         \n"
                + "       PCI.DESCRIPTION PROCEDURE_DESC,           \n"
                + " NVL(ROUND(CPD.DATE_OF_PROCEDURE - (SYSDATE+1)), 0) DAY_OF_PROCEDURE,\n"
                + " TO_CHAR(CPD.DATE_OF_PROCEDURE, 'DD-MON-YY') DATE_OF_PROCEDURE,\n"
                + "       CPD.INSTITUTE_ID,                         \n"
                + "       INS.DESCRIPTION INSTITUTE_DESC,           \n"
                + "       CPD.PERFORMING_PHYSICIAN_ID,              \n"
                + "       PPI.DESCRIPTION PERFORMING_PHY_NAME,      \n"
                + " NVL(CPD.EJECTION_FRACTION, ' ') EJECTION_FRACTION,\n"
                + " NVL(CPD.LEFT_MAIN_DISEASE, ' ') LEFT_MAIN_DISEASE,\n"
                + " NVL(CPD.DISEASE_EXTENT, ' ') DISEASE_EXTENT,    \n"
                + " NVL(CPD.LVEDP, ' ') LVEDP,                      \n"
                + " NVL(CPD.PAPS, ' ') PAPS, NVL(CPD.PAWP, ' ') PAWP,\n"
                + " NVL(CPD.ANTEROBASAL, ' ') ANTEROBASAL,          \n"
                + " NVL(CPD.ANTEROLATERAL, ' ') ANTEROLATERAL,      \n"
                + " NVL(CPD.APICAL, ' ') APICAL,                    \n"
                + " NVL(CPD.DIAPHRAGMATIC, ' ') DIAPHRAGMATIC,      \n"
                + " NVL(CPD.POSTEROBASAL, ' ') POSTEROBASAL,        \n"
                + " NVL(CPD.CSS_PERFORMED, ' ') CSS_PERFORMED,      \n"
                + " NVL(CPD.REMARKS, ' ') REMARKS,                  \n"
                + "       CPD.CRTD_BY,                              \n"
                + " TO_CHAR(CPD.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,  \n"
                + "       CPD.CRTD_TERMINAL_ID,                     \n"
                + "       CRB.NAME  CRTD_BY_NAME FROM               \n"
                + Database.DCMS.cathCardiacDetail + " CPD,          \n"
                + Database.DCMS.definitionTypeDetail + " INS,       \n"
                + Database.DCMS.definitionTypeDetail + " PCI,       \n"
                + Database.DCMS.definitionTypeDetail + " PPI,       \n"
                + Database.DCMS.users + " CRB                       \n"
                + " WHERE CPD.CARDIAC_ID = " + cardiacId + "        \n"
                + "   AND CPD.PROCEDURE_ID = PCI.ID                 \n"
                + "   AND CPD.INSTITUTE_ID = INS.ID                 \n"
                + "   AND CPD.CRTD_BY = CRB.USER_NAME               \n"
                + "   AND CPD.PERFORMING_PHYSICIAN_ID = PPI.ID      \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacRegistryCathProcedure> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacRegistryCathProcedure objData = new CardiacRegistryCathProcedure();

            objData.setCathProcId(map.get("ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setProcedureType(map.get("PROCEDURE_TYPE").toString());
            objData.setProcedureId(map.get("PROCEDURE_ID").toString());
            objData.setProcedureDescription(map.get("PROCEDURE_DESC").toString());
            objData.setDateOfProcedure(map.get("DATE_OF_PROCEDURE").toString());
            objData.setDayOfProcedure(map.get("DAY_OF_PROCEDURE").toString());
            objData.setInstituteId(map.get("INSTITUTE_ID").toString());
            objData.setInstituteDescription(map.get("INSTITUTE_DESC").toString());
            objData.setPerformingPhysicianId(map.get("PERFORMING_PHYSICIAN_ID").toString());
            objData.setPerformingPhysicianName(map.get("PERFORMING_PHY_NAME").toString());
            objData.setEjectionFraction(map.get("EJECTION_FRACTION").toString());
            objData.setLeftMainDisease(map.get("LEFT_MAIN_DISEASE").toString());
            objData.setExtentofDisease(map.get("DISEASE_EXTENT").toString());
            objData.setLVEDP(map.get("LVEDP").toString());
            objData.setPAPS(map.get("PAPS").toString());
            objData.setPAWP(map.get("PAWP").toString());
            objData.setAnterobasal(map.get("ANTEROBASAL").toString());
            objData.setAnterolateral(map.get("ANTEROLATERAL").toString());
            objData.setApical(map.get("APICAL").toString());
            objData.setDiaphragmatic(map.get("DIAPHRAGMATIC").toString());
            objData.setPosterobasal(map.get("POSTEROBASAL").toString());
            objData.setCSSPerformed(map.get("CSS_PERFORMED").toString());
            objData.setProcedureRemarks(map.get("REMARKS").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }

    public boolean deleteProcedure(CardiacRegistryCathProcedure cardiac) {
        String query
                = " DELETE FROM " + Database.DCMS.cathCardiacDetail + " \n"
                + " WHERE CARDIAC_ID = '" + cardiac.getCardiacRegistryId() + "'\n"
                + " AND ID = '" + cardiac.getCathProcId() + "' \n";

        return Constants.dao.executeUpdate(query, false);
    }
}
