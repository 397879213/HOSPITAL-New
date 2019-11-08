 
package Controller.Hospital;

import BO.Hospital.ManageAdmissionServices;
import BO.StudyData;
import Handler.CancelOrderHandler;
import Handler.Hospital.PendingAdmissionServicesHandler;
import java.util.List;
import java.util.Vector;

public class PendingAdmissionServicesController {

    public PendingAdmissionServicesHandler hdlPendingServices = new PendingAdmissionServicesHandler();
    public CancelOrderHandler hdlCancelOrder = new CancelOrderHandler();

    public List<ManageAdmissionServices> selectAdmittedPatient(String patientId) {
        return hdlPendingServices.selectAdmittedPatient(patientId);
    }

    public List<ManageAdmissionServices> selectPendingServices(String admissionNo,
            String departmentId, String tableName) {
        return hdlPendingServices.selectPendingServices(admissionNo, departmentId,
                tableName);
    }

    public Vector<StudyData> selectPendingCancelRequest(String admissionNo,
            String itemTable) {
        return hdlCancelOrder.searchAdmissionCancelOrders(admissionNo, itemTable);
    }

    public String selectDepartmentStatus(String CON, String tableName) {
        return hdlPendingServices.selectDepartmentStatus(CON, tableName);
    }
    
    public List<ManageAdmissionServices> selectAdmPatientDetail(String admissionNo, 
            String departmentId) {
        return hdlPendingServices.selectAdmPatientDetail(admissionNo, departmentId);
    }
}