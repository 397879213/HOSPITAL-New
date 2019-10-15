/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Handler;

import Library.BO.BookReg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Sequences;

/**
 *
 * @author Pacslink
 */
public class BookRegistrationHandler {

    GenerateKeys key = new GenerateKeys();

    public List<BookReg> SearchBook(String bookName, String isbnNo,
            String categoryId, String authorId) {

        String[] BookColumns = {"-", "ID", "BOOK_NAME", "ISBN_NO",
            "PUBLISHER_ID", "PUBLISHER_NAME", "SUBJECT_ID",
            "SUBJECT_NAME", "CATEGORY_ID", "CATEGORY_NAME", "AUTHOR_NAME",
            "YEAR", "RACK_NAME",
            "EDITION", "BOOK_LIMIT_DAYS", "SHELF_NAME",
            "ACTIVE", "PRICE", "PAGES", "BINDING_ID", "BINDING_NAME"};

        String generalQuery
                = " SELECT LB.ID,                                        \n"
                + " LB.BOOK_NAME,                                        \n"
                + " LB.ISBN_NO,                                          \n"
                + " NVL(LB.PUBLISHER_ID,'1') PUBLISHER_ID,               \n"
                + " PUB.DESCRIPTION          PUBLISHER_NAME,             \n"
                + " LB.SUBJECT_ID,                                       \n"
                + " SUB.DESCRIPTION          SUBJECT_NAME,               \n"
                + " LB.CATEGORY_ID,                                      \n"
                + " CAT.DESCRIPTION          CATEGORY_NAME,              \n"
                + " BA.DESCRIPTION           AUTHOR_NAME,                \n"
                + " LB.YEAR,                                             \n"
                + " R.DESCRIPTION RACK_NAME,                             \n"
                + "LB.EDITION,                                          \n"
                + " LB.BOOK_LIMIT_DAYS,                                  \n"
                + " S.DESCRIPTION            SHELF_NAME,                 \n"
                + " LB.ACTIVE,                                           \n"
                + " NVL(LB.PRICE,'5')        PRICE,                      \n"
                + " LB.PAGES,                                            \n"
                + " LB.BINDING_ID,                                       \n"
                + " BIN.DESCRIPTION          BINDING_NAME                \n"
                + " FROM " + Database.DCMS.book + "  LB,                   \n"
                + Database.DCMS.rack + "  R,                             \n"
                + Database.DCMS.shelf + "  S,                            \n"
                + Database.DCMS.publisher + "  PUB,                      \n"
                + Database.DCMS.bookAuthor + " BA,                       \n"
                + Database.DCMS.definitionTypeDetail + "  CAT,           \n"
                + Database.DCMS.definitionTypeDetail + "  SUB,           \n"
                + Database.DCMS.definitionTypeDetail + "  BIN            \n";
        if (!bookName.isEmpty() && isbnNo.isEmpty() && categoryId.isEmpty()
                && authorId.isEmpty()) {
            generalQuery += " WHERE UPPER(LB.BOOK_NAME) LIKE "
                    + " ('%" + bookName.trim().toUpperCase() + "%') \n";
        }

        if (!isbnNo.isEmpty() && bookName.isEmpty() && categoryId.isEmpty()
                && authorId.isEmpty()) {
            generalQuery += " WHERE LB.ISBN_NO = '" + isbnNo.trim() + "' \n";
        }

        if (!categoryId.isEmpty() && isbnNo.isEmpty() && bookName.isEmpty()
                && authorId.isEmpty()) {
            generalQuery += " WHERE LB.CATEGORY_ID = '" + categoryId.trim() + "' \n";
        }
        if (!authorId.isEmpty() && bookName.isEmpty()
                && isbnNo.isEmpty() && categoryId.isEmpty()) {
            generalQuery += " WHERE LB.AUTHOR_ID = '" + authorId.trim() + "' \n";
        }

        generalQuery += " AND LB.RACK_ID = R.ID                         \n"
                + " AND LB.SHELF_ID = S.ID                              \n"
                //+ " AND R.ID = S.RACK_ID                                \n"
                + " AND LB.CATEGORY_ID = CAT.ID                         \n"
                + " AND LB.PUBLISHER_ID = PUB.ID                        \n"
                + " AND LB.SUBJECT_ID = SUB.ID                          \n"
                + " AND LB.AUTHOR_ID = BA.ID                            \n"
                + " AND LB.BINDING_ID = BIN.ID                          \n";

        List<HashMap> listbook = Constants.dao.selectDatainList(generalQuery, BookColumns);

        List<BookReg> listreg = new ArrayList<>();

        for (int i = 0; i < listbook.size(); i++) {

            HashMap map = (HashMap) listbook.get(i);
            BookReg objbook = new BookReg();

            objbook.setBookId(map.get("ID").toString());
            objbook.setBookName(map.get("BOOK_NAME").toString());
            objbook.setIsbnNo(map.get("ISBN_NO").toString());
            objbook.setPublisherId(map.get("PUBLISHER_ID").toString());
            objbook.setPublisherName(map.get("PUBLISHER_NAME").toString());
            objbook.setSubjectId(map.get("SUBJECT_ID").toString());
            objbook.setSubjectName(map.get("SUBJECT_NAME").toString());
            objbook.setCategoryId(map.get("CATEGORY_ID").toString());
            objbook.setCategoryName(map.get("CATEGORY_NAME").toString());
            objbook.setAuthorDescription(map.get("AUTHOR_NAME").toString());
            objbook.setYear(map.get("YEAR").toString());
            objbook.setEdition(map.get("EDITION").toString());
            objbook.setActive(map.get("ACTIVE").toString());
            objbook.setPrice(map.get("PRICE").toString());
            objbook.setPages(map.get("PAGES").toString());
            objbook.setBindingId(map.get("BINDING_ID").toString());
            objbook.setBindingName(map.get("BINDING_NAME").toString());
            objbook.setBookLimitDay(map.get("BOOK_LIMIT_DAYS").toString());
            objbook.setShelfName(map.get("SHELF_NAME").toString());
            objbook.setRackName(map.get("RACK_NAME").toString());
            listreg.add(objbook);
        }
        return listreg;
    }

