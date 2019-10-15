/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Inventory;


import BO.Inventory.PurchaseOrderDetailBO;
import Handler.Inventory.PurchaseOrderDetailHandler;

import java.util.List;

/**
 *
 * @author Muhammad Talha Khan
 */
public class PurchaseOrderDetailController {
    
     PurchaseOrderDetailHandler pruchaseOrder = new PurchaseOrderDetailHandler();
    
    public List<PurchaseOrderDetailBO> selectItemSearch(String itemName, String categoryId,
    String genericId){
        return pruchaseOrder.selectItemSearch(itemName,categoryId,genericId);
    
}
    
     public List<PurchaseOrderDetailBO> selectPurchaseOrderSearch(String itemId, 
            String partyId,String fromDate,String toDate){
        return pruchaseOrder.selectPurchaseOrderSearch(itemId,partyId,fromDate,
        toDate);
    
}
     
}
