/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cardiology;

import BO.Patient;
import Handler.Cardiology.CardiacSurgeryHandler;
import java.util.List;

/**
 *
 * @author admin
 */
public class CardiacSurgeryController {
    
    CardiacSurgeryHandler hdlCardiacSurg = new CardiacSurgeryHandler();
    
    public Patient selectPateitnInformation(String patientId) {
        return hdlCardiacSurg.selectPateitnInformation(patientId);
    }
}
