/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler;

import BO.StudyData;
import java.util.HashMap;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

/**
 *
 * @author raheelansari
 */
public class CancelOrderHandler {
    
    
    public Vector<StudyData> searchAdmissionCancelOrders(String admissionNo,
            String itemTable) {

        String[] columns = {"-", "PATIENT_ID", "NAME", "CONTACT_NO", "GENDER",
            "AGE", "STATUS", "CPT_ID", "SECTION", "CPT", "COMPLETE_ORDER_NO",
            "ORDER_DETAIL_ID", "ORD_DTE", "BALANCE_AMOUNT", "RECEIVED_AMOUNT",
            "TOTAL_AMOUNT", "PAYABLE_AMOUNT", "NET_DISCOUNT", "CPT_PRICE",
            "INVOICE_NO", "DEPARTMENT", "DEPT_ID", "REFERRED_BY", "LOCATION",
            "PAYMENT_MODE_ID", "REPORT_PENDING_AMOUNT", "CANCEL_REQ_BY",
            "CANCEL_REQ_DATE", "CANCEL_REQ_TERMINAL", "CANCEL_REQ_REMARKS",
            "INVOICE_DATE", "INVOICE_BY", "ORDER_BY", "CLIENT_NAME",
            "ORDER_STATUS_ID", "CANCEL_REQUEST_TYPE", "CANCEL_RETURN_ID",
            "DISPENSE_QTY", "RETURN_QTY", "PERFOMRING"};

        String query
                = "  SELECT PAT.PATIENT_ID PATIENT_ID,                      \n"
                + "  PAT.FULL_NAME NAME,                                    \n"
                + "  PAT.CONTACT_NO CONTACT_NO,                             \n"
                + "  GEN.DESCRIPTION GENDER,                                \n"
                + "  ROUND(MONTHS_BETWEEN(NVL(PAT.DOB,SYSDATE),PAT.DOB )/12) AGE, \n"
                + "  SAT.DESCRIPTION STATUS,                                \n"
                + "  OD.ITEM_ID CPT_ID,                                     \n"
                + "  OD.DEPARTMENT_ID DEPT_ID ,                             \n"
                + "  OD.CANCEL_RETURN_ID   ,                                \n"
                + "  OD.QUANTITY RETURN_QTY,                                \n"
                + "  OD.ORDER_STATUS_ID ORDER_STATUS_ID ,                   \n"
                + "  CRT.DESCRIPTION CANCEL_REQUEST_TYPE,                   \n "
                + "  LOC.DESCRIPTION LOCATION,                              \n"
                + "  IVD.SECTION_ID SECTION,                                \n"
                + "  IVD.PRICE CPT_PRICE,                                   \n"
                + "  IVD.QUANTITY DISPENSE_QTY,                             \n"
                + "  OD.CRTD_BY CANCEL_REQ_BY,                              \n"
                + "  TO_CHAR(OD.CRTD_DATE,'DD-MON-YY HH24:MI:SS')CANCEL_REQ_DATE, \n"
                + "  OD.CRTD_TERMINAL_ID CANCEL_REQ_TERMINAL,               \n"
                + "  OD.CANCEL_REQUEST_REMARKS CANCEL_REQ_REMARKS,          \n"
                + "  ITM.DESCRIPTION CPT,                                   \n"
                + "  CLT.DESCRIPTION CLIENT_NAME,                           \n"
                + "  OD.COMPLETE_ORDER_NO  COMPLETE_ORDER_NO,               \n"
                + "  OD.ORDER_DETAIL_ID ORDER_DETAIL_ID,                    \n"
                + "  NVL(TO_CHAR(OD.CRTD_DATE, 'DD-MON-YY HH24:MI:SS'),'DATE')ORD_DTE,\n"
                + "  NVL(IMS.BALANCE_AMOUNT, 0)  BALANCE_AMOUNT,            \n"
                + "  NVL(IMS.RECEIVED_AMOUNT, 0) RECEIVED_AMOUNT,           \n"
                + "  NVL(IMS.TOTAL_AMOUNT, 0)    TOTAL_AMOUNT,              \n"
                + "  NVL(IMS.PAYABLE_AMOUNT, 0)  PAYABLE_AMOUNT,            \n"
                + "  NVL(IMS.NET_DISCOUNT, 0)    NET_DISCOUNT,              \n"
                + "  IMS.REPORT_PENDING_AMOUNT   REPORT_PENDING_AMOUNT,     \n"
                + "  IMS.INVOICE_NO INVOICE_NO,                             \n"
                + "  IMS.INVOICE_BY INVOICE_BY,                             \n"
                + "  TO_CHAR(IMS.INVOICE_DATE, 'DD-MON-YY HH24:MI PM') INVOICE_DATE,   \n"
                + "  IMS.PAYMENT_MODE_ID PAYMENT_MODE_ID,                   \n"
                + "  DEP.DESCRIPTION DEPARTMENT ,                           \n"
                + "  PER.NAME PERFOMRING,                                   \n"
                + "  MAS.ORDER_BY ORDER_BY,                                 \n"
                + "  DOC.DOCTOR_NAME REFERRED_BY                            \n"
                + "  FROM \n"
                + Database.DCMS.patient + " PAT ,                           \n"
                + Database.DCMS.gender + " GEN ,                            \n"
                + Database.DCMS.orderMaster + " MAS ,                       \n"
                + itemTable + " ITM,                                        \n"
                + Database.DCMS.doctor + " DOC ,                            \n"
                + Database.DCMS.appStatus + " SAT ,                         \n"
                + Database.DCMS.client + " CLT ,                            \n"
                + Database.DCMS.invoiceMaster + "   IMS ,                   \n"
                + Database.DCMS.invoiceDetail + "   IVD ,                   \n"
                + Database.DCMS.users + "           PER ,                   \n"
                + Database.DCMS.department + "      DEP ,                   \n"
                + Database.DCMS.location + " LOC ,                          \n"
                + Database.DCMS.definitionTypeDetail + " CRT,               \n"
                + Database.DCMS.cancelReturnDetail + " OD                   \n"
                + "  WHERE IMS.ADMISSION_NO = " + admissionNo + "           \n"
                + "  AND OD.ORDER_STATUS_ID IN (" + Status.refund + ","
                + Status.cancelRequest +")                                  \n"
                + "  AND PAT.PATIENT_ID = MAS.PATIENT_ID                    \n"
                + "  AND PAT.GENDER_ID = GEN.ID                             \n"
                + "  AND NVL(OD.CANCEL_REQUEST_TYPE_ID ,51) = CRT.ID        \n"
                + "  AND NVL(IVD.PERFORMING_PHYSICIAN_ID ,'GENERAL') = PER.USER_NAME \n"
                + "  AND MAS.LOCATION_ID = LOC.ID                           \n"
                + "  AND MAS.CLIENT_ID = CLT.ID                             \n"
                + "  AND OD.ORDER_STATUS_ID = SAT.ID                        \n"
                + "  AND DEP.ID = OD.DEPARTMENT_ID                          \n"
                + "  AND MAS.REFERRING_DOCTOR_ID = DOC.DOCTOR_ID            \n"
                + "  AND MAS.COMPLETE_ORDER_NO = OD.COMPLETE_ORDER_NO       \n"
                + "  AND IMS.COMPLETE_ORDER_NO = MAS.COMPLETE_ORDER_NO      \n"
                + "  AND IMS.INVOICE_NO = IVD.INVOICE_NO                    \n"
                + "  AND IVD.COMPLETE_ORDER_NO = OD.COMPLETE_ORDER_NO       \n"
                + "  AND IVD.ORDER_DETAIL_ID =   OD.ORDER_DETAIL_ID         \n"
                + "  AND IVD.REFUND_STATUS = 'Y'                            \n";

        if (itemTable.equalsIgnoreCase(Database.DCMS.CPT)) {
            query += "  AND ITM.CPT_ID = OD.ITEM_ID                      \n";
        }
        if (itemTable.equalsIgnoreCase(Database.DCMS.item)) {
            query += " AND ITM.ID = OD.ITEM_ID                          \n";
        }
        query += "  ORDER BY  ORDER_DATE DESC ";

        return setCancelOrderList(Constants.dao.selectData(query, columns));

    }




public Vector setCancelOrderList(Vector vec) {

        Vector orders = new Vector();
        for (int i = 0; i < vec.size(); i++) {
            StudyData data = new StudyData();
            HashMap map = (HashMap) vec.get(i);
            data.setPatientId((String) map.get("PATIENT_ID"));
            data.setPatientName((String) map.get("NAME"));
            data.setContactNo((String) map.get("CONTACT_NO"));
            data.setGender((String) map.get("GENDER"));
            data.setAge((String) map.get("AGE"));
            data.setPaymentModeId((String) map.get("PAYMENT_MODE_ID"));
            data.setOrderStatus((String) map.get("STATUS"));
            data.setCptId((String) map.get("CPT_ID"));
            data.setCptPrice((String) map.get("CPT_PRICE"));
            data.setDispenseQuantity(Integer.parseInt((String) map.get("DISPENSE_QTY")));
            data.setReturnQuantity(Integer.parseInt((String) map.get("RETURN_QTY")));
            data.setCpt((String) map.get("CPT"));
            data.setSectionId((String) map.get("SECTION"));
            data.setCON((String) map.get("COMPLETE_ORDER_NO"));
            data.setOrderDetailId((String) map.get("ORDER_DETAIL_ID"));
            data.setOrderDate((String) map.get("ORD_DTE"));
            data.setPerformBy((String) map.get("PERFOMRING")); //PERFORMING PHYSICIANA
            data.setOrderStatusId((String) map.get("ORDER_STATUS_ID"));
            data.setBalanceAmount((String) map.get("BALANCE_AMOUNT"));
            data.setReceivedAmount((String) map.get("RECEIVED_AMOUNT"));
            data.setTotalAmount((String) map.get("TOTAL_AMOUNT"));
            data.setPayableAmount((String) map.get("PAYABLE_AMOUNT"));
            data.setNetDiscount((String) map.get("NET_DISCOUNT"));
            data.setInvoiceNo((String) map.get("INVOICE_NO"));
            data.setDepartmentDescription((String) map.get("DEPARTMENT"));
            data.setDepartmentId((String) map.get("DEPT_ID"));
            data.setReferredBy((String) map.get("REFERRED_BY"));
            data.setReportBalanceAmount((String) map.get("REPORT_PENDING_AMOUNT"));
            data.setLocationDescription((String) map.get("LOCATION"));
            data.setReportingTime((String) map.get("REPORTING_TIME"));
            data.setClientName((String) map.get("CLIENT_NAME"));
            data.setCancelRequestBy((String) map.get("CANCEL_REQ_BY"));
            data.setCancelRequestDate((String) map.get("CANCEL_REQ_DATE"));
            data.setCancelRequestRemarks((String) map.get("CANCEL_REQ_REMARKS"));
            data.setCancelRequestTerminal((String) map.get("CANCEL_REQ_TERMINAL"));
            data.setInvoiceBy((String) map.get("INVOICE_BY"));
            data.setInvoiceDate((String) map.get("INVOICE_DATE"));
            data.setOrderBy((String) map.get("ORDER_BY"));
            data.setCancelRequestType((String) map.get("CANCEL_REQUEST_TYPE"));
            data.setCancelReturnId((String) map.get("CANCEL_RETURN_ID"));

            orders.add(data);
        }
        return orders;
    }

}
