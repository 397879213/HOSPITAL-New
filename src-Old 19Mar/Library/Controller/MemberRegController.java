/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Controller;

import BO.MemberReg;
import Library.Handler.MemberRegHandler;
import java.util.List;
import utilities.Constants;


/**
 *
 * @author PACSLinks
 */
public class MemberRegController {
    
    MemberRegHandler objhand = new MemberRegHandler();
   
    
    public List<MemberReg> MemberReg(String memberId, String name,
            String refId, String contactNum){
        return objhand.SearchMemberReg(memberId, name, refId, contactNum);
    
    }
    
    public boolean UpdateMemberReg(MemberReg objSave){
        boolean ret = objhand.UpdateMemberReg(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean inserteMemberReg(MemberReg objSave){
        
        boolean ret = objhand.insertMemberReg(objSave);
        
        if(ret){
            Constants.dao.commitTransaction();
        }
        
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    }
