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

    private String cardiacRegistryId = "";
    private String patientId = "";
    private String admissionNo = "";
    private String instituteId = "";
    private String instituteDescription = "";
    private String wardId = "";
    private String wardDescription = "";
    private String categoryId = "";
    private String categoryDescription = "";
    private String dateOfSurgery = "";
    private String dayOfSurgery = "";
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
    private String finalBy = "''";
    private String finalDate = "''";
    private String finalTerminalId = "''";
    private String examId = "";
    private String examDescription = "";
    private String examDetailId = "";
    private String examDetailDescription = "";
    private String examRemarks = "";

    private String contactPerAddress = "";
    private String contactPerName = "";
    private String contactPerContactNo = "";

    public String getCrtdByName() {
        return crtdByName;
    }

    public void setCrtdByName(String crtdByName) {
        this.crtdByName = crtdByName;
    }
    
    public String getContactPerAddress() {
        return contactPerAddress;
    }

    public void setContactPerAddress(String contactPerAddress) {
        this.contactPerAddress = contactPerAddress;
    }

    public String getContactPerName() {
        return contactPerName;
    }

    public void setContactPerName(String contactPerName) {
        this.contactPerName = contactPerName;
    }

    public String getContactPerContactNo() {
        return contactPerContactNo;
    }

    public void setContactPerContactNo(String contactPerContactNo) {
        this.contactPerContactNo = contactPerContactNo;
    }

    public String getDayOfSurgery() {
        return dayOfSurgery;
    }

    public void setDayOfSurgery(String dayOfSurgery) {
        this.dayOfSurgery = dayOfSurgery;
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

    public String getCardiacRegistryId() {
        return cardiacRegistryId;
    }

    public void setCardiacRegistryId(String cardiacRegistryId) {
        this.cardiacRegistryId = cardiacRegistryId;
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
