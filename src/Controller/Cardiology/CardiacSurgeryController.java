/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cardiology;

import BO.Cardiology.CardiacSurgeryBO;
import BO.Patient;
import Handler.Cardiology.CardiacSurgeryHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class CardiacSurgeryController {
    
    CardiacSurgeryHandler hdlCardiacSurg = new CardiacSurgeryHandler();
    
    public List<Patient> selectPateitnInformation(String patientId, String patientName) {
        return hdlCardiacSurg.selectPateitnInformation(patientId, patientName);
    }
    
    public boolean insertCardiacSurgeryMaster(CardiacSurgeryBO insert) {
        boolean ret = hdlCardiacSurg.insertCardiacSurgeryMaster(insert);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}
