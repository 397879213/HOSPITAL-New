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
import utilities.Departments;

/**
 *
 * @author raheelansari
 */
public class DepWiseIpdBill {

    public List<PatientHospitalVisit> selectAdmNo() {

        String[] selectColumns = {"-", "ID"};

        String query
                = " SELECT ADMISSION_NO ID FROM         \n"
                + Database.DCMS.ltuPatientHistory + "   \n";
//                + " WHERE ROWNUM < 3                    \n";

//        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PatientHospitalVisit setCompound = new PatientHospitalVisit();

            setCompound.setAdmissionNumber(map.get("ID").toString());
            list.add(setCompound);
        }
        return list;
    }

    public List<PatientHospitalVisit> selectAdmPatientDepSummary(String admNo) {

        String[] selectColumns = {"-", "DEPARTMENT_ID", "ADM_AMOUNT"};

        String query
                = " SELECT IVD.DEPARTMENT_ID, SUM(IVD.PAYABLE_AMOUNT) ADM_AMOUNT\n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,      \n"
                + Database.DCMS.invoiceDetail + " IVD                   \n"
                + " WHERE IVM.ADMISSION_NO = '" + admNo + "'            \n"
                + "   AND IVM.INVOICE_NO = IVD.INVOICE_NO               \n"
                + " AND IVM.ADMISSION_NO != 0                           \n"
                + "   GROUP BY IVD.DEPARTMENT_ID                        \n";

//        System.out.println(query);
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

    public boolean updateDepWiseIpdBill(List<PatientHospitalVisit> listCompounding) {
        boolean ret = true;

        String colName[] = {"-", "RADIOLOGY", "PATHOLOGY", "PHARMACY", "CARDIOLOGY",
            "BLOOD_BANK", "INPATIENT", "NILGID", "DIALYSIS", "OT", "OUTSIDE"}; //, "LTU" ,"ER"

        for (int i = 0; i < listCompounding.size(); i++) {
            PatientHospitalVisit pat = listCompounding.get(i);
            setDepartment(pat);
            String query
                    = " UPDATE " + Database.DCMS.departmentWiseIpdBill + "\n"
                    + " SET " + colName[index] + "  = " + pat.getAdmissionAmount() + "\n"
                    + " WHERE ADMISSION_NO = '" + pat.getAdmissionNumber() + "'";
//            System.out.println(query);
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    private void setDepartment(PatientHospitalVisit pat) {
        index = 0;
//        System.err.println("\n Dep Id: " + pat.getDepartmentId());
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.radiology)) {
            index = 1;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.pathology)) {
            index = 2;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.Pharmacy)) {
            index = 3;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.cardiology)) {
            index = 4;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.bloodBank)) {
            index = 5;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.inpatient)) {
            index = 6;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.NILGID)) {
            index = 7;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.dialysis)) {
            index = 8;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.operationTheatre)) {
            index = 9;
        }
        if (pat.getDepartmentId().equalsIgnoreCase(Departments.outSide)) {
            index = 10;
        }
//        if (pat.getDepartmentId().equalsIgnoreCase(Departments.LiverTransplant)) {
//            index = 11;
//        }
//        if (pat.getDepartmentId().equalsIgnoreCase(Departments.emergency)) {
//            index = 12;
//        }
    }

    int index = 0;
    List<PatientHospitalVisit> listAdmNo = new ArrayList();

    private boolean runProcess() {
        boolean ret = true;
        listAdmNo = selectAdmNo();
        for (int i = 0; i < listAdmNo.size(); i++) {
            PatientHospitalVisit admNo = listAdmNo.get(i);
            ret = updateDepWiseIpdBill(
                    selectAdmPatientDepSummary(admNo.getAdmissionNumber()));
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
            System.out.println("Processing "+ (i+1) + " out of " + listAdmNo.size());
        }
        return ret;
    }

    public static void main(String[] args) {
        DepWiseIpdBill ctlProcess = new DepWiseIpdBill();
        if (ctlProcess.runProcess()) {
            System.out.println("Process Completed Sucessfully");
        } else {
            System.err.println("Error!!!");
        }
    }
}
