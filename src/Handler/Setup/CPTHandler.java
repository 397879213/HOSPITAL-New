package Handler.Setup;

import BO.CPT.CPT;
import BO.CPT.CPTReportTiming;
import BO.CPT.CPTWiseParameter;
import BO.Location;
import BO.OrderData;
import BO.Pathology.PathologyResultDetail;
import Handler.LocationHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.SetupTableColumns;

public class CPTHandler implements java.io.Serializable {

    public boolean saveCPTHistory(CPT cptSave) {

        boolean ret = false;

        String columns[] = {Database.DCMS.CPTHistory, "CPT_ID", "DEPARTMENT_ID",
            "ACTIVE", "COST", "DESCRIPTION", "SECTION_ID", "STAT_COST",
            "REPORT_TIME", "CRTD_TERMINAL_ID", "CRTD_BY"};

        HashMap map = new HashMap();
        map.put("CPT_ID", "'" + cptSave.cptId + "'");
        map.put("ACTIVE", "'Y'");
        map.put("COST", "'" + cptSave.price + "'");
        map.put("STAT_COST", "'" + cptSave.statPrice + "'");
        map.put("DESCRIPTION", "'" + cptSave.description + "'");
        map.put("DEPARTMENT_ID", "'" + cptSave.departmentId + "'");
        map.put("SECTION_ID", "'" + cptSave.sectionId + "'");
        map.put("REPORT_TIME", "'" + cptSave.reportTimingId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);

    }

    String colums[] = {"-", "CPT_ID", "SECTION", "DESCRIPTION", "PRICE",
        "ACTIVE", "DEPARTMENT", "STAT_COST", "DEPARTMENT_DESCRIPTION",
        "REPORT_TIME_DESCRIPTION", "REPORT_TIME_ID"};

    public Vector SelectCPT(String description, String department,
            String section, String status) {

        String query = " SELECT                                           \n"
                + " CPT.CPT_ID CPT_ID                                     ,\n"
                + " CPT.DESCRIPTION DESCRIPTION                          ,\n"
                + " CPT.DEPARTMENT_ID DEPARTMENT                          ,\n"
                + " DEP.DESCRIPTION DEPARTMENT_DESCRIPTION                ,\n"
                + " CPT.SECTION_ID      SECTION                           ,\n"
                + " CPT.COST PRICE                                        ,\n"
                + " CPT.STAT_COST STAT_COST                               ,\n"
                + " CPT.REPORT_TIME    REPORT_TIME_ID                          ,\n"
                + " RPT.DESCRIPTION    REPORT_TIME_DESCRIPTION            ,\n"
                + " CPT.ACTIVE ACTIVE                                      \n"
                + " FROM                                                   \n"
                + Database.DCMS.CPT + "             CPT,                   \n"
                + Database.DCMS.definitionTypeDetail + "      RPT,       \n"
                + Database.DCMS.department + "      DEP                   \n"
                + " WHERE UPPER(CPT.DESCRIPTION) LIKE '%" + description.toUpperCase() + "%'   \n"
                + " AND CPT.DEPARTMENT_ID = DEP.ID                       \n"
                + " AND CPT.REPORT_TIME = RPT.ID                       \n";

        if (!section.equalsIgnoreCase("ALL") && section.length() != 0) {
            query += " AND CPT.SECTION_ID = '" + section + "'   \n";
        }
        if (!department.equalsIgnoreCase("ALL") && department.length() != 0) {
            query += " AND CPT.DEPARTMENT_ID ='" + department + "'        \n";
        }
        if (!status.equalsIgnoreCase("ALL")) {
            query += " AND CPT.ACTIVE ='" + status + "'        \n";
        }

        return selectCPTData(query);
    }

    public Vector SelectCPT(String CPTId, boolean all) {

        String query = " SELECT                                            \n"
                + " CPT.CPT_ID CPT_ID                                     ,\n"
                + " CPT.DESCRIPTION DESCRIPTION                           ,\n"
                + " CPT.DEPARTMENT_ID DEPARTMENT                          ,\n"
                + " DEP.DESCRIPTION DEPARTMENT_DESCRIPTION                ,\n"
                + " CPT.SECTION_ID      SECTION                           ,\n"
                + " CPT.COST PRICE                                        ,\n"
                + " CPT.ACTIVE ACTIVE                                      \n"
                + " FROM                                                   \n"
                + Database.DCMS.CPT + "             CPT,                   \n"
                + Database.DCMS.department + "      DEP                    \n"
                + " WHERE CPT.DEPARTMENT_ID = DEP.ID        \n";
        if (all) {
            query += " AND CPT.CPT_ID LIKE '%" + CPTId + "%' \n";
        } else {
            query += " AND CPT.CPT_ID = '" + CPTId + "'      \n";
        }
        return selectCPTData(query);
    }

