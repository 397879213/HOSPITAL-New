/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;



import BO.Administration.BODefineUser;
import Handler.Administration.DefineUserHandler;

import java.util.List;
import utilities.Constants;

/**
 *
 * @author Muhammad Talha Khan
 */
public class DefineUserController {

    DefineUserHandler defUser = new DefineUserHandler();
    
    public List<BODefineUser> selectUserSearch(String userId, String name,
             String userName, String departmentId, String sectionId ){
        return defUser.selectUserSearch(userId,name,userName,departmentId,sectionId);
        }
    
  public boolean updateUserInfo(BODefineUser obj) {

        boolean ret = defUser.updateUserInfo(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }
  
  
   public boolean inserteUserReg(BODefineUser objSave){
        
        boolean ret = defUser.insertUserId(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    
  }

