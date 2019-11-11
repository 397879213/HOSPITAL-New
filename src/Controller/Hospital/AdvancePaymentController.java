/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Hospital;

import BO.Hospital.AdvancePayment;
import Handler.Hospital.AdvancePaymentHandler;
import Handler.OrderHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;
/**
 *
 * @author raheelansari
 */
public class AdvancePaymentController {
    
    AdvancePaymentHandler hdlAp = new AdvancePaymentHandler();
    OrderHandler ctlOrderhandler = new OrderHandler();
    List<AdvancePayment> hdlReturn = new ArrayList();
    List<String> hdlReturnStr = new ArrayList();
    
    public List<AdvancePayment> selectAdmPatientDetail(String admissionNo, 
            String departmentId, String isRefund) {
        return hdlAp.selectAdmPatientDetail(admissionNo, departmentId, isRefund);
    }
    
    
    public List<AdvancePayment>
            selectAdmittedPatient(String patientId) {
        return hdlReturn;
                //hdlAp.selectAdmittedPatient(patientId);
    }
//
    public List<AdvancePayment>
            selectPayment(String admissionNo, String available) {
        return hdlReturn;
                //hdlAp.selectPaymentDetail(admissionNo, available);
    }
//
    public String
            selectTotalAdvance(String admissionNo) {
        return "";
                //hdlAp.selectTotalAdvance(admissionNo);
    }
//
    public List<AdvancePayment>
            selectDepartmentWiseBill(String admissionNo) {
        return hdlReturn;
//                hdlAp.selectDepartmentWiseBill(admissionNo);
    }
//
    public String
            selectPatientPayableBill(String admissionNo) {
        return "";
                //hdlAp.selectPatientPayableBill(admissionNo);
    }

    public List<AdvancePayment> selectCPTWiseBlockedServicesBill(String admissionNo) {

        return hdlReturn;
                //hdlAp.selectCPTWiseBlockedServicesBill(admissionNo);
    }

    public List<AdvancePayment> selectCPTWiseBlockedServicesRefund(String admissionNo) {

        return hdlReturn;
                //hdlAp.selectDepartmentWiseBlockedItemsRefund(admissionNo);
    }

    public List<AdvancePayment>
            selectDepartmentWiseRefund(String admissionNo) {
        return hdlReturn;
                //hdlAp.selectDepartmentWiseRefund(admissionNo);
    }

    public List<AdvancePayment> selectBlockedItemsDetailList(String admissionNo) {

        return hdlReturn;
                //hdlAp.selectBlockedItemsDetailList(admissionNo);
    }

    public List<String> selectBlockedItemsInvoices(String admissionNo) {

        return hdlReturnStr;
                //hdlAp.selectBlockedItemsInvoiceNo(admissionNo);
    }

    public boolean insertAdvancePayment(AdvancePayment advancePayment) {

        boolean ret = true;
                //hdlAp.insertAdvanceReceiveHistory(advancePayment);
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public String selectTotalAmountForRefund(String account, String admissionNo) {
        return "";
                //hdlAp.selectTotalAmountForRefund(account, admissionNo);
    }

    public boolean updateDischargeRejectStatus(AdvancePayment selectedPatient) {

        String query = " UPDATE " + Database.DCMS.patientAdmission
                + " SET ORDER_STATUS_ID = " + Status.admitted
                + " \n WHERE ID = " + selectedPatient.getAdmissionNo();

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmissionHistory
                    + " SET ORDER_STATUS_ID = " + Status.admitted
                    + " \n WHERE ID = " + selectedPatient.getAdmissionNo();
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = ctlOrderhandler.insertOrderActions(selectedPatient.getCompleteOrderNo(),
                    selectedPatient.getOrderDetailId(), Status.rejected);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

//    public boolean updateTransactionType(AdvancePayment selectedPatient) {
//
//        boolean ret = hdlAp.insertTransactionHistory(selectedPatient);
//        if (ret) {
//            if (ret) {
//                String query = " UPDATE " + Database.DCMS.advanceReceiveHistory
//                        + " SET TRANSACTION_TYPE = " + selectedPatient.getTransactionTypeId()
//                        + " \n WHERE VOUCHER_NO = " + selectedPatient.getVoucherNo();
//                ret = Constants.dao.executeUpdate(query, false);
//            }
//        }
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        }
//        if (!ret) {
//            Constants.dao.rollBack();
//        }
//        return ret;
//    }

}
