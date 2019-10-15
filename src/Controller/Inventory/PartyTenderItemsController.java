/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Inventory;

import BO.Inventory.PartyTenderItems;
import Handler.Inventory.PartyTenderItemsHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Talha Khan
 */
public class PartyTenderItemsController {
    
    PartyTenderItemsHandler hdlPartyItems = new PartyTenderItemsHandler();
    public List<PartyTenderItems> selectTenderWiseParty(String tenderId,
            String partyId) {
        return hdlPartyItems.selectTenderWiseParty(tenderId, partyId);
    }
    
    public List<PartyTenderItems> selectPartyWiseItems(String tenderId, 
            String partyId, String itemId) {
        return hdlPartyItems.selectPartyWiseItems(tenderId, partyId, itemId);
    }
    
    public boolean deletePartyItem(PartyTenderItems objDlt){
        boolean ret = hdlPartyItems.deletePartyItem(objDlt);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updatePartyWiseItem(PartyTenderItems objUpdate){
        boolean ret = hdlPartyItems.updatePartyWiseItem(objUpdate);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean addPartyItem(PartyTenderItems objInr) {
        boolean ret = hdlPartyItems.addPartyItem(objInr);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public List<PartyTenderItems> selectFromItems(String itemId) {
        return hdlPartyItems.selectFromItems(itemId);
    }
    
    public boolean addPartyInTender(PartyTenderItems objInr) {
        boolean ret = hdlPartyItems.addPartyInTender(objInr);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean deleteTenderParty(PartyTenderItems objDlt){
        boolean ret = hdlPartyItems.deleteTenderParty(objDlt);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}
