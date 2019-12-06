/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.Controller;

import CardiacRegistry.BO.CardiacSurgeryBO;
import BO.Patient;
import CardiacRegistry.BO.OutsidePatientRegistry;
import CardiacRegistry.Handler.CardiacSurgeryHandler;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;

/**
 *
 * @author admin
 */
public class CardiacSurgeryController {

    GenerateKeys key = new GenerateKeys();
    CardiacSurgeryHandler hdlCardiacSurg = new CardiacSurgeryHandler();

    public List<OutsidePatientRegistry> selectPateitnInformation(String patientId, 
            String patientName, String instituteId) {
        return hdlCardiacSurg.selectPateitnInformation(patientId, patientName, instituteId);
    }

    public CardiacSurgeryBO selectCardiacSurgDetail(String id) {
        return hdlCardiacSurg.selectCardiacSurgDetail(id);
    }

    public boolean insertCardiacRegisteryMaster(CardiacSurgeryBO insert) {
        insert.setId(key.generatePrimaryKey(Keys.cardiacSurgeryPK, true));
        boolean ret = hdlCardiacSurg.insertCardiacRegisteryMaster(insert);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCardiacRegisteryMaster(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateCardiacRegisteryMaster(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean FinalCardiacRegisteryMaster(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateCardiacRegisteryMaster(cardiac);
//        if (ret) {
//            String query
//                    = " UPDATE " + Database.DCMS. + "        \n"
//                    + " SET EXAM_DETAIL_ID  = '" + cardiac.getExamDetailId() + "'\n"
//                    + " WHERE CARDIAC_ID = '" + cardiac.getId() + "'             \n"
//                    + " AND EXAM_TYPE_ID = '" + cardiac.getExamId() + "'         \n";
//
//            ret = Constants.dao.executeUpdate(query, false);
//        }
        if (ret) {
            String query
                    = " INSERT INTO " + Database.DCMS.cardiacHistoryDetail + "  \n"
                    + "(SELECT " + cardiac.getId() + ", DEF.ID,'','', '' FROM   \n"
                    + Database.DCMS.definitionType + " DEF                      \n"
                    + "  WHERE DEF.COMMENTS = 'CARDIAC-REGISTRY')               \n";

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<CardiacSurgeryBO> selectExamDetail(String cardiacId) {
        return hdlCardiacSurg.selectExamDetail(cardiacId);
    }

    public boolean insertExamDetail(List<CardiacSurgeryBO> listExam, String id) {
        boolean ret = hdlCardiacSurg.insertExamDetail(listExam, id);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateExamDetail(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateExamDetail(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateExamDetailRemarks(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateExamDetailRemarks(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertcardiacProcedureDetail(CardiacSurgeryBO insert) {
        boolean ret = hdlCardiacSurg.insertCardiacProcedureDetail(insert);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateCardiacProcedureDetail(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updateCardiacProcedureDetail(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<CardiacSurgeryBO> selectCardiacProcedureDetail(String cardiacId) {
        return hdlCardiacSurg.selectCardiacProcedureDetail(cardiacId);
    }

    public boolean cancelProcedure(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.cancelProcedure(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    // Pre Medications Work
    

    public boolean insertPreMedications(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.insertPreMedications(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updatePreMedications(CardiacSurgeryBO cardiac) {
        boolean ret = hdlCardiacSurg.updatePreMedications(cardiac);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<CardiacSurgeryBO> selectPreMedications(String cardiacId) {
        return hdlCardiacSurg.selectPreMedications(cardiacId);
    }
}
