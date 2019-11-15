/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Administration;

import BO.Administration.MonthlyLocationExpenseBO;
import Handler.Administration.MonthlyLocationExpenseHandler;
import java.util.List;

/**
 *
 * @author raheelansari
 */
public class MonthlyLocationExpenseController {
    
    MonthlyLocationExpenseHandler hdlLocExpense = new MonthlyLocationExpenseHandler();
    
    public List<MonthlyLocationExpenseBO> headWiseMonthlyExpense(String locationId,
            String expMonth, String closeStatus) {
        return hdlLocExpense.headWiseMonthlyExpense(locationId, expMonth, closeStatus);
    }
    
    public List<MonthlyLocationExpenseBO> monthWiseExpense(String locationId,
            String expMonth, String closeStatus) {
        return hdlLocExpense.monthWiseExpense(locationId, expMonth, closeStatus);
    }
}
