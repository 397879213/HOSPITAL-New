/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.CardiacSurgeryBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class CardiacRegistryDiagnosticHandler {
    
    public boolean insertCardiacHistoryDetail(CardiacSurgeryBO insert) {

        String[] columns = {Database.DCMS.cardiacHistoryDetail,
            "CARDIAC_ID", "EXAM_TYPE_ID", "EXAM_DETAIL_ID", "REMARKS", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("CARDIAC_ID", "'" + insert.getPatientId() + "'");
        map.put("EXAM_TYPE_ID", "'" + insert.getPatientId() + "'");
        map.put("EXAM_DETAIL_ID", "'" + insert.getInstituteId() + "'");
        map.put("REMARKS", "'" + insert.getAdmissionNo() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<CardiacSurgeryBO> selectExamDetail(String cardiacId) {

        String columns[] = {"-", "CARDIAC_ID", "EXAM_TYPE_ID", "EXAM_TYPE_DESC",
            "EXAM_DETAIL_ID", "EXAM_DETAIL_DESC", "REMARKS"};

        String query
                = "SELECT CHD.CARDIAC_ID, CHD.EXAM_TYPE_ID,             \n"
                + "       DT.DESCRIPTION EXAM_TYPE_DESC,                \n"
                + " NVL(CHD.EXAM_DETAIL_ID, -1) EXAM_DETAIL_ID,         \n"
                + " NVL(DTD.DESCRIPTION, ' ') EXAM_DETAIL_DESC,         \n"
                + " NVL(CHD.REMARKS, ' ') REMARKS  FROM                 \n"
                + Database.DCMS.cardiacHistoryDetail + " CHD,           \n"
                + Database.DCMS.definitionType + " DT,                  \n"
                + Database.DCMS.definitionTypeDetail + " DTD            \n"
                + " WHERE CHD.CARDIAC_ID = " + cardiacId + "            \n"
                + "   AND NVL(CHD.EXAM_TYPE_ID, -1) = NVL(DT.ID, -1)    \n"
                + "   AND NVL(CHD.EXAM_DETAIL_ID, -1) = NVL(DTD.ID, -1) \n"
                + "   ORDER BY CHD.EXAM_TYPE_ID                         \n";
        ;

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacSurgeryBO> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacSurgeryBO objData = new CardiacSurgeryBO();
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setExamId(map.get("EXAM_TYPE_ID").toString());
            objData.setExamDescription(map.get("EXAM_TYPE_DESC").toString());
            objData.setExamDetailId(map.get("EXAM_DETAIL_ID").toString());
            objData.setExamDetailDescription(map.get("EXAM_DETAIL_DESC").toString());
            objData.setExamRemarks(map.get("REMARKS").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }

    public boolean insertExamDetail(List<CardiacSurgeryBO> listExam, String id) {

        String[] columns = {Database.DCMS.cardiacHistoryDetail,
            "CARDIAC_ID", "EXAM_TYPE_ID", "EXAM_DETAIL_ID", "REMARKS", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listExam.size(); i++) {
            CardiacSurgeryBO comp = listExam.get(i);
            HashMap map = new HashMap();
            map.put("CARDIAC_ID", "'" + id + "'");
            map.put("EXAM_TYPE_ID", "'" + comp.getExamId() + "'");
            map.put("EXAM_DETAIL_ID", "'" + comp.getExamDetailId() + "'");
            map.put("REMARKS", "'" + comp.getExamRemarks() + "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_DATE", "SYSDATE");
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean updateExamDetail(CardiacSurgeryBO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardiacHistoryDetail + "        \n"
                + " SET EXAM_DETAIL_ID  = '" + cardiac.getExamDetailId() + "'\n"
                + " WHERE CARDIAC_ID = '" + cardiac.getCardiacRegistryId() + "'\n"
                + " AND EXAM_TYPE_ID = '" + cardiac.getExamId() + "'         \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateExamDetailRemarks(CardiacSurgeryBO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardiacHistoryDetail + "\n"
                + " SET REMARKS  = '" + cardiac.getExamRemarks() + "'\n"
                + " WHERE CARDIAC_ID = '" + cardiac.getCardiacRegistryId() + "'\n"
                + " AND EXAM_TYPE_ID = '" + cardiac.getExamId() + "' \n";

        return Constants.dao.executeUpdate(query, false);
    }
}
