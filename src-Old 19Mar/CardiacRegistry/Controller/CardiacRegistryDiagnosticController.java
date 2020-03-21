/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacSurgeryBO;
import CardiacRegistry.Handler.CardiacRegistryDiagnosticHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class CardiacRegistryDiagnosticController {
    
    CardiacRegistryDiagnosticHandler hdlDiagnosis = new CardiacRegistryDiagnosticHandler();
    
    public List<CardiacSurgeryBO> selectExamDetail(String cardiacId) {
        return hdlDiagnosis.selectExamDetail(cardiacId);
    }

    public boolean insertExamDetail(List<CardiacSurgeryBO> listExam, String id) {
        boolean ret = hdlDiagnosis.insertExamDetail(listExam, id);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateExamDetail(CardiacSurgeryBO cardiac) {
        boolean ret = hdlDiagnosis.updateExamDetail(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateExamDetailRemarks(CardiacSurgeryBO cardiac) {
        boolean ret = hdlDiagnosis.updateExamDetailRemarks(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
