/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shakeel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class OrderBookingHandler {
    
    public boolean insertItemOrder(OrderBooking comp) {

        String[] columns = {Database.DCMS.itemOrder, "ID", "CUSTOMER_ID", 
            "ITEM_ID", "DESIGN_REFERENCE","CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID)+1,1) ID FROM "+Database.DCMS.itemOrder + ")");
        map.put("CUSTOMER_ID", "'" + comp.getCustomerId()+ "'");
        map.put("ITEM_ID", "'" + comp.getItemId()+ "'");
        map.put("DESIGN_REFERENCE", "'" + comp.getRefernce()+ "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }
}
