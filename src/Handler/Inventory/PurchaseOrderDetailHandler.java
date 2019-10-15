/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Inventory;


import BO.Inventory.PurchaseOrderDetailBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author Muhammad Talha Khan
 */
public class PurchaseOrderDetailHandler {
    
    
    
    public List<PurchaseOrderDetailBO> selectItemSearch(String itemName, String categoryId,
    String genericId) {
         
          String columns[] = {"-","ITEM_ID","DESCRIPTION","UNIT","REQ_ORDER_QTY",
              "PACK_SIZE", "SALE_PRICE","PURCHASE_PRICE","ITEM_TYPE_ID","ITEM_TYPE_DESCRIPTION",
              "GENERIC_ID","GENERIC_DESCRIPTION","CATEGORY_ID","CATEGORY_DESCRIPTION"
              ,"MANUFACTURE_ID","MANUFACTURE_DESCRIPTION", "USER_NAME","ACTIVE",
              "CRTD_DATE"};
          
     String query =" SELECT ITM.ID                  ITEM_ID,                 \n"
                  +" ITM.DESCRIPTION                DESCRIPTION,             \n"
                  +" ITM.UNIT                       UNIT,                    \n"
                  +" ITM.REQ_ORDER_QTY              REQ_ORDER_QTY,           \n"
                  +" NVL(ITM.PACK_SIZE,0)          PACK_SIZE,               \n"
                  +" ITM.SALE_PRICE                 SALE_PRICE,              \n"
                  +" ITM.PURCHASE_PRICE             PURCHASE_PRICE,          \n"
                  +" ITM.ITEM_TYPE_ID               ITEM_TYPE_ID,            \n"
                  +" TYP.DESCRIPTION                ITEM_TYPE_DESCRIPTION,   \n"
                  +" ITM.GENERIC_ID                 GENERIC_ID,              \n"
                  +" GEN.DESCRIPTION                GENERIC_DESCRIPTION,     \n"
                  +" ITM.CATEGORY_ID                CATEGORY_ID,             \n"
                  +" CAT.DESCRIPTION                CATEGORY_DESCRIPTION,    \n"
                  +" ITM.MANUFACTURE_ID             MANUFACTURE_ID,          \n"
                  +" PRT.DESCRIPTION                MANUFACTURE_DESCRIPTION, \n"
                  +" USR.NAME                       USER_NAME,               \n"
                  +" ITM.ACTIVE                     ACTIVE,                  \n"
                  +" TO_CHAR(ITM.CRTD_DATE, 'DD-MON-YY') CRTD_DATE           \n"
                  +" FROM " +Database.DCMS.item+         "ITM,               \n"
                  +  Database.DCMS.definitionTypeDetail+ "TYP,               \n"
                  +  Database.DCMS.definitionTypeDetail + "GEN,              \n"
                  +  Database.DCMS.definitionTypeDetail + "CAT,              \n"
                  +  Database.DCMS.party + "PRT,                             \n"
                  +  Database.DCMS.users + "USR                              \n"
                  +" WHERE 1=1                                               \n";
                 
                   if (itemName.length() != 0) {
                  query += "AND UPPER(ITM.DESCRIPTION) LIKE '%"+itemName+"%' \n";
                   }
                  if (categoryId.length() != 0) {
                  query += " AND ITM.CATEGORY_ID = '" + categoryId + "'      \n";
                   }
                  
                  if (genericId.length() != 0) {
                  query += " AND ITM.GENERIC_ID = '" + genericId + "'        \n";
                   }
                  
                  query +=" AND ITM.ITEM_TYPE_ID = TYP.ID                    \n"
                  +" AND ITM.GENERIC_ID = GEN.ID                             \n"
                  +" AND ITM.CATEGORY_ID = CAT.ID                            \n"
                  +" AND ITM.MANUFACTURE_ID = PRT.ID                         \n"
                  +" AND ITM.REQUESTED_BY = USR.USER_NAME                    \n"
                  +" ORDER BY ITM.DESCRIPTION                               \n";
                  
                  
          //System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<PurchaseOrderDetailBO> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              PurchaseOrderDetailBO objData = new PurchaseOrderDetailBO();
              
              objData.setItemId(map.get("ITEM_ID").toString());
              objData.setDescription(map.get("DESCRIPTION").toString());
              objData.setUnit(map.get("UNIT").toString());
              objData.setReqOrderQty(map.get("REQ_ORDER_QTY").toString());
              objData.setPackSize(map.get("PACK_SIZE").toString());
              objData.setSalePrice(map.get("SALE_PRICE").toString());
              objData.setPurchasePrice(map.get("PURCHASE_PRICE").toString());
              objData.setItemTypeId(map.get("ITEM_TYPE_ID").toString());
              objData.setItemTypeDescription(map.get("ITEM_TYPE_DESCRIPTION").toString());
              objData.setGenericId(map.get("GENERIC_ID").toString());
              objData.setGenericDescription(map.get("GENERIC_DESCRIPTION").toString());
              objData.setCategoryId(map.get("CATEGORY_ID").toString());
              objData.setCategoryDescription(map.get("CATEGORY_DESCRIPTION").toString());
              objData.setManufactureId(map.get("MANUFACTURE_ID").toString());
              objData.setManufactureDescription(map.get("MANUFACTURE_DESCRIPTION").toString());
              objData.setUserName(map.get("USER_NAME").toString());
              objData.setActive(map.get("ACTIVE").toString());
              objData.setCrtdDate(map.get("CRTD_DATE").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
     
    
    public List<PurchaseOrderDetailBO> selectPurchaseOrderSearch(String itemId, 
            String partyId,String fromDate,String toDate) {
         
          String columns[] = {"-","PURCHASE_ORDER_NO","ITEM_ID","ITEM_NAME","QUANTITY",
              "UNIT_PRICE", "PRICE","STATUS","STORE_ID","STORE_NAME",
              "PURCHASE_TYPE","TYPE_DESCRIPTIONS","PARTY_ID","PARTY_NAME"
              ,"CRTD_DATE","APPROVED_DATE", "APPROVE_BY"};
          
     String query =" SELECT POD.PURCHASE_ORDER_NO  PURCHASE_ORDER_NO,        \n"
                  +" POD.ITEM_ID                   ITEM_ID,                  \n"
                  +" ITM.DESCRIPTION               ITEM_NAME,                \n"
                  +" POD.QTY                       QUANTITY,                 \n"
                  +" POD.UNIT_PRICE                UNIT_PRICE,               \n"
                  +" POD.VALUE                     PRICE,                    \n"
                  +" STA.DESCRIPTION               STATUS,                   \n"
                  +" POM.STORE_ID                  STORE_ID,                 \n"
                  +" STR.DESCRIPTION               STORE_NAME,               \n"
                  +" POM.PURCHASE_TYPE             PURCHASE_TYPE,            \n"
                  +" TYP.DESCRIPTION               TYPE_DESCRIPTIONS,        \n"
                  +" POM.PARTY_ID                  PARTY_ID,                 \n"
                  +" PARTY.DESCRIPTION             PARTY_NAME,               \n"
                  +" TO_CHAR(POM.CRTD_DATE,'DD-MON-YY') CRTD_DATE,           \n"
                  +" TO_CHAR(POM.APPROVED_DATE, 'DD-MON-YY') APPROVED_DATE,  \n"
                  +" USR.NAME                      APPROVE_BY                \n"
                  +" FROM " +Database.Inventory.purchaseOrderDetail + " POD, \n"
                  +  Database.Inventory.purchaseOrderMaster+ " POM,          \n"
                  +  Database.DCMS.item +"  ITM,                             \n"
                  +  Database.DCMS.store +"  STR,                            \n"
                  +  Database.DCMS.definitionTypeDetail + "STA,              \n"
                  +  Database.DCMS.definitionTypeDetail + "TYP,              \n"
                  +  Database.DCMS.party + "PARTY,                           \n"
                  +  Database.DCMS.users + "USR                              \n"
                  +" WHERE POD.ITEM_ID ='"+itemId+"'                         \n";
     
                  if (partyId.length() != 0) {
                  query += " AND POM.PARTY_ID = '" + partyId + "'      \n";
                   }
                  
                  if(fromDate.length() != 0 && toDate.length() != 0){
                      query += " AND POM.Approved_Date BETWEEN '" + fromDate +  
                    "' AND '" + toDate + "'                                  \n";
                  }
                  
                  query +="  AND POD.ITEM_ID = ITM.ID                        \n"
                  +" AND POD.PURCHASE_ORDER_NO = POM.ID                      \n"
                  +" AND POM.STORE_ID = STR.ID                               \n"
                  +" AND POM.ORDER_STATUS_ID = STA.ID                        \n"
                  +" AND POM.PURCHASE_TYPE = TYP.ID                          \n"
                  +" AND POM.PARTY_ID = PARTY.ID                             \n"
                  +" AND POM.APPROVED_BY = USR.USER_NAME                     \n"
                  +" ORDER BY POM.APPROVED_DATE DESC                         \n";
                  
                  
          //System.out.println("query"+ query);
          
          List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
          List<PurchaseOrderDetailBO> lisVerRep = new ArrayList<>();
          
          for (int i =0; i < listmap.size(); i++){
              HashMap map = (HashMap) listmap.get(i); 
              PurchaseOrderDetailBO objData = new PurchaseOrderDetailBO();
              
              objData.setPurchaseOrderNo(map.get("PURCHASE_ORDER_NO").toString());
              objData.setItemId(map.get("ITEM_ID").toString());
              objData.setItemName(map.get("ITEM_NAME").toString());
              objData.setQuantity(map.get("QUANTITY").toString());
              objData.setUnitPrice(map.get("UNIT_PRICE").toString());
              objData.setPrice(map.get("PRICE").toString());
              objData.setStatus(map.get("STATUS").toString());
              objData.setStoreId(map.get("STORE_ID").toString());
              objData.setStoreName(map.get("STORE_NAME").toString());
              objData.setPruchaseType(map.get("PURCHASE_TYPE").toString());
              objData.setTypeDescription(map.get("TYPE_DESCRIPTIONS").toString());
              objData.setPartyId(map.get("PARTY_ID").toString());
              objData.setPartyName(map.get("PARTY_NAME").toString());
              objData.setCrtdDate(map.get("CRTD_DATE").toString());
              objData.setApprovedDate(map.get("APPROVED_DATE").toString());
              objData.setApproveBy(map.get("APPROVE_BY").toString());
              lisVerRep.add(objData);
          }
         return lisVerRep;
     }
}
