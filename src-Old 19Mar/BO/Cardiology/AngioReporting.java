/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Cardiology;

/**
 *
 * @author admin
 */
public class AngioReporting {

    private String patientId = "";
    private String CON = "";
    private String ODI = "";
    private String orderStatusId = "";
    private String orderStatusDescription = "";
    private String AngioMasterId = "";
    private String routeId = "";
    private String routeDescription = "";
    private String catherterId = "";
    private String catherterPk = "";
    private String catherter = "";
    private String catherterTypeId = "";
    private String catherterTypeDescription = "";
    private String catherterLRId = "";
    private String catherterLRDescription = "";
    private String catherterValueId = "";
    private String catherterValueDescription = "";

    private String contrast = "";
    private String xRayDose = "";
    private String FTime = "";
    private String LVAngiogramId = "";
    private String LVAngiogramDescription = "";
    private String LVEF = "";

    private String parameterPk = "";
    private String angioParameterId = "";
    private String angioParameterDescription = "";
    private String proximal = "";
    private String mid = "";
    private String distal = "";
    private String template = "";
    private String ostium = "";

    private String additionalInfoPK = "";
    private String additionalInfoId = "";
    private String additionalInfoDescription = "";
    private String infoValue = "";

    private String crtdByName = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getCON() {
        return CON;
    }

    public void setCON(String CON) {
        this.CON = CON;
    }

    public String getODI() {
        return ODI;
    }

    public void setODI(String ODI) {
        this.ODI = ODI;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteDescription() {
        return routeDescription;
    }

    public void setRouteDescription(String routeDescription) {
        this.routeDescription = routeDescription;
    }

    public String getCatherter() {
        return catherter;
    }

    public void setCatherter(String catherter) {
        this.catherter = catherter;
    }

    public String getCatherterTypeId() {
        return catherterTypeId;
    }

    public void setCatherterTypeId(String catherterTypeId) {
        this.catherterTypeId = catherterTypeId;
    }

    public String getCatherterTypeDescription() {
        return catherterTypeDescription;
    }

    public void setCatherterTypeDescription(String catherterTypeDescription) {
        this.catherterTypeDescription = catherterTypeDescription;
    }

    public String getCatherterLRId() {
        return catherterLRId;
    }

    public void setCatherterLRId(String catherterLRId) {
        this.catherterLRId = catherterLRId;
    }

    public String getCatherterLRDescription() {
        return catherterLRDescription;
    }

    public void setCatherterLRDescription(String catherterLRDescription) {
        this.catherterLRDescription = catherterLRDescription;
    }

    public String getCatherterValueId() {
        return catherterValueId;
    }

    public void setCatherterValueId(String catherterValueId) {
        this.catherterValueId = catherterValueId;
    }

    public String getCatherterValueDescription() {
        return catherterValueDescription;
    }

    public void setCatherterValueDescription(String catherterValueDescription) {
        this.catherterValueDescription = catherterValueDescription;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getContrast() {
        return contrast;
    }

    public void setContrast(String contrast) {
        this.contrast = contrast;
    }

    public String getxRayDose() {
        return xRayDose;
    }

    public void setxRayDose(String xRayDose) {
        this.xRayDose = xRayDose;
    }

    public String getFTime() {
        return FTime;
    }

    public void setFTime(String FTime) {
        this.FTime = FTime;
    }

    public String getLVAngiogramId() {
        return LVAngiogramId;
    }

    public void setLVAngiogramId(String LVAngiogramId) {
        this.LVAngiogramId = LVAngiogramId;
    }

    public String getAngioMasterId() {
        return AngioMasterId;
    }

    public void setAngioMasterId(String AngioMasterId) {
        this.AngioMasterId = AngioMasterId;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }

    public String getCrtdByName() {
        return crtdByName;
    }

    public void setCrtdByName(String crtdByName) {
        this.crtdByName = crtdByName;
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

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public String getCatherterId() {
        return catherterId;
    }

    public void setCatherterId(String catherterId) {
        this.catherterId = catherterId;
    }

    public String getAngioParameterId() {
        return angioParameterId;
    }

    public void setAngioParameterId(String angioParameterId) {
        this.angioParameterId = angioParameterId;
    }

    public String getProximal() {
        return proximal;
    }

    public void setProximal(String proximal) {
        this.proximal = proximal;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getDistal() {
        return distal;
    }

    public void setDistal(String distal) {
        this.distal = distal;
    }

    public String getAdditionalInfoId() {
        return additionalInfoId;
    }

    public void setAdditionalInfoId(String additionalInfoId) {
        this.additionalInfoId = additionalInfoId;
    }

    public String getInfoValue() {
        return infoValue;
    }

    public void setInfoValue(String infoValue) {
        this.infoValue = infoValue;
    }

    public String getAdditionalInfoDescription() {
        return additionalInfoDescription;
    }

    public void setAdditionalInfoDescription(String additionalInfoDescription) {
        this.additionalInfoDescription = additionalInfoDescription;
    }

    public String getAdditionalInfoPK() {
        return additionalInfoPK;
    }

    public void setAdditionalInfoPK(String additionalInfoPK) {
        this.additionalInfoPK = additionalInfoPK;
    }

    public String getAngioParameterDescription() {
        return angioParameterDescription;
    }

    public void setAngioParameterDescription(String angioParameterDescription) {
        this.angioParameterDescription = angioParameterDescription;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getOstium() {
        return ostium;
    }

    public void setOstium(String ostium) {
        this.ostium = ostium;
    }

    public String getLVEF() {
        return LVEF;
    }

    public void setLVEF(String LVEF) {
        this.LVEF = LVEF;
    }

    public String getLVAngiogramDescription() {
        return LVAngiogramDescription;
    }

    public void setLVAngiogramDescription(String LVAngiogramDescription) {
        this.LVAngiogramDescription = LVAngiogramDescription;
    }

    public String getCatherterPk() {
        return catherterPk;
    }

    public void setCatherterPk(String catherterPk) {
        this.catherterPk = catherterPk;
    }

    public String getParameterPk() {
        return parameterPk;
    }

    public void setParameterPk(String parameterPk) {
        this.parameterPk = parameterPk;
    }

}
