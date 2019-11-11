package Form.Hospital;

import BO.Hospital.AdvancePayment;
import BO.OPD.PatientHospitalVisit;
import BO.Patient;
//import Controller.AdvanceAdjustmentController;
import Controller.Hospital.AdvancePaymentController;
import Controller.Hospital.PatientDischargeStatusController;
//import Controller.Hospital.PatientTransferController;
//import Controller.Patient.PatientController;
import TableModel.Hospital.AdvancePaymentTableModel;
import TableModel.Hospital.DepartmentWiseBillTableModel;
import TableModel.Hospital.DepartmentWiseRefundTableModel;
import TableModel.Hospital.IpdDepWiseDetailTableModel;
import TableModel.Hospital.PatientDischargeStatusTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.BillingAccounts;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.PrintJasperReport;
import utilities.Reports;
import utilities.Status;
import utilities.TypeDetailId;

public class SearchIPDPatientWithBill extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();

    public SearchIPDPatientWithBill() {
        initComponents();
        btnExit.setMnemonic(KeyEvent.VK_X);
        setIpdDepWiseDetail();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlSearchUser = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblsearchPatientHistory = new javax.swing.JTable();
        pnlClearandExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnDepartmentServicesBill = new javax.swing.JButton();
        btnDepartmentBill = new javax.swing.JButton();
        btnBillSummary = new javax.swing.JButton();
        btnFinalBillSummary = new javax.swing.JButton();
        txtWardDescriptionHistory1 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPatientIdHistory = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtWardDescriptionHistory = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtPrimaryPhysicianHistory = new javax.swing.JTextField();
        btnSearchDischarged = new javax.swing.JButton();
        pnlSearchUser2 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblDepartmentWiseBill = new javax.swing.JTable();
        pnlSearchUser3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblDepartmentWiseRefund = new javax.swing.JTable();
        pnlSearchUser4 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblPaymentDetail = new javax.swing.JTable();
        pnlSearchUser5 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblServicesDetail = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Pending Discharge Requests");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        pnlSearchUser.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pending Discharge Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser.setForeground(java.awt.SystemColor.activeCaption);

        tblsearchPatientHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null,null,null,null}
            },
            new String [] {
                "Sr.", "Admission No", "Physician","Admission date",
                "Admission By","Status"

            }
        ));
        tblsearchPatientHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsearchPatientHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblsearchPatientHistoryMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblsearchPatientHistoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblsearchPatientHistoryMouseReleased(evt);
            }
        });
        tblsearchPatientHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblsearchPatientHistoryKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblsearchPatientHistory);

        javax.swing.GroupLayout pnlSearchUserLayout = new javax.swing.GroupLayout(pnlSearchUser);
        pnlSearchUser.setLayout(pnlSearchUserLayout);
        pnlSearchUserLayout.setHorizontalGroup(
            pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        pnlSearchUserLayout.setVerticalGroup(
            pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pnlClearandExit.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlClearandExit.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCreate_User(evt);
            }
        });

        btnDepartmentServicesBill.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDepartmentServicesBill.setText("Service Wise");
        btnDepartmentServicesBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentServicesBillActionPerformed(evt);
            }
        });

        btnDepartmentBill.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDepartmentBill.setText("Department Wise Detail ");
        btnDepartmentBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentBillActionPerformed(evt);
            }
        });

        btnBillSummary.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBillSummary.setText("Bill Summary");
        btnBillSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillSummaryActionPerformed(evt);
            }
        });

        btnFinalBillSummary.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinalBillSummary.setText("Final Bill");
        btnFinalBillSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalBillSummaryActionPerformed(evt);
            }
        });

        txtWardDescriptionHistory1.setToolTipText("DD-MON-YY");
        txtWardDescriptionHistory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardDescriptionHistory1ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 0, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("Toal Bill :");

        javax.swing.GroupLayout pnlClearandExitLayout = new javax.swing.GroupLayout(pnlClearandExit);
        pnlClearandExit.setLayout(pnlClearandExitLayout);
        pnlClearandExitLayout.setHorizontalGroup(
            pnlClearandExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClearandExitLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnDepartmentBill, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBillSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalBillSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepartmentServicesBill, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWardDescriptionHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        pnlClearandExitLayout.setVerticalGroup(
            pnlClearandExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClearandExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtWardDescriptionHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlClearandExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit)
                .addComponent(btnDepartmentServicesBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDepartmentBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBillSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalBillSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Discharged Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Patient Id :");

        txtPatientIdHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientIdHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdHistoryActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 0, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("Ward:");

        txtWardDescriptionHistory.setToolTipText("DD-MON-YY");
        txtWardDescriptionHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardDescriptionHistoryActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText(" Primary Physician:");

        txtPrimaryPhysicianHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryPhysicianHistoryActionPerformed(evt);
            }
        });

        btnSearchDischarged.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearchDischarged.setText("Search");
        btnSearchDischarged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSearchDischargedMouseReleased(evt);
            }
        });
        btnSearchDischarged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDischargedCreate_User(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(txtPatientIdHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWardDescriptionHistory))
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhysicianHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchDischarged, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientIdHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWardDescriptionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimaryPhysicianHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDischarged))
                .addGap(1, 1, 1))
        );

        pnlSearchUser2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Performed Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser2.setForeground(java.awt.SystemColor.activeCaption);

        tblDepartmentWiseBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null,null,null,null}
            },
            new String [] {
                "Sr.", "Admission No", "Physician","Admission date",
                "Admission By","Status"

            }
        ));
        tblDepartmentWiseBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartmentWiseBillMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDepartmentWiseBillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDepartmentWiseBillMouseReleased(evt);
            }
        });
        tblDepartmentWiseBill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDepartmentWiseBillKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblDepartmentWiseBill);

        javax.swing.GroupLayout pnlSearchUser2Layout = new javax.swing.GroupLayout(pnlSearchUser2);
        pnlSearchUser2.setLayout(pnlSearchUser2Layout);
        pnlSearchUser2Layout.setHorizontalGroup(
            pnlSearchUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        pnlSearchUser2Layout.setVerticalGroup(
            pnlSearchUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        pnlSearchUser3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Refund Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser3.setForeground(java.awt.SystemColor.activeCaption);

        tblDepartmentWiseRefund.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null,null,null,null}
            },
            new String [] {
                "Sr.", "Admission No", "Physician","Admission date",
                "Admission By","Status"

            }
        ));
        tblDepartmentWiseRefund.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartmentWiseRefundMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDepartmentWiseRefundMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDepartmentWiseRefundMouseReleased(evt);
            }
        });
        tblDepartmentWiseRefund.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDepartmentWiseRefundKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblDepartmentWiseRefund);

        javax.swing.GroupLayout pnlSearchUser3Layout = new javax.swing.GroupLayout(pnlSearchUser3);
        pnlSearchUser3.setLayout(pnlSearchUser3Layout);
        pnlSearchUser3Layout.setHorizontalGroup(
            pnlSearchUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        pnlSearchUser3Layout.setVerticalGroup(
            pnlSearchUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        pnlSearchUser4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser4.setForeground(java.awt.SystemColor.activeCaption);

        tblPaymentDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null,null,null,null}
            },
            new String [] {
                "Sr.", "Admission No", "Physician","Admission date",
                "Admission By","Status"

            }
        ));
        tblPaymentDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaymentDetailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPaymentDetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPaymentDetailMouseReleased(evt);
            }
        });
        tblPaymentDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPaymentDetailKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblPaymentDetail);

        javax.swing.GroupLayout pnlSearchUser4Layout = new javax.swing.GroupLayout(pnlSearchUser4);
        pnlSearchUser4.setLayout(pnlSearchUser4Layout);
        pnlSearchUser4Layout.setHorizontalGroup(
            pnlSearchUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );
        pnlSearchUser4Layout.setVerticalGroup(
            pnlSearchUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pnlSearchUser5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser5.setForeground(java.awt.SystemColor.activeCaption);

        tblServicesDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null,null,null,null}
            },
            new String [] {
                "Sr.", "Admission No", "Physician","Admission date",
                "Admission By","Status"

            }
        ));
        tblServicesDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServicesDetailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblServicesDetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblServicesDetailMouseReleased(evt);
            }
        });
        tblServicesDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServicesDetailKeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(tblServicesDetail);

        javax.swing.GroupLayout pnlSearchUser5Layout = new javax.swing.GroupLayout(pnlSearchUser5);
        pnlSearchUser5.setLayout(pnlSearchUser5Layout);
        pnlSearchUser5Layout.setHorizontalGroup(
            pnlSearchUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        pnlSearchUser5Layout.setVerticalGroup(
            pnlSearchUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlClearandExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pnlSearchUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pnlSearchUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pnlSearchUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pnlSearchUser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pnlSearchUser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlSearchUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlSearchUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlSearchUser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlClearandExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
//    PatientController ctlPatient = new PatientController();
    String patientId = "";
    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseReleased

    private void btnExitCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCreate_User

        this.dispose();
    }//GEN-LAST:event_btnExitCreate_User
    String wardId = "";
    String primaryPhysicianId = "";

    private void tblsearchPatientHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsearchPatientHistoryMouseClicked

        if (listPatientHistory.isEmpty() || tblsearchPatientHistory.getSelectedRow() < 0) {
            return;
        }

        if (evt.getClickCount() % 2 == 0) {
            PrintJasperReport print = new PrintJasperReport();

            String reportId = Reports.Hospital.patientDischargeReport;
            if (currentDischarge.getDischargeTypeId().equalsIgnoreCase(TypeDetailId.patientDeath)) {
                reportId = Reports.Hospital.deathCertificate;
            }

            BO.Reports report = print.getReportPath(reportId);
            if (report.getReportPath() == null || report.getReportPath().length() == 0) {
                return;
            }
            HashMap hm = new HashMap();
            hm.put("admissionNo", currentDischarge.getAdmissionNumber());
            hm.put("user", Constants.userId);
            hm.put("locationId", Constants.locationId);
            hm.put("SUBREPORT_DIR", report.getReportPath());
            print.printReport(report.getReportPath() + report.getReportName(),
                    Constants.outReportPath + "54.pdf", Constants.viewPrint, hm);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsearchPatientHistoryMouseClicked

    private void tblsearchPatientHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsearchPatientHistoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsearchPatientHistoryMousePressed

    private void tblsearchPatientHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsearchPatientHistoryMouseReleased

        if (listPatientHistory.isEmpty() || tblsearchPatientHistory.getSelectedRow() < 0) {
            return;
        }
        currentDischarge = listPatientHistory.get(tblsearchPatientHistory.getSelectedRow());

        selectDepartmentWiseBill();
        selectDepartmentWiseRefund();
        selectPaymentDetails();

        if (listPaymentDetails.isEmpty() || tblPaymentDetail.getSelectedRow() < 0) {
            return;
        }
        currentPayment = listPaymentDetails.get(0);

    }//GEN-LAST:event_tblsearchPatientHistoryMouseReleased

    private void selectPaymentDetails() {

        listPaymentDetails = ctlAdvancePayment.selectPayment(currentDischarge.getAdmissionNumber(), "ALL");
        if (listPaymentDetails.isEmpty()) {
            AdvancePayment object = new AdvancePayment();
            List list = new ArrayList();
            list.add(object);
            tblPaymentDetail.setModel(new AdvancePaymentTableModel(list));
        } else {
            tblPaymentDetail.setModel(new AdvancePaymentTableModel(listPaymentDetails));
        }
        ListSelectionModel selectionModel = tblPaymentDetail.getSelectionModel();
        tblPaymentDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPaymentDetail);
        setColumnsWidthsAdvanceHistoryModel();
    }

    public void setColumnsWidthsAdvanceHistoryModel() {
        TableColumn column = null;
        for (int i = 0; i < tblPaymentDetail.getColumnCount(); i++) {
            column = tblPaymentDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            } else if (i == 5) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void tblsearchPatientHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblsearchPatientHistoryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsearchPatientHistoryKeyReleased

    private void txtPatientIdHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdHistoryActionPerformed

        if (GUIUtils.completePatientId(txtPatientIdHistory.getText().trim())) {
            patientId = (Constants.completePatientId);
//            Patient patCancel = ctlPatient.searchPatient(patientId);
//            txtPatientIdHistory.setText(patCancel.getPatientId());

            selectDischargedPatient();

    }//GEN-LAST:event_txtPatientIdHistoryActionPerformed
    }
    private void txtWardDescriptionHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardDescriptionHistoryActionPerformed

        String query
                = "  SELECT ID ID, DESCRIPTION DESCRIPTION FROM      \n"
                + Database.DCMS.ward + "                          \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtWardDescriptionHistory.getText().toUpperCase().trim() + "%'"
                + " AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        wardId = Constants.lovID;
        txtWardDescriptionHistory.setText(Constants.lovDescription);
        selectDischargedPatient();
        wardId = "";
    }//GEN-LAST:event_txtWardDescriptionHistoryActionPerformed

    private void txtPrimaryPhysicianHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryPhysicianHistoryActionPerformed

        String query
                = "  SELECT USER_NAME ID, NAME DESCRIPTION FROM      \n"
                + Database.DCMS.users + "                          \n"
                + " WHERE UPPER(NAME) LIKE '%"
                + txtPrimaryPhysicianHistory.getText().toUpperCase().trim() + "%'"
                + " AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        primaryPhysicianId = Constants.lovID;
        txtPrimaryPhysicianHistory.setText(Constants.lovDescription);
        selectDischargedPatient();
        primaryPhysicianId = "";
// TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryPhysicianHistoryActionPerformed

    private void btnSearchDischargedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchDischargedMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchDischargedMouseReleased

    private void btnSearchDischargedCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDischargedCreate_User
        selectDischargedPatient();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchDischargedCreate_User

    private void btnDepartmentServicesBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentServicesBillActionPerformed

        if (tblsearchPatientHistory.getSelectedRow() < 0 || listPatientHistory.isEmpty()) {
            return;
        }
        currentDischarge = listPatientHistory.get(tblsearchPatientHistory.getSelectedRow());
        AdvancePayment currentDepartmentBill = listDepartmentBillDetail.get(tblDepartmentWiseBill.getSelectedRow());
        currentDepartmentBill.setPatientId(currentDischarge.getPatientId());
        currentDepartmentBill.setAdmissionNo(currentDischarge.getAdmissionNumber());
        String reportId = Reports.Hospital.servicesWiseDepartmentBill;
        if (currentDepartmentBill.getDepartmentId().equalsIgnoreCase(Departments.Pharmacy)
                || currentDepartmentBill.getDepartmentId().equalsIgnoreCase(Departments.nursing)) {
            reportId = Reports.Hospital.ItemWisePharmacyBill;
        }
//        ctlAdjustment.inpatientBillingReports(reportId,
//                Constants.locationId, currentDepartmentBill, "Bill");


    }//GEN-LAST:event_btnDepartmentServicesBillActionPerformed

    private void btnBillSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillSummaryActionPerformed

        if (tblsearchPatientHistory.getSelectedRow() < 0 || listPatientHistory.isEmpty()) {
            return;
        }

        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(Reports.Hospital.DischargeBill);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        HashMap hm = new HashMap();
        hm.put("admissionNo", currentDischarge.getAdmissionNumber());
        hm.put("patientId", currentDischarge.getPatientId());
        hm.put("user", Constants.userId);
        hm.put("reportTitle", "Admission Bill Summary");
        hm.put("userLocationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", report.getReportPath());
        print.printReport(report.getReportPath() + report.getReportName(),
                Constants.outReportPath + "54.pdf", Constants.viewPrint, hm);

        // TODO add your handling code here:

    }//GEN-LAST:event_btnBillSummaryActionPerformed

    private void btnDepartmentBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentBillActionPerformed

        if (tblsearchPatientHistory.getSelectedRow() < 0 || listPatientHistory.isEmpty()) {
            return;
        }
        currentDischarge = listPatientHistory.get(tblsearchPatientHistory.getSelectedRow());
        AdvancePayment currentDepartmentBill = listDepartmentBillDetail.get(tblDepartmentWiseBill.getSelectedRow());
        String reportId = Reports.Hospital.InpatientDiagnosticDepartmentBill;
        if (currentDepartmentBill.getDepartmentId().equalsIgnoreCase(Departments.Pharmacy)
                || currentDepartmentBill.getDepartmentId().equalsIgnoreCase(Departments.nursing)) {
            reportId = Reports.Hospital.InpatientPharmacyBill;
        }
        currentDepartmentBill.setPatientId(currentDischarge.getPatientId());
        currentDepartmentBill.setAdmissionNo(currentDischarge.getAdmissionNumber());
