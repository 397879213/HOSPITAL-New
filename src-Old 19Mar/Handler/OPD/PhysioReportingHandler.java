package Handler.OPD;

import BO.OPD.PhysioMachine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

public class PhysioReportingHandler {

    String[] selectColumns = {"-", "ID", "CON", "ODI", "PATIENT_ID",
        "ORDER_STATUS_ID", "STATUS_DESC", "MACHINE_ID", "MACHINE_DESC", "VISIT_DAYS",
        "BODY_REGION_ID", "BODY_DESC", "MEC_TIME", "MAX_DAYS", "REMARKS",
        "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

    String generalQuery
            = "SELECT PRD.ID, PRD.CON, PRD.ODI, PRD.PATIENT_ID,     \n"
            + "PRD.ORDER_STATUS_ID, STS.DESCRIPTION STATUS_DESC,    \n"
            + "PRD.MACHINE_ID, MEC.DESCRIPTION MACHINE_DESC,        \n"
            + "PRD.BODY_REGION_ID,BTI.DESCRIPTION BODY_DESC,        \n"
            + "PRD.THERAPY_TIME MEC_TIME,PRD.PLAN_DAYS MAX_DAYS,    \n"
            + "NVL(PRD.VISIT_DAYS, 0) VISIT_DAYS, PRD.CRTD_TERMINAL_ID,\n"
            + "PRD.CRTD_BY, TO_CHAR(PRD.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,\n"
            + " NVL(PRD.REMARKS, ' ') REMARKS FROM                  \n"
            + Database.DCMS.physioMasterPlan + " PRD,               \n"
            + Database.DCMS.definitionTypeDetail + " STS,           \n"
            + Database.DCMS.definitionTypeDetail + " MEC,           \n"
            + Database.DCMS.definitionTypeDetail + " BTI            \n";

    String generalJoin = " AND PRD.ORDER_STATUS_ID = STS.ID\n"
            + " AND PRD.MACHINE_ID = MEC.ID\n"
            + " AND PRD.BODY_REGION_ID = BTI.ID\n"
            + " ORDER BY PRD.CRTD_DATE DESC\n";

    public List<PhysioMachine> selectPlanInformation(List<HashMap> selectData) {

        List<PhysioMachine> list = new ArrayList();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap map = selectData.get(i);
            PhysioMachine machine = new PhysioMachine();
            machine.setPhysioMasterId(map.get("ID").toString());
            machine.setPatientId(map.get("PATIENT_ID").toString());
            machine.setCON(map.get("CON").toString());
            machine.setODI(map.get("ODI").toString());
            machine.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            machine.setStatusDescription(map.get("STATUS_DESC").toString());
            machine.setMachineId(map.get("MACHINE_ID").toString());
            machine.setMachineName(map.get("MACHINE_DESC").toString());
            machine.setBodyRegionId(map.get("BODY_REGION_ID").toString());
            machine.setBodyRegionDescription(map.get("BODY_DESC").toString());
            machine.setTherapyTime(map.get("MEC_TIME").toString());
            machine.setPlanDays(map.get("MAX_DAYS").toString());
            machine.setVisitDays(map.get("VISIT_DAYS").toString());
            machine.setRemarks(map.get("REMARKS").toString());
            machine.setCrtdBy(map.get("CRTD_BY").toString());
            machine.setCrtdDate(map.get("CRTD_DATE").toString());
            machine.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(machine);
        }
        return list;

    }

    public List<PhysioMachine> selectPhysioMasterByPatientId(String patientId) {
        String query = generalQuery
                + " WHERE PRD.PATIENT_ID = '" + patientId + "'      \n"
                + " AND ORDER_STATUS_ID IN ('" + Status.verified + "', "
                + "'" + Status.requested + "', '" + Status.hold + "')\n"
                + generalJoin;
        return selectPlanInformation(
                Constants.dao.selectDatainList(query, selectColumns));
    }

