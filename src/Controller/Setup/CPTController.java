package Controller.Setup;

import BO.CPT.CPT;
import BO.CPT.CPTWiseParameter;
import BO.SetupColumnDetail;
import Controller.ReportsController;
import Handler.Setup.CPTHandler;
import Handler.Setup.CPTSetupHandler;
import Handler.Setup.ClientHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;

import javax.swing.JOptionPane;
import utilities.PrintJasperReport;

public class CPTController implements java.io.Serializable {

    ClientHandler hdlClient = new ClientHandler();
    CPTHandler hdlCPT = new CPTHandler();
    CPTSetupHandler hdlCPTSetup = new CPTSetupHandler();
    SetupColumnDetailController ctlSetupDetail = new SetupColumnDetailController();
    CPTConfigurationController ctlCPT = new CPTConfigurationController();

    String tableRowIdforCopy = " ";

    public boolean updateCPT(CPT cpt) {

        return hdlCPT.updateCPT(cpt);
    }

    public boolean saveCPTDetailHistory(List<SetupColumnDetail> listCpt, List<SetupColumnDetail> loc1) {

        boolean ret = true;
        ret = insertCPTDetailsHistory(listCpt, loc1);
        if (ret) {
            Constants.dao.commitTransaction();
            return true;
        } else {
            Constants.dao.rollBack();
            return false;
        }
    }

    //INSERTS CPT HISTORY WITH THE MOST RECENT UPDATED PROPERTY
    public boolean insertCPTDetailsHistory(List listDetail, List list1) {
        boolean ret = true;

        for (int i = 0; i < listDetail.size(); i++) {
            CPT c1 = (CPT) listDetail.get(i);
            CPT c2 = (CPT) list1.get(i);
            if (!(c1.description.equals(c2.description))) {
                CPT cpt = (CPT) listDetail.get(i);
                if (!hdlCPTSetup.insertCPTDetailsHistory(cpt)) {
                    ret = false;
                    break;
                }

            }
        }

        if (ret) {
            Constants.dao.commitTransaction();
            return true;
        } else {
            Constants.dao.rollBack();
            return false;
        }
    }

    public void selectDefaultCPT(CPT cpt) {
        hdlCPT.selectDefaultCPT(cpt);
        hdlCPT.selectLastCPT(cpt);
        if (cpt.defaultCPTId.equalsIgnoreCase("0")) {
            cpt.defaultCPTId = "";
        }

    }

