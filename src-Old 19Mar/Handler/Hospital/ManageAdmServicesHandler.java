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

/**
 *
 * @author raheelansari
 */
public class ManageAdmServicesHandler {

    public List<ManageAdmissionServices> selectPatientAdmissions(String patientId) {

        String[] selectColumns = {"-", "PATIENT_ID", "FULL_NAME", "ADMISSION_NO",
            "AGE", "GENDER_ID", "GENDER_DESC", "WARD_ID", "WARD_DESC", "CLIENT_ID",
            "CLIENT_DESC", "PRIMARY_PHYSICIAN_ID", "PRIMARY_PHYSICIAN", "BED_ID",
            "BED_DESC", "DIAGNOSIS_REMARKS", "ADMITTED_DATE", "ADMITTED_BY",
            "ADMITTED_BY_NAME"};

        String query
                = "SELECT PAT.PATIENT_ID,                                   \n"
                + "       PAH.ID                   ADMISSION_NO,            \n"
                + "       PAH.PRIMARY_PHYSICIAN_ID,                         \n"
                + "       PRI.NAME                 PRIMARY_PHYSICIAN,       \n"
                + "       NVL(PAH.DIAGNOSIS_REMARKS, ' ') DIAGNOSIS_REMARKS,\n"
                + "       TO_CHAR(PAH.ADMITTED_DATE, 'DD-MON-YY HH12:MI:SS PM') ADMITTED_DATE,\n"
                + "       PAH.ADMITTED_BY,                                  \n"
                + "       USR.NAME                   ADMITTED_BY_NAME,      \n"
                + "       PAT.FULL_NAME,                                    \n"
                + "       trunc(months_between(sysdate,PAT.DOB)/12) AGE,    \n"
                + "       PAT.GENDER_ID,                                    \n"
                + "       GEN.DESCRIPTION          GENDER_DESC,             \n"
                + "       PAH.WARD_ID,                                      \n"
                + "       WRD.DESCRIPTION          WARD_DESC,               \n"
                + "       PAH.BED_ID,                                       \n"
                + "       BED.DESCRIPTION          BED_DESC,                \n"
                + "       PAT.CLIENT_ID,                                    \n"
                + "       CLI.DESCRIPTION          CLIENT_DESC              \n"
                + "  FROM " + Database.DCMS.patient + " PAT,                \n"
                + Database.DCMS.patientAdmissionHistory + " PAH,            \n"
                + Database.DCMS.definitionTypeDetail + " GEN,               \n"
                + Database.DCMS.users + " PRI,                              \n"
                + Database.DCMS.client + " CLI,                             \n"
                + Database.DCMS.ward + " WRD,                               \n"
                + Database.DCMS.bed + " BED,                                \n"
                + Database.DCMS.users + " USR                               \n"
                + " WHERE PAH.PATIENT_ID = '" + patientId + "'              \n"
                + "   AND PAT.PATIENT_ID = PAH.PATIENT_ID                   \n"
                + "   AND PAT.GENDER_ID = GEN.ID                            \n"
                + "   AND PAH.PRIMARY_PHYSICIAN_ID = PRI.USER_NAME          \n"
                + "   AND PAT.CLIENT_ID = CLI.ID                            \n"
                + "   AND PAH.WARD_ID = WRD.ID                              \n"
                + "   AND PAH.BED_ID = BED.ID                               \n"
                + "   AND PAH.ADMITTED_BY = USR.USER_NAME                   \n";

//        System.out.println(query);
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

    public List<ManageAdmissionServices> selectAdmissionWiseServices(String patientId,
            String admissionNo, String tableName) {
        String[] selectColumns = {"-", "INVOICE_BY", "INVOICE_DATE", "CPT_ID",
            "CPT_DESC", "PAYABLE_AMOUNT", "QUANTITY", "STORE_ID", "STORE_DESC"};

        String query
                = "SELECT USR.NAME INVOICE_BY, IVD.CPT_ID, "
                + "TO_CHAR(IVD.INVOICE_DATE, 'DD-MON-YY  HH12:MI PM') INVOICE_DATE,\n"
                + "CPT.DESCRIPTION CPT_DESC, IVD.PAYABLE_AMOUNT,            \n"
                + "NVL(IVD.QUANTITY, 0) QUANTITY, IVM.STORE_ID,             \n"
                + "STR.DESCRIPTION STORE_DESC                               \n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,          \n"
                + Database.DCMS.invoiceDetail + " IVD,                      \n"
                + Database.DCMS.store + " STR,                              \n";
        if (tableName.equalsIgnoreCase("CPT")) {
            query += Database.DCMS.CPT + " CPT,                             \n";
        } else {
            query += Database.DCMS.item + " CPT,                            \n";
        }
        query += Database.DCMS.users + " USR                                \n"
                + " WHERE IVM.PATIENT_ID = '" + patientId + "'              \n"
                + " AND IVM.ADMISSION_NO = '" + admissionNo + "'            \n"
                + "   AND IVM.INVOICE_NO = IVD.INVOICE_NO                   \n"
                + "   AND IVM.STORE_ID = STR.ID                             \n"
                + "   AND IVD.INVOICE_BY = USR.USER_NAME                    \n";
        if (tableName.equalsIgnoreCase("CPT")) {
            query += "AND IVD.CPT_ID = CPT.CPT_ID                           \n";
        } else {
            query += "AND IVD.CPT_ID = CPT.ID                               \n";
        }
        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ManageAdmissionServices> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ManageAdmissionServices setCompound = new ManageAdmissionServices();

            setCompound.setInvoicedBy(map.get("INVOICE_BY").toString());
            setCompound.setInvoiceDate(map.get("INVOICE_DATE").toString());
            setCompound.setCptId(map.get("CPT_ID").toString());
            setCompound.setCptDesc(map.get("CPT_DESC").toString());
            setCompound.setPrice(map.get("PAYABLE_AMOUNT").toString());
            setCompound.setInvoiceQuantity(map.get("QUANTITY").toString());
            setCompound.setStoreId(map.get("STORE_ID").toString());
            setCompound.setStoreDescription(map.get("STORE_DESC").toString());
            list.add(setCompound);
        }
        return list;
    }

