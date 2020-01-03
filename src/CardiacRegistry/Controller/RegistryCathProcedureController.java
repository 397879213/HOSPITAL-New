/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacRegistryCathProcedure;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class RegistryCathProcedureController {
    
    RegistryCathProcedureHandler hdlProcedure = new RegistryCathProcedureHandler();
    
    public boolean insertcardiacProcedureDetail(CardiacRegistryCathProcedure insert) {
        boolean ret = hdlProcedure.insertCardiacProcedureDetail(insert);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCardiacProcedureDetail(CardiacRegistryCathProcedure cardiac) {
        boolean ret = hdlProcedure.updateCardiacProcedureDetail(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<CardiacRegistryCathProcedure> selectCardiacProcedureDetail(String cardiacId) {
        return hdlProcedure.selectCardiacProcedureDetail(cardiacId);
    }

    public boolean deleteProcedure(CardiacRegistryCathProcedure cardiac) {
        boolean ret = hdlProcedure.deleteProcedure(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
