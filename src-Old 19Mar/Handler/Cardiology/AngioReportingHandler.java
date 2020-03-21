/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Cardiology;

import BO.Cardiology.AngioReporting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class AngioReportingHandler {

    public List<AngioReporting> selectAngioReportingMaster(String con, String odi) {

        String[] selectColumns = {"-", "ID", "PATIENT_ID", "CON", "ODI",
            "ORDER_STATUS_ID", "ORDER_STATUS_DESC", "ROUTE_ID", "ROUTE_DESCRIPTION",
            "CONTRAST", "X_RAY_DOSE", "F_TIME", "LV_ANGIOGRAM_ID", "LV_ANGIOGRAM_DESC",
            "LVEF", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "CRTD_BY_NAME"};

        String query
                = "SELECT ARM.ID, ARM.PATIENT_ID,           \n"
                + "       ARM.CON, ARM.ODI,                 \n"
                + "       ARM.ORDER_STATUS_ID,              \n"
                + "       STS.DESCRIPTION ORDER_STATUS_DESC,\n"
                + "  NVL(ARM.ROUTE_ID, -1) ROUTE_ID,        \n"
                + "       ROT.DESCRIPTION ROUTE_DESCRIPTION,\n"
                + "  NVL(ARM.CONTRAST, ' ') CONTRAST,       \n"
                + "  NVL(ARM.X_RAY_DOSE, ' ') X_RAY_DOSE,                 \n"
                + "  NVL(ARM.F_TIME, ' ') F_TIME,           \n"
                + "  NVL(ARM.LV_ANGIOGRAM_ID, -1) LV_ANGIOGRAM_ID,"
                + " LAI.DESCRIPTION LV_ANGIOGRAM_DESC, "
                + " NVL(ARM.LVEF, ' ') LVEF,\n"
                + "  ARM.CRTD_BY, USR.NAME CRTD_BY_NAME,\n"
                + " TO_CHAR(ARM.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,\n"
                + "       ARM.CRTD_TERMINAL_ID              \n"
                + "  FROM " + Database.DCMS.angioReportingMaster + " ARM, "
                + Database.DCMS.definitionTypeDetail + " STS,\n"
                + Database.DCMS.definitionTypeDetail + " ROT,\n"
                + Database.DCMS.definitionTypeDetail + " LAI,\n"
                + Database.DCMS.users + " USR               \n"
                + "  WHERE ARM.CON = '" + con + "'          \n"
                + "  AND ARM.ODI = '" + odi + "'            \n"
                + "  AND ARM.ORDER_STATUS_ID = STS.ID       \n"
                + "  AND NVL(ARM.ROUTE_ID, -1) = NVL(ROT.ID, -1)\n"
                + "  AND ARM.CRTD_BY = USR.USER_NAME        \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<AngioReporting> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            AngioReporting setAngio = new AngioReporting();

            setAngio.setAngioMasterId(map.get("ID").toString());
            setAngio.setPatientId(map.get("PATIENT_ID").toString());
            setAngio.setCON(map.get("CON").toString());
            setAngio.setODI(map.get("ODI").toString());
            setAngio.setOrderStatusId(map.get("ORDER_STATUS_ID").toString());
            setAngio.setOrderStatusDescription(map.get("ORDER_STATUS_DESC").toString());
            setAngio.setRouteId(map.get("ROUTE_ID").toString());
            setAngio.setRouteDescription(map.get("ROUTE_DESCRIPTION").toString());
            setAngio.setContrast(map.get("CONTRAST").toString());
            setAngio.setxRayDose(map.get("X_RAY_DOSE").toString());
            setAngio.setFTime(map.get("F_TIME").toString());
            setAngio.setLVAngiogramId(map.get("LV_ANGIOGRAM_ID").toString());
            setAngio.setLVAngiogramDescription(map.get("LV_ANGIOGRAM_DESC").toString());
            setAngio.setLVEF(map.get("LVEF").toString());
            setAngio.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            setAngio.setCrtdBy(map.get("CRTD_BY").toString());
            setAngio.setCrtdDate(map.get("CRTD_DATE").toString());
            setAngio.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setAngio);
        }
        return list;
    }

    public boolean insertAngioReportingMaster(AngioReporting angio) {

        String[] columns = {Database.DCMS.angioReportingMaster,
            "ID", "PATIENT_ID", "CON", "ODI", "ORDER_STATUS_ID", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID)+1, 1) ID FROM "
                + Database.DCMS.angioReportingMaster + ")");
        map.put("PATIENT_ID", "'" + angio.getPatientId() + "'");
        map.put("CON", "'" + angio.getCON() + "'");
        map.put("ODI", "'" + angio.getODI() + "'");
        map.put("ORDER_STATUS_ID", "'" + angio.getOrderStatusId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateAngioReportingMaster(AngioReporting angio) {
        String query
                = " UPDATE " + Database.DCMS.angioReportingMaster + "\n"
                + " SET ROUTE_ID = " + angio.getRouteId() + ",\n"
                + " CONTRAST  = '" + angio.getContrast() + "',\n"
                + " X_RAY_DOSE  = '" + angio.getxRayDose() + "',\n"
                + " F_TIME  = '" + angio.getFTime() + "',\n"
                + " LV_ANGIOGRAM_ID  = '" + angio.getLVAngiogramId() + "',\n"
                + " LVEF  = '" + angio.getLVEF() + "'\n"
                + " WHERE ID = '" + angio.getAngioMasterId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public List<AngioReporting> selectAngioReportingCatheter(String angioId) {

        String[] selectColumns = {"-", "ID", "ANGIO_MASTER_ID", "CATHETER",
            "CATHETER_TYPE_ID", "CATHETER_TYPE_DESC", "LEFT_RIGHT_ID",
            "LEFT_RIGHT_DESC", "CATHETER_VALUE_ID", "CATHETER_VALUE_DESC",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "CRTD_BY_NAME"};

        String query
                = "SELECT ANC.ID,\n"
                + "       ANC.ANGIO_MASTER_ID,\n"
                + "       ANC.CATHETER,\n"
                + "       ANC.CATHETER_TYPE_ID,\n"
                + "       CAT.DESCRIPTION CATHETER_TYPE_DESC,\n"
                + "       ANC.LEFT_RIGHT_ID,\n"
                + "       CLR.DESCRIPTION LEFT_RIGHT_DESC,\n"
                + "       ANC.CATHETER_VALUE_ID,\n"
                + "       CAV.DESCRIPTION CATHETER_VALUE_DESC,\n"
                + "       ANC.CRTD_BY, USR.NAME CRTD_BY_NAME,\n"
                + "       TO_CHAR(ANC.CRTD_DATE, 'DD-MON-YY') CRTD_DATE,\n"
                + "       ANC.CRTD_TERMINAL_ID\n"
                + "  FROM " + Database.DCMS.angioReportingCatheter + " ANC,\n"
                + Database.DCMS.definitionTypeDetail + " CAT,\n"
                + Database.DCMS.definitionTypeDetail + " CLR,\n"
                + Database.DCMS.definitionTypeDetail + " CAV,\n"
                + Database.DCMS.users + " USR\n"
                + " WHERE ANC.ANGIO_MASTER_ID = '" + angioId + "'\n"
                + "   AND ANC.CATHETER_TYPE_ID = CAT.ID\n"
                + "   AND ANC.LEFT_RIGHT_ID = CLR.ID\n"
                + "   AND ANC.CATHETER_VALUE_ID = CAV.ID\n"
                + "   AND ANC.CRTD_BY = USR.USER_NAME   \n"
                + " ORDER BY ID DESC                        \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<AngioReporting> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            AngioReporting setAngio = new AngioReporting();

            setAngio.setCatherterPk(map.get("ID").toString());
            setAngio.setAngioMasterId(map.get("ANGIO_MASTER_ID").toString());
            setAngio.setCatherter(map.get("CATHETER").toString());
            setAngio.setCatherterTypeId(map.get("CATHETER_TYPE_ID").toString());
            setAngio.setCatherterTypeDescription(map.get("CATHETER_TYPE_DESC").toString());
            setAngio.setCatherterLRId(map.get("LEFT_RIGHT_ID").toString());
            setAngio.setCatherterLRDescription(map.get("LEFT_RIGHT_DESC").toString());
            setAngio.setCatherterValueId(map.get("CATHETER_VALUE_ID").toString());
            setAngio.setCatherterValueDescription(map.get("CATHETER_VALUE_DESC").toString());
            setAngio.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            setAngio.setCrtdBy(map.get("CRTD_BY").toString());
            setAngio.setCrtdDate(map.get("CRTD_DATE").toString());
            setAngio.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setAngio);
        }
        return list;
    }

    public boolean insertAngioReportingCatheter(AngioReporting angio) {

        String[] columns = {Database.DCMS.angioReportingCatheter,
            "ID", "ANGIO_MASTER_ID", "CATHETER", "CATHETER_TYPE_ID", "LEFT_RIGHT_ID",
            "CATHETER_VALUE_ID", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID)+1, 1) ID FROM "
                + Database.DCMS.angioReportingCatheter + ")");
        map.put("ANGIO_MASTER_ID", "'" + angio.getAngioMasterId() + "'");
        map.put("CATHETER", "'" + angio.getCatherter() + "'");
        map.put("CATHETER_TYPE_ID", "'" + angio.getCatherterTypeId() + "'");
        map.put("LEFT_RIGHT_ID", "'" + angio.getCatherterLRId() + "'");
        map.put("CATHETER_VALUE_ID", "'" + angio.getCatherterValueId() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean insertAngioParameter(AngioReporting angio) {

        String[] columns = {Database.DCMS.angioReportingVessel,
            "ID", "ANGIO_MASTER_ID", "VESSEL_ID", "PROXIMAL", "MID", "DISTAL",
            "OSTIUM", "TEMPLATE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID)+1, 1) ID FROM "
                + Database.DCMS.angioReportingVessel + ")");
        map.put("ANGIO_MASTER_ID", "'" + angio.getAngioMasterId() + "'");
        map.put("VESSEL_ID", "'" + angio.getAngioParameterId() + "'");
        map.put("PROXIMAL", "'" + angio.getProximal() + "'");
        map.put("MID", "'" + angio.getMid() + "'");
        map.put("DISTAL", "'" + angio.getDistal() + "'");
        map.put("OSTIUM", "'" + angio.getOstium() + "'");
        map.put("TEMPLATE", "'" + angio.getTemplate() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<AngioReporting> selectAngioParameter(String angioId) {

        String[] selectColumns = {"-", "ID", "ANGIO_MASTER_ID", "VESSEL_ID",
            "PARAMETER_DESC", "PROXIMAL", "MID", "DISTAL", "OSTIUM",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID", "CRTD_BY_NAME"};

        String query
                = "SELECT ARP.ID, ARP.ANGIO_MASTER_ID,              \n"
                + "       ARP.VESSEL_ID,                         \n"
                + "       APR.DESCRIPTION PARAMETER_DESC,           \n"
                + "       ARP.PrOXIMAL,                             \n"
                + "       ARP.MID, ARP.OSTIUM,                      \n"
                + "       ARP.DISTAL,                               \n"
                + "       ARP.CRTD_BY, USR.NAME CRTD_BY_NAME,       \n"
                + "       ARP.CRTD_DATE,                            \n"
                + "       ARP.CRTD_TERMINAL_ID                      \n"
                + "  FROM " + Database.DCMS.angioReportingVessel + " ARP, \n"
                + Database.DCMS.definitionTypeDetail + " APR,       \n"
                + Database.DCMS.users + " USR                       \n"
                + "  WHERE ARP.ANGIO_MASTER_ID = '" + angioId + "'  \n"
                + "  AND ARP.VESSEL_ID = APR.ID             \n"
                + "  AND ARP.CRTD_BY = USR.USER_NAME                \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<AngioReporting> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            AngioReporting setAngio = new AngioReporting();

            setAngio.setParameterPk(map.get("ID").toString());
            setAngio.setAngioMasterId(map.get("ANGIO_MASTER_ID").toString());
            setAngio.setAngioParameterId(map.get("VESSEL_ID").toString());
            setAngio.setAngioParameterDescription(map.get("PARAMETER_DESC").toString());
            setAngio.setProximal(map.get("PROXIMAL").toString());
            setAngio.setMid(map.get("MID").toString());
            setAngio.setDistal(map.get("DISTAL").toString());
            setAngio.setOstium(map.get("OSTIUM").toString());
            setAngio.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            setAngio.setCrtdBy(map.get("CRTD_BY").toString());
            setAngio.setCrtdDate(map.get("CRTD_DATE").toString());
            setAngio.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setAngio);
        }
        return list;
    }

    public boolean insertAngioAdditionalInfo(AngioReporting angio) {

        String[] columns = {Database.DCMS.angioadditionalInfo,
            "ID", "ANGIO_MASTER_ID", "ADDITIONAL_INFO_ID", "INFO_VALUE",
            "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID)+1, 1) ID FROM "
                + Database.DCMS.angioadditionalInfo + ")");
        map.put("ANGIO_MASTER_ID", "'" + angio.getAngioMasterId() + "'");
        map.put("ADDITIONAL_INFO_ID", "'" + angio.getAdditionalInfoId() + "'");
        map.put("INFO_VALUE", "'" + angio.getInfoValue() + "'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<AngioReporting> selectAngioAdditionalInfo(String angioId) {

        String[] selectColumns = {"-", "ID", "ANGIO_MASTER_ID", "ADDITIONAL_INFO_ID",
            "ADDITIONAL_INFO_DESC", "INFO_VALUE", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID", "CRTD_BY_NAME"};

        String query
                = "SELECT ARP.ID, ARP.ANGIO_MASTER_ID,              \n"
                + "       ARP.ADDITIONAL_INFO_ID,                   \n"
                + "       AID.DESCRIPTION ADDITIONAL_INFO_DESC,     \n"
                + "       ARP.INFO_VALUE,                           \n"
                + "       ARP.CRTD_BY, USR.NAME CRTD_BY_NAME,       \n"
                + "       ARP.CRTD_DATE,                            \n"
                + "       ARP.CRTD_TERMINAL_ID                      \n"
                + "  FROM " + Database.DCMS.angioadditionalInfo + " ARP, \n"
                + Database.DCMS.definitionTypeDetail + " AID,       \n"
                + Database.DCMS.users + " USR                       \n"
                + "  WHERE ARP.ANGIO_MASTER_ID = '" + angioId + "'  \n"
                + "  AND ARP.ADDITIONAL_INFO_ID = AID.ID            \n"
                + "  AND ARP.CRTD_BY = USR.USER_NAME                \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<AngioReporting> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            AngioReporting setAngio = new AngioReporting();

            setAngio.setAdditionalInfoPK(map.get("ID").toString());
            setAngio.setAngioMasterId(map.get("ANGIO_MASTER_ID").toString());
            setAngio.setAdditionalInfoId(map.get("ADDITIONAL_INFO_ID").toString());
            setAngio.setAdditionalInfoDescription(map.get("ADDITIONAL_INFO_DESC").toString());
            setAngio.setInfoValue(map.get("INFO_VALUE").toString());
            setAngio.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            setAngio.setCrtdBy(map.get("CRTD_BY").toString());
            setAngio.setCrtdDate(map.get("CRTD_DATE").toString());
            setAngio.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(setAngio);
        }
        return list;
    }

    public boolean deleteCatheterInfo(String id) {
        String query
                = " DELETE FROM " + Database.DCMS.angioReportingCatheter + "\n"
                + " WHERE ID = '" + id + "'\n";

        return Constants.dao.executeUpdate(query, false);
    }
    
    public boolean deleteParameterInfo(String id) {
        String query
                = " DELETE FROM " + Database.DCMS.angioReportingVessel + "\n"
                + " WHERE ID = '" + id + "'\n";

        return Constants.dao.executeUpdate(query, false);
    }

}
