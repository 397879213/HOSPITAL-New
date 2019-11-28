/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cardiology;

import BO.Cardiology.OutsidePatientRegistry;
import Handler.Cardiology.OutsidePatientRegistryHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Bilal
 */
public class OutsidePatientRegistryController {

    OutsidePatientRegistryHandler hdlPatRegistry = new OutsidePatientRegistryHandler();
 
 
    public boolean insertOutsidePatientRegister(OutsidePatientRegistry 
            outsidePatient) {
        
        boolean ret = hdlPatRegistry.insertOutsidePatientRegister(outsidePatient);
        if (ret) {
            ret = hdlPatRegistry.insertOutsidePatientRegisterUpdate(outsidePatient);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();

        }
        if (!ret) {
            Constants.dao.rollBack();
        } 
        return ret;
        
     }

    public List<OutsidePatientRegistry> searchPatient(String patientId,
                String contactNo,String patName,String cnic
                ,String fromDate,String toDate,String physician) {
        
        return hdlPatRegistry.searchPatient(patientId,contactNo,patName,
                cnic,fromDate,toDate,physician);
     }

    public boolean updateOutsidePatientData(OutsidePatientRegistry outsidePatRegistry) {
        
         boolean ret = hdlPatRegistry.updateOutsidePatientData(outsidePatRegistry);
         if (ret) {
            ret = hdlPatRegistry.updateOutsidePatientRegistryData(outsidePatRegistry);
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
