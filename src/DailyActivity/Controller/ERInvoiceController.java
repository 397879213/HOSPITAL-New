

package DailyActivity.Controller;

import DailyActivity.BO.ERInvoiceBO;
import DailyActivity.Handler.ERInvoiceHandler;
import java.util.List;

public class ERInvoiceController {
    
    ERInvoiceHandler selecthdl=new ERInvoiceHandler();
      public List<ERInvoiceBO> getInvoiceDetailClient(ERInvoiceBO dcsBO){
         return selecthdl.getInvoiceDetailClient(dcsBO);
     }
     
     public List<ERInvoiceBO> getInvoiceMasterClient(ERInvoiceBO dcsBO){
         return selecthdl.getInvoiceMasterClient(dcsBO);
     }
    
}
