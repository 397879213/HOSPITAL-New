/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Hospital.LTUPatientHistoryBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.Database;

public class LTUPatientHistory {

    List<LTUPatientHistoryBO> listPatients = new ArrayList();
    List<LTUPatientHistoryBO> listConsDate = new ArrayList();
    List<LTUPatientHistoryBO> listProcedures = new ArrayList();
    List<LTUPatientHistoryBO> listMovement = new ArrayList();

    public List<LTUPatientHistoryBO> selectPatients() {

        String columns[] = {"-", "PATIENT_ID", "ADMISSION_NO", "ADMISSION_DATE",
            "PRIMARY_PHYSICIAN_ID"};

        String query = " SELECT PATIENT_ID, ADMISSION_NO, PRIMARY_PHYSICIAN_ID,"
                + " TO_CHAR(ADMISSION_DATE, 'DD-MON-YY') ADMISSION_DATE \n"
                + "FROM " + Database.DCMS.ltuPatientHistory + " OPC     \n"
                + " ORDER BY PATIENT_ID, ADMISSION_NO                   \n";

        System.out.println("query" + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<LTUPatientHistoryBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            LTUPatientHistoryBO objData = new LTUPatientHistoryBO();

            objData.setPatientId(map.get("PATIENT_ID").toString());
            objData.setAdmissionNo(map.get("ADMISSION_NO").toString());
            objData.setPriPhyId(map.get("PRIMARY_PHYSICIAN_ID").toString());
            objData.setAdmittedDate(map.get("ADMISSION_DATE").toString());

            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public List<LTUPatientHistoryBO> selectConsDate(LTUPatientHistoryBO obj) {

        String columns[] = {"-", "CONSULTANCY_DATE"};

        String query = " SELECT TO_CHAR(OPC.CONSULTANCY_DATE, 'DD-MON-YY') CONSULTANCY_DATE\n"
                + "FROM " + Database.DCMS.opdPerformedConsultancy + " OPC               \n"
                + "WHERE TRUNC(OPC.CONSULTANCY_DATE) BETWEEN '" + obj.getFromDate() + "' AND '"
                + obj.getToDate() + "'  \n"
                + " AND TRUNC(OPC.CONSULTANCY_DATE) < TO_DATE('" + obj.getAdmittedDate() + "')\n"
                + " AND OPC.PATIENT_ID = '" + obj.getPatientId() + "'\n"
                + " AND OPC.CONSULTANT_ID IN ( 'AHSAN.MOBIN', '6707', 'M.IQBAL', 'NAZISH.ARSHAD', "
                + "'HUMAID.AHMAD', 'M.TAQI')\n"
                + " ORDER BY OPC.CONSULTANT_ID, OPC.CONSULTANCY_DATE DESC \n";

        System.out.println("query" + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<LTUPatientHistoryBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            LTUPatientHistoryBO objData = new LTUPatientHistoryBO();

            objData.setOpdConsDate(map.get("CONSULTANCY_DATE").toString());

            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public List<LTUPatientHistoryBO> selectCPTId(LTUPatientHistoryBO obj) {

        String columns[] = {"-", "CPT"};

        String query = " SELECT CPT.DESCRIPTION CPT FROM\n"
                + Database.DCMS.otPerformedProcedure + " OPP,               \n"
                + Database.DCMS.CPT + " CPT               \n"
                + "WHERE CRTD_DATE  BETWEEN '" + obj.getFromDate() + "' AND '"
                + obj.getToDate() + "'  \n"
                + " AND OPP.PATIENT_ID = '" + obj.getPatientId() + "'\n"
                + " AND OPP.ADMISSION_NO = '" + obj.getAdmissionNo() + "'\n"
                + " AND OPP.CPT_ID = CPT.CPT_ID";

        System.out.println("query" + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<LTUPatientHistoryBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            LTUPatientHistoryBO objData = new LTUPatientHistoryBO();

            objData.setCptId(map.get("CPT").toString());

            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public List<LTUPatientHistoryBO> selectWardTransfer(LTUPatientHistoryBO obj) {

        String columns[] = {"-", "DESCRIPTION"};

        String query = " SELECT WIN.DESCRIPTION WARD_IN, WOT.DESCRIPTION WARD_OUT  \n"
                + " FROM " + Database.DCMS.ward + " WIN,               \n"
                + " FROM " + Database.DCMS.ward + " WOT,               \n"
                + "  " + Database.DCMS.bedTransferHistory + " BTH              \n"
                + " WHERE BTH.PATIENT_ID = '" + obj.getPatientId() + "'\n"
                + " AND BTH.ADMISSION_NO = '" + obj.getAdmissionNo() + "'\n"
                + " AND BTH.WARD_ID = WIN.ID                            \n"
                + "AND BTH.WARD_OUT = WOT.ID                            \n";

        System.out.println("query" + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<LTUPatientHistoryBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            LTUPatientHistoryBO objData = new LTUPatientHistoryBO();

            objData.setWardTransfer(map.get("WARD_IN").toString());
            objData.setWardTransfer(map.get("WARD_OUT").toString());
            objData.setWardTransfer(objData.getWardOut() + "->" + objData.getWardIn());
            System.err.println("\n\n" + objData.getWardTransfer() + "\n\n");

            lisVerRep.add(objData);
        }
        return lisVerRep;
    }
    
    public List<LTUPatientHistoryBO> selectaAdmissionExpense(LTUPatientHistoryBO obj) {

        String columns[] = {"-", "AMOUNT"};

        String query = " SELECT SUM(IV.PAYABLE_AMOUNT - IV.REFUND_AMOUNT) AMOUNT\n"
                + " FROM " + Database.DCMS.invoiceMaster + " IV        \n"
                + " WHERE IV.PATIENT_ID = '" + obj.getPatientId() + "'\n"
                + " AND IV.ADMISSION_NO = '" + obj.getAdmissionNo() + "'\n";

        System.out.println("query" + query);
        List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
        List<LTUPatientHistoryBO> lisVerRep = new ArrayList<>();

        for (int i = 0; i < listmap.size(); i++) {
            HashMap map = (HashMap) listmap.get(i);
            LTUPatientHistoryBO objData = new LTUPatientHistoryBO();

            objData.setAdmissionNo(map.get("AMOUNT").toString());

            lisVerRep.add(objData);
        }
        return lisVerRep;
    }

    public boolean updateConsDate(String date, LTUPatientHistoryBO objRv) {

        String query
                = " UPDATE " + Database.DCMS.ltuPatientHistory + "        \n"
                + " SET OPD_VISIT_DATE =TO_DATE('" + date + "')  \n"
                + "WHERE PATIENT_ID = '" + objRv.getPatientId() + "'          \n"
                + "AND ADMISSION_NO = '" + objRv.getAdmissionNo() + "'        \n";
        System.out.println("\n" + query);
        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updateWard(String ward, LTUPatientHistoryBO objRv) {

        String query
                = " UPDATE " + Database.DCMS.ltuPatientHistory + "        \n"
                + " SET WARD_TRANSFER = '" + ward + "'  \n"
                + "WHERE PATIENT_ID = '" + objRv.getPatientId() + "'          \n"
                + "AND ADMISSION_NO = '" + objRv.getAdmissionNo() + "'        \n";
        System.out.println("\n" + query);
        return Constants.dao.executeUpdate(query, false);

    }

    public boolean updateCPTId(String cptId, LTUPatientHistoryBO objRv) {

        String query
                = " UPDATE " + Database.DCMS.ltuPatientHistory + "        \n"
                + " SET OT_CPT_ID = '" + cptId + "'  \n"
                + "WHERE PATIENT_ID = '" + objRv.getPatientId() + "'          \n"
                + "AND ADMISSION_NO = '" + objRv.getAdmissionNo() + "'        \n";
        System.out.println("\n" + query);
        return Constants.dao.executeUpdate(query, false);

    }

    public boolean run() {
        boolean ret = true;
        String ward = "";
        String procedure = "";
        listPatients = selectPatients();
        for (int i = 0; i < listPatients.size(); i++) {
            LTUPatientHistoryBO obj = listPatients.get(i);
//            listConsDate = selectConsDate(obj);
//            if (listConsDate.isEmpty()) {
//                System.err.println("No Consultancy");
//            } else {
//                LTUPatientHistoryBO objDate = listConsDate.get(0);
//                ret = updateConsDate(objDate.getOpdConsDate(), obj);
//            }

            listProcedures = selectCPTId(obj);
            if (listProcedures.isEmpty()) {
                System.err.println("No Procedure Perform.");
            } else {
                for (int j = 0; j < listProcedures.size(); j++) {
                    LTUPatientHistoryBO objProce = listProcedures.get(j);
                    procedure = objProce.getCptId() + ", " + procedure;
                }
                ret = updateCPTId(procedure, obj);
            }

//            listMovement = selectWardTransfer(obj);
//            if (listConsDate.isEmpty()) {
//                continue;
//            } else {
//                for (int k = 0; k < listMovement.size(); k++) {
//                    LTUPatientHistoryBO objWard = listMovement.get(k);
//                    ward = objWard.getWardTransfer() + ", " + ward;
//                    System.err.println("\n\nwrdd" + ward);
//                }
//                ret = updateConsDate(ward, obj);
//            }
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
        LTUPatientHistory ctl = new LTUPatientHistory();
        if (ctl.run()) {
            JOptionPane.showMessageDialog(null, "Completed successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Completed successfully");
        }
    }

}
