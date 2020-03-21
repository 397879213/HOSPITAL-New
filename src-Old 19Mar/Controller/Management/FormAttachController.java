/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Management;

import BO.Management.formAttachBO;
import Handler.Management.FormAttachHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author razas
 */
public class FormAttachController {
    
    FormAttachHandler objHdl = new FormAttachHandler();
            
   public List<formAttachBO> searchformAttach(String title){
        return objHdl.SearchformAttach(title);
    
    }
    
    
    public boolean UpdateFormAttach(formAttachBO objSave){
        boolean ret = objHdl.UpdateFormAttach(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertFormAttach(formAttachBO objSave){
        
        boolean ret = objHdl.insertFormAttach(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
}
