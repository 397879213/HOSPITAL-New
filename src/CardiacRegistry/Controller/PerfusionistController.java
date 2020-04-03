/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.BloodGasses;
import CardiacRegistry.BO.PerfusionistBO;
import CardiacRegistry.Handler.PerfusionistHandler;
import java.util.List;
import org.bridj.demangling.Demangler;
import utilities.Constants;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author admin
 */
public class PerfusionistController {

    GenerateKeys key = new GenerateKeys();
    PerfusionistHandler hdlPerfusionist = new PerfusionistHandler();

    public PerfusionistBO selectPerfusionInfo(String cardiacId, String patientId) {
        return hdlPerfusionist.selectPerfusionInfo(cardiacId, patientId);
    }

    public boolean insertPerfusionInformation(PerfusionistBO insert) {
        insert.setPerfusionId(key.generatePrimaryKey(Keys.cardiacPerfusionIdPk, true));
        boolean ret = hdlPerfusionist.insertPerfusionInformation(insert);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updatePerfusionInformation(PerfusionistBO update) {
        boolean ret = hdlPerfusionist.updatePerfusionInformation(update);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertPerfusionPressureGraph(PerfusionistBO perGraph) {
        boolean ret = hdlPerfusionist.insertPerfusionPressureGraph(perGraph);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<PerfusionistBO> selectPerfusionPressureGraph(String cardiacId,
            String patientId) {
        return hdlPerfusionist.selectPerfusionPressureGraph(cardiacId, patientId);
    }
        
    public boolean deletePerfusionPressureGraph(String id) {
        boolean ret = hdlPerfusionist.deletePerfusionPressureGraph(id);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<PerfusionistBO> selectPerfusionCheckList(String cardiacId,
            String patientId) {
        return hdlPerfusionist.selectPerfusionCheckList(cardiacId, patientId);
    }
    
    public boolean updateCheckList(PerfusionistBO objUpdt) {
        boolean ret = hdlPerfusionist.updateCheckList(objUpdt);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
        
    
    public List<BloodGasses> selectBloodGases(String cardiacId) {
        return hdlPerfusionist.selectBloodGases(cardiacId);
    }
}
