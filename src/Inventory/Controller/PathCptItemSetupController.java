

package Inventory.Controller;

import Inventory.BO.PathCptItemSetup;
import Inventory.Handler.PathCptItemSetupHandler;
import java.util.List;

/**
 *
 * @author raheelansari
 */
public class PathCptItemSetupController {
    
    PathCptItemSetupHandler hdlPathCptItem = new PathCptItemSetupHandler();
    
    public List<PathCptItemSetup> searchCpt(String cptId, 
            String sectionId) {
        return hdlPathCptItem.searchCpt(cptId, sectionId);
    }
    
    public List<PathCptItemSetup> cptWiseCOnsumableItems(String cptId, 
            String itemDesc, String itemId) {
        return hdlPathCptItem.cptWiseCOnsumableItems(cptId, itemDesc, itemId);
    }
}
