/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Handler;

import Library.BO.BookIssue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import static utilities.Constants.dao;
import utilities.Database;
import utilities.Sequences;

/**
 *
 * @author Pacslink
 */
public class BookIssueHandler {


    String[] BColumns = {"-", "ID", "REFERENCE_ID", "MEMBER_TYPE_ID",
        "NAME", "AGE", "GENDER_ID", "GENDER_DES", "CNIC", "PROGRAM",
        "DEPARTMENT_ID", "DEPARTMENT_DES", "CONTACT_NO", "MAX_BOOK_LIMIT",
        "LOCATION_ID", "LOCATION_DES", "INSTITUE", "MEMBER_ID", "BOOK_ID",
        "STATUS_ID", "ISSUE_DATE", "ISSUED_BY", "BOOK_ISSUANCE_ID", "RETURN_DATE",
        "BOOK_COLLECT_BY", "FINE_DAY_1", "FINE_DAY_2", "FINE_DAY_3",
        "EXTRA_DAYS", "FINE", "TOTAL_PAYABLE_FINE", "TOTAL_RECEIVED_FINE",
        "RESERVED_BY", "RESERVED_DATE", "CANCEL_BY", "CANCEL_DATE",
        "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

    String generalQuery
            = " SELECT M.ID,  "
            + " M.MEMBER_REFERENCE_ID                REFERENCE_ID,         \n"
            + " M.MEMBER_TYPE_ID                     MEMBER_TYPE_ID,       \n"
            + " M.NAME                               NAME,                 \n"
            + " M.AGE                                AGE,                  \n"
            + " M.GENDER_ID                          GENDER_ID,            \n"
            + " GEN.DESCRIPTION                      GENDER_DES,           \n"
            + " M.CNIC                               CNIC,                 \n"
            + " M.PROGRAM                            PROGRAM,              \n"
            + " M.DEPARTMENT_ID                      DEPARTMENT_ID,        \n"
            + " M.CONTACT_NO                         CONTACT_NO,           \n"
            + " M.CRTD_BY                            CRTD_BY,              \n"
            + " LOC.DESCRIPTION                      LOCATION_DES,         \n"
            + " DEP.DESCRIPTION                      DEPARTMENT_DES,       \n"
            + " TO_CHAR(M.CRTD_DATE,'DD-MON-YY')     CRTD_DATE,            \n"
            + " BID.BOOK_ISSUANCE_ID                 BOOK_ISSUANCE_ID,     \n"
            + " BID.MEMBER_ID                        MEMBER_ID,            \n"
            + " BID.BOOK_ID                          BOOK_ID,              \n"
            + " BID.STATUS_ID                        STATUS_ID,            \n"
            + " TO_CHAR(BID.ISSUE_DATE,'DD-MON-YY')  ISSUE_DATE,           \n"
            + " BID.ISSUED_BY                        ISSUED_BY             \n"
            + " FROM "
//            + Database.DCMS.member + " M,                                  \n"
      //      + Database.DCMS.bookIssueDetail + " BID,                       \n"
            + Database.DCMS.users + " USR,                                 \n"
            + Database.DCMS.location + " LOC                               \n"
            + Database.DCMS.definitionTypeDetail + " DEP,                  \n"
            + Database.DCMS.gender + " GEN                                 \n";

    String generalJoin
            = " AND  M.ID = BID.MEMBER_ID                                   \n"
            + " AND M.CRTD_BY = USR.USER_NAME                               \n"
            + " AND M.LOCATION_ID = LOC.ID                                  \n"
            + " AND M.DEPARTMENT_ID = DEP.ID                                \n";

    public List setInformation(List list) {

        List<BookIssue> ListEmer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(0);
            BookIssue obj = new BookIssue();
            obj.setId(map.get("ID").toString());
            obj.setReferenceId(map.get("REFERENCE_ID").toString());
            obj.setTypeDescription(map.get("MEMBER_TYPE_ID").toString());
            obj.setName(map.get("NAME").toString());
            obj.setAge(map.get("AGE").toString());
            obj.setAge(map.get("GENDER_ID").toString());
            obj.setGenderDescription(map.get("GENDER_DES").toString());
            obj.setCnic(map.get("CNIC").toString());
            obj.setProgram(map.get("PROGRAM").toString());
            obj.setContactNo(map.get("CONTACT_NO").toString());
            obj.setCrtdBy(map.get("CRTD_BY").toString());
            obj.setLocationDescription(map.get("LOCATION_DES").toString());
            obj.setLocationDescription(map.get("DEPARTEMENT_ID").toString());
            obj.setDepartmentDescription(map.get("DEPARTMENT_DES").toString());
            obj.setCrtdDate(map.get("CRTD_DATE").toString());
            obj.setBookIssuanceId(map.get("BOOK_ISSUANCE_ID").toString());
            obj.setMemberId(map.get("MEMBER_ID").toString());
            obj.setBookId(map.get("BOOK_ID").toString());
            obj.setStatusId(map.get("STATUS_ID").toString());
            obj.setIssueBy(map.get("ISSUED_BY").toString());
            obj.setIssueDate(map.get("ISSUE_DATE").toString());

            ListEmer.add(obj);
        }
        return ListEmer;
    }
    
    
     public List<BookIssue> selectMember(List<BookIssue> list) {

        String query = generalQuery
                + " WHERE M.ID = BID.MEMBER_ID"
                + generalJoin + " ORDER BY ID ";

        return setInformation(Constants.dao.selectData(query, BColumns));
    }
     
     
    public List<BookIssue> selectMemberInfo(String memberId) {

        String[] columns = {"-", "ID", "NAME", "DEPARTMENT",
        "CONTACT_NO", "TYPE"};
        
        String query = " SELECT M.ID,                                   \n"
                + " M.NAME,                                             \n"
                + " DTD.DESCRIPTION  DEPARTMENT   ,                     \n"
                + " M.CONTACT_NO,                                       \n"
                + " TYPE.DESCRIPTION TYPE                               \n"
//                + " FROM " + Database.DCMS.member + " M,                \n"
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
    
    public BookIssue selectOrderInfo(String bookId) {

        String[] columns = {"-", "ID", "BOOK_NAME", "EDITION",
        "AUTHOR_NAME", "SUBJECT_NAME"};
        
        String query = " SELECT LB.ID,                                      \n"
                + " LB.BOOK_NAME,                                           \n"
                + " LB.EDITION   ,                                          \n"
                + " LBA.DESCRIPTION AUTHOR_NAME,                            \n"
                + " DTD.DESCRIPTION SUBJECT_NAME                            \n"
                + " FROM " + Database.DCMS.book + " LB,                     \n"
                + Database.DCMS.definitionTypeDetail + " DTD,               \n"
                + Database.DCMS.bookAuthor + " LBA                          \n"
                + " WHERE LB.ID = '" + bookId + "'                         \n"
                + " AND LB.SUBJECT_ID = DTD.ID                              \n"
                + " AND LB.AUTHOR_ID = LBA.ID";

        
        //List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List vec = Constants.dao.selectData(query, columns);
        BookIssue objBookIss = new BookIssue();
              
         List<BookIssue> lisOrderInfo = new ArrayList<>();
         for (int i =0; i < vec.size(); i++){
            HashMap map = (HashMap) vec.get(i);
            //HashMap map = (HashMap) listmap.get(i);                              
            
            
            objBookIss.setBookId(bookId);
            objBookIss.setBookName((String) map.get("BOOK_NAME"));
            objBookIss.setEdition((String) map.get("EDITION"));
            objBookIss.setAuthorName((String) map.get("AUTHOR_NAME"));
            objBookIss.setSubject((String) map.get("SUBJECT_NAME"));
            
            lisOrderInfo.add(objBookIss);
         }
            return objBookIss;
         }
    
     public List<BookIssue> selectRecentBookIssue(String memberId) {

        String[] columns = {"-", "MEMBER_ID","NAME", "BOOK_NAME", "STATUS_ID",
        "ISSUE_DATE", "ISSUED_BY"};
        
        String query = " SELECT BSD.MEMBER_ID,                                \n"
                + " ME.NAME NAME,                                             \n"
                + " BO.BOOK_NAME   BOOK_NAME,                                 \n"
                + " NVL(BSD.STATUS_ID,'@')  STATUS_ID,                        \n"
                + " BSD.ISSUE_DATE  ISSUE_DATE,                               \n"
                + " BSD.ISSUED_BY   ISSUED_BY                                 \n"
//                + " FROM " + Database.DCMS.bookIssueDetail + " BSD,           \n"
      //          + Database.DCMS.member + " ME,                                \n"
          //      + Database.DCMS.book + " BO                                   \n"
                + " WHERE BSD.MEMBER_ID = '" + memberId + "'                  \n"
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
   
     
     public List<BookIssue> selectBookHistory(String memberId) {

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
//                + " FROM " + Database.DCMS.book + " LB,                       \n"
  //              + Database.DCMS.member + " MEM,                               \n"
  //              + Database.DCMS.returnbookhistroy + "  LRB                    \n"
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
     
    public boolean insertOrderInfo(String memberId, List<BookIssue> addBook){
    
    
    String[] columns={Database.DCMS.bookIssueDetail,"BOOK_ISSUANCE_ID", 
                    "MEMBER_ID", "BOOK_ID", "ISSUE_DATE", "ISSUED_BY", "CRTD_BY",
                    "CRTD_TERMINAL_ID", "CRTD_DATE"};
    
            Vector vec = new Vector();
            int i = 1;
        for (BookIssue objBo : addBook) {
            
            HashMap record = new HashMap();
        
//            record.put("BOOK_ISSUANCE_ID", Sequences.bookIssuance);                   
            record.put("MEMBER_ID","'" +memberId+"'");
            record.put("BOOK_ID","'" +objBo.getBookId()+"'");
            record.put("ISSUE_DATE", "SYSDATE");
            record.put("ISSUED_BY", "'" + Constants.userId + "'");
            record.put("CRTD_BY", "'" + Constants.userId + "'");
            record.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            record.put("CRTD_DATE", "SYSDATE");
           
            vec.add(record);
        }
              return dao.insertData(vec, columns); 
    }

     
       
}
