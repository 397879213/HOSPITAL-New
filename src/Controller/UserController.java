package Controller;

import BO.User;
import Handler.UserHandler;
import java.util.List;
import utilities.Constants;

public class UserController {

    private UserHandler hdlUser = new UserHandler();

    public boolean registerUser(User user) {
        boolean ret = hdlUser.registerUser(user);
        if (ret) {
            ret = hdlUser.insertClientProperties(user.getUserName(),
                    user.getDefaultUserName());
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean getEmployee(String trim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateLoginId(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean setUserDefaultColor(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean setUserSupportLimit(User user, String trim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean setUserPrescriptionDays(User user, String trim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<User> searchUser(User user) {
        return (List<User>) hdlUser.searchUser(user);
    }

    public boolean createUser(User userData) {
        return hdlUser.registerUser(userData);
    }

    public boolean updateUserDataUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
