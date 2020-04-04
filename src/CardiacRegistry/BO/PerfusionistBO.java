/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.BO;

/**
 *
 * @author admin
 */
public class PerfusionistBO {

    private String cardiacId = "";
    private String perfusionId = "";
    private String perfusionistId = "";
    private String patientId = "";
    private String perfusionistName = "";
    private String asstPerfusionistId = "";
    private String asstPerfusionistName = "";
    private String heparinized = "";
    private String redo = "";
    private String operationId = "";
    private String operationDescription = "";
    private String oxygenator = "";
    private String cpgSystem = "";
    private String IABCatheter = "";
    private String IABCatheterTime = "";
    private String height = "";
    private String weight = "";
    private String Hb = "";
    private String surfaceArea = "";
    private String bloodFlow = "";
    private String bloodGroupId = "";
    private String bloodGroupDescription = "";
    private String hartmanns = "";
    private String heparin = "";
    private String mannitol = "";
    private String bloodRBC = "";
    private String surgeonId = "";
    private String surgeonName = "";
    private String assistantSurgeonId = "";
    private String assistantSurgeonName = "";
    private String anesthetistId = "";
    private String anesthetistName = "";
    private String venous = "";
    private String aorticCannulae = "";
    private String hemofilter = "";
    private String connectors = "";
    private String antegrade = "";
    private String retrograde = "";
    private String sumpVent = "";
    private String aortic = "";
    private String mitral = "";
    private String pulmonary = "";
    private String valve = "";
    private String diabetic = "";
    private String allergies = "";
    private String urea = "";
    private String creatinine = "";
    private String EF = "";
    private String LMS = "";
    private String HBsAntiHcv = "";
    private String OtherPerfusion = "";
    private String crtdBy = "";
    private String crtdByName = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String isFinal = "";
    private String finalBy = "";
    private String finalDate = "";
    private String finalTerminalId = "";

    // Check List
    private String checkListPK = "";
    private String checkListId = "";
    private String checkListDescription = "";
    private String checked = "";

    // Pressure Time Graph
    private String perfusionGraphId = "";
    private String perPressure = "";
    private String timeMin = "";

    //PerfusionTime
    private String perTimePk = "";
    private String startTime = "";
    private String endTime = "";
    private String totalTime = "";
    private String temperature = "";
    private String actionId = "";
    
    // Valve Information
    private String valvePk = "";
    private String valveId = "";
    private String valveDescription = "";

    public String getValvePk() {
        return valvePk;
    }

    public void setValvePk(String valvePk) {
        this.valvePk = valvePk;
    }

    public String getValveId() {
        return valveId;
    }

    public void setValveId(String valveId) {
        this.valveId = valveId;
    }

    public String getValveDescription() {
        return valveDescription;
    }

    public void setValveDescription(String valveDescription) {
        this.valveDescription = valveDescription;
    }

    public String getPerTimePk() {
        return perTimePk;
    }

