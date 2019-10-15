/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Controller;




import OPD.BO.BOMedicineFrequencySetup;
import OPD.Handler.MedicineFrequencySetupHandler;
import java.util.List;
import utilities.Constants;


/**
 *
 * @author 
 */
public class MedicineFrequencySetupController {

    MedicineFrequencySetupHandler medFreqHdl = new MedicineFrequencySetupHandler();
    
    public List<BOMedicineFrequencySetup> selectMediSearch(int actionId, String description){
        return medFreqHdl.selectMedicineSearch(actionId,description);
        }
    
    
    public boolean updateMedicineInfo(BOMedicineFrequencySetup obj) {

        boolean ret = medFreqHdl.updateMediInfo(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }
    
    public boolean inserteMedicineReg(BOMedicineFrequencySetup objSave){
        
        boolean ret = medFreqHdl.insertMedicineInfo(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
     
  }

