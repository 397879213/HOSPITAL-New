/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Controller;

import Library.BO.AuthorRegBO;
import Library.Handler.AuthorRegHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author razas
 */
public class AuthorRegController {
    
    AuthorRegHandler objAuthorRgHdl = new AuthorRegHandler();
    
 public List<AuthorRegBO> Authorinfo(String authorName){
    
   
   return objAuthorRgHdl.selectAuthor(authorName);
 }
 
  public boolean insertAuthorReg(AuthorRegBO objSave){
         
     boolean ret = objAuthorRgHdl.insertAuthorReg(objSave);
         
         if(ret){
             Constants.dao.commitTransaction();
         }
         if(!ret){
            Constants.dao.rollBack();
        }
         return ret;
     }
  
  
//     public boolean UpdateAuthorReg(AuthorRegBO objSave){
//        boolean ret = objAuthorRgHdl.updateAuthorReg(objSave);
//        
//        if(ret){
//            Constants.dao.commitTransaction();
//        }
//        
//        if(!ret){
//            Constants.dao.rollBack();
//        }
//        return ret;
//    }
    
}
