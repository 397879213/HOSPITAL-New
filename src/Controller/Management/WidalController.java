/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Management;

import BO.Management.WidalReportingBo;
import Handler.Management.WidalReportinghandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author TOSHIBA SATELLITE
 */
public class WidalController {

    public WidalReportinghandler hdlWidal = new WidalReportinghandler();

    public List selectWidalReportiList(String completeOrderNo, String orderDetailId) {
        return hdlWidal.selectWidalReporting(completeOrderNo, orderDetailId);
    }

    
      public boolean saveWidalDate(WidalReportingBo wid, List<WidalReportingBo> listWidal) {

        List<String> updates = new ArrayList<>();
          updateWidal(listWidal, updates);
        boolean ret = Constants.dao.executeUpdates(updates);
        if (ret) {
            return Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
       public void updateWidal(List<WidalReportingBo> listWidal,
            List<String> updates) {

        for (WidalReportingBo wid : listWidal) {
            updates.add(" UPDATE " + Database.DCMS.pathWidalReporting + " SET     \n"
                   + " SOL_20 ='" + wid.getSol20() + "'     ,\n"
                + " SOL_40 = '" + wid.getSol40() + "'    ,\n"
                + " SOL_80 = '" + wid.getSol80() + "'        ,\n"
                + " SOL_160 = '" + wid.getSol160() + "' ,\n"
                + " SOL_320 ='" + wid.getSol320() + "'                  \n"
                + " WHERE CON = '" + wid.getCompleteOrderNo() + "'\n"
                + " AND ODI = '" + wid.getOrderDetailId() + "'          \n"
                + " AND PARAMETER_ID = '" + wid.getParameterId() + "'            \n"); 
        }
    }
       
       public boolean insertWidalParam(List<WidalReportingBo> lst){
           
           boolean ret = true;
           
           for (int i = 0; i < lst.size(); i++) {
              
               ret = hdlWidal.insertWidalParam(lst.get(i));
               
               if (ret) {
                   Constants.dao.commitTransaction();
               }
               if (!ret) {
                   Constants.dao.rollBack();
               }
           }
          
           return ret;
       }
}