//        ctlAdjustment.inpatientBillingReports(reportId,
//                Constants.locationId, currentDepartmentBill, "Final Bill");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepartmentBillActionPerformed

    private void tblDepartmentWiseBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentWiseBillMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseBillMouseClicked

    private void tblDepartmentWiseBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentWiseBillMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseBillMousePressed

    private void tblDepartmentWiseBillMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentWiseBillMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseBillMouseReleased

    private void tblDepartmentWiseBillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDepartmentWiseBillKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseBillKeyReleased

    private void tblDepartmentWiseRefundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentWiseRefundMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseRefundMouseClicked

    private void tblDepartmentWiseRefundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentWiseRefundMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseRefundMousePressed

    private void tblDepartmentWiseRefundMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentWiseRefundMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseRefundMouseReleased

    private void tblDepartmentWiseRefundKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDepartmentWiseRefundKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartmentWiseRefundKeyReleased

    private void tblPaymentDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentDetailMouseClicked
        // TODO add your handling code here:
        if (tblPaymentDetail.getSelectedRow() < 0 || listPaymentDetails.isEmpty()) {
            return;
        }

        if (evt.getClickCount() % 2 == 0) {

            String reportId = Reports.Hospital.advancePayment;
            if (currentPayment.getAccountId().equalsIgnoreCase(BillingAccounts.cashReceived)
                    && Integer.parseInt(currentPayment.getRecievedAmount()) > 0) {
                reportId = Reports.Hospital.advancePayment;
            } else if (currentPayment.getAccountId().equalsIgnoreCase(BillingAccounts.cashReceived)
                    && Integer.parseInt(currentPayment.getRecievedAmount()) < 0) {
                reportId = Reports.Hospital.inpatientAdvanceRefund;
            } else if (currentPayment.getAccountId().equalsIgnoreCase(BillingAccounts.performingShareWaiveoff)) {
                reportId = Reports.Hospital.inpatientWaiveOff;
            }

//            ctlAdjustment.patientAdvanceReceiveReports(reportId,
//                    Constants.locationId, currentPayment.getVoucherNo(),
//                    "Duplicate", currentPayment.getAdmissionNo(), Constants.viewPrint);
        }
    }//GEN-LAST:event_tblPaymentDetailMouseClicked

    private void tblPaymentDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPaymentDetailMousePressed

    private void tblPaymentDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentDetailMouseReleased
        // TODO add your handling code here:
        if (listPaymentDetails.isEmpty() || tblPaymentDetail.getSelectedRow() < 0) {
            return;
        }
        currentPayment = listPaymentDetails.get(tblPaymentDetail.getSelectedRow());
    }//GEN-LAST:event_tblPaymentDetailMouseReleased

    private void tblPaymentDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPaymentDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPaymentDetailKeyReleased

    private void btnFinalBillSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalBillSummaryActionPerformed
        // TODO add your handling code here:

        if (tblsearchPatientHistory.getSelectedRow() < 0 || listPatientHistory.isEmpty()) {
            return;
        }

        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(Reports.Hospital.finalDischargeBill);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        HashMap hm = new HashMap();
        hm.put("admissionNo", currentDischarge.getAdmissionNumber());
        hm.put("patientId", currentDischarge.getPatientId());
        hm.put("user", Constants.userId);
        hm.put("reportTitle", "Admission Bill Summary");
        hm.put("userLocationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", report.getReportPath());
        print.printReport(report.getReportPath() + report.getReportName(),
                Constants.outReportPath + "54.pdf", Constants.viewPrint, hm);

    }//GEN-LAST:event_btnFinalBillSummaryActionPerformed

    private void tblsearchPatientHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsearchPatientHistoryMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsearchPatientHistoryMouseEntered

    private void tblServicesDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicesDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServicesDetailMouseClicked

    private void tblServicesDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicesDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServicesDetailMousePressed

    private void tblServicesDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicesDetailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServicesDetailMouseReleased

    private void tblServicesDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServicesDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServicesDetailKeyReleased

    private void txtWardDescriptionHistory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardDescriptionHistory1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardDescriptionHistory1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillSummary;
    private javax.swing.JButton btnDepartmentBill;
    private javax.swing.JButton btnDepartmentServicesBill;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinalBillSummary;
    private javax.swing.JButton btnSearchDischarged;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlClearandExit;
    private javax.swing.JPanel pnlSearchUser;
    private javax.swing.JPanel pnlSearchUser2;
    private javax.swing.JPanel pnlSearchUser3;
    private javax.swing.JPanel pnlSearchUser4;
    private javax.swing.JPanel pnlSearchUser5;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblDepartmentWiseBill;
    private javax.swing.JTable tblDepartmentWiseRefund;
    private javax.swing.JTable tblPaymentDetail;
    private javax.swing.JTable tblServicesDetail;
    private javax.swing.JTable tblsearchPatientHistory;
    private javax.swing.JTextField txtPatientIdHistory;
    private javax.swing.JTextField txtPrimaryPhysicianHistory;
    private javax.swing.JTextField txtWardDescriptionHistory;
    private javax.swing.JTextField txtWardDescriptionHistory1;
    // End of variables declaration//GEN-END:variables

    //new declarations.
    //   Patient patid = new Patient();
    PatientDischargeStatusController ctlpat = new PatientDischargeStatusController();
    AdvancePaymentController ctlAdvancePayment = new AdvancePaymentController();
    List<PatientHospitalVisit> listPatient = new ArrayList<>();
    List<PatientHospitalVisit> listPatientHistory = new ArrayList<>();
    List<AdvancePayment> ipdDepWiseDetail = new ArrayList<>();
    List<AdvancePayment> listDepartmentBillDetail = new ArrayList<>();
    List<AdvancePayment> listDepartmentRefundDetail = new ArrayList<>();
    AdvancePayment currentPayment = new AdvancePayment();
    PatientHospitalVisit patAdmissionDetail = new PatientHospitalVisit();
    PatientHospitalVisit patInfo = new PatientHospitalVisit();
    PatientHospitalVisit currentDischarge = new PatientHospitalVisit();
    PatientHospitalVisit currentPatient = new PatientHospitalVisit();