    public Vector selectCPTData(String query) {

        Vector vec = Constants.dao.selectData(query, colums);
        Vector vecCPT = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            CPT cpt = new CPT();
            cpt.cptId = map.get("CPT_ID").toString();
            cpt.departmentId = map.get("DEPARTMENT").toString();
            cpt.departmentDescription = map.get("DEPARTMENT_DESCRIPTION").toString();
            cpt.sectionId = map.get("SECTION").toString();
            cpt.description = map.get("DESCRIPTION").toString();
            cpt.price = map.get("PRICE").toString();
            cpt.statPrice = map.get("STAT_COST").toString();
            cpt.reportTimingId = map.get("REPORT_TIME_ID").toString();
            cpt.reportTimingDescription = map.get("REPORT_TIME_DESCRIPTION").toString();
            cpt.statPrice = map.get("STAT_COST").toString();
            cpt.status = map.get("ACTIVE").toString();;
            vecCPT.add(cpt);
        }
        return vecCPT;
    }

    public List<Location> getALlCptId() {

        String[] columns = {"-", "ID"};
        String query = " SELECT CPT_ID ID  FROM " + Database.DCMS.CPT + " \n";
        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();
        for (int i = 0; i < li.size(); i++) {
            list.add(((HashMap) li.get(i)).get("ID").toString());
        }
        return list;
    }

    public void selectClientData(String client) {

        String[] colum = {Database.DCMS.client, "ID", "DISCOUNT"};
        String query
                = " SELECT ID, DISCOUNT FROM " + Database.DCMS.client;

        if (!client.equalsIgnoreCase("All")) {
            query += " WHERE ID = '" + client + "'";
        }

        vecClientHash = Constants.dao.selectData(query, colum);
    }

    public boolean saveCPT(CPT cptSave) {

        boolean ret = false;
        String columns[] = {Database.DCMS.CPT, "CPT_ID", "DEPARTMENT_ID",
            "ACTIVE", "COST", "DESCRIPTION", "SECTION_ID",
            "STAT_COST", "REPORT_TIME"};

        HashMap map = new HashMap();
        map.put("CPT_ID", "'" + cptSave.cptId + "'");
        map.put("ACTIVE", "'Y'");
        map.put("COST", "'" + cptSave.price + "'");
        map.put("DESCRIPTION", "'" + cptSave.description + "'");
        map.put("DEPARTMENT_ID", "'" + cptSave.departmentId + "'");
        map.put("SECTION_ID", "'" + cptSave.sectionId + "'");
        map.put("REPORT_TIME", "'" + cptSave.reportTimingId + "'");
        map.put("STAT_COST", "'" + cptSave.statPrice + "'");

        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);

    }
    Vector vecClientHash = new Vector();
    LocationHandler hdlLocation = new LocationHandler();

    public boolean insertClientCPT(CPT cpt) {

        String[] clientColumns = {Database.DCMS.clientWiseCPT, "CPT_ID",
            "CLIENT_ID", "CONTRACT_PRICE", "CONTRACT_STATUS"};
        Vector clientCPTVec = new Vector();

        for (int i = 0; i < vecClientHash.size(); i++) {
            HashMap map = (HashMap) vecClientHash.get(i);
            HashMap CPTMap = new HashMap();
            int discount = 0;
            if (map.get("DISCOUNT") != null) {
                discount = Integer.parseInt(map.get("DISCOUNT").toString());
            }

            float price = Float.parseFloat(cpt.price)
                    - (Float.parseFloat(cpt.price) * ((float) discount / 100));
            CPTMap.put("CPT_ID", "'" + cpt.cptId + "'");
            CPTMap.put("CLIENT_ID", "'" + map.get("ID").toString() + "'");
            CPTMap.put("CONTRACT_PRICE", "'" + price + "'");
            CPTMap.put("CONTRACT_STATUS", "'N'"); //At Start there is not contract
            clientCPTVec.add(CPTMap);
        }
        return Constants.dao.insertData(clientCPTVec, clientColumns);
    }

    GenerateKeys key = new GenerateKeys();

    public boolean insertCPTTiming(CPT cpt) {

        String[] locationCPTTime = {Database.DCMS.locWiseCPTReportTiming,
            "CPT_ID", "LOCATION_ID", "TIME", "DELIVERY_TIME", "ID"};

        Vector locationCPTVec = hdlLocation.selectAllLocations();
        Vector vecTimings = new Vector();
        for (int i = 0; i < locationCPTVec.size(); i++) {
            Location loc = (Location) locationCPTVec.get(i);
            HashMap CPTMap = new HashMap();
            CPTMap.put("ID", "'" + key.generatePrimaryKey(Keys.locationWiseReportingTime, false) + "'");
            CPTMap.put("CPT_ID", "'" + cpt.cptId + "'");
            CPTMap.put("LOCATION_ID", "'" + loc.id + "'");
            CPTMap.put("TIME", "0");
            CPTMap.put("DELIVERY_TIME", "'7:00PM'"); //At Start there is not contract
            vecTimings.add(CPTMap);
        }
        return Constants.dao.insertData(vecTimings, locationCPTTime);
    }

    public boolean insertCPTReportDays(String cptId) {

        String[] locationCPTTime = {Database.DCMS.cptReportingDays,
            "ID", "CPT_ID", "DAY", "ACTIVE"};

        List vecTimings = new ArrayList();
        String[] weekDays = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY",
            "WEDNESDAY", "THURSDAY", "FRIDAY"};
        for (int i = 0; i < weekDays.length; i++) {
            HashMap CPTMap = new HashMap();
            CPTMap.put("ID", "'" + key.generatePrimaryKey(Keys.cptReportingDays, false) + "'");
            CPTMap.put("CPT_ID", "'" + cptId + "'");
            CPTMap.put("DAY", "'" + weekDays[i] + "'");
            CPTMap.put("ACTIVE", "'N'");
            vecTimings.add(CPTMap);
        }
        return Constants.dao.insertData(vecTimings, locationCPTTime);
    }

    public boolean updateClientCPT(CPT cpt) {

        String query = " UPDATE " + Database.DCMS.clientWiseCPT + " CWC    \n"
                + " SET CWC.CONTRACT_PRICE  ='" + cpt.clientPrice + "',    \n"
                + " CWC.CONTRACT_STATUS  ='" + cpt.contractStatus + "',    \n"
                + " CWC.ACTIVE           ='" + cpt.clientCPTStatus + "',   \n"
                + " CWC.UPDATED_BY       ='" + Constants.userId + "',      \n"
                + " CWC.UPDATED_TERMINAL ='" + Constants.terminalId + "',  \n"
                + " CWC.UPDATED_DATE     = SYSDATE                         \n"
                + " WHERE CWC.CPT_ID     ='" + cpt.cptId + "'              \n"
                + " AND CWC.CLIENT_ID    = '" + cpt.clientId + "'          \n";

        return Constants.dao.executeUpdate(query, true);
    }

    public boolean updateCPT(CPT cpt) {

        String query = " UPDATE " + Database.DCMS.CPT + " CPT               \n"
                + " SET CPT.DESCRIPTION ='" + cpt.description + "'         ,\n"
                + " CPT.COST  ='" + cpt.price + "'                         ,\n"
                + " CPT.DEPARTMENT_ID  ='" + cpt.departmentId + "'         ,\n"
                + " CPT.SECTION_ID  ='" + cpt.sectionId + "'               ,\n"
                + " CPT.REPORT_TIME  ='" + cpt.reportTimingId + "'            ,\n"
                + " CPT.STAT_COST  ='" + cpt.statPrice + "'                ,\n"
                + " CPT.ACTIVE ='" + cpt.status + "'                        \n"
                + " WHERE CPT.CPT_ID ='" + cpt.cptId + "'                   \n";

        return Constants.dao.executeUpdate(query, true);
    }

    public void selectDefaultCPT(CPT cpt) {

        String[] colum = {Database.DCMS.section, "CPT_ID", "CPT_DESCRIPTION"};
        String query
                = " SELECT NVL(DEFAULT_CPT_ID, '0') CPT_ID, CPT.DESCRIPTION  "
                + " CPT_DESCRIPTION FROM "
                + Database.DCMS.section + " SEC, \n"
                + Database.DCMS.CPT + " CPT  \n"
                + " WHERE SEC.DEPARTMENT_ID = " + cpt.departmentId + " \n"
                + " AND SEC.SECTION_ID = '" + cpt.sectionId + "'    \n"
                + " AND SEC.DEFAULT_CPT_ID = CPT.CPT_ID    \n"
                + " AND SEC.SECTION_ID =  CPT.SECTION_ID \n"
                + " AND SEC.DEPARTMENT_ID = CPT.DEPARTMENT_ID ";

        List<HashMap> list = Constants.dao.selectDatainList(query, colum);

        if (list.isEmpty()) {
            cpt.defaultCPTId = "0";
            cpt.defaultCPTDescription = "";
        } else {
            cpt.defaultCPTId = list.get(0).get("CPT_ID").toString();
            cpt.defaultCPTDescription = list.get(0).get("CPT_DESCRIPTION").toString();
        }
    }

    public void selectLastCPT(CPT cpt) {

        String[] colum = {Database.DCMS.section, "CPT_ID"};
        String query
                = " SELECT  CPT_ID FROM "
                + Database.DCMS.CPT + "  CPT \n"
                + " WHERE CPT.DEPARTMENT_ID = " + cpt.departmentId + " \n"
                + " ORDER BY CRTD_DATE DESC ";
        List<HashMap> list = Constants.dao.selectDatainList(query, colum);
        cpt.lastCPTId = list.get(0).get("CPT_ID").toString();

    }

    public Vector selectClientWiseCPT(CPT cpt) {

        String[] columns = {"", "CPT", "DESCRIPTION", "PRICE", "CLIENT_PRICE",
            "SECTION", "DEPARTMENT", "ACTIVE", "CONTRACT_STATUS", "CLIENT_ID",
            "CLIENT_CPT_ACTIVE", "CLIENT_NAME", "PERCENTAGE_DISCOUNT", "TEST_LIMIT",
            "DEPARTMENT_DESCRIPTION", "IS_CREDIT"};

        Vector vec = new Vector();

        String query
                = " SELECT CPT.CPT_ID            CPT,                     \n"
                + " CPT.DESCRIPTION           DESCRIPTION,              \n"
                + " CPT.COST                  PRICE,                    \n"
                + " CWC.CONTRACT_PRICE        CLIENT_PRICE,             \n"
                + " CWC.TEST_LIMIT            TEST_LIMIT,               \n"
                + " CWC.CONTRACT_STATUS       CONTRACT_STATUS,          \n"
                + " CWC.CLIENT_ID             CLIENT_ID,                \n"
                + " NVL(CWC.PERCENTAGE_DISCOUNT , '0') PERCENTAGE_DISCOUNT ,\n"
                + " CLT.DESCRIPTION           CLIENT_NAME,              \n"
                + " CPT.SECTION_ID            SECTION,                  \n"
                + " CPT.DEPARTMENT_ID         DEPARTMENT,               \n"
                + " DEP.DESCRIPTION           DEPARTMENT_DESCRIPTION,   \n"
                + " CPT.ACTIVE                ACTIVE,                   \n"
                + " CWC.ACTIVE                CLIENT_CPT_ACTIVE,        \n"
                + " CWC.IS_CREDIT                                       \n"
                + " FROM  " + Database.DCMS.CPT + " CPT,                \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.department + " DEP,                     \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE CPT.CPT_ID = CWC.CPT_ID                       \n"
                + " AND CLT.ID = '" + cpt.clientId + "'                 \n"
                + " AND CLT.ID = CWC.CLIENT_ID                          \n"
                + " AND DEP.ID = CPT.DEPARTMENT_ID                      \n"
                + " AND CPT.DESCRIPTION LIKE '%" + cpt.description + "%'\n"
                + " AND CPT.ACTIVE = 'Y' \n";

        if (cpt.departmentId.length() != 0) {
            query += " AND CPT.DEPARTMENT_ID = '" + cpt.departmentId + "' \n";
        }//
        if (cpt.sectionId.length() != 0) {
            query += " AND CPT.SECTION_ID = '" + cpt.sectionId + "'    \n";
        }
        query += " ORDER BY CPT.DESCRIPTION     \n";

        vec = Constants.dao.selectData(query, columns);
        Vector vecCPT = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            CPT searchCPT = new CPT();
            searchCPT.cptId = map.get("CPT").toString();
            searchCPT.description = map.get("DESCRIPTION").toString();
            searchCPT.price = map.get("PRICE").toString();
            searchCPT.clientPrice = map.get("CLIENT_PRICE").toString();
            searchCPT.clientId = map.get("CLIENT_ID").toString();
            searchCPT.testLimit = map.get("TEST_LIMIT").toString();
            searchCPT.percentageDiscount = map.get("PERCENTAGE_DISCOUNT").toString();
            searchCPT.clientName = map.get("CLIENT_NAME").toString();
            searchCPT.sectionId = map.get("SECTION").toString();
            searchCPT.departmentId = map.get("DEPARTMENT").toString();
            searchCPT.departmentDescription = map.get("DEPARTMENT_DESCRIPTION").toString();
            searchCPT.contractStatus = map.get("CONTRACT_STATUS").toString();
            searchCPT.clientCPTStatus = map.get("CLIENT_CPT_ACTIVE").toString();
            searchCPT.status = map.get("ACTIVE").toString();
            searchCPT.isCredit = map.get("IS_CREDIT").toString();
            vecCPT.add(searchCPT);
        }
        return vecCPT;
    }

    public boolean deleteCPTParameter(String cptWiseParameterId) {

        String query = " DELETE FROM " + Database.DCMS.CPTWiseParameter
                + " WHERE ID = '" + cptWiseParameterId + "'";
        return Constants.dao.executeUpdate(query, true);
    }

    public boolean insertCPTParameter(CPTWiseParameter cpt) {
        boolean ret = true;
        String[] columns = {Database.DCMS.CPTWiseParameter, "ID",
            "CPT_ID", "PARAMETER_ID", "ACTIVE", "CRTD_BY", "CRTD_TERMINAL"};
        Vector vec = new Vector();
        HashMap CPTMap = new HashMap();
        CPTMap.put("CPT_ID", "'" + cpt.getCptId() + "'");
        CPTMap.put("ID", key.generatePrimaryKey(Keys.cptWiseParameter, false));
        CPTMap.put("PARAMETER_ID", "'" + cpt.getParameterId() + "'");
        CPTMap.put("CRTD_BY", "'" + Constants.userId + "'");
        CPTMap.put("CRTD_TERMINAL", "'" + Constants.terminalId + "'");
        CPTMap.put("ACTIVE", "'Y'");
        vec.add(CPTMap);
        if (Constants.dao.insertData(vec, columns)) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
            ret = false;
        }
        return ret;
    }

    public Vector getCPTParameter(String cptId) {

        String[] columns = {"", "CPT", "PARAMETER", "UNIT", "ACTIVE",
            "POSITION", "ID", "DEFAULT_VALUE", "REPORT_GROUP", "COMMENTS"};
        String query
                = "  SELECT PCP.ID , CPT.DESCRIPTION CPT, \n"
                + " PARAMS.DESCRIPTION PARAMETER, \n"
                + " NVL(PCP.REPORT_GROUP , ' ') REPORT_GROUP, \n"
                + " NVL(PCP.COMMENTS , ' ') COMMENTS, \n"
                + " NVL(PCP.DEFAULT_VALUE , ' ') DEFAULT_VALUE, \n"
                + " NVL(PARAMS.UNIT, '  ')UNIT, PARAMS.ACTIVE, \n "
                + " NVL(PCP.POSITION, '0') POSITION  FROM    \n"
                + Database.DCMS.CPTWiseParameter + " PCP ,    \n"
                + Database.DCMS.CPTParameter + " PARAMS ,    \n"
                + Database.DCMS.CPT + " CPT                        \n"
                + " WHERE PCP.CPT_ID = '" + cptId + "'             \n"
                + " AND PCP.PARAMETER_ID = PARAMS.ID               \n"
                + " AND CPT.CPT_ID = PCP.CPT_ID                    \n"
                + " AND PCP.ACTIVE = 'Y'                           \n"
                + " ORDER BY PCP.POSITION";

        Vector vec = Constants.dao.selectData(query, columns);
        Vector CPTparameters = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            CPTWiseParameter cpt = new CPTWiseParameter();
            cpt.setCptId(cptId);
            cpt.setCptDescription(map.get("CPT").toString());
            cpt.setId(map.get("ID").toString());
            cpt.setReportGroup(map.get("REPORT_GROUP").toString());
            cpt.setComments(map.get("COMMENTS").toString());
            cpt.setDefaultValue(map.get("DEFAULT_VALUE").toString());
            cpt.setParameterDescription(map.get("PARAMETER").toString());
            cpt.setPosition(map.get("POSITION").toString());
            cpt.setUnit(map.get("UNIT").toString());
            cpt.setStatus(map.get("ACTIVE").toString());
            CPTparameters.add(cpt);
        }
        return CPTparameters;
    }

    public boolean insertCPTData1(HashMap map, String[] columns) {
        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, columns);
    }

    /*
     THIS FUNCTION IS WORKING FOR BLOOD BAK BACK END ORDERS
    
     */
    public Vector CPTOrdersData(String cptId, String clientId, String patientId,
            String locationId) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "CONTRACT_STATUS",
            "STAT_COST", "MULTIPLE_CPT_STATUS", "TIME", "LOCATION_TIME",
            "REPORT_NAME", "HISTORY_REQUIRED"};

        String query = " SELECT CWC.CPT_ID, SECTION_ID, DEPARTMENT_ID, CRT.DESCRIPTION TIME,"
                + " CPT.DESCRIPTION, CPT.COST COST, CWC.CONTRACT_STATUS, CPT.STAT_COST,"
                + " CWC.TEST_LIMIT, CWC.CONTRACT_PRICE, NVL(MPC.DESCRIPTION, 'N') MULTIPLE_CPT_STATUS,"
                + " NVL(LWC.TIME, '0')LOCATION_TIME, "
                + " CRN.DESCRIPTION REPORT_NAME, CHR.DESCRIPTION HISTORY_REQUIRED FROM  "
                + Database.DCMS.CPT + ", \n"
                + Database.DCMS.locWiseCPTReportTiming + "  LWC,        \n"
                + Database.DCMS.setupColumnDetail + "  SCD,             \n"
                + Database.DCMS.setupColumnDetail + "  MPC,             \n"
                + Database.DCMS.setupColumnDetail + "  CHR,             \n"
                + Database.DCMS.setupColumnDetail + "  CRN,             \n"
                + Database.DCMS.definitionTypeDetail + "  CRT,          \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE CPT.CPT_ID IN ('" + cptId + "')                \n"
                + " AND CWC.CPT_ID = CPT.CPT_ID                         \n"
                + " AND CWC.CPT_ID = LWC.CPT_ID                         \n"
                + " AND LWC.LOCATION_ID = '" + locationId + "'\n"
                + " AND CPT.ACTIVE = 'Y'                                \n"
                + " AND CPT.REPORT_TIME  = CRT.ID                       \n"
                + " AND CWC.CLIENT_ID = CLT.ID                          \n"
                + " AND CLT.ACTIVE = 'Y'                                \n"
                + " AND CWC.ACTIVE = 'Y'                                \n"
                + " AND SCD.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND SCD.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.cptOrderTime + " \n"
                + " AND CHR.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND CHR.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.historyRequired + " \n"
                + " AND MPC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND MPC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.multipleCPTOrder + " \n"
                + " AND CRN.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND CRN.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.reportName + " \n"
                + " AND CWC.CLIENT_ID = '" + clientId + "'              \n";

        Vector records = Constants.dao.selectData(query, columns);
        Vector cpts = new Vector();
        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setPatientId(patientId);
            order.setPerformingContractId(utilities.TypeDetailId.contractGeneral);
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setCptReportTime(map.get("TIME").toString());
            order.setLocationReportTime(map.get("LOCATION_TIME").toString());
            order.setHistoryRequired(map.get("HISTORY_REQUIRED").toString());
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            order.setStatCost(map.get("STAT_COST").toString());
            order.setTestLimit(map.get("TEST_LIMIT").toString());
            order.setMultipleCptOrders(map.get("MULTIPLE_CPT_STATUS").toString());
            order.setContractStatus(map.get("CONTRACT_STATUS").toString());
            order.setReportName(map.get("REPORT_NAME").toString());
            order.setContractPrice(map.get("CONTRACT_PRICE").toString());

            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                order.setOriginalPrice(order.getContractPrice());
            }
            order.setPrice(order.getOriginalPrice());
            cpts.add(order);
        }
        return cpts;
    }

    public int setClientPackageCPT(String packageId, String clientId, Vector orders,
            String performingContractId, String patientId) {

        String[] columns = {"-", "CPT_ID", "DESCRIPTION", "COST", "SECTION_ID",
            "DEPARTMENT_ID", "CONTRACT_PRICE", "TEST_LIMIT", "CONTRACT_STATUS",
            "STAT_COST", "MULTIPLE_CPT_STATUS", "TIME", "HISTORY_REQUIRED",
            "CLINIC_ID"};

        String query = " SELECT CWC.CPT_ID, SECTION_ID, DEPARTMENT_ID, CRT.DESCRIPTION TIME,"
                + " CPT.DESCRIPTION, CPT.COST COST, CWC.CONTRACT_STATUS, CPT.STAT_COST,"
                + " CWC.TEST_LIMIT, CWC.CONTRACT_PRICE, "
                + " NVL(CHR.DESCRIPTION, 'N') HISTORY_REQUIRED,"
                + " NVL(CLC.DESCRIPTION, '0') CLINIC_ID,"
                + " NVL(MPC.DESCRIPTION, 'N') MULTIPLE_CPT_STATUS  FROM  "
                + Database.DCMS.CPT + ", \n"
                + Database.DCMS.locWiseCPTReportTiming + "  LWC,        \n"
                + Database.DCMS.setupColumnDetail + "  SCD,             \n"
                + Database.DCMS.setupColumnDetail + "  MPC,             \n"
                + Database.DCMS.setupColumnDetail + "  CLC,             \n"
                + Database.DCMS.setupColumnDetail + "  CHR,             \n"
                + Database.DCMS.definitionTypeDetail + "  CRT,          \n"
                + Database.DCMS.client + " CLT,                         \n"
                + Database.DCMS.cptPackageDetail + " CPD,               \n"
                + Database.DCMS.clientWiseCPT + " CWC                   \n"
                + " WHERE  CWC.CPT_ID = CPT.CPT_ID                      \n"
                + " AND CWC.CPT_ID = LWC.CPT_ID                         \n"
                + " AND CPD.CPT_ID = CWC.CPT_ID                         \n"
                + " AND LWC.LOCATION_ID = '" + Constants.locationId + "'\n"
                + " AND CPD.PACKAGE_ID = '" + packageId + "'            \n"
                + " AND CPT.ACTIVE = 'Y'                                \n"
                + " AND CPT.REPORT_TIME  = CRT.ID                       \n"
                + " AND CWC.CLIENT_ID = CLT.ID                          \n"
                + " AND CLT.ACTIVE = 'Y'                                \n"
                + " AND CWC.ACTIVE = 'Y'                                \n"
                + " AND CLC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND CLC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.clinicId + " \n"
                + " AND SCD.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND SCD.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.cptOrderTime + " \n"
                + " AND CPT.CPT_ID = CHR.TABLE_ROW_ID                    \n"
                + " AND CHR.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.historyRequired + " \n"
                + " AND MPC.TABLE_ROW_ID = CPT.CPT_ID                   \n"
                + " AND MPC.TABLE_COLUMN_ID = " + SetupTableColumns.CPT.multipleCPTOrder + " \n"
                + " AND CWC.CLIENT_ID = '" + clientId + "'              \n";

        Vector records = Constants.dao.selectData(query, columns);
        int amount = 0;

        for (int i = 0; i < records.size(); i++) {

            HashMap map = (HashMap) records.get(i);
            OrderData order = new OrderData();
            order.setCptId(map.get("CPT_ID").toString());
            order.setCptDescription((String) map.get("DESCRIPTION"));
            order.setOriginalPrice((String) map.get("COST"));
            order.setCptReportTime(map.get("TIME").toString());
            order.setHistoryRequired((String) map.get("HISTORY_REQUIRED"));
            order.setSectionId((String) map.get("SECTION_ID"));
            order.setClinicId(map.get("CLINIC_ID").toString());
            order.setDepartmentId((String) map.get("DEPARTMENT_ID"));
            order.setStatCost(map.get("STAT_COST").toString());
            order.setTestLimit(map.get("TEST_LIMIT").toString());
            order.setMultipleCptOrders(map.get("MULTIPLE_CPT_STATUS").toString());
            order.setContractStatus(map.get("CONTRACT_STATUS").toString());
            order.setContractPrice(map.get("CONTRACT_PRICE").toString());
            order.setPatientId(patientId);
            order.setPerformingContractId(performingContractId);
            if (order.getContractStatus().equalsIgnoreCase("Y")) {
                order.setOriginalPrice(order.getContractPrice());
            }
            order.setPrice(order.getOriginalPrice());
            amount += Integer.parseInt(order.getPrice());
            orders.add(order);
        }

        return amount;

    }

    public void getSections(String user, String status,
            String location, String day, String department) {

        String[] totalColumns = {"-", "SECTION_ID", "TOTAL"};

        String query
                = " SELECT SECTION_ID, count(*) TOTAL "
                + " FROM " + Database.DCMS.imagingPendingQueue + " RPQ "
                + " WHERE RPQ.ORDER_STATUS_ID IN (" + status + ")   "
                + " AND RPQ.DEPARTMENT_ID = '" + department + "'";
//              + " AND RPQ.DICTATED_BY IS NOT NULL";

        if (location == null) {
            location = "ALL";
        }
        if (!location.equalsIgnoreCase("ALL")) {
            query += " AND RPQ.LOCATION_ID = '" + location + "'";
        }
        try {
            if (user != null && !user.equalsIgnoreCase("ALL")) {
                query += " AND RPQ.DICTATED_BY = '" + user + "'";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (department.equalsIgnoreCase(Departments.cardiology)) {

            if (!location.equalsIgnoreCase("001")) {
                query
                        = " SELECT SECTION_ID, count(*) TOTAL "
                        + " FROM " + Database.DCMS.imagingPendingQueue + " RPQ "
                        + " WHERE RPQ.ORDER_STATUS_ID IN (" + status + ")   "
                        + " AND RPQ.MACHINE_ID = '" + location + "'"
                        + " AND RPQ.DEPARTMENT_ID = '" + department + "'"
                        + " AND RPQ.DICTATED_BY IS NOT NULL";
            }

        }

        if (!day.equalsIgnoreCase("ALL")) {
            query += " AND TRUNC(RPQ.SCAN_DATE) BETWEEN TRUNC(SYSDATE - " + day + ") AND TRUNC(SYSDATE)   \n";
        }
        query += " GROUP BY SECTION_ID ";

        Vector vec = Constants.dao.selectData(query, totalColumns);
        Constants.hashPendingReports = null;
        Constants.hashPendingReports = new HashMap();
        int totalPendingReports = 0;
        for (int i = 0;
                i < vec.size();
                i++) {
            HashMap map = (HashMap) vec.get(i);
            String total = map.get("TOTAL").toString();
            totalPendingReports += Integer.parseInt(total);
            Constants.hashPendingReports.put(map.get("SECTION_ID").toString(),
                    total);
        }
        String[] modColumns = {"-", "SECTION_ID"};
        query = "  SELECT DISTINCT(SECTION_ID)  "
                + "  FROM " + Database.DCMS.imagingPendingQueue
                + "  WHERE DEPARTMENT_ID = '" + department + "'";

        vec = Constants.dao.selectData(query, modColumns);
        Constants.sections = null;
        Constants.sections = new String[vec.size() + 1];
        Constants.sections[0] = "ALL - " + totalPendingReports;
        for (int i = 0;
                i < vec.size();
                i++) {
            HashMap map = (HashMap) vec.get(i);
            String section = map.get("SECTION_ID").toString();
            if (Constants.hashPendingReports.get(section) == null) {
                Constants.sections[i + 1] = section + " - 0";
            } else {
                Constants.sections[i + 1] = section + " - "
                        + Constants.hashPendingReports.get(section);
            }
        }
    }

    public void getDepartementSections(String status, String department) {

        String[] modColumns = {"-", "SECTION_ID"};
        String query = "  SELECT DISTINCT(SECTION_ID)  "
                + "  FROM " + Database.DCMS.imagingPendingQueue
                + "  WHERE DEPARTMENT_ID = '" + department + "'";

        List vec = Constants.dao.selectDatainList(query, modColumns);
        Constants.sections = null;
        Constants.sections = new String[vec.size() + 1];
        Constants.sections[0] = "ALL";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.sections[i + 1] = map.get("SECTION_ID").toString();
        }
    }

    public void getImagingSectionsOnly(String department) {

        String[] totalColumns = {"-", "SECTION_ID"};

        String query
                = " SELECT DISTINCT(SECTION_ID) "
                + " FROM " + Database.DCMS.imagingPendingQueue + " RPQ "
                + " WHERE  RPQ.DEPARTMENT_ID = '" + department + "'"
                + " ORDER BY SECTION_ID ";

        Vector vec = Constants.dao.selectData(query, totalColumns);
        Constants.sectionOnly = new String[vec.size() + 1];
        Constants.sectionOnly[0] = "ALL";

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.sectionOnly[i + 1] = map.get("SECTION_ID").toString();
        }

    }

    public void getPathologySectionsOnly(String department) {

        String[] totalColumns = {"-", "SECTION_ID"};

        String query
                = " SELECT DISTINCT(SECTION_ID) "
                + " FROM " + Database.DCMS.pathologyPendingQueue + " PPQ ";

        Vector vec = Constants.dao.selectData(query, totalColumns);
        Constants.sectionOnly = new String[vec.size() + 1];
        Constants.sectionOnly[0] = "ALL";

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.sectionOnly[i + 1] = map.get("SECTION_ID").toString();
        }

    }

    public Vector selectClientUnAttachedCPT(String description,
            String department, String section, String clientId) {

        String colums[] = {"-", "CPT_ID", "SECTION", "DESCRIPTION", "PRICE",
            "ACTIVE", "DEPARTMENT"};

        String query
                = " SELECT                                                   \n"
                + " CPT.CPT_ID CPT_ID                                     ,\n"
                + " CPT.DESCRIPTION      DESCRIPTION                      ,\n"
                + " CPT.DEPARTMENT_ID    DEPARTMENT                       ,\n"
                + " CPT.SECTION_ID       SECTION                          ,\n"
                + " CPT.COST             PRICE                            ,\n"
                + " CPT.ACTIVE ACTIVE                                      \n"
                + " FROM                                                   \n"
                + Database.DCMS.CPT + "   CPT                              \n"
                + " WHERE CPT_ID NOT IN (SELECT CPT_ID FROM \n"
                + Database.DCMS.clientWiseCPT + "   CWC  WHERE CWC.CLIENT_ID "
                + " = '" + clientId + "')                    \n"
                + " AND UPPER(CPT.DESCRIPTION)LIKE '%" + description + "%'\n"
                + " ";
        if (department.length() != 0) {
            query += " AND CPT.DEPARTMENT_ID ='" + department + "'        \n";
        }

        if (section.length() != 0) {
            query += " AND CPT.SECTION_ID ='" + section + "'        \n";
        }
        query += " AND CPT.ACTIVE ='Y'                              \n";

        Vector vec = Constants.dao.selectData(query, colums);
        Vector vecCPT = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            CPT cpt = new CPT();
            cpt.cptId = (String) map.get("CPT_ID");
            cpt.departmentId = (String) map.get("DEPARTMENT");
            cpt.description = (String) map.get("DESCRIPTION");
            cpt.sectionId = (String) map.get("SECTION");
            cpt.price = (String) map.get("PRICE");
            cpt.status = (String) map.get("ACTIVE");
            cpt.clientId = clientId;
            vecCPT.add(cpt);
        }
        return vecCPT;
    }

    public Vector selectClientAttachedCPT(String description,
            String department, String section, String clientId) {

        String colums[] = {"-", "CPT_ID", "SECTION", "DESCRIPTION", "PRICE",
            "ACTIVE", "DEPARTMENT"};

        String query
                = " SELECT                                                   \n"
                + " CPT.CPT_ID CPT_ID                                     ,\n"
                + " CPT.DESCRIPTION      DESCRIPTION                      ,\n"
                + " CPT.DEPARTMENT_ID    DEPARTMENT                       ,\n"
                + " CPT.SECTION_ID       SECTION                          ,\n"
                + " CPT.COST             PRICE                            ,\n"
                + " CPT.ACTIVE ACTIVE                                      \n"
                + " FROM                                                   \n"
                + Database.DCMS.CPT + "   CPT,                             \n"
                + Database.DCMS.clientWiseCPT + "   CWC                    \n"
                + " WHERE UPPER(CPT.DESCRIPTION)LIKE '%" + description + "%'\n"
                + " AND CWC.CPT_ID = CPT.CPT_ID                            \n"
                + " AND CWC.CLIENT_ID = '" + clientId + "'                    \n";

        if (department.length() != 0) {
            query += " AND CPT.DEPARTMENT_ID ='" + department + "'   \n";
        }

        if (section.length() != 0) {
            query += " AND CPT.SECTION_ID ='" + section + "'       \n";
        }

        Vector vec = Constants.dao.selectData(query, colums);
        Vector vecCPT = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            CPT cpt = new CPT();
            cpt.cptId = (String) map.get("CPT_ID");
            cpt.departmentId = (String) map.get("DEPARTMENT");
            cpt.description = (String) map.get("DESCRIPTION");
            cpt.sectionId = (String) map.get("SECTION");
            cpt.price = (String) map.get("PRICE");
            cpt.status = (String) map.get("ACTIVE");
            cpt.clientId = clientId;
            vecCPT.add(cpt);
        }
        return vecCPT;
    }

    public void getPathologySections(String status,
            String location, String day, String sec, String orderLocation, String reportingFormat) {

        String[] totalColumns = {"-", "SECTION_ID", "TOTAL"};
        String query
                = " SELECT SECTION_ID, count(*) TOTAL  FROM "
                + Database.DCMS.pathologyPendingQueue + " PPQ,       \n"
                + Database.DCMS.setupColumnDetail + "   CRF        \n"
                + " WHERE PPQ.ORDER_STATUS_ID IN (" + status + ")   "
                + " AND CRF.DESCRIPTION IN ('" + reportingFormat + "')"
                + " AND CRF.TABLE_ROW_ID = PPQ.CPT_ID       \n"
                + " AND CRF.TABLE_COLUMN_ID ="
                + SetupTableColumns.CPT.reportingFormat + "    \n";

        if (!location.equalsIgnoreCase("ALL")) {
            query += " AND PPQ.LOCATION_ID = '" + location + "'";
        }
        if (!orderLocation.equalsIgnoreCase("ALL")) {
            query += " AND PPQ.ORDER_LOCATION_ID = '" + orderLocation + "'";
        }
        if (!sec.equalsIgnoreCase("ALL")) {
            query += " AND PPQ.SECTION_ID = '" + sec + "'";
        }
        if (!day.equalsIgnoreCase("ALL")) {

            if (day.equalsIgnoreCase("1")) {
                query += " AND TRUNC(PPQ.PHLEBOTOMISTS_DATE) BETWEEN TRUNC(SYSDATE) AND TRUNC(SYSDATE) \n";

            } else if (day.equalsIgnoreCase("2")) {
                query += " AND TRUNC(PPQ.PHLEBOTOMISTS_DATE) BETWEEN TRUNC(SYSDATE-1) AND TRUNC(SYSDATE-1) \n";
            } else if (day.equalsIgnoreCase("Urgent")) {
                query += " AND PPQ.URGENT = 'Y'  \n";
            } else {
                query += " AND TRUNC(PPQ.PHLEBOTOMISTS_DATE) BETWEEN TRUNC(SYSDATE - " + day + ") AND TRUNC(SYSDATE)   \n";
            }
        }
        query += " GROUP BY SECTION_ID ";

        Vector vec = Constants.dao.selectData(query, totalColumns);
        Constants.hashPendingReports = null;
        Constants.hashPendingReports = new HashMap();
        int totalPendingReports = 0;
        Constants.sections = new String[vec.size() + 1];
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            String total = map.get("TOTAL").toString();
            totalPendingReports += Integer.parseInt(total);
            Constants.sections[i + 1] = map.get("SECTION_ID").toString() + " - "
                    + total;
        }
        Constants.sections[0] = "ALL - " + totalPendingReports;
    }

    public void getSections() {

        String[] modColumns = {"-", "SECTION_ID"};
        String query
                = "  SELECT SECTION_ID  "
                + "  FROM " + Database.DCMS.section
                + "  WHERE ACTIVE = 'Y' ";
        //    + " ORDER BY MODALITY_ID ('CR' , 'CT' , 'MR' , 'US' , 'IMGR')";

        Vector vec = Constants.dao.selectData(query, modColumns);
        Constants.sections = null;
        Constants.sections = new String[vec.size() + 1];
        Constants.sections[0] = "ALL";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            String section = map.get("SECTION_ID").toString();
            Constants.sections[i + 1] = section;
        }
    }

    public String[] getSelectReportingFormat(String department) {

        String[] cols = {Database.DCMS.reportingFormat, "DESCRIPTION",
            "FORMAT_DESCRIPTION"};

        String query = " SELECT DESCRIPTION , FORMAT_DESCRIPTION FROM "
                + Database.DCMS.reportingFormat
                + " WHERE ACTIVE = 'Y'";

        Vector vec = Constants.dao.selectData(query, cols);
        String[] formats = new String[vec.size() + 1];
        formats[0] = "Reporting Format";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            formats[i + 1] = map.get("DESCRIPTION").toString();
            Constants.hashGetReportingFormat.put(formats[i + 1],
                    map.get("FORMAT_DESCRIPTION").toString());
        }
        return formats;
    }

    public String[] getSelectReportingDay() {

        String[] cols = {Database.DCMS.reportingDay, "ID", "DESCRIPTION"};

        String query = " SELECT DESCRIPTION , ID FROM "
                + Database.DCMS.reportingDay
                + " ORDER BY POSITION ";

        Vector vec = Constants.dao.selectData(query, cols);
        String[] days = new String[vec.size() + 1];
        days[0] = "Report Day";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            days[i + 1] = map.get("DESCRIPTION").toString();
            Constants.hashGetReportDay.put(days[i + 1],
                    map.get("ID").toString());
        }
        return days;
    }

    public String[] getReportsName() {

        String[] cols = {Database.DCMS.reports, "ID", "DESCRIPTION"};

        String query = " SELECT DESCRIPTION , ID FROM "
                + Database.DCMS.reports
                + " WHERE REPORT_TYPE = 'CPT_REPORT' \n"
                + " AND ACTIVE = 'Y' \n";
        Constants.hashGetReportName = new HashMap<String, String>();
        Vector vec = Constants.dao.selectData(query, cols);
        String[] reports = new String[vec.size() + 1];
        reports[0] = "Report Name";
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            reports[i + 1] = map.get("DESCRIPTION").toString();
            Constants.hashGetReportName.put(reports[i + 1],
                    map.get("ID").toString());
        }
        return reports;
    }

    public Vector SelectCPTReportingTime(CPTReportTiming cptTime) {

        String[] cols = {"", "CPT_ID", "LOCATION_ID", "LOCATION_NAME", "TIME",
            "CPT_DESCRIPTION", "SUNDAY_REPORT", "DELIVERY_TIME", "SECTION_ID",
            "DEPARTMENT", "ID"};
        String query = "SELECT CRT.CPT_ID , CRT.LOCATION_ID, CRT.TIME,      \n"
                + " LOC.DESCRIPTION LOCATION_NAME, CRT.SUNDAY_REPORT,       \n"
                + " CPT.DESCRIPTION CPT_DESCRIPTION, CRT.DELIVERY_TIME,     \n"
                + " CPT.SECTION_ID,  DEP.DESCRIPTION DEPARTMENT,            \n"
                + " CRT.ID ID FROM        \n"
                + Database.DCMS.locWiseCPTReportTiming + " CRT,              \n"
                + Database.DCMS.location + " LOC,                            \n"
                + Database.DCMS.CPT + " CPT,                                 \n"
                + Database.DCMS.department + " DEP                           \n"
                + " WHERE CRT.LOCATION_ID = LOC.ID                          \n"
                + " AND CRT.CPT_ID = CPT.CPT_ID                             \n"
                + " AND DEP.ID = CPT.DEPARTMENT_ID                          \n"
                + " AND CPT.DESCRIPTION LIKE '%" + cptTime.cptDescription + "%' \n";

        if (cptTime.sectionId.trim().length() != 0) {
            query += " AND CPT.SECTION_ID = '" + cptTime.sectionId + "'          \n";
        }
        if (cptTime.departmentId.trim().length() != 0) {
            query += " AND CPT.DEPARTMENT_ID = '" + cptTime.departmentId + "'    \n";
        }
        if (cptTime.locationId.trim().length() != 0) {
            query += " AND CRT.LOCATION_ID = '" + cptTime.locationId + "'        \n";
        }
        query += " ORDER BY CRT.LOCATION_ID , CPT.SECTION_ID \n";

        Vector vec = Constants.dao.selectData(query, cols);
        Vector vecCPTTiming = new Vector();

        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            CPTReportTiming time = new CPTReportTiming();
            time.cptDescription = map.get("CPT_DESCRIPTION").toString();
            time.cptId = map.get("CPT_ID").toString();
            time.id = map.get("ID").toString();
            time.deliveryTime = map.get("DELIVERY_TIME").toString();
            time.departmentName = map.get("DEPARTMENT").toString();
            time.locationId = map.get("LOCATION_ID").toString();
            time.locationName = map.get("LOCATION_NAME").toString();
            time.sectionId = map.get("SECTION_ID").toString();
            time.sundayReport = map.get("SUNDAY_REPORT").toString();
            time.duration = map.get("TIME").toString();
            vecCPTTiming.add(time);
        }

        return vecCPTTiming;
    }

    public void setCPTCodes() {

        String[] cols = {Database.DCMS.reportingFormat, "CPT_ID", "CODES"};

        String query = " SELECT CPT_ID, CODES FROM "
                + Database.DCMS.CPTCodes;

        Vector vec = Constants.dao.selectData(query, cols);
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            Constants.hashCPTCodes.put(map.get("CPT_ID").toString(),
                    map.get("CODES").toString());
        }
    }

    public List selectCPTWiseParameter(String cptId) {

        String[] cols = {"", "PARAMETER_ID", "IS_REQUIRED"};

        String query
                = " SELECT PARAMETER_ID, IS_REQUIRED \n"
                + " FROM \n" + Database.DCMS.CPTWiseParameter + " CWP  \n"
                + " WHERE CPT_ID = '" + cptId + "' \n"
                + " ORDER BY CWP.POSITION     ";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        List<PathologyResultDetail> listParameters = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            PathologyResultDetail prd = new PathologyResultDetail();
            prd.setCptId(cptId);
            prd.setIsRequired(map.get("IS_REQUIRED").toString());
            prd.setParameterId(map.get("PARAMETER_ID").toString());
            listParameters.add(prd);
        }
        return listParameters;
    }

    public String selectTubeCodeId(String cptId) {

        String[] cols = {"", "TUBE_CODE_ID"};
        String query
                = " SELECT DISTINCT(TUBE_CODE_ID)TUBE_CODE_ID  FROM  \n"
                + Database.DCMS.pathologyPendingQueue + " PPQ  \n"
                + " WHERE PPQ.CPT_ID = '" + cptId + "' \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        return list.get(0).get("TUBE_CODE_ID").toString();
    }
}
