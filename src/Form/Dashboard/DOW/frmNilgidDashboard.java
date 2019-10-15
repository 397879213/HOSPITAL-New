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

public class frmNilgidDashboard extends javax.swing.JInternalFrame {

    String fromDate = "";
    String toDate = "";
    String startTime = "";
    String endTime = "";
    String departmentId = "35";
    String locationId = "";
    DisplayLOV lov = new DisplayLOV();
    private HashMap<JButton, String> hashButtonWiseReport = new HashMap();

    public frmNilgidDashboard() {

        initComponents();
        this.setSize(Constants.xSize - 330, Constants.ySize - 230);
        setDate(0);
        setButtonWiseReports();

    }

    private void setButtonWiseReports() {

        hashButtonWiseReport.put(btnDailySale, "758");
        hashButtonWiseReport.put(btnAllUserDailyCash, "84");
        hashButtonWiseReport.put(btnMonthlySale, "759");
        hashButtonWiseReport.put(btnWardWiseAdmittedPatientSummary, "362");
        hashButtonWiseReport.put(btnDailySectionSaleSummary, "60");
        hashButtonWiseReport.put(btnPhysicianProcedurePerformed, "763");
        
        hashButtonWiseReport.put(btnUserBaseRefund, "747");
        hashButtonWiseReport.put(btnDailyPatientVolume, "760");
        hashButtonWiseReport.put(btnCptWiseRevenue, "761");
        hashButtonWiseReport.put(btnMonthlyServicesVolume, "762");
        hashButtonWiseReport.put(btnPerformingPhyShareSummary, "686");
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
        btnDailySectionSaleSummary = new javax.swing.JButton();
        btnDailySale = new javax.swing.JButton();
        btnMonthlySale = new javax.swing.JButton();
        btnMonthlySectionSale = new javax.swing.JButton();
        btnDailyPatientVolume = new javax.swing.JButton();
        btnMonthlyServicesVolume = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnAllUserDailyCash = new javax.swing.JButton();
        btnWardWiseAdmittedPatientSummary = new javax.swing.JButton();
        btnPhysicianProcedurePerformed = new javax.swing.JButton();
        btnUserBaseRefund = new javax.swing.JButton();
        btnCptWiseRevenue = new javax.swing.JButton();
        btnPerformingPhyShareSummary = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setTitle(Constants.title+" Nilgid Dashboard");
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
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnDailySectionSaleSummary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailySectionSaleSummary.setText("DAILY SECTION SALE SUMMARY ");
        btnDailySectionSaleSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySectionSaleSummaryActionPerformed(evt);
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

        btnMonthlySectionSale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMonthlySectionSale.setText("MONTHLY SECTION SALE\n");
        btnMonthlySectionSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlySectionSaleActionPerformed(evt);
            }
        });

        btnDailyPatientVolume.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDailyPatientVolume.setText("DAILY PATIENT VOLUME");
        btnDailyPatientVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyPatientVolumeActionPerformed(evt);
            }
        });

        btnMonthlyServicesVolume.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMonthlyServicesVolume.setText("MONTHLY SERVICES VOLUME (ALL SECTION)");
        btnMonthlyServicesVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthlyServicesVolumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDailySectionSaleSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonthlySectionSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDailyPatientVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonthlyServicesVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnDailySectionSaleSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMonthlySectionSale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDailyPatientVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMonthlyServicesVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnAllUserDailyCash.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAllUserDailyCash.setText("ALL USERS DAILY CASH\n\n");
        btnAllUserDailyCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllUserDailyCashActionPerformed(evt);
            }
        });

        btnWardWiseAdmittedPatientSummary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnWardWiseAdmittedPatientSummary.setText("WARD WISE ADMITTED PATIENT SUMMARY");
        btnWardWiseAdmittedPatientSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWardWiseAdmittedPatientSummaryActionPerformed(evt);
            }
        });

        btnPhysicianProcedurePerformed.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPhysicianProcedurePerformed.setText("PHYSICIAN PROCEDURE PERFORMED");
        btnPhysicianProcedurePerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysicianProcedurePerformedActionPerformed(evt);
            }
        });

        btnUserBaseRefund.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUserBaseRefund.setText("USER BASE REFUND\n");
        btnUserBaseRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserBaseRefundActionPerformed(evt);
            }
        });

        btnCptWiseRevenue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCptWiseRevenue.setText("CPT WISE REVENUE");
        btnCptWiseRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCptWiseRevenueActionPerformed(evt);
            }
        });

        btnPerformingPhyShareSummary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPerformingPhyShareSummary.setText("PERFORMING PHY. SHARE SUMMARY\n\n");
        btnPerformingPhyShareSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformingPhyShareSummaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPerformingPhyShareSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCptWiseRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUserBaseRefund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhysicianProcedurePerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWardWiseAdmittedPatientSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllUserDailyCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAllUserDailyCash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnWardWiseAdmittedPatientSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnPhysicianProcedurePerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnUserBaseRefund, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnCptWiseRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnPerformingPhyShareSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void btnPerformingPhyShareSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformingPhyShareSummaryActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnPerformingPhyShareSummary));
    }//GEN-LAST:event_btnPerformingPhyShareSummaryActionPerformed

    private void btnCptWiseRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCptWiseRevenueActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnCptWiseRevenue));

    }//GEN-LAST:event_btnCptWiseRevenueActionPerformed

    private void btnMonthlySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlySaleActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnMonthlySale));

    }//GEN-LAST:event_btnMonthlySaleActionPerformed

    private void btnMonthlyServicesVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlyServicesVolumeActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnMonthlyServicesVolume));
    }//GEN-LAST:event_btnMonthlyServicesVolumeActionPerformed

    private void btnDailySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySaleActionPerformed
        
        generateReport(hashButtonWiseReport.get(btnDailySale));

    }//GEN-LAST:event_btnDailySaleActionPerformed

    private void btnDailySectionSaleSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySectionSaleSummaryActionPerformed
        // TODO add your handling code here:
        if (txtLocation.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Location First");
            txtLocation.requestFocus();
            return;
        }
        generateReport(hashButtonWiseReport.get(btnDailySectionSaleSummary));

    }//GEN-LAST:event_btnDailySectionSaleSummaryActionPerformed

    private void btnWardWiseAdmittedPatientSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWardWiseAdmittedPatientSummaryActionPerformed
       
        generateReport(hashButtonWiseReport.get(btnWardWiseAdmittedPatientSummary));

    }//GEN-LAST:event_btnWardWiseAdmittedPatientSummaryActionPerformed

    private void btnPhysicianProcedurePerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysicianProcedurePerformedActionPerformed
         
        generateReport(hashButtonWiseReport.get(btnPhysicianProcedurePerformed));

    }//GEN-LAST:event_btnPhysicianProcedurePerformedActionPerformed

    private void btnAllUserDailyCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllUserDailyCashActionPerformed
        if (txtLocation.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Location First");
            txtLocation.requestFocus();
            return;
        }
        generateReport(hashButtonWiseReport.get(btnAllUserDailyCash));

    }//GEN-LAST:event_btnAllUserDailyCashActionPerformed

    private void btnMonthlySectionSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthlySectionSaleActionPerformed
         generateReport(hashButtonWiseReport.get(btnMonthlySectionSale));
    }//GEN-LAST:event_btnMonthlySectionSaleActionPerformed

    private void btnUserBaseRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserBaseRefundActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnUserBaseRefund));

    }//GEN-LAST:event_btnUserBaseRefundActionPerformed

    private void btnDailyPatientVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyPatientVolumeActionPerformed
        // TODO add your handling code here:
        generateReport(hashButtonWiseReport.get(btnDailyPatientVolume));

    }//GEN-LAST:event_btnDailyPatientVolumeActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
        String query
                = " SELECT ID, DESCRIPTION  FROM " + Database.DCMS.location + " \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtLocation.getText().toUpperCase().trim() + "%' \n"
                + " AND ID IN (003,007,076)                        \n"
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
    private javax.swing.JButton btnAllUserDailyCash;
    private javax.swing.JButton btnCptWiseRevenue;
    private javax.swing.JButton btnDailyPatientVolume;
    private javax.swing.JButton btnDailySale;
    private javax.swing.JButton btnDailySectionSaleSummary;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMonthlySale;
    private javax.swing.JButton btnMonthlySectionSale;
    private javax.swing.JButton btnMonthlyServicesVolume;
    private javax.swing.JButton btnPerformingPhyShareSummary;
    private javax.swing.JButton btnPhysicianProcedurePerformed;
    private javax.swing.JButton btnUserBaseRefund;
    private javax.swing.JButton btnWardWiseAdmittedPatientSummary;
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
