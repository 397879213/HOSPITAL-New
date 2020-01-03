/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacRegistryECHO;
import CardiacRegistry.Handler.CardiacRegistryECHOHandler;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;

/**
 *
 * @author admin
 */
public class CardiacRegistryECHOController {
    
    CardiacRegistryECHOHandler hdlEcho = new CardiacRegistryECHOHandler();
    
    public List<CardiacRegistryECHO> selectEchocardiographyMaster(String cardiacId) {
        return hdlEcho.selectEchocardiographyMaster(cardiacId);
    }

    public boolean insertEchocrdiographyMaster(CardiacRegistryECHO insert) {
        String echoId = hdlEcho.echoId();
        insert.setEchoId(echoId);
        boolean ret = hdlEcho.insertEchocrdiographyMaster(insert);
        if (ret) {
            String query
                    = " INSERT INTO " + Database.DCMS.echoCardiography + "      \n"
                    + "(SELECT " + echoId + ", " + insert.getCardiacRegistryId() + ","
                    + " DEF.ID,'','', '', '' FROM                               \n"
                    + Database.DCMS.definitionTypeDetail + " DEF                \n"
                    + "  WHERE DEF.DEF_TYPE_ID = " + DefinitionTypes.echoCardiacValves + ")\n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            String query
                    = " INSERT INTO " + Database.DCMS.cardioEchoCardiographyDetail + "\n"
                    + "(SELECT " + echoId + ", " + insert.getCardiacRegistryId() + ", DEF.ID,'',"
                    + "'" + Constants.userId + "', SYSDATE, '" 
                    + Constants.terminalId + "' FROM                            \n"
                    + Database.DCMS.definitionTypeDetail + " DEF                \n"
                    + "  WHERE DEF.DEF_TYPE_ID = " + DefinitionTypes.echoCardiacMeasurements + ")\n";

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

    public boolean updateEchoCardiographyMaster(CardiacRegistryECHO cardiac) {
        boolean ret = hdlEcho.updateEchoCardiographyMaster(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<CardiacRegistryECHO> selectEchoValve(String echoId) {
        return hdlEcho.selectEchoValve(echoId);
    }

    public List<CardiacRegistryECHO> selectEchoValveMeasurement(String echoId) {
        return hdlEcho.selectEchoValveMeasurement(echoId);
    }

    public boolean updateEchoValve(CardiacRegistryECHO cardiac) {
        boolean ret = hdlEcho.updateEchoValve(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateEchoMeasurement(CardiacRegistryECHO cardiac) {
        boolean ret = hdlEcho.updateEchoValveMeasurement(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean finalEchoCardiography(CardiacRegistryECHO cardiac) {
        boolean ret = hdlEcho.finalEchoCardiography(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
