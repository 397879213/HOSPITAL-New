/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.PhysioMachine;
import Handler.OPD.PhysioReportingHandler;
import java.util.List;
import utilities.Constants;

public class PhysioReportingController {

    PhysioReportingHandler hdlPhysioPerform = new PhysioReportingHandler();

    public List<PhysioMachine> selectPhysioMasterByPatientId(String patientId) {
        return hdlPhysioPerform.selectPhysioMasterByPatientId(patientId);
    }

    public List<PhysioMachine> selectPhysioMasterByCONODI(String con, String odi,
            String statusId) {
        return hdlPhysioPerform.selectPhysioMasterByCONODI(con, odi, statusId);
    }

    public List<PhysioMachine> selectTechnicianDetail(String physioId, String machineId) {
        return hdlPhysioPerform.selectPlanPerformDetail(physioId, machineId);
    }

    public boolean insertPhysioMaster(PhysioMachine imp) {
        boolean ret = hdlPhysioPerform.insertPhysioMaster(imp);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updatePlans(PhysioMachine physio) {
        boolean ret = hdlPhysioPerform.updatePlans(physio);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean cancelPerform(PhysioMachine physio) {
        boolean ret = hdlPhysioPerform.cancelPerform(physio);
        if (ret) {
            ret = hdlPhysioPerform.revertVisit(physio);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertPhysioDetail(PhysioMachine physio) {

        boolean ret = hdlPhysioPerform.insertPhysioDetail(physio);
        if (ret) {
            ret = hdlPhysioPerform.updateVisitInMaster(physio.getPhysioMasterId(),
                    physio.getMachineId());
        }
        if (ret) {
            ret = hdlPhysioPerform.updateStatusMaster(physio.getPhysioMasterId(),
                    physio.getMachineId());
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean FinalPhysioInformation(PhysioMachine imp) {
        boolean ret = hdlPhysioPerform.updateMaxDays(imp);
        if (ret) {
            ret = hdlPhysioPerform.FinalPhysioMachineMaster(imp);
        }
        if (ret) {
            ret = hdlPhysioPerform.FinalPhysioMachineDetail(imp);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deletePhysioPerform(PhysioMachine imp) {
        boolean ret = hdlPhysioPerform.deletePhysioPlanMaster(imp);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean performPlane(List<PhysioMachine> listPerform) {
        boolean ret = hdlPhysioPerform.performPlane(listPerform);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean stopPhysioPlane(PhysioMachine physio) {
        boolean ret = hdlPhysioPerform.stopPhysioPlane(physio);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
