package Form.Dashboard.DOW;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.PrintJasperReport;

public class RadiologyDashboard extends javax.swing.JInternalFrame {

    String fromDate = "";
    String toDate = "";
    String startTime = "";
    String endTime = "";
    String departmentId = "127";
    String locationId = "";
    DisplayLOV lov = new DisplayLOV();
    private HashMap<JButton, String> hashButtonWiseReport = new HashMap();

    public RadiologyDashboard() {

        initComponents();
        this.setSize(Constants.xSize - 335, Constants.ySize - 150);
        setDate(0);
        setButtonWiseReports();

    }

    private void setButtonWiseReports() {

        hashButtonWiseReport.put(btnDailySale, "717");
        hashButtonWiseReport.put(btnMonthlySale, "718");
        hashButtonWiseReport.put(btnDailySectionSalePerLocation, "719");
        hashButtonWiseReport.put(btnMonthlySectionSalePerLocation, "720");
        hashButtonWiseReport.put(btnDailyPatientVolume, "721");
        hashButtonWiseReport.put(btnDailyServicesVolume, "722");
        hashButtonWiseReport.put(btnCptBookedCountSectionWise, "723");
        hashButtonWiseReport.put(btnUserBasedRefund, "724");

        hashButtonWiseReport.put(btnFinancialSupportSummary, "725");
        hashButtonWiseReport.put(btnDailyModalitiesPerformed, "726");
        hashButtonWiseReport.put(btnMonthlyModalitiesPerformed, "727");
        hashButtonWiseReport.put(btnTechnologistPerformance, "728");
        hashButtonWiseReport.put(btnRadiologistPerformance, "729");
        hashButtonWiseReport.put(btnPGsperformanceForward, "730");
        hashButtonWiseReport.put(btnReceptionistPerformance, "731");
        hashButtonWiseReport.put(btnReportingEventsStatus, "732");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel83 = new javax.swing.JLabel();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnDailySectionSalePerLocation = new javax.swing.JButton();
        btnDailySale = new javax.swing.JButton();
        btnMonthlySale = new javax.swing.JButton();
        btnMonthlySectionSalePerLocation = new javax.swing.JButton();
        btnDailyPatientVolume = new javax.swing.JButton();
        btnDailyServicesVolume = new javax.swing.JButton();
        btnCptBookedCountSectionWise = new javax.swing.JButton();
        btnUserBasedRefund = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnFinancialSupportSummary = new javax.swing.JButton();
        btnDailyModalitiesPerformed = new javax.swing.JButton();
        btnMonthlyModalitiesPerformed = new javax.swing.JButton();
        btnTechnologistPerformance = new javax.swing.JButton();
        btnReportingEventsStatus = new javax.swing.JButton();
        btnRadiologistPerformance = new javax.swing.JButton();
        btnPGsperformanceForward = new javax.swing.JButton();
        btnReceptionistPerformance = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setTitle(Constants.title+" Radiology Dashboard");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(710, 650));
        setRequestFocusEnabled(false);

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblPacsLink.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblPacsLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPacsLink.setForeground(new java.awt.Color(0, 102, 102));
        lblPacsLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacsLink.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPacsLink, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administration Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel82.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 0, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("From  : ");

        txtFromDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("To Date : ");

        txtToDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 0, 0));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("End Time : ");

        jLabel85.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 0, 0));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("Start Time : ");

        txtStartTime.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(102, 0, 0));
        txtStartTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartTime.setText("00:00:00");
        txtStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartTimeActionPerformed(evt);
            }
        });

        txtEndTime.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEndTime.setForeground(new java.awt.Color(102, 0, 0));
        txtEndTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndTime.setText("23:59:59");
        txtEndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndTimeActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(102, 0, 0));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("Location : ");

        txtLocation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtToDate, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel84)
                        .addGap(5, 5, 5)
                        .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLocation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStartTime)
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnDailySectionSalePerLocation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailySectionSalePerLocation.setText("DAILY SECTION SALE PER LOCATION");
        btnDailySectionSalePerLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySectionSalePerLocationActionPerformed(evt);
            }
        });

        btnDailySale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailySale.setText("DAILY SALE ");
        btnDailySale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySaleActionPerformed(evt);
            }
        });

        btnMonthlySale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMonthlySale.setText("MONTHLY SALE ");
        btnMonthlySale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlySaleActionPerformed(evt);
            }
        });

        btnMonthlySectionSalePerLocation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMonthlySectionSalePerLocation.setText("MONTHLY SECTION SALE PER LOCATION");
        btnMonthlySectionSalePerLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlySectionSalePerLocationActionPerformed(evt);
            }
        });

        btnDailyPatientVolume.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailyPatientVolume.setText("DAILY PATIENT VOLUME (ALL LOCATION)");
        btnDailyPatientVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyPatientVolumeActionPerformed(evt);
            }
        });

        btnDailyServicesVolume.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailyServicesVolume.setText("DAILY SERVICES VOLUME (ALL LOCATION)");
        btnDailyServicesVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyServicesVolumeActionPerformed(evt);
            }
        });

        btnCptBookedCountSectionWise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCptBookedCountSectionWise.setText("CPT BOOKED COUNT SECTION WISE");
        btnCptBookedCountSectionWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCptBookedCountSectionWiseActionPerformed(evt);
            }
        });

        btnUserBasedRefund.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUserBasedRefund.setText("USER BASED REFUND");
        btnUserBasedRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserBasedRefundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUserBasedRefund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCptBookedCountSectionWise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDailySectionSalePerLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonthlySectionSalePerLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDailyPatientVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDailyServicesVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonthlySale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDailySale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnDailySale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMonthlySale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDailySectionSalePerLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMonthlySectionSalePerLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDailyPatientVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDailyServicesVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCptBookedCountSectionWise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnUserBasedRefund, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnFinancialSupportSummary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFinancialSupportSummary.setText("FINANCIAL SUPPORT SUMMARY");
        btnFinancialSupportSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancialSupportSummaryActionPerformed(evt);
            }
        });

        btnDailyModalitiesPerformed.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailyModalitiesPerformed.setText("DAILY MODALITIES PERFORMED");
        btnDailyModalitiesPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyModalitiesPerformedActionPerformed(evt);
            }
        });

        btnMonthlyModalitiesPerformed.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMonthlyModalitiesPerformed.setText("MONTHLY MODALITIES PERFORMED");
        btnMonthlyModalitiesPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlyModalitiesPerformedActionPerformed(evt);
            }
        });

        btnTechnologistPerformance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTechnologistPerformance.setText("TECHNOLOGIST PERFORMANCE ");
        btnTechnologistPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTechnologistPerformanceActionPerformed(evt);
            }
        });

        btnReportingEventsStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReportingEventsStatus.setText("REPORTING EVENTS STATUS");
        btnReportingEventsStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportingEventsStatusActionPerformed(evt);
            }
        });

        btnRadiologistPerformance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRadiologistPerformance.setText("RADIOLOGIST PERFORMANCE");
        btnRadiologistPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiologistPerformanceActionPerformed(evt);
            }
        });

        btnPGsperformanceForward.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPGsperformanceForward.setText("PGS PERFORMANCE (FORWARD)");
        btnPGsperformanceForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGsperformanceForwardActionPerformed(evt);
            }
        });

        btnReceptionistPerformance.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReceptionistPerformance.setText("RECEPTIONIST PERFORMANCE");
        btnReceptionistPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptionistPerformanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReceptionistPerformance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPGsperformanceForward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRadiologistPerformance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTechnologistPerformance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonthlyModalitiesPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(btnReportingEventsStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDailyModalitiesPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinancialSupportSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnFinancialSupportSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDailyModalitiesPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMonthlyModalitiesPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnTechnologistPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnRadiologistPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnPGsperformanceForward, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnReceptionistPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnReportingEventsStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        btnExit.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed

        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date ",
                    "Search Indent Note Request", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());

    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed

        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the To Date ",
                    "Search Indent Note Request", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtToDate.getDate());
    }//GEN-LAST:event_txtToDateActionPerformed

    private void txtStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartTimeActionPerformed


    }//GEN-LAST:event_txtStartTimeActionPerformed

    private void txtEndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndTimeActionPerformed

    private void btnPGsperformanceForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPGsperformanceForwardActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnPGsperformanceForward));
    }//GEN-LAST:event_btnPGsperformanceForwardActionPerformed

    private void btnRadiologistPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiologistPerformanceActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnRadiologistPerformance));

    }//GEN-LAST:event_btnRadiologistPerformanceActionPerformed

    private void btnMonthlySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlySaleActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnMonthlySale));

    }//GEN-LAST:event_btnMonthlySaleActionPerformed

    private void btnDailyServicesVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyServicesVolumeActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnDailyServicesVolume));
    }//GEN-LAST:event_btnDailyServicesVolumeActionPerformed

    private void btnCptBookedCountSectionWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCptBookedCountSectionWiseActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnCptBookedCountSectionWise));

    }//GEN-LAST:event_btnCptBookedCountSectionWiseActionPerformed

    private void btnUserBasedRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserBasedRefundActionPerformed
        // TODO add your handling code here:

        generateReport(hashButtonWiseReport.get(btnUserBasedRefund));

    }//GEN-LAST:event_btnUserBasedRefundActionPerformed

    private void btnDailySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySaleActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnDailySale));

    }//GEN-LAST:event_btnDailySaleActionPerformed

    private void btnReceptionistPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptionistPerformanceActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnReceptionistPerformance));

    }//GEN-LAST:event_btnReceptionistPerformanceActionPerformed

    private void btnDailySectionSalePerLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySectionSalePerLocationActionPerformed
        // TODO add your handling code here:
        if (txtLocation.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Location First");
            txtLocation.requestFocus();
            return;
        }
        generateReport(hashButtonWiseReport.get(btnDailySectionSalePerLocation));

    }//GEN-LAST:event_btnDailySectionSalePerLocationActionPerformed

    private void btnDailyModalitiesPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyModalitiesPerformedActionPerformed
        // TODO add your handling code here:allUsersDailyCashSummary
        generateReport(hashButtonWiseReport.get(btnDailyModalitiesPerformed));

    }//GEN-LAST:event_btnDailyModalitiesPerformedActionPerformed

    private void btnMonthlyModalitiesPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyModalitiesPerformedActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnMonthlyModalitiesPerformed));

    }//GEN-LAST:event_btnMonthlyModalitiesPerformedActionPerformed

    private void btnFinancialSupportSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancialSupportSummaryActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnFinancialSupportSummary));

    }//GEN-LAST:event_btnFinancialSupportSummaryActionPerformed

    private void btnMonthlySectionSalePerLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlySectionSalePerLocationActionPerformed
        // TODO add your handling code here:
        if (txtLocation.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Location First");
            txtLocation.requestFocus();
            return;
        }
        generateReport(hashButtonWiseReport.get(btnMonthlySectionSalePerLocation));


    }//GEN-LAST:event_btnMonthlySectionSalePerLocationActionPerformed

    private void btnTechnologistPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechnologistPerformanceActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnTechnologistPerformance));

    }//GEN-LAST:event_btnTechnologistPerformanceActionPerformed

    private void btnReportingEventsStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportingEventsStatusActionPerformed
        // TODO add your handling code here:

        generateReport(hashButtonWiseReport.get(btnReportingEventsStatus));
    }//GEN-LAST:event_btnReportingEventsStatusActionPerformed

    private void btnDailyPatientVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyPatientVolumeActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnDailyPatientVolume));

    }//GEN-LAST:event_btnDailyPatientVolumeActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
        String query
                = " SELECT ID, DESCRIPTION  FROM " + Database.DCMS.location + " \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtLocation.getText().toUpperCase().trim() + "%' \n"
                + " AND ID IN('001','002','003','007','029','058','076')                        \n"
                + " AND ACTIVE = 'Y'   "
                + " ORDER BY ID               \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        locationId = Constants.lovID;
        txtLocation.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCptBookedCountSectionWise;
    private javax.swing.JButton btnDailyModalitiesPerformed;
    private javax.swing.JButton btnDailyPatientVolume;
    private javax.swing.JButton btnDailySale;
    private javax.swing.JButton btnDailySectionSalePerLocation;
    private javax.swing.JButton btnDailyServicesVolume;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinancialSupportSummary;
    private javax.swing.JButton btnMonthlyModalitiesPerformed;
    private javax.swing.JButton btnMonthlySale;
    private javax.swing.JButton btnMonthlySectionSalePerLocation;
    private javax.swing.JButton btnPGsperformanceForward;
    private javax.swing.JButton btnRadiologistPerformance;
    private javax.swing.JButton btnReceptionistPerformance;
    private javax.swing.JButton btnReportingEventsStatus;
    private javax.swing.JButton btnTechnologistPerformance;
    private javax.swing.JButton btnUserBasedRefund;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTextField txtEndTime;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtStartTime;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    // End of variables declaration//GEN-END:variables

    private void setDate(int day) {
        try {
            Date date = new Date();
            txtToDate.setDate(date);
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtToDate.setDate(date2);
            toDate = dateFormat.format(date2);
            txtFromDate.setDate(date2);
            fromDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void generateReport(String reportId) {

        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(reportId);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());
        toDate = dateFormat.format(txtToDate.getDate());
        HashMap<String, String> hm = new HashMap();
        hm.put("fromDate", fromDate.toUpperCase());
        hm.put("toDate", toDate.toUpperCase());
        hm.put("fullFromDate", (fromDate + " " + txtStartTime.getText()).toUpperCase());
        hm.put("fullToDate", (toDate + " " + txtEndTime.getText()).toUpperCase());
        hm.put("user", Constants.userId);
        hm.put("departmentId", departmentId);
        hm.put("userLocationId", Constants.userLocationId);
        hm.put("locationId", locationId);
        hm.put("SUBREPORT_DIR", report.getReportPath());
        System.out.println("reportPath: " + report.getReportPath() + report.getReportName());
        jReport.generateAdministrationReport(
                report.getReportPath() + report.getReportName(),
                Constants.outReportPath + "exportData.xls", Constants.viewPrint, hm);
    }
    private PrintJasperReport jReport = new PrintJasperReport();
}