    public List<ManageAdmissionServices> selectPatientInvoices(String patientId,
            String admissionNo) {

        String[] selectColumns = {"-", "INVOICE_BY", "INVOICE_NO", "INVOICE_DATE",
            "PAYABLE_AMOUNT", "COMPLETE_ORDER_NO", "LOCATION_ID", "LOC_DESC"};

        String query
                = " SELECT USR.NAME INVOICE_BY, IVM.INVOICE_NO, IVM.COMPLETE_ORDER_NO, \n"
                + " TO_CHAR(IVM.INVOICE_DATE, 'DD-MON-YY  HH12:MI:SS PM') INVOICE_DATE, \n"
                + " IVM.PAYABLE_AMOUNT, IVM.LOCATION_ID, LOC.DESCRIPTION  LOC_DESC \n"
                + " FROM " + Database.DCMS.invoiceMaster + " IVM,           \n"
                + Database.DCMS.location + " LOC,                           \n"
                + Database.DCMS.users + " USR                               \n"
                + " WHERE IVM.PATIENT_ID = '" + patientId + "'              \n"
                + " AND IVM.ADMISSION_NO = '" + admissionNo + "'            \n"
                + "   AND IVM.INVOICE_BY = USR.USER_NAME                    \n"
                + "   AND IVM.LOCATION_ID = LOC.ID                          \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ManageAdmissionServices> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ManageAdmissionServices setCompound = new ManageAdmissionServices();

            setCompound.setCON(map.get("COMPLETE_ORDER_NO").toString());
            setCompound.setInvoiceNo(map.get("INVOICE_NO").toString());
            setCompound.setInvoicedBy(map.get("INVOICE_BY").toString());
            setCompound.setInvoiceDate(map.get("INVOICE_DATE").toString());
            setCompound.setPrice(map.get("PAYABLE_AMOUNT").toString());
            setCompound.setLocationId(map.get("LOCATION_ID").toString());
            setCompound.setLocationDesc(map.get("LOC_DESC").toString());

            list.add(setCompound);
        }
        return list;
    }

    public List<ManageAdmissionServices> selectInvoiceDetail(String invoiceNo,
            String tableName) {

        String[] selectColumns = {"-", "INVOICE_BY", "CPT_DESC", "INVOICE_DATE",
            "PAYABLE_AMOUNT", "RECEIVED_AMOUNT", "INVOICE_CASH"};

        String query
                = " SELECT USR.NAME INVOICE_BY, CPT.DESCRIPTION CPT_DESC,       \n"
                + " TO_CHAR(IVD.INVOICE_DATE, 'DD-MON-YY HH12:MI:SS') INVOICE_DATE,\n"
                + " IVD.PAYABLE_AMOUNT, IVD.RECEIVED_AMOUNT, IVD.INVOICE_CASH \n                                     \n"
                + "  FROM " + Database.DCMS.invoiceMaster + " IVM,          \n"
                + "   " + Database.DCMS.invoiceDetail + " IVD,              \n";
        if (tableName.equalsIgnoreCase("CPT")) {
            query += Database.DCMS.CPT + " CPT,                        \n";
        } else {
            query += Database.DCMS.item + " CPT,                        \n";
        }

        query += Database.DCMS.users + " USR                               \n"
                + " WHERE IVM.INVOICE_NO = '" + invoiceNo + "'              \n"
                + " AND IVM.INVOICE_NO = IVD.INVOICE_NO                     \n"
                + " AND IVD.INVOICE_BY = USR.USER_NAME                      \n";
        if (tableName.equalsIgnoreCase("CPT")) {
            query += "AND IVD.CPT_ID = CPT.CPT_ID                  \n";
        } else {
            query += "AND IVD.CPT_ID = CPT.ID                  \n";
        }

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<ManageAdmissionServices> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            ManageAdmissionServices setCompound = new ManageAdmissionServices();

            setCompound.setInvoicedBy(map.get("INVOICE_BY").toString());
            setCompound.setInvoiceDate(map.get("INVOICE_DATE").toString());
            setCompound.setCptDesc(map.get("CPT_DESC").toString());
            setCompound.setPrice(map.get("PAYABLE_AMOUNT").toString());
            setCompound.setReceivedAmount(map.get("RECEIVED_AMOUNT").toString());
            setCompound.setInvoiceCash(map.get("INVOICE_CASH").toString());

            list.add(setCompound);
        }
        return list;
    }

    public boolean updateAdmissionNo(ManageAdmissionServices objRv, String tableName) {

        String query
                = " UPDATE " + tableName + "                                \n"
                + " SET  ADMISSION_NO ='" + objRv.getAdmissionNo() + "'      \n"
                + " WHERE COMPLETE_ORDER_NO = '" + objRv.getCON() + "'       \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateAdmissionDiagnisisRemarks(ManageAdmissionServices objRv) {

        String query
                = " UPDATE " + Database.DCMS.patientAdmissionHistory + "        \n"
                + " SET  DIAGNOSIS_REMARKS ='" + objRv.getDiagnosisRemarks() + "'\n"
                + " WHERE ID = " + objRv.getAdmissionNo() + "                    \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean admissionUpdateHistory(ManageAdmissionServices objRv) {

        String query
                = " INSERT INTO " + Database.DCMS.admissionUpdateHistory + " \n"
                + " (AUH.ID,AUH.WARD_ID,AUH.BED_ID,AUH.ORDER_STATUS_ID,      \n"
                + " AUH.REFERRING_PHYSICIAN_ID, AUH.PRIMARY_PHYSICIAN_ID,    \n"
                + " AUH.ADMISSION_TYPE_ID, AUH.ADMISSION_REMARKS,AUH.CRTD_BY,\n"
                + " AUH.CRTD_DATE, AUH.CRTD_TERMINAL_ID,AUH.ADMISSION_DIAGNOSIS,\n"
                + " AUH.DIAGNOSIS_REMARKS,AUH.PHARMACY_CREDIT,AUH.DIAGNOSTIC_CREDIT,"
                + " AUH.PHARMACY_SERVICE,AUH.VSIL )                          \n"
                + " SELECT PAH.ID,PAH.WARD_ID,PAH.BED_ID,PAH.ORDER_STATUS_ID,\n"
                + " PAH.REFERRING_PHYSICIAN_ID, PAH.PRIMARY_PHYSICIAN_ID,    \n"
                + " PAH.ADMISSION_TYPE_ID, PAH.ADMISSION_REMARKS,'           \n"
                + Constants.userId + "',  SYSDATE, '" + Constants.terminalId + "'"
                + "'" + objRv.getDiagnosisRemarks() + "',                    \n"
                + " PAH.DIAGNOSIS_REMARKS,PAH.PHARMACY_CREDIT,PAH.DIAGNOSTIC_CREDIT,\n"
                + " PAH.PHARMACY_SERVICE,PAH.VSIL                             \n"
                + "  FROM " + Database.DCMS.patientAdmissionHistory + " PAH  \n"
                + "  WHERE ID = '" + objRv.getAdmissionNo() + "'";
        return Constants.dao.executeUpdate(query, false);
    }
}
