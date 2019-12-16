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

        String colums[] = {"-", "ID", "DEF_TYPE_ID", "DESCRIPTION",
            "ADDITIONAL_INFO", "SELECTION", "RESULT"};

        String query
                = " SELECT DTD.ID, DTD.DEF_TYPE_ID, DTD.DESCRIPTION,    \n"
                + "DTD.ADDITIONAL_INFO, Nvl(DAM.SELECTION, ' ') SELECTION,"
                + " NVL(RES.DESCRIPTION, ' ') RESULT \n"
                + " FROM " + Database.DCMS.definitionTypeDetail + " DTD,\n"
                + Database.DCMS.dengueAssestmentMaster +" DAM,          \n"
                + Database.DCMS.definitionTypeDetail +" RES             \n"
                + " WHERE DAM.EXAMID = DTD.ID                           \n"
                + " AND NVL(DAM.SELECTION, -1) = NVL(RES.ID, -1)        \n";

        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
        List<DengueFeverAssesmentBO> listParameter = new ArrayList<>();
        for (HashMap map : lis) {

            DengueFeverAssesmentBO objParameter = new DengueFeverAssesmentBO();

            objParameter.setDetailId(map.get("ID").toString());
            objParameter.setDefTypeId(map.get("DEF_TYPE_ID").toString());
            objParameter.setDetailDescription(map.get("DESCRIPTION").toString());
            objParameter.setAdditionlaInfo(map.get("ADDITIONAL_INFO").toString());
            objParameter.setResultId(map.get("SELECTION").toString());
            objParameter.setResult(map.get("RESULT").toString());

            listParameter.add(objParameter);
        }
        return listParameter;
    }
}
