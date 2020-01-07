/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.Handler.RegistryCathProcedureHandler;
import CardiacRegistry.BO.CardiacRegistryCathProcedure;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class RegistryCathProcedureController {
    
    RegistryCathProcedureHandler hdlProcedure = new RegistryCathProcedureHandler();
    
    public List<CardiacRegistryCathProcedure> selectCardiacSurgeryIntervention(
            String cardiacId) {
        return hdlProcedure.selectCardiacSurgeryIntervention(cardiacId);
    }
    
    public boolean insertCardiacSurgeryIntervention(CardiacRegistryCathProcedure insert) {
        boolean ret = hdlProcedure.insertCardiacSurgeryIntervention(insert);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCardiacSurgeryIntervention(CardiacRegistryCathProcedure cardiac) {
        boolean ret = hdlProcedure.updateCardiacSurgeryIntervention(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertcardiacProcedureDetail(CardiacRegistryCathProcedure insert) {
        boolean ret = hdlProcedure.insertCardiacCathDetail(insert);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCardiacProcedureDetail(CardiacRegistryCathProcedure cardiac) {
        boolean ret = hdlProcedure.updateCardiacCathDetail(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<CardiacRegistryCathProcedure> selectCardiacProcedureDetail(String cardiacId) {
        return hdlProcedure.selectCardiacCathDetail(cardiacId);
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
