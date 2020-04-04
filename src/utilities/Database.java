package utilities;

public class Database {

    public static String usernameEmr = "EMR";

    public static final class DCMS {

        public static final String pacsProcessPath = DAO.usernameEmr + "." + "PACS_PROCESS_PATH ";
        public static final String documentAttachment = DAO.usernameEmr + "." + "DOCUMENT_ATTACHMENT ";
        
        public static final String EMRWEBPatient = DAO.usernameEmr + "." + "WEB_PATIENT ";
        public static final String patientPendingVisit = DAO.usernameEmr + "." + "PATIENT_PENDING_VISIT ";
        public static final String patientPerformVisit = DAO.usernameEmr + "." + "PATIENT_PERFORMED_VISIT ";
            public static final String patientWiseSymptoms = DAO.usernameEmr + "." + "PATIENT_WISE_SYMPTOMS ";
        public static final String patientVisitMedicines = DAO.usernameEmr + "." + "VISIT_MEDICINE ";
        public static final String visitDiagnosis = DAO.usernameEmr + "." + "VISIT_DIAGNOSIS ";
        
        
        public static final String angioReportingMaster = DAO.usernameEmr + "." + "ANGIO_REPORTING_MASTER ";
        public static final String angioReportingCatheter = DAO.usernameEmr + "." + "ANGIO_CATHETER ";
        public static final String angioReportingVessel = DAO.usernameEmr + "." + "ANGIO_VESSELS ";
        public static final String angioadditionalInfo = DAO.usernameEmr + "." + "ANGIO_ADDITIONAL_INFO ";

        public static final String physioMasterPlan = DAO.usernameEmr + "." + "PHYSIO_MASTER_PLAN ";
        public static final String physioDetailPlan = DAO.usernameEmr + "." + "PHYSIO_DETAIL_PLAN ";
        public static final String pofPhysioReporting = DAO.usernameEmr + "." + " ";

        public static final String itemOrder = DAO.usernameEmr + "." + "ITEM_ORDER ";
        public static final String itemOrderDetail = DAO.usernameEmr + "." + "ITEM_ORDER_DETAIL ";

        public static final String PofEmployee = DAO.usernameEmr + ".POF_EMPLOYEE   ";
        public static final String pofEmpMapper = DAO.usernameEmr + ".POF_EMP_MAPPER   ";
        public static final String clientEmployeeDetail = DAO.usernameEmr + ".CLIENT_EMP_DETAIL   ";
        public static final String ARCArmy = DAO.usernameEmr + ".ACR_ARMY   ";
        public static final String regArmyPerson = DAO.usernameEmr + ".REGISTER_ARMY_PERSON   ";

        public static final String medicineRequest = DAO.usernameEmr + ".MEDICINE_REQUEST   ";
        public static final String ltuPatientHistory = DAO.usernameEmr + ".LTU_PATIENT_HISTORY   ";

        public static final String dengueAssestmentMaster = DAO.usernameEmr + ".DENGUE_ASSES_MASTER   ";

        public static final String cardiacRegistryMaster = DAO.usernameEmr + ".CARDIAC_REGISTRY_MASTER   ";
        public static final String cardiacHistoryDetail = DAO.usernameEmr + ".CARDIAC_REGISTRY_DETAIL   ";
        public static final String cardiacProcedureDetail = DAO.usernameEmr + ".CARDIAC_PROCEDURE_DETAIL   ";
        public static final String cardiacSurgeryIntervention = DAO.usernameEmr + ".CARDIAC_SURGERY_INTERVENTION   ";
        public static final String cathCardiacDetail = DAO.usernameEmr + ".CARDIAC_CATH_DETAIL   ";
        public static final String cardiacMedication = DAO.usernameEmr + ".CARDIAC_MEDICATION   ";
        public static final String outsidePatient = DAO.username + "." + "OUTSIDE_PATIENT ";
        public static final String outsidePatientUpdate = DAO.username + ".UPDATE_OUTSIDE_PATIENT ";
        public static final String echoCardiographyMaster = DAO.username + ".ECHO_CARDIOGRAPHY_MASTER ";
        public static final String cardioEchoCardiographyDetail = DAO.username + ".ECHO_CARDIOGRAPHY_DETAIL ";
        public static final String echoCardiography = DAO.username + ".ECHO_CARDIOGRAPHY ";
        public static final String perfusionInformation = DAO.username + ".CARDIAC_REGISTRY_PERFUSION ";
        public static final String perfusionPressureGraph = DAO.username + ".PERFUSION_PRESSURE_GRAPH ";
        public static final String perfusionCheckList = DAO.username + ".PERFUSIONIST_CHECK_LIST ";
        public static final String perfusionBloodGases = DAO.username + ".BLOOD_GASES ";
        public static final String perfusionTime = DAO.username + ".PERFUSION_TIME ";

        public static final String member = DAO.usernameEmr + ".MEMBER   ";
        public static final String bookIssueDetail = DAO.usernameEmr + ".BOOK_ISSUE_DETAIL   ";
        public static final String book = DAO.usernameEmr + ".BOOK   ";
        public static final String publisher = DAO.usernameEmr + ".BOOK   ";
        public static final String bookAuthor = DAO.usernameEmr + ".BOOK_AUTHOR   ";
        public static final String bookWiseAuthor = DAO.usernameEmr + ".BOOK_AUTHOR   ";
        public static final String returnbookhistroy = DAO.usernameEmr + ".BOOK_AUTHOR   ";

        public static final String userWiseGroupParameters = DAO.usernameEmr + ".USER_WISE_PARAMETERS   ";
        public static final String ipdMedicinePlan = DAO.usernameEmr + ".IPD_MEDICINE_PLAN   ";
        public static final String patientWiseSelectedParameters = DAO.usernameEmr + ".PAT_WISE_SELECTED_PARAMETER   ";
        public static final String userWiseParameterMaster = DAO.usernameEmr + ".USER_WISE_PARAMETER_MASTER   ";
        public static final String userWiseParameterDetail = DAO.usernameEmr + ".USER_WISE_PARAMETER_DETAIL   ";
        public static final String userWiseParameter = DAO.usernameEmr + ".USER_WISE_PARAMETER_DETAIL   ";
        public static final String treatmentOnDischarge = DAO.usernameEmr + ".TREATMENT_ON_DISCHARGE   ";
        public static final String treatmentOnDischargeDetail = DAO.usernameEmr + ".TREATMENT_ON_DISCHARGE_DETAIL   ";
        public static final String treatmentOnDischargeHistory = DAO.usernameEmr + ".TREATMENT_ON_DISCHARGE_HISTORY   ";
        public static final String pathWidalReporting = DAO.usernameEmr + ".PATH_WIDAL_REPORTING   ";
        public static final String party = DAO.usernameEmr + ".PARTY   ";

        public static final String gynaeParameters = DAO.usernameEmr + ".GYNAE_PARAMETERS   ";
        public static final String antenatalPatientInfo = DAO.usernameEmr + ".ANTENATAL_PATIENT_INFO   ";
        public static final String recordOfAntenatalVisits = DAO.usernameEmr + ".RECORD_OF_ANTENATAL_VISITS   ";

        public static final String dialysisMaster = DAO.usernameEmr + ".DIALYSIS   ";
        public static final String dialysisItemDetail = DAO.usernameEmr + ".DIALYSIS_ITEM_DETAIL   ";

        public static final String defineUsers = DAO.usernameEmr + "." + "DEFINE_USERS";
        public static final String userAccessRights = DAO.usernameEmr + "." + "USER_ACCESS_RIGHTS";
        public static final String chestPainClinic = DAO.usernameEmr + "." + "CHEST_PAIN_CLINIC";
        public static final String locWiseCashSummary = DAO.usernameEmr + "." + "LOC_WISE_CASH_SUMMARY";
        public static final String locWiseCashDetail = DAO.usernameEmr + "." + "LOC_WISE_CASH_DETAIL";
        public static final String locWiseCashDepositDetail = DAO.usernameEmr + ".LOC_WISE_DEPOSIT_DETAIL";
        public static final String bank = DAO.usernameEmr + ".BANK";
        public static final String otc = DAO.usernameEmr + ".OTC";
        public static final String UserWiseGroup = DAO.usernameEmr + ".USER_WISE_GROUP ";
        public static final String UserWiseFavorites = DAO.usernameEmr + ".USER_WISE_FAVOURITES ";
        public static final String echoDetail = DAO.usernameEmr + ".CARDIAC_ECHO_DETAIL ";
        public static final String echoResults = DAO.usernameEmr + ".CARDIAC_ECHO_RESULT ";
        public static final String opdReferLog = DAO.usernameEmr + ".OPD_REFER_LOG ";
        public static final String patMedCategoryLog = DAO.usernameEmr + ".PAT_MED_CATEGORY_LOG ";
        public static final String auditLog = DAO.usernameEmr + "." + "AUDIT_LOG ";
        public static final String invoiceMaster = DAO.usernameEmr + "." + "INVOICE_MASTER ";
        public static final String performingShareSummary = DAO.usernameEmr + "." + "PERFORMING_SHARE_SUMMARY";
        public static final String historyStoreWisePatientDiscount
                = DAO.usernameEmr + ".HISTORY_STORE_WISE_PAT_DISC ";

