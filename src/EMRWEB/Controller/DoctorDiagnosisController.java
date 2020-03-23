/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMRWEB.Controller;

import EMRWEB.BO.DoctorDiagnosis;
import EMRWEB.Handler.DoctorDiagnosisHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class DoctorDiagnosisController {

    DoctorDiagnosisHandler hdlDocDiag = new DoctorDiagnosisHandler();

    public List<EMRWEB.BO.DoctorDiagnosis> selectPendingPatients(String visitId) {
        return hdlDocDiag.selectPendingPatients(visitId);
    }

    public List<DoctorDiagnosis> selectVisitQuestionDetail(String visitId) {
        return hdlDocDiag.selectVisitQuestionDetail(visitId);
    }

    public List<DoctorDiagnosis> selectVisitMedicines(String visitId) {
        return hdlDocDiag.selectVisitMedicines(visitId);
    }
    
    public List<DoctorDiagnosis> selectPerformedPatients(String patientId) {
        return hdlDocDiag.selectPerformedPatients(patientId);
    }

    public boolean insertVisitMedicines(DoctorDiagnosis item) {
        boolean ret = hdlDocDiag.insertVisitMedicines(item);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteVisitMedicines(String id) {
        boolean ret = hdlDocDiag.deleteVisitMedicines(id);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean fianlPerformedVisits(DoctorDiagnosis objDelete) {
        boolean ret = hdlDocDiag.deletePendingVisits(objDelete);
        if (ret) {
            ret = hdlDocDiag.fianlPerformedVisits(objDelete);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
