/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BMT.BO.CompoundingBO;
import BO.Administration.MonthlyLocationExpenseBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class MonthlyLocationExpenseHandler {

    public List<MonthlyLocationExpenseBO> headWiseMonthlyExpense(String locationId,
            String expMonth, String closeStatus) {

        String columns[] = {"-", "EXP_MASTER_ID", "EXPENSE_TYPE_ID", "EXP_NAME",
            "AMOUNT", "EXPENSE_MONTH"};

        String query
                = "SELECT MEM.ID EXP_MASTER_ID,                     \n"
                + " MED.EXPENSE_TYPE_ID,                            \n"
                + " DTD.DESCRIPTION EXP_NAME,                       \n"
                + " MED.AMOUNT,                                     \n"
                + " MEM.EXPENSE_MONTH  FROM                         \n"
                + Database.DCMS.locMonthlyExpDetail + " MED,        \n"
                + Database.DCMS.locMonthlyExpMaster + " MEM,        \n"
                + Database.DCMS.definitionTypeDetail + " DTD        \n"
                + " WHERE MEM.LOCATION_ID = '" + locationId + "'                   \n"
                + " AND MEM.ID = MED.EXP_MASTER_ID                  \n";

        if (!expMonth.equalsIgnoreCase("N")) {
            query += "AND MEM.EXPENSE_MONTH = '" + expMonth + "'    \n";
        }
        if (!closeStatus.equalsIgnoreCase("N")) {
            query += "AND MEM.CLOSE_STATUS = '" + closeStatus + "'    \n";
        }
        query += " AND MED.EXPENSE_TYPE_ID = DTD.ID                \n"
                + " AND DTD.ACTIVE = 'Y'                            \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        System.out.println(" Data : " + listmap.size());
        List<MonthlyLocationExpenseBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            MonthlyLocationExpenseBO objData = new MonthlyLocationExpenseBO();

            objData.setExpenseMasterId(map.get("EXP_MASTER_ID").toString());
            objData.setExpenseTypeId(map.get("EXPENSE_TYPE_ID").toString());
            objData.setExpenseTypeDescription(map.get("EXP_NAME").toString());
            objData.setAmount(map.get("AMOUNT").toString());
            objData.setExpenseMonth(map.get("EXPENSE_MONTH").toString());

            lisVerRep.add(objData);
        }

        return lisVerRep;
    }

    public List<MonthlyLocationExpenseBO> monthWiseExpense(String locationId,
            String expMonth, String closeStatus) {

        String columns[] = {"-", "EXP_MASTER_ID", "LOCATION_ID", "LOC_DESC",
            "EXPENSE_TYPE_ID", "EXP_NAME", "AMOUNT", "CLOSE_STATUS",
            "TOTAL_AMOUNT", "EXPENSE_MONTH"};

        String query
                = "SELECT MEM.ID EXP_MASTER_ID,                     \n"
                + "       MEM.LOCATION_ID,                          \n"
                + "       LOC.DESCRIPTION LOC_DESC,                 \n"
                + "       MED.EXPENSE_TYPE_ID,                      \n"
                + "       DTD.DESCRIPTION EXP_NAME,                 \n"
                + "       MED.AMOUNT,                               \n"
                + "       MEM.CLOSE_STATUS,                         \n"
                + "       MEM.TOTAL_AMOUNT,                         \n"
                + "       MEM.EXPENSE_MONTH                         \n"
                + "  FROM " + Database.DCMS.locMonthlyExpDetail + " MED,\n"
                + Database.DCMS.locMonthlyExpMaster + " MEM,           \n"
                + Database.DCMS.definitionTypeDetail + " DTD,          \n"
                + Database.DCMS.location + " LOC                       \n"
                + " WHERE MEM.LOCATION_ID = '" + locationId + "'    \n"
                + "   AND MEM.ID = MED.EXP_MASTER_ID                \n";

        if (!expMonth.equalsIgnoreCase("N")) {
            query += "AND MEM.EXPENSE_MONTH = '" + expMonth + "'    \n";
        }
        if (!closeStatus.equalsIgnoreCase("N")) {
            query += "AND MEM.CLOSE_STATUS = '" + closeStatus + "'  \n";
        }
        query += " AND MED.EXPENSE_TYPE_ID = DTD.ID                 \n"
                + " AND MEM.LOCATION_ID = LOC.ID                    \n"
                + " AND DTD.ACTIVE = 'Y'                            \n";

        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);

        System.out.println(" Data : " + listmap.size());
        List<MonthlyLocationExpenseBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {

            HashMap map = (HashMap) listmap.get(i);
            MonthlyLocationExpenseBO objData = new MonthlyLocationExpenseBO();

            objData.setExpenseMasterId(map.get("EXP_MASTER_ID").toString());
            objData.setLocationId(map.get("LOCATION_ID").toString());
            objData.setLocationDescription(map.get("LOC_DESC").toString());
            objData.setExpenseTypeId(map.get("EXPENSE_TYPE_ID").toString());
            objData.setExpenseTypeDescription(map.get("EXP_NAME").toString());
            objData.setAmount(map.get("AMOUNT").toString());
            objData.setCloseStatus(map.get("CLOSE_STATUS").toString());
            objData.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            objData.setExpenseMonth(map.get("EXPENSE_MONTH").toString());

            lisVerRep.add(objData);
        }

        return lisVerRep;
    }
    
    public String selectMonthlyExpId() {
        String[] columns = {"-", "ID"};
        String query = " SELECT NVL(MAX(ID) + 1, 1) ID FROM \n"
                + Database.DCMS.locMonthlyExpMaster + "     \n";
        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }
    
    public boolean insertLocMonthlyExpMaster(MonthlyLocationExpenseBO comp, String id) {

        String[] columns = {Database.DCMS.locMonthlyExpMaster, "ID", "LOCATION_ID", 
            "EXPENSE_MONTH", "CLOSE_STATUS","ACTIVE", "TOTAL_AMOUNT", "CRTD_BY", 
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + id + "'");
        map.put("LOCATION_ID", "'" + comp.getLocationId()+ "'");
        map.put("EXPENSE_MONTH", "'" + comp.getExpenseMonth()+ "'");
        map.put("CLOSE_STATUS", "'" + comp.getCloseStatus()+ "'");
        map.put("ACTIVE", "'" + comp.getActive()+ "'");
        map.put("TOTAL_AMOUNT", "'" + comp.getTotalAmount()+ "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }
    
    public boolean insertLocMonthlyExpDetail(List<MonthlyLocationExpenseBO> listCopy, 
            String id) {

        String[] columns = {Database.DCMS.locMonthlyExpDetail, "EXP_MASTER_ID", 
            "EXPENSE_TYPE_ID", "AMOUNT", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listCopy.size(); i++) {
            MonthlyLocationExpenseBO comp = listCopy.get(i);
            HashMap map = new HashMap();
            map.put("EXP_MASTER_ID", "'" + id + "'");
            map.put("EXPENSE_TYPE_ID", "'" + comp.getExpenseTypeId()+ "'");
            map.put("AMOUNT", "'" + comp.getAmount()+ "'");
            map.put("CRTD_BY", "'" + Constants.userId + "'");
            map.put("CRTD_DATE", Constants.today);
            map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean updateTotalAmount(String id) {
        String query
                = " UPDATE " + Database.DCMS.locMonthlyExpMaster + "\n"
                + " SET STATUS = (SELECT  SUM(AMOUNT) FROM "
                + Database.DCMS.locMonthlyExpMaster 
                + "WHERE EXP_MASTER_ID = "+ id +")\n"
                + " WHERE ISSUE_REQUEST_NO = " + id + " \n";
        return Constants.dao.executeUpdate(query, false);
    }
    
}
