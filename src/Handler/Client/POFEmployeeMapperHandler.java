/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Client;

import BMT.BO.CompoundingBO;
import BO.Client.POFEmployeeMapperBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class POFEmployeeMapperHandler {

    String[] selectColumns = {"-", "POF_ID", "POF_DESCRIPTION", "HMIS_ID",
        "ACTION_ID", "DESCRIPTION", "ACTIVE", "CRTD_BY", "CRTD_DATE",
        "CRTD_TERMINAL_ID"};

    String generalQuery
            = "SELECT PEM.POF_ID, PEM.POF_DESCRIPTION, PEM.HMIS_ID, DTD.DESCRIPTION,\n"
            + "PEM.ACTION_ID, PEM.ACTIVE, PEM.CRTD_BY, PEM.CRTD_DATE, PEM.CRTD_TERMINAL_ID\n"
            + "  FROM " + Database.DCMS.pofEmpMapper + " PEM, \n"
            + Database.DCMS.definitionTypeDetail + " DTD\n";

    String generalJois
            = "AND DTD.ID = PEM.HMIS_ID\n";

    private List<POFEmployeeMapperBO> selectMapperInformation(List<HashMap> selectData) {

        List<POFEmployeeMapperBO> list = new ArrayList();
        for (int i = 0; i < selectData.size(); i++) {
            HashMap map = (HashMap) selectData.get(i);
            POFEmployeeMapperBO pofEmp = new POFEmployeeMapperBO();
            pofEmp.setUpdatePofId(map.get("POF_ID").toString());
            pofEmp.setPofId(map.get("POF_ID").toString());
            pofEmp.setPofDescription(map.get("POF_DESCRIPTION").toString());
            pofEmp.setUpdateHmisId(map.get("HMIS_ID").toString());
            pofEmp.setHmisId(map.get("HMIS_ID").toString());
            pofEmp.setHmisDescription(map.get("DESCRIPTION").toString());
            pofEmp.setActionId(map.get("ACTION_ID").toString());
            pofEmp.setActive(map.get("ACTIVE").toString());
            pofEmp.setCrtdBy(map.get("CRTD_BY").toString());
            pofEmp.setCrtdDate(map.get("CRTD_DATE").toString());
            pofEmp.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            list.add(pofEmp);
        }
        return list;
    }

    public List<POFEmployeeMapperBO> selectActionWiseMapper(String actionId) {

        String query
                = generalQuery
                + " WHERE PEM.ACTION_ID = " + actionId + "\n"
                + generalJois;

        return selectMapperInformation(
                Constants.dao.selectDatainList(query, selectColumns));
    }

    public List<POFEmployeeMapperBO> selectDescriptioWiseMapper(String actionId,
            String description) {

        String query
                = generalQuery
                + " WHERE PEM.ACTION_ID = " + actionId + "\n"
                + " AND UPPER(PEM.POF_DESCRIPTION) LIKE '%" 
                + description.toUpperCase() + "%'\n"
                + generalJois;

        return selectMapperInformation(
                Constants.dao.selectDatainList(query, selectColumns));
    }

    public List<POFEmployeeMapperBO> selectDefinitionType() {

        String[] selectColumns = {"-", "ID", "DESCRIPTION"};

        String query
                = "SELECT DT.ID, DT.DESCRIPTION                 \n"
                + "FROM " + Database.DCMS.definitionType + " DT \n"
                + " WHERE DT.ID IN (SELECT ACTION_ID FROM "
                + Database.DCMS.pofEmpMapper + ")"
                + " AND DT.ACTIVE = 'Y'                        \n";

        List selectInvoice = Constants.dao.selectDatainList(query, selectColumns);

        List<POFEmployeeMapperBO> list = new ArrayList();
        for (int i = 0; i < selectInvoice.size(); i++) {
            HashMap map = (HashMap) selectInvoice.get(i);
            POFEmployeeMapperBO setDefType = new POFEmployeeMapperBO();

            setDefType.setDefId(map.get("ID").toString());
            setDefType.setDefDescription(map.get("DESCRIPTION").toString());
            list.add(setDefType);
        }
        return list;
    }

    public boolean updateMapper(POFEmployeeMapperBO updateMapper) {
        String query
                = " UPDATE " + Database.DCMS.pofEmpMapper + "\n"
                + " SET POF_ID  = '" + updateMapper.getPofId() + "',\n"
                + " POF_DESCRIPTION  = '" + updateMapper.getPofDescription() + "',\n"
                + " HMIS_ID  = '" + updateMapper.getUpdateHmisId() + "'\n"
                + " WHERE ACTION_ID = '" + updateMapper.getActionId() + "'\n"
                + " AND HMIS_ID = '" + updateMapper.getHmisId() + "'\n"
                + " AND POF_ID = '" + updateMapper.getPofId() + "'\n";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean deleteMapper(POFEmployeeMapperBO updateMapper) {
        String query
                = " DELETE FROM " + Database.DCMS.pofEmpMapper + "\n"
                + " WHERE ACTION_ID = '" + updateMapper.getActionId() + "'"
                + " AND HMIS_ID = '" + updateMapper.getHmisId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }

    public boolean insertMapper(POFEmployeeMapperBO mapper) {

        String[] columns = {Database.DCMS.pofEmpMapper, "POF_ID", "POF_DESCRIPTION",
            "HMIS_ID", "ACTION_ID", "ACTIVE", "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("POF_ID", "'" + mapper.getPofId() + "'");
        map.put("HMIS_ID", "'" + mapper.getHmisId() + "'");
        map.put("POF_DESCRIPTION", "'" + mapper.getPofDescription() + "'");
        map.put("ACTION_ID", "'" + mapper.getActionId() + "'");
        map.put("ACTIVE", "'Y'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }
}
