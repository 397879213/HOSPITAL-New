package Inventory.Handler;

import Inventory.BO.PathCptItemSetup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;

public class PathCptItemSetupHandler {

    public List<PathCptItemSetup> searchCpt(String cptId, String sectionId) {

        String columns[] = {"-", "CPT_ID", "CPT_NAME", "TUBE_CODE_ID", "SPECIMEN_ID",
            "QTY"};

        String query
                = "SELECT CP.CPT_ID,                                \n"
                + "       CP.DESCRIPTION CPT_NAME,                  \n"
                + "       STT.DESCRIPTION TUBE_CODE_ID,             \n"
                + "       ST.DESCRIPTION SPECIMEN_ID,               \n"
                + "       STTT.DESCRIPTION QTY                      \n"
                + "  FROM " + Database.DCMS.CPT + "  CP,            \n"
                + Database.DCMS.setupColumnDetail + "   ST,          \n"
                + Database.DCMS.setupColumnDetail + " STT,           \n"
                + Database.DCMS.setupColumnDetail + " STTT,          \n"
                + Database.Inventory.cptWiseConsumableItems + " CWC  \n"
                + " WHERE CP.DEPARTMENT_ID = " + Departments.pathology + "\n"
                + "   AND UPPER(CP.DESCRIPTION) LIKE '%" + cptId + "%'\n"
                + "   AND CP.ACTIVE = 'Y'                           \n";
        if (!sectionId.equalsIgnoreCase("ALL")) {
            query += "   AND CP.SECTION_ID = '" + sectionId + "\n";
        }

        query += "   AND CP.CPT_ID = ST.TABLE_ROW_ID        \n"
                + "   AND ST.TABLE_COLUMN_ID = 5                    \n"
                + "   AND CP.CPT_ID = STT.TABLE_ROW_ID              \n"
                + "   AND STT.TABLE_COLUMN_ID = 28                  \n"
                + "   AND CP.CPT_ID = STTT.TABLE_ROW_ID             \n"
                + "   AND STTT.TABLE_COLUMN_ID = 29                 \n"
                + "   AND CP.CPT_ID = CWC.CPT_ID                    \n"
                + " ORDER BY CP.SECTION_ID, CP.DESCRIPTION          \n";
        ;

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        List<PathCptItemSetup> lisadd = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PathCptItemSetup objBO = new PathCptItemSetup();

            objBO.setCptId(map.get("CPT_ID").toString());
            objBO.setCptName(map.get("CPT_NAME").toString());
            objBO.setTubeCodeId(map.get("TUBE_CODE_ID").toString());
            objBO.setSpecimenId(map.get("SPECIMEN_ID").toString());
            objBO.setQuantity(map.get("QTY").toString());
            lisadd.add(objBO);
        }

        return lisadd;
    }

    public List<PathCptItemSetup> cptWiseCOnsumableItems(String cptId, 
            String itemDesc, String itemId) {

        String columns[] = {"-", "CPT_ID", "TUBE_CODE_ID", "SPECIMEN_ID",
            "QTY", "ITEM_ID", "ITEM_NAME"};

        String query
                = "SELECT CWC.CPT_ID,                       \n"
                + "         CWC.TUBE_CODE_ID,               \n"
                + "         CWC.ITEM_ID,                    \n"
                + "         ITM.DESCRIPTION ITEM_NAME,      \n"
                + "         CWC.SPECIMEN_ID,                \n"
                + "         CWC.QTY             FROM        \n"
                + Database.Inventory.cptWiseConsumableItems + " CWC, \n"
                + Database.DCMS.item + " ITM                 \n";
        if (itemId.length() != 0) {
            query += "  WHERE CWC.ITEM_ID = " + itemId + "%  \n";
        }
        if (itemDesc.length() != 0) {
            query += "  WHERE UPPER(ITM.DESCRIPTION) LIKE '%" + cptId + "%'  \n";
        }
        if (cptId.length() != 0) {
            query += "  WHERE CWC.CPT_ID = '" + cptId + "'       \n";
        }
        query += "  AND CWC.ITEM_ID = ITM.ID                     \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        List<PathCptItemSetup> lisadd = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            PathCptItemSetup objBO = new PathCptItemSetup();

            objBO.setCptId(map.get("CPT_ID").toString());
            objBO.setTubeCodeId(map.get("TUBE_CODE_ID").toString());
            objBO.setSpecimenId(map.get("SPECIMEN_ID").toString());
            objBO.setQuantity(map.get("QTY").toString());
            objBO.setItemId(map.get("ITEM_ID").toString());
            objBO.setItemName(map.get("ITEM_NAME").toString());
            lisadd.add(objBO);
        }

        return lisadd;
    }
}
