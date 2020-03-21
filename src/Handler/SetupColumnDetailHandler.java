/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.Location;
import BO.SetupColumnDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author Sibtain
 */
public class SetupColumnDetailHandler implements java.io.Serializable {

    GenerateKeys key = new GenerateKeys();

    public List<Location> searchLocationDetails(String id, String setupTableId) {

        String[] columns = {"-", "ID", "COLUMN_ID", "TABLE_ROW_ID", "PROPERTY",
            "DESCRIPTION"};

        String query
                = "SELECT 					\n"
                + " SCD.ID ,					\n"
                + " STC.ID COLUMN_ID , 				\n"
                + " SCD.TABLE_ROW_ID TABLE_ROW_ID,              \n"
                + " STC.PROPERTY , 				\n"
                + " NVL(SCD.DESCRIPTION,' ') DESCRIPTION        \n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC,      \n"
                + Database.DCMS.setupColumnDetail + "  SCD      \n"
                + " WHERE SETUP_ID = '" + setupTableId + "'     \n"
                + " AND STC.ID = SCD.TABLE_COLUMN_ID    \n"
                + " AND SCD.TABLE_ROW_ID = '" + id + "' \n"
                + " AND STC.ACTIVE = 'Y'                \n"
                + " ORDER BY SCD.ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            Location loc = new Location();
            loc.setupColumnDetailId = map.get("ID").toString();
            loc.tableColumnId = map.get("COLUMN_ID").toString();
            loc.tableRowId = map.get("TABLE_ROW_ID").toString();
            loc.property = map.get("PROPERTY").toString();
            loc.description = map.get("DESCRIPTION").toString();
            list.add(loc);
        }
        return list;
    }

    public List<SetupColumnDetail> searchProperty(String searchString,
            String setupTableId, String tableRowId) {

        String[] columns = {"-", "COLUMN_ID", "SETUP_ID", "ACTIVE", "PROPERTY", "VALUE"};

        String query
                = " SELECT      				\n"
                + " STC.ID COLUMN_ID , 				\n"
                + " STC.SETUP_ID,                               \n"
                + " STC.ACTIVE,                                 \n"
                + " NVL(STC.DEFAULT_VALUE, ' ')VALUE,           \n"
                + " STC.PROPERTY 				\n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC       \n"
                + " WHERE SETUP_ID = '" + setupTableId + "'     \n";

        if (searchString.trim().length() != 0) {
            query += " AND UPPER(STC.PROPERTY) LIKE '%" + searchString + "%'  \n";
        }
        query += " ORDER BY STC.ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            SetupColumnDetail loc = new SetupColumnDetail();
            loc.setTableColumnId(map.get("COLUMN_ID").toString());
            loc.setTableRowId(tableRowId);
            loc.setRowDescription(map.get("VALUE").toString());
            loc.setProperty(map.get("PROPERTY").toString());
            loc.setActive(map.get("ACTIVE").toString());
            loc.setId(map.get("COLUMN_ID").toString());

            list.add(loc);
        }
        return list;
    }

    public List<Location> searchSetupTableFields(String setupTableId) {

        String[] columns = {"-", "ID", "PROPERTY", "ACTIVE", "SETUP_ID", "VALUE"};

        String query
                = " SELECT 					\n"
                + " STC.ID           ID,        		\n"
                + " STC.PROPERTY     PROPERTY,                  \n"
                + " NVL(STC.DEFAULT_VALUE , ' ')  VALUE,        \n"
                + " STC.ACTIVE       ACTIVE,                    \n"
                + " STC.SETUP_ID     SETUP_ID			\n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC       \n"
                + " WHERE STC.SETUP_ID = '" + setupTableId + "'   \n"
                + " ORDER BY ID   \n";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            Location loc = new Location();
            loc.setupTableColumnId = map.get("ID").toString();
            loc.property = map.get("PROPERTY").toString();
            loc.activeProperty = map.get("ACTIVE").toString();
            loc.propertyValue = map.get("VALUE").toString();
            loc.setupId = map.get("SETUP_ID").toString();
            list.add(loc);
        }
        return list;
    }

    public List<SetupColumnDetail> searchSetupColumDetails(String tableRowId, String setupId) {

        String[] columns = {"-", "TABLE_COLUMN_ID", "TABLE_ROW_ID",
            "PROPERTY", "DESCRIPTION"};

        String query
                = " SELECT                           \n"
                + " SCD.TABLE_COLUMN_ID TABLE_COLUMN_ID,        \n"
                + " SCD.TABLE_ROW_ID TABLE_ROW_ID,              \n"
                + " STC.PROPERTY , 				\n"
                + " NVL(SCD.DESCRIPTION,' ') DESCRIPTION        \n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC,      \n"
                + Database.DCMS.setupColumnDetail + "  SCD      \n"
                + " WHERE SETUP_ID = '" + setupId + "'          \n"
                + " AND STC.ID = SCD.TABLE_COLUMN_ID            \n"
                + " AND SCD.TABLE_ROW_ID = '" + tableRowId + "' \n"
                + " AND STC.ACTIVE = 'Y'                        \n"
                + " ORDER BY ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();
        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            SetupColumnDetail loc = new SetupColumnDetail();
            // loc.setId(map.get("ID").toString());
            loc.setTableColumnId(map.get("TABLE_COLUMN_ID").toString());
            loc.setTableRowId(tableRowId);
            loc.setProperty(map.get("PROPERTY").toString());
            loc.setRowDescription(map.get("DESCRIPTION").toString());
            list.add(loc);
        }
        return list;
    }

    public boolean insertsetupColumnDetailHistory(String tableRowId,
            String tableColumnId, String description) {

        List vecDT = new ArrayList();

        String[] columns = {Database.DCMS.setupColumnDetailHistory,
            "TABLE_ROW_ID", "TABLE_COLUMN_ID", "DESCRIPTION", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("TABLE_ROW_ID", "'" + tableRowId + "'");
        map.put("TABLE_COLUMN_ID", "'" + tableColumnId + "'");
        map.put("DESCRIPTION", "'" + description + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", "SYSDATE");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        vecDT.add(map);

        return Constants.dao.insertData(vecDT, columns);
    }

    public boolean insertSetupColumnDetail(List columnProperties) {

        List vecDT = new ArrayList();

        String[] columns = {Database.DCMS.setupColumnDetail,
            "TABLE_ROW_ID", "TABLE_COLUMN_ID", "DESCRIPTION", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        for (int i = 0; i < columnProperties.size(); i++) {

            SetupColumnDetail loc = (SetupColumnDetail) columnProperties.get(i);
            HashMap map = new HashMap();
            map.put("TABLE_ROW_ID", "'" + loc.getTableRowId() + "'");
            map.put("TABLE_COLUMN_ID", "'" + loc.getTableColumnId() + "'");
            map.put("DESCRIPTION", "'" + loc.getDefaultValue() + "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_DATE", "SYSDATE");
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            vecDT.add(map);
        }
        return Constants.dao.insertData(vecDT, columns);
    }

    public boolean updateSetupColumnDetail(List<SetupColumnDetail> listSetupDetail) {

        List<String> queries = new ArrayList<>();
        for (SetupColumnDetail scd : listSetupDetail) {

            String query = " UPDATE  " + Database.DCMS.setupColumnDetail + " SCD  \n"
                    + " SET DESCRIPTION =  '" + scd.getRowDescription().replaceAll("''", "'") + "' \n"
                    + " WHERE SCD.TABLE_ROW_ID = '" + scd.getTableRowId() + "'\n"
                    + " AND TABLE_COLUMN_ID = '" + scd.getTableColumnId() + "'";
            queries.add(query);
        }
        return Constants.dao.executeUpdates(queries);
    }

    public boolean updateSetupTableProperty(SetupColumnDetail loc) {

        String query = " UPDATE  " + Database.DCMS.setupTableColums + "  \n"
                + " SET  ACTIVE = '" + loc.getActive() + "',             \n"
                + " PROPERTY = '" + loc.getProperty() + "'               \n"
                + " WHERE ID = '" + loc.getTableColumnId() + "'          \n";

        return Constants.dao.executeUpdate(query, true);
    }

    public boolean insertSetupColumnDetailsHistory(List listDetailHistory) {

        List vecDT = new ArrayList();

        String[] columns = {Database.DCMS.setupColumnDetailHistory,
            "TABLE_ROW_ID", "TABLE_COLUMN_ID", "DESCRIPTION", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        for (int i = 0; i < listDetailHistory.size(); i++) {

            SetupColumnDetail loc = (SetupColumnDetail) listDetailHistory.get(i);
            HashMap map = new HashMap();
            map.put("TABLE_ROW_ID", "'" + loc.getTableRowId() + "'");
            map.put("TABLE_COLUMN_ID", "'" + loc.getTableColumnId() + "'");
            map.put("DESCRIPTION", "'" + loc.getRowDescription() + "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_DATE", "SYSDATE");
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
            vecDT.add(map);
        }
        return Constants.dao.insertData(vecDT, columns);
    }

    public boolean insertPropertyEditHistory(SetupColumnDetail scd, String setupTableId) {
        boolean ret = true;
        String[] columns = {Database.DCMS.propertyEditHistory, "ID", "SETUP_ID",
            "PROPERTY", "ACTIVE", "CRTD_BY", "PROPERTY_ID",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + key.generatePrimaryKey(Keys.propertyEditHistory, false) + "'");
        map.put("SETUP_ID", "'" + setupTableId + "'");
        map.put("PROPERTY", "'" + scd.getProperty() + "'");
        map.put("PROPERTY_ID", "'" + scd.getId() + "'");
        map.put("ACTIVE", "'" + scd.getActive() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", "SYSDATE");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List li = new ArrayList();
        li.add(map);
        ret = Constants.dao.insertData(li, columns);
        if (!ret) {
            ret = false;
        }
        return ret;
    }

    public List<SetupColumnDetail> searchSetupDetailInfo(String rowId,
            String setupId) {

        String[] columns = {"-", "TABLE_COLUMN_ID", "TABLE_ROW_ID",
            "ROW_DESCRIPTION", "ID", "PROPERTY", "REMARKS", "DEFAULT_VALUE"};

        String query
                = " SELECT TABLE_COLUMN_ID, TABLE_ROW_ID,\n"
                + " NVL(SCD.DESCRIPTION,' ') ROW_DESCRIPTION,\n"
                + " STC.PROPERTY, STC.ID,\n"
                + " NVL(STC.DEFAULT_VALUE, 'N')DEFAULT_VALUE,\n"
                + " NVL(STC.REMARKS, 'N/A')REMARKS  FROM \n"
                + Database.DCMS.setupTableColums + "  STC,\n"
                + Database.DCMS.setupColumnDetail + "  SCD\n"
                + " WHERE SETUP_ID = " + setupId + "\n"
                + " AND STC.ID = SCD.TABLE_COLUMN_ID\n"
                + " AND SCD.TABLE_ROW_ID = '" + rowId + "'\n"
                + " AND STC.ACTIVE = 'Y'\n"
                + " ORDER BY STC.ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();
        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            SetupColumnDetail loc = new SetupColumnDetail();
            loc.setTableColumnId(map.get("TABLE_COLUMN_ID").toString());
            loc.setTableRowId(rowId);
            loc.setRowDescription(map.get("ROW_DESCRIPTION").toString());
            loc.setId(map.get("ID").toString());
            loc.setProperty(map.get("PROPERTY").toString());
            loc.setDefaultValue(map.get("DEFAULT_VALUE").toString());
            loc.setRemarks(map.get("REMARKS").toString());
            list.add(loc);
        }
        return list;
    }

}
