/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacSurgeryBO;
import BO.Patient;
import CardiacRegistry.Handler.CardiacSurgeryHandler;
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
    
    public List<CardiacSurgeryBO> selectExamDetail(String cardiacId) {
        return hdlCardiacSurg.selectExamDetail(cardiacId);
    }
    
    public boolean insertExamDetail(List<CardiacSurgeryBO> listExam, String id) {
        boolean ret = hdlCardiacSurg.insertExamDetail(listExam, id);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateExamDetail(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateExamDetail(cardiac);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
        
    public boolean updateExamDetailRemarks(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateExamDetailRemarks(cardiac);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertcardiacProcedureDetail(CardiacSurgeryBO insert) {
        boolean ret = hdlCardiacSurg.insertcardiacProcedureDetail(insert);
        if(ret){
            ret = Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
        
}
