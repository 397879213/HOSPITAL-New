/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.MonthlyLocationExpense;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class MonthlyLocationExpenseHandler {

    public List<MonthlyLocationExpense> monthlyLocationExpense(String expMonth,
            String closeStatus) {

        String columns[] = {"-", "EXP_MASTER_ID", "EXPENSE_TYPE_ID", "EXP_NAME",
            "AMOUNT", "EXPENSE_MONTH"};

        String query
                = "SELECT DTD.ID EXP_MASTER_ID,                     \n"
                + " MED.EXPENSE_TYPE_ID,                            \n"
                + " DTD.DESCRIPTION EXP_NAME,                       \n"
                + " MED.AMOUNT,                                     \n"
                + " MEM.EXPENSE_MONTH  FROM                         \n"
                + Database.DCMS.locMonthlyExpDetail + " MED,        \n"
                + Database.DCMS.locMonthlyExpDetail + " MEM,        \n"
                + Database.DCMS.definitionTypeDetail + " DTD        \n"
                + " WHERE MED.EXP_MASTER_ID = '1'                   \n"
                + " AND MEM.ID = MED.EXP_MASTER_ID                  \n";
        
        if (!expMonth.equalsIgnoreCase("N")) {
            query += "AND MEM.EXPENSE_MONTH = '" + expMonth + "'    \n";
        }
        if (!closeStatus.equalsIgnoreCase("N")) {
            query += "AND MEM.CLOSE_STATUS = '" + closeStatus + "'    \n";
        }
        query += " AND MED.EXPENSE_TYPE_ID = DTD.ID                \n"
                + " AND DTD.ACTIVE = 'Y'                            \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        System.out.println(" Data : " + listmap.size());
        List<MonthlyLocationExpense> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            MonthlyLocationExpense objData = new MonthlyLocationExpense();

            objData.setExpenseMasterId(map.get("EXP_MASTER_ID").toString());
            objData.setExpenseTypeId(map.get("EXPENSE_TYPE_ID").toString());
            objData.setExpenseTypeDescription(map.get("EXP_NAME").toString());
            objData.setAmount(map.get("AMOUNT").toString());
            objData.setExpenseMonth(map.get("EXPENSE_MONTH").toString());

            lisVerRep.add(objData);
        }

        return lisVerRep;
    }
}
