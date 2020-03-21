/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Setup;

import BO.Location;
import BO.SetupColumnDetail;
import Handler.SetupColumnDetailHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;
import utilities.Database;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

/**
 *
 * @author Pacslink
 */
public class SetupColumnDetailController implements java.io.Serializable {

    SetupColumnDetailHandler hdlScd = new SetupColumnDetailHandler();

    public List<SetupColumnDetail> searchProperty(String searchString,
            String setupId, String tableRowId) {

        return hdlScd.searchProperty(searchString, setupId, tableRowId);
    }

    public List searchSetupColumDetails(String tableRowId, String setupId) {

        return hdlScd.searchSetupColumDetails(tableRowId, setupId);
    }

    boolean insertSetupProperty(String property, String defaultValue, String cpt, List<Location> aLlCptId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateProperty(SetupColumnDetail currentSCD) {

        String query
                = " UPDATE " + Database.DCMS.setupTableColums + "\n"
                + " SET DEFAULT_VALUE  ='" + currentSCD.getDefaultValue() + "',\n"
                + " REMARKS  ='" + currentSCD.getRemarks().replace("'", "''") + "',\n"
                + " PROPERTY ='" + currentSCD.getProperty() + "'\n"
                + " WHERE ID ='" + currentSCD.getId() + "'\n";

        return Constants.dao.executeUpdate(query, true);
    }

    public List searchProperyDetails(String tableRowId, String setupId) {

        return hdlScd.searchSetupDetailInfo(tableRowId, setupId);
    }

    public boolean saveSetupDetail(List<SetupColumnDetail> scd) {

        boolean ret = hdlScd.updateSetupColumnDetail(scd);
        if (ret) {
            hdlScd.insertSetupColumnDetailsHistory(scd);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();

        }
        return ret;
    }

}