    public void setPerTimePk(String perTimePk) {
        this.perTimePk = perTimePk;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPerfusionistName() {
        return perfusionistName;
    }

    public void setPerfusionistName(String perfusionistName) {
        this.perfusionistName = perfusionistName;
    }

    public String getAsstPerfusionistName() {
        return asstPerfusionistName;
    }

    public void setAsstPerfusionistName(String asstPerfusionistName) {
        this.asstPerfusionistName = asstPerfusionistName;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public String getBloodGroupDescription() {
        return bloodGroupDescription;
    }

    public void setBloodGroupDescription(String bloodGroupDescription) {
        this.bloodGroupDescription = bloodGroupDescription;
    }

    public String getSurgeonName() {
        return surgeonName;
    }

    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    public String getAssistantSurgeonName() {
        return assistantSurgeonName;
    }

    public void setAssistantSurgeonName(String assistantSurgeonName) {
        this.assistantSurgeonName = assistantSurgeonName;
    }

    public String getAnesthetistName() {
        return anesthetistName;
    }

    public void setAnesthetistName(String anesthetistName) {
        this.anesthetistName = anesthetistName;
    }
    
    public String getPerfusionId() {
        return perfusionId;
    }

    public void setPerfusionId(String perfusionId) {
        this.perfusionId = perfusionId;
    }

    public String getCardiacId() {
        return cardiacId;
    }

    public void setCardiacId(String cardiacId) {
        this.cardiacId = cardiacId;
    }

    public String getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(String bloodFlow) {
        this.bloodFlow = bloodFlow;
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

    public String getPerfusionistId() {
        return perfusionistId;
    }

    public void setPerfusionistId(String perfusionistId) {
        this.perfusionistId = perfusionistId;
    }

    public String getAsstPerfusionistId() {
        return asstPerfusionistId;
    }

    public void setAsstPerfusionistId(String asstPerfusionistId) {
        this.asstPerfusionistId = asstPerfusionistId;
    }

    public String getHeparinized() {
        return heparinized;
    }

    public void setHeparinized(String heparinized) {
        this.heparinized = heparinized;
    }

    public String getRedo() {
        return redo;
    }

    public void setRedo(String redo) {
        this.redo = redo;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getOxygenator() {
        return oxygenator;
    }

    public void setOxygenator(String oxygenator) {
        this.oxygenator = oxygenator;
    }

    public String getCpgSystem() {
        return cpgSystem;
    }

    public void setCpgSystem(String cpgSystem) {
        this.cpgSystem = cpgSystem;
    }

    public String getIABCatheter() {
        return IABCatheter;
    }

    public void setIABCatheter(String IABCatheter) {
        this.IABCatheter = IABCatheter;
    }

    public String getIABCatheterTime() {
        return IABCatheterTime;
    }

    public void setIABCatheterTime(String IABCatheterTime) {
        this.IABCatheterTime = IABCatheterTime;
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

    public String getHb() {
        return Hb;
    }

    public void setHb(String Hb) {
        this.Hb = Hb;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getBloodGroupId() {
        return bloodGroupId;
    }

    public void setBloodGroupId(String bloodGroupId) {
        this.bloodGroupId = bloodGroupId;
    }

    public String getHartmanns() {
        return hartmanns;
    }

    public void setHartmanns(String hartmanns) {
        this.hartmanns = hartmanns;
    }

    public String getHeparin() {
        return heparin;
    }

    public void setHeparin(String heparin) {
        this.heparin = heparin;
    }

    public String getMannitol() {
        return mannitol;
    }

    public void setMannitol(String mannitol) {
        this.mannitol = mannitol;
    }

    public String getBloodRBC() {
        return bloodRBC;
    }

    public void setBloodRBC(String bloodRBC) {
        this.bloodRBC = bloodRBC;
    }

    public String getSurgeonId() {
        return surgeonId;
    }

    public void setSurgeonId(String surgeonId) {
        this.surgeonId = surgeonId;
    }

    public String getAssistantSurgeonId() {
        return assistantSurgeonId;
    }

    public void setAssistantSurgeonId(String assistantSurgeonId) {
        this.assistantSurgeonId = assistantSurgeonId;
    }

    public String getAnesthetistId() {
        return anesthetistId;
    }

    public void setAnesthetistId(String anesthetistId) {
        this.anesthetistId = anesthetistId;
    }

    public String getVenous() {
        return venous;
    }

    public void setVenous(String venous) {
        this.venous = venous;
    }

    public String getAorticCannulae() {
        return aorticCannulae;
    }

    public void setAorticCannulae(String aorticCannulae) {
        this.aorticCannulae = aorticCannulae;
    }

    public String getHemofilter() {
        return hemofilter;
    }

    public void setHemofilter(String hemofilter) {
        this.hemofilter = hemofilter;
    }

    public String getConnectors() {
        return connectors;
    }

    public void setConnectors(String connectors) {
        this.connectors = connectors;
    }

    public String getAntegrade() {
        return antegrade;
    }

    public void setAntegrade(String antegrade) {
        this.antegrade = antegrade;
    }

    public String getRetrograde() {
        return retrograde;
    }

    public void setRetrograde(String retrograde) {
        this.retrograde = retrograde;
    }

    public String getSumpVent() {
        return sumpVent;
    }

    public void setSumpVent(String sumpVent) {
        this.sumpVent = sumpVent;
    }

    public String getAortic() {
        return aortic;
    }

    public void setAortic(String aortic) {
        this.aortic = aortic;
    }

    public String getMitral() {
        return mitral;
    }

    public void setMitral(String mitral) {
        this.mitral = mitral;
    }

    public String getPulmonary() {
        return pulmonary;
    }

    public void setPulmonary(String pulmonary) {
        this.pulmonary = pulmonary;
    }

    public String getValve() {
        return valve;
    }

    public void setValve(String valve) {
        this.valve = valve;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getUrea() {
        return urea;
    }

    public void setUrea(String urea) {
        this.urea = urea;
    }

    public String getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(String creatinine) {
        this.creatinine = creatinine;
    }

    public String getEF() {
        return EF;
    }

    public void setEF(String EF) {
        this.EF = EF;
    }

    public String getLMS() {
        return LMS;
    }

    public void setLMS(String LMS) {
        this.LMS = LMS;
    }

    public String getHBsAntiHcv() {
        return HBsAntiHcv;
    }

    public void setHBsAntiHcv(String HBsAntiHcv) {
        this.HBsAntiHcv = HBsAntiHcv;
    }

    public String getOtherPerfusion() {
        return OtherPerfusion;
    }

    public void setOtherPerfusion(String OtherPerfusion) {
        this.OtherPerfusion = OtherPerfusion;
    }

    public String getFinalBy() {
        return finalBy;
    }

    public void setFinalBy(String finalBy) {
        this.finalBy = finalBy;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getFinalTerminalId() {
        return finalTerminalId;
    }

    public void setFinalTerminalId(String finalTerminalId) {
        this.finalTerminalId = finalTerminalId;
    }

    public String getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
    }

    public String getCheckListId() {
        return checkListId;
    }

    public void setCheckListId(String checkListId) {
        this.checkListId = checkListId;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getPerPressure() {
        return perPressure;
    }

    public void setPerPressure(String perPressure) {
        this.perPressure = perPressure;
    }

    public String getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(String timeMin) {
        this.timeMin = timeMin;
    }

    public String getPerfusionGraphId() {
        return perfusionGraphId;
    }

    public void setPerfusionGraphId(String perfusionGraphId) {
        this.perfusionGraphId = perfusionGraphId;
    }

    public String getCheckListPK() {
        return checkListPK;
    }

    public void setCheckListPK(String checkListPK) {
        this.checkListPK = checkListPK;
    }

    public String getCheckListDescription() {
        return checkListDescription;
    }

    public void setCheckListDescription(String checkListDescription) {
        this.checkListDescription = checkListDescription;
    }

}
