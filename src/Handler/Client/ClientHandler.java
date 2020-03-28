package Handler.Client;

import BO.Client.Client;
import BO.CPT.CPT;
import BO.SetupColumnDetail;
import Handler.Setup.CPTHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.GenerateKeys;
import utilities.Keys;

public class ClientHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();
    CPTHandler cpt = new CPTHandler();

    public List<SetupColumnDetail> selectClientProprties(String clientId) {

        String[] cols = {"-", "ID", "PROPERTY", "TABLE_ROW_ID", "TABLE_COLUMN_ID",
            "DESCRIPTION"};

        String query
                = "SELECT STC.ID, STC.PROPERTY, SCD.TABLE_ROW_ID, SCD.TABLE_COLUMN_ID,"
                + "\n NVL(SCD.DESCRIPTION, ' ') DESCRIPTION FROM "
                + "\n " + Database.DCMS.setupColumnDetail + " SCD,"
                + "\n "+ Database.DCMS.setupTableColums +" STC"
                + "\n WHERE SCD.TABLE_ROW_ID = '" + clientId + "'"
                + "\n AND STC.ID = SCD.TABLE_COLUMN_ID"
                + "\n AND STC.ACTIVE = 'Y'";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);

        List<SetupColumnDetail> listItems = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);

            SetupColumnDetail setupProperties = new SetupColumnDetail();
            setupProperties.setId(map.get("ID").toString());
            setupProperties.setProperty(map.get("PROPERTY").toString());
            setupProperties.setTableRowId(map.get("TABLE_ROW_ID").toString());
            setupProperties.setTableColumnId(map.get("TABLE_COLUMN_ID").toString());
            setupProperties.setDefaultValue(map.get("DESCRIPTION").toString());
            listItems.add(setupProperties);
        }
        return listItems;
    }

    public boolean updateClientSetupProprties(List<SetupColumnDetail> listProperties) {
        boolean ret = true;

        for (int i = 0; i < listProperties.size(); i++) {
            SetupColumnDetail property = listProperties.get(i);

            String query
                    = " UPDATE " + Database.DCMS.setupTableColums + "\n"
                + " SET DEFAULT_VALUE  ='" + property.getDefaultValue() + "'\n"
                + " WHERE ID ='" + property.getId() + "'\n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }
    
    public boolean registerClient(Client client) {
        boolean ret = true;

        String[] columns = {Database.DCMS.client, "ID", "DESCRIPTION",
            "EMAIL_ADDRESS", "ADDRESS", "CONTACT_PERSON", "LAND_LINE_NO", "CLIENT_TYPE",
            "MOBILE_NO", "ACTIVE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID",
            "TRANSACTION_TYPE", "SELECT_IT", "SELECTION_ALLOWED", "PATIENT_UPDATE_ALLOW",
            "PATIENT_CONTACT_NO", "PATIENT_REPORT_EMAIL", "SEND_SMS", "DISPLAY_REPORT",
            "DISCOUNT", "CREDIT_LIMIT", "TEST_LIMIT",
            "CHECK_CREDIT", "ACCOUNT_ID"};

        HashMap clientMap = new HashMap();
        clientMap.put("DESCRIPTION", "'" + client.getClientName() + "'");
        clientMap.put("EMAIL_ADDRESS", "'" + client.getEmail() + "'");
        clientMap.put("ADDRESS", "'" + client.getAddress() + "'");
        clientMap.put("CONTACT_PERSON", "'" + client.getContactPerson() + "'");
        clientMap.put("LAND_LINE_NO", "'" + client.getLandLineNo() + "'");
        clientMap.put("MOBILE_NO", "'" + client.getMobileNo() + "'");
        clientMap.put("ACCOUNT_ID", "'" + client.getAccountId() + "'");
        clientMap.put("CREDIT_LIMIT", "'" + client.getCreditLimit() + "'");
        clientMap.put("LOCATION_ID", "'" + client.getLocationId() + "'");
        clientMap.put("ACTIVE", "'" + client.getActive() + "'");
        clientMap.put("DISCOUNT", "'" + client.getDiscount() + "'");
        clientMap.put("CHECK_CREDIT", "'" + client.getCheckCreditLimit() + "'");
        clientMap.put("CLIENT_TYPE", "'" + client.getClientType() + "'");
        clientMap.put("TEST_LIMIT", "'" + client.getTestLimit() + "'");
        clientMap.put("TRANSACTION_TYPE", "'" + client.getTransactionType() + "'");
        clientMap.put("SELECT_IT", "'" + client.getSelectIt() + "'");
        clientMap.put("SELECTION_ALLOWED", "'" + client.getSelectionAllow() + "'");
        clientMap.put("PATIENT_UPDATE_ALLOW", "'" + client.getPatientUpdate() + "'");
        clientMap.put("PATIENT_CONTACT_NO", "'" + client.getPatientContact() + "'");
        clientMap.put("PATIENT_REPORT_EMAIL", "'" + client.getPatientReportEmail() + "'");
        clientMap.put("SEND_SMS", "'" + client.getSendSms() + "'");
        clientMap.put("DISPLAY_REPORT", "'" + client.getDisplayReport() + "'");
        clientMap.put("CRTD_BY", "'" + Constants.userId + "'");
        clientMap.put("CRTD_DATE", "SYSDATE");
        clientMap.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        clientMap.put("ID", "(SELECT MAX(ID) +1 FROM " + Database.DCMS.client + ")");
        Vector vec = new Vector();
        vec.add(clientMap);
        return Constants.dao.insertData(vec, columns);
    }

    public Client searchClientById(String clientId) {

        String[] columns = {Database.DCMS.client, "ID", "DESCRIPTION",
            "CREDIT_LIMIT", "EMAIL_ADDRESS", "CONTACT_PERSON", "LAND_LINE_NO",
            "ADDRESS", "CLIENT_TYPE", "MOBILE_NO", "ACTIVE", "TRANSACTION_TYPE",
            "TEST_LIMIT", "CHECK_CREDIT", "ACCOUNT_ID", "SELECT_IT", "SELECTION_ALLOWED",
            "PATIENT_UPDATE_ALLOW", "PATIENT_CONTACT_NO", "PATIENT_REPORT_EMAIL", "SEND_SMS",
            "DISPLAY_REPORT"};

        String query
                = " SELECT "
                + " CLT.ID, CLT.DESCRIPTION ,                               \n"
                + " NVL(CLT.EMAIL_ADDRESS , ' ') EMAIL_ADDRESS ,            \n"
                + " NVL(CLT.CONTACT_PERSON , ' ') CONTACT_PERSON ,          \n"
                + " NVL(CLT.ACCOUNT_ID , 0) ACCOUNT_ID,                     \n"
                + " NVL(CLT.LAND_LINE_NO , ' ') LAND_LINE_NO,               \n"
                + " NVL(CLT.ADDRESS , ' ') ADDRESS,                         \n"
                + " NVL(CLT.MOBILE_NO , ' ') MOBILE_NO,                     \n"
                + " NVL(CLT.CREDIT_LIMIT , '10') CREDIT_LIMIT,              \n"
                + " NVL(CLT.TRANSACTION_TYPE , 'CASH')TRANSACTION_TYPE,     \n"
                + " NVL(CLT.CLIENT_TYPE , 'PANEL') CLIENT_TYPE,             \n"
                + " NVL(CLT.TEST_LIMIT , 'Y') TEST_LIMIT,                   \n"
                + " NVL(CLT.CHECK_CREDIT , 'Y') CHECK_CREDIT,               \n"
                + " NVL(CLT.SELECT_IT , 'N') SELECT_IT,                     \n"
                + " NVL(CLT.SELECTION_ALLOWED , 'N') SELECTION_ALLOWED,     \n"
                + " NVL(CLT.PATIENT_UPDATE_ALLOW , 'N') PATIENT_UPDATE_ALLOW, \n"
                + " NVL(CLT.PATIENT_CONTACT_NO , ' ') PATIENT_CONTACT_NO,     \n"
                + " NVL(CLT.PATIENT_REPORT_EMAIL , ' ') PATIENT_REPORT_EMAIL, \n"
                + " NVL(CLT.SEND_SMS , 'N') SEND_SMS,                         \n"
                + " NVL(CLT.DISPLAY_REPORT , 'N') DISPLAY_REPORT,             \n"
                + " ACTIVE                                                  \n"
                + " FROM "
                + Database.DCMS.client + " CLT "
                + " WHERE CLT.ID = '" + clientId + "'";

        return (Client) (setStudyVector(Constants.dao.selectData(query, columns))).get(0);
    }

    public Vector searchClientByName(String clientName) {

        String[] columns = {Database.DCMS.client, "ID", "DESCRIPTION",
            "CREDIT_LIMIT", "EMAIL_ADDRESS", "CONTACT_PERSON", "LAND_LINE_NO",
            "ADDRESS", "CLIENT_TYPE", "MOBILE_NO", "ACTIVE", "TRANSACTION_TYPE",
            "TEST_LIMIT", "CHECK_CREDIT", "ACCOUNT_ID", "SELECT_IT", "SEND_SMS",
            "SELECTION_ALLOWED", "PATIENT_UPDATE_ALLOW", "PATIENT_CONTACT_NO",
            "PATIENT_REPORT_EMAIL", "DISPLAY_REPORT"};

        String query
                = " SELECT "
                + " CLT.ID, CLT.DESCRIPTION ,                               \n"
                + " NVL(CLT.EMAIL_ADDRESS , ' ') EMAIL_ADDRESS ,            \n"
                + " NVL(CLT.CONTACT_PERSON , ' ') CONTACT_PERSON ,          \n"
                + " NVL(CLT.LAND_LINE_NO , ' ') LAND_LINE_NO,               \n"
                + " NVL(CLT.ACCOUNT_ID , 0) ACCOUNT_ID,                     \n"
                + " NVL(CLT.ADDRESS , ' ') ADDRESS,                         \n"
                + " NVL(CLT.MOBILE_NO , ' ') MOBILE_NO,                     \n"
                + " NVL(CLT.CREDIT_LIMIT , '10') CREDIT_LIMIT,              \n"
                + " NVL(CLT.TRANSACTION_TYPE , 'CASH')TRANSACTION_TYPE,     \n"
                + " NVL(CLT.CLIENT_TYPE , 'PANEL') CLIENT_TYPE,             \n"
                + " NVL(CLT.TEST_LIMIT , 'N') TEST_LIMIT,                   \n"
                + " NVL(CLT.CHECK_CREDIT , 'N') CHECK_CREDIT,               \n"
                + " NVL(CLT.SELECT_IT , 'N') SELECT_IT,                     \n"
                + " NVL(CLT.SELECTION_ALLOWED , 'N') SELECTION_ALLOWED,     \n"
                + " NVL(CLT.PATIENT_UPDATE_ALLOW , 'N') PATIENT_UPDATE_ALLOW, \n"
                + " NVL(CLT.PATIENT_CONTACT_NO , ' ') PATIENT_CONTACT_NO,     \n"
                + " NVL(CLT.PATIENT_REPORT_EMAIL , ' ') PATIENT_REPORT_EMAIL, \n"
                + " NVL(CLT.SEND_SMS , 'N') SEND_SMS,                         \n"
                + " NVL(CLT.DISPLAY_REPORT , 'N') DISPLAY_REPORT,             \n"
                + " ACTIVE                                                    \n"
                + " FROM "
                + Database.DCMS.client + " CLT "
                + " WHERE UPPER(CLT.DESCRIPTION) LIKE '%" + clientName.toUpperCase() + "%'";
        System.out.println(query);
        return setStudyVector(Constants.dao.selectData(query, columns));
    }

    public Vector selectClientAttachedPackage(String packageDescription,
            String clientId) {
        String[] cols = {"", "ID", "DESCRIPTION",};
        String query = " SELECT PKG.ID ID ,     DESCRIPTION "
                + " FROM " + Database.DCMS.definitionTypeDetail + " PKG, \n"
                + Database.DCMS.clientWisePackage + "   CWP \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.cptPackage + "\n"
                + " AND PKG.ID = CWP.PACKAGE_ID "
                + " AND CWP.CLIENT_ID = '" + clientId + "' \n"
                + " AND UPPER(DESCRIPTION) LIKE '%"
                + packageDescription.toUpperCase() + "%' \n"
                + " AND PKG.ACTIVE = 'Y' ";

        Vector vec = Constants.dao.selectData(query, cols);
        Vector vecTypeDetail = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            BO.Package typeDetail = new BO.Package();
            typeDetail.id = (String) map.get("ID");
            typeDetail.description = (String) map.get("DESCRIPTION");
            typeDetail.clientWisePackageId = (String) map.get("CWP_ID");
            typeDetail.clientId = clientId;
            vecTypeDetail.add(typeDetail);
        }
        return vecTypeDetail;
    }

    public Vector selectClientUnAttachedPackage(String packageDescription,
            String clientId) {
        String[] cols = {"", "ID", "DESCRIPTION"};
        String query = " SELECT   ID ,    DESCRIPTION "
                + " FROM " + Database.DCMS.definitionTypeDetail + " PKG \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.cptPackage + "\n"
                + " AND UPPER(DESCRIPTION) LIKE '%"
                + packageDescription.toUpperCase() + "%' \n"
                + " AND PKG.ACTIVE = 'Y' \n"
                + " AND ID NOT IN (SELECT PACKAGE_ID FROM "
                + Database.DCMS.clientWisePackage + " "
                + " WHERE CLIENT_ID = '" + clientId + "') \n";

        Vector vec = Constants.dao.selectData(query, cols);
        Vector vecTypeDetail = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            BO.Package typeDetail = new BO.Package();
            typeDetail.id = (String) map.get("ID");
            typeDetail.description = (String) map.get("DESCRIPTION");
            typeDetail.clientWisePackageId = (String) map.get("CWP_ID");
            typeDetail.clientId = clientId;
            vecTypeDetail.add(typeDetail);
        }
        return vecTypeDetail;
    }

    public Vector setStudyVector(Vector clients) {

        Vector vec = new Vector();
        for (int i = 0; i < clients.size(); i++) {
            HashMap hashClient = (HashMap) clients.get(i);
            Client client = new Client();
            client.setActive((String) hashClient.get("ACTIVE"));
            client.setAddress((String) hashClient.get("ADDRESS"));
            client.setClientId((String) hashClient.get("ID"));
            client.setClientName((String) hashClient.get("DESCRIPTION"));
            client.setContactPerson((String) hashClient.get("CONTACT_PERSON"));
            client.setClientType((String) hashClient.get("CLIENT_TYPE"));
            client.setEmail((String) hashClient.get("EMAIL_ADDRESS"));
            client.setEndDate((String) hashClient.get("ENDDATE"));
            client.setLandLineNo((String) hashClient.get("LAND_LINE_NO"));
            client.setMobileNo((String) hashClient.get("MOBILE_NO"));
            client.setAccountId((String) hashClient.get("ACCOUNT_ID"));
            client.setStartDate((String) hashClient.get("STARTDATE"));
            client.setCreditLimit((String) hashClient.get("CREDIT_LIMIT"));
            client.setTransactionType((String) hashClient.get("TRANSACTION_TYPE"));
            client.setClientType((String) hashClient.get("CLIENT_TYPE"));
            client.setCheckCreditLimit((String) hashClient.get("CHECK_CREDIT"));
            client.setTestLimit((String) hashClient.get("TEST_LIMIT"));
            client.setSelectIt((String) hashClient.get("SELECT_IT"));
            client.setSelectionAllow(hashClient.get("SELECTION_ALLOWED").toString());
            client.setPatientUpdate(hashClient.get("PATIENT_UPDATE_ALLOW").toString());
            client.setPatientContact(hashClient.get("PATIENT_CONTACT_NO").toString());
            client.setPatientReportEmail(hashClient.get("PATIENT_REPORT_EMAIL").toString());
            client.setSendSms(hashClient.get("SEND_SMS").toString());
            client.setDisplayReport(hashClient.get("DISPLAY_REPORT").toString());

            vec.add(client);
        }//
        return vec;
    }

    public boolean updateClient(Client client) {

        String query
                = " UPDATE " + Database.DCMS.client + " \n SET "
                + " ACTIVE  = '" + client.getActive().trim() + "' ,"
                + " ADDRESS  = '" + client.getAddress().trim() + "' ,"
                + " DESCRIPTION  = '" + client.getClientName().trim() + "',"
                + " ACCOUNT_ID  = '" + client.getAccountId() + "',"
                + " CONTACT_PERSON  = '" + client.getContactPerson().trim() + "',"
                + " EMAIL_ADDRESS  = '" + client.getEmail().trim() + "',"
                + " LAND_LINE_NO  = '" + client.getLandLineNo().trim() + "',"
                + " MOBILE_NO  = '" + client.getMobileNo().trim() + "',"
                + " TRANSACTION_TYPE  = '" + client.getTransactionType() + "',"
                + " CLIENT_TYPE  = '" + client.getClientType() + "',"
                + " CREDIT_LIMIT  = '" + client.getCreditLimit() + "',"
                + " CHECK_CREDIT  = '" + client.getCheckCreditLimit() + "',"
                + " TEST_LIMIT  = '" + client.getTestLimit() + "',"
                + " SELECT_IT  = '" + client.getSelectIt() + "',"
                + " SELECTION_ALLOWED  = '" + client.getSelectionAllow() + "',"
                + " PATIENT_UPDATE_ALLOW  = '" + client.getPatientUpdate() + "',"
                + " PATIENT_CONTACT_NO  = '" + client.getPatientContact() + "',"
                + " PATIENT_REPORT_EMAIL  = '" + client.getPatientReportEmail() + "',"
                + " SEND_SMS  = '" + client.getSendSms() + "',"
                + " DISPLAY_REPORT  = '" + client.getDisplayReport() + "'"
                + " WHERE ID = '" + client.getClientId() + "'";
        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {

            String hist
                    = " INSERT INTO " + Database.DCMS.updateClientHistory
                    + "( ID, DESCRIPTION, ADDRESS, EMAIL_ADDRESS, CONTACT_PERSON, \n"
                    + " LAND_LINE_NO,MOBILE_NO, TRANSACTION_TYPE, ACTIVE, START_DATE, \n "
                    + " END_DATE, ACCOUNT_ID, DISCOUNT, CLIENT_TYPE, CREDIT_LIMIT,  \n"
                    + " CHECK_CREDIT, TEST_LIMIT, CRTD_BY, CRTD_DATE, CRTD_TERMINAL_ID, \n"
                    + " SELECT_IT, SELECTION_ALLOWED,  PATIENT_UPDATE_ALLOW, \n"
                    + " UPTD_DATE, UPTD_TERMINAL_ID, UPTD_BY) (SELECT ID, DESCRIPTION, \n"
                    + " ADDRESS, EMAIL_ADDRESS, CONTACT_PERSON, LAND_LINE_NO, MOBILE_NO, \n"
                    + " TRANSACTION_TYPE, ACTIVE, START_DATE, END_DATE, ACCOUNT_ID, DISCOUNT,\n"
                    + " CLIENT_TYPE, CREDIT_LIMIT, CHECK_CREDIT, TEST_LIMIT, CRTD_BY,\n "
                    + " CRTD_DATE, CRTD_TERMINAL_ID, SELECT_IT, SELECTION_ALLOWED,  \n"
                    + " PATIENT_UPDATE_ALLOW, SYSDATE,'" + Constants.terminalId + "','"
                    + Constants.userId + "' \n"
                    + " FROM " + Database.DCMS.client + " WHERE "
                    + " ID = " + client.getClientId() + " )";
            ret = Constants.dao.executeUpdate(hist, ret);
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }//

    public boolean updateClientCptTestLimit(int limit, String clientId, String cptId) {

        boolean ret = true;
        String query
                = " UPDATE " + Database.DCMS.clientWiseCPT + " \n SET "
                + " TEST_LIMIT  = '" + limit + "' \n"
                + " WHERE CLIENT_ID = '" + clientId + "' \n"
                + " AND CPT_ID = '" + cptId + "'";
        return Constants.dao.executeUpdate(query, ret);
    }

    public String[] selectActiveClient() {

        String[] cols = {"", "ID"};

        String query = " SELECT ID FROM  " + Database.DCMS.client
                + " WHERE ACTIVE = 'Y' ";

        Vector vec = Constants.dao.selectData(query, cols);
        String[] client = new String[vec.size()];

        for (int i = 0; i < vec.size(); i++) {

            HashMap map = (HashMap) vec.get(i);
            client[i] = map.get("ID").toString();
        }

        return client;
    }

    public Vector selectClientLocations(String clientId, String locationName) {

        String[] cols = {"", "LOC_ID", "LOCATION_DESCRIPTION"};
        String query
                = "SELECT CWL.LOCATION_ID LOC_ID,"
                + " LOC.DESCRIPTION LOCATION_DESCRIPTION        \n"
                + " FROM " + Database.DCMS.location + " LOC,    \n"
                + Database.DCMS.clientWiseLocation + " CWL      \n"
                + " WHERE CWL.CLIENT_ID = " + clientId + "      \n"
                + " AND CWL.LOCATION_ID = LOC.ID \n"
                + " AND UPPER(LOC.DESCRIPTION) LIKE UPPER('%" + locationName + "%')";

        Vector vec = Constants.dao.selectData(query, cols);
        Vector vecLocations = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            Client client = new Client();
            HashMap map = (HashMap) vec.get(i);
            client.setLocationDescription(map.get("LOCATION_DESCRIPTION").toString());
            client.setLocationId(map.get("LOC_ID").toString());
            client.setClientId(clientId);
            vecLocations.add(client);
        }

        return vecLocations;
    }

    public Vector selectUnattachedClientLocations(String clientId, String locationName) {

        String[] cols = {"", "LOCATION_ID", "LOCATION_DESCRIPTION"};
        String query
                = " SELECT LOC.ID LOCATION_ID,LOC.DESCRIPTION LOCATION_DESCRIPTION  \n"
                + " FROM " + Database.DCMS.location + " LOC                         \n"
                + " WHERE LOC.ID NOT IN (SELECT CWL.LOCATION_ID FROM                \n"
                + Database.DCMS.clientWiseLocation + " CWL "
                + " WHERE CWL.CLIENT_ID = '" + clientId + "') \n"
                + " AND UPPER(LOC.DESCRIPTION) LIKE UPPER('%" + locationName + "%')";

        Vector vec = Constants.dao.selectData(query, cols);
        Vector vecLocations = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            Client client = new Client();
            HashMap map = (HashMap) vec.get(i);
            client.setLocationId(map.get("LOCATION_ID").toString());
            client.setLocationDescription(map.get("LOCATION_DESCRIPTION").toString());
            client.setClientId(clientId);
            vecLocations.add(client);
        }

        return vecLocations;
    }

    public boolean insertClientWiseCPT(String fromClientId, String toClientId) {

        List<Client> listClientCPT = selectAllClientCPT(fromClientId);
        List<HashMap> listData = new ArrayList<>();

        String[] columns = {Database.DCMS.clientWiseCPT, "CPT_ID",
            "CLIENT_ID", "CONTRACT_PRICE", "CONTRACT_STATUS"};

        for (int i = 0; i < listClientCPT.size(); i++) {
            Client cpt = listClientCPT.get(i);
            HashMap CPTMap = new HashMap();
            CPTMap.put("CPT_ID", "'" + cpt.getCptId() + "'");
            CPTMap.put("CLIENT_ID", "'" + toClientId + "'");
            CPTMap.put("CONTRACT_PRICE", "'" + cpt.getContactPrice() + "'");
            CPTMap.put("CONTRACT_STATUS", "'" + cpt.getContactStatus() + "'"); //At Start there is not contract in current logic
            listData.add(CPTMap);
        }
        return Constants.dao.insertData(listData, columns);
    }

    public boolean insertClientLocation(String locationId, String clientId) {
        String[] cols = {Database.DCMS.clientWiseLocation, "LOCATION_ID", "CLIENT_ID", "ID"};

        HashMap clientMap = new HashMap();
        clientMap.put("ID", "'" + key.generatePrimaryKey(Keys.clientWiseLocation, false) + "'");
        clientMap.put("CLIENT_ID", "'" + clientId + "'");
        clientMap.put("LOCATION_ID", "'" + locationId + "'");

        Vector vec = new Vector();
        vec.add(clientMap);
        return Constants.dao.insertData(vec, cols);
    }

    public boolean deleteClientLocation(String locId, String clientId) {

        return true;
    }

    public boolean insertClientWiseBOCpt(Vector vec) {
        String[] cols = {Database.DCMS.clientWiseCPT,
            "CPT_ID", "CLIENT_ID", "CONTRACT_PRICE", "ACTIVE"};
        Vector inserts = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap cptMap = new HashMap();
            CPT cpt = (CPT) vec.get(i);
            cptMap.put("CPT_ID", "'" + cpt.cptId + "'");
            cptMap.put("CLIENT_ID", "'" + cpt.clientId + "'");
            cptMap.put("CONTRACT_PRICE", "'" + cpt.price + "'");
            cptMap.put("ACTIVE", "'Y'");
            inserts.add(cptMap);
        }
        return Constants.dao.insertData(inserts, cols);
    }

    public boolean insertClientWiseCpt(List<Client> vec) {
        String[] cols = {Database.DCMS.clientWiseCPT,
            "CPT_ID", "CLIENT_ID", "CONTRACT_PRICE", "ACTIVE"};
        Vector inserts = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap cptMap = new HashMap();
            Client clt = (Client) vec.get(i);
            cptMap.put("CPT_ID", "'" + clt.getCptId() + "'");
            cptMap.put("CLIENT_ID", "'" + clt.getClientId() + "'");
            cptMap.put("CONTRACT_PRICE", "'" + clt.getContactPrice() + "'");
            cptMap.put("ACTIVE", "'Y'");

            inserts.add(cptMap);
        }
        return Constants.dao.insertData(inserts, cols);
    }

    public boolean insertClientWisePackages(Vector vec) {
        String[] cols = {Database.DCMS.clientWisePackage,
            "CLIENT_ID", "PACKAGE_ID"};
        Vector inserts = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap cptMap = new HashMap();
            BO.Package lov = (BO.Package) vec.get(i);
            cptMap.put("PACKAGE_ID", "'" + lov.id + "'");
            cptMap.put("CLIENT_ID", "'" + lov.clientId + "'");
            inserts.add(cptMap);
        }
        return Constants.dao.insertData(inserts, cols);
    }

    public boolean checkIfAlreadyClientWiseCptInserted(CPT cpt) {
        String[] cols = {"CPT_ID"};

        String query
                = "SELECT CPT_ID FROM \n"
                + Database.DCMS.clientWiseCPT + " \n"
                + " WHERE CLIENT_ID = '" + cpt.clientId + "' \n"
                + " AND CPT_ID ='" + cpt.cptId + "'";

        Vector vec = Constants.dao.selectData(query, cols);

        if (vec.size() < 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insertClientCPTUpdateHistory(CPT cpt) {
        String[] cols = {Database.DCMS.clientCptUpdateHistory,
            "CPT_ID", "CLIENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "STATUS",
            "PERCENTAGE_DISCOUNT", "UPTD_BY", "UPTD_TERMINAL", "UPTD_DATE", "ID",
            "REMARKS"};

        HashMap cptMap = new HashMap();
        cptMap.put("CPT_ID", "'" + cpt.cptId + "'");
        cptMap.put("CLIENT_ID", "'" + cpt.clientId + "'");
        cptMap.put("CONTRACT_PRICE", "'" + cpt.price + "'");
        cptMap.put("TEST_LIMIT", "'" + cpt.previousTestLimit + "'");
        cptMap.put("STATUS", "'" + cpt.status + "'");
        cptMap.put("REMARKS", "'" + cpt.comments + "'");
        cptMap.put("PERCENTAGE_DISCOUNT", "'" + cpt.percentageDiscount + "'");
        cptMap.put("UPTD_BY", "'" + Constants.userId + "'");
        cptMap.put("UPTD_TERMINAL", "'" + Constants.terminalId + "'");
        cptMap.put("UPTD_DATE", "SYSDATE");
        cptMap.put("ID", "'" + key.generatePrimaryKey(Keys.clientCPTUpdateHistory, false) + "'");

        Vector vec = new Vector();
        vec.add(cptMap);
        return Constants.dao.insertData(vec, cols);
    }

    public void updateInvoiceMasterClientId() {

        String[] cols = {"", "COMPLETE_ORDER_NO", "CLIENT_ID"};

        String query = " SELECT COMPLETE_ORDER_NO , CLIENT_ID FROM "
                + Database.DCMS.orderMaster + " WHERE CLIENT_UPDATED = 'N' ";

        List list = Constants.dao.selectDatainList(query, cols);
        String completeOrderNo = "";
        String clientId = "";
        boolean ret = true;
        for (int i = 0; i < list.size(); i++) {

            System.out.println("Current Record in Progress " + (i + 1) + " out of " + list.size());

            HashMap map = (HashMap) list.get(i);
            completeOrderNo = map.get("COMPLETE_ORDER_NO").toString();
            clientId = map.get("CLIENT_ID").toString();

            String update = " UPDATE INVOICE_MASTER "
                    + " SET CLIENT_ID = '" + clientId + "' "
                    + " WHERE COMPLETE_ORDER_NO = '" + completeOrderNo + "'";

            ret = Constants.dao.executeUpdate(update, false);

            if (ret) {
                update = " UPDATE ORDER_MASTER "
                        + " SET CLIENT_UPDATED = 'Y' "
                        + " WHERE COMPLETE_ORDER_NO = '" + completeOrderNo + "'";
                Constants.dao.executeUpdate(update, ret);
            }
        }
    }

    private List<Client> selectAllClientCPT(String clientId) {

        String[] colums = {Database.DCMS.clientWiseCPT, "CPT_ID",
            "CONTRACT_PRICE", "CONTRACT_STATUS"};

        String query
                = " SELECT                                                 \n"
                + " CWC.CPT_ID CPT_ID,                                     \n"
                + " CWC.CONTRACT_PRICE      CONTRACT_PRICE,                \n"
                + " CWC.CONTRACT_STATUS    CONTRACT_STATUS                 \n"
                + " FROM                                                   \n"
                + Database.DCMS.clientWiseCPT + "   CWC                    \n"
                + " WHERE CLIENT_ID = '" + clientId + "'";

        Vector vec = Constants.dao.selectData(query, colums);
        List<Client> listCPT = new ArrayList();

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Client cpt = new Client();
            cpt.setCptId((String) map.get("CPT_ID"));
            cpt.setContactPrice((String) map.get("CONTRACT_PRICE"));
            cpt.setContactStatus((String) map.get("CONTRACT_STATUS"));
            listCPT.add(cpt);
        }
        return listCPT;
    }
}
