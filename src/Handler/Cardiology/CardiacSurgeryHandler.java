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

    public Patient selectPateitnInformation(String patientId) {

        String columns[] = {"-", "PATIENT_ID", "FULL_NAME", "GENDER", "CONTACT_NO",
            "ADDRESS", "CITY_ID", "CITY", "NATIONALITY_ID", "NATIONALITY", "AGE"};

        String query = "SELECT PAT.PATIENT_ID,                          \n"
                + "        PAT.FULL_NAME,                               \n"
                + "        GEN.DESCRIPTION GENDER,                      \n"
                + "        PAT.CONTACT_NO,                              \n"
                + "        PAT.ADDRESS,                                 \n"
                + "        PAT.CITY_ID,                                 \n"
                + "        CTY.DESCRIPTION CITY,                        \n"
                + "        PAT.NATIONALITY_ID,                          \n"
                + "        NAT.DESCRIPTION NATIONALITY,                 \n"
                + "        trunc(months_between(sysdate, DOB) / 12) || ' (Y) ' ||\n"
                + "        trunc(months_between(sysdate, DOB) - "
                + " (trunc(months_between(sysdate, DOB) / 12) * 12)) || ' (M) ' ||\n"
                + "        (trunc(sysdate) - add_months("
                + " DOB, trunc(months_between(sysdate, DOB)))) || ' (D) ' AGE \n"
                + "   FROM " + Database.DCMS.patient + " PAT,           \n"
                + Database.DCMS.definitionTypeDetail + " NAT,           \n"
                + Database.DCMS.definitionTypeDetail + " GEN,           \n"
                + Database.DCMS.definitionTypeDetail + " CTY            \n"
                + "  WHERE PATIENT_ID = '" + patientId + "'             \n"
                + "    AND PAT.GENDER_ID = GEN.ID                       \n"
                + "    AND PAT.NATIONALITY_ID = NAT.ID                  \n"
                + "    AND PAT.CITY_ID = CTY.ID";

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
        map.put("ID", "(SELECT MAX(ID) + 1 FROM " + Database.DCMS.cardiacSurgeryMaster + ")");
        map.put("PATIENT_ID", "'" + insert.getPatientId() + "'");
        map.put("INSTITUTE_ID", "'" + insert.getInstituteId() + "'");
        map.put("ADMISSION_NO", "'" + insert.getAdmissionNo() + "'");
        map.put("DATE_OF_SURGERY", "'" + insert.getDateOfSurgery() + "'");
        map.put("WARD_ID", "'" + insert.getWardId() + "'");
        map.put("CATEGORY_ID", "'" + insert.getCategoryId() + "'");
        map.put("ADMITTING_CONSULTANT", "'" + insert.getAdmittingConsultant() + "'");
        map.put("CONSULTANT_CARDIOLOGIST", "'" + insert.getConsultantCardiologist() + "'");
        map.put("IS_FINAL", "'N'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("FINAL_BY", "'" + insert.getFinalBy() + "'");
        map.put("FINAL_DATE", "'" + insert.getFinalDate()+ "'");
        map.put("FINAL_TERMINAL_ID", "'" + insert.getFinalTerminalId()+ "'");
        map.put("REMARKS", "'" + insert.getRemarks()+ "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }
}
