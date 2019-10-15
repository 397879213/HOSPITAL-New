

package Development.Controller;

import Development.BO.ERInvoiceBO;
import Development.Handler.ERInvoiceHandler;
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
