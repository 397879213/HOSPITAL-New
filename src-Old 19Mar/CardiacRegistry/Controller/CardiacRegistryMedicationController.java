/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacRegistryMedication;
import CardiacRegistry.BO.CardiacSurgeryBO;
import CardiacRegistry.Handler.CardiacRegistryMedicationHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class CardiacRegistryMedicationController {
    
    CardiacRegistryMedicationHandler hdlMed = new CardiacRegistryMedicationHandler();
    
    
    public boolean insertMedications(CardiacRegistryMedication cardiac) {
        boolean ret = hdlMed.insertMedications(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateMedications(String medId) {
        boolean ret = hdlMed.updateMedications(medId);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<CardiacRegistryMedication> selectMedications(String cardiacId) {
        return hdlMed.selectMedications(cardiacId);
    }
}
