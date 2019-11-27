/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Cardiology;

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

    public List<Patient> selectPateitnInformation(String patientId) {

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

        System.out.println(" Data : " + listmap.size());
        List<Patient> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
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

            lisVerRep.add(objData);
        }

        return lisVerRep;
    }
}
