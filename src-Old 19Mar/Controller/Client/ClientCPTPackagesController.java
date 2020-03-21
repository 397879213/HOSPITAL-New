/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Client;

import BO.Client.ClientWiseCPTGroup;
import Handler.Client.ClientCPTPackagesHandler;
import java.util.List;
import org.bridj.demangling.Demangler;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class ClientCPTPackagesController {

    ClientCPTPackagesHandler hdlClientCPTPackage = new ClientCPTPackagesHandler();

    public List<ClientWiseCPTGroup> selectClientWisePackage(String clientId,
            String packageId) {
        return hdlClientCPTPackage.selectClientWisePackage(clientId, packageId);
    }

    public List<ClientWiseCPTGroup> selectClientWisePackageDetail(String packageId,
            String cptName) {
        return hdlClientCPTPackage.selectClientWisePackageDetail(packageId, cptName);
    }

    public boolean updatePackageName(ClientWiseCPTGroup pkg) {
        boolean ret = hdlClientCPTPackage.updatePackageName(pkg);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deletePackage(ClientWiseCPTGroup pkg) {
        boolean ret = hdlClientCPTPackage.deletePackage(pkg);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deletePackageDetail(ClientWiseCPTGroup pkg) {
        boolean ret = hdlClientCPTPackage.deletePackageDetail(pkg);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean addNewPackage(ClientWiseCPTGroup pkg) {
        boolean ret = hdlClientCPTPackage.addNewPackage(pkg);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean addPackageDetail(ClientWiseCPTGroup pkg) {
        boolean ret = hdlClientCPTPackage.addPackageDetail(pkg);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
