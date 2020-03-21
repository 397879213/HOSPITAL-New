/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Handler;

import BO.MemberReg;
import Library.BO.BookIssue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author HAIDER
 */
public class MemberBookStatusHistoryHandler {
    
//    String generalColumn[] = {"-","BOOK_ID","BOOK_DESCRIPTION"};
//       
//    String generalQuery = " SELECT                                   \n"
//            + " LB.ID                           BOOK_ID,                  \n"
//            + " LB.BOOK_NAME                    BOOK_DESCRIPTION            \n"
//            + " FROM                                                 \n"
//            + Database.DCMS.book+ "  LB,                          \n"
//            + Database.DCMS.bookIssueDetail+ " BID,                   \n"
//            + Database.DCMS.returnbookhistroy+ " LBH                   \n";
//    
//    
//    String generalJoin = " AND LB.ID = BID.BOOK_ID                  \n"
//            + " AND LB.ID = LBH.BOOK_ID ";
//    
//                       
//    
//    
//    
//    
//     public List selectCurrentMemberStatus(String memberId) {
//
//         String query = generalQuery
//                + " WHERE  BID.MEMBER_ID = '" + memberId + "'                \n";
//         query += generalJoin;
//        return setComplainList(Constants.dao.selectData(query, generalColumn));
//
//    }
//        
//     
//     public List setComplainList(List lis) {
//
//        List<boStatusHistory> listComplain = new ArrayList<>();
//        for (int i = 0; i < lis.size(); i++) {
//            HashMap map = (HashMap) lis.get(i);
//            boStatusHistory objFS = new boStatusHistory();
//            objFS.setBookId(map.get("BOOK_ID").toString());
//            objFS.setBookName(map.get("BOOK_DESCRIPTION").toString());   
//            listComplain.add(objFS);
//        }
//        return listComplain;
//    }
//
//    public List selectMemberHistory(String memberHistoryId) {
//        
//         String query = generalQuery
//                + " WHERE  LBH.MEMBER_ID = '" + memberHistoryId + "'                \n";
//               
//         query += generalJoin;
//        return setComplainList(Constants.dao.selectData(query, generalColumn));
//     }
    
    public List<BookIssue> selectCurrentMemberStatus(String memberId) {

        String[] columns = {"-", "MEMBER_ID","NAME", "BOOK_NAME", "STATUS_ID",
        "ISSUE_DATE", "ISSUED_BY"};
        
        String query = " SELECT BSD.MEMBER_ID,                                \n"
                + " ME.NAME NAME,                                                  \n"
                + " BO.BOOK_NAME   BOOK_NAME,                                          \n"
                + " NVL(BSD.STATUS_ID,'@')  STATUS_ID,                                           \n"
                + " BSD.ISSUE_DATE  ISSUE_DATE,                                           \n"
                + " BSD.ISSUED_BY   ISSUED_BY                                             \n"
                + " FROM " + Database.DCMS.bookIssueDetail + " BSD,           \n"
                + Database.DCMS.member + " ME,                                \n"
                + Database.DCMS.book + " BO                                   \n"
                + " WHERE BSD.MEMBER_ID = '" + memberId + "'                    \n"
                + " AND BSD.MEMBER_ID = ME.ID                                 \n"
                + " AND BSD.BOOK_ID = BO.ID";

        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BookIssue> lisrecentbook = new ArrayList<>();
         for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BookIssue objBookIss = new BookIssue();
            
            objBookIss.setMemberId(memberId);
            objBookIss.setName(map.get("NAME").toString());
            objBookIss.setBookName(map.get("BOOK_NAME").toString());
            objBookIss.setStatusId(map.get("STATUS_ID").toString());
            objBookIss.setIssueDate(map.get("ISSUE_DATE").toString());
            objBookIss.setIssueBy(map.get("ISSUED_BY").toString());
            
            lisrecentbook.add(objBookIss);
         }
            return lisrecentbook;
         }
   
     
     public List<BookIssue> selectMemberHistory(String memberId) {

        String[] columns = {"-", "BOOK_ID", "BOOK_NAME","MEMBER_ID","MEMBER_NAME",
            "STATUS_ID", "ISSUE_DATE","RETURN_DATE", "BOOK_COLLECT_BY"};
        
        String query = " SELECT LRB.BOOK_ID,                                  \n"
                + " LB.BOOK_NAME,                                             \n"
                + " LRB.MEMBER_ID MEMBER_ID,                                  \n"
                + " MEM.NAME MEMBER_NAME,                                     \n"
                + " NVL(LRB.STATUS_ID,'@')   STATUS_ID,                       \n"
                + " TRUNC(LRB.ISSUE_DATE) ISSUE_DATE,                         \n"
                + " TRUNC(LRB.RETURN_DATE) RETURN_DATE,                       \n"
                + " LRB.BOOK_COLLECT_BY                                       \n"
                + " FROM " + Database.DCMS.book + " LB,                       \n"
                + Database.DCMS.member + " MEM,                               \n"
                + Database.DCMS.returnbookhistroy + "  LRB                    \n"
                + " WHERE LRB.MEMBER_ID = '" + memberId + "'                  \n"
                + " AND  LRB.MEMBER_ID = MEM.ID                               \n"
                + " AND LRB.BOOK_ID = LB.ID";

        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BookIssue> lisbookhistory = new ArrayList<>();
         for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BookIssue objBookIss = new BookIssue();
            
            objBookIss.setBookId("BOOK_ID");
            objBookIss.setBookName(map.get("BOOK_NAME").toString());
            objBookIss.setMemberId(map.get("MEMBER_ID").toString());
            objBookIss.setName(map.get("MEMBER_NAME").toString());
            objBookIss.setStatusId(map.get("STATUS_ID").toString());
            objBookIss.setIssueDate(map.get("ISSUE_DATE").toString());
            objBookIss.setReturnDate(map.get("RETURN_DATE").toString());
            objBookIss.setBookCollectBy(map.get("BOOK_COLLECT_BY").toString());
            
            lisbookhistory.add(objBookIss);
         }
            return lisbookhistory;
     }
     
     public List<BookIssue> selectMemberInfo(String memberId) {

        String[] columns = {"-", "ID", "NAME", "DEPARTMENT",
        "CONTACT_NO", "TYPE"};
        
        String query = " SELECT M.ID,                                   \n"
                + " M.NAME,                                             \n"
                + " DTD.DESCRIPTION  DEPARTMENT   ,                     \n"
                + " M.CONTACT_NO,                                       \n"
                + " TYPE.DESCRIPTION TYPE                               \n"
                + " FROM " + Database.DCMS.member + " M,                \n"
                + Database.DCMS.definitionTypeDetail + " DTD,           \n"
                + Database.DCMS.definitionTypeDetail + " TYPE           \n"
                + " WHERE M.ID = '" + memberId + "'                     \n"
                + " AND M.DEPARTMENT_ID = DTD.ID                        \n"
                + " AND M.TYPE = TYPE.ID";

        
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<BookIssue> lisMemInfo = new ArrayList<>();
         for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            BookIssue objBookIss = new BookIssue();
            
            objBookIss.setMemberId(memberId);
            objBookIss.setName(map.get("NAME").toString());
            objBookIss.setDepartmentDescription(map.get("DEPARTMENT").toString());
            objBookIss.setContactNo(map.get("CONTACT_NO").toString());
            objBookIss.setTypeDescription(map.get("TYPE").toString());
            
            lisMemInfo.add(objBookIss);
         }
            return lisMemInfo;
     }
     
        
}
