/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO.Hospital;

/**
 *
 * @author raheelansari
 */
public class LTUPatientHistoryBO {
    
    private String toDate = "30-SEP-19";
    private String fromDate = "10-JUN-19";
    private String patientId = "";
    private String admissionExpense = "";
    private String dischargeDate = "";
    private String admissionNo = "";
    private String priPhyId = "";
    private String admittedDate = "";
    private String opdConsDate = "";
    private String cptId = "";
    private String wardTransfer = "";
    private String wardIn = "";
    private String wardOut = "";

    public String getAdmissionExpense() {
        return admissionExpense;
    }

    public void setAdmissionExpense(String admissionExpense) {
        this.admissionExpense = admissionExpense;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
    
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getWardIn() {
        return wardIn;
    }

    public void setWardIn(String wardIn) {
        this.wardIn = wardIn;
    }

    public String getWardOut() {
        return wardOut;
    }

    public void setWardOut(String wardOut) {
        this.wardOut = wardOut;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getPriPhyId() {
        return priPhyId;
    }

    public void setPriPhyId(String priPhyId) {
        this.priPhyId = priPhyId;
    }

    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        this.admittedDate = admittedDate;
    }

    public String getOpdConsDate() {
        return opdConsDate;
    }

    public void setOpdConsDate(String opdConsDate) {
        this.opdConsDate = opdConsDate;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getWardTransfer() {
        return wardTransfer;
    }

    public void setWardTransfer(String wardTransfer) {
        this.wardTransfer = wardTransfer;
    }
    
    
}
