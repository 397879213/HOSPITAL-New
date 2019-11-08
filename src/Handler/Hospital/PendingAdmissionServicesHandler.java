/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Hospital;

import BO.Hospital.ManageAdmissionServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

/**
 *
 * @author raheelansari
 */
public class PendingAdmissionServicesHandler {

    public List<ManageAdmissionServices> selectAdmittedPatient(String patientId) {

        String[] selectColumns = {"-", "PATIENT_ID", "FULL_NAME", "ADMISSION_NO",
            "AGE", "GENDER_ID", "GENDER_DESC", "WARD_ID", "WARD_DESC", "CLIENT_ID",
            "CLIENT_DESC", "PRIMARY_PHYSICIAN_ID", "PRIMARY_PHYSICIAN", "BED_ID",
            "BED_DESC", "DIAGNOSIS_REMARKS", "ADMITTED_DATE", "ADMITTED_BY",
            "ADMITTED_BY_NAME"};

        String query
                = "SELECT PAT.PATIENT_ID,\n"
                + "       PAH.ID                   ADMISSION_NO,                \n"
                + "       PAH.PRIMARY_PHYSICIAN_ID,                             \n"
                + "       PRI.NAME                 PRIMARY_PHYSICIAN,           \n"
                + "       NVL(PAH.DIAGNOSIS_REMARKS, ' ') DIAGNOSIS_REMARKS,    \n"
                + " TO_CHAR(PAH.ADMITTED_DATE, 'DD-MON-YY HH12:MI PM') ADMITTED_DATE,\n"
                + "       PAH.ADMITTED_BY,                                      \n"
                + "       USR.NAME                   ADMITTED_BY_NAME,          \n"
                + "       PAT.FULL_NAME,                                        \n"
                + "       trunc(months_between(sysdate,PAT.DOB)/12) AGE,        \n"
                + "       PAT.GENDER_ID,                                        \n"
                + "       GEN.DESCRIPTION          GENDER_DESC,                 \n"
                + "       PAH.WARD_ID,                                          \n"
                + "       WRD.DESCRIPTION          WARD_DESC,                   \n"
                + "       PAH.BED_ID,                                           \n"
                + "       BED.DESCRIPTION          BED_DESC,                    \n"
                + "       PAT.CLIENT_ID,                                        \n"
                + "       CLI.DESCRIPTION          CLIENT_DESC                  \n"
                + "  FROM " + Database.DCMS.patient + " PAT,                    \n"
                + Database.DCMS.patientAdmission + " PAH,                       \n"
                + Database.DCMS.definitionTypeDetail + " GEN,                   \n"
                + Database.DCMS.users + " PRI,                                  \n"
                + Database.DCMS.client + " CLI,                                 \n"
                + Database.DCMS.ward + " WRD,                                   \n"
                + Database.DCMS.bed + " BED,                                    \n"
                + Database.DCMS.users + " USR                                   \n"
                + " WHERE PAH.PATIENT_ID = '" + patientId + "'                  \n"
                + "   AND PAT.PATIENT_ID = PAH.PATIENT_ID                       \n"
                + "   AND PAT.GENDER_ID = GEN.ID                                \n"
                + "   AND PAH.PRIMARY_PHYSICIAN_ID = PRI.USER_NAME              \n"
                + "   AND PAT.CLIENT_ID = CLI.ID                                \n"
                + "   AND PAH.WARD_ID = WRD.ID                                  \n"
                + "   AND PAH.BED_ID = BED.ID                                   \n"
                + "   AND PAH.ADMITTED_BY = USR.USER_NAME                       \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ManageAdmissionServices> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ManageAdmissionServices setCompound = new ManageAdmissionServices();

            setCompound.setPatientId(map.get("PATIENT_ID").toString());
            setCompound.setFullName(map.get("FULL_NAME").toString());
            setCompound.setAdmissionNo(map.get("ADMISSION_NO").toString());
            setCompound.setAge(map.get("AGE").toString());
            setCompound.setGenderId(map.get("GENDER_ID").toString());
            setCompound.setGenderDesc(map.get("GENDER_DESC").toString());
            setCompound.setClientId(map.get("CLIENT_ID").toString());
            setCompound.setClientDesc(map.get("CLIENT_DESC").toString());
            setCompound.setPrimaryPhysicianId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            setCompound.setPrimaryPhysicianName(map.get("PRIMARY_PHYSICIAN").toString());
            setCompound.setWardId(map.get("WARD_ID").toString());
            setCompound.setWardDesc(map.get("WARD_DESC").toString());
            setCompound.setBedId(map.get("BED_ID").toString());
            setCompound.setBedDesc(map.get("BED_DESC").toString());
            setCompound.setDiagnosisRemarks(map.get("DIAGNOSIS_REMARKS").toString());
            setCompound.setAdmissionDate(map.get("ADMITTED_DATE").toString());
            setCompound.setAdmittedBy(map.get("ADMITTED_BY").toString());
            setCompound.setAdmittedByName(map.get("ADMITTED_BY_NAME").toString());

            list.add(setCompound);
        }
        return list;
    }

    public List<ManageAdmissionServices> selectPendingServices(String admissionNo,
            String departmentId, String tableName) {

        String[] cols = {"-", "INVOICED_BY", "CPT_DESC", "INVOICE_DATE",
            "PAYABLE_AMOUNT", "CON", "DEPARTMENT_ID", "DEPARTMENT"};

        String query
                = " SELECT CPT.DESCRIPTION CPT_DESC, IVM.PAYABLE_AMOUNT,\n"
                + " USR.NAME INVOICED_BY, IVM.COMPLETE_ORDER_NO CON,    \n"
                + " TO_CHAR(IVD.INVOICE_DATE, 'DD-MON-YY HH12:MI AM') INVOICE_DATE,\n"
                + " IVD.DEPARTMENT_ID, DEP.DESCRIPTION DEPARTMENT FROM  \n"
                + Database.DCMS.CPT + " CPT,                            \n"
                + Database.DCMS.orderDetail + " ODD,                    \n"
                + Database.DCMS.invoiceDetail + " IVD,                  \n"
                + Database.DCMS.invoiceMaster + " IVM,                  \n"
                + Database.DCMS.definitionTypeDetail + " DEP,           \n"
                + Database.DCMS.users + " USR                           \n"
                + " WHERE IVM.ADMISSION_NO = " + admissionNo + "        \n";
        if (departmentId.length() != 0) {
            query += "   AND IVD.DEPARTMENT_ID = " + departmentId + "   \n";
        }
        query += "  AND IVD.STATUS_ID = " + Status.invoiced + "         \n"
                + " AND IVD.REFUND_STATUS = 'Y'                         \n"
                + " AND IVM.INVOICE_NO = IVD.INVOICE_NO                 \n"
                + "AND IVD.CPT_ID = CPT.CPT_ID                          \n"
                + " AND IVD.DEPARTMENT_ID = DEP.ID                      \n"
                + " AND IVD.COMPLETE_ORDER_NO = ODD.COMPLETE_ORDER_NO   \n"
                + " AND IVD.ORDER_DETAIL_ID = ODD.ORDER_DETAIL_ID       \n"
                + " AND IVM.INVOICE_BY = USR.USER_NAME";

        //System.out.println(query);
        List<HashMap> listRecords = Constants.dao.selectDatainList(query, cols);

        List<ManageAdmissionServices> listServices = new ArrayList();
        for (int i = 0; i < listRecords.size(); i++) {
            HashMap map = listRecords.get(i);
            ManageAdmissionServices service = new ManageAdmissionServices();
            service.setInvoicedBy(map.get("INVOICED_BY").toString());
            service.setInvoiceDate(map.get("INVOICE_DATE").toString());
            service.setCptDesc(map.get("CPT_DESC").toString());
            service.setPrice(map.get("PAYABLE_AMOUNT").toString());
            service.setCON(map.get("CON").toString());
            service.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            service.setDepartment(map.get("DEPARTMENT").toString());
            listServices.add(service);
        }
        return listServices;
    }

    public String selectDepartmentStatus(String CON, String tableName) {

        String[] selectColumns = {"-", "STATUS"};

        String query
                = "SELECT STS.DESCRIPTION STATUS                             \n"
                + "   FROM " + tableName + " PRM,    \n"
                + Database.DCMS.definitionTypeDetail + " STS                  \n"
                + "  WHERE PRM.COMPLETE_ORDER_NO = '" + CON + "'               \n"
                + "    AND PRM.ORDER_STATUS_ID = STS.ID                      \n";

        List<HashMap> listMap = Constants.dao.selectDatainList(query, selectColumns);

        return listMap.get(0).get("STATUS").toString();
    }
    
    public List<ManageAdmissionServices> selectAdmPatientDetail(String admissionNo, 
            String departmentId) {

        String[] selectColumns = {"-", "PATIENT_ID", "INVOICE_NO", "CPT_ID",
            "CPT_NAME", "PAYABLE_AMOUNT", "DEPARTMENT_ID", "DEPARTMENT", 
            "INVOICE_DATE"};

        String query
                = " SELECT IVM.PATIENT_ID, IVM.INVOICE_NO,             \n"
                + " IVD.CPT_ID, CPT.DESCRIPTION CPT_NAME,         \n"
                + " IVD.PAYABLE_AMOUNT, IVD.DEPARTMENT_ID, "
                + " TO_CHAR(IVD.INVOICE_DATE, 'DD-MON-YY') INVOICE_DATE, "
                + " DEP.DESCRIPTION DEPARTMENT       \n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,      \n"
                + Database.DCMS.invoiceDetail + " IVD,                  \n"
                + Database.DCMS.definitionTypeDetail + " DEP,                  \n"
                + Database.DCMS.CPT + " CPT                             \n"
                + " WHERE PAH.IVM.ADMISSION_NO = '" + admissionNo + "'  \n"
                + " WHERE PAH.IVM.DEPARTMENT_ID = '" + departmentId + "'\n"
                + "   AND IVM.INVOICE_NO = IVD.INVOICE_NO               \n"
                + "   AND IVD.DEPARTMENT_ID = DEP.ID                    \n"
                + "   AND IVD.CPT_ID = CPT.CPT_ID                       \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ManageAdmissionServices> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ManageAdmissionServices setCompound = new ManageAdmissionServices();
            
            setCompound.setPatientId(map.get("PATIENT_ID").toString());
            setCompound.setInvoiceNo(map.get("INVOICE_NO").toString());
            setCompound.setCptId(map.get("CPT_ID").toString());
            setCompound.setCptDesc(map.get("CPT_NAME").toString());
            setCompound.setInvoiceDate(map.get("INVOICE_DATE").toString());
            setCompound.setPrice(map.get("PAYABLE_AMOUNT").toString());
            setCompound.setDepartmentId(map.get("DEPARTMENT_ID").toString());
            setCompound.setDepartment(map.get("DEPARTMENT").toString());
            list.add(setCompound);
        }
        return list;
    }
    
}
