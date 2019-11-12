/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.LTU;

import BO.LTU.DialysisBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author raheelansari
 */
public class HandlerTest {

    public void num() {
        int num = 3;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("zic zac");
        } else {
            if (num % 3 == 0) {
                System.out.println("zic");
            }

            if (num % 5 == 0) {
                System.out.println("zac");
            }
        }
    }

    public boolean insertMaster(DialysisBO objSave) {

        String columns[] = {Database.DCMS.dialysisItemDetail, "ORDER_TYPE_ID",
            "ORDER_NO", "LOCATION_ID", "COMPLETE_ORDER_NO", "PATIENT_ID", "ORDER_DATE",
            "INHOUSE_DOCTOR_ID", "REFERRING_DOCTOR_ID", "TRN_DATE", "ORDER_BY",
            "TERMINAL_ID", "MOBILITY_STATUS_ID", "ORDER_LOCATION_ID", "USER_LOCATION_ID",
            "CUSTOMER_ID", "ADMISSION_NO", "CLIENT_ID", "MANUAL_PATIENT_ID",
            "ORG_ID", "PRIORITY"};

        HashMap insertMap = new HashMap();
        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo() + "'");
        insertMap.put("ORDER_TYPE_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ORDER_NO", "'" + objSave.getItemId() + "'");
        insertMap.put("LOCATION_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ORDER_DATE", "'" + objSave.getItemId() + "'");
        insertMap.put("INHOUSE_DOCTOR_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("REFERRING_DOCTOR_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ORDER_BY", "'" + Constants.userId + "'");
        insertMap.put("TRN_DATE", "SYSDATE");
        insertMap.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
        insertMap.put("MOBILITY_STATUS_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ORDER_LOCATION_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("USER_LOCATION_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("CUSTOMER_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ADMISSION_NO", "'" + objSave.getItemId() + "'");
        insertMap.put("CLIENT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("MANUAL_PATIENT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ORG_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("PRIORITY", "'" + objSave.getItemId() + "'");

        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public boolean insertDeatail(DialysisBO objSave) {

        String columns[] = {Database.DCMS.dialysisItemDetail, "COMPLETE_ORDER_NO",
            "ORDER_DETAIL_ID", "ORDER_STATUS_ID", "CPT_ID", "URGENT", "PATIENT_ID",
            "REPORT_DATE", "PRICE", "TRN_DATE", "USER_ID", "", "TERMINAL_ID",
            "CPT_REMARKS", "DEPARTMENT_ID", "SECTION_ID", "HISTORY_REQUIRED",
            "CONSULTANCY_ID", "PERFORMING_PHYSICIAN_SHARE", "PERFORMING_CONTRACT_ID",
            "REPORT_NAME", "PERFORMING_PHYSICIAN_ID", "QUANTITY", "INVOICED"};

        HashMap insertMap = new HashMap();
        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo() + "'");
        insertMap.put("ORDER_DETAIL_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("ORDER_STATUS_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("CPT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("URGENT", "'" + objSave.getItemId() + "'");
        insertMap.put("PATIENT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("REPORT_DATE", "'" + objSave.getItemId() + "'");
        insertMap.put("PRICE", "'" + objSave.getItemId() + "'");
        insertMap.put("TRN_DATE", "SYSDATE");
        insertMap.put("USER_ID", "'" + Constants.userId + "'");
        insertMap.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
        insertMap.put("CPT_REMARKS", "'" + objSave.getItemId() + "'");
        insertMap.put("DEPARTMENT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("SECTION_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("HISTORY_REQUIRED", "'" + objSave.getItemId() + "'");
        insertMap.put("CONSULTANCY_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("PERFORMING_PHYSICIAN_SHARE", "'" + objSave.getItemId() + "'");
        insertMap.put("PERFORMING_CONTRACT_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("REPORT_NAME", "'" + objSave.getItemId() + "'");
        insertMap.put("PERFORMING_PHYSICIAN_ID", "'" + objSave.getItemId() + "'");
        insertMap.put("QUANTITY", "'" + objSave.getItemId() + "'");
        insertMap.put("INVOICED", "'" + objSave.getItemId() + "'");

        List lstInr = new ArrayList();
        lstInr.add(insertMap);
        return Constants.dao.insertData(lstInr, columns);
    }

    public String selectMaster(String admNo) {

        String[] selectColumns = {"-", "ORDER_TYPE_ID", "ORDER_NO", "LOCATION_ID",
            "LOC_DESCRIPTION", "COMPLETE_ORDER_NO", "PATIENT_ID", "ORDER_DATE", 
            "INHOUSE_DOCTOR_ID", "INHOUSE_DOCTOR_NAME", "REFERRING_DOCTOR_ID",  
            "TRN_DATE", "ORDER_BY", "ORDER_PERSON", "TERMINAL_ID", "MOBILITY_STATUS_ID",
            "ORDER_LOCATION_ID", "ORDER_LOCATION_DESC", "USER_LOCATION_ID", 
            "USER_LOCATION_DESC", "CUSTOMER_ID", "ADMISSION_NO", "CLIENT_ID", 
            "CLIENT_NAME","MANUAL_PATIENT_ID", "ORG_ID", "PRIORITY"};
 //"REFERRING_DOCTOR_NAME",
        String query
                = "SELECT OM.ORDER_TYPE_ID,                             \n"
                + "       OM.ORDER_NO,                                  \n"
                + "       OM.LOCATION_ID,                               \n"
                + "       LOC.DESCRIPTION LOC_DESCRIPTION,              \n"
                + "       OM.COMPLETE_ORDER_NO,                         \n"
                + "       OM.PATIENT_ID,                                \n"
                + "       TO_CHAR(OM.ORDER_DATE, 'DD-MON-YY HH24:MI:SS') ORDER_DATE,\n"
                + "       OM.INHOUSE_DOCTOR_ID,                         \n"
                + "       IHD.NAME INHOUSE_DOCTOR_NAME,                 \n"
                + "       OM.REFERRING_DOCTOR_ID,                       \n"
                + "       --RDI.NAME REFERRING_DOCTOR_NAME,             \n"
                + "       TO_CHAR(OM.TRN_DATE, 'DD-MON-YY HH24:MI:SS') TRN_DATE,\n"
                + "       OM.ORDER_BY,                                  \n"
                + "       ODB.NAME ORDER_PERSON,                        \n"
                + "       OM.TERMINAL_ID,                               \n"
                + "       OM.MOBILITY_STATUS_ID,                        \n"
                + "       OM.ORDER_LOCATION_ID,                         \n"
                + "       OLI.DESCRIPTION ORDER_LOCATION_DESC,          \n"
                + "       OM.USER_LOCATION_ID,                          \n"
                + "       ULI.DESCRIPTION USER_LOCATION_DESC,           \n"
                + "       OM.CUSTOMER_ID,                               \n"
                + "       OM.ADMISSION_NO,                              \n"
                + "       OM.CLIENT_ID,                                 \n"
                + "       CLI.DESCRIPTION CLIENT_NAME,                  \n"
                + "       OM.MANUAL_PATIENT_ID,                         \n"
                + "       OM.ORG_ID,                                    \n"
                + "       OM.PRIORITY                                   \n"
                + "  FROM " + Database.DCMS.orderMaster + "  OM,            \n"
                + "       " + Database.DCMS.location + "     LOC,           \n"
                + "       " + Database.DCMS.users + "        IHD,           \n"
                + "     --" + Database.DCMS.users + "        RDI,           \n"
                + "       " + Database.DCMS.users + "        ODB,           \n"
                + "       " + Database.DCMS.location + "     OLI,           \n"
                + "       " + Database.DCMS.location + "     ULI,           \n"
                + "       " + Database.DCMS.client + "       CLI            \n"
                + " WHERE OM.COMPLETE_ORDER_NO = '001001140000527'      \n"
                + "   AND OM.LOCATION_ID = LOC.ID                       \n"
                + "   AND NVL(OM.INHOUSE_DOCTOR_ID, 'GENERAL') = NVL(IHD.USER_NAME, 'GENERAL')\n"
                + "  -- AND NVL(OM.REFERRING_DOCTOR_ID, 'GENERAL') = NVL(RDI.USER_NAME, 'GENERAL')\n"
                + "   AND OM.ORDER_BY = ODB.USER_NAME                   \n"
                + "   AND OM.ORDER_LOCATION_ID = OLI.ID                 \n"
                + "   AND OM.USER_LOCATION_ID = ULI.ID                  \n"
                + "   AND OM.CLIENT_ID = CLI.ID                         \n";

        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

//        List<PatientHospitalVisit> list = new ArrayList();
//        for (int i = 0; i < selectInvoice.size(); i++) {
//            HashMap map = (HashMap) selectInvoice.get(i);
//            PatientHospitalVisit setCompound = new PatientHospitalVisit();
//
//            setCompound.setAdmissionNumber(admNo);
//            setCompound.setAdmissionAmount(map.get("ADM_AMOUNT").toString());
//            setCompound.setDepartmentId(map.get("DEPARTMENT_ID").toString());
//            list.add(setCompound);
//        }
        return ""; // list
    }

    public static void main(String[] args) {
        HandlerTest hdl = new HandlerTest();
        hdl.num();
    }
}
