/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Client;

import BO.Client.Client;
import BO.CPT.CPT;
import Handler.Client.ClientHandler;
import Handler.Setup.CPTHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.DAO;
import utilities.Database;
import utilities.Status;

public class ClientControllerSave implements java.io.Serializable {

    ClientHandler hdlClient = new ClientHandler();
    CPTHandler hdlCPT = new CPTHandler();

    public static Connection conn = null;
    public ResultSet rs = null;
    public static Statement stmt = null;
    public static String sid = "XE";
    public static String password = "PACS94LINK97";
    public static String ip = "127.0.0.1";
    public static String conString = "";
    public String connectionException = "";
    public static int count = 0;
    public static boolean receipient = false;

    public int selectCreditLimit(String clientId) throws SQLException {
        int creditLimit = 0;
        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            String sql = "SELECT SUM(IM.Balance_Amount) \n"
                    + " FROM " + Database.DCMS.orderMaster + " OM                    ,\n"
                    + Database.DCMS.invoiceMaster + " IM                             \n"
                    + " WHERE IM.COMPLETE_ORDER_NO = OM.COMPLETE_ORDER_NO          \n"
                    + " AND OM.CLIENT_ID = '" + clientId + "'                           ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                creditLimit = resultSet.getInt(1);
            }
            stmt.close();
            resultSet.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return creditLimit;
    }

    public int selectTestLimit(String cptId, String ClientId) throws SQLException {
        int testLimit = 0;
        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            String sql = "SELECT COUNT(OD.ORDER_DETAIL_ID) FROM                   \n"
                    + Database.DCMS.orderDetail + " OD                        ,\n"
                    + Database.DCMS.orderMaster + " OM                        ,\n"
                    + Database.DCMS.invoiceDetail + " ID                      ,\n"
                    + "EMR.Application_Status ES                               \n"
                    + " WHERE OD.Cpt_Id = '" + cptId + "'                        \n"
                    + " AND OM.Client_Id ='" + ClientId + "'                     \n"
                    + " AND OM.Complete_Order_No = OD.Complete_Order_No      \n"
                    + " AND OD.COMPLETE_ORDER_NO = ID.COMPLETE_ORDER_NO      \n"
                    + " AND OD.ORDER_DETAIL_ID = ID.Order_Detail_Id          \n"
                    + " AND ID.Current_Status_Id = ES.STATUS_ID              \n"
                    + " AND ES.DESCRIPTION = 'INVOICED'                     ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                testLimit = resultSet.getInt(1);
            }
            stmt.close();
            resultSet.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return testLimit;
    }

    public boolean registerClient(Client client) {

        boolean ret = hdlClient.registerClient(client);
        if (ret) {
            ret = Constants.dao.commitTransaction();
            DAO.closeConnection();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean copyClientCPT(String fromClientId, String toClientId) {

        String query = " DELETE FROM " + Database.DCMS.clientWiseCPT
                + " WHERE CLIENT_ID = '" + toClientId + "'";
        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            ret = hdlClient.insertClientWiseCPT(fromClientId, toClientId);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean insertClientWiseLocation(String locationId, String clientId) {

        boolean ret = hdlClient.insertClientLocation(locationId, clientId);
        if (ret) {
            Constants.dao.commitTransaction();
            DAO.closeConnection();
        } else {
            ret = false;
            Constants.dao.rollBack();
            //JOptionPane.showMessageDialog(null, "Unable to Save Client Contact Administrator");
        }
        return ret;
    }

    public Vector selectClientLocations(String clientId, String locationName) {
        return hdlClient.selectClientLocations(clientId, locationName);
    }

    public Vector selectUnattachedClientLocations(String clientId, String locationName) {
        return hdlClient.selectUnattachedClientLocations(clientId, locationName);
    }

    public boolean updateClient(Client client) {
        return hdlClient.updateClient(client);
    }

    public boolean updateClientCptTestLimit(int limit, String clientId, String cptId) {
        return hdlClient.updateClientCptTestLimit(limit, clientId, cptId);
    }

    public boolean updateClientCptsTestLimit(String clientId, Vector cpts) {

        Vector queries = new Vector();
        boolean ret = false;
        for (int i = 0; i < cpts.size(); i++) {
            CPT cpt = (CPT) cpts.get(i);
            String query
                    = " UPDATE " + Database.DCMS.clientWiseCPT + " \n SET "
                    + " TEST_LIMIT  = '" + cpt.testLimit + "' \n"
                    + " WHERE CLIENT_ID = '" + clientId + "' \n"
                    + " AND CPT_ID = '" + cpt.cptId + "'";

            queries.add(query);
            ret = hdlClient.insertClientCPTUpdateHistory(cpt);
            if (!ret) {
                break;
            }
        }
        if (ret) {
            ret = Constants.dao.executeUpdates(queries);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public String getClientType(String clientId) {

        String[] cols = {"", "TYPE"};
        String query = " SELECT TRANSACTION_TYPE TYPE FROM \n"
                + Database.DCMS.client + "\n WHERE ID = '" + clientId + "'";
        Vector vec = Constants.dao.selectData(query, cols);
        HashMap map = (HashMap) vec.get(0);
        return map.get("TYPE").toString();
    }

    public Vector searchClientByName(String clientName) {
        return hdlClient.searchClientByName(clientName);
    }

    public Client searchClientById(String clientId) {
        return hdlClient.searchClientById(clientId);
    }

    public Vector searchPackage(String packageName, String clientId) {

        Vector packages = new Vector();
        packages.add(hdlClient.selectClientAttachedPackage(packageName, clientId));
        packages.add(hdlClient.selectClientUnAttachedPackage(packageName, clientId));
        return packages;
    }

    public boolean insertClientBOWiseCpt(Vector vecCPTS) {
        boolean ret = hdlClient.insertClientWiseBOCpt(vecCPTS);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();

        }
        return ret;
    }

    public boolean insertClientWiseCpt(List<Client> listPCTS) {
        boolean ret = hdlClient.insertClientWiseCpt(listPCTS);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();

        }
        return ret;
    }

    public boolean insertClientWisePackages(Vector vecPackages) {
        boolean ret = hdlClient.insertClientWisePackages(vecPackages);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();

        }
        return ret;
    }

    public boolean deleteClientWiseCpt(Vector vecCpt) {

        Vector queries = new Vector();
        for (int i = 0; i < vecCpt.size(); i++) {
            CPT cpt = (CPT) vecCpt.get(i);
            String query = "DELETE FROM " + Database.DCMS.clientWiseCPT
                    + " WHERE CLIENT_ID = '" + cpt.clientId + "'"
                    + " AND CPT_ID ='" + cpt.cptId + "'";
            queries.add(query);
        }
        boolean ret = Constants.dao.executeUpdates(queries);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deleteClientPackages(Vector<BO.Package> vecPackages) {

        Vector queries = new Vector();
        for (int i = 0; i < vecPackages.size(); i++) {
            BO.Package lov = vecPackages.get(i);
            String query = "DELETE FROM " + Database.DCMS.clientWisePackage
                    + " WHERE CLIENT_ID = '" + lov.clientId + "'"
                    + " AND PACKAGE_ID = '" + lov.id + "'";
            queries.add(query);
        }
        boolean ret = Constants.dao.executeUpdates(queries);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();

        }
        return ret;
    }

    public int getClientCPTCount(String cptId, String clientId) {

        String cols[] = {"", "CPT_COUNT"};
        String query
                = "SELECT COUNT(OD.COMPLETE_ORDER_NO||OD.ORDER_DETAIL_ID) "
                + " CPT_COUNT FROM \n"
                + Database.DCMS.orderDetail + " OD                      ,\n"
                + Database.DCMS.orderMaster + " OM                      ,\n"
                + Database.DCMS.invoiceDetail + " ID                     \n"
                + " WHERE OD.CPT_ID = '" + cptId + "'                    \n"
                + " AND OM.CLIENT_ID ='" + clientId + "'                 \n"
                + " AND ID.STATUS_ID ='" + Status.invoiced + "'          \n"
                + " AND OM.COMPLETE_ORDER_NO = OD.COMPLETE_ORDER_NO      \n"
                + " AND OD.COMPLETE_ORDER_NO = ID.COMPLETE_ORDER_NO      \n"
                + " AND OD.ORDER_DETAIL_ID = ID.ORDER_DETAIL_ID          \n";

        return Integer.parseInt(((HashMap) Constants.dao.selectData(query,
                cols).get(0)).get("CPT_COUNT").toString());
    }

    public int getClientPendingAmount(String clientId) {

        String cols[] = {"", "BALANCE_AMOUNT"};
        String query
                = " SELECT NVL(SUM(BALANCE_AMOUNT),0) BALANCE_AMOUNT  FROM      \n"
                + Database.DCMS.orderMaster + " OM                      ,\n"
                + Database.DCMS.invoiceMaster + " IM                     \n"
                + " WHERE OM.CLIENT_ID ='" + clientId + "'               \n"
                + " AND OM.COMPLETE_ORDER_NO = IM.COMPLETE_ORDER_NO      \n";

        return Integer.parseInt(((HashMap) Constants.dao.selectData(query,
                cols).get(0)).get("BALANCE_AMOUNT").toString());
    }

    public boolean checkIfAlreadyClientWiseCptInserted(CPT cpt) {
        return hdlClient.checkIfAlreadyClientWiseCptInserted(cpt);
    }

    public Vector getPendingInbvoices() {

        return null;
    }

    public boolean deleteClientWiseLocation(List<Client> listClient) {

        List<String> listQueries = new ArrayList();
        for (int i = 0; i < listClient.size(); i++) {
            String query
                    = " DELETE FROM  " + Database.DCMS.clientWiseLocation + " CWL \n"
                    + " WHERE CWL.LOCATION_ID = '" + listClient.get(i).getLocationId() + "'       \n"
                    + " AND CWL.CLIENT_ID = " + listClient.get(i).getClientId() + "        \n";
            listQueries.add(query);
        }

        boolean ret = Constants.dao.executeUpdates(listQueries);

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean addAllLocation(String clientId) {

        String[] col = {"", "ID"};
        String query = " SELECT ID FROM " + Database.DCMS.location
                + " WHERE ACTIVE = 'Y' AND ID NOT IN (SELECT LOCATION_ID FROM "
                + Database.DCMS.clientWiseLocation + " WHERE CLIENT_ID = " + clientId + ") \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, col);
        boolean ret = true;
        for (int i = 0; i < list.size(); i++) {

            HashMap map = list.get(i);
            ret = insertClientWiseLocation(map.get("ID").toString(), clientId);
        }
        return ret;
    }
}
