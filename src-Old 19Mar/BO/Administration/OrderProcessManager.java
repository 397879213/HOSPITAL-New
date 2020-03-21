/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Administration;

/**
 *
 * @author admin
 */
public class OrderProcessManager {
    
    private String patientId = "";
    private String CON = "";
    private String ODI = "";
    private String cptId = "";
    private String locationId = "";
    private String orderStatusId = "";
    private String crtdDate = "";
    private String verifiedDate = "";
    private String unverifyComments = "";
    private String physicianName = "";
    private String verifiedby = "";
    private String refPhysicanId = "";
    private String refPhysicianName = "";
    private String cptReportingFormat = "";
    private String location = "";
    private String gender = "";
    private String otherInfo = "";
    private String contactNo = "";
    private String sendSMSStatus = "";
    private String reportFont = "";
    private String clientId = "";
    private String clientName = "";
    private String age = "";
    private String admissionNo = "";
    private String admissionStatus = "";
    private String admissionStatusId = "";
    private String admissionDate = "";
    private String wardId = "";
    private String bedId = "";
    private String bedDescription = "";
    private String wardDescription = "";
    private String attendingPhysicianId = "";
    private String attendingPhysician = "";
    private String gaRequired = "";
    private String reportUnverifyTime = "";
    private String adminUnverifyTime = "";
    private String performingUnverifyTime = "";
    private String verifiedName = "";
    private String crtdTerminalId = "";
    private String verifiedTerminalId = "";
    private String physicianId = "";
    private String sectionId = "";
    private String departmentId = "";
    private String department = "";
    private String patientName = "";
    private String cptDescription = "";
    private String statusDescription = "";
    private String reportTime = "";
    private String result= "";
    private String reportName = "";
    private String reportFontSize = "";

    public String getReportFontSize() {
        return reportFontSize;
    }

    public void setReportFontSize(String reportFontSize) {
        this.reportFontSize = reportFontSize;
    }
    
    
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportUnverifyTime() {
        return reportUnverifyTime;
    }

    public void setReportUnverifyTime(String reportUnverifyTime) {
        this.reportUnverifyTime = reportUnverifyTime;
    }

    public String getAdminUnverifyTime() {
        return adminUnverifyTime;
    }

    public void setAdminUnverifyTime(String adminUnverifyTime) {
        this.adminUnverifyTime = adminUnverifyTime;
    }

    public String getPerformingUnverifyTime() {
        return performingUnverifyTime;
    }

    public void setPerformingUnverifyTime(String performingUnverifyTime) {
        this.performingUnverifyTime = performingUnverifyTime;
    }

    public String getSendSMSStatus() {
        return sendSMSStatus;
    }

    public void setSendSMSStatus(String sendSMSStatus) {
        this.sendSMSStatus = sendSMSStatus;
    }

    public String getAttendingPhysicianId() {
        return attendingPhysicianId;
    }

    public void setAttendingPhysicianId(String attendingPhysicianId) {
        this.attendingPhysicianId = attendingPhysicianId;
    }

    public String getAttendingPhysician() {
        return attendingPhysician;
    }

    public void setAttendingPhysician(String attendingPhysician) {
        this.attendingPhysician = attendingPhysician;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public String getAdmissionStatusId() {
        return admissionStatusId;
    }

    public void setAdmissionStatusId(String admissionStatusId) {
        this.admissionStatusId = admissionStatusId;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getGaRequired() {
        return gaRequired;
    }

    public void setGaRequired(String gaRequired) {
        this.gaRequired = gaRequired;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    private String orderDate = "";

    public String getRefPhysicanId() {
        return refPhysicanId;
    }

    public void setRefPhysicanId(String refPhysicanId) {
        this.refPhysicanId = refPhysicanId;
    }

    public String getRefPhysicianName() {
        return refPhysicianName;
    }

    public String getCptReportingFormat() {
        return cptReportingFormat;
    }

    public void setCptReportingFormat(String cptReportingFormat) {
        this.cptReportingFormat = cptReportingFormat;
    }

    public void setRefPhysicianName(String refPhysicianName) {
        this.refPhysicianName = refPhysicianName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVerifiedby() {
        return verifiedby;
    }

    public void setVerifiedby(String vrfyId) {
        this.verifiedby = vrfyId;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getUnverifyComments() {
        return unverifyComments;
    }

    public void setUnverifyComments(String unverifyComments) {
        this.unverifyComments = unverifyComments;
    }

    public String getTextReporting() {
        return textReporting;
    }

    public void setTextReporting(String textReporting) {
        this.textReporting = textReporting;
    }
    private String crtdBy = "";
    private String textReporting = "";

    public String getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(String verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public String getVerifiedName() {
        return verifiedName;
    }

    public void setVerifiedName(String verifiedName) {
        this.verifiedName = verifiedName;
    }

    public String getVerifiedTerminalId() {
        return verifiedTerminalId;
    }

    public void setVerifiedTerminalId(String verifiedTerminalId) {
        this.verifiedTerminalId = verifiedTerminalId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    private String review = "";

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCptDescription() {
        return cptDescription;
    }

    public void setCptDescription(String cptDescription) {
        this.cptDescription = cptDescription;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getReportFont() {
        return reportFont;
    }

    public void setReportFont(String reportFont) {
        this.reportFont = reportFont;
    }

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

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }
}
