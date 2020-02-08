/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cardiology;

import BO.Cardiology.AngioReporting;
import Handler.Cardiology.AngioReportingHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class AngioReportingController {

    AngioReportingHandler hdlAngio = new AngioReportingHandler();

    public List<AngioReporting> selectAngioReportingMaster(String con, String odi) {
        return hdlAngio.selectAngioReportingMaster(con, odi);
    }
    
    public List<AngioReporting> selectAngioReportingCatheter(String angioId) {
        return hdlAngio.selectAngioReportingCatheter(angioId);
    }
    
    public List<AngioReporting> selectAngioParameter(String angioId) {
        return hdlAngio.selectAngioParameter(angioId);
    }
    
    public List<AngioReporting> selectAngioAdditionalInfo(String angioId) {
        return hdlAngio.selectAngioAdditionalInfo(angioId);
    }
    
    public boolean insertAngioReportingMaster(AngioReporting angio) {
        boolean ret = hdlAngio.insertAngioReportingMaster(angio);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateAngioReportingMaster(AngioReporting angio) {
        boolean ret = hdlAngio.updateAngioReportingMaster(angio);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertAngioReportingCatheter(AngioReporting angio) {
        boolean ret = hdlAngio.insertAngioReportingCatheter(angio);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertAngioParameter(AngioReporting angio) {
        boolean ret = hdlAngio.insertAngioParameter(angio);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertAngioAdditionalInfo(AngioReporting angio) {
        boolean ret = hdlAngio.insertAngioAdditionalInfo(angio);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteCatheterInfo(String id) {
        boolean ret = hdlAngio.deleteCatheterInfo(id);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteParameterInfo(String id) {
        boolean ret = hdlAngio.deleteParameterInfo(id);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
