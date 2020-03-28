/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Setup;

import BO.Client.ClientWiseCpt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Owner
 */
public class ClientWiseCptHandler {

    public boolean insertClientWiseCPT(List<ClientWiseCpt> listClientWiseCpt) {

        String[] columns = {Database.DCMS.clientWiseCPT, "CRTD_BY", "CLIENT_ID",
            "CPT_ID", "CONTRACT_PRICE", "CONTRACT_STATUS", "CRTD_TERMINAL_ID"};

        List list = new ArrayList();
        for (int i = 0; i < listClientWiseCpt.size(); i++) {
            ClientWiseCpt clientWiseCpt = listClientWiseCpt.get(i);
            HashMap map = new HashMap();
            map.put("CPT_ID", "'" + clientWiseCpt.getCptId() + "'");
            map.put("CLIENT_ID", "'" + clientWiseCpt.getClientId() + "'");
            map.put("CONTRACT_PRICE", "'" + clientWiseCpt.getClientCptPrice() + "'");
            map.put("CONTRACT_STATUS", "'" + clientWiseCpt.getContractStatus() + "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            list.add(map);
        }
        return Constants.dao.insertData(list, columns);
    }

    public List SelectCPT(String cptDescription, String department, String section) {

        String colums[] = {"-", "CPT_ID", "CPT_DESCRIPTION", "PRICE", "ACTIVE",
            "DEPARTMENT_ID"};

        String query = " SELECT                                             \n"
                + " CPT.CPT_ID         CPT_ID                              ,\n"
                + " CPT.DESCRIPTION    CPT_DESCRIPTION                     ,\n"
                + " CPT.COST           PRICE                               ,\n"
                + " CPT.DEPARTMENT_ID  DEPARTMENT_ID                       ,\n"
                + " CPT.ACTIVE         ACTIVE                               \n"
                + " FROM                                                    \n"
                + Database.DCMS.CPT + "                      CPT            \n"
                + " WHERE CPT.DESCRIPTION LIKE '%" + cptDescription + "%'   \n";

        if (!department.isEmpty()) {
            query += " AND CPT.DEPARTMENT_ID ='" + department + "'          \n";
        }

        if (!section.isEmpty()) {
            query += " AND CPT.SECTION_ID = '" + section + "'               \n";
        }

        List<HashMap> vec = Constants.dao.selectDatainList(query, colums);
        List<ClientWiseCpt> vecCPT = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = vec.get(i);
            ClientWiseCpt cpt = new ClientWiseCpt();
            cpt.setCptId(map.get("CPT_ID").toString());
            cpt.setCptDescription(map.get("CPT_DESCRIPTION").toString());
            cpt.setCptPrice(map.get("PRICE").toString());
            cpt.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            cpt.setCptStatus(map.get("ACTIVE").toString());
            vecCPT.add(cpt);
        }
        return vecCPT;
    }

