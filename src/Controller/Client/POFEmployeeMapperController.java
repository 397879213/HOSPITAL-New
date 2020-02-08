/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Client;

import BMT.BO.CompoundingBO;
import BO.Client.POFEmployeeMapperBO;
import Handler.Client.POFEmployeeMapperHandler;
import java.util.List;
import org.bridj.demangling.Demangler;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class POFEmployeeMapperController {

    POFEmployeeMapperHandler hdlEm = new POFEmployeeMapperHandler();

    public List<POFEmployeeMapperBO> selectActionWiseMapper(String actionId) {
        return hdlEm.selectActionWiseMapper(actionId);
    }

    public List<POFEmployeeMapperBO> selectDefinitionType() {
        return hdlEm.selectDefinitionType();
    }
    
    public List<POFEmployeeMapperBO> selectDescriptioWiseMapper(String actionId,
            String description) {
        return hdlEm.selectDescriptioWiseMapper(actionId, description);
    }

    public boolean updateMapper(POFEmployeeMapperBO updateMapper) {
        boolean ret = hdlEm.updateMapper(updateMapper);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deleteMapper(POFEmployeeMapperBO updateMapper) {
        boolean ret = hdlEm.deleteMapper(updateMapper);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertMapper(POFEmployeeMapperBO mapper) {
        boolean ret = hdlEm.insertMapper(mapper);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
