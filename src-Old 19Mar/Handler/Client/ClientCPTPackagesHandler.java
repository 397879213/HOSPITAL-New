/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Client;

import BO.Client.ClientWiseCPTGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;

/**
 *
 * @author admin
 */
public class ClientCPTPackagesHandler {

    public List<ClientWiseCPTGroup> selectClientWisePackage(String clientId,
            String packageId) {

        String[] selectColumns = {"-", "PACKAGE_ID", "PACKAGE_DESC",
            "CLIENT_ID", "CLIENT_DESC"};

        String query
                = "SELECT CWP.PACKAGE_ID, PKG.DESCRIPTION PACKAGE_DESC, CWP.CLIENT_ID, \n"
                + "CLI.DESCRIPTION CLIENT_DESC                          \n"
                + "  FROM " + Database.DCMS.clientWisePackage + " CWP,  \n"
                + Database.DCMS.client + " CLI,                         \n"
                + Database.DCMS.definitionTypeDetail + " PKG            \n"
                + " WHERE CWP.CLIENT_ID = '" + clientId + "'            \n";
        if (packageId.length() != 0) {
            query += " AND PKG.ID = " + packageId + "                   \n";
        }
        query += "   AND CWP.CLIENT_ID = CLI.ID                    \n"
                + "  AND CWP.PACKAGE_ID = PKG.ID                   \n"
                + "  AND PKG.ACTIVE = 'Y'                          \n";
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ClientWiseCPTGroup> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ClientWiseCPTGroup setCompound = new ClientWiseCPTGroup();

            setCompound.setPackageId(map.get("PACKAGE_ID").toString());
            setCompound.setPackageDescription(map.get("PACKAGE_DESC").toString());
            setCompound.setClientId(map.get("CLIENT_ID").toString());
            setCompound.setClientDescription(map.get("CLIENT_DESC").toString());
            list.add(setCompound);
        }
        return list;
    }

    public List<ClientWiseCPTGroup> selectClientWisePackageDetail(String packageId,
            String cptName) {

        String[] selectColumns = {"-", "PACKAGE_ID", "CPT_ID", "CPT_DESC"};

        String query
                = "SELECT CPD.PACKAGE_ID, CPD.CPT_ID, CPT.DESCRIPTION CPT_DESC \n"
                + "  FROM " + Database.DCMS.cptPackageDetail + " CPD,    \n"
                + Database.DCMS.CPT + " CPT                              \n"
                + " WHERE CPD.PACKAGE_ID = '" + packageId + "'           \n";
        if (cptName.length() != 0) {
            query += " AND UPPER(CPT.DESCRIPTION) LIKE '%" + cptName + "%'\n";
        }

        query += " AND CPD.CPT_ID = CPT.CPT_ID                   \n";
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ClientWiseCPTGroup> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ClientWiseCPTGroup setCompound = new ClientWiseCPTGroup();

            setCompound.setPackageId(map.get("PACKAGE_ID").toString());
            setCompound.setCptId(map.get("CPT_ID").toString());
            setCompound.setCptDescription(map.get("CPT_DESC").toString());
            list.add(setCompound);
        }
        return list;
    }
    
    public boolean updatePackageName(ClientWiseCPTGroup pkg) {
        String query
                = " UPDATE " + Database.DCMS.definitionTypeDetail + "       \n"
                + " SET DESCRIPTION  = '" + pkg.getPackageDescription()+ "' \n"
                + " WHERE ID = '" + pkg.getPackageId()+ "'                  \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean deletePackage(ClientWiseCPTGroup pkg) {
        String query
                = " DELETE FROM " + Database.DCMS.clientWisePackage + " \n"
                + " WHERE PACKAGE_ID = '" + pkg.getPackageId()+ "'              \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean deletePackageDetail(ClientWiseCPTGroup pkg) {
        String query
                = " DELETE FROM " + Database.DCMS.cptPackageDetail + " \n"
                + " WHERE PACKAGE_ID = '" + pkg.getPackageId()+ "'  \n"
                + "AND CPT_ID =  '" + pkg.getCptId()+ "'            \n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean addNewPackage(ClientWiseCPTGroup pkg) {

        String[] columns = {Database.DCMS.clientWisePackage, "PACKAGE_ID", "CLIENT_ID"};

        HashMap map = new HashMap();
        map.put("PACKAGE_ID", "'" + pkg.getPackageId() + "'");
        map.put("CLIENT_ID", "'" + pkg.getClientId()+ "'");
        
        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }
    
    public boolean addPackageDetail(ClientWiseCPTGroup pkg) {

        String[] columns = {Database.DCMS.cptPackageDetail, "PACKAGE_ID", "CPT_ID"};

        HashMap map = new HashMap();
        map.put("PACKAGE_ID", "'" + pkg.getPackageId() + "'");
        map.put("CPT_ID", "'" + pkg.getCptId()+ "'");
        
        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }
}
