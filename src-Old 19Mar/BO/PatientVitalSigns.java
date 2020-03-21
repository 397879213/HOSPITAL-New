/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class PatientVitalSigns implements java.io.Serializable {

    private String id = "";
    private String bodyTemperature = "";
    private String pulse = "";
    private String o2Sat = "";
    private String vitalTime = "";
    private String bloodPressureDiastolic = "";
    private String bloodPressureSystolic = "";
    private String abdominalGirth = "";
    private String height = "";
    private String weight = "";
    private String heartRate = "";
    private String rbs = "";
    private String fbs = "";
    private String cvp = "";
    private String fhsFos = "";
    private String vitalDate = "";
    private String respirationRate = "";
    private String patientId = "";
    private String actionEventId = "";
    private String vitalEventId = "";
    private String crtdBy = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getActionEventId() {
        return actionEventId;
    }

    public void setActionEventId(String actionEventId) {
        this.actionEventId = actionEventId;
    }

    public String getVitalEventId() {
        return vitalEventId;
    }

    public void setVitalEventId(String vitalEventId) {
        this.vitalEventId = vitalEventId;
    }

    public String getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(String bodyTemperture) {
        this.bodyTemperature = bodyTemperture;
    }

    public String getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(String respirationRate) {
        this.respirationRate = respirationRate;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getO2Sat() {
        return o2Sat;
    }

    public void setO2Sat(String o2Sat) {
        this.o2Sat = o2Sat;
    }

    public String getVitalTime() {
        return vitalTime;
    }

    public void setVitalTime(String vitalTime) {
        this.vitalTime = vitalTime;
    }

    public String getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(String bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public String getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(String bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public String getAbdominalGirth() {
        return abdominalGirth;
    }

    public void setAbdominalGirth(String abdominalGirth) {
        this.abdominalGirth = abdominalGirth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getRbs() {
        return rbs;
    }

    public void setRbs(String rbs) {
        this.rbs = rbs;
    }

    public String getFbs() {
        return fbs;
    }

    public void setFbs(String fbs) {
        this.fbs = fbs;
    }

    public String getCvp() {
        return cvp;
    }

    public void setCvp(String cvp) {
        this.cvp = cvp;
    }

    public String getFhsFos() {
        return fhsFos;
    }

    public void setFhsFos(String fhsFos) {
        this.fhsFos = fhsFos;
    }

    public String getVitalDate() {
        return vitalDate;
    }

    public void setVitalDate(String vitalDate) {
        this.vitalDate = vitalDate;
    }

}