    public List<BookReg> getBookAuthor(String bookId) {

        String columns[] = {"-", "BOOK_ID", "AUTHOR_ID", "DESCRIPTION"};

        String query
                = "SELECT BWA.BOOK_ID,BWA.AUTHOR_ID,"
                + "NVL(BA.DESCRIPTION,' ') DESCRIPTION                    \n"
                + " FROM " + Database.DCMS.bookAuthor + " BA,             \n"
                + Database.DCMS.book + " LB,                              \n"
                + Database.DCMS.bookWiseAuthor + " BWA                    \n"
                + "WHERE BWA.BOOK_ID = '" + bookId + "'                   \n"
                + "AND  BWA.AUTHOR_ID = BA.ID                             \n"
                + "AND  LB.ID = BWA.BOOK_ID                               \n";

        List<HashMap> listBookAuthor = Constants.dao.selectDatainList(query, columns);
        List<BookReg> listAuthor = new ArrayList<>();

        for (int i = 0; i < listBookAuthor.size(); i++) {

            HashMap map = (HashMap) listBookAuthor.get(i);
            BookReg qw = new BookReg();
            qw.setBookId(map.get("BOOK_ID").toString());
            qw.setAuthorId(map.get("AUTHOR_ID").toString());
            qw.setAuthorDescription(map.get("DESCRIPTION").toString());
            listAuthor.add(qw);
        }

        return listAuthor;
    }

    public boolean updateBookRegistration(BookReg objBookBo) {

        String query
                = " UPDATE " + Database.DCMS.book + " B                  \n SET"
                + " B.ISBN_NO =  '" + objBookBo.getIsbnNo().trim() + "', \n"
                + " B.CATEGORY_ID = '" + objBookBo.getCategoryId().trim() + "',  \n"
                + " B.PUBLISHER_ID = '" + objBookBo.getPublisherId().trim() + "',        \n";

        if (!objBookBo.getBindingId().trim().equalsIgnoreCase("")) {
            query += " B.BINDING_ID =      '" + objBookBo.getBindingId().trim() + "',  \n";
        }

        query += " B.YEAR =          '" + objBookBo.getYear().trim() + "',               \n"
                + " B.EDITION =       '" + objBookBo.getEdition().trim() + "',           \n"
                + " B.BOOK_LIMIT_DAYS =  '" + objBookBo.getBookLimitDay().trim() + "',   \n";

        if (objBookBo.getActive().equalsIgnoreCase("Y")) {
            query += " B.ACTIVE  =  '" + objBookBo.getActive().trim() + "',           \n";
        }
        if (!objBookBo.getRackId().equalsIgnoreCase("") && ! !objBookBo.getShelfId().equalsIgnoreCase("")) {
            query += " B.RACK_ID =  '" + objBookBo.getRackId().trim() + "',              \n"
                    + " B.SHELF_ID =  '" + objBookBo.getShelfId().trim() + "',           \n";
        }

        query += " B.BOOK_NAME =   '" + objBookBo.getBookName().trim().replaceAll("'", "''") + "'              \n"
                + "WHERE B.ID  = '" + objBookBo.getBookId().trim() + "'                  \n";

        return Constants.dao.executeUpdate(query, false);
    }

