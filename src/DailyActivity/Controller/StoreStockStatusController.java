/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DailyActivity.Controller;

import DailyActivity.BO.StoreStockStatusBO;
import DailyActivity.Handler.StoreStockStatusHandler;
import java.util.List;

/**
 *
 * @author Muhammad Talha Khan
 */
public class StoreStockStatusController {
    
     StoreStockStatusHandler strStock = new StoreStockStatusHandler();
    
    public List<StoreStockStatusBO> selectItemsSearch(String itemId ){
        return strStock.selectItemSearch(itemId);
    
}
}