        public static final String otCheckList
                = DAO.usernameEmr + ".OT_CHECK_LIST ";

        public static final String otProcedureLog = DAO.usernameEmr + ".OT_PROCEDURE_LOG ";

        public static final String templateCptTextReporting = DAO.usernameEmr + ".TEMPLATE_CPT_TEXT_REPORTING ";
        public static final String templatePathGrowthSensitivity = DAO.usernameEmr + ".TEMPLATE_PATH_GROWTH_SENSITIV ";
        public static final String templatePathologyResultMaster = DAO.usernameEmr + ".TEMPLATE_PATHOLOGY_RSLT_MASTER ";
        public static final String templatePathOrganismGrowth = DAO.usernameEmr + ".TEMPLATE_PATH_ORGANISM_GROWTH  ";

        public static final String emergencyPendingVisit = DAO.usernameEmr + ".EMER_PENDING_VISIT ";
        public static final String emergencyPerformedVisit = DAO.usernameEmr + ".EMER_PERFORMED_VISIT ";

        public static final String traumaPendingCalls = DAO.usernameEmr + ".TRAUMA_PENDING_CALLS ";
        public static final String traumaPerformedCalls = DAO.usernameEmr + ".TRAUMA_PERFORMED_CALLS ";

        public static final String attendanceServer = DAO.usernameEmr + ".HR_ATTENDANCE_SERVER ";
        public static final String refinedAttendanceData = DAO.usernameEmr + ".HR_ATTENDANCE_SERVER ";
        public static final String cptWiseNotCpt = DAO.usernameEmr + ".CPT_WISE_NOT_CPT ";
        public static final String attachEmployeePic = DAO.usernameEmr + ".CLIENT_WISE_EMP_PICTURE ";
        public static final String clientEmployeeApproval = DAO.usernameEmr + ".CLIENT_EMPLOYEE_APPROVAL ";
        public static final String attachEmployeePicHistory = DAO.usernameEmr + ".CLIENT_EMP_PICTURE_HISTORY ";
        public static final String clientEmployeeFamily = DAO.usernameEmr + ".CLIENT_EMP_DETAIL ";
        public static final String employeeDetailHistory = DAO.usernameEmr + ".CLIENT_EMP_DETAIL_HIST ";
        public static final String teamShareMaster = DAO.usernameEmr + ".TEAM_SHARE_MASTER ";
        public static final String teamShareDetail = DAO.usernameEmr + ".TEAM_SHARE_DETAIL ";
        public static final String outSideReportsMaster = DAO.usernameEmr + ".PATIENT_OUTSIDE_REPORTS ";
        public static final String outSideReportsDetail = DAO.usernameEmr + ".OUTSIDE_REPORTS_DETAIL ";
        public static final String userAccessRightsSetup = DAO.usernameEmr + ".USER_ACCESS_RIGHTS_SETUP ";
        public static final String userAccessRightsHistory = DAO.usernameEmr + ".USER_ACCESS_RIGHTS_HISTORY ";
        public static final String systemUserManual = DAO.usernameEmr + ".SYSTEM_USER_MANUAL ";
        public static final String patientReferral = DAO.usernameEmr + ".PATIENT_OUTSIDE_REFERRAL ";
        public static final String abpmMaster = DAO.usernameEmr + ".ABPM_MASTER ";
        public static final String abpmDetail = DAO.usernameEmr + ".ABPM_DETAIL ";
        public static final String clientEmployeeData = DAO.usernameEmr + ".CLIENT_EMPLOYEE_DATA ";
        public static final String clientWiseEmployee = DAO.usernameEmr + ".CLIENT_WISE_EMPLOYEE_MASTER ";
        public static final String patientEyeVision = DAO.usernameEmr + ".PATIENT_EYE_VISION  ";
        public static final String eyeVisionDetail = DAO.usernameEmr + ".EYE_VISION_DETAIL  ";
        public static final String surgeryNotesPending = DAO.usernameEmr + ".SURGERY_NOTES_PENDING ";
        public static final String transactionTypeHistory = Database.usernameEmr + ".TRANSACTION_CHANGE_HISTORY ";
        public static final String addSlotRights = DAO.usernameEmr + ".CLINIC_ADD_SLOT_RIGHTS ";
        public static final String cancelAppointment = DAO.usernameEmr + ".CANCELLED_APPOINTMENT ";
        public static final String patientQuestionaireDetail = DAO.usernameEmr + ".PATIENT_QUESTIONAIRE_DETAIL ";
        public static final String patientQuestionaire = DAO.usernameEmr + ".PATIENT_QUESTIONAIRE ";
        public static final String orderReviewHistory = Database.usernameEmr + ".ORDER_REVIEW_HISTORY ";
        public static final String clinicalProcedureTeam = DAO.usernameEmr + ".CLINICAL_PROCEDURE_TEAM ";
        public static final String logSnowMedCode = DAO.usernameEmr + ".HISTORY_SNOW_MED_CODE ";
        public static final String LiverDonorRecipientHistory = DAO.usernameEmr + ".TRANSPLANT_PATIENT_HISTORY ";
        public static final String mdtPatientReview = DAO.usernameEmr + ".MDT_PATIENT_REVIEW ";
        public static final String mdtWisePhysician = DAO.usernameEmr + ".MDT_WISE_PHYSICIAN ";
        public static final String attendanceSummary = DAO.usernameEmr + ".HR_ATTENDANCE_SUMMARY ";
        public static final String hrThumbAttendance = DAO.usernameEmr + ".HR_THUMB_ATTENDANCE ";
        public static final String MDTReviewHistory = DAO.usernameEmr + ".MDT_REVIEW_HISTORY ";
        public static final String otPendingProcedure = DAO.usernameEmr + ".OT_PENDING_PROCEDURE ";
        public static final String otPerformedProcedure = "EMRARCHIVE.OT_PERFORMED_PROCEDURE ";
        public static final String generalAnaesthesiaFitness = DAO.usernameEmr + ".GENERAL_ANAESTHESIA_FITNESS ";
        public static final String otPendingOrders = DAO.usernameEmr + ".ORDER_PENDING_HISTORY ";
        public static final String orderPendingQueue = DAO.usernameEmr + ".PATIENT_PENDING_ORDER ";
        public static final String orderProcessedQueue = DAO.usernameEmr + ".PATIENT_PERFORMED_ORDER ";
        public static final String mdtTeam = DAO.usernameEmr + ".MDT_TEAM ";
        public static final String mdtTeamMember = DAO.usernameEmr + ".MDT_TEAM_DETAIL ";
        public static final String otProcedureTeam = DAO.usernameEmr + ".OT_PROCEDURE_TEAM ";
        public static final String OTTeam = DAO.usernameEmr + ".OT_TEAM ";
        public static final String DianosticOrderHistory = DAO.usernameEmr + ".DIAGNOSTIC_ORDER_HISTORY ";
        public static final String dianosticHistoryDetail = DAO.usernameEmr + ".DIAGNOSTIC_HISTORY_DETAIL ";
        public static final String stoolDr = DAO.usernameEmr + ".PATH_STOOL_DR ";
        public static final String urineDr = DAO.usernameEmr + ".PATH_URINE_DR ";
        public static final String transplantDonors = DAO.usernameEmr + ".TRANSPLANT_DONORS ";
        public static final String attachDocumnet = DAO.usernameEmr + ".PATIENT_REPORTS_ATTACHMENTS  ";
        public static final String cptWiseQuestionaire = DAO.usernameEmr + ".CPT_WISE_QUESTIONAIRE ";
        public static final String bedTransferRequest = DAO.usernameEmr + ".BED_TRANSFER_REQUEST ";
        public static final String patientCreditApproval = DAO.usernameEmr + ".PATIENT_CREDIT_APPROVAL ";
        public static final String patientCreditLimit = DAO.usernameEmr + ".PATIENT_CREDIT_LIMIT ";
        public static final String blbTransfusionReporting = DAO.usernameEmr + ".BLB_TRANSFUSION_REPORTING ";
        public static final String financialSupportInternalMember = DAO.usernameEmr + ".INTERNAL_COMMITTEE_MEMBER  ";
        public static final String financialSupportApproval = DAO.usernameEmr + ".FINANCIAL_SUPPORT_APPROVAL  ";
        public static final String userWiseLocation = DAO.usernameEmr + "." + "USER_WISE_LOCATIONS  ";
        public static final String cptWiseCancelCpt = DAO.usernameEmr + "." + "CPT_WISE_CANCEL_CPT  ";
        public static final String passwordChangeHistory = Database.usernameEmr + "." + "PASSWORD_CHANGE_HISTORY ";
        public static final String clientWiseBlockedItems = DAO.usernameEmr + "." + "CLIENT_WISE_BLOCKED_ITEMS ";
        public static final String inpatientInvoices = DAO.usernameEmr + "." + "INPATIENT_INVOICES ";
        public static final String dischargePendingCertificate = DAO.usernameEmr + "." + "DISCHARGE_PENDING_CERTIFICATE ";
        public static final String cptWisePerformingRights = DAO.usernameEmr + ".CPT_WISE_PERFORMING_RIGHTS  ";
        public static final String pathologyBatch = DAO.usernameEmr + ".PATHOLOGY_BATCH ";
        public static final String appointment = DAO.usernameEmr + ".APPOINTMENT  ";
        public static final String appSMSDetail = DAO.usernameEmr + ".APP_SMS_DETAIL ";
        public static final String role = DAO.usernameEmr + ".ROLE   ";
        public static final String bloodGroup = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String city = DAO.usernameEmr + ".CITY  ";
        public static final String company = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String gender = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String title = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String country = DAO.usernameEmr + ".COUNTRY  ";
        public static final String location = DAO.usernameEmr + ".LOCATION  ";
        public static final String locationWiseLocation = DAO.usernameEmr + ".LOCATION_WISE_LOCATION  ";
        public static final String patientAdmission = DAO.usernameEmr + ".PATIENT_ADMISSION  ";
        public static final String patientDischarge = DAO.usernameEmr + ".PATIENT_DISCHARGE ";
        public static final String dischargeDetail = DAO.usernameEmr + ".DISCHARGE_DETAIL ";
        public static final String pofPatients = DAO.usernameEmr + ".POF_PATIENTS ";
        public static final String pofPatientVisits = DAO.usernameEmr + ".POF_PATIENTS_VISIT  ";
        public static final String pofPatientVisitDetail = DAO.usernameEmr + ".POF_PAT_VISIT_DETAIL  ";
        public static final String patientAdmissionHistory = DAO.usernameEmr + ".PATIENT_ADMISSION_HISTORY  ";
        public static final String userWiseCpt = DAO.usernameEmr + ".USER_WISE_CPT  ";
        public static final String consultantChangeHistory = Database.usernameEmr + ".CONSULTANT_SHARE_HISTORY  ";
        public static final String blbProductOrderDelivered = DAO.usernameEmr + ".BLB_PRODUCT_ORDER_DELIVERED  ";
        public static final String clinicalTeam = DAO.usernameEmr + ".CLINICAL_TEAM  ";
        public static final String clinicalTeamMember = DAO.usernameEmr + ".CLINICAL_MEMBER  ";
        public static final String blbOutsideProductProduct = DAO.usernameEmr + ".BLB_OUTSIDE_PRODUCTS  ";
        public static final String caseStudyHistory = DAO.usernameEmr + ".CASE_STUDY_HISTORY  ";
        public static final String enableRefundRequest = DAO.usernameEmr + ".ENABLE_REFUND_REQUEST  ";
        public static final String userCloud = DAO.usernameEmr + ".USER_CLOUD  ";
        public static final String caseTransferHistory = DAO.usernameEmr + ".CASE_TRANSFER_HISTORY  ";
        public static final String blbPerformedQueue = DAO.usernameEmr + ".BLB_DONOR_PERFORMED  ";
        public static final String lisParameter = DAO.usernameEmr + ".PATH_ANALYZER_WISE_PARAMETER  ";
        public static final String CPTWisePerformingRights = DAO.usernameEmr + ".CPT_WISE_PERFORMING_RIGHTS  ";
        public static final String locationWiseDepartment = DAO.usernameEmr + ".LOCATION_WISE_DEPARTMENT  ";
        public static final String patientExaminationsDetailItem = DAO.usernameEmr + ".EXAMINATION_DETAIL_OPTION   ";
        public static final String specialityExamDetailItem = DAO.usernameEmr + ".SPECIALITY_EXAM_DETAIL_ITEM   ";
        public static final String clinicStatusHistory = DAO.usernameEmr + ".UPDATE_CLINIC_STATUS_HIST  ";
        public static final String room = DAO.usernameEmr + ".ROOM  ";
        public static final String rack = DAO.usernameEmr + ".RACK  ";
        public static final String customer = DAO.usernameEmr + ".CUSTOMER  ";
        public static final String locationWiseCPT = DAO.usernameEmr + ".LOCATION_WISE_CPT  ";
        public static final String shelf = DAO.usernameEmr + ".SHELF  ";
        public static final String patientFileMovement = DAO.usernameEmr + ".PATIENT_FILE_MOVEMENT  ";
        public static final String FileMovementHistory = Database.usernameEmr + ".FILE_MOVEMENT_HISTORY  ";
        public static final String FileRecord = DAO.usernameEmr + ".PATIENT_FILE_RECORD  ";
        public static final String sampleStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String designation = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String type = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String CPT = DAO.usernameEmr + ".CPT  ";
        public static final String CPTCodes = DAO.usernameEmr + ".CPT_WISE_CODES  ";
        public static final String CPTWiseCPT = DAO.usernameEmr + ".CPT_WISE_CPT  ";
        public static final String item = DAO.usernameEmr + ".ITEM  ";
        public static final String itemHistory = Database.usernameEmr + ".ITEM_HISTORY  ";
        public static final String pathFarwordHistory = Database.usernameEmr + ".PATH_FARWORD_HISTORY  ";
        public static final String pathTubeScanning = DAO.usernameEmr + ".PATH_TUBE_SCANNING  ";
        public static final String pathHistoReport = "DUHS.PATH_HISTO_REPORT  ";
        public static final String pathHistoWorkflow = DAO.usernameEmr + ".PATH_HISTO_WORKFLOW  ";
        public static final String pathSnowMedCode = DAO.usernameEmr + ".SNOW_MED_CODE  ";
        public static final String userUpdateHistory = Database.usernameEmr + ".USER_UPDATE_HISTORY  ";
        public static final String userWiseDepartment = DAO.usernameEmr + ".USER_WISE_DEPARTMENT  ";
        public static final String labNoChangeHistory = DAO.usernameEmr + ".LABNO_CHANGE_HISTORY  ";
        public static final String advanceRefundRequest = DAO.usernameEmr + ".ADVANCE_REFUND_REQUEST  ";
        public static final String updateClientHistory = DAO.usernameEmr + ".UPDATE_CLIENT_HISTORY  ";
        public static final String updateOrderHistory = DAO.usernameEmr + ".UPDATE_ORDER_HISTORY  ";
        public static final String selectedTCode = DAO.usernameEmr + ".SELECTED_TCODE  ";
        public static final String performingShareVerification = DAO.usernameEmr
                + ".PERFORMING_SHARE_VERIFICATION  ";
        public static final String imagingSpecialApproval = DAO.usernameEmr
                + ".IMAGING_SPECIAL_APPROVAL  ";
        public static final String gastroReporting = DAO.usernameEmr + ".GASTRO_REPORTING";
        public static final String gastroReportingDetail = DAO.usernameEmr + ".GASTRO_REPORTING_DETAIL";
        public static final String selectedTWiseMCode = DAO.usernameEmr + ".SELECTED_TWISE_MICDO_CODE  ";
        public static final String clientChangeHistory = DAO.usernameEmr + ".CLIENT_CHANGE_HISTORY  ";
        public static final String clientWisePackage = DAO.username + ".CLIENT_WISE_PACKAGE   ";
        public static final String cptPackageDetail = DAO.username + ".CPT_PACKAGE_DETAIL   ";
        public static final String echoReporting = DAO.usernameEmr + ".ECHO_REPORTING  ";
        public static final String equipmentStatus = DAO.usernameEmr + ".EQUIPMENT_STATUS  ";
        public static final String specialityWiseItem = DAO.usernameEmr + ".SPECIALITY_WISE_ITEM  ";
        public static final String generic = DAO.usernameEmr + ".GENERIC  ";
        public static final String advanceReceiveHistory = DAO.usernameEmr + ".ADVANCE_RECEIVED_HISTORY  ";
        public static final String bed = DAO.usernameEmr + ".BED  ";
        public static final String ward = DAO.usernameEmr + ".WARD  ";
        public static final String cptWisePerformingShare = DAO.usernameEmr + ".CPT_WISE_PERFORMING_SHARE  ";
        public static final String locWiseCPTReportTiming = DAO.usernameEmr + ".LOC_WISE_CPT_REPORT_TIMING  ";
        public static final String onlineReports = DAO.usernameEmr + ".ONLINE_REPORTS  ";
        public static final String cptReportingDays = DAO.usernameEmr + ".CPT_PERFORM_DAY   ";
        public static final String orderLocation = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL    ";
        public static final String filmSize = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String contrastType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String contrastQty = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String imagingReportingTemplate = DAO.usernameEmr + ".IMAGING_REPORTING_TEMPLATE   ";
        public static final String teleReportingTemplate = DAO.usernameEmr + ".PACS_REPORTING_TEMPLATE   ";
        public static final String applicationReports = DAO.usernameEmr + ".APP_REPORTS   ";
        public static final String reportAccessHistory = Database.usernameEmr + ".REPORT_VIEW_HISTORY   ";
        public static final String reportDeliveryInfo = Database.usernameEmr + ".REPORT_DELIVERY_HISTORY   ";
        public static final String filmReceivedInfo = Database.usernameEmr + ".FILMS_RECEIVED_HISTORY   ";
        public static final String applicationComments = DAO.usernameEmr + ".APPLICATION_COMMENTS   ";
        public static final String wordShortcuts = DAO.usernameEmr + ".WORD_SHORTCUT  ";
        public static final String primaryKey = DAO.usernameEmr + ".DEFINITION_KEYS  ";
        public static final String pathLabNo = DAO.usernameEmr + ".PATH_LAB_NO  ";
        public static final String imagingResultHistory = Database.usernameEmr + ".IMAGING_RESULT_HISTORY  ";
        public static final String imagingRota = DAO.usernameEmr + ".IMAGING_ROTA  ";
        public static final String opdCptMedOrders = DAO.usernameEmr + ".OPD_CPT_MED_ORDERS  ";
        public static final String medicineFrequency = DAO.usernameEmr + ".MEDICINE_FREQUENCY  ";
        public static final String userWiseMedFrequency = DAO.usernameEmr + ".USER_WISE_MED_FREQ   ";
        public static final String pathologyWidalReporting = DAO.usernameEmr + ".PATH_WIDAL_REPORTING ";
        public static final String systemConfiguration = DAO.usernameEmr + ".PATH_WIDAL_REPORTING ";
        public static final String clientEmployeeDocs = DAO.usernameEmr + ".CLIENT_EMPLOYEE_DOCS     ";
        public static final String definitionType = DAO.usernameEmr + ".DEFINITION_TYPE   ";
        public static final String definitionTypeDetail = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String definitionTypeDetailHist = DAO.usernameEmr + ".DEF_TYPE_DETAIL_HIST   ";
        public static final String userWiseEmployee = DAO.usernameEmr + ".USER_WISE_EMPLOYEES   ";
        public static final String remoteRadiolgist = DAO.usernameEmr + ".REMOTE_RADIOLOGIST   ";
        public static final String organismWiseMedicine = DAO.usernameEmr + ".ORGANISM_WISE_MEDICINE   ";
        public static final String ItemWiseBrand = DAO.usernameEmr + ".ITEM_WISE_BRAND   ";
        public static final String storeWiseItems = DAO.usernameEmr + ".STORE_WISE_ITEMS   ";
        public static final String storeWiseUser = DAO.usernameEmr + ".STORE_WISE_USERS   ";
        public static final String store = DAO.usernameEmr + ".STORE   ";
        public static final String storeWisePatientDiscount = DAO.usernameEmr + ".STORE_WISE_PATIENT_DISCOUNT   ";
        public static final String storeWiseIndentStore = DAO.usernameEmr + ".STORE_WISE_INDENT   ";
        public static final String indication = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String riskFactor = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String medication = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String reasonForTermination = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String exercisePhase = DAO.usernameEmr + ".ETT_EXERCISE_PHASE   ";
        public static final String ettReport = DAO.usernameEmr + ".ETT_REPORT   ";
        public static final String ettReportDetail = DAO.usernameEmr + ".ETT_REPORT_DETAIL   ";
        public static final String recoveryPhase = DAO.usernameEmr + ".ETT_RECOVERY_PHASE   ";
        public static final String restingPhase = DAO.usernameEmr + ".ETT_RESTING_PHASE   ";
        public static final String CPTParameter = DAO.usernameEmr + ".CPT_PARAMETER   ";
        public static final String CPTTextReporting = DAO.usernameEmr + ".CPT_TEXT_REPORTING   ";
        public static final String organization = DAO.usernameEmr + ".ORGANIZATION   ";
        public static final String sectionWisePerformDay = DAO.usernameEmr + ".GROUP_WISE_PERFORM_DAY   ";
        public static final String client = DAO.usernameEmr + ".CLIENT   ";
        public static final String pathReportTime = DAO.usernameEmr + ".PATH_REPORTING_TIME  ";
        public static final String clientWiseCPT = DAO.usernameEmr + ".CLIENT_WISE_CPT  ";
        public static final String clientCreditReceive = DAO.usernameEmr + ".CLIENT_CREDIT_RECIEVE  ";
        public static final String clientAmounDetail = DAO.usernameEmr + ".CLIENT_AMOUNT_DETAIL   ";
        public static final String balanceRefundApproval = DAO.usernameEmr + ".BALANCE_REFUND_APPROVAL   ";
        public static final String deathCertificate = DAO.usernameEmr + ".DEATH_CERTIFICATE   ";
        public static final String maritalStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patient = DAO.usernameEmr + ".PATIENT   ";
        public static final String patientCardHistory = Database.usernameEmr + ".PATIENT_CARD_HISTORY   ";
        public static final String oldMRNO = "DUHS.UPATIENT_REGISTRATION   ";
        public static final String blbProductOrderPending = DAO.usernameEmr + ".BLB_PRODUCT_ORDER_PENDING   ";
        public static final String audioReporting = DAO.usernameEmr + ".CPT_AUDIO_REPORTING  ";
        public static final String icd10Chapter = DAO.usernameEmr + ".ICD10_CHAPTER  ";
        public static final String icd10Block = DAO.usernameEmr + ".ICD10_BLOCK  ";
        public static final String patientPicture = DAO.usernameEmr + ".PATIENT_PICTURE   ";
        public static final String patientUpdateHistory = Database.usernameEmr + ".PATIENT_UPDATE_HISTORY   ";
        public static final String mergePatient = DAO.usernameEmr + ".MERGE_PATIENT   ";
        public static final String unmergePatientHistory = DAO.usernameEmr + ".UNMERGE_PAT_HISTORY   ";
        public static final String compoundAdditive = DAO.usernameEmr + ".COMPOUNDING_ADDITIVE   ";
        public static final String compoundAdditiveDetail = DAO.usernameEmr + ".COMPOUNDING_ADDITIVE_DETAIL   ";
        public static final String ipdDepartmentWiseSummary = DAO.usernameEmr + ".IPD_DEP_PAT_DETAIL   ";
        public static final String departmentWiseIpdBill = DAO.usernameEmr + ".DEPARTMENT_WISE_IPD_BILL   ";
        public static final String indentRequestEditHist = DAO.usernameEmr + ".INDENT_REQUEST_EDIT_HISTORY   ";

