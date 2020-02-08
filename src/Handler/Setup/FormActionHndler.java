/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Setup;

import BO.Setup.FormActionBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class FormActionHndler {

    String[] selectColumns = {"-", "ID", "DESCRIPTION", "FORM_ID",
        "FORM_NAME", "REMARKS", "ACTIVE", "CRTD_BY", "CRTD_DATE",
        "CRTD_TERMINAL_ID"};

    String generalQuery
            = "SELECT FA.ID, FA.DESCRIPTION, FA.FORM_ID, FRM.NAME FORM_NAME,\n"
            + "FA.REMARKS, FA.ACTIVE, FA.CRTD_BY, FA.CRTD_DATE,     \n"
            + "FA.CRTD_TERMINAL_ID FROM                             \n"
            + Database.DCMS.formWiseAction + " FA,                  \n"
            + Database.DCMS.form + " FRM                            \n";

    String generalJois
            = "AND FA.FORM_ID = FRM.ID                              \n";

    private List<FormActionBO> selectFormActionInformation(List<HashMap> selectData) {

        List<FormActionBO> list = new ArrayList();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap map = (HashMap) selectData.get(i);
            FormActionBO pofEmp = new FormActionBO();
            pofEmp.setActionId(map.get("ID").toString());
            pofEmp.setActionDescription(map.get("DESCRIPTION").toString());
            pofEmp.setFormId(map.get("FORM_ID").toString());
            pofEmp.setFormDescription(map.get("FORM_NAME").toString());
            pofEmp.setRemarks(map.get("REMARKS").toString());
            pofEmp.setActive(map.get("ACTIVE").toString());
            pofEmp.setCrtdBy(map.get("CRTD_BY").toString());
            pofEmp.setCrtdDate(map.get("CRTD_DATE").toString());
            pofEmp.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(pofEmp);
        }
        return list;
    }

    public List<FormActionBO> selectIdWiseAction(String actionId) {
        String query
                = generalQuery
                + " WHERE ID = " + actionId + " \n"
                + generalJois;
        return selectFormActionInformation(Constants.dao.selectDatainList(query,
                selectColumns));
    }

    public List<FormActionBO> selectNameWiseAction(String actionDesc) {
        String query
                = generalQuery
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + actionDesc.toUpperCase() + "%' "
                + generalJois;
        return selectFormActionInformation(Constants.dao.selectDatainList(query,
                selectColumns));
    }

    public List<FormActionBO> selectFormWiseAction(String fromId) {
        String query
                = generalQuery
                + " WHERE FORM_ID = " + fromId + " \n"
                + generalJois;
        return selectFormActionInformation(Constants.dao.selectDatainList(query,
                selectColumns));
    }

    public boolean insertFormAction(FormActionBO action) {

        String[] columns = {Database.DCMS.formWiseAction, "ID", "DESCRIPTION",
            "FORM_ID", "REMARKS", "ACTIVE", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "(SELECT NVL(MAX(ID) + 1, 1) ID FROM " + Database.DCMS.formWiseAction + ")");
        map.put("DESCRIPTION", "'" + action.getActionDescription() + "'");
        map.put("FORM_ID", "'" + action.getFormId() + "'");
        map.put("REMARKS", "'" + action.getRemarks() + "'");
        map.put("ACTIVE", "'Y'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public boolean updateFormAction(FormActionBO updateAction) {
        String query
                = " UPDATE " + Database.DCMS.formWiseAction + "\n"
                + " SET DESCRIPTION  = '" + updateAction.getActionDescription() + "',\n"
                + " FORM_ID  = '" + updateAction.getFormId() + "'\n"
                + " REMARKS  = '" + updateAction.getRemarks() + "',\n"
                + " ACTIVE  = '" + updateAction.getActive() + "'\n"
                + " WHERE ID = '" + updateAction.getActionId() + "'\n";

        return Constants.dao.executeUpdate(query, false);
    }
}
