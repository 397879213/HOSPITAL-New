/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import BO.LOV;
import Handler.OPDHandler;
import java.util.List;

/**
 *
 * @author pacslink
 */
public class OPDController {

    
    private OPDHandler hdlOpd = new OPDHandler();
    
    public List<LOV> selectMedicineIntakeType() {
        return hdlOpd.selectMedicineIntakeType();
    }
    
}