    public List<PhysioMachine> selectPhysioMasterByCONODI(String con, String odi,
            String statusId) {
        String query = generalQuery
                + " WHERE PRD.CON = '" + con + "'           \n"
                + " AND ODI = " + odi + "                   \n"
                + " AND ORDER_STATUS_ID = '" + statusId + "'\n"
                + generalJoin;
        System.out.println("By con" + query);

        return selectPlanInformation(
                Constants.dao.selectDatainList(query, selectColumns));
    }

    public boolean insertPhysioMaster(PhysioMachine imp) {

        String[] columns = {Database.DCMS.physioMasterPlan, "PATIENT_ID", "CON",
            "ODI", "ORDER_STATUS_ID", "MACHINE_ID", "BODY_REGION_ID", "THERAPY_TIME",
            "ID", "PLAN_DAYS", "VISIT_DAYS", "REMARKS", "CRTD_BY", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("PATIENT_ID", "'" + imp.getPatientId() + "'");
        map.put("ORDER_STATUS_ID", "'" + imp.getOrderStatusId() + "'");
        map.put("CON", "'" + imp.getCON() + "'");
        map.put("ODI", "'" + imp.getODI() + "'");
        map.put("MACHINE_ID", "'" + imp.getMachineId() + "'");
        map.put("BODY_REGION_ID", "'" + imp.getBodyRegionId() + "'");
        map.put("THERAPY_TIME", "'" + imp.getTherapyTime() + "'");
        map.put("ID", "(SELECT NVL(MAX(ID)+1, 1) ID FROM "
                + Database.DCMS.physioMasterPlan + ")");
        map.put("PLAN_DAYS", "'" + imp.getPlanDays() + "'");
        map.put("VISIT_DAYS", "'0'");
        map.put("REMARKS", "'" + imp.getRemarks() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean insertPhysioDetail(PhysioMachine mark) {

        String[] columns = {Database.DCMS.physioDetailPlan, "PHYSIO_PLAN_ID",
            "PLAN_DETAIL_ID", "ORDER_STATUS_ID", "MACHINE_ID", "ACTION_BY",
            "ACTION_DATE", "ACTION_TERMINAL_ID", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("PHYSIO_PLAN_ID", "'" + mark.getPhysioMasterId() + "'");
        map.put("PLAN_DETAIL_ID", "(SELECT NVL(MAX(PLAN_DETAIL_ID)+1, 1) ID FROM "
                + Database.DCMS.physioDetailPlan + ")");
        map.put("ORDER_STATUS_ID", "'" + mark.getOrderStatusId() + "'");
        map.put("MACHINE_ID", "'" + mark.getMachineId() + "'");
        map.put("ACTION_BY", "'" + Constants.userId + "'");
        map.put("ACTION_DATE", Constants.today);
        map.put("ACTION_TERMINAL_ID", "'" + Constants.terminalId + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");
        List lstInr = new ArrayList();
        lstInr.add(map);
        return Constants.dao.insertData(lstInr, columns);
    }

    public List<PhysioMachine> selectPlanPerformDetail(String physioId, String machineId) {

        String[] cols = {"-", "PHYSIO_PLAN_ID", "PLAN_DETAIL_ID", "ORDER_STATUS_ID",
            "STATUS_DESC", "MACHINE_ID", "MACHINE_DESC", "ACTION_BY",
            "ACTION_DATE", "ACTION_TERMINAL_ID", "ACTION_BY_NAME",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "REMARKS"};

        String query
                = " SELECT PRD.PHYSIO_PLAN_ID, PLAN_DETAIL_ID,PRD.ORDER_STATUS_ID,\n"
                + " STS.DESCRIPTION STATUS_DESC, PRD.MACHINE_ID,        \n"
                + " MEC.DESCRIPTION MACHINE_DESC, PRD.ACTION_BY, USR.NAME ACTION_BY_NAME,   \n"
                + " TO_CHAR(PRD.ACTION_DATE, 'DD-MON-YY HH12:MI AM') ACTION_DATE,\n"
                + " PRD.ACTION_TERMINAL_ID, PRD.CRTD_BY, PRD.CRTD_TERMINAL_ID,  \n"
                + " TO_CHAR(PRD.CRTD_DATE, 'DD-MON-YY ') CRTD_DATE,     \n"
                + " NVL(PRD.REMARKS, ' ') REMARKS                       \n"
                + "  FROM " + Database.DCMS.physioDetailPlan + " PRD,   \n"
                + Database.DCMS.definitionTypeDetail + " STS,           \n"
                + Database.DCMS.definitionTypeDetail + " MEC,           \n"
                + Database.DCMS.users + " USR                           \n"
                + " WHERE PRD.PHYSIO_PLAN_ID = '" + physioId + "'       \n"
                + " AND PRD.MACHINE_ID = " + machineId + "              \n"
                + " AND PRD.ORDER_STATUS_ID = STS.ID                    \n"
                + " AND PRD.MACHINE_ID = MEC.ID                         \n"
                + " AND PRD.ACTION_BY = USR.USER_NAME                   \n";

        List<HashMap> selectData
                = Constants.dao.selectDatainList(query, cols);

        List<PhysioMachine> list = new ArrayList();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap map = selectData.get(i);
            PhysioMachine machine = new PhysioMachine();
            machine.setPhysioMasterId(map.get("PHYSIO_PLAN_ID").toString());
            machine.setPlanDetailId(map.get("PLAN_DETAIL_ID").toString());
            machine.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            machine.setStatusDescription(map.get("STATUS_DESC").toString());
            machine.setMachineId(map.get("MACHINE_ID").toString());
            machine.setMachineName(map.get("MACHINE_DESC").toString());
            machine.setMarkedByName(map.get("ACTION_BY_NAME").toString());
            machine.setMarkedBy(map.get("ACTION_BY").toString());
            machine.setMarkedDate(map.get("ACTION_DATE").toString());
            machine.setMarkedTerminalId(map.get("ACTION_TERMINAL_ID").toString());
            machine.setCrtdBy(map.get("CRTD_BY").toString());
            machine.setCrtdDate(map.get("CRTD_DATE").toString());
            machine.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            machine.setRemarks(map.get("REMARKS").toString());
            list.add(machine);
        }
        return list;
    }

    public boolean updatePlans(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + "  \n"
                + " SET MACHINE_ID = " + physio.getMachineId() + ",     \n"
                + " BODY_REGION_ID = " + physio.getBodyRegionId() + ",  \n"
                + " THERAPY_TIME = " + physio.getTherapyTime() + ",     \n"
                + " PLAN_DAYS = " + physio.getPlanDays() + ",           \n"
                + " REMARKS = '" + physio.getRemarks()+ "'              \n"
                + " WHERE ID = " + physio.getPhysioMasterId() + "       \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean cancelPerform(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioDetailPlan + "  \n"
                + " SET ORDER_STATUS_ID = " + Status.canceled + ",      \n"
                + " ACTION_BY = '" + Constants.userId + "',             \n"
                + " ACTION_DATE = " + Constants.today + ",              \n"
                + " ACTION_TERMINAL_ID = '" + Constants.terminalId + "',\n"
                + " REMARKS = '" + physio.getRemarks() + "'             \n"
                + " WHERE PLAN_DETAIL_ID = " + physio.getPlanDetailId() + "\n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean revertVisit(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + " PP   \n"
                + " SET PP.ORDER_STATUS_ID = '" + Status.requested + "',    \n"
                + " pp.VISIT_DAYS = VISIT_DAYS - 1                          \n"
                + " WHERE  PP.ID = '" + physio.getPhysioMasterId() + "'     \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean performPlane(List<PhysioMachine> listPerform) {
        boolean ret = true;
        for (int i = 0; i < listPerform.size(); i++) {
            PhysioMachine physio = listPerform.get(i);
            String query = " UPDATE " + Database.DCMS.physioMasterPlan + " PP \n"
                    + " SET  PP.ORDER_STATUS_ID = " + Status.requested + "  \n"
                    + " WHERE  ID = " + physio.getPhysioMasterId() + "      \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean updateMaxDays(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + " PP \n"
                + " SET  PP.TOTAL_DAYS = (SELECT MAX(MAX_DAYS) FROM "
                + Database.DCMS.physioDetailPlan
                + " WHERE  PHYSIO_MASTER_ID = " + physio.getPhysioMasterId() + ")\n"
                + " WHERE  PP.ID = '" + physio.getPhysioMasterId() + "'\n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean FinalPhysioMachineMaster(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + " PP   \n"
                + " SET  PP.STATUS_ID = '" + Status.requested + "'          \n"
                + " WHERE  PP.ID = '" + physio.getPhysioMasterId() + "'     \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean FinalPhysioMachineDetail(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioDetailPlan + " PP   \n"
                + " SET  PP.STATUS_ID = '" + Status.requested + "'          \n"
                + " WHERE  PP.PHYSIO_MASTER_ID = '" + physio.getPhysioMasterId() + "'\n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean markPerformMachine(List<PhysioMachine> listMachPerform) {
        boolean ret = true;

        for (int i = 0; i < listMachPerform.size(); i++) {
            PhysioMachine perMach = listMachPerform.get(i);

            String query
                    = " UPDATE " + Database.DCMS.physioDetailPlan + "       \n"
                    + " SET VISIT_DAYS  = VISIT_DAYS + 1                    \n"
                    + " WHERE PHYSIO_MASTER_ID = '" + perMach.getPhysioMasterId() + "'"
                    + " AND MACHINE_ID = '" + perMach.getMachineId() + "'   \n"
                    + " AND VISIT_DAYS <= MAX_DAYS                          \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean updateStatusDetail(String physioId) {

        String query = " UPDATE " + Database.DCMS.physioDetailPlan + " PP \n"
                + " SET  PP.STATUS_ID = '" + Status.verified + "'   \n"
                + " WHERE PP.PHYSIO_MASTER_ID = '" + physioId + "'  \n"
                + " AND PP.VISIT_DAYS = PP.MAX_DAYS                 \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateVisitInMaster(String physioId, String machineId) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + "  \n"
                + " SET  VISIT_DAYS  = VISIT_DAYS + 1                   \n"
                + " WHERE ID = '" + physioId + "'                       \n"
                + " AND MACHINE_ID = " + machineId + "                  \n"
                + " AND VISIT_DAYS <= PLAN_DAYS                         \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateStatusMaster(String physioId, String machineId) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + " PP \n"
                + " SET  PP.ORDER_STATUS_ID = '" + Status.verified + "' \n"
                + " WHERE PP.ID = '" + physioId + "'                    \n"
                + " AND PP.MACHINE_ID = " + machineId + "               \n"
                + " AND PP.VISIT_DAYS = PP.PLAN_DAYS                    \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean updateByPassMachine(List<PhysioMachine> listMachPerform) {
        boolean ret = true;

        for (int i = 0; i < listMachPerform.size(); i++) {
            PhysioMachine perMach = listMachPerform.get(i);

            String query
                    = " UPDATE " + Database.DCMS.physioDetailPlan + " PP\n"
                    + " SET  PP.STATUS_ID = '" + Status.canceled + "'   \n"
                    + " WHERE PHYSIO_MASTER_ID = '" + perMach.getPhysioMasterId() + "'"
                    + " AND MACHINE_ID = '" + perMach.getMachineId() + "'\n"
                    + " AND VISIT_DAYS <= MAX_DAYS                      \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public boolean deletePhysioPlanMaster(PhysioMachine physio) {

        String query = " DELETE " + Database.DCMS.physioMasterPlan + "  \n"
                + " WHERE ID = '" + physio.getPhysioMasterId() + "'     \n"
                + " AND MACHINE_ID = '" + physio.getMachineId() + "'    \n";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean stopPhysioPlane(PhysioMachine physio) {

        String query = " UPDATE " + Database.DCMS.physioMasterPlan + "  \n"
                + " SET ORDER_STATUS_ID = '" + Status.hold + "',        \n"
                + " REMARKS = '" + physio.getRemarks() + "',            \n"
                + " CRTD_BY = '" + Constants.userId + "',               \n"
                + " CRTD_DATE = " + Constants.today + ",                \n"
                + " CRTD_TERMINAL_ID = '" + Constants.terminalId + "'   \n"
                + " WHERE ID = '" + physio.getPhysioMasterId() + "'     \n";
        return Constants.dao.executeUpdate(query, false);
    }
}
