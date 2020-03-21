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

//    public boolean insertMaster(DialysisBO objSave) {
//
//        String columns[] = {Database.DCMS.dialysisItemDetail, "ORDER_TYPE_ID",
//            "ORDER_NO", "LOCATION_ID", "COMPLETE_ORDER_NO", "PATIENT_ID", "ORDER_DATE",
//            "INHOUSE_DOCTOR_ID", "REFERRING_DOCTOR_ID", "TRN_DATE", "ORDER_BY",
//            "TERMINAL_ID", "MOBILITY_STATUS_ID", "ORDER_LOCATION_ID", "USER_LOCATION_ID",
//            "CUSTOMER_ID", "ADMISSION_NO", "CLIENT_ID", "MANUAL_PATIENT_ID",
//            "ORG_ID", "PRIORITY"};
//
//        HashMap insertMap = new HashMap();
//        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo() + "'");
//        insertMap.put("ORDER_TYPE_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ORDER_NO", "'" + objSave.getItemId() + "'");
//        insertMap.put("LOCATION_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("PATIENT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ORDER_DATE", "'" + objSave.getItemId() + "'");
//        insertMap.put("INHOUSE_DOCTOR_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("REFERRING_DOCTOR_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ORDER_BY", "'" + Constants.userId + "'");
//        insertMap.put("TRN_DATE", "SYSDATE");
//        insertMap.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
//        insertMap.put("MOBILITY_STATUS_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ORDER_LOCATION_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("USER_LOCATION_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("CUSTOMER_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ADMISSION_NO", "'" + objSave.getItemId() + "'");
//        insertMap.put("CLIENT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("MANUAL_PATIENT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ORG_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("PRIORITY", "'" + objSave.getItemId() + "'");
//
//        List lstInr = new ArrayList();
//        lstInr.add(insertMap);
//        return Constants.dao.insertData(lstInr, columns);
//    }
//
//    public boolean insertDeatail(DialysisBO objSave) {
//
//        String columns[] = {Database.DCMS.dialysisItemDetail, "COMPLETE_ORDER_NO",
//            "ORDER_DETAIL_ID", "ORDER_STATUS_ID", "CPT_ID", "URGENT", "PATIENT_ID",
//            "REPORT_DATE", "PRICE", "TRN_DATE", "USER_ID", "", "TERMINAL_ID",
//            "CPT_REMARKS", "DEPARTMENT_ID", "SECTION_ID", "HISTORY_REQUIRED",
//            "CONSULTANCY_ID", "PERFORMING_PHYSICIAN_SHARE", "PERFORMING_CONTRACT_ID",
//            "REPORT_NAME", "PERFORMING_PHYSICIAN_ID", "QUANTITY", "INVOICED"};
//
//        HashMap insertMap = new HashMap();
//        insertMap.put("COMPLETE_ORDER_NO", "'" + objSave.getCompleteOrderNo() + "'");
//        insertMap.put("ORDER_DETAIL_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("ORDER_STATUS_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("CPT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("URGENT", "'" + objSave.getItemId() + "'");
//        insertMap.put("PATIENT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("REPORT_DATE", "'" + objSave.getItemId() + "'");
//        insertMap.put("PRICE", "'" + objSave.getItemId() + "'");
//        insertMap.put("TRN_DATE", "SYSDATE");
//        insertMap.put("USER_ID", "'" + Constants.userId + "'");
//        insertMap.put("TERMINAL_ID", "'" + Constants.terminalId + "'");
//        insertMap.put("CPT_REMARKS", "'" + objSave.getItemId() + "'");
//        insertMap.put("DEPARTMENT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("SECTION_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("HISTORY_REQUIRED", "'" + objSave.getItemId() + "'");
//        insertMap.put("CONSULTANCY_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("PERFORMING_PHYSICIAN_SHARE", "'" + objSave.getItemId() + "'");
//        insertMap.put("PERFORMING_CONTRACT_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("REPORT_NAME", "'" + objSave.getItemId() + "'");
//        insertMap.put("PERFORMING_PHYSICIAN_ID", "'" + objSave.getItemId() + "'");
//        insertMap.put("QUANTITY", "'" + objSave.getItemId() + "'");
//        insertMap.put("INVOICED", "'" + objSave.getItemId() + "'");
//
//        List lstInr = new ArrayList();
//        lstInr.add(insertMap);
//        return Constants.dao.insertData(lstInr, columns);
//    }
//
//    public List<Order> selectMaster(String admNo) {
//
//        String[] selectColumns = {"-", "ORDER_TYPE_ID", "ORDER_NO", "LOCATION_ID",
//            "LOC_DESCRIPTION", "COMPLETE_ORDER_NO", "PATIENT_ID", "ORDER_DATE",
//            "INHOUSE_DOCTOR_ID", "INHOUSE_DOCTOR_NAME", "REFERRING_DOCTOR_ID",
//            "TRN_DATE", "ORDER_BY", "ORDER_PERSON", "TERMINAL_ID", "MOBILITY_STATUS_ID",
//            "ORDER_LOCATION_ID", "ORDER_LOCATION_DESC", "USER_LOCATION_ID",
//            "USER_LOCATION_DESC", "CUSTOMER_ID", "ADMISSION_NO", "CLIENT_ID",
//            "CLIENT_NAME", "MANUAL_PATIENT_ID", "ORG_ID", "PRIORITY"};
//        //"REFERRING_DOCTOR_NAME",
//        String query
//                = "SELECT OM.ORDER_TYPE_ID,                             \n"
//                + "       OM.ORDER_NO,                                  \n"
//                + "       OM.LOCATION_ID,                               \n"
//                + "       LOC.DESCRIPTION LOC_DESCRIPTION,              \n"
//                + "       OM.COMPLETE_ORDER_NO,                         \n"
//                + "       OM.PATIENT_ID,                                \n"
//                + "       TO_CHAR(OM.ORDER_DATE, 'DD-MON-YY HH24:MI:SS') ORDER_DATE,\n"
//                + "       OM.INHOUSE_DOCTOR_ID,                         \n"
//                + "       IHD.NAME INHOUSE_DOCTOR_NAME,                 \n"
//                + "       OM.REFERRING_DOCTOR_ID,                       \n"
//                + "       --RDI.NAME REFERRING_DOCTOR_NAME,             \n"
//                + "       TO_CHAR(OM.TRN_DATE, 'DD-MON-YY HH24:MI:SS') TRN_DATE,\n"
//                + "       OM.ORDER_BY,                                  \n"
//                + "       ODB.NAME ORDER_PERSON,                        \n"
//                + "       OM.TERMINAL_ID,                               \n"
//                + "       OM.MOBILITY_STATUS_ID,                        \n"
//                + "       OM.ORDER_LOCATION_ID,                         \n"
//                + "       OLI.DESCRIPTION ORDER_LOCATION_DESC,          \n"
//                + "       OM.USER_LOCATION_ID,                          \n"
//                + "       ULI.DESCRIPTION USER_LOCATION_DESC,           \n"
//                + "       OM.CUSTOMER_ID,                               \n"
//                + "       OM.ADMISSION_NO,                              \n"
//                + "       OM.CLIENT_ID,                                 \n"
//                + "       CLI.DESCRIPTION CLIENT_NAME,                  \n"
//                + "       OM.MANUAL_PATIENT_ID,                         \n"
//                + "       OM.ORG_ID,                                    \n"
//                + "       OM.PRIORITY                                   \n"
//                + "  FROM " + Database.DCMS.orderMaster + "  OM,            \n"
//                + "       " + Database.DCMS.location + "     LOC,           \n"
//                + "       " + Database.DCMS.users + "        IHD,           \n"
//                + "     --" + Database.DCMS.users + "        RDI,           \n"
//                + "       " + Database.DCMS.users + "        ODB,           \n"
//                + "       " + Database.DCMS.location + "     OLI,           \n"
//                + "       " + Database.DCMS.location + "     ULI,           \n"
//                + "       " + Database.DCMS.client + "       CLI            \n"
//                + " WHERE OM.COMPLETE_ORDER_NO = '001001140000527'      \n"
//                + "   AND OM.LOCATION_ID = LOC.ID                       \n"
//                + "   AND NVL(OM.INHOUSE_DOCTOR_ID, 'GENERAL') = NVL(IHD.USER_NAME, 'GENERAL')\n"
//                + "  -- AND NVL(OM.REFERRING_DOCTOR_ID, 'GENERAL') = NVL(RDI.USER_NAME, 'GENERAL')\n"
//                + "   AND OM.ORDER_BY = ODB.USER_NAME                   \n"
//                + "   AND OM.ORDER_LOCATION_ID = OLI.ID                 \n"
//                + "   AND OM.USER_LOCATION_ID = ULI.ID                  \n"
//                + "   AND OM.CLIENT_ID = CLI.ID                         \n";
//
//        System.out.println(query);
//        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);
//
//        List<Order> list = new ArrayList();
//        for (int i = 0; i < selectInvoice.size(); i++) {
//            HashMap map = (HashMap) selectInvoice.get(i);
//            Order setCompound = new Order();
//            
//            setCompound.setOrderTypeId(map.get("ORDER_TYPE_ID").toString());
//            setCompound.setOrderNo(map.get("ORDER_NO").toString());
//            setCompound.setLocationId(map.get("LOCATION_ID").toString());
//            setCompound.setLocationDescription(map.get("LOC_DESCRIPTION").toString());
//            setCompound.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
//            setCompound.setPatientId(map.get("PATIENT_ID").toString());
//            setCompound.setOrderDate(map.get("ORDER_DATE").toString());
//            setCompound.setInHouseDoctorId(map.get("INHOUSE_DOCTOR_ID").toString());
//            setCompound.setInHouseDoctorName(map.get("INHOUSE_DOCTOR_NAME").toString());
//            setCompound.setReferringDoctorId(map.get("REFERRING_DOCTOR_ID").toString());
////            setCompound.setReferringDoctor(map.get("REFERRING_DOCTOR_NAME").toString());
//            setCompound.setTrnDate(map.get("TRN_DATE").toString());
//            setCompound.setOrderBy(map.get("ORDER_BY").toString());
//            setCompound.setOrderPerson(map.get("ORDER_PERSON").toString());
//            setCompound.setTerminalId(map.get("TERMINAL_ID").toString());
//            setCompound.setMobilityStatusId(map.get("MOBILITY_STATUS_ID").toString());
//            setCompound.setOrderLocationId(map.get("ORDER_LOCATION_ID").toString());
//            setCompound.setOrderLocationDescription(map.get("ORDER_LOCATION_DESC").toString());
//            setCompound.setUserLocationId(map.get("USER_LOCATION_ID").toString());
//            setCompound.setUserLocationDescription(map.get("USER_LOCATION_DESC").toString());
//            setCompound.setCustomerId(map.get("CUSTOMER_ID").toString());
//            setCompound.setAdmissionNo(map.get("ADMISSION_NO").toString());
//            setCompound.setClientId(map.get("CLIENT_ID").toString());
//            setCompound.setClientDescription(map.get("CLIENT_NAME").toString());
//            setCompound.setManualPatientId(map.get("MANUAL_PATIENT_ID").toString());
//            setCompound.setOrganizationId(map.get("ORG_ID").toString());
//            setCompound.setPriority(map.get("PRIORITY").toString());
//            list.add(setCompound);
//        }
//        return list;
//    }
//
//    public List<Order> selectDetail(String admNo) {
//
//        String[] selectColumns = {"-", "COMPLETE_ORDER_NO", "ORDER_DETAIL_ID", 
//            "ORDER_STATUS_ID", "ORDER_STATUS_DESC","CPT_ID", "CPT_NAME", "URGENT",
//            "PATIENT_ID", "REPORT_DATE", "PRICE", "TRN_DATE", "USER_ID", "ORDER_PERSON", 
//            "TERMINAL_ID", "CPT_REMARKS", "DEPARTMENT_ID", "DEPARTMENT_DESC", 
//            "SECTION_ID", "SECTION_DESC", "HISTORY_REQUIRED", "CONSULTANCY_ID", 
//            "PERFORMING_PHYSICIAN_SHARE", "PERFORMING_CONTRACT_ID", "REPORT_NAME", 
//            "PERFORMING_PHYSICIAN_ID", "PERFORMING_PHYSICIAN_NAME", "QUANTITY", 
//            "INVOICED"};
//        //"REFERRING_DOCTOR_NAME",
//        String query
//                = "SELECT COMPLETE_ORDER_NO,                            \n"
//                + "       ORDER_DETAIL_ID,                              \n"
//                + "       ORDER_STATUS_ID,                              \n"
//                + "       OSI.DESCRIPTION  ORDER_STATUS_DESC,           \n"
//                + "       CPT_ID,                                       \n"
//                + "       CPT.DESCRIPTION  CPT_NAME,                    \n"
//                + "       URGENT,                                       \n"
//                + "       PATIENT_ID,                                   \n"
//                + "       REPORT_DATE,                                  \n"
//                + "       PRICE,                                        \n"
//                + "       TRN_DATE,                                     \n"
//                + "       USER_ID,                                      \n"
//                + "       ODP.NAME         ORDER_PERSON,                \n"
//                + "       TERMINAL_ID,                                  \n"
//                + "       CPT_REMARKS,                                  \n"
//                + "       DEPARTMENT_ID,                                \n"
//                + "       DEP.DESCRIPTION  DEPARTMENT_DESC,             \n"
//                + "       SECTION_ID,                                   \n"
//                + "       SEC.DESCRIPTION  SECTION_DESC,                \n"
//                + "       HISTORY_REQUIRED,                             \n"
//                + "       CONSULTANCY_ID,                               \n"
//                + "       PERFORMING_PHYSICIAN_SHARE,                   \n"
//                + "       PERFORMING_CONTRACT_ID,                       \n"
//                + "       REPORT_NAME,                                  \n"
//                + "       PERFORMING_PHYSICIAN_ID,                      \n"
//                + "       PSI.NAME PERFORMING_PHYSICIAN_NAME,           \n"
//                + "       QUANTITY,                                     \n"
//                + "       INVOICED                                      \n"
//                + "  FROM "+Database.DCMS.orderDetail+"          ODD,   \n"
//                + "       "+Database.DCMS.definitionTypeDetail+" OSI,   \n"
//                + "       "+Database.DCMS.CPT+"                  CPT,   \n"
//                + "       "+Database.DCMS.users+"                ODP,   \n"
//                + "       "+Database.DCMS.definitionTypeDetail+" DEP,   \n"
//                + "       "+Database.DCMS.section+"              SEC,   \n"
//                + "       "+Database.DCMS.users+"                PSI    \n"
//                + " WHERE ODD.ORDER_STATUS_ID = OSI.ID                  \n"
//                + "   AND ODD.CPT_ID = CPT.CPT_ID\n"
//                + "   AND ODD.USER_ID = ODP.USER_NAME\n"
//                + "   AND ODD.DEPARTMENT_ID = DEP.ID\n"
//                + "   AND ODD.SECTION_ID = SEC.SECTION_ID\n"
//                + "   AND ODD.PERFORMING_PHYSICIAN_ID = PSI.USER_NAME";
//
//        System.out.println(query);
//        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