    //GenerateKeys key = new GenerateKeys();
    public boolean inserBooktAuthor(BookReg objbook) {

        String[] columns = {Database.DCMS.bookWiseAuthor, "BOOK_ID", "AUTHOR_ID"};

        HashMap insertBookAuthor = new HashMap();

        insertBookAuthor.put("BOOK_ID", "'" + objbook.getBookId() + "'");
        insertBookAuthor.put("AUTHOR_ID", "'" + objbook.getAuthorId() + "'");

        List lst = new ArrayList();
        lst.add(insertBookAuthor);
        return Constants.dao.insertData(lst, columns);

    }

    public boolean DeleteAuthor(BookReg del) {
        String query = "DELETE FROM "
                + Database.DCMS.bookWiseAuthor
                + " WHERE BOOK_ID = '" + del.getBookId() + "'"
                + " AND AUTHOR_ID = '" + del.getAuthorId() + "' ";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertBookRegistration(BookReg objBookBo) {
        String[] columns = {Database.DCMS.book, "ID", "BOOK_NAME",
            "EDITION", "PUBLISHER_ID", "YEAR", "ISBN_NO", "SUBJECT_ID",  
            "CATEGORY_ID", "AUTHOR_ID", "RACK_ID", "SHELF_ID", 
             "BOOK_LIMIT_DAYS", "CRTD_BY", "CRTD_DATE", 
            "CRTD_TERMINAL_ID", "ACTIVE", "PRICE",  "PAGES", "BINDING_ID"};

        HashMap insertBook = new HashMap();

        insertBook.put("ID", Sequences.bookId);
        insertBook.put("BOOK_NAME", "'" + objBookBo.getBookName() + "'");
        insertBook.put("EDITION", "'" + objBookBo.getEdition() + "'");
        insertBook.put("PUBLISHER_ID", "'" + objBookBo.getPublisherId() + "'");
        insertBook.put("YEAR", "'" + objBookBo.getYear() + "'");
        insertBook.put("ISBN_NO", "'" + objBookBo.getIsbnNo() + "'");
        insertBook.put("SUBJECT_ID", "'" + objBookBo.getSubjectId() + "'");
        insertBook.put("CATEGORY_ID", "'" + objBookBo.getCategoryId() + "'");
        insertBook.put("AUTHOR_ID", "'" + objBookBo.getAuthorId() + "'");
        insertBook.put("RACK_ID", "'" + objBookBo.getRackId() + "'");
        insertBook.put("SHELF_ID", "'" + objBookBo.getShelfId() + "'");
        insertBook.put("BOOK_LIMIT_DAYS", "'" + objBookBo.getBookLimitDay() + "'");
        insertBook.put("CRTD_BY", "'" + Constants.userId + "'");
        insertBook.put("CRTD_DATE", "SYSDATE");
        insertBook.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        insertBook.put("ACTIVE", "'" + objBookBo.getIsActive() + "'");
        insertBook.put("PRICE", "'" + objBookBo.getPrice() + "'");
        insertBook.put("PAGES", "'" + objBookBo.getPages() + "'");
        insertBook.put("BINDING_ID", "'" + objBookBo.getBindingId() + "'");
        //insertBook.put("BINDING_ID ", "'" + objBookBo.BbindingId + "'");

//        insertBook.put("IS_ACTIVE", "'" + objBookBo.getActive()+ "'");
        List listMember = new ArrayList();
        listMember.add(insertBook);
        return Constants.dao.insertData(listMember, columns);
    }

    public static void main(String[] args) {

        System.out.println("");
    }
}
