package BO.Pathology;

public class PathologyResultDetail implements java.io.Serializable {

    private String CON = "";
    private String orderDetailId = "";

    private String patientId = "";
    private String admissionNumber = "";
    private String parameterId = "";
    private String parameterDescription = "";
    private String orderStatusId = "";
    private String lisValue = "";
    private String sectionNo = "";
    private String lasValue = "";
    private String verifiedValue = "";
    private String verifiedDate = "";
    private String CPTDescription = "";
    private String unit = "";
    private String isCritical = "";
    private String minRange = "";
    private String maxRange = "";
    private String symbol = "";
    private String rangeId = "";
    private String isNormal = "";
    private String isRequired = "";
    private String lasValueRequired = "";
    private String criticalMinRange = "";
    private String criticalMaxRange = "";
    private String cptId = "";
    private String minAge = "";
    private String maxAge = "";
    private String defaultValue = "";
    private String active = "";
    private String rangesWithSymbol = "";
    private String analyzerId = "";
    private String genderId = "";
    private String remarks = "";
    private String parameterLOVId = "";
    private int rowIndex;
    private String crtdBy = "";
    private String crtdDate = "";

    public PathologyResultDetail() {

    }

    public PathologyResultDetail(String con, String odi, String patientId,
            String admissionNumber, String verifiedValue, String parameter,
            String parameterId, String verifiedDate) {

        this.CON = con;
        this.orderDetailId = odi;
        this.patientId = patientId;
        this.admissionNumber = admissionNumber;
        this.verifiedValue = verifiedValue;
        this.parameterDescription = parameter;
        this.parameterId = parameterId;
        this.verifiedDate = verifiedDate;

    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getParameterLOVId() {
        return parameterLOVId;
    }

    public void setParameterLOVId(String parameterLOVId) {
        this.parameterLOVId = parameterLOVId;
    }

    public String getCriticalMinRange() {
        return criticalMinRange;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setCriticalMinRange(String criticalMinRange) {
        this.criticalMinRange = criticalMinRange;
    }

    public String getCriticalMaxRange() {
        return criticalMaxRange;
    }

    public void setCriticalMaxRange(String criticalMaxRange) {
        this.criticalMaxRange = criticalMaxRange;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    //@Date 29 July
    private boolean isFetchResult;

    public String getCompelteOrderNo() {
        return CON;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public void setCompelteOrderNo(String compelteOrderNo) {
        this.CON = compelteOrderNo;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getLisValue() {
        return lisValue;
    }

    public void setLisValue(String lisValue) {
        this.lisValue = lisValue;
    }

    public String getLasValue() {
        return lasValue;
    }

    public void setLasValue(String lasValue) {
        this.lasValue = lasValue;
    }

    public String getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(String verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public String getCPTDescription() {
        return CPTDescription;
    }

    public void setCPTDescription(String CPTDescription) {
        this.CPTDescription = CPTDescription;
    }

    public String getVerifiedValue() {
        return verifiedValue;
    }

    public void setVerifiedValue(String verifiedValue) {
        this.verifiedValue = verifiedValue;
    }

    public String getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(String isCritical) {
        this.isCritical = isCritical;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMinRange() {
        return minRange;
    }

    public void setMinRange(String minRange) {
        this.minRange = minRange;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(String maxRange) {
        this.maxRange = maxRange;
    }

    public String getRangeId() {
        return rangeId;
    }

    public void setRangeId(String rangeId) {
        this.rangeId = rangeId;
    }

    public String getCON() {
        return CON;
    }

    public void setCON(String CON) {
        this.CON = CON;
    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRangesWithSymbol() {
        return rangesWithSymbol;
    }

    public void setRangesWithSymbol(String rangesWithSymbol) {
        this.rangesWithSymbol = rangesWithSymbol;
    }

    public String getLasValueRequired() {
        return lasValueRequired;
    }

    public void setLasValueRequired(String lasValueRequired) {
        this.lasValueRequired = lasValueRequired;
    }

    public String getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(String isNormal) {
        this.isNormal = isNormal;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public boolean isIsFetchResult() {
        return isFetchResult;
    }

    public void setIsFetchResult(boolean isFetchResult) {
        this.isFetchResult = isFetchResult;
    }

    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