//        List<Order> list = new ArrayList();
//        for (int i = 0; i < selectInvoice.size(); i++) {
//            HashMap map = (HashMap) selectInvoice.get(i);
//            Order setCompound = new Order(); 
//
//            setCompound.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
//            setCompound.setOrderDetailId(map.get("ORDER_DETAIL_ID").toString());
//            setCompound.setOrderDetailId(map.get("ORDER_STATUS_ID").toString());
//            setCompound.setOrderDetailId(map.get("ORDER_STATUS_DESC").toString());
//            setCompound.setOrderDetailId(map.get("CPT_ID").toString());
//            setCompound.setOrderDetailId(map.get("CPT_NAME").toString());
//            setCompound.setOrderDetailId(map.get("URGENT").toString());
//            setCompound.setOrderDetailId(map.get("PATIENT_ID").toString());
//            setCompound.setOrderDetailId(map.get("REPORT_DATE").toString());
//            setCompound.setOrderDetailId(map.get("PRICE").toString());
//            setCompound.setOrderDetailId(map.get("TRN_DATE").toString());
//            setCompound.setOrderDetailId(map.get("USER_ID").toString());
//            setCompound.setOrderDetailId(map.get("ORDER_PERSON").toString());
//            setCompound.setOrderDetailId(map.get("TERMINAL_ID").toString());
//            setCompound.setOrderDetailId(map.get("CPT_REMARKS").toString());
//            setCompound.setOrderDetailId(map.get("DEPARTMENT_ID").toString());
//            setCompound.setOrderDetailId(map.get("DEPARTMENT_DESC").toString());
//            setCompound.setOrderDetailId(map.get("SECTION_ID").toString());
//            setCompound.setOrderDetailId(map.get("SECTION_DESC").toString());
//            setCompound.setOrderDetailId(map.get("CONSULTANCY_ID").toString());
//            setCompound.setOrderDetailId(map.get("HISTORY_REQUIRED").toString());
//            setCompound.setOrderDetailId(map.get("PERFORMING_PHYSICIAN_SHARE").toString());
//            setCompound.setOrderDetailId(map.get("PERFORMING_CONTRACT_ID").toString());
//            setCompound.setOrderDetailId(map.get("REPORT_NAME").toString());
//            setCompound.setOrderDetailId(map.get("PERFORMING_PHYSICIAN_ID").toString());
//            setCompound.setOrderDetailId(map.get("PERFORMING_PHYSICIAN_NAME").toString());
//            setCompound.setOrderDetailId(map.get("QUANTITY").toString());
//            setCompound.setOrderDetailId(map.get("INVOICED").toString());
//            list.add(setCompound);
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        HandlerTest hdl = new HandlerTest();
//        hdl.num();
//    }
    
}
