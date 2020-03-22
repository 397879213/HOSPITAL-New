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
import javax.swing.JOptionPane;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class TEST {

    public List<PatientHospitalVisit> selectAdmPatientRefundSummary() {

        String[] selectColumns = {"-", "PATIENT_ID"};

        String query
                = " SELECT PAT.PATIENT_ID"
                + " FROM EMR.SAVE_PATIENT PAT        \n";
       
        System.out.println(query);
        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<PatientHospitalVisit> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            PatientHospitalVisit setCompound = new PatientHospitalVisit();
            setCompound.setPatientId(map.get("PATIENT_ID").toString());
            list.add(setCompound);
        }
        return list;
    }

    public boolean UpdateClient(String patientId) {
        String query = "UPDATE PATIENT SET CLIENT_ID = '16'"
                + "WHERE PATIENT_ID='" + patientId + "'\n";
        System.out.println(query);
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean runProcess() {
        List<PatientHospitalVisit> ListClient = new ArrayList();
        Boolean ret = true;
        ListClient = selectAdmPatientRefundSummary();
        for (int i = 0; i < ListClient.size(); i++) {
            PatientHospitalVisit obj = ListClient.get(i);
            ret = UpdateClient(obj.getPatientId());
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
        TEST T = new TEST();
        if (!T.runProcess()) {
            JOptionPane.showMessageDialog(null, "Client not Updated Successfully!\n"
                    + "Please Contact Support Team");
        } else {
            JOptionPane.showMessageDialog(null, "Client Updated Successfully");
        }

    }
}
