/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.DengueFeverAssesmentBO;
import Handler.OPD.DengueFeverAssesmentHandler;
import java.util.List;

/**
 *
 * @author admin
 */
public class DengueFeverAssesmentController {
    
    DengueFeverAssesmentHandler hdlDengue = new DengueFeverAssesmentHandler();
    
    public List<DengueFeverAssesmentBO> selectDengueDefinitions(String detailId) {
        return hdlDengue.selectDengueDefinitions(detailId);
    }
}