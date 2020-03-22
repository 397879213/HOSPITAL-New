/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMRWEB.Handler;

import EMRWEB.BO.DoctorDiagnosis;
import com.archimed.dicom.DDict;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class DoctorDiagnosisHandler {

    public List<DoctorDiagnosis> selectPendingPatients(String visitId) {

        String[] selectColumns = {"-", "PATIENT_ID", "FULL_NAME", "AGE",
            "GENDER_ID", "GENDER_DESC", "CONTACT_NO", "CITY_ID", "CITY_DESC",
            "AREA", "EMP_ID", "CRTD_DATE", "VISIT_ID", "BP_SYS",
            "BP_DIS", "TEMPERATURE", "ORDER_STATUS_ID", "VISIT_DATE", "ACTION_BY",
            "USR_NAME", "ACTION_DATE"};

        String query
                = "SELECT PVP.PATIENT_ID, PVP.VISIT_ID, NVL(PVP.BP_SYS, 0) BP_SYS,"
                + "\n NVL(PVP.BP_DIS, 0) BP_DIS, NVL(PVP.TEMPERATURE, 0) TEMPERATURE,"
                + "\nEWP.FULL_NAME, EWP.AGE, NVL(EWP.EMP_ID, ' ') EMP_ID,"
                + "\n EWP.GENDER_ID, GEN.DESCRIPTION GENDER_DESC, EWP.CONTACT_NO,"
                + "\n EWP.CITY_ID, CTY.DESCRIPTION CITY_DESC, EWP.AREA,\n"
                + "\n TO_CHAR(EWP.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,"
                + "\n PVP.ORDER_STATUS_ID, NVL(PVP.ACTION_BY, 'GENERAL') ACTION_BY,"
                + "\n TO_CHAR(PVP.VISIT_DATE, 'DD-MON-YY') VISIT_DATE, USR.NAME USR_NAME,"
                + "\n NVL(TO_CHAR(PVP.ACTION_DATE, 'DD-MON-YY'), SYSDATE) ACTION_DATE"
                + "\n FROM " + Database.DCMS.patientPendingVisit + " PPV,"
                + "\n" + Database.DCMS.patientPerformVisit + " PVP,"
                + "\n" + Database.DCMS.users + "USR,"
                + "\n" + Database.DCMS.EMRWEBPatient + " EWP, "
                + "\n" + Database.DCMS.definitionTypeDetail + " GEN, "
                + "\n" + Database.DCMS.definitionTypeDetail + " CTY";
        if (visitId.trim().length() == 0) {
            query += "\n  WHERE PPV.VISIT_DATE > SYSDATE - 1";
        }
        if (visitId.trim().length() != 0) {
            query += "\n WHERE VISIT_ID = " + visitId;
        }
        query += "\n AND PPV.VISIT_ID = PVP.VISIT_ID"
                + "\n AND PVP.PATIENT_ID = EWP.ID"
                + "\n AND NVL(PVP.ACTION_BY, 'GENERAL') = NVL(USR.USER_NAME, 'GENERAL')"
                + "\n AND EWP.GENDER_ID = GEN.ID"
                + "\n AND EWP.CITY_ID = CTY.ID";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<DoctorDiagnosis> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            DoctorDiagnosis setpatient = new DoctorDiagnosis();

            setpatient.setPatientId(map.get("PATIENT_ID").toString());
            setpatient.setFullName(map.get("FULL_NAME").toString());
            setpatient.setAge(map.get("AGE").toString());
            setpatient.setGenderId(map.get("GENDER_ID").toString());
            setpatient.setGenderDesc(map.get("GENDER_DESC").toString());
            setpatient.setContactNo(map.get("CONTACT_NO").toString());
            setpatient.setCityId(map.get("CITY_ID").toString());
            setpatient.setCityDescription(map.get("CITY_DESC").toString());
            setpatient.setArea(map.get("AREA").toString());
            setpatient.setEmpId(map.get("EMP_ID").toString());
            setpatient.setRegistrationDate(map.get("CRTD_DATE").toString());
            setpatient.setVisitId(map.get("VISIT_ID").toString());
            setpatient.setBPSys(map.get("BP_SYS").toString());
            setpatient.setBPDis(map.get("BP_DIS").toString());
            setpatient.setTemperature(map.get("TEMPERATURE").toString());
            setpatient.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            setpatient.setVisitDtae(map.get("VISIT_DATE").toString());
            setpatient.setActionBy(map.get("ACTION_BY").toString());
            setpatient.setActionByName(map.get("USR_NAME").toString());
            setpatient.setActionDate(map.get("ACTION_DATE").toString());
            list.add(setpatient);
        }
        return list;
    }

    public List<DoctorDiagnosis> selectVisitQuestionDetail(String visitId) {

        String[] selectColumns = {"-", "PATIENT_ID", "VISIT_ID", "SYMPTOM_STATUS",
            "SPECIALITY_WISE_SYMPTOMS_ID", "SYSMPTOM_DESC", "REMARKS", "CRTD_DATE"};

        String query
                = "SELECT PWS.PATIENT_ID, PWS.VISIT_ID,"
                + "\n PWS.SPECIALITY_WISE_SYMPTOMS_ID, NVL(PWS.REMARKS, ' ') REMARKS,"
                + "\n SYI.DESCRIPTION SYSMPTOM_DESC, PWS.SYMPTOM_STATUS,"
                + "\n  TO_CHAR(PWS.CRTD_DATE, 'DD-MON-YY') CRTD_DATE"
                + "\n FROM " + Database.DCMS.patientWiseSymptoms + " PWS, "
                + "\n" + Database.DCMS.definitionTypeDetail + " SYI"
                + "\n WHERE PWS.VISIT_ID = " + visitId
                + "\n AND PWS.SPECIALITY_WISE_SYMPTOMS_ID = SYI.ID";
        ;

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<DoctorDiagnosis> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            DoctorDiagnosis setpatient = new DoctorDiagnosis();

            setpatient.setPatientId(map.get("PATIENT_ID").toString());
            setpatient.setVisitId(map.get("VISIT_ID").toString());
            setpatient.setSymptomStatus(map.get("SYMPTOM_STATUS").toString());
            setpatient.setSpecialitySymptomId(map.get("SPECIALITY_WISE_SYMPTOMS_ID").toString());
            setpatient.setSpecialitySymptomDesc(map.get("SYSMPTOM_DESC").toString());
            setpatient.setSymptomRemarks(map.get("REMARKS").toString());
            setpatient.setCrtdDate(map.get("CRTD_DATE").toString());
            list.add(setpatient);
        }
        return list;
    }

    public List<DoctorDiagnosis> selectVisitMedicines(String visitId) {

        String[] selectColumns = {"-", "ID", "VISIT_ID", "ITEM_ID", "ITEM_NAME",
            "DOSE", "DOSE_DESC", "DAYS", "INSTRUCTIONS", "CRTD_BY", "CRTD_NAME",
            "CRTD_DATE"};

        String query
                = "SELECT MED.ID, MED.VISIT_ID, MED.ITEM_ID,"
                + "\n ITM.DESCRIPTION ITEM_NAME, MED.DAYS,MED.DOSE,"
                + "\n DSE.DESCRIPTION DOSE_DESC,MED. CRTD_BY, CRU.NAME CRTD_NAME,"
                + "\n NVL(MED.INSTRUCTIONS, ' ') INSTRUCTIONS,"
                + "\n TO_CHAR(MED.CRTD_DATE, 'DD-MON-YY') CRTD_DATE"
                + "\n FROM " + Database.DCMS.patientVisitMedicines + " MED, "
                + "\n" + Database.DCMS.item + " ITM, "
                + "\n" + Database.DCMS.definitionTypeDetail + " DSE,"
                + "\n" + Database.DCMS.users + " CRU"
                + "\n WHERE MED.VISIT_ID = " + visitId + ""
                + "\n AND MED.ITEM_ID = ITM.ID"
                + "\n  AND MED.DOSE = DSE.ID"
                + "\n AND MED.CRTD_BY = CRU.USER_NAME";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<DoctorDiagnosis> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            DoctorDiagnosis setpatient = new DoctorDiagnosis();

            setpatient.setMedicinePk(map.get("ID").toString());
            setpatient.setVisitId(map.get("VISIT_ID").toString());
            setpatient.setItemId(map.get("ITEM_ID").toString());
            setpatient.setItemDesc(map.get("ITEM_NAME").toString());
            setpatient.setDoseId(map.get("DOSE").toString());
            setpatient.setDoseDesc(map.get("DOSE_DESC").toString());
            setpatient.setDays(map.get("DAYS").toString());
            setpatient.setInstructions(map.get("INSTRUCTIONS").toString());
            setpatient.setCrtdBy(map.get("CRTD_BY").toString());
            setpatient.setCrtdByName(map.get("CRTD_NAME").toString());
            setpatient.setCrtdDate(map.get("CRTD_DATE").toString());
            list.add(setpatient);
        }
        return list;
    }

    public boolean insertVisitMedicines(DoctorDiagnosis item) {

        String[] columns = {Database.DCMS.patientVisitMedicines,
            "ID", "VISIT_ID", "ITEM_ID", "DOSE", "DAYS", "INSTRUCTIONS",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", " (SELECT NVL(MAX(ID) + 1, 1) FROM "
                + Database.DCMS.patientVisitMedicines + ")");
        map.put("VISIT_ID", "'" + item.getVisitId() + "'");
        map.put("ITEM_ID", "'" + item.getItemId() + "'");
        map.put("DOSE", "'" + item.getDoseId() + "'");
        map.put("DAYS", "'" + item.getDays() + "'");
        map.put("INSTRUCTIONS", "'" + item.getInstructions() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

}
