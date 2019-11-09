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
                + "   GROUP BY IVD.DEPARTMENT_ID                \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PatientHospitalVisit setCompound = new PatientHospitalVisit();

            setCompound.setAdmissionNumber(admNo);
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
                + "   GROUP BY RFD.DEPARTMENT_ID        \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PatientHospitalVisit setCompound = new PatientHospitalVisit();

            setCompound.setAdmissionAmount(map.get("REFUND_AMOUNT").toString());
            setCompound.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            list.add(setCompound);
        }
        return list;
    }

    public boolean insertIpdDepartmentDetail(List<PatientHospitalVisit> listComp) {

        String[] columns = {Database.DCMS.ipdDepartmentWiseSummary,
            "ADMISSION_NO", "DEPARTMENT_ID", "ADMISSION_AMOUNT"};

        List lstInr = new ArrayList();
        for (int i = 0; i < listComp.size(); i++) {
            PatientHospitalVisit pat = listComp.get(i);
            HashMap map = new HashMap();
            map.put("ADMISSION_NO", "'" + pat.getAdmissionNumber() + "'");
            map.put("DEPARTMENT_ID", "'" + pat.getDepartmentId() + "'");
            map.put("ADMISSION_AMOUNT", "'" + pat.getAdmissionAmount() + "'");
            lstInr.add(map);
        }
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean updateIpdRefundDepDetail(List<PatientHospitalVisit> listCompounding) {
        boolean ret = true;

        for (int i = 0; i < listCompounding.size(); i++) {
            PatientHospitalVisit pat = listCompounding.get(i);

            String query
                    = " UPDATE " + Database.DCMS.ipdDepartmentWiseSummary + "\n"
                    + " SET REFUND_AMOUNT  = " + pat.getAdmissionAmount() + "\n"
                    + " WHERE ADMISSION_NO = '" + pat.getAdmissionNumber() + "'"
                    + " AND DEPARTMENT_ID = '" + pat.getDepartmentId() + "'";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public List<PatientHospitalVisit> selectAdmNo() {

        String[] columns = {"-", "ID"};
        String query = " SELECT ID FROM     \n"
                + Database.DCMS.patientAdmissionHistory 
                + " WHERE ADMITTED_DATE > SYSDATE - 365   \n";

        System.out.println(query);
        List<HashMap> selectAdm = Constants.dao.selectDatainList(query, columns);
        System.err.println("main list"+ selectAdm.size());
        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectAdm.size(); i++) {
            HashMap map = (HashMap) selectAdm.get(i);
            PatientHospitalVisit setAdmNo = new PatientHospitalVisit();
            setAdmNo.setAdmissionNumber(map.get("ID").toString());
            list.add(setAdmNo);
        }
        return list;
    }

    private boolean runProcess(List<PatientHospitalVisit> listAdmNo) {
        boolean ret = true;
        for (int i = 0; i < listAdmNo.size(); i++) {
            PatientHospitalVisit admNo = listAdmNo.get(i);
            ret = insertIpdDepartmentDetail(selectAdmPatientSDepummary(
                    admNo.getAdmissionNumber()));
            if (ret) {
                ret = updateIpdRefundDepDetail(selectAdmPatientRefundSummary(
                        admNo.getAdmissionNumber()));
            }
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        IpdDepWiseSummary ctl = new IpdDepWiseSummary();
        List<PatientHospitalVisit> lisatAdmNo = new ArrayList();
        
        lisatAdmNo.clear();
        lisatAdmNo = ctl.selectAdmNo();
        
        System.err.println("list sixe: " + lisatAdmNo.size());
        if (ctl.runProcess(lisatAdmNo)) {
            System.out.println("Process run successfully.");
        } else {
            System.err.println("Unable to run successfully!");
        }
    }
}
