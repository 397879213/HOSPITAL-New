/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.Controller;

import Inventory.BO.Party;
import Inventory.Handler.POFSuppHandler;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Mission
 */
public class POFSuppController {

    POFSuppHandler hdlSupp = new POFSuppHandler();

    public List<Party> selectSupplier(String suppDesc, String suppId) {

        return hdlSupp.selectSupplier(suppDesc, suppId);

    }

    public boolean fetchSupplier() {
        boolean ret = true;
        List<Party> listSupp = new ArrayList();
        listSupp = hdlSupp.selectPOFSupplier();
        for (int i = 0; i < listSupp.size(); i++) {
            Party sup = listSupp.get(i);
            ret = hdlSupp.insertParty(sup);
            if(ret){
                ret = hdlSupp.updateTransferStatus(sup);
            }
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
        }
        return ret;
    }
}