        public static final String patientOldMRNO = DAO.usernameEmr + ".PATIENT_OLD_MRNO   ";
        public static final String pharmacyGuide = DAO.usernameEmr + ".PHARMACY_GUIDE  ";
        public static final String appUpgradeHistory = DAO.usernameEmr + ".APP_UPGRADE_HISTORY  ";

        public static final String ventricular = DAO.usernameEmr + ".HOLTER_WISE_VENTRICULAR   ";
        public static final String supraventricular = DAO.usernameEmr + ".HOLTER_WISE_SUPRAVENTRICULAR   ";
        public static final String rtdependentevents = DAO.usernameEmr + ".RATE_DEPENDENT_EVENTS   ";
        public static final String stanalysis = DAO.usernameEmr + ".ST_EPISODE_ANALYSIS   ";
        public static final String holter = DAO.usernameEmr + ".HOLTER   ";
        public static final String tokenPrintHistory = DAO.usernameEmr + ".TOKEN_PRINT_HISTORY   ";

        public static final String clientWiseLocation = DAO.usernameEmr + ".CLIENT_WISE_LOCATION   ";
        public static final String billingLedger = DAO.usernameEmr + ".BILLING_LEDGER   ";
        public static final String cancelReturnMaster = DAO.usernameEmr + ".CANCEL_RETURN_MASTER   ";
        public static final String cancelReturnDetail = DAO.usernameEmr + ".CANCEL_RETURN_DETAIL   ";
        public static final String specimen = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String cathProcData = DAO.usernameEmr + ".CATH_PROC_DATA   ";
        public static final String speciality = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patientType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patientStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String province = DAO.usernameEmr + ".PROVINCE   ";
        public static final String religion = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String department = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String active = DAO.usernameEmr + ".ACTIVE   ";
        public static final String cultureMedicine = DAO.usernameEmr + ".CULTURE_MEDICINE  ";
        public static final String section = DAO.usernameEmr + ".SECTION   ";
        public static final String users = DAO.usernameEmr + ".USERS   ";
        public static final String pofWardStatus = DAO.usernameEmr + ".POF_WARD_STATUS    ";
        public static final String onCallDoctor = DAO.usernameEmr + ".ON_CALL_DOCTOR   ";
        public static final String doctor = DAO.usernameEmr + ".DOCTOR   ";
        public static final String appointmentTime = DAO.usernameEmr + ".APPOINTMENT_TIME   ";
        public static final String nutritionistConsultancy = DAO.usernameEmr + ".NUTRITIONIST_CONSULTANCY  ";
        public static final String donorCPTOrders = DAO.usernameEmr + ".DONOR_ORDERS   ";
        public static final String procedureInvoices = DAO.usernameEmr + ".PROCEDURE_INVOICE   ";
        public static final String patientAttendant = DAO.usernameEmr + ".PATIENT_ATTENDANT   ";

