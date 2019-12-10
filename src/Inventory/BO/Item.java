/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.BO;

import java.util.Objects;
import utilities.Constants;

public class Item {

    private String id = "";
    private String description = "";
    private String unit = "";
    private String minQty = "";
    private String maxQty = "";
    private String active = "";
    private String packSize = "";
    private String isFormulary = "";
    private String indentPackSize = "";
    private String salePrice = "0";
    private String genericId = "4029";//N\A
    private int brandId;//N\A
    private String itemTypeId = "3026";//N\A
    private String categoryId = "4450";
    private String manufactureId = "1";
    private String groupId = "";
    private String groupDescription = "";
    private String specialityId = "247";
    private String requestedById = Constants.systemAdministrator;
    private String purchasePrice = "0";
    private String requestedByDesc = "";
    private String requiredOrderQuantity = "N";
    private String itemTypeDescription = "";//@Defualt is Not DEFINE
    private String brandDescription = "";//@Defualt is Not DEFINE
    private String itemCategory = "";//@Defualt is Not DEFINE
    private String genericDescription = "";
    private String categoryDescription = "";
    private String manufactureDescription = "";
    private String Mnemonics = "";
    private String specialityDescription = "";//@Defualt is Not DEFINE
    private String strength = "";//@Defualt is Not DEFINE
    private String formulary = "";//@Defualt is Not DEFINE
    private String crtdBy = "";
    private String crtdDate = "";
    private String unitPackSize = "";

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getFormulary() {
        return formulary;
    }

    public void setFormulary(String formulary) {
        this.formulary = formulary;
    }

    public String getIsFormulary() {
        return isFormulary;
    }

    public void setIsFormulary(String isFormulary) {
        this.isFormulary = isFormulary;
    }

    public String getRequiredOrderQuantity() {
        return requiredOrderQuantity;
    }

    public void setRequiredOrderQuantity(String requiredOrderQuantity) {
        this.requiredOrderQuantity = requiredOrderQuantity;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getUnitPackSize() {
        return unitPackSize;
    }

    public void setUnitPackSize(String unitPackSize) {
        this.unitPackSize = unitPackSize;
    }
    private int rowIndex;

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(String maxQty) {
        this.maxQty = maxQty;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public String getIndentPackSize() {
        return indentPackSize;
    }

    public void setIndentPackSize(String indentPackSize) {
        this.indentPackSize = indentPackSize;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getGenericId() {
        return genericId;
    }

    public void setGenericId(String genericId) {
        this.genericId = genericId;
    }

    public String getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(String itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getRequestedById() {
        return requestedById;
    }

    public void setRequestedById(String requestedById) {
        this.requestedById = requestedById;
    }

    public String getRequestedByDesc() {
        return requestedByDesc;
    }

    public void setRequestedByDesc(String requestedByDesc) {
        this.requestedByDesc = requestedByDesc;
    }

    public String getItemTypeDescription() {
        return itemTypeDescription;
    }

    public void setItemTypeDescription(String itemTypeDescription) {
        this.itemTypeDescription = itemTypeDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getGenericDescription() {
        return genericDescription;
    }

    public void setGenericDescription(String genericDescription) {
        this.genericDescription = genericDescription;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getManufactureDescription() {
        return manufactureDescription;
    }

    public void setManufactureDescription(String manufactureDescription) {
        this.manufactureDescription = manufactureDescription;
    }

    public String getSpecialityDescription() {
        return specialityDescription;
    }

    public void setSpecialityDescription(String specialityDescription) {
        this.specialityDescription = specialityDescription;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    public String getMnemonics() {
        return Mnemonics;
    }

    public void setMnemonics(String Mnemonics) {
        this.Mnemonics = Mnemonics;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
