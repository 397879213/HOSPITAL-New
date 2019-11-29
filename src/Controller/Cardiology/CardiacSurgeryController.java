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
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author admin
 */
public class CardiacSurgeryController {
    
    GenerateKeys key = new GenerateKeys();
    CardiacSurgeryHandler hdlCardiacSurg = new CardiacSurgeryHandler();
    
    public List<Patient> selectPateitnInformation(String patientId, String patientName) {
        return hdlCardiacSurg.selectPateitnInformation(patientId, patientName);
    }
    
    public boolean insertCardiacSurgeryMaster(CardiacSurgeryBO insert) {
        insert.setId(key.generatePrimaryKey(Keys.cardiacSurgeryPK, true));
        boolean ret = hdlCardiacSurg.insertCardiacSurgeryMaster(insert);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<CardiacSurgeryBO> selectExamDetail() {
        return hdlCardiacSurg.selectExamDetail();
    }
    
    public boolean insertExamDetail(List<CardiacSurgeryBO> listExam) {
        boolean ret = hdlCardiacSurg.insertExamDetail(listExam);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
        
}