        public static final String icdOCodes = DAO.usernameEmr + ".ICD10_CODES   ";
        public static final String icd10Code = DAO.usernameEmr + ".ICD10_CODE   ";

        public static final String Keys = DAO.usernameEmr + ".KEYS   ";
        public static final String imagingVerifyRights = DAO.usernameEmr + ".PERFORMING_VERIFY_RIGHTS   ";
        public static final String diagnosticOrderHistory = DAO.usernameEmr + ".DIAGNOSTIC_ORDER_HISTORY   ";
        public static final String procedureOrderHistory = DAO.usernameEmr + ".PROCEDURE_ORDER_HISTORY   ";
        public static final String imagingHistoryChangeTrack = Database.usernameEmr + ".IMAGING_HISTORY_CHANGE_TRACK   ";
        public static final String orderMaster = DAO.usernameEmr + ".ORDER_MASTER   ";
        public static final String prescription = DAO.usernameEmr + ".PRESCRIPTION   ";
        public static final String practiceIncome = DAO.usernameEmr + ".PRACTICE_INCOME   ";
        public static final String orderDetail = DAO.usernameEmr + ".ORDER_DETAIL  ";
        public static final String pofHsr = DAO.usernameEmr + ".POF_HSR";
        public static final String patFinancialSupport = DAO.usernameEmr + ".PAT_FINANCIAL_SUPPORT   ";

