/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.CardiacSurgeryBO;
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

        String columns[] = {"-", "ID", "PATIENT_ID", "FULL_NAME", "GENDER", "CONTACT_NO",
            "ADDRESS", "CITY_ID", "CITY", "AGE", "GENDER_ID"}; //"NATIONALITY_ID", "NATIONALITY",

        String query = "SELECT PAT.ID, PAT.PATIENT_ID,                  \n"
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
                + "   FROM " + Database.DCMS.outsidePatient + " PAT,     \n" //                + Database.DCMS.definitionTypeDetail + " NAT,           \n"
                + Database.DCMS.definitionTypeDetail + " GEN,            \n"
                + Database.DCMS.definitionTypeDetail + " CTY             \n"
                + "  WHERE 1 = 1                                         \n";
        if (patientId.length() != 0) {
            query += " AND PAT.PATIENT_ID = '" + patientId + "'          \n";
        }
        if (patientName.length() != 0) {
            query += " AND PAT.FULL_NAME LIKE '%" + patientName + "%'   \n";
        }
        query += "    AND PAT.GENDER = GEN.ID                           \n"
                //                + "    AND PAT.NATIONALITY_ID = NAT.ID \n"
                + "    AND PAT.CITY_ID = CTY.ID                         \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<Patient> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            Patient objData = new Patient();

            objData.setId(map.get("ID").toString());
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

    public CardiacSurgeryBO selectCardiacSurgDetail(String id) {

        String columns[] = {"-", "ID", "PATIENT_ID", "INSTITUTE_ID", "INSTITUTE_DESC",
            "ADMISSION_NO", "DATE_OF_SURGERY", "DAY_OF_SURGERY", "WARD_ID", "WARD_DESC",
            "CATEGORY_ID", "CATEGORY_DESC", "ADMITTING_CONSULTANT", "ADMITTING_CONSULTANT_NAME",
            "CONSULTANT_CARDIOLOGIST", "CONSULTANT_CARDIOLOGIST_NAME", "CRTD_BY",
            "CRTD_BY_NAME", "CRTD_DATE", "CRTD_TERMINAL_ID", "IS_FINAL", "FINAL_BY",
            "FINAL_DATE", "FINAL_TERMINAL_ID", "REMARKS"};

        String query = "SELECT CSM.ID,                      \n"
                + "       CSM.PATIENT_ID,                   \n"
                + "       CSM.INSTITUTE_ID,                 \n"
                + "       INS.DESCRIPTION INSTITUTE_DESC,   \n"
                + "       CSM.ADMISSION_NO,                 \n"
                + "       CSM.DATE_OF_SURGERY,              \n"
                + " NVL(ROUND(CSM.DATE_OF_SURGER - (SYSDATE+1)), 0) DAY_OF_SURGERY,\n"
                + "       CSM.WARD_ID,                      \n"
                + "       WRD.DESCRIPTION WARD_DESC,        \n"
                + "       CSM.CATEGORY_ID,                  \n"
                + "       CTI.DESCRIPTION CATEGORY_DESC,    \n"
                + "       CSM.ADMITTING_CONSULTANT,         \n"
                + "       AMC.DESCRIPTION ADMITTING_CONSULTANT_NAME,\n"
                + "       CSM.CONSULTANT_CARDIOLOGIST,      \n"
                + "       CCT.DESCRIPTION CONSULTANT_CARDIOLOGIST_NAME,\n"
                + "       CSM.CRTD_BY,                      \n"
                + "       CRU.USER_NAME CRTD_BY_NAME        \n"
                + "       CSM.CRTD_DATE,                    \n"
                + "       CSM.CRTD_TERMINAL_ID,             \n"
                + "       CSM.IS_FINAL,                     \n"
                + "       CSM.FINAL_BY,                     \n"
                + "       CSM.FINAL_DATE,                   \n"
                + "       CSM.FINAL_TERMINAL_ID,            \n"
                + "       CSM.REMARKS                       \n"
                + "  FROM " + Database.DCMS.cardiacSurgeryMaster + " CSM,\n"
                + Database.DCMS.definitionTypeDetail + " INS,\n"
                + Database.DCMS.ward + " WRD,               \n"
                + Database.DCMS.definitionTypeDetail + " CTI,\n"
                + Database.DCMS.definitionTypeDetail + " AMC,\n"
                + Database.DCMS.definitionTypeDetail + " CCT,\n"
                + Database.DCMS.definitionTypeDetail + " CRU\n"
                + " WHERE ID = '" + id + "'                 \n"
                + "   AND CSM.INSTITUTE_ID = INS.ID         \n"
                + "   AND CSM.WARD_ID = WRD.ID              \n"
                + "   AND CSM.CATEGORY_ID = CTI.ID          \n"
                + "   AND CSM.ADMITTING_CONSULTANT = AMC.ID \n"
                + "   AND CSM.CONSULTANT_CARDIOLOGIST = CCT.ID\n"
                + "   AND CSM.CRTD_BY = CRU.USER_NAME       \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        HashMap map = (HashMap) listmap.get(0);
        CardiacSurgeryBO objData = new CardiacSurgeryBO();

        objData.setId(map.get("ID").toString());
        objData.setPatientId(map.get("PATIENT_ID").toString());
        objData.setInstituteId(map.get("INSTITUTE_ID").toString());
        objData.setInstituteDescription(map.get("INSTITUTE_DESC").toString());
        objData.setAdmissionNo(map.get("ADMISSION_NO").toString());
        objData.setDateOfSurgery(map.get("DATE_OF_SURGERY").toString());
        objData.setDayOfSurgery(map.get("DAY_OF_SURGERY").toString());
        objData.setWardId(map.get("WARD_ID").toString());
        objData.setWardDescription(map.get("WARD_DESC").toString());
        objData.setCategoryId(map.get("CATEGORY_ID").toString());
        objData.setCategoryDescription(map.get("CATEGORY_DESC").toString());
        objData.setAdmittingConsultantId(map.get("ADMITTING_CONSULTANT").toString());
        objData.setAdmittingConsultantName(map.get("ADMITTING_CONSULTANT_NAME").toString());
        objData.setConsultantCardiologistId(map.get("CONSULTANT_CARDIOLOGIST").toString());
        objData.setConsultantCardiologistName(map.get("CONSULTANT_CARDIOLOGIST_NAME").toString());
        objData.setCrtdBy(map.get("CRTD_BY").toString());
        objData.setCrtdByName(map.get("CRTD_BY_NAME").toString());
        objData.setCrtdDate(map.get("CRTD_DATE").toString());
        objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
        objData.setIsFinal(map.get("IS_FINAL").toString());
        objData.setFinalBy(map.get("FINAL_BY").toString());
        objData.setFinalDate(map.get("FINAL_DATE").toString());
        objData.setFinalTerminalId(map.get("FINAL_TERMINAL_ID").toString());
        objData.setRemarks(map.get("REMARKS").toString());
        
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
            objData.setId(map.get("CARDIAC_ID").toString());
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
                + " WHERE CARDIAC_ID = '" + cardiac.getId() + "'             \n"
                + " AND EXAM_TYPE_ID = '" + cardiac.getExamId() + "'         \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateExamDetailRemarks(CardiacSurgeryBO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardiacHistoryDetail + "\n"
                + " SET REMARKS  = '" + cardiac.getExamRemarks() + "'\n"
                + " WHERE CARDIAC_ID = '" + cardiac.getId() + "'    \n"
                + " AND EXAM_TYPE_ID = '" + cardiac.getExamId() + "' \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertCardiacProcedureDetail(CardiacSurgeryBO insert) {

        String[] columns = {Database.DCMS.cardiacProcedureDetail,
            "CARDIAC_ID", "PROCEDURE_TYPE", "PROCEDURE_ID", "DATE_OF_PROCEDURE",
            "INSTITUTE_ID", "PERFORMING_PHYSICIAN_ID", "REMARKS", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID", "ACTIVE"};

        HashMap map = new HashMap();
        map.put("CARDIAC_ID", "'" + insert.getId() + "'");
        map.put("PROCEDURE_TYPE", "'" + insert.getProcedureType() + "'");
        map.put("PROCEDURE_ID", "'" + insert.getProcedureId() + "'");
        map.put("DATE_OF_PROCEDURE", "'" + insert.getDateOfProcedure() + "'");
        map.put("INSTITUTE_ID", "'" + insert.getInstituteId() + "'");
        map.put("PERFORMING_PHYSICIAN_ID", "'" + insert.getPerformingPhysicianId() + "'");
        map.put("REMARKS", "'" + insert.getProcedureRemarks() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("ACTIVE", "'Y'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateCardiacProcedureDetail(CardiacSurgeryBO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardiacProcedureDetail + "\n"
                + " SET DATE_OF_PROCEDURE  = '" + cardiac.getDateOfProcedure() + "',\n"
                + " INSTITUTE_ID  = '" + cardiac.getInstituteId() + "',\n"
                + " PERFORMING_PHYSICIAN_ID  = '" + cardiac.getPerformingPhysicianId() + "',\n"
                + " REMARKS  = '" + cardiac.getProcedureRemarks() + "' \n"
                + " WHERE CARDIAC_ID = '" + cardiac.getId() + "'    \n"
                + " AND PROCEDURE_ID = '" + cardiac.getProcedureId() + "' \n";

        return Constants.dao.executeUpdate(query, false);
    }

    public List<CardiacSurgeryBO> selectCardiacProcedureDetail(String cardiacId) {

        String columns[] = {"-", "CARDIAC_ID", "PROCEDURE_TYPE", "PROCEDURE_ID",
            "PROCEDURE_DESC", "DATE_OF_PROCEDURE", "INSTITUTE_ID", "INSTITUTE_DESC",
            "PERFORMING_PHYSICIAN_ID", "PERFORMING_PHY_NAME", "REMARKS", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID", "ACTIVE", "CRTD_BY_NAME", "DAY_OF_PROCEDURE"};

        String query
                = "SELECT CPD.CARDIAC_ID,                           \n"
                + "       CPD.PROCEDURE_TYPE,                       \n"
                + "       CPD.PROCEDURE_ID,                         \n"
                + "       PCI.DESCRIPTION PROCEDURE_DESC,           \n"
                + " NVL(ROUND(CPD.DATE_OF_PROCEDURE - (SYSDATE+1)), 0) DAY_OF_PROCEDURE,\n"
                + " TO_CHAR(CPD.DATE_OF_PROCEDURE, 'DD-MON-YY') DATE_OF_PROCEDURE,\n"
                + "       CPD.INSTITUTE_ID,                         \n"
                + "       INS.DESCRIPTION INSTITUTE_DESC,           \n"
                + "       CPD.PERFORMING_PHYSICIAN_ID,              \n"
                + "       PPI.NAME PERFORMING_PHY_NAME,             \n"
                + "       CPD.ACTIVE,                               \n"
                + " NVL(CPD.REMARKS, ' ') REMARKS,                  \n"
                + "       CPD.CRTD_BY,                              \n"
                + " TO_CHAR(CPD.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,  \n"
                + "       CPD.CRTD_TERMINAL_ID,                     \n"
                + "       CRB.NAME  CRTD_BY_NAME FROM               \n"
                + Database.DCMS.cardiacProcedureDetail + " CPD,     \n"
                + Database.DCMS.definitionTypeDetail + " INS,       \n"
                + Database.DCMS.definitionTypeDetail + " PCI,       \n"
                + Database.DCMS.users + " CRB ,                     \n"
                + Database.DCMS.users + " PPI                       \n"
                + " WHERE CPD.CARDIAC_ID = " + cardiacId + "        \n"
                + "   AND CPD.ACTIVE = 'Y'                          \n"
                + "   AND CPD.PROCEDURE_ID = PCI.ID                 \n"
                + "   AND CPD.INSTITUTE_ID = INS.ID                 \n"
                + "   AND CPD.CRTD_BY = CRB.USER_NAME               \n"
                + "   AND CPD.PERFORMING_PHYSICIAN_ID = PPI.USER_NAME\n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<CardiacSurgeryBO> lisExam = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            CardiacSurgeryBO objData = new CardiacSurgeryBO();

            objData.setId(map.get("CARDIAC_ID").toString());
            objData.setProcedureType(map.get("PROCEDURE_TYPE").toString());
            objData.setProcedureId(map.get("PROCEDURE_ID").toString());
            objData.setProcedureDescription(map.get("PROCEDURE_DESC").toString());
            objData.setDateOfProcedure(map.get("DATE_OF_PROCEDURE").toString());
            objData.setDayOfProcedure(map.get("DAY_OF_PROCEDURE").toString());
            objData.setInstituteId(map.get("INSTITUTE_ID").toString());
            objData.setInstituteDescription(map.get("INSTITUTE_DESC").toString());
            objData.setPerformingPhysicianId(map.get("PERFORMING_PHYSICIAN_ID").toString());
            objData.setPerformingPhysicianName(map.get("PERFORMING_PHY_NAME").toString());
            objData.setProcedureRemarks(map.get("REMARKS").toString());
            objData.setActive(map.get("ACTIVE").toString());
            objData.setCrtdBy(map.get("CRTD_BY").toString());
            objData.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            objData.setCrtdDate(map.get("CRTD_DATE").toString());
            objData.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            lisExam.add(objData);
        }
        return lisExam;
    }

    public boolean cancelProcedure(CardiacSurgeryBO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardiacProcedureDetail + " \n"
                + " SET ACTIVE  = 'N'                                   \n"
                + " WHERE CARDIAC_ID = '" + cardiac.getId() + "'        \n"
                + " AND PROCEDURE_ID = '" + cardiac.getProcedureId() + "' \n";

        return Constants.dao.executeUpdate(query, false);
    }

}
