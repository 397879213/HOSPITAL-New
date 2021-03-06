/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Handler;

import CardiacRegistry.BO.CardiacSurgeryBO;
import CardiacRegistry.BO.OutsidePatientRegistry;
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

    public List<OutsidePatientRegistry> selectPateitnInformation(String patientId,
            String patientName, String instituteId) {

        String columns[] = {"-", "ID", "PATIENT_ID", "FULL_NAME", "GENDER", "CONTACT_NO",
            "ADDRESS", "CITY_ID", "CITY", "AGE", "GENDER_ID", "INSTITUTE_ID", "GENDER_ID",
            "INSTITUTE_DESC"}; //"NATIONALITY_ID", "NATIONALITY",

        String query = "SELECT PAT.ID, PAT.PATIENT_ID,           \n"
                + "        PAT.FULL_NAME,                        \n"
                + "        PAT.GENDER_ID,                        \n"
                + "        GEN.DESCRIPTION GENDER,               \n"
                + "        PAT.CONTACT_NO,                       \n"
                + "        PAT.ADDRESS,                          \n"
                + "        PAT.CITY_ID,                          \n"
                + "        PAT.INSTITUTE_ID,                     \n"
                + "        INS.DESCRIPTION INSTITUTE_DESC,       \n"
                + "        CTY.DESCRIPTION CITY,                 \n"
                //                + "        PAT.NATIONALITY_ID,                          \n"
                //                + "        NAT.DESCRIPTION NATIONALITY,                 \n"
                + "        trunc(months_between(sysdate, DOB) / 12) || ' (Y) ' ||\n"
                + "        trunc(months_between(sysdate, DOB) - "
                + " (trunc(months_between(sysdate, DOB) / 12) * 12)) || ' (M) ' ||\n"
                + "        (trunc(sysdate) - add_months("
                + " DOB, trunc(months_between(sysdate, DOB)))) || ' (D) ' AGE \n"
                + "   FROM " + Database.DCMS.outsidePatient + " PAT,     \n"
                //                + Database.DCMS.definitionTypeDetail + " NAT,           \n"
                + Database.DCMS.definitionTypeDetail + " GEN,            \n"
                + Database.DCMS.definitionTypeDetail + " INS,            \n"
                + Database.DCMS.definitionTypeDetail + " CTY             \n"
                + "  WHERE 1 = 1                                         \n";
        if (patientId.length() != 0) {
            query += " AND PAT.PATIENT_ID = '" + patientId + "'          \n";
        }
        if (patientName.length() != 0) {
            query += " AND PAT.FULL_NAME LIKE '%" + patientName + "%'   \n";
        }
        if (instituteId.length() != 0) {
            query += " AND PAT.INSTITUTE_ID = '" + instituteId + "'     \n";
        }
        query += "    AND PAT.GENDER_ID = GEN.ID                         \n"
                //                + "    AND PAT.NATIONALITY_ID = NAT.ID \n"
                + "    AND PAT.INSTITUTE_ID = INS.ID                    \n"
                + "    AND PAT.CITY_ID = CTY.ID                         \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<OutsidePatientRegistry> lisPatient = new ArrayList();
        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            OutsidePatientRegistry objData = new OutsidePatientRegistry();

            objData.setId(map.get("ID").toString());
            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setPatientFullName(map.get("FULL_NAME").toString());
            objData.setGender(map.get("GENDER_ID").toString());
            objData.setGender(map.get("GENDER").toString());
            objData.setAge(map.get("AGE").toString());
            objData.setContactNo(map.get("CONTACT_NO").toString());
            objData.setAddress(map.get("ADDRESS").toString());
            objData.setCity(map.get("CITY").toString());
            objData.setInstituteId(map.get("INSTITUTE_ID").toString());
            objData.setInstituteDescription(map.get("INSTITUTE_DESC").toString());
//        objData.setNationalityId(map.get("NATIONALITY_ID").toString());
//        objData.setNationalityDescription(map.get("NATIONALITY").toString());
            lisPatient.add(objData);
        }
        return lisPatient;
    }

    public CardiacSurgeryBO selectCardiacSurgDetail(String id) {

        String columns[] = {"-", "CARDIAC_ID", "PATIENT_ID", //"INSTITUTE_ID", "INSTITUTE_DESC",
            "ADMISSION_NO", "DATE_OF_SURGERY", "DAY_OF_SURGERY", "WARD_ID", "WARD_DESC",
            "CATEGORY_ID", "CATEGORY_DESC", "ADMITTING_CONSULTANT", "ADMITTING_CONSULTANT_NAME",
            "CONSULTANT_CARDIOLOGIST", "CONSULTANT_CARDIOLOGIST_NAME", "CRTD_BY",
            "CRTD_BY_NAME", "CRTD_DATE", "CRTD_TERMINAL_ID", "IS_FINAL", "FINAL_BY",
            "FINAL_DATE", "FINAL_TERMINAL_ID", "REMARKS", "CONSULTANT_SURGEON_ID",
            "CONSULTANT_SURGEON_NAME", "CONTACT_PER_NAME", "CONTACT_PER_NUMBER",
            "CONTACT_PER_ADDRES"};

        String query = "SELECT CSM.CARDIAC_ID,                      \n"
                + "       CSM.PATIENT_ID,                   \n"
                //                + "       CSM.INSTITUTE_ID,                 \n"
                //                + "       INS.DESCRIPTION INSTITUTE_DESC,   \n"
                + " NVL(CSM.ADMISSION_NO, 1) ADMISSION_NO,  \n"
                + "       CSM.DATE_OF_SURGERY,              \n"
                + " NVL(ROUND(CSM.DATE_OF_SURGERY - (SYSDATE+1)), 0) DAY_OF_SURGERY,\n"
                + "       CSM.WARD_ID,                      \n"
                + "       WRD.DESCRIPTION WARD_DESC,        \n"
                + "       CSM.CATEGORY_ID,                  \n"
                + "       CTI.DESCRIPTION CATEGORY_DESC,    \n"
                + "       CSM.ADMITTING_CONSULTANT,         \n"
                + "       AMC.DESCRIPTION ADMITTING_CONSULTANT_NAME,\n"
                + "       CSM.CONSULTANT_CARDIOLOGIST,      \n"
                + "       CCT.DESCRIPTION CONSULTANT_CARDIOLOGIST_NAME,\n"
                + "       CSM.CONSULTANT_SURGEON_ID,        \n"
                + "       CSI.DESCRIPTION CONSULTANT_SURGEON_NAME,\n"
                + "       CSM.CONTACT_PER_NAME,             \n"
                + "       CSM.CONTACT_PER_NUMBER,           \n"
                + " NVL(CSM.CONTACT_PER_ADDRES, ' ') CONTACT_PER_ADDRES,\n"
                + "       CSM.CRTD_BY,                      \n"
                + "       CRU.USER_NAME CRTD_BY_NAME,       \n"
                + "       CSM.CRTD_DATE,                    \n"
                + "       CSM.CRTD_TERMINAL_ID,             \n"
                + "       CSM.IS_FINAL,                     \n"
                + " NVL(CSM.FINAL_BY, ' ') FINAL_BY,        \n"
                + " NVL(CSM.FINAL_DATE, SYSDATE) FINAL_DATE,\n"
                + " NVL(CSM.FINAL_TERMINAL_ID, ' ') FINAL_TERMINAL_ID,\n"
                + "       CSM.REMARKS                       \n"
                + "  FROM " + Database.DCMS.cardiacRegistryMaster + " CSM,\n"
                //                + Database.DCMS.definitionTypeDetail + " INS,\n"
                + Database.DCMS.ward + " WRD,                \n"
                + Database.DCMS.definitionTypeDetail + " CTI,\n"
                + Database.DCMS.definitionTypeDetail + " AMC,\n"
                + Database.DCMS.definitionTypeDetail + " CCT,\n"
                + Database.DCMS.definitionTypeDetail + " CSI,\n"
                + Database.DCMS.users + " CRU               \n"
                + " WHERE CSM.CARDIAC_ID = '" + id + "'     \n"
                //                + "   AND CSM.INSTITUTE_ID = INS.ID         \n"
                + "   AND CSM.WARD_ID = WRD.ID              \n"
                + "   AND CSM.CATEGORY_ID = CTI.ID          \n"
                + "   AND CSM.ADMITTING_CONSULTANT = AMC.ID \n"
                + "   AND CSM.CONSULTANT_CARDIOLOGIST = CCT.ID\n"
                + "   AND CSM.CONSULTANT_SURGEON_ID = CSI.ID\n"
                + "   AND CSM.CRTD_BY = CRU.USER_NAME       \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        if (listmap.isEmpty()) {
            return null;
        }
        HashMap map = (HashMap) listmap.get(0);
        CardiacSurgeryBO objData = new CardiacSurgeryBO();

        objData.setCardiacRegistryId(map.get("CARDIAC_ID").toString());
        objData.setPatientId(map.get("PATIENT_ID").toString());
