/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.ARCFitnessBO;
import Handler.Administration.ARCFitnessHandler;
import java.util.List;
import org.bridj.demangling.Demangler;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class ARCFitnessController {

    ARCFitnessHandler hdlFitness = new ARCFitnessHandler();

    public List<ARCFitnessBO> selectARCFitness(String con, String odi) {
        return hdlFitness.selectARCFitness(con, odi);
    }

    public boolean saveARCArmyFitness(ARCFitnessBO objRv) {
        boolean ret = hdlFitness.saveARCArmyFitness(objRv);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertARCArmyFitness(String con, String odi) {
        boolean ret = hdlFitness.insertARCArmyFitness(con, odi);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }
}
