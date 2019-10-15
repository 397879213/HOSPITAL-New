

package Controller.Management;

import BO.Management.ErInvoiceBO;
import Handler.Management.InvoiceHandler;
import java.util.List;

public class InvoiceController {
    
    InvoiceHandler selecthdl=new InvoiceHandler();
      public List<ErInvoiceBO> getInvoiceDetailClient(ErInvoiceBO dcsBO){
         return selecthdl.getInvoiceDetailClient(dcsBO);
     }
     
     public List<ErInvoiceBO> getInvoiceMasterClient(ErInvoiceBO dcsBO){
         return selecthdl.getInvoiceMasterClient(dcsBO);
     }
    
}
