package Development.Handler;

import Development.BO.ERInvoiceBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

public class ERInvoiceHandler {

    public List<ERInvoiceBO> getInvoiceDetailClient(ERInvoiceBO dcsBO) {
        String[] columns = {"-", "DESCRIPTION", "INVOICE_NO",
            "PRICE", "TOTAL_AMOUNT", "INVOICE_BY"};

        String query = "SELECT \n"
                + "DES.DESCRIPTION                       DESCRIPTION,\n"
                + "IVM.INVOICE_NO                        INVOICE_NO,\n"
                + "IVD.PRICE                             PRICE,\n"
                + "IVD.TOTAL_AMOUNT                    TOTAL_AMOUNT,\n"
                + "USR.NAME                        INVOICE_BY\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.invoiceDetail + "         IVD , \n"
                + Database.DCMS.client + "         CL ,         \n"
                + Database.DCMS.users + "         USR ,         \n";
        if (dcsBO.getCompleteOrderNo().equalsIgnoreCase("002")) {

            query += Database.DCMS.item + " DES \n "
                    + " WHERE IVD.SECTION_ID='ITEM'  \n"
                    + "AND IVD.CPT_ID=DES.ID             \n ";
        } else {
            query += Database.DCMS.CPT + "                   DES \n"
                    + "WHERE  IVD.CPT_ID = DES.CPT_ID \n";
        }
        query += "AND IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n"
                + "AND IVD.INVOICE_NO = '" + dcsBO.getInvoiceNo() + "'\n"
                + "AND IVM.INVOICE_NO=IVD.INVOICE_NO    \n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                +" AND IVM.INVOICE_BY=USR.USER_NAME \n"
                + "AND IVM.PAYMENT_MODE_ID = '62' \n"
                + "AND IVM.CLIENT_ID = CL.ID \n"
                + "ORDER BY IVM.INVOICE_DATE,  IVD.SECTION_ID";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<ERInvoiceBO> lisins = new ArrayList<>();
        int totalPayable = 0;

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            ERInvoiceBO objBo = new ERInvoiceBO();
            objBo.setDescription(map.get("DESCRIPTION").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setPrice(map.get("PRICE").toString());
            objBo.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());

            lisins.add(objBo);
        }
        return lisins;
    }

    public List<ERInvoiceBO> getInvoiceMasterClient(ERInvoiceBO dcsBO) {

        String[] columns = {"-", "PATIENT_ID", "FULL_NAME", "CLIENT_NAME", "INVOICE_NO", "TOTAL_AMOUNT",
            "COMPLETE_ORDER_NO", "LOCATION", "INVOICE_BY", "INVOICE_DATE"};

        String query = "SELECT IVM.PATIENT_ID  PATIENT_ID,\n"
                + "PAT.FULL_NAME                        FULL_NAME,\n"
                + "CL.DESCRIPTION                       CLIENT_NAME,\n"
                + "IVM.INVOICE_NO                       INVOICE_NO,\n"
                + "IVM.TOTAL_AMOUNT                      TOTAL_AMOUNT,\n"
                + "SUBSTR(IVM.COMPLETE_ORDER_NO,4,3)    COMPLETE_ORDER_NO,\n"
                + "LOC.DESCRIPTION                       LOCATION,\n"
                + "IVM.INVOICE_BY                           INVOICE_BY,\n"
                + "TO_CHAR(IVM.INVOICE_DATE,'DD-MON-YY HH:MM:SS AM') INVOICE_DATE\n"
                + " FROM " + Database.DCMS.invoiceMaster + "  IVM, \n"
                + Database.DCMS.patient + "               PAT, \n"
                + Database.DCMS.location + "               LOC, \n"
                + Database.DCMS.client + "               CL \n"
                + "WHERE IVM.LOCATION_ID =   NVL('" + dcsBO.getLocationId() + "',IVM.LOCATION_ID)\n";
        if (!dcsBO.getPatientId().equalsIgnoreCase("")) {
            query += " AND IVM.PATIENT_ID ='" + dcsBO.getPatientId() + "'                  \n";
        }
        if (!dcsBO.getPatFullName().equalsIgnoreCase("")) {
            query += " AND UPPER(PAT.FULL_NAME) LIKE '%" + dcsBO.getPatFullName().toUpperCase() + "%'                  \n";
        }
        if (!dcsBO.getFromDate().equalsIgnoreCase("") && !dcsBO.getToDate().equalsIgnoreCase("")) {
            query += "AND IVM.INVOICE_DATE  BETWEEN TO_DATE('" + dcsBO.getFromDate() + "' , \n"
                    + "'DD-MON-YY HH24:MI:SS' )  AND  TO_DATE('" + dcsBO.getToDate() + "' , 'DD-MON-YY HH24:MI:SS') \n";
                    
        }
        
        if (!dcsBO.getClientId().equalsIgnoreCase("")) {
            query += "AND IVM.CLIENT_ID = '" + dcsBO.getClientId() + "'\n"; 
        }
        query += "AND IVM.PATIENT_ID = PAT.PATIENT_ID \n"
                + "AND IVM.PAYMENT_MODE_ID NOT IN (70)\n"
                + "AND IVM.LOCATION_ID=LOC.ID \n"
                + "AND IVM.PAYMENT_MODE_ID = '62' \n"
                + "AND IVM.CLIENT_ID = CL.ID \n"
                + "ORDER BY IVM.INVOICE_DATE";

        List<HashMap> mapList = Constants.dao.selectDatainList(query, columns);
        List<ERInvoiceBO> lisins = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {

            HashMap map = (HashMap) mapList.get(i);
            ERInvoiceBO objBo = new ERInvoiceBO();
            objBo.setPatientId(map.get("PATIENT_ID").toString().substring(3));
            objBo.setPatFullName(map.get("FULL_NAME").toString());
            objBo.setClientName(map.get("CLIENT_NAME").toString());
            objBo.setInvoiceNo(map.get("INVOICE_NO").toString());
            objBo.setTotalAmount(map.get("TOTAL_AMOUNT").toString());
            objBo.setCompleteOrderNo(map.get("COMPLETE_ORDER_NO").toString());
            objBo.setInvoiceBy(map.get("INVOICE_BY").toString());
            objBo.setLocationName(map.get("LOCATION").toString());
            objBo.setInvoiceDate(map.get("INVOICE_DATE").toString());
            lisins.add(objBo);
        }
        return lisins;
    }

}
