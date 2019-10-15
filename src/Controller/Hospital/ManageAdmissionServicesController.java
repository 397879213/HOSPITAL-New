package Controller.Hospital;

import BO.Hospital.ManageAdmissionServices;
import Handler.Hospital.ManageAdmServicesHandler;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.TypeDetailId;

public class ManageAdmissionServicesController {

    ManageAdmServicesHandler hdlManageAdmServices = new ManageAdmServicesHandler();

    public List<ManageAdmissionServices> selectPatientAdmissions(String patientId) {
        return hdlManageAdmServices.selectPatientAdmissions(patientId);
    }

    public List<ManageAdmissionServices> selectAdmissionWiseServices(String patientId,
            String admissionNo, String tableName) {
        return hdlManageAdmServices.selectAdmissionWiseServices(patientId, 
                admissionNo, tableName);
    }

    public List<ManageAdmissionServices> selectPatientInvoices(String patientId,
            String admissionNo) {
        return hdlManageAdmServices.selectPatientInvoices(patientId, admissionNo);
    }

    public List<ManageAdmissionServices> selectInvoiceDetail(String invoiceNo,
            String tableName) {
        return hdlManageAdmServices.selectInvoiceDetail(invoiceNo, tableName);
    }

    public boolean updateAdmissionNo(ManageAdmissionServices service) {

        String cols[] = {"", "TOTAL_CASH"};
        String query = "SELECT SUM(INVOICE_CASH) TOTAL_CASH FROM "
                + Database.DCMS.invoiceDetail
                + " WHERE INVOICE_NO = '" + service.getInvoiceNo() + "'";

        List<HashMap> list = Constants.dao.selectData(query, cols);
        String totalCash = list.get(0).get("TOTAL_CASH").toString();
        boolean ret = true;

        if (ret && Integer.parseInt(totalCash) > 0) {
            GenerateKeys key = new GenerateKeys();
            String voucherNo = key.generateVoucherNo();
            if (key.updateKey(Keys.voucher)) {
                ret = Constants.dao.commitTransaction();
            }
            if (ret) {
//                query = " INSERT INTO " + Database.DCMS.advanceReceiveHistory
//                        + " (VOUCHER_NO, PATIENT_ID, AMOUNT, COMMENTS, "
//                        + " LOCATION_ID, CRTD_DATE, CRTD_BY, CRTD_TERMINAL_ID, "
//                        + " ADMISSION_NO, ACCOUNT, IS_AVAILABLE, TRANSACTION_TYPE)"
//                        + " SELECT '" + voucherNo + "',  '"+ service.getPatientId() +"',"
//                        + totalCash +",'SERVICES CHARGES', '"+ Constants.locationId +"',"
//                        + "'"+ service.getInvoiceDate() +"', '"+ service.getInvoicedBy() +"',"
//                        + "'"+ service.get +"', '"+ service.getAdmissionNo() +"',"
//                        + "'By Sir', 'Y', '61' FROM "
//                        + Database.DCMS.invoiceMaster
//                        + " WHERE INVOICE_NO = '" + service.getInvoiceNo() + "'";
//                ret = Constants.dao.executeUpdate(query, false);
            }
        }
        if (ret) {
            query
                    = " UPDATE " + Database.DCMS.invoiceMaster + "       \n"
                    + " SET ADMISSION_NO ='" + service.getAdmissionNo() + "',\n"
                    + " INVOICE_TIME_CASH =0,                            \n"
                    + " PAYMENT_MODE_ID = " + TypeDetailId.inpatientCreditInvoice + " \n"
                    + " WHERE INVOICE_NO = '" + service.getInvoiceNo() + "'   \n";
            ret = Constants.dao.executeUpdate(query, false);

        }
        if (ret) {
            query
                    = " UPDATE " + Database.DCMS.invoiceDetail + "          \n"
                    + " SET INVOICE_CASH ='" + totalCash + "'               \n"
//                    + " PAYMENT_MODE_ID = " + TypeDetailId.inpatientCreditInvoice + " \n"
                    + " WHERE INVOICE_NO = '" + service.getInvoiceNo() + "' \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateAdmissionDiagnisisRemarks(ManageAdmissionServices objRv) {
        boolean ret = hdlManageAdmServices.updateAdmissionDiagnisisRemarks(objRv);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
