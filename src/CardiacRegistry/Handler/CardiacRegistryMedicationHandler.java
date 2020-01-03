/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.CardiacRegistryMedication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class CardiacRegistryMedicationHandler {
    
    public boolean insertMedications(CardiacRegistryMedication insert) {

        String[] columns = {Database.DCMS.cardiacMedication, "ID", "MEDICINE_ID",
            "CARDIAC_ID", "PATIENT_ID", "DOSE_ID", "TIME_PEROID", "ACTIVE",
            "MEDICINE_DURATION", "MONTH_DAYS", "ACTION_ID", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID) +1, 1) ID FROM "
                + Database.DCMS.cardiacMedication + ")");
        map.put("PATIENT_ID", "'" + insert.getPatientId() + "'");
        map.put("MEDICINE_ID", "'" + insert.getMedicineId() + "'");
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
        map.put("DOSE_ID", "'" + insert.getDoseId() + "'");
        map.put("TIME_PEROID", "'" + insert.getTimeTaking() + "'");
        map.put("MEDICINE_DURATION", "'" + insert.getMedicineDuration() + "'");
        map.put("MONTH_DAYS", "'" + insert.getMedicineMonthDays() + "'");
        map.put("ACTION_ID", "'" + insert.getActionId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("ACTIVE", "'Y'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateMedications(String medId) {
        String query
                = " UPDATE " + Database.DCMS.cardiacMedication + "   \n"
                + " SET ACTIVE  = 'N'        \n"
                + " WHERE ID = " + medId + "          \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public List<CardiacRegistryMedication> selectMedications(String cardiacId) {

        String columns[] = {"-", "ID", "CARDIAC_ID", "MEDICINE_ID",
            "MEDICINE_DESC", "PATIENT_ID", "ACTION_ID", "DOSE_ID", "DOSE_DESC", 
            "TIME_PEROID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "ACTIVE",
            "CRTD_BY_NAME", "DAY_TIME_PEROID", "MEDICINE_DURATION", "MONTH_DAYS"};

        String query
                = "SELECT CPM.CARDIAC_ID, CPM.ID,           \n"
                + "       CPM.MEDICINE_ID, CPM.PATIENT_ID,  \n"
                + "       ITM.DESCRIPTION MEDICINE_DESC,    \n"
                + "       CPM.DOSE_ID, CPM.ACTION_ID,       \n"
                + "       DOS.DESCRIPTION DOSE_DESC,        \n"
                + " TO_CHAR(CPM.TIME_PEROID, 'DD-MON-YY') TIME_PEROID,\n"
                + " NVL(ROUND(CPM.TIME_PEROID - (SYSDATE - 1)), 0) DAY_TIME_PEROID,\n"
                + "       CPM.ACTIVE,                       \n"
                + "       CPM.MONTH_DAYS,                   \n"
                + "       CPM.MEDICINE_DURATION,            \n"
                + "       CPM.CRTD_BY,                      \n"
                + "       USR.NAME CRTD_BY_NAME,            \n"
                + "       CPM.CRTD_DATE,                    \n"
                + "       CPM.CRTD_TERMINAL_ID FROM         \n"
                + Database.DCMS.cardiacMedication + " CPM,\n"
                + Database.DCMS.item + " ITM,               \n"
                + Database.DCMS.users + " USR,              \n"
                + Database.DCMS.definitionTypeDetail + " DOS\n"
                + " WHERE CPM.CARDIAC_ID = " + cardiacId + "\n"
                + "   AND CPM.ACTIVE = 'Y'                  \n"
                + "   AND CPM.MEDICINE_ID = ITM.ID          \n"
                + "   AND CPM.CRTD_BY = USR.USER_NAME       \n"
                + "   AND CPM.DOSE_ID = DOS.ID              \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacRegistryMedication> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacRegistryMedication objData = new CardiacRegistryMedication();

            objData.setMedicationId(map.get("ID").toString());
            objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setMedicineId(map.get("MEDICINE_ID").toString());
            objData.setMedicineDesc(map.get("MEDICINE_DESC").toString());
            objData.setDoseId(map.get("DOSE_ID").toString());
            objData.setDoseDesc(map.get("DOSE_DESC").toString());
            objData.setTimeTaking(map.get("TIME_PEROID").toString());
            objData.setDayTimeTaking(map.get("DAY_TIME_PEROID").toString());
            objData.setMedicineMonthDays(map.get("MONTH_DAYS").toString());
            objData.setMedicineDuration(map.get("MEDICINE_DURATION").toString());
            objData.setActiveMedicine(map.get("ACTIVE").toString());
            objData.setActionId(map.get("ACTION_ID").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }
}