        public static final String invoiceDetail = DAO.usernameEmr + ".INVOICE_DETAIL   ";
        public static final String expenseType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String expenseDailyDetail = DAO.usernameEmr + ".DAILY_EXPENSE_DETAIL   ";
        public static final String imagingResult = DAO.usernameEmr + ".IMAGING_RESULTS   ";
        public static final String previousImagingResult = "DUHS.IMAGING_RESULTS   ";
        public static final String imagingPendingQueue = DAO.usernameEmr + ".IMAGING_PENDING_QUEUE   ";
        public static final String imagingAddendum = DAO.usernameEmr + ".IMAGING_ADDENDUM   ";
        public static final String modalityAnalyzer = DAO.usernameEmr + ".MODALITY_ANALYZER   ";
        public static final String sectionMachine = DAO.usernameEmr + ".SECTION_MACHINE   ";
        public static final String emailQueue = DAO.usernameEmr + ".EMAIL_QUEUE   ";
        public static final String appStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String mobilityStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String pathDefParams = DAO.usernameEmr + ".DEF_PATH_PARAMS   ";
        public static final String pathRerunSample = DAO.usernameEmr + ".PATH_RERUN_SAMPLE   ";
        public static final String sendSMS = DAO.usernameEmr + ".SEND_SMS   ";
        public static final String setupColumnDetail = DAO.usernameEmr + ".SETUP_COLUMN_DETAIL   ";

        public static final String clientBillReceive = DAO.usernameEmr + ".CLIENT_BILL_RECEIVE  ";
        public static final String clientBillTransferDetail = DAO.usernameEmr + ".CLIENT_BILL_TRANSFER_DETAIL  ";

        public static final String clientBillMaster = DAO.usernameEmr + ".CLIENT_BILL_MASTER  ";
        public static final String clientBillDetail = DAO.usernameEmr + ".CLIENT_BILL_DETAIL  ";
        public static final String clientAmountReceiveWiseBill = DAO.usernameEmr + ".CLIENT_RECEIVE_BILLS_NO  ";

        public static final String clientCptUpdateHistory = Database.usernameEmr + ".CLIENT_CPT_UPDATE_HIST  ";

        public static final String outsideInvestigations = DAO.usernameEmr + ".OUTSIDE_INVESTIGATIONS  ";

        public static final String pathSeriologyResultDetail = DAO.usernameEmr + ".PATH_SERIOLOGY_RESULT_DETAIL  ";
        public static final String userWiseLocations = DAO.usernameEmr + ".USER_WISE_LOCATIONS  ";
        public static final String pathOrganismGrowth = DAO.usernameEmr + ".PATH_ORGANISM_GROWTH  ";
        public static final String pathGrowthSensitivity = DAO.usernameEmr + ".PATH_GROWTH_SENSITIVITY  ";
        public static final String pathOrganismQuantity = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String cptHoldResults = DAO.usernameEmr + ".CPT_HOLD_RESULTS   ";//

        /**
         * cardiology setup tables
         */
        public static final String wire = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String stent = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String stentType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String chether = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String chetherCurve = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String chetherDiameter = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String balloonLength = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String balloonType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        //END CATH SETUP TABLES
        public static final String radiologyData = " radiology.dbo.RadIntegration   ";
        //Tables for Security Implmentation
        public static final String rightsAssignHistory = Database.usernameEmr + ".RIGHTS_ASSIGN_HISTORY   ";
        public static final String roleWiseForm = DAO.usernameEmr + ".ROLE_WISE_FORM  ";
        public static final String userWiseRole = DAO.usernameEmr + ".USER_WISE_ROLE  ";
        public static final String formWiseAction = DAO.usernameEmr + ".FORM_ACTION  ";

        public static final String form = DAO.usernameEmr + ".FORM  ";
        public static final String terminal = DAO.usernameEmr + ".TERMINALS  ";
        public static final String terminalMacAddress = DAO.usernameEmr + ".TERMINAL_MAC_ADDRESSES   ";
        public static final String menu = DAO.usernameEmr + ".MENU  ";
        public static final String modality = DAO.usernameEmr + ".MODALITY  ";
        public static final String symbols = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String appGroupComponent = DAO.usernameEmr + ".APP_GROUP_COMPONENT  ";
        public static final String refundMaster = DAO.usernameEmr + ".REFUND_MASTER  ";
        public static final String refundDetail = DAO.usernameEmr + ".REFUND_DETAIL  ";
        public static final String modalityWiseCPT = DAO.usernameEmr + ".MODALITY_WISE_CPT  ";
        public static final String receivedBalanceHistory = DAO.usernameEmr + ".BALANCE_RECEIVED_HISTORY  ";
        public static final String reportPrintHistory = DAO.usernameEmr + ".REPORT_PRINT_HISTORY  ";
        public static final String reportingFormat = DAO.usernameEmr + ".REPORTING_FORMAT   ";
        public static final String reportingDay = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String reports = DAO.usernameEmr + ".APP_REPORTS   ";
        public static final String userWiseReports = DAO.usernameEmr + ".USER_WISE_REPORTS   ";
        public static final String reportWiseParameter = DAO.usernameEmr + ". REPORT_WISE_PARAMETER   ";
        public static final String reportParameter = DAO.usernameEmr + ". REPORT_PARAMETER   ";
        public static final String dailyCashSummary = DAO.usernameEmr + ".DAILY_CASH_SUMMARY   ";
        public static final String invoicePrintHistory = Database.usernameEmr + ".INVOICE_PRINT_HISTORY   ";
        public static final String unverifyReportHistory = Database.usernameEmr + ".UNVERIFY_REPORT_HISTORY   ";
        public static final String orderAction = DAO.usernameEmr + ".ORDER_ACTIONS   ";
        public static final String partiallyVerifyHistory = DAO.usernameEmr + ".PARTIAL_VERIFICATION_HISTORY   ";
        public static final String conference = DAO.usernameEmr + ".CONFERENCE  ";
        public static final String conferenceStudy = DAO.usernameEmr + ".CONFERENCE_STUDY   ";
        public static final String venue = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String clinic = DAO.usernameEmr + ".CLINIC   ";
        public static final String clinicDetail = DAO.usernameEmr + ".CLINIC_DETAIL   ";
        public static final String clinicTime = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String imagingOldStudies = "DUHS.PREVIOUS_REPORTS_INVESTIGATION   ";
        public static final String radLexCode = DAO.usernameEmr + ".RADLEX_CODE   ";
        public static final String MHRADPOC = DAO.usernameEmr + ".MH_RAD_POC   ";

