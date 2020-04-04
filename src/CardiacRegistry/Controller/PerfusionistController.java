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

    // Blood Gasses
    public List<BloodGasses> selectBloodGases(String cardiacId) {
        return hdlPerfusionist.selectBloodGases(cardiacId);
    }

    public boolean insertBloodGases(BloodGasses objInrt) {
        objInrt.setBloodGasesId(key.generatePrimaryKey(Keys.bloodGassesPK, true));
        boolean ret = hdlPerfusionist.insertBloodGases(objInrt);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    // Perfusionist Time
    public List<PerfusionistBO> selectPerfusionTime(String cardiacId, int actionId) {
        return hdlPerfusionist.selectPerfusionTime(cardiacId, actionId);
    }

    public boolean insertPerfusionTime(PerfusionistBO perTime) {
        perTime.setPerTimePk(key.generatePrimaryKey(Keys.perfusionTimePK, true));
        boolean ret = hdlPerfusionist.insertPerfusionTime(perTime);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<PerfusionistBO> selectValveInformation(String cardiacId, int actionId) {
        return hdlPerfusionist.selectValveInformation(cardiacId, actionId);
    }

    public boolean insertValveInformation(PerfusionistBO valveInfo) { // SEQ_VALVE_INFO
        valveInfo.setValvePk(key.generatePrimaryKey(Keys.valveInfoPK, true));
        boolean ret = hdlPerfusionist.insertValveInformation(valveInfo);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}
