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
public class CardiacSurgeryBO {
    
    private String id = "";
    private String patientId = "";
    private String admissionNo = "";
    private String instituteId = "";
    private String instituteDescription = "";
    private String wardId = "";
    private String wardDescription = "";
    private String categoryId = "";
    private String categoryDescription = "";
    private String dateOfSurgery = "";
    private String consultantSurgeonId = "";
    private String consultantSurgeonName = "";
    private String consultantCardiologistId = "";
    private String consultantCardiologistName = "";
    private String admittingConsultantId = "";
    private String admittingConsultantName = "";
    private String remarks = "";
    private String crtdBy = "";
    private String crtdByName = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String isFinal = "";
    private String finalBy = "";
    private String finalDate = "";
    private String finalTerminalId = "";
    private String examId = "";
    private String examDescription = "";
    private String examDetailId = "";
    private String examDetailDescription = "";
    private String examRemarks = "";
    
    private String procedureType = "";
    private String procedureId = "";
    private String procedureDescription = "";
    private String dateOfProcedure = "";
    private String dayOfProcedure = "";
    private String performingPhysicianId = "";
    private String performingPhysicianName = "";
    private String procedureRemarks = "";
    private String cancelBy = "";
    private String cancelDate = "";
    private String cancelTerminalId = "";
    private String active = "";

    public String getDayOfProcedure() {
        return dayOfProcedure;
    }

    public void setDayOfProcedure(String dayOfProcedure) {
        this.dayOfProcedure = dayOfProcedure;
    }

    public String getCrtdByName() {
        return crtdByName;
    }

    public void setCrtdByName(String crtdByName) {
        this.crtdByName = crtdByName;
    }

    public String getCancelBy() {
        return cancelBy;
    }

    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelTerminalId() {
        return cancelTerminalId;
    }

    public void setCancelTerminalId(String cancelTerminalId) {
        this.cancelTerminalId = cancelTerminalId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    
    
    public String getProcedureType() {
        return procedureType;
    }

    public void setProcedureType(String procedureType) {
        this.procedureType = procedureType;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    public String getProcedureDescription() {
        return procedureDescription;
    }

    public void setProcedureDescription(String procedureDescription) {
        this.procedureDescription = procedureDescription;
    }

    public String getDateOfProcedure() {
        return dateOfProcedure;
    }

    public void setDateOfProcedure(String dateOfProcedure) {
        this.dateOfProcedure = dateOfProcedure;
    }

    public String getPerformingPhysicianId() {
        return performingPhysicianId;
    }

    public void setPerformingPhysicianId(String performingPhysicianId) {
        this.performingPhysicianId = performingPhysicianId;
    }

    public String getPerformingPhysicianName() {
        return performingPhysicianName;
    }

    public void setPerformingPhysicianName(String performingPhysicianName) {
        this.performingPhysicianName = performingPhysicianName;
    }

    public String getProcedureRemarks() {
        return procedureRemarks;
    }

    public void setProcedureRemarks(String procedureRemarks) {
        this.procedureRemarks = procedureRemarks;
    }
    
    

    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }

    public String getExamDetailDescription() {
        return examDetailDescription;
    }

    public void setExamDetailDescription(String examDetailDescription) {
        this.examDetailDescription = examDetailDescription;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(String examDetailId) {
        this.examDetailId = examDetailId;
    }

    public String getExamRemarks() {
        return examRemarks;
    }

    public void setExamRemarks(String examRemarks) {
        this.examRemarks = examRemarks;
    }

    public String getConsultantSurgeonName() {
        return consultantSurgeonName;
    }

    public void setConsultantSurgeonName(String consultantSurgeonName) {
        this.consultantSurgeonName = consultantSurgeonName;
    }

    public String getConsultantCardiologistName() {
        return consultantCardiologistName;
    }

    public void setConsultantCardiologistName(String consultantCardiologistName) {
        this.consultantCardiologistName = consultantCardiologistName;
    }

    public String getAdmittingConsultantName() {
        return admittingConsultantName;
    }

    public void setAdmittingConsultantName(String admittingConsultantName) {
        this.admittingConsultantName = admittingConsultantName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteDescription() {
        return instituteDescription;
    }

    public void setInstituteDescription(String instituteDescription) {
        this.instituteDescription = instituteDescription;
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

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getDateOfSurgery() {
        return dateOfSurgery;
    }

    public void setDateOfSurgery(String dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }

    public String getConsultantSurgeonId() {
        return consultantSurgeonId;
    }

    public void setConsultantSurgeonId(String consultantSurgeonId) {
        this.consultantSurgeonId = consultantSurgeonId;
    }

    public String getConsultantCardiologistId() {
        return consultantCardiologistId;
    }

    public void setConsultantCardiologistId(String consultantCardiologistId) {
        this.consultantCardiologistId = consultantCardiologistId;
    }

    public String getAdmittingConsultantId() {
        return admittingConsultantId;
    }

    public void setAdmittingConsultantId(String admittingConsultantId) {
        this.admittingConsultantId = admittingConsultantId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public String getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
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
    
    
}