//    AdvanceAdjustmentController ctlAdjustment = new AdvanceAdjustmentController();
    AdvancePaymentController ctlAp = new AdvancePaymentController();
    List<AdvancePayment> listPaymentDetails = new ArrayList<>();

    private void selectDischargedPatient() {

        if (patientId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Patient Id");
            return;
        }
        listPatientHistory = ctlpat.selectFinancialDischargePatient(
                Status.discharged + "," + Status.dischargedWithoutCertificate,
                patientId, primaryPhysicianId, wardId);
        if (listPatientHistory.isEmpty()) {
            List list = new ArrayList();
            PatientHospitalVisit obj = new PatientHospitalVisit();
            list.add(obj);
            tblsearchPatientHistory.setModel(new PatientDischargeStatusTableModel(list));
        } else {
            tblsearchPatientHistory.setModel(new PatientDischargeStatusTableModel(
                    listPatientHistory));

        }
        ListSelectionModel selectionModel = tblsearchPatientHistory.getSelectionModel();
        tblsearchPatientHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblsearchPatientHistory);

    }

//    PatientTransferController ctlpatient = new PatientTransferController();
    private void selectDepartmentWiseBill() {

        listDepartmentBillDetail = ctlAp.selectDepartmentWiseBill(currentDischarge.getAdmissionNumber());

        if (listDepartmentBillDetail.isEmpty()) {
            AdvancePayment object = new AdvancePayment();
            List list = new ArrayList();
            list.add(object);
            tblDepartmentWiseBill.setModel(new DepartmentWiseBillTableModel(list));
            //    txtTotalBill.setText("0");
        } else {
            tblDepartmentWiseBill.setModel(new DepartmentWiseBillTableModel(listDepartmentBillDetail));

        }
        ListSelectionModel selectionModel = tblDepartmentWiseBill.getSelectionModel();
        tblDepartmentWiseBill.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblDepartmentWiseBill);
        setColumnsWidthsDepartmentBillModel();

    }

    public void setColumnsWidthsDepartmentBillModel() {
        TableColumn column = null;
        for (int i = 0; i < tblDepartmentWiseBill.getColumnCount(); i++) {
            column = tblDepartmentWiseBill.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(350);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void selectDepartmentWiseRefund() {

        listDepartmentRefundDetail = ctlAp.selectDepartmentWiseRefund(currentDischarge.getAdmissionNumber());

        if (listDepartmentRefundDetail.isEmpty()) {
            AdvancePayment object = new AdvancePayment();
            List list = new ArrayList();
            list.add(object);
            tblDepartmentWiseRefund.setModel(new DepartmentWiseRefundTableModel(list));
        } else {
            tblDepartmentWiseRefund.setModel(new DepartmentWiseRefundTableModel(listDepartmentRefundDetail));
//            for (int i = 0; i < listDepartmentRefundDetail.size(); i++) {
//                refund += (Integer.parseInt((String) tblDepartmentWiseRefund.getValueAt(i, 2)));
//            }
//            txtTotalRefund.setText(refund + "");
        }
        ListSelectionModel selectionModel = tblDepartmentWiseRefund.getSelectionModel();
        tblDepartmentWiseRefund.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblDepartmentWiseRefund);
        setColumnsWidthsDepartmentRefundModel();
    }

    public void setColumnsWidthsDepartmentRefundModel() {
        TableColumn column = null;
        for (int i = 0; i < tblDepartmentWiseRefund.getColumnCount(); i++) {
            column = tblDepartmentWiseRefund.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(350);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setIpdDepWiseDetail() {
        ipdDepWiseDetail = ctlAdvancePayment.selectAdmPatientDetail("12663",
                "33");
        tblServicesDetail.setModel(new IpdDepWiseDetailTableModel(
                ipdDepWiseDetail));
        ListSelectionModel selectionModel = tblServicesDetail.getSelectionModel();
        tblServicesDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setIpdDepWiseDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblServicesDetail);
    }

    private void setIpdDepWiseDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblServicesDetail.getColumnCount(); i++) {
            column = tblServicesDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(150);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            }
        }
    }

}
