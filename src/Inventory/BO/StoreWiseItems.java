package Inventory.BO;
// Generated Aug 18, 2014 5:29:01 PM by Hibernate Tools 3.6.0

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class StoreWiseItems implements java.io.Serializable {

    private int storeId = 0;
    private int itemId;
    private String storeDescription = "";
    private String itemDescription = "";
    private int qty = 0;
    private String active = "Y";
    private String isSale = "Y";
    private String isTransferrable = "Y";
    private String isReturnable = "N";
    private String isCritical = "N";
    private String isUpdate = "";
    private int minOrder = 0;
    private int maxOrder = 0;
    private int rowIndex;
    private String actionId = "";
    private String itemType = "";
    private String isAddStockQuantity = "";
    private String isSubtractStockQuantity = "";
    private String isUpdateStoreItemProperty = "";
    private String rackId = "11";
    private String rackDescription = "";
    private String shelfId = "8";
    private String shelfDescription = "";
    private String batchNo = "";
    private String issuedQtyFromBatch = "";
    private String salePrice = "";
    
    private String fromDate = "";
    private String toDate = "";
    private int moveStoreId = 0;
    private String moveStoreDesc = "";
    private String indentId = "";
    private String manualIndentNo = "";
    private String requestedUserId = "";
    private String requestedUserName = "";
    private String statusDescription = "";
    private String statusId = "";
    private String crtdBy = "";
    private String crtdByName = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
    
    public String getManualIndentNo() {
        return manualIndentNo;
    }

    public void setManualIndentNo(String manualIndentNo) {
        this.manualIndentNo = manualIndentNo;
    }
    
    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdByName() {
        return crtdByName;
    }

    public void setCrtdByName(String crtdByName) {
        this.crtdByName = crtdByName;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }
    
    public String getMoveStoreDesc() {
        return moveStoreDesc;
    }

    public void setMoveStoreDesc(String moveStoreIdDesc) {
        this.moveStoreDesc = moveStoreIdDesc;
    }
    
    public int getMoveStoreId() {
        return moveStoreId;
    }

    public void setMoveStoreId(int moveStoreId) {
        this.moveStoreId = moveStoreId;
    }

    public String getIndentId() {
        return indentId;
    }

    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    public String getRequestedUserId() {
        return requestedUserId;
    }

    public void setRequestedUserId(String requestedUserId) {
        this.requestedUserId = requestedUserId;
    }

    public String getRequestedUserName() {
        return requestedUserName;
    }

    public void setRequestedUserName(String requestedUserName) {
        this.requestedUserName = requestedUserName;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getIssuedQtyFromBatch() {
        return issuedQtyFromBatch;
    }

    public void setIssuedQtyFromBatch(String issuedQtyFromBatch) {
        this.issuedQtyFromBatch = issuedQtyFromBatch;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getRackId() {
        return rackId;
    }

    public void setRackId(String rackId) {
        this.rackId = rackId;
    }

    public String getRackDescription() {
        return rackDescription;
    }

    public void setRackDescription(String rackDescription) {
        this.rackDescription = rackDescription;
    }

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public String getShelfDescription() {
        return shelfDescription;
    }

    public void setShelfDescription(String shelfDescription) {
        this.shelfDescription = shelfDescription;
    }

    public String getIsAddStockQuantity() {
        return isAddStockQuantity;
    }

    public void setIsAddStockQuantity(String isAddStockQuantity) {
        this.isAddStockQuantity = isAddStockQuantity;
    }

    public String getIsSubtractStockQuantity() {
        return isSubtractStockQuantity;
    }

    public void setIsSubtractStockQuantity(String isSubtractStockQuantity) {
        this.isSubtractStockQuantity = isSubtractStockQuantity;
    }

    public String getIsUpdateStoreItemProperty() {
        return isUpdateStoreItemProperty;
    }

    public void setIsUpdateStoreItemProperty(String isUpdateStoreItemProperty) {
        this.isUpdateStoreItemProperty = isUpdateStoreItemProperty;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public StoreWiseItems() {
    }

    public StoreWiseItems(int storeId, int itemId, int qty) {
        this.storeId = storeId;
        this.itemId = itemId;
        this.qty = qty;
    }

    public StoreWiseItems(int storeId, String storeDescription, int itemId,
            String itemDescription, int qty, int minOrder, int maxOrder,
            String active, String isCritical, String rackId, String rack,
            String shelfId, String shelf) {
        this.storeId = storeId;
        this.storeDescription = storeDescription;
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.qty = qty;
        this.minOrder = minOrder;
        this.maxOrder = maxOrder;
        this.isCritical = isCritical;
        this.active = active;
        this.rackId = rackId;
        this.rackDescription = rack;
        this.shelfId = shelfId;
        this.shelfDescription = shelf;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getIsSale() {
        return isSale;
    }

    public void setIsSale(String isSale) {
        this.isSale = isSale;
    }

    public String getIsTransferrable() {
        return isTransferrable;
    }

    public void setIsTransferrable(String isTransferrable) {
        this.isTransferrable = isTransferrable;
    }

    public String getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(String isReturnable) {
        this.isReturnable = isReturnable;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public int getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(int minOrder) {
        this.minOrder = minOrder;
    }

    public int getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(int maxOrder) {
        this.maxOrder = maxOrder;
    }

    public String getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(String isCritical) {
        this.isCritical = isCritical;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.storeId;
        hash = 67 * hash + this.itemId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StoreWiseItems other = (StoreWiseItems) obj;
        if (this.storeId != other.storeId) {
            return false;
        }
        if (this.itemId != other.itemId) {
            return false;
        }
        return true;
    }

}