    public List selectClientWiseCPT(String clientId, String clientDescription,
            String clientType, String cptId, String cptDescription,
            String department, String section) {

        String[] columns = {"", "CPT_ID", "CPT_DESCRIPTION", "CPT_PRICE",
            "DEPARTMENT", "DEPARTMENT_DESCRIPTION", "SECTION", "ACTIVE",
            "CLIENT_ID", "CLIENT_NAME", "CLIENT_PRICE", "CONTRACT_STATUS",
            "CLIENT_CPT_ACTIVE", "PERCENTAGE_DISCOUNT", "TEST_LIMIT", "IS_CREDIT"};

        String query
                = " SELECT                                              \n"
                + " CPT.CPT_ID                CPT_ID,                   \n"
                + " CPT.DESCRIPTION           CPT_DESCRIPTION,          \n"
                + " CPT.COST                  CPT_PRICE,                \n"
                + " CPT.DEPARTMENT_ID         DEPARTMENT,               \n"
                + " DEP.DESCRIPTION           DEPARTMENT_DESCRIPTION,   \n"
                + " CPT.SECTION_ID            SECTION,                  \n"
                + " CPT.ACTIVE                ACTIVE,                   \n"
                + " CWC.CLIENT_ID             CLIENT_ID,                \n"
                + " CLT.DESCRIPTION           CLIENT_NAME,              \n"
                + " NVL(CWC.CONTRACT_PRICE, '0')  CLIENT_PRICE,         \n"
                + " NVL(CWC.CONTRACT_STATUS, 'N') CONTRACT_STATUS,      \n"
                + " CWC.ACTIVE                CLIENT_CPT_ACTIVE,        \n"
                + " NVL(CWC.PERCENTAGE_DISCOUNT , '0') PERCENTAGE_DISCOUNT ,\n"
                + " CWC.TEST_LIMIT            TEST_LIMIT,               \n"
                + " CWC.IS_CREDIT                                       \n"
                + " FROM                                                \n"
                + Database.DCMS.CPT + " CPT,                            \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.department + " DEP,                     \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE CPT.CPT_ID = CWC.CPT_ID                       \n"
                + " AND CLT.ID = CWC.CLIENT_ID                          \n"
                + " AND DEP.ID = CPT.DEPARTMENT_ID                      \n"
                + " AND CPT.ACTIVE = 'Y'                                \n";

        if (clientId.length() != 0) {
            query += " AND CWC.CLIENT_ID = '" + clientId + "'           \n";
        }
        if (clientDescription.length() != 0) {
            query += " AND CLT.DESCRIPTION LIKE '%" + clientDescription + "%'\n";
        }
        if (clientType.length() != 0) {
            query += " AND CLT.TRANSACTION_TYPE = '" + clientType + "'  \n";
        }
        if (cptId.length() != 0) {
            query += " AND CPT.CPT_ID = '" + cptId + "'                 \n";
        }
        if (cptDescription.length() != 0) {
            query += " AND CPT.DESCRIPTION LIKE '%" + cptDescription + "%'\n";
        }
        if (department.length() != 0) {
            query += " AND CPT.DEPARTMENT_ID = '" + department + "'     \n";
        }
        if (section.length() != 0) {
            query += " AND CPT.SECTION_ID = '" + section + "'           \n";
        }
        query += " ORDER BY CLT.DESCRIPTION, CPT.DESCRIPTION            \n";

        List<HashMap> vec = Constants.dao.selectData(query, columns);
        List<ClientWiseCpt> vecCPT = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            ClientWiseCpt clientWiseCpt = new ClientWiseCpt();
            clientWiseCpt.setCptId(map.get("CPT_ID").toString());
            clientWiseCpt.setCptDescription(map.get("CPT_DESCRIPTION").toString());
            clientWiseCpt.setCptPrice(map.get("CPT_PRICE").toString());
            clientWiseCpt.setCptStatus(map.get("ACTIVE").toString());
            clientWiseCpt.setDepartmentId(map.get("DEPARTMENT").toString());
            clientWiseCpt.setDepartmentDescription(map.get("DEPARTMENT_DESCRIPTION").toString());
            clientWiseCpt.setSectionId(map.get("SECTION").toString());
            clientWiseCpt.setClientId(map.get("CLIENT_ID").toString());
            clientWiseCpt.setClientDescription(map.get("CLIENT_NAME").toString());
            clientWiseCpt.setClientCptPrice(map.get("CLIENT_PRICE").toString());
            clientWiseCpt.setContractStatus(map.get("CONTRACT_STATUS").toString());
            clientWiseCpt.setPercentageDiscount(map.get("PERCENTAGE_DISCOUNT").toString());
            clientWiseCpt.setClientCptStatus(map.get("CLIENT_CPT_ACTIVE").toString());
            clientWiseCpt.setTestLimit(map.get("TEST_LIMIT").toString());
            clientWiseCpt.setIsCredit(map.get("IS_CREDIT").toString());
            vecCPT.add(clientWiseCpt);
        }
        return vecCPT;
    }

    public List selectUnAttachedClient(String cptId, String clientDescription,
            String transactionType) {

        String[] columns = {"", "CLIENT_ID", "CLIENT_DESCRIPTION", "CLIENT_ACTIVE"};

        String query = "SELECT                                          \n"
                + "CLI.ID                            CLIENT_ID,         \n"
                + "CLI.DESCRIPTION                   CLIENT_DESCRIPTION,\n"
                + "CLI.ACTIVE                        CLIENT_ACTIVE      \n"
                + "FROM                                                 \n"
                + "EMR.CLIENT                        CLI                \n"
                + "WHERE CLI.ID NOT IN (SELECT CWP.CLIENT_ID            \n"
                + "FROM " + Database.DCMS.clientWiseCPT + " CWP,        \n"
                + Database.DCMS.CPT + " CPT                             \n"
                + "WHERE CWP.CPT_ID = '" + cptId + "'                   \n"
                + "AND CWP.CPT_ID = CPT.CPT_ID)                         \n"
                + "AND CLI.ACTIVE = 'Y'                                 \n";

        if (!clientDescription.isEmpty()) {
            query += " AND CLI.DESCRIPTION LIKE '%" + clientDescription + "%'\n";
        }
        if (!transactionType.isEmpty()) {
            query += " AND CLI.TRANSACTION_TYPE LIKE '%" + transactionType + "%'\n";
        }
        query += "ORDER BY CLI.DESCRIPTION                              \n";

        List<HashMap> vec = Constants.dao.selectData(query, columns);
        List<ClientWiseCpt> vecCPT = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            ClientWiseCpt clientWiseCpt = new ClientWiseCpt();
            clientWiseCpt.setClientId(map.get("CLIENT_ID").toString());
            clientWiseCpt.setClientDescription(map.get("CLIENT_DESCRIPTION").toString());
            clientWiseCpt.setClientStatus(map.get("CLIENT_ACTIVE").toString());
            vecCPT.add(clientWiseCpt);
        }
        return vecCPT;
    }

    public List selectUnAttachedCPT(String clientId, String cptDescription,
            String departmentId, String section) {

        String[] columns = {"", "CPT_ID", "CPT_DESCRIPTION", "CPT_PRICE",
            "CPT_ACTIVE", "IS_CREDIT"};

        String query = "SELECT                                       \n"
                + "CPT.CPT_ID                        CPT_ID,         \n"
                + "CPT.DESCRIPTION                   CPT_DESCRIPTION,\n"
                + "CPT.COST                          CPT_PRICE,      \n"
                + "CPT.ACTIVE                        CPT_ACTIVE      \n"
                + "FROM                                              \n"
                + "EMR.CPT                           CPT             \n"
                + "WHERE CPT.CPT_ID NOT IN (SELECT CWP.CPT_ID        \n"
                + "FROM "
                + Database.DCMS.clientWiseCPT + " CWP,               \n"
                + Database.DCMS.client + " CLI                       \n"
                + " WHERE CWP.CLIENT_ID = '" + clientId + "'         \n"
                + " AND CWP.CLIENT_ID = CLI.ID)                      \n"
                + " AND CPT.ACTIVE = 'Y'                             \n";

        if (!cptDescription.isEmpty()) {
            query += " AND CPT.DESCRIPTION LIKE '%" + cptDescription + "%'\n";
        }
        if (!departmentId.isEmpty()) {
            query += " AND CPT.DEPARTMENT_ID = '" + departmentId + "' \n";
        }
        if (!section.isEmpty()) {
            query += " AND CPT.SECTION_ID = '" + section + "'         \n";
        }
        query += "ORDER BY CPT.DESCRIPTION                            \n";

        List<HashMap> vec = Constants.dao.selectData(query, columns);
        List<ClientWiseCpt> vecCPT = new ArrayList<>();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            ClientWiseCpt clientWiseCpt = new ClientWiseCpt();
            clientWiseCpt.setCptId(map.get("CPT_ID").toString());
            clientWiseCpt.setCptDescription(map.get("CPT_DESCRIPTION").toString());
            clientWiseCpt.setCptPrice(map.get("CPT_PRICE").toString());
            clientWiseCpt.setCptStatus(map.get("CPT_ACTIVE").toString());
            clientWiseCpt.setIsCredit(map.get("IS_CREDIT").toString());
            vecCPT.add(clientWiseCpt);
        }
        return vecCPT;
    }

    public boolean unAttachClientAndCpt(List<ClientWiseCpt> listClientWiseCpt) {

        boolean ret = true;
        for (int i = 0; i < listClientWiseCpt.size(); i++) {
            ClientWiseCpt clientWiseCpt = listClientWiseCpt.get(i);
            String query = "DELETE FROM " + Database.DCMS.clientWiseCPT + "\n"
                    + " WHERE CPT_ID = '" + clientWiseCpt.getCptId() + "'  \n"
                    + " AND CLIENT_ID = '" + clientWiseCpt.getClientId() + "'\n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean updateContract(List<ClientWiseCpt> listClientWiseCpt) {

        boolean ret = true;
        for (int i = 0; i < listClientWiseCpt.size(); i++) {
            ClientWiseCpt clientWiseCpt = listClientWiseCpt.get(i);
            String query = " UPDATE " + Database.DCMS.clientWiseCPT + "\n"
                    + " SET CONTRACT_PRICE = '" + clientWiseCpt.getClientCptPrice() + "',"
                    + " CONTRACT_STATUS = '" + clientWiseCpt.getContractStatus() + "'\n"
                    + " WHERE CPT_ID = '" + clientWiseCpt.getCptId() + "'    \n"
                    + " AND CLIENT_ID = '" + clientWiseCpt.getClientId() + "'\n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
}
