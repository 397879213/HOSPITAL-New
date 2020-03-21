/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Controller;

import Library.BO.BookReg;
import Library.Handler.BookRegistrationHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author furqan
 */
public class BookRegController {

    BookRegistrationHandler hdlBookReg = new BookRegistrationHandler();

    public List<BookReg> SelectBook(String bookName, String isbnNo,
            String categoryId, String authorId) {
        return hdlBookReg.SearchBook(bookName, isbnNo, categoryId, authorId);
    }

    public boolean updateBook(BookReg objBookBo) {

        boolean ret = hdlBookReg.updateBookRegistration(objBookBo);

        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }

        return ret;
    }

    public boolean insertBook(BookReg objBookBo) {

        boolean ret = hdlBookReg.insertBookRegistration(objBookBo);

        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }

        return ret;
    }

    public List<BookReg> getBookAuthor(String bookId) {
        return hdlBookReg.getBookAuthor(bookId);
    }

    public boolean insertBookAuthor(BookReg objBookBo) {

        boolean ret = hdlBookReg.inserBooktAuthor(objBookBo);

        if (ret) {

            Constants.dao.commitTransaction();
        }

        if (!ret) {

            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean DeleteAuthor(BookReg del) {
        boolean ret = hdlBookReg.DeleteAuthor(del);
        if (ret) {
            ret = Constants.dao.commitTransaction();

        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}
