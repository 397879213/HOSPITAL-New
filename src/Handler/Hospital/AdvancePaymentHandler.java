/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handler.Hospital;

import BO.Hospital.AdvancePayment;
import BO.Hospital.ManageAdmissionServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class AdvancePaymentHandler {
    
    public List<AdvancePayment> selectAdmPatientDetail(String admissionNo, 
            String departmentId) {

        String[] selectColumns = {"-", "PATIENT_ID", "INVOICE_NO", "CPT_ID",
            "CPT_NAME", "PAYABLE_AMOUNT", "DEPARTMENT_ID", "DEPARTMENT", 
            "INVOICE_DATE"};

        String query
                = " SELECT IVM.PATIENT_ID, IVM.INVOICE_NO,              \n"
                + " IVD.CPT_ID, CPT.DESCRIPTION CPT_NAME,               \n"
                + " IVD.PAYABLE_AMOUNT, IVD.DEPARTMENT_ID,              \n"
                + " TO_CHAR(IVD.INVOICE_DATE, 'DD-MON-YY') INVOICE_DATE,\n"
                + " DEP.DESCRIPTION DEPARTMENT                          \n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,      \n"
                + Database.DCMS.invoiceDetail + " IVD,                  \n"
                + Database.DCMS.definitionTypeDetail + " DEP,           \n"
                + Database.DCMS.CPT + " CPT                             \n"
                + " WHERE IVM.ADMISSION_NO = '" + admissionNo + "'  \n"
                + "   AND IVD.DEPARTMENT_ID = " + departmentId + "  \n"
                + "   AND IVM.INVOICE_NO = IVD.INVOICE_NO               \n"
                + "   AND IVD.DEPARTMENT_ID = DEP.ID                    \n"
                + "   AND IVD.CPT_ID = CPT.CPT_ID                       \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<AdvancePayment> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            AdvancePayment setCompound = new AdvancePayment();
            
            setCompound.setPatientId(map.get("PATIENT_ID").toString());
            setCompound.setInvoiceNo(map.get("INVOICE_NO").toString());
            setCompound.setCptId(map.get("CPT_ID").toString());
            setCompound.setCptDescription(map.get("CPT_NAME").toString());
            setCompound.setInvoiceDate(map.get("INVOICE_DATE").toString());
            setCompound.setPayableAmount(map.get("PAYABLE_AMOUNT").toString());
            setCompound.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            setCompound.setDepartmentDescription(map.get("DEPARTMENT").toString());
            list.add(setCompound);
        }
        return list;
    }
}
