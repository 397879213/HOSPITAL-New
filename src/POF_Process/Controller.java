/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POF_Process;

import java.util.ArrayList;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Raheel Ansari
 */
public class Controller {
    
    Handler objHdl = new Handler();
    BO objBO = new BO();
    
    
    public List<BO> selectPofEmployee(){
    
        return objHdl.selectPofEmployee();
    }
    
    public boolean  insertClientWiseEmployeeMaster(BO objBo){
        
        boolean ret = objHdl.insertClientWiseEmployeeMaster(objBo);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    
    public boolean  insertClientEmployeeDetail(BO objBo){
    
        boolean ret = objHdl.insertClientEmployeeDetail(objBo);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
        
    }
    
    public boolean  insertPatient(BO objBo){
    
        boolean ret = objHdl.insertPatient(objBo);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
        
    }
    
    public boolean updateClientWiseEmployeeMaster(BO obj){
    
        boolean ret = objHdl.updateClientWiseEmployeeMaster(obj);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<BO> selectPofEmployeeForUpddate(){
    
        return objHdl.selectPofEmployeeForUpdate();
    }
    
    public boolean updatePofEmployee(){
    
        return objHdl.updatePofEmployee();
    }
    
    public static void main(String[] args) {
        
        //Objects
        Controller objctl = new Controller();
        BO obj = new BO();
        
        //List
        List<BO> lstEmpData = new ArrayList();
        List<BO> lstEmpDataForUpdate = new ArrayList();
        
        
        lstEmpData = objctl.selectPofEmployee();
        
        for(int i = 0; i < lstEmpData.size(); i++){  
        
            obj = lstEmpData.get(i);
            objctl.insertClientEmployeeDetail(obj);
            objctl.insertClientWiseEmployeeMaster(obj);
            objctl.insertPatient(obj);
        }
        
        lstEmpDataForUpdate = objctl.selectPofEmployeeForUpddate();
        
        System.out.println("Update select size : " + lstEmpDataForUpdate.size());
        
        for(int i = 0; i < lstEmpDataForUpdate.size(); i++){
        
            obj = lstEmpDataForUpdate.get(i);
            objctl.updateClientWiseEmployeeMaster(obj);
        }
        
        objctl.updatePofEmployee();
    }
}