        //PATHOLOGY TABLES
        public static final String pathologyAnalyzerWiseParameter = DAO.usernameEmr + ".PATH_ANALYZER_WISE_PARAMETER   ";
        public static final String CPTWiseParameter = DAO.usernameEmr + ".CPT_WISE_PARAMETER   ";
        public static final String pathologysSerologyDetail = DAO.usernameEmr + ".PATH_SERIOLOGY_RESULT_DETAIL   ";
        public static final String pathologyAnalyzerRanges = DAO.usernameEmr + ".PATH_ANALYZER_RANGES   ";
        public static final String pathologySpecimen = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String pathologyPendingQueue = DAO.usernameEmr + ".PATHOLOGY_PENDING_QUEUE   ";
        public static final String pathologyResultMaster = DAO.usernameEmr + ".PATHOLOGY_RESULT_MASTER   ";
        public static final String pathologyResultDetail = DAO.usernameEmr + ".PATHOLOGY_RESULT_DETAIL   ";
        public static final String workFlowComments = DAO.usernameEmr + ".WORKFLOW_COMMENTS   ";
        public static final String PATH_PRD_LOG = Database.usernameEmr + ".PATH_RESULT_DETAIL_LOG   ";

        public static final String caseAssignHistory = DAO.usernameEmr + ".CASE_ASSIGN_HISTORY   ";
        public static final String pathologyResultDetailHistory = Database.usernameEmr + ".PATHOLOGY_RESULT_HISTORY   ";
        public static final String pathologyUrineResult = DAO.usernameEmr + ".PATH_URINE_RESULT   ";
        public static final String pathologyStoolResult = DAO.usernameEmr + ".PATH_STOOL_RESULT   ";
        public static final String pathologyBoneMarrow = DAO.usernameEmr + ".PATH_BONE_MARROW_REPORT   ";
        public static final String pathologyCultureReport = DAO.usernameEmr + ".PATH_CULTURE_REPORT   ";
        public static final String pathologyCultureGrowth = DAO.usernameEmr + ".PATH_CULTURE_GROWTH   ";
        public static final String pathologyCultureMedicine = DAO.usernameEmr + ".PATH_CULTURE_MEDICINE   ";
        public static final String pathologyCSFCytology = DAO.usernameEmr + ".PATH_CSF_CYTOLOGY   ";
        public static final String pathologyCYTBiochemistry = DAO.usernameEmr + ".PATH_CYT_BIOCHEMISTRY   ";
        public static final String pathologyTextReporting = DAO.usernameEmr + ".PATH_TEXT_REPORTING   ";
        public static final String pathologySemenAnalysis = DAO.usernameEmr + ".PATH_SEMEN_ANALYSIS   ";
        public static final String pathologySemenIntervals = DAO.usernameEmr + ".PATH_SEMEN_INTERVALS   ";
        public static final String blbProductDeliveryHistory = DAO.usernameEmr + ".BLB_PRODUCT_DELIVERY_HISTORY   ";

        //OPD
        public static final String ICD = DAO.usernameEmr + ".ICD   ";
        public static final String ICDChapter = DAO.usernameEmr + ".ICD_CHAPTER   ";
        public static final String ICDGroup = DAO.usernameEmr + ".ICD_GROUP    ";
        public static final String opdPendingConsultancy = DAO.usernameEmr + ".OPD_PENDING_CONSULTANCY   ";
        public static final String opdPerformedConsultancy = DAO.usernameEmr + ".OPD_PERFORMED_CONSULTANCY   ";
        public static final String pregnancyHistory = Database.usernameEmr + ".PREGNANCY_HISTORY   ";
        public static final String OBSGYNUltrasound = DAO.usernameEmr + ".OBS_GYN_ULTRASOUND ";
        public static final String antenatalVisitHistory = DAO.usernameEmr + ".ANTENATAL_VISITS_HISTORY ";

        public static final String medicineType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL    ";
        public static final String medicineOrderDetail = DAO.usernameEmr + ".ORDER_DETAIL_MEDICINE   ";
        public static final String medicinePackageDetail = DAO.usernameEmr + ".MEDICINE_PACKAGE_DETAIL   ";
        public static final String patientVitalSigns = DAO.usernameEmr + ".PATIENT_VITAL_SIGNS   ";
        public static final String medicinePackage = DAO.usernameEmr + ".MEDICINE_PACKAGE   ";
        public static final String patientExam = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String specialitySpecificData = DAO.usernameEmr + ".SPECIALITY_DATA   ";
        public static final String specialityWiseExam = DAO.usernameEmr + ".SPECIALITY_WISE_EXAM   ";
        public static final String specialityExamDetail = DAO.usernameEmr + ".SPECIALITY_EXAM_DETAIL   ";
        public static final String opdExaminations = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String patientExaminationsDetail = DAO.usernameEmr + ".PATIENT_EXAMINATION_DETAIL   ";
        public static final String terminalWiseEmp = DAO.usernameEmr + ".TERMINAL_WISE_EMP  ";
        public static final String CPTWiseItem = DAO.usernameEmr + ".CPT_WISE_ITEM   ";
        public static final String userActionWiseParameter = DAO.usernameEmr + ".USER_ACTION_WISE_PARAMETER   ";
        public static final String userActionPerformed = DAO.usernameEmr + ".USER_ACTION_PERFORMED   ";

        public static final String waiveOff = DAO.usernameEmr + ".WAIVE_OFF  ";
        public static final String locationWiseSetup = DAO.usernameEmr + ".LOCATION_WISE_SETUP  ";

        public static final String CPTBreakupItems = DAO.usernameEmr + ".CPT_BREAKUP_ITEMS  ";
        public static final String ActionWiseSMSEmailInfo = DAO.usernameEmr + ".ACTION_WISE_EMAILS  ";
        public static final String locMonthlyExpDetail = DAO.usernameEmr + ".LOC_MONTHLY_EXP_DETAIL  ";
        public static final String locMonthlyExpMaster = DAO.usernameEmr + ".LOC_MONTHLY_EXP_MASTER  ";

        public static final String transplantReviews = DAO.usernameEmr + ".TRANSPLANT_REVIEWS  ";

        public static final String CPTHistory = Database.usernameEmr + ".CPT_HISTORY  ";
        public static final String locationHistory = Database.usernameEmr + ".LOCATION_HISTORY  ";
        public static final String userSession = DAO.usernameEmr + ".USER_SESSION  ";

        public static final String setupTableColums = DAO.usernameEmr + ".SETUP_TABLE_COLUMNS  ";
        public static final String setupColumnDetailHistory = Database.usernameEmr + ".COLUMN_DETAIL_HISTORY  ";
        public static final String propertyEditHistory = Database.usernameEmr + ".PROPERTY_EDIT_HISTORY  ";

        public static final String teethExamination = DAO.usernameEmr + ".TEETH_EXAMINATION  ";
        public static final String teethExaminationDetail = DAO.usernameEmr + ".TEETH_EXAMINATION_DETAIL  ";
        public static final String uploadStudyRequest = DAO.usernameEmr + ".STUDY_TRANSFER_REQUEST  ";
        public static final String PACSUploadRequest = DAO.usernameEmr + ".PACS_UPLOAD_REQUEST  ";
        //HR
        public static final String employeeExperience = DAO.usernameEmr + ".EMPLOYEE_EXPERIENCE   ";
        public static final String employeeDependents = DAO.usernameEmr + ".EMPLOYEE_DEPENDENTS   ";
        public static final String employeeQualification = DAO.usernameEmr + ".EMPLOYEE_QUALIFICATION   ";
        public static final String employeePublications = DAO.usernameEmr + ".EMPLOYEE_PUBLICATIONS   ";
        public static final String employeeOtherInfo = DAO.usernameEmr + ".EMPLOYEE_OTHER_INFORMATION   ";
        public static final String employeeMembership = DAO.usernameEmr + ".EMPLOYEE_MEMBERSHIPS   ";
        public static final String employeeLanguages = DAO.usernameEmr + ".EMPLOYEE_LANGUAGES   ";
        public static final String employeeTrainings = DAO.usernameEmr + ".HR_EMPLOYEE_TRAININGS   ";
        public static final String employeePromotions = DAO.usernameEmr + ".HR_PROMOTION_INCREMENT   ";
        public static final String employeeAttachment = DAO.usernameEmr + ".HR_EMPLOYEE_ATTACHMENTS   ";
        public static final String leaveAttachment = DAO.usernameEmr + ".HR_LEAVE_ATTACHMENTS   ";
        public static final String employeeThumbScan = DAO.usernameEmr + ".HR_THUMBSCAN  ";

        public static final String dutyShift = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL   ";
        public static final String dutyShiftDetail = DAO.usernameEmr + ".HR_DUTY_SHIFT_DETAIL   ";
        public static final String dutyRoster = DAO.usernameEmr + ".HR_DUTY_ROSTER   ";
        public static final String employee = DAO.usernameEmr + ".HR_EMPLOYEE   ";
        public static final String superAdmin = DAO.usernameEmr + ".SUPER_ADMIN   ";
        public static final String employeeHistory = Database.usernameEmr + ".HR_EMPLOYEE_HISTORY   ";
        public static final String employeePayroll = DAO.usernameEmr + ".HR_PAYROLL   ";
        public static final String employeePicture = DAO.usernameEmr + ".HR_EMPLOYEE_PICTURE   ";
        public static final String employeeAttendance = DAO.usernameEmr + ".HR_EMPLOYEE_ATTENDANCE   ";

        public static final String leaveEntry = DAO.usernameEmr + ".HR_LEAVE_ENTRY   ";
        public static final String leaveContract = DAO.usernameEmr + ".HR_LEAVE_CONTRACT   ";
        public static final String employeeLeaves = DAO.usernameEmr + ".HR_EMPLOYEE_LEAVES   ";
        public static final String leaveHierarchy = DAO.usernameEmr + ".HR_EMP_LEAVE_HIERARCHY   ";
        //for Member Registration
        public static final String memberRegistration = DAO.usernameEmr + ".MEMBER_REGISTRATION  ";
        public static final String memberInfoRegistration = DAO.usernameEmr + ".MEMBER_INFO_REGISTRATION  ";
        public static final String memberType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String memberCity = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String memberInfo = DAO.usernameEmr + ".MEMBER_INFO_REGISTRATION  ";
        public static final String pendingTeachingFile = DAO.usernameEmr + ".PENDING_CASE_STUDY  ";
        public static final String humanSystemType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";

        public static final String finalCaseStudy = DAO.usernameEmr + ".FINAL_CASE_STUDY  ";
        public static final String caseReporting = DAO.usernameEmr + ".CASE_REPORTING  ";
        public static final String memberPicture = DAO.usernameEmr + ".MEMBER_PICTURE  ";

        //new added table for hospital
        public static final String admissionUpdateHistory = Database.usernameEmr + ".ADMISSION_UPDATE_HISTORY  ";
        public static final String bedTransferHistory = Database.usernameEmr + ".BED_TRANSFER_HISTORY  ";
        public static final String inpatientStatusHistory = Database.usernameEmr + ".INPATIENT_STATUS_HISTORY  ";

        public static final String patientSymptoms = DAO.usernameEmr + ".PATIENT_SYMPTOMS  ";
        public static final String caseIcd10Codes = DAO.usernameEmr + ".CASE_WISE_ICD_CODES ";

        public static final String rackWiseSystem = DAO.usernameEmr + ".HUMAN_SYSTEM_WISE_RACK ";

        //Missing tables 
        public static final String CPTImageReporting = DAO.usernameEmr + ".CPTREPORTING   ";
        public static final String fixedAssets = DAO.usernameEmr + ".FIXED_ASSETS   ";
        public static final String fixedAssetsHistory = DAO.usernameEmr + ".FIXED_ASSETS_HISTORY   ";
        public static final String patientNotes = DAO.usernameEmr + ".PATIENT_NOTES ";

        public static final String patientFluidOutputMaster = DAO.usernameEmr + ".PATIENT_FLUID_OUTPUT_MASTER ";
        public static final String patientFluidOutputDetail = DAO.usernameEmr + ".PATIENT_FLUID_OUTPUT_DETAIL ";
        public static final String patientFluidInputMaster = DAO.usernameEmr + ".PATIENT_FLUID_INPUT_MASTER ";
        public static final String patientFluidInputDetail = DAO.usernameEmr + ".PATIENT_FLUID_INPUT_DETAIL ";
        public static final String medicationDispenseMaster = DAO.usernameEmr + ".MEDICATION_DISPENSE_MASTER ";
        public static final String medicationDispenseDetail = DAO.usernameEmr + ".MEDICATION_DISPENSE_DETAIL ";

        public static final String quoReceiveMaster = DAO.usernameEmr + ".QUOTATION_RECEIVE_MASTER  ";
        public static final String quoRequestMaster = DAO.usernameEmr + ".QUOTATION_REQUEST_MASTER  ";
        public static final String quoReceiveDetail = DAO.usernameEmr + ".QUOTATION_RECEIVE_DETAIL  ";
        public static final String quoRequestDetail = DAO.usernameEmr + ".QUOTATION_REQUEST_DETAIL  ";

        //Blood Bank
        //New Table For Blood Bank
        public static final String blbPendingQueue = DAO.usernameEmr + ".BLB_PENDING_QUEUE ";
        public static final String blbDonorPerformed = DAO.usernameEmr + ".BLB_DONOR_PERFORMED ";
        public static final String blbDonorQuestions = DAO.usernameEmr + ".BLB_DONOR_QUESTIONS ";
        public static final String blbProductOrder = DAO.usernameEmr + ".BLB_PRODUCT_ORDER ";
        public static final String blbAvailableProducts = DAO.usernameEmr + ".BLB_AVAILABLE_PRODUCTS ";
        public static final String blbDiscardedProducts = DAO.usernameEmr + ".BLB_DISCARDED_PRODUCTS ";
        public static final String blbBloodGrouping = DAO.usernameEmr + ".BLB_BLOOD_GROUPING ";
        public static final String blbTempProductData = DAO.usernameEmr + "." + "BLB_TEMP_PRODUCTS_DATA ";

        public static final String blbCrossMatchHistory = DAO.usernameEmr + "." + "BLB_CROSS_MATCH_HISTORY ";

        public static final String blbIssueProduct = DAO.usernameEmr + ".BLB_ISSUE_PRODUCT ";
        public static final String blbHoldProduct = DAO.usernameEmr + ".BLB_HOLD_PRODUCT ";
        public static final String blbSpecialApprovalHistory = DAO.usernameEmr + ".BLB_SPECIAL_APPROVAL_HISTORY ";
        public static final String blbForwardCaseHistory = DAO.usernameEmr + ".BLB_FORWARD_CASE_HISTORY ";
        public static final String blbProductsHistory = DAO.usernameEmr + ".BLB_PRODUCT_HISTORY ";
        public static final String blbDonorStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbProductType = DAO.usernameEmr + ".BLB_PRODUCTS_TYPE ";
        public static final String blbProductStatus = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbDonorDeferralType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbFridgeType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbSourceType = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbDefineFridge = DAO.usernameEmr + ".FRIDGE ";
        public static final String blbDefineShelve = DAO.usernameEmr + ".SHELVE ";
        public static final String blbDefineCell = DAO.usernameEmr + ".CELL ";
        public static final String blbScreeningBatch = DAO.usernameEmr + ".BLB_SCREENING_BATCH ";
        public static final String blbScreeningBatchDetail = DAO.usernameEmr + ".BLB_SCREENING_BATCH_DETAIL ";
        public static final String hospital = DAO.usernameEmr + ".HOSPITAL  ";
        public static final String rejectBlood = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String blbProductRejection = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL ";
        public static final String userWiseAccessQueue = DAO.usernameEmr + ".USER_WISE_ACCESS_QUEUE  ";
        public static final String cptWiseReferenceCPT = DAO.usernameEmr + ".CPT_REFERENCE_CPT  ";

        public static final String vendorBillPending = DAO.usernameEmr + "." + "VENDOR_BILL_PENDING ";
        public static final String vendorBillProcessed = DAO.usernameEmr + "." + "VENDOR_BILL_PROCESSED ";
        public static final String billWorkflowEvents = DAO.usernameEmr + "." + "BILL_WORKFLOW_EVENTS ";
        public static final String usersGroups = DAO.usernameEmr + "." + "USERS_GROUPS ";
        public static final String userGroupDetail = DAO.usernameEmr + "." + "USER_GROUP_DETAIL ";
        public static final String statusChange = Database.usernameEmr + ".CHANGE_STATUS_HISTORY  ";
        public static final String support = DAO.usernameEmr + ".HMS_SUPPORT  ";
        public static final String hrEmployee = DAO.usernameEmr + ".HR_EMPLOYEE  ";
        public static final String thumbscan = DAO.usernameEmr + ".HR_THUMBSCAN  ";
        public static final String cptRefenceCpt = DAO.usernameEmr + ".CPT_REFERENCE_CPT  ";
        public static final String traumaVisitComplaints = DAO.usernameEmr + ".TRAUMA_VISIT_COMPLAINTS  ";
        public static final String traumaUnitTransferHistory = DAO.usernameEmr + ".TRAUMA_UNIT_TRANSFER_HISTORY  ";

        public static final String userWiseGroup = DAO.usernameEmr + ". USER_WISE_GROUP   ";

