/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inventory.Controller;

import Inventory.BO.PathCptWiseTubes;
import Inventory.Handler.PathCptWiseTubesHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class PathCptWiseTubesController {
    
    PathCptWiseTubesHandler hdlPathCptWiseTubes = new PathCptWiseTubesHandler();
    
    public List<PathCptWiseTubes> selectPathCptWiseTubes(String cptId,
            String sectionId) {
        return hdlPathCptWiseTubes.selectPathCptWiseTubes(cptId, sectionId);
    }
    
    public boolean UpdatePathCptWiseTubes(PathCptWiseTubes objSave) {
        boolean ret = hdlPathCptWiseTubes.UpdatePathCptWiseTubes(objSave);
        if(ret){
            ret = hdlPathCptWiseTubes.insertPathCptWiseTubesHistory(objSave);
        }
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
   }
}
