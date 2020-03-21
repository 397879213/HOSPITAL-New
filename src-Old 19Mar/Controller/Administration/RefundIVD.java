/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.RefundIVDBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class RefundIVD {

    public List<RefundIVDBO> selectRefundDetail(String fromDate,
            String toDate, String departmentId) {

        String[] selectColumns = {"-", "CON", "ODI", "REFUND_AMOUNT"};

        String query
                = "SELECT   COMPLETE_ORDER_NO CON,                              \n"
                + "         ORDER_DETAIL_ID ODI,                                \n"
                + "         REFUND_AMOUNT   FROM                                \n"
                + Database.DCMS.refundDetail + "                                \n"
                + " WHERE REFUND_DATE BETWEEN '" + fromDate + "' AND '" + toDate + "' \n"
                + " AND DEPARTMENT_ID = " + departmentId + "                    \n";
        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<RefundIVDBO> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            RefundIVDBO setData = new RefundIVDBO();

            setData.setCon(map.get("CON").toString());
            setData.setOdi(map.get("ODI").toString());
            setData.setRefundAmount(map.get("REFUND_AMOUNT").toString());

            list.add(setData);
        }
        return list;
    }

    public boolean updateinvoiceDetail(List<RefundIVDBO> listUpdate) {
        boolean ret = true;
        for (int i = 0; i < listUpdate.size(); i++) {
            RefundIVDBO objUpdate = listUpdate.get(i);

            String query
                    = " UPDATE " + Database.DCMS.invoiceDetail + "     \n"
                    + " SET REFUND_AMOUNT =  " + objUpdate.getRefundAmount() + "   \n"
                    + " WHERE COMPLETE_ORDER_NO =  '" + objUpdate.getCon() + "'     \n"
                    + " AND ORDER_DETAIL_ID =  " + objUpdate.getOdi() + "        \n";
            System.out.println(query);
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean runProcess(String fromDate, String toDate, String departmentId) {
        boolean ret = updateinvoiceDetail(selectRefundDetail(fromDate, toDate, departmentId));
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public static void main(String[] args) {
        RefundIVD obj = new RefundIVD();
        if (obj.runProcess("01-AUG-18", "10-AUG-18", "1830")) {
            System.out.println("Process run successfully!");
        } else {
            System.err.println("Unable to run Process.");
        }
    }
}
