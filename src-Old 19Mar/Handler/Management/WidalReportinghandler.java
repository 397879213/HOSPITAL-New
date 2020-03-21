/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Management;

import BO.Management.WidalReportingBo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author user
 */
public class WidalReportinghandler {

    
    public List selectWidalReporting(String completeOrderNo,
              String orderDetailId) {

        String[] columns = {"","CON","ODI","SPECIMEN","PARAMETER_ID","PARAMETER_NAME",
            "SOL_20","SOL_40","SOL_80","SOL_160","SOL_320"};  
        
          String query = " SELECT "
                + "WI.CON                                    CON,             \n"
                + "WI.ODI                                    ODI,             \n"
                + "SP.DESCRIPTION                            SPECIMEN,        \n"
                + "CP.DESCRIPTION                            PARAMETER_NAME,  \n"
                + "CWP.PARAMETER_ID                          PARAMETER_ID,    \n"                  
                + "NVL(WI.SOL_20,' ')                                 SOL_20,          \n"
                + "NVL(WI.SOL_40,' ')                                 SOL_40,          \n"
                + "NVL(WI.SOL_80,' ')                                 SOL_80,          \n"
                + "NVL(WI.SOL_160,' ')                                SOL_160,         \n"
                + "NVL(WI.SOL_320,' ')                                SOL_320          \n"
                  + " FROM "
                + Database.DCMS.pathologyResultMaster + " PRM,               \n"
                + Database.DCMS.CPTWiseParameter + " CWP,                    \n"
             //   + Database.DCMS.pathWidalReporting + " WI,                   \n"
                 + Database.DCMS.CPTParameter+ " CP,                         \n"
                + Database.DCMS.definitionTypeDetail + " SP                  \n"
                + " WHERE PRM.COMPLETE_ORDER_NO = '" + completeOrderNo + "'  \n"
                + " AND PRM.ORDER_DETAIL_ID = '" + orderDetailId + "'        \n"
                + " AND CWP.PARAMETER_ID = WI.PARAMETER_ID                   \n"
                + " AND PRM.COMPLETE_ORDER_NO = WI.CON                       \n"
                + " AND PRM.ORDER_DETAIL_ID = WI.ODI                         \n"
                + " AND CWP.PARAMETER_ID=CP.ID                               \n"
                + " AND PRM.SPECIMEN_ID=SP.ID                                \n"
                + " ORDER BY CWP.POSITION                                    \n";
          

        System.out.println(query);
        List vec = Constants.dao.selectData(query, columns);
        List<WidalReportingBo> WidalReportingBo = new ArrayList();
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            WidalReportingBo wid = new WidalReportingBo();
            wid.setCompleteOrderNo(completeOrderNo);
            wid.setOrderDetailId(orderDetailId);
            wid.setParameterName(map.get("PARAMETER_NAME").toString());
            wid.setParameterId(map.get("PARAMETER_ID").toString());
            wid.setSpecimen(map.get("SPECIMEN").toString());
            wid.setSol20(map.get("SOL_20").toString());
            wid.setSol40(map.get("SOL_40").toString());
            wid.setSol80(map.get("SOL_80").toString());
            wid.setSol160(map.get("SOL_160").toString());
            wid.setSol320(map.get("SOL_320").toString());     
            WidalReportingBo.add(wid);
        }
        return WidalReportingBo;
    }

    public boolean insertWidalParam(WidalReportingBo widObj) {

        String[] col = {Database.DCMS.pathologyResultMaster, "CON", "ODI", "PARAMETER_ID"};

        HashMap map = new HashMap();
        map.put("CON", "'" + widObj.getCompleteOrderNo() + "'");
        map.put("ODI", "'" + widObj.getOrderDetailId() + "'");
        map.put("PARAMETER_ID", "'" + widObj.getParameterId() + "'");

        Vector vec = new Vector();
        vec.add(map);
        return Constants.dao.insertData(vec, col);
    }
     
    
    
    public static void main(String[] args) {
        
        WidalReportinghandler obj = new WidalReportinghandler();
       
       System.out.println("query : \n " +obj.selectWidalReporting("006001170154043","3"));
   }
}
   
    