    public boolean saveCPT(CPT cpt) {

        boolean ret = hdlCPT.saveCPT(cpt);

        if (ret) {
            ret = insertDefaultCPTProperty(cpt.cptId, cpt.defaultCPTId);
        }

        if (ret && Constants.userId.equalsIgnoreCase(Constants.systemAdministrator)) {
            ret = ctlCPT.copyCPTProperties(cpt.cptId, cpt.defaultCPTId);
        }
        if (ret) {
            saveCPTHistory(cpt);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertDefaultCPTProperty(String newCptId, String defaultCptId) {

        String query = "INSERT INTO " + Database.DCMS.setupColumnDetail
                + " (SELECT '" + newCptId + "', TABLE_COLUMN_ID, "
                + " DESCRIPTION, '" + Constants.userId + "',SYSDATE,'" + Constants.terminalId
                + "' FROM " + Database.DCMS.setupColumnDetail
                + " WHERE TABLE_ROW_ID = '" + defaultCptId + "') ";

        return Constants.dao.executeUpdate(query, false);

    }

    public boolean insertCPTWiseProperty(String id) {

        boolean ret = true;
        List<CPT> list = hdlCPTSetup.searchProperty();
        for (int i = 0; i < list.size(); i++) {
            CPT lo = new CPT();
            lo.tableColumnId = list.get(i).setupTableColumnId;
            lo.tableRowId = id;
            lo.description = "";
            ret = hdlCPTSetup.insertCPTDetails(lo);
            if (!ret) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public boolean saveCPTHistory(CPT cpt) {

        boolean ret = true;
        ret = hdlCPT.saveCPTHistory(cpt);

        if (ret) {
            Constants.dao.commitTransaction();
            return true;
        } else {
            Constants.dao.rollBack();
            return false;
        }
    }

    public boolean insertProperty(String property, String defaultValue) {

        return ctlSetupDetail.insertSetupProperty(property, defaultValue,
                utilities.SetupTableColumns.cpt, hdlCPT.getALlCptId());
    }

    public List<CPT> searchProperty(String propertyName) {

        return hdlCPTSetup.searchCPTFields(propertyName);

    }

    public List<CPT> searchCPT(String description, String department,
            String section, String status) {

        return hdlCPT.SelectCPT(description, department,
                section, status);

    }

    //COPY ANOTHER CPT PROPERTIES TO A SELECTED CPT 
    public boolean saveCopiedCPTDetailsHistory(List listCopyDetail) {
        boolean ret = true;

        for (int i = 0; i < listCopyDetail.size(); i++) {
            CPT cc = (CPT) listCopyDetail.get(i);
            if (!hdlCPTSetup.insertCPTDetailsHistory(cc)) {
                ret = false;
                break;
            }
        }

        if (ret) {
            Constants.dao.commitTransaction();
            return true;
        } else {
            Constants.dao.rollBack();
            return false;
        }
    }

    public List<CPT> searchCPTDetails(String cptId) {

        return hdlCPTSetup.searchCPTDetails(cptId);

    }

    public boolean insertCPT(CPT cpt) {
        return true;
    }

    public int setClientPackageCPT(String packageId,
            String clientId, Vector orders, String performingContractId,
            String patientId) {
        return hdlCPT.setClientPackageCPT(packageId, clientId, orders,
                performingContractId, patientId);
    }

    public Vector selectCptForClient(String description, String department,
            String section, String clientId) {

        Vector clientCpts = new Vector();
        clientCpts.add(hdlCPT.selectClientAttachedCPT(description, department, section, clientId));
        clientCpts.add(hdlCPT.selectClientUnAttachedCPT(description, department, section, clientId));

        return clientCpts;

    }

    public boolean insertCPTPerformDays(String cptId) {

        return hdlCPT.insertCPTReportDays(cptId);

    }

    public boolean searchCPT(String cptId) {

        String[] cols = {"", "CPT_ID"};

        String query = " SELECT CPT_ID FROM " + Database.DCMS.CPT
                + " WHERE UPPER(CPT_ID) = '" + cptId.toUpperCase() + "' \n";

        List list = Constants.dao.selectDatainList(query, cols);

        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public Vector getSearchClientCPT(CPT cpt) {

        return hdlCPT.selectClientWiseCPT(cpt);
    }

    public boolean updateClientCPT(Vector vecCPT, CPT editInfo) {

        boolean ret = true;
        Vector queries = new Vector();
        for (int i = 0; i < vecCPT.size(); i++) {
            CPT cpt = (CPT) vecCPT.get(i);
            String query = " UPDATE " + Database.DCMS.clientWiseCPT
                    + " SET CONTRACT_STATUS = 'Y', \n"
                    + " CONTRACT_PRICE  = '" + cpt.clientPrice + "', \n"
                    + " PERCENTAGE_DISCOUNT = '" + editInfo.discount + "' \n"
                    + " WHERE CLIENT_ID  = '" + cpt.clientId + "' \n"
                    + " AND CPT_ID = '" + cpt.cptId + "' \n";

            queries.add(query);
            if (!hdlClient.insertClientCPTUpdateHistory(cpt)) {
                ret = false;
                break;
            }
        }
        if (ret) {
            ret = Constants.dao.executeUpdates(queries);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCPTParamter(CPTWiseParameter cpt) {

        String query = " UPDATE " + Database.DCMS.CPTWiseParameter
                + " \n SET DEFAULT_VALUE = '" + cpt.getDefaultValue() + "', \n"
                + " COMMENTS = '" + cpt.getComments() + "', \n"
                + " REPORT_GROUP = '" + cpt.getReportGroup() + "' \n"
                + " WHERE ID = '" + cpt.getId() + "'\n   ";

        return Constants.dao.executeUpdate(query, true);
    }

    public void getSectionOnly(String department) {

        if (department.equalsIgnoreCase(Departments.pathology)) {
            hdlCPT.getPathologySectionsOnly(department);
        } else {
            hdlCPT.getImagingSectionsOnly(department);
        }
    }

    public void printReport(String completeOrderNo, String orderDetailId,
            String reportId, String viewPrint, String uniqueId) {

        if (reportId == null) {
            JOptionPane.showMessageDialog(null, "Unable to Display Report "
                    + " Kindly Contact Administrator");
            return;
        }
        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(reportId);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        ReportsController rep = new ReportsController();
        BO.Reports re = new BO.Reports();
        re.setCompleteOrderNo(completeOrderNo);
        re.setOrderDetailId(orderDetailId);
        re.setActionType(viewPrint);
        if (rep.insertReportAction(re)) {
            print.printImagingReport(report.getReportPath(), report.getReportFilePath(),
                    Constants.outReportPath + uniqueId + ".pdf", viewPrint,
                    completeOrderNo, orderDetailId);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Display Report "
                    + "Kindly Contact Administrator");
        }
    }

    public void setCPTCodes() {

        hdlCPT.setCPTCodes();
    }

    public String selectTubeCodeId(String cptId) {

        return hdlCPT.selectTubeCodeId(cptId);
    }

    public List<CPT> selectCPTToDefine() {

        String[] cols = {"", "CPT_ID", "DEFAULT_CPT_ID"};

        String query = " SELECT CPT_ID , SUB_SECTION_ID  DEFAULT_CPT_ID FROM "
                + Database.DCMS.CPT
                + " WHERE ACTIVE = 'D' \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        List<CPT> listCPTs = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            CPT cpt = new CPT();
            cpt.cptId = map.get("CPT_ID").toString();
            cpt.defaultCPTId = map.get("DEFAULT_CPT_ID").toString();
            listCPTs.add(cpt);
        }

        return listCPTs;
    }

    public boolean defineCPT(CPT cpt) {

        boolean ret = true;
        if (ret) {
            ret = insertDefaultCPTProperty(cpt.cptId, cpt.defaultCPTId);
        }
        if (ret) {
            ret = ctlCPT.copyCPTProperties(cpt.cptId, cpt.defaultCPTId);
        }
        if (ret) {
            ret = Constants.dao.executeUpdate(" UPDATE EMR.CPT SET ACTIVE ='Y' "
                    + " WHERE CPT_ID = '" + cpt.cptId + "'", false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}
