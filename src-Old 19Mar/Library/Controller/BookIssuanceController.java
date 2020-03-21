/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Controller;

import Library.BO.BookIssue;
import Library.Handler.BookIssueHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Raheel Ansari
 */
public class BookIssuanceController {
    
    BookIssueHandler objhdl = new BookIssueHandler();
    
    public List<BookIssue> Memberinfo(String memberId){
    
        return  objhdl.selectMemberInfo(memberId);
    }
    
    public BookIssue OrderInfo(String bookId){
    
        return (BookIssue) objhdl.selectOrderInfo(bookId);
    }
    
    public List<BookIssue> recentIssued(String memberId){
    
        return objhdl.selectRecentBookIssue(memberId);
    }
    
    public List<BookIssue> bookIssueHistory(String memberId){
    
        return objhdl.selectBookHistory(memberId);
    }
    
    
public boolean insertOrderInfo(BookIssue objBookBO, List<BookIssue> lstOrderDetail){
        
    boolean ret = objhdl.insertOrderInfo(objBookBO.getMemberId(), lstOrderDetail);
        
    if(ret){
        Constants.dao.commitTransaction();
    }
        
    if(!ret){
        Constants.dao.rollBack();
    }
        return ret;
    }
}
