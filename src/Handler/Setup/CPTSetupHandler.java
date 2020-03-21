
package Handler.Setup;

import BO.CPT.CPT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.TypeDetailId;

/**
 * 
 * @author Sibtain
 */
public class CPTSetupHandler implements java.io.Serializable{

    GenerateKeys key = new GenerateKeys();

    public boolean insertCPTDetailsHistory(CPT cpt) {

        List vecDT = new ArrayList();

        String[] columns = {Database.DCMS.setupColumnDetailHistory, 
            "TABLE_ROW_ID", "TABLE_COLUMN_ID", "DESCRIPTION", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("TABLE_ROW_ID", "'" + cpt.tableRowId + "'");
        map.put("TABLE_COLUMN_ID", "'" + cpt.tableColumnId + "'");
        map.put("DESCRIPTION", "'" + cpt.description + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", "SYSDATE");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        vecDT.add(map);

        return Constants.dao.insertData(vecDT, columns);
    }

    public String insertProperty(CPT cpt) {

        String[] columns = {Database.DCMS.setupTableColums, "ID", "SETUP_ID",
            "PROPERTY", "ACTIVE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        String id = key.generatePrimaryKey(Keys.setupTableColums,false);
        map.put("ID", "'" + id + "'");
        map.put("SETUP_ID", "'" + TypeDetailId.setupTableCPT + "'");
        map.put("PROPERTY", "'" + cpt.property + "'");
        map.put("ACTIVE", "'" + cpt.activeProperty + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", "SYSDATE");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List li = new ArrayList();
        li.add(map);
        if (Constants.dao.insertData(li, columns)) {
            return id;
        } else {
            return "";
        }
    }

    public boolean insertPropertyEditHistory(CPT cpt, String propertyid) {
        boolean ret = true;
        String[] columns = {Database.DCMS.propertyEditHistory, "ID",
            "PROPERTY_ID", "SETUP_ID", "PROPERTY", "ACTIVE", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + key.generatePrimaryKey(Keys.propertyEditHistory,false) + "'");
        map.put("PROPERTY_ID", "'" + propertyid + "'");
        map.put("SETUP_ID", "'" + TypeDetailId.setupTableCPT + "'");
        map.put("PROPERTY", "'" + cpt.property + "'");
        map.put("ACTIVE", "'" + cpt.activeProperty + "'");
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

    public List<CPT> searchCPTDetails(String id) {

        String[] columns = {"-",  "COLUMN_ID", "CPT_ID", "PROPERTY",
            "DESCRIPTION"};

        String query
                = "SELECT 					\n"
                
                + " STC.ID COLUMN_ID , 				\n"
                + " SCD.TABLE_ROW_ID CPT_ID ,              \n"
                + " STC.PROPERTY , 				\n"
                + " NVL(SCD.DESCRIPTION,' ') DESCRIPTION        \n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC      ,\n"
                + Database.DCMS.setupColumnDetail + "  SCD       \n"
                + " WHERE SETUP_ID = '" + TypeDetailId.setupTableCPT + "'   \n"
                + " AND STC.ID = SCD.TABLE_COLUMN_ID    \n"
                + " AND SCD.TABLE_ROW_ID = '" + id + "' \n"
                + " AND STC.ACTIVE = 'Y'                \n"
                + " ORDER BY SCD.ID ";

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            CPT cpt = new CPT();
           
            cpt.tableColumnId = map.get("COLUMN_ID").toString();
            cpt.tableRowId = map.get("CPT_ID").toString();
            cpt.property = map.get("PROPERTY").toString();
            cpt.description = map.get("DESCRIPTION").toString();
            list.add(cpt);
        }
        return list;
    }

    public List<CPT> searchProperty() {

        String[] columns = {"-", "COLUMN_ID", "SETUP_ID", "PROPERTY"};

        String query
                = "SELECT 					\n"
                + " STC.ID COLUMN_ID , 				\n"
                + " STC.SETUP_ID  ,                             \n"
                + " STC.PROPERTY 				\n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC       \n"
                + " WHERE SETUP_ID = '" + TypeDetailId.setupTableCPT + "'   \n"
                + " AND STC.ACTIVE = 'Y'                        \n"
                + " ORDER BY STC.ID ";

       

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            CPT cpt = new CPT();
            cpt.setupTableColumnId = map.get("COLUMN_ID").toString();
            cpt.setupId = map.get("SETUP_ID").toString();
            cpt.property = map.get("PROPERTY").toString();
            list.add(cpt);
        }
        return list;
    }

    public List<CPT> searchCPTFields(String propertyName) {

        String[] columns = {"-", "ID", "PROPERTY", "ACTIVE", "SETUP_ID"};

        String query
                = "SELECT 					\n"
                + " STC.ID           ID,        		\n"
                + " STC.PROPERTY     PROPERTY,                  \n"
                + " STC.ACTIVE       ACTIVE,                    \n"
                + " STC.SETUP_ID     SETUP_ID			\n"
                + " FROM 					\n"
                + Database.DCMS.setupTableColums + "  STC       \n"
                + " WHERE STC.SETUP_ID = '" + TypeDetailId.setupTableCPT + "'    \n"
                + " AND STC.PROPERTY LIKE  '%" + propertyName + "%'    \n"
                + " ORDER BY ID                                 \n";
    

        List<HashMap> li = Constants.dao.selectData(query, columns);
        List list = new ArrayList();

        for (int i = 0; i < li.size(); i++) {
            HashMap map = li.get(i);
            CPT cpt = new CPT();
            cpt.setupTableColumnId = map.get("ID").toString();
            cpt.property = map.get("PROPERTY").toString();
            cpt.activeProperty = map.get("ACTIVE").toString();
            cpt.setupId = map.get("SETUP_ID").toString();
            list.add(cpt);
        }
        return list;
    }

    public boolean insertCPTDetails(CPT loc) {

        List vecDT = new ArrayList();

        String[] columns = {Database.DCMS.setupColumnDetail,  
            "TABLE_ROW_ID", "TABLE_COLUMN_ID", "DESCRIPTION", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        
        map.put("TABLE_ROW_ID", "'" + loc.tableRowId + "'");
        map.put("TABLE_COLUMN_ID", "'" + loc.tableColumnId + "'");
        map.put("DESCRIPTION", "'" + loc.description + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", "SYSDATE");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        vecDT.add(map);

        return Constants.dao.insertData(vecDT, columns);
    }

}