//        objData.setInstituteId(map.get("INSTITUTE_ID").toString());
//        objData.setInstituteDescription(map.get("INSTITUTE_DESC").toString());
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
        objData.setConsultantSurgeonId(map.get("CONSULTANT_SURGEON_ID").toString());
        objData.setConsultantSurgeonName(map.get("CONSULTANT_SURGEON_NAME").toString());
        objData.setContactPerName(map.get("CONTACT_PER_NAME").toString());
        objData.setContactPerContactNo(map.get("CONTACT_PER_NUMBER").toString());
        objData.setContactPerAddress(map.get("CONTACT_PER_ADDRES").toString());

        return objData;
    }

    public boolean insertCardiacRegisteryMaster(CardiacSurgeryBO insert) {

        String[] columns = {Database.DCMS.cardiacRegistryMaster,
            "CARDIAC_ID", "PATIENT_ID", "INSTITUTE_ID", "ADMISSION_NO", "DATE_OF_SURGERY",
            "WARD_ID", "CATEGORY_ID", "ADMITTING_CONSULTANT", "CONSULTANT_CARDIOLOGIST",
            "IS_FINAL", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "FINAL_BY",
            "FINAL_DATE", "FINAL_TERMINAL_ID", "REMARKS", "CONSULTANT_SURGEON_ID",
            "CONTACT_PER_NAME", "CONTACT_PER_NUMBER", "CONTACT_PER_ADDRES"};

        HashMap map = new HashMap();
        map.put("CARDIAC_ID", "'" + insert.getCardiacRegistryId() + "'");
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
        map.put("CONSULTANT_SURGEON_ID", "'" + insert.getConsultantSurgeonId() + "'");
        map.put("CONTACT_PER_NAME", "'" + insert.getContactPerName() + "'");
        map.put("CONTACT_PER_NUMBER", "'" + insert.getContactPerContactNo() + "'");
        map.put("CONTACT_PER_ADDRES", "'" + insert.getContactPerAddress() + "'");
        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateCardiacRegisteryMaster(CardiacSurgeryBO cardiac) {
        String query
                = " UPDATE " + Database.DCMS.cardiacRegistryMaster + "\n"
                + "SET DATE_OF_SURGERY  = '" + cardiac.getDateOfSurgery() + "',\n"
                + "WARD_ID  = '" + cardiac.getWardId() + "',\n"
                + "CATEGORY_ID  = '" + cardiac.getCategoryId() + "',\n"
                + "ADMITTING_CONSULTANT  = '" + cardiac.getAdmittingConsultantId() + "',\n"
                + "CONSULTANT_CARDIOLOGIST  = '" + cardiac.getConsultantCardiologistId() + "',\n"
                //                + "IS_FINAL = '" + cardiac.getIsFinal() + "',\n"
                //                + "FINAL_BY  = '" + cardiac.getFinalBy() + "',\n"
                //                + "FINAL_DATE  = " + cardiac.getFinalDate() + ",\n"
                //                + "FINAL_TERMINAL_ID  = '" + cardiac.getFinalTerminalId() + "',\n"
                + "REMARKS  = '" + cardiac.getRemarks() + "',\n"
                + "CONSULTANT_SURGEON_ID  = '" + cardiac.getConsultantSurgeonId() + "',\n"
                + "CONTACT_PER_NAME  = '" + cardiac.getContactPerName() + "',\n"
                + "CONTACT_PER_NUMBER  = '" + cardiac.getContactPerContactNo() + "',\n"
                + "CONTACT_PER_ADDRES  = '" + cardiac.getContactPerAddress() + "' \n"
                + " WHERE CARDIAC_ID = '" + cardiac.getCardiacRegistryId() + "'    \n";

        return Constants.dao.executeUpdate(query, false);
    }
}
