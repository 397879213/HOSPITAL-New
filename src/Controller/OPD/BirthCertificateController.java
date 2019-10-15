/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.PatientHospitalVisit;
import Handler.OPD.BirthCertificateHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author 
 */
public class BirthCertificateController {

    BirthCertificateHandler hdlBirthCertificate = new BirthCertificateHandler();
    
   public List<PatientHospitalVisit> selectPatientSearch(String patientId, 
     String admissionNo) {
     return hdlBirthCertificate.selectPatientSearch(patientId, admissionNo);
   }
    
    
    public boolean updateBirthCertificate(PatientHospitalVisit obj) {

        boolean ret = hdlBirthCertificate.updateBirthCertificate(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }
    
    public boolean insertupdateBirthCertificate(PatientHospitalVisit objSave){
        
        boolean ret = hdlBirthCertificate.insertupdateBirthCertificate(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
     
  }

