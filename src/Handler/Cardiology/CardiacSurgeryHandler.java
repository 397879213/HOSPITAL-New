/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Cardiology;

import BO.Cardiology.CardiacSurgeryBO;
import BO.Patient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class CardiacSurgeryHandler {

    public List<Patient> selectPateitnInformation(String patientId, String patientName) {

        String columns[] = {"-", "PATIENT_ID", "FULL_NAME", "GENDER", "CONTACT_NO",
            "ADDRESS", "CITY_ID", "CITY", "AGE", "GENDER_ID"}; //"NATIONALITY_ID", "NATIONALITY",

        String query = "SELECT PAT.PATIENT_ID,                          \n"
                + "        PAT.FULL_NAME,                               \n"
                + "        PAT.GENDER GENDER_ID,                        \n"
                + "        GEN.DESCRIPTION GENDER,                      \n"
                + "        PAT.CONTACT_NO,                              \n"
                + "        PAT.ADDRESS,                                 \n"
                + "        PAT.CITY_ID,                                 \n"
                + "        CTY.DESCRIPTION CITY,                        \n"
                //                + "        PAT.NATIONALITY_ID,                          \n"
                //                + "        NAT.DESCRIPTION NATIONALITY,                 \n"
                + "        trunc(months_between(sysdate, DOB) / 12) || ' (Y) ' ||\n"
                + "        trunc(months_between(sysdate, DOB) - "
                + " (trunc(months_between(sysdate, DOB) / 12) * 12)) || ' (M) ' ||\n"
                + "        (trunc(sysdate) - add_months("
                + " DOB, trunc(months_between(sysdate, DOB)))) || ' (D) ' AGE \n"
                + "   FROM " + Database.DCMS.outsidePatient + " PAT,     \n"
                //                + Database.DCMS.definitionTypeDetail + " NAT,           \n"
                + Database.DCMS.definitionTypeDetail + " GEN,           \n"
                + Database.DCMS.definitionTypeDetail + " CTY            \n"
                + "  WHERE 1 = 1                                        \n";
        if (patientId.length() != 0) {
            query += " AND PATIENT_ID = '" + patientId + "'     \n";
        }
        if (patientName.length() != 0) {
            query += " AND FULL_NAME LIKE '%" + patientName + "%'\n";
        }
        query += "    AND PAT.GENDER = GEN.ID                    \n"
                //                + "    AND PAT.NATIONALITY_ID = NAT.ID \n"
                + "    AND PAT.CITY_ID = CTY.ID                          \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<Patient> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            Patient objData = new Patient();

            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setFullName(map.get("FULL_NAME").toString());
            objData.setGenderId(map.get("GENDER_ID").toString());
            objData.setGenderDescription(map.get("GENDER").toString());
            objData.setAge(map.get("AGE").toString());
            objData.setContactNo(map.get("CONTACT_NO").toString());
            objData.setAddress(map.get("ADDRESS").toString());
            objData.setCityDescription(map.get("CITY").toString());
//        objData.setNationalityId(map.get("NATIONALITY_ID").toString());
//        objData.setNationalityDescription(map.get("NATIONALITY").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }

    public Patient selectCardiacSurgDetail(String patientId) {

        String columns[] = {"-", "PATIENT_ID", "FULL_NAME", "GENDER", "CONTACT_NO",
            "ADDRESS", "CITY_ID", "CITY", "NATIONALITY_ID", "NATIONALITY", "AGE"};

        String query = "SELECT CSM.ID,                      \n"
                + "       CSM.PATIENT_ID,                   \n"
                + "       CSM.INSTITUTE_ID,                 \n"
                + "       INS.DESCRIPTION INSTITUTE_DESC,   \n"
                + "       CSM.ADMISSION_NO,                 \n"
                + "       CSM.DATE_OF_SURGERY,              \n"
                + "       CSM.WARD_ID,                      \n"
                + "       WRD.DESCRIPTION WARD_DESC,        \n"
                + "       CSM.CATEGORY_ID,                  \n"
                + "       CTI.DESCRIPTION CATEGORY_DESC,    \n"
                + "       CSM.ADMITTING_CONSULTANT,         \n"
                + "       AMC.NAME ADMITTING_CONSULTANT_NAME,\n"
                + "       CSM.CONSULTANT_CARDIOLOGIST,      \n"
                + "       CCT.NAME CONSULTANT_CARDIOLOGIST_NAME,\n"
                + "       CSM.CRTD_BY,                      \n"
                + "       CRU.USER_NAME CRTD_BY_NAME CSM.CRTD_DATE,\n"
                + "       CSM.CRTD_TERMINAL_ID,             \n"
                + "       CSM.IS_FINAL,                     \n"
                + "       CSM.FINAL_BY,                     \n"
                + "       CSM.FINAL_DATE,                   \n"
                + "       CSM.FINAL_TERMINAL_ID,            \n"
                + "       CSM.REMARKS                       \n"
                + "  FROM " + Database.DCMS.cardiacSurgeryMaster + " CSM,\n"
                + Database.DCMS.definitionTypeDetail + " INS,\n"
                + Database.DCMS.ward + " WRD,\n"
                + Database.DCMS.definitionTypeDetail + " CTI,\n"
                + Database.DCMS.users + " AMC,\n"
                + Database.DCMS.users + " CCT,\n"
                + Database.DCMS.users + " CRU\n"
                + " WHERE ID = '" + patientId + "'\n"
                + "   AND CSM.INSTITUTE_ID = INS.ID\n"
                + "   AND CSM.WARD_ID = WRD.ID\n"
                + "   AND CSM.CATEGORY_ID = CTI.ID\n"
                + "   AND CSM.ADMITTING_CONSULTANT = AMC.USER_NAME\n"
                + "   AND CSM.CONSULTANT_CARDIOLOGIST = CCT.USER_NAME\n"
                + "   AND CSM.CRTD_BY = CRU.USER_NAME";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        HashMap map = (HashMap) listmap.get(0);
        Patient objData = new Patient();

        objData.setPatientId(map.get("PATIENT_ID").toString());
        objData.setFullName(map.get("FULL_NAME").toString());
        objData.setGenderDescription(map.get("GENDER").toString());
        objData.setAge(map.get("AGE").toString());
        objData.setContactNo(map.get("CONTACT_NO").toString());
        objData.setAddress(map.get("ADDRESS").toString());
        objData.setCityDescription(map.get("CITY").toString());
        objData.setNationalityId(map.get("NATIONALITY_ID").toString());
        objData.setNationalityDescription(map.get("NATIONALITY").toString());
        return objData;
    }

    public boolean insertCardiacSurgeryMaster(CardiacSurgeryBO insert) {

        String[] columns = {Database.DCMS.cardiacSurgeryMaster,
            "ID", "PATIENT_ID", "INSTITUTE_ID", "ADMISSION_NO", "DATE_OF_SURGERY",
            "WARD_ID", "CATEGORY_ID", "ADMITTING_CONSULTANT", "CONSULTANT_CARDIOLOGIST",
            "IS_FINAL", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "FINAL_BY",
            "FINAL_DATE", "FINAL_TERMINAL_ID", "REMARKS",};

        HashMap map = new HashMap();
        map.put("ID", "'" + insert.getPatientId() + "'");
        map.put("PATIENT_ID", "'" + insert.getPatientId() + "'");
        map.put("INSTITUTE_ID", "'" + insert.getInstituteId() + "'");
        map.put("ADMISSION_NO", "'" + insert.getAdmissionNo() + "'");
        map.put("DATE_OF_SURGERY", "'" + insert.getDateOfSurgery() + "'");
        map.put("WARD_ID", "'" + insert.getWardId() + "'");
        map.put("CATEGORY_ID", "'" + insert.getCategoryId() + "'");
        map.put("ADMITTING_CONSULTANT", "'" + insert.getAdmittingConsultantId() + "'");
        map.put("CONSULTANT_CARDIOLOGIST", "'" + insert.getConsultantCardiologistId() + "'");
        map.put("IS_FINAL", "'N'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("FINAL_BY", "'" + insert.getFinalBy() + "'");
        map.put("FINAL_DATE", "'" + insert.getFinalDate() + "'");
        map.put("FINAL_TERMINAL_ID", "'" + insert.getFinalTerminalId() + "'");
        map.put("REMARKS", "'" + insert.getRemarks() + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

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

    public List<CardiacSurgeryBO> selectExamDetail() {

        String columns[] = {"-", "ID", "DESCRIPTION"};

        String query = "SELECT ID, DESCRIPTION FROM \n"
                + Database.DCMS.definitionType + "  \n"
                + "  WHERE ID > 436 AND ID < 455    \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacSurgeryBO> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacSurgeryBO objData = new CardiacSurgeryBO();
            objData.setExamId(map.get("ID").toString());
            objData.setExamDescription(map.get("DESCRIPTION").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }
    
    public boolean insertExamDetail(List<CardiacSurgeryBO> listExam) {

        String[] columns = {Database.DCMS.compoundAdditiveDetail,
            "CARDIAC_ID", "EXAM_TYPE_ID", "EXAM_DETAIL_ID", "REMARKS"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listExam.size(); i++) {
            CardiacSurgeryBO comp = listExam.get(i);
            HashMap map = new HashMap();
            map.put("CARDIAC_ID", "'" + comp.getId()+ "'");
            map.put("EXAM_TYPE_ID", "'" + comp.getExamId()+ "'");
            map.put("EXAM_DETAIL_ID", "'" + comp.getExamDetailId()+ "'");
            map.put("REMARKS", "'" + comp.getExamRemarks()+ "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_DATE", "SYSDATE");
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

}
