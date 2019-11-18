/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.MonthlyLocationExpenseBO;
import Handler.Administration.MonthlyLocationExpenseHandler;
import java.util.List;
import utilities.Constants;

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

    public boolean insertLocMonthlyExpense(List<MonthlyLocationExpenseBO> listCopy,
            MonthlyLocationExpenseBO objSave) {
        String id = hdlLocExpense.selectMonthlyExpId();
        boolean ret = hdlLocExpense.insertLocMonthlyExpMaster(objSave, id);
        if (ret) {
            hdlLocExpense.insertLocMonthlyExpDetail(listCopy, id);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
