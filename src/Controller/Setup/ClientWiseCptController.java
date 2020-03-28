package Controller.Setup;

import BO.Client.ClientWiseCpt;
import Handler.Setup.ClientWiseCptHandler;
import java.util.List;
import utilities.Constants;

public class ClientWiseCptController {

    ClientWiseCptHandler hdlClientWiseCpt = new ClientWiseCptHandler();

    public List<ClientWiseCpt> getClientWiseCpt(String clientId, String clientDescription,
            String clientType, String cptId, String cptDescription,
            String department, String section) {
        return hdlClientWiseCpt.selectClientWiseCPT(clientId, clientDescription,
                clientType, cptId, cptDescription, department, section);
    }

    public List<ClientWiseCpt> getUnAttachedClients(String cptId, String clientDescription,
            String transactionType) {
        return hdlClientWiseCpt.selectUnAttachedClient(cptId, clientDescription,
                transactionType);
    }

    public List<ClientWiseCpt> getUnAttachedCpts(String clientId, String cptDescription,
            String departmentId, String section) {
        return hdlClientWiseCpt.selectUnAttachedCPT(clientId, cptDescription,
                departmentId, section);
    }

    public boolean attachClientAndCpt(List<ClientWiseCpt> listClientWiseCpt) {
        boolean ret = true;

        if (ret) {
            hdlClientWiseCpt.unAttachClientAndCpt(listClientWiseCpt);
        }
        if (ret) {
            hdlClientWiseCpt.insertClientWiseCPT(listClientWiseCpt);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean unAttachClientAndCpt(List<ClientWiseCpt> listClientWiseCpt) {
        boolean ret = true;

        if (ret) {
            hdlClientWiseCpt.unAttachClientAndCpt(listClientWiseCpt);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateContract(List<ClientWiseCpt> listClientWiseCpt) {
        boolean ret = true;

        if (ret) {
            hdlClientWiseCpt.updateContract(listClientWiseCpt);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}