        public static final String cabgSurgery = DAO.usernameEmr + ".CABG_SURGERY   ";
        public static final String otValveSurg = DAO.usernameEmr + ".OT_VALVE_SUR   ";
        public static final String otClosurePacingWire = DAO.usernameEmr + ".OT_CLOSURE_PACE_WIRE   ";
        public static final String otCabg = DAO.usernameEmr + ".OT_CABG   ";
        public static final String otSetupDetail = DAO.usernameEmr + ".OT_SETUP_DETAIL   ";
        public static final String surgeryInformation = DAO.usernameEmr + ".SURGERY_INFORMATION   ";
        public static final String accessInformation = DAO.usernameEmr + ".ACCESS_INFORMATION   ";
        public static final String ipdMedicinePlanMaster = DAO.usernameEmr + ".IPD_MEDICINE_PLAN_MASTER   ";
        public static final String ipdMedicinePlanDetail = DAO.usernameEmr + ".IPD_MEDICINE_PLAN_DETAIL   ";

        //  
    }

    public static final class PACS {

        public static final String PACSStudies = DAO.usernameEmr + ".PACS_STUDY   ";
        public static final String PACSStudyDetail = DAO.usernameEmr + ".PACS_STUDY_DETAIL   ";

        public static final String PACSCPT = DAO.usernameEmr + ".PACS_CPT   ";
        public static final String PACSServerPaths = DAO.usernameEmr + ".PACS_SERVERS_PATH   ";
        public static final String PACSBackupServers = DAO.usernameEmr + ".PACS_BACKUP_SERVERS   ";
        public static final String PACSPaths = DAO.usernameEmr + ".PACS_PROCESS_PATH   ";
        public static final String PACSModality = DAO.usernameEmr + ".PACS_MODALITY   ";
        public static final String CDFolder = DAO.usernameEmr + ".PACS_CD_FOLDER  ";
        public static final String updatePacsStudy = DAO.usernameEmr + ".UPDATE_PACS_STUDY  ";

    }

    public static class Inventory {

        //POF Inventory
        public static final String POFSupplier = DAO.usernameINVSYS + "SM_SUPPLIER@POFINV ";
        public static final String folicItem = DAO.usernameINVSYS + ".SM_ITEM@POFINV  ";
        public static final String purchaseAcceptedFolio = DAO.usernameINVSYS + ".TD_MIS_FRN@POFINV  ";

        //PACS Inventory
        public static final String storeWiseItemDetail = DAO.usernameEmr + ".STORE_WISE_ITEMS_DETAIL  ";
        public static final String POFItemUpdateHistory = DAO.usernameEmr + ".ITEM_UPDATE_HIST  ";
        public static final String itemLedgers = DAO.usernameEmr + ".ITEM_LEDGER  ";
        public static final String purchaseOrderDetail = DAO.usernameEmr + ".PURCHASE_ORDER_DETAIL  ";
        public static final String purchaseOrderMaster = DAO.usernameEmr + ".PURCHASE_ORDER_MASTER  ";
        public static final String issueRequestDetailHistory = Database.usernameEmr + ".ISSUE_REQUEST_DETAIL_HISTORY  ";
        public static final String storeWiseIndent = DAO.usernameEmr + ".STORE_WISE_INDENT  ";
        public static final String issueRequestDetail = DAO.usernameEmr + ".ISSUE_REQUEST_DETAIL  ";
        public static final String issueRequestMaster = DAO.usernameEmr + ".ISSUE_REQUEST_MASTER  ";
        public static final String ccItemConfiguration = DAO.usernameEmr + ".CC_ITEM_CONFIGURATION  ";
        public static final String issueNoteDetail = DAO.usernameEmr + ".ISSUE_NOTE_DETAIL  ";
        public static final String issueNoteMaster = DAO.usernameEmr + ".ISSUE_NOTE_MASTER  ";
        public static final String receiveDetail = DAO.usernameEmr + ".RECEIVE_DETAIL  ";
        public static final String receiveMaster = DAO.usernameEmr + ".RECEIVE_MASTER  ";
        public static final String itemLedger = DAO.usernameEmr + ".ITEM_LEDGER  ";
        public static final String storeWiseItems = DAO.usernameEmr + ".STORE_WISE_ITEMS  ";
        public static final String storeWiseItemsHistory = Database.usernameEmr + ".STORE_WISE_ITEMS_HISTORY  ";
        public static final String party = DAO.usernameEmr + ".PARTY  ";
        public static final String store = DAO.usernameEmr + ".STORE  ";
        public static final String itemReturnHistory = DAO.usernameEmr + "." + "ITEM_RETURN_HISTORY ";
        public static final String toDateValidity = DAO.usernameEmr + ".DEFINITION_TYPE_DETAIL  ";
        public static final String quoReceiveMaster = DAO.usernameEmr + ".QUOTATION_RECEIVE_MASTER  ";
        public static final String quoRequestMaster = DAO.usernameEmr + ".QUOTATION_REQUEST_MASTER  ";
        public static final String quoReceiveDetail = DAO.usernameEmr + ".QUOTATION_RECEIVE_DETAIL  ";
        public static final String quoRequestDetail = DAO.usernameEmr + ".QUOTATION_REQUEST_DETAIL  ";
        public static final String itemWorkFlowEvent = DAO.usernameEmr + ".ITEM_WORKFLOW_EVENT  ";
        public static final String itemActionEvents = DAO.usernameEmr + ".ITEM_ACTION_EVENTS  ";
        public static final String forwardQueue = DAO.usernameEmr + ".FORWARD_QUEUE  ";
        public static final String hierarchyQueue = DAO.usernameEmr + ".HIERARCHY_RIGHTS  ";
        public static final String forwardQueueMaster = DAO.usernameEmr + ".FORWARD_QUEUE_MASTER ";
        public static final String itemDispenseMaster = DAO.usernameEmr + ".ITEM_DISPENSE_MASTER ";
        public static final String itemReturnMaster = DAO.usernameEmr + ".ITEM_RETURN_MASTER ";
        public static final String itemDispenseDetail = DAO.usernameEmr + ".ITEM_DISPENSE_DETAIL ";
        public static final String itemReturnDetail = DAO.usernameEmr + ".ITEM_RETURN_DETAIL ";
        public static final String toStore = DAO.usernameEmr + ".STORE ";
        public static final String fromStore = DAO.usernameEmr + ".STORE ";

        public static final String storeWiseUser = DAO.usernameEmr + ".STORE_WISE_USERS ";
        public static final String patientDischarge = DAO.usernameEmr + ".PATIENT_DISCHARGE ";
        public static final String dischargeDetail = DAO.usernameEmr + ".DISCHARGE_DETAIL ";
        public static final String indentTemplateMaster = DAO.usernameEmr + ".INDENT_TEMPLATE_MASTER ";
        public static final String indentTemplateDetail = DAO.usernameEmr + ".INDENT_TEMPLATE_DETAIL ";

        public static final String partyQuotation = DAO.usernameEmr + "." + "PARTY_QUOTATION ";

        public static final String billWorkflowEvents = DAO.usernameEmr + "." + "BILL_WORKFLOW_EVENTS ";
        public static final String vendorBillPending = DAO.usernameEmr + "." + "VENDOR_BILL_PENDING ";
        public static final String vendorBillProcessed = DAO.usernameEmr + "." + "VENDOR_BILL_PROCESSED ";
        public static final String tenderMaster = DAO.usernameEmr + "." + "TENDER_MASTER ";
        public static final String tenderDetail = DAO.usernameEmr + "." + "TENDER_DETAIL ";
        public static final String tenderWiseParties = DAO.usernameEmr + "." + "TENDER_WISE_PARTY ";
        public static final String tenderWisePartyItems = DAO.usernameEmr + "." + "TENDER_PARTY_ITEMS ";
        public static final String batchWiseItemHistory = Database.usernameEmr + "." + "BATCH_WISE_ITEM_HISTORY ";
        public static final String storeWiseItemsDetail = DAO.usernameEmr + "." + "STORE_WISE_ITEMS_DETAIL ";
        public static final String itemCondemMaster = DAO.usernameEmr + "." + "ITEM_CONDEM_MASTER ";
        public static final String itemCondemDetail = DAO.usernameEmr + "." + "ITEM_CONDEM_DETAIL ";

        public static final String manualIndentMaster = DAO.usernameEmr + "." + "MANUAL_INDENT_MASTER ";
        public static final String manualIndentDetail = DAO.usernameEmr + "." + "MANUAL_INDENT_DETAIL ";
        public static final String manualIndentReport = DAO.usernameEmr + "." + "MANUAL_INDENT_REPORT ";
        public static final String pathCptWiseTubes = DAO.usernameEmr + "." + "PATH_CPT_WISE_ITEM ";
        public static final String pathCptWiseTubesHis = DAO.usernameEmr + "." + "PATH_CPT_WISE_ITEM_HISTORY ";
        public static final String cptWiseConsumableItems = DAO.usernameEmr + "." + "CPT_WISE_CONSUMABLE_ITEMS ";

    }
}
