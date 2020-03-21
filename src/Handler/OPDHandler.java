/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.LOV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Actions;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Pacslink
 */
public class OPDHandler {

    public List<LOV> selectMedicineIntakeType() {
        String[] columns = {Database.DCMS.medicinePackage, "ID", "DESCRIPTION"};
        String query
                = " SELECT ID, DESCRIPTION FROM \n"
                + Database.DCMS.medicineFrequency + "                   \n"
                + " WHERE ACTION_ID = " + Actions.intakeMed + "         \n"
                + " AND ACTIVE = 'Y'                                    \n"
                + " ORDER BY POSITION                                   \n";

        List vec = Constants.dao.selectData(query, columns);
        List listIntake = new ArrayList();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            LOV med = new LOV();
            med.setId(map.get("ID").toString());
            med.setDescription(map.get("DESCRIPTION").toString());
            listIntake.add(med);
        }
        return listIntake;

    }

}
