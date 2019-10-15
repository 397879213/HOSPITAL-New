/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Controller;

import Library.BO.BookIssue;
import Library.Handler.MemberBookStatusHistoryHandler;
import java.util.List;


/**
 *
 * @author HAIDER
 */
public class MemberBookStatusHistoryController {
    
    MemberBookStatusHistoryHandler hdlMemberBookStatusHistory = new MemberBookStatusHistoryHandler();
   
     

    public List<BookIssue> selectCurrentMemberStatus(String memberId) {
        
        return hdlMemberBookStatusHistory.selectCurrentMemberStatus(memberId);
     }
 

    public List<BookIssue> selectMemberHistory(String memberHistoryId) {
        
        return hdlMemberBookStatusHistory.selectMemberHistory(memberHistoryId);
     }
    
    public List<BookIssue> Memberinfo(String memberId){
    
        return hdlMemberBookStatusHistory.selectMemberInfo(memberId);
    }
    
 
    
    }
