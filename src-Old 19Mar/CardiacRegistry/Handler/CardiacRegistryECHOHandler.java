/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.CardiacRegistryECHO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

/**
 *
 * @author admin
 */
public class CardiacRegistryECHOHandler {
    
    public List<CardiacRegistryECHO> selectEchoValve(String echoId) {

        String columns[] = {"-", "ECHO_ID", "CARDIAC_ID", "VALVE_ID", "DESCRIPTION",
            "STENOSIS", "REGURGITATION", "GRADIENT", "PATHOLOGY"};

        String query
                = "SELECT ECHO_ID, ECD.CARDIAC_ID, ECD.VALVE_ID, DTD.DESCRIPTION,\n"
                + " NVL(ECD.STENOSIS, ' ') STENOSIS,                        \n"
                + " NVL(ECD.REGURGITATION, ' ') REGURGITATION,              \n"
                + "NVL(ECD.GRADIENT, ' ') GRADIENT,                         \n"
                + "NVL(ECD.PATHOLOGY, ' ') PATHOLOGY FROM                   \n"
                + Database.DCMS.echoCardiography + " ECD,                   \n"
                + Database.DCMS.definitionTypeDetail + " DTD                \n"
                + " WHERE ECD.ECHO_ID = " + echoId + "                      \n"
                + "   AND ECD.VALVE_ID = DTD.ID                             \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacRegistryECHO> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacRegistryECHO objData = new CardiacRegistryECHO();

            objData.setEchoId(map.get("ECHO_ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setValveId(map.get("VALVE_ID").toString());
            objData.setValveDescription(map.get("DESCRIPTION").toString());
            objData.setStenosis(map.get("STENOSIS").toString());
            objData.setRegurgitation(map.get("REGURGITATION").toString());
            objData.setGradient(map.get("GRADIENT").toString());
            objData.setPathology(map.get("PATHOLOGY").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }

    public List<CardiacRegistryECHO> selectEchoValveMeasurement(String echoId) {

        String columns[] = {"-", "ECHO_ID", "CARDIAC_ID", "MEASUREMENT_ID", "DESCRIPTION", "VALUE"};

        String query
                = "SELECT ECHO_ID, ECD.CARDIAC_ID, ECD.MEASUREMENT_ID, DTD.DESCRIPTION,\n"
                + "NVL(ECD.VALUE, ' ') VALUE FROM                           \n"
                + Database.DCMS.cardioEchoCardiographyDetail + " ECD,       \n"
                + Database.DCMS.definitionTypeDetail + " DTD                \n"
                + " WHERE ECD.ECHO_ID = " + echoId + "                      \n"
                + "   AND ECD.MEASUREMENT_ID = DTD.ID                       \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacRegistryECHO> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacRegistryECHO objData = new CardiacRegistryECHO();

            objData.setEchoId(map.get("ECHO_ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setValveMeasurementId(map.get("MEASUREMENT_ID").toString());
            objData.setValveMeasurementDescription(map.get("DESCRIPTION").toString());
            objData.setValue(map.get("VALUE").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }

    public boolean updateEchoValve(CardiacRegistryECHO cardiac) {
        String cols[] = {"", "STENOSIS", "REGURGITATION", "GRADIENT", "PATHOLOGY"};

        String query
                = " UPDATE " + Database.DCMS.echoCardiography + "   \n"
                + " SET " + cols[Integer.parseInt(cardiac.getColumnName())]
                + " = '" + cardiac.getValue() + "'\n"
                + " WHERE ECHO_ID = " + cardiac.getEchoId() + "      \n"
                + " AND VALVE_ID = '" + cardiac.getValveId() + "'   \n";
        System.err.println("upda:" + query);
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateEchoValveMeasurement(CardiacRegistryECHO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardioEchoCardiographyDetail + "\n"
                + " SET VALUE = '" + cardiac.getValue() + "'  \n"
                + " WHERE ECHO_ID = " + cardiac.getEchoId() + "\n"
                + " AND MEASUREMENT_ID = '" + cardiac.getValveMeasurementId() + "'\n";

        return Constants.dao.executeUpdate(query, false);
    }

    public String echoId() {

        String[] columns = {"-", "ID"};
        String query
                = " SELECT NVL(MAX(ID)+1, 1) ID FROM          \n"
                + Database.DCMS.echoCardiographyMaster + "        \n";
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    public boolean insertEchocrdiographyMaster(CardiacRegistryECHO insert) {

        String[] columns = {Database.DCMS.echoCardiographyMaster, "ID", "CARDIAC_ID",
            "PERFORM_DATE", "PERFORMED_BY", "ORDER_STATUS_ID", "INSTITUTE_ID",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + insert.getEchoId() + "'");
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
        map.put("PERFORM_DATE", "'" + insert.getEchoPerformDate() + "'");
        map.put("PERFORMED_BY", "'" + insert.getPerformingPhysicianId() + "'");
        map.put("ORDER_STATUS_ID", "'" + insert.getOrderStatusId() + "'");
        map.put("INSTITUTE_ID", "'" + insert.getInstituteId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("FINAL_BY", "'" + insert.getFinalBy() + "'");
        map.put("FINAL_DATE", insert.getFinalDate());
        map.put("FINAL_TERMINAL_ID", "'" + insert.getFinalTerminalId() + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<CardiacRegistryECHO> selectEchocardiographyMaster(String cardiacId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "PERFORM_DATE", "PERFORM_DAY",
            "PERFORMED_BY", "PERFORMING_NAME", "ORDER_STATUS_ID", "ORDER_STATUS_DESC",
            "INSTITUTE_ID", "INSTITUTE_DESC", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT ECM.ID, ECM.CARDIAC_ID,               \n"
                + "       TO_CHAR(ECM.PERFORM_DATE, 'DD-MON-YY') PERFORM_DATE,\n"
                + " NVL(ROUND(ECM.PERFORM_DATE - (SYSDATE - 1)), 0) PERFORM_DAY,\n"
                + "       ECM.PERFORMED_BY,                     \n"
                + "       PPI.DESCRIPTION PERFORMING_NAME,      \n"
                + "       ECM.ORDER_STATUS_ID,                  \n"
                + "       OSI.DESCRIPTION ORDER_STATUS_DESC,    \n"
                + "       ECM.INSTITUTE_ID,                     \n"
                + "       INS.DESCRIPTION INSTITUTE_DESC,       \n"
                + "       ECM.CRTD_BY,                          \n"
                + "       ECM.CRTD_DATE,                        \n"
                + "       ECM.CRTD_TERMINAL_ID,                 \n"
                + "       ECM.FINAL_BY,                         \n"
                + "       ECM.FINAL_DATE,                       \n"
                + "       ECM.FINAL_TERMINAL_ID FROM            \n"
                + Database.DCMS.echoCardiographyMaster + " ECM, \n"
                + Database.DCMS.definitionTypeDetail + " PPI,   \n"
                + Database.DCMS.definitionTypeDetail + " OSI,   \n"
                + Database.DCMS.definitionTypeDetail + " INS    \n"
                + " WHERE ECM.CARDIAC_ID = " + cardiacId + "    \n"
                + "   AND ECM.PERFORMED_BY = PPI.ID             \n"
                + "   AND ECM.ORDER_STATUS_ID = OSI.ID          \n"
                + "   AND ECM.INSTITUTE_ID = INS.ID             \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacRegistryECHO> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacRegistryECHO objData = new CardiacRegistryECHO();

            objData.setEchoId(map.get("ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setEchoPerformDate(map.get("PERFORM_DATE").toString());
            objData.setEchoPerformDay(map.get("PERFORM_DAY").toString());
            objData.setPerformingPhysicianId(map.get("PERFORMED_BY").toString());
            objData.setPerformingPhysicianName(map.get("PERFORMING_NAME").toString());
            objData.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            objData.setOrderStatusDesc(map.get("ORDER_STATUS_DESC").toString());
            objData.setInstituteId(map.get("INSTITUTE_ID").toString());
            objData.setInstituteDescription(map.get("INSTITUTE_DESC").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }

    public boolean updateEchoCardiographyMaster(CardiacRegistryECHO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.echoCardiographyMaster + "\n"
                + " SET PERFORM_DATE = '" + cardiac.getEchoPerformDate() + "',\n"
                + " PERFORMED_BY = '" + cardiac.getPerformingPhysicianId() + "',\n"
                + " ORDER_STATUS_ID = '" + cardiac.getOrderStatusId() + "',\n"
                + " INSTITUTE_ID = '" + cardiac.getInstituteId() + "' \n"
                + " WHERE CARDIAC_ID = " + cardiac.getCardiacRegistryId() + " \n"
                + " AND ID = " + cardiac.getEchoId() + "              \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean finalEchoCardiography(CardiacRegistryECHO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.echoCardiographyMaster + "\n"
                + " SET ORDER_STATUS_ID = '" + Status.verified + "',\n"
                + " FINAL_BY = '" + Constants.userId + "',\n"
                + " FINAL_DATE = SYSDATE,\n"
                + " FINAL_TERMINAL_ID = '" + Constants.terminalId + "' \n"
                + " WHERE CARDIAC_ID = " + cardiac.getCardiacRegistryId() + "\n"
                + " AND ID = " + cardiac.getEchoId() + "              \n";

        return Constants.dao.executeUpdate(query, false);
    }
}
