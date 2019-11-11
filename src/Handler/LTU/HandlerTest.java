/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.LTU;

import BO.LTU.DialysisBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class HandlerTest {

    public void num() {
        int num = 3;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("zic zac");
        } else {
            if (num % 3 == 0) {
                System.out.println("zic");
            }

            if (num % 5 == 0) {
                System.out.println("zac");
            }
        }
    }

    public boolean insertDialysisItemDetail(DialysisBO objSave) {

        String columns[] = {Database.DCMS.dialysisItemDetail, "ORDER_TYPE_ID","ORDER_NO",
            "LOCATION_ID",
            "COMPLETE_ORDER_NO", "PATIENT_ID","ORDER_DATE", "INHOUSE_DOCTOR_ID",
        "REFERRING_DOCTOR_ID", "TRN_DATE", "ORDER_BY", "TERMINAL_ID", "MOBILITY_STATUS_ID"};

        HashMap insertMap = new HashMap();
        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo()+ "'");
        insertMap.put("ORDER_TYPE_ID", "'" + objSave.getItemId()+ "'");
        insertMap.put("ORDER_NO", "'" + objSave.getItemId()+ "'");
        insertMap.put("LOCATION_ID", "'" + objSave.getItemId()+ "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getItemId()+ "'");
        insertMap.put("ORDER_DATE", "'" + objSave.getItemId()+ "'");
        insertMap.put("INHOUSE_DOCTOR_ID", "'" + objSave.getItemId()+ "'");
        insertMap.put("REFERRING_DOCTOR_ID", "'" + objSave.getItemId()+ "'");   
        insertMap.put("ORDER_BY", "'" + Constants.userId + "'");
        insertMap.put("TRN_DATE", "SYSDATE");
        insertMap.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
        insertMap.put("MOBILITY_STATUS_ID", "'" + objSave.getItemId()+ "'");
        
        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }
    
    
    public static void main(String[] args) {
        HandlerTest hdl = new HandlerTest();
        hdl.num();
    }
}
