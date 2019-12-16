/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.OPD;

import BO.OPD.DengueFeverAssesmentBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class DengueFeverAssesmentHandler {

    public List<DengueFeverAssesmentBO> selectDengueDefinitions(String detailId) {

        String colums[] = {"-", "CON", "ODI", "ID", "DEF_TYPE_ID", "DESCRIPTION",
            "ADDITIONAL_INFO", "SELECTION", "RESULT"};

        String query
                = " SELECT DAM.CON, DAM.ODI, DTD.ID, DTD.DEF_TYPE_ID, DTD.DESCRIPTION,    \n"
                + "DTD.ADDITIONAL_INFO, Nvl(DAM.SELECTION, ' ') SELECTION,"
                + " NVL(RES.DESCRIPTION, ' ') RESULT \n"
                + " FROM " + Database.DCMS.definitionTypeDetail + " DTD,\n"
                + Database.DCMS.dengueAssestmentMaster + " DAM,          \n"
                + Database.DCMS.definitionTypeDetail + " RES             \n"
                + " WHERE DAM.EXAMID = DTD.ID                           \n"
                + " AND NVL(DAM.SELECTION, -1) = NVL(RES.ID, -1)        \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<DengueFeverAssesmentBO> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            DengueFeverAssesmentBO objParameter = new DengueFeverAssesmentBO();

            objParameter.setCON(map.get("CON").toString());
            objParameter.setODI(map.get("ODI").toString());
            objParameter.setDetailId(map.get("ID").toString());
            objParameter.setDefTypeId(map.get("DEF_TYPE_ID").toString());
            objParameter.setDetailDescription(map.get("DESCRIPTION").toString());
            objParameter.setAdditionlaInfo(map.get("ADDITIONAL_INFO").toString());
            if (objParameter.getAdditionlaInfo().equalsIgnoreCase("RE")) {
                objParameter.setResultId(map.get("SELECTION").toString());
                objParameter.setResult(map.get("SELECTION").toString());
            } else {
                objParameter.setResultId(map.get("SELECTION").toString());
                objParameter.setResult(map.get("RESULT").toString());
            }

            listParameter.add(objParameter);
        }
        return listParameter;
    }

    public boolean updateDengueAsst(DengueFeverAssesmentBO objUpdt) {
        String query
                = " UPDATE " + Database.DCMS.dengueAssestmentMaster + "\n"
                + " SET SELECTION = '" + objUpdt.getResultId() + "'\n"
                + " WHERE CON = '" + objUpdt.getCON() + "'\n"
                + " AND ODI = '" + objUpdt.getODI() + "'\n"
                + " AND EXAM_ID = '" + objUpdt.getDetailId() + "'";

        return Constants.dao.executeUpdate(query, false);
    }
}
