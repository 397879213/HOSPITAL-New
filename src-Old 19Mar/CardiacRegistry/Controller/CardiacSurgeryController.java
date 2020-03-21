/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacSurgeryBO;
import BO.Patient;
import CardiacRegistry.BO.OutsidePatientRegistry;
import CardiacRegistry.Handler.CardiacSurgeryHandler;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author admin
 */
public class CardiacSurgeryController {

    GenerateKeys key = new GenerateKeys();
    CardiacSurgeryHandler hdlCardiacSurg = new CardiacSurgeryHandler();

    public List<OutsidePatientRegistry> selectPateitnInformation(String patientId,
            String patientName, String instituteId) {
        return hdlCardiacSurg.selectPateitnInformation(patientId, patientName, instituteId);
    }

    public CardiacSurgeryBO selectCardiacSurgDetail(String id) {
        return hdlCardiacSurg.selectCardiacSurgDetail(id);
    }

    public boolean insertCardiacRegisteryMaster(CardiacSurgeryBO insert) {
        insert.setCardiacRegistryId(key.generatePrimaryKey(Keys.cardiacSurgeryPK, true));
        boolean ret = hdlCardiacSurg.insertCardiacRegisteryMaster(insert);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCardiacRegisteryMaster(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateCardiacRegisteryMaster(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean FinalCardiacRegisteryMaster(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateCardiacRegisteryMaster(cardiac);

        if (ret) {
            String query
                    = " INSERT INTO " + Database.DCMS.cardiacHistoryDetail + "  \n"
                    + "(SELECT " + cardiac.getCardiacRegistryId() + ", DEF.ID,'','', '' FROM   \n"
                    + Database.DCMS.definitionType + " DEF                      \n"
                    + "  WHERE DEF.COMMENTS = 'CARDIAC-REGISTRY')               \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
