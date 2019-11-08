/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import BO.OPD.PatientHospitalVisit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class IpdDepWiseSummary {

    public List<PatientHospitalVisit> selectAdmPatientSDepummary(String admNo) {

        String[] selectColumns = {"-", "DEPARTMENT_ID", "ADM_AMOUNT"};

        String query
                = " SELECT IVD.DEPARTMENT_ID, SUM(IVD.PAYABLE_AMOUNT) ADM_AMOUNT\n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,      \n"
                + Database.DCMS.invoiceDetail + " IVD                  \n"
                + " WHERE IVM.ADMISSION_NO = '" + admNo + "'  \n"
                + "   AND IVM.INVOICE_NO = IVD.INVOICE_NO               \n"
                + "   GROUP_BY IVD.DEPARTMENT_ID                \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PatientHospitalVisit setCompound = new PatientHospitalVisit();

            setCompound.setAdmissionAmount(map.get("ADM_AMOUNT").toString());
            setCompound.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            list.add(setCompound);
        }
        return list;
    }

    public List<PatientHospitalVisit> selectAdmPatientRefundSummary(String admNo) {

        String[] selectColumns = {"-", "DEPARTMENT_ID", "REFUND_AMOUNT"};

        String query
                = " SELECT RFD.DEPARTMENT_ID, NVL(SUM(RFD.REFUND_AMOUNT), 0) REFUND_AMOUNT\n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,      \n"
                + Database.DCMS.refundMaster + " RFM,                  \n"
                + Database.DCMS.refundDetail + " RFD                  \n"
                + " WHERE IVM.ADMISSION_NO = '" + admNo + "'  \n"
                + "   AND IVM.INVOICE_NO = RFM.INVOICE_NO               \n"
                + "   AND RFM.REFUND_NO = RFD.REFUND_NO               \n"
                + "   GROUP_BY RFD.DEPARTMENT_ID        \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PatientHospitalVisit setCompound = new PatientHospitalVisit();

            setCompound.setAdmissionAmount(map.get("ADM_AMOUNT").toString());
            setCompound.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            list.add(setCompound);
        }
        return list;
    }
    
    
}
