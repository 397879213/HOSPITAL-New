package Form.OPD;

import BO.OPD.PatientHospitalVisit;
import BO.OPD.PhysioMachine;
import Controller.OPD.PhysioReportingController;
//import Form.Administration.TypeDetailForm;
import Form.general.DCMS_MDI;
import TableModel.OPD.PhysioPlanMasterTableModel;
import TableModel.OPD.TechnicianPerformDetailTableModel;
import TableModel.OPD.SelectPhysioMechineDetailTableModel;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.Status;

public class PhysioReportingForm extends javax.swing.JInternalFrame {

    public PhysioReportingForm(PatientHospitalVisit order) {

        initComponents();
        this.setSize(1100, 700);
        patientId = order.getPatientId();
        con = order.getCON();
        odi = order.getODI();
        setPatientInformation(order);
        txtSelectMechine.requestFocus();
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnCancelPlan.setMnemonic(KeyEvent.VK_C);
        btnAddPlan.setMnemonic(KeyEvent.VK_A);
        btnPerformPlan.setMnemonic(KeyEvent.VK_F);
        btnEditPlan.setMnemonic(KeyEvent.VK_E);
        btnStop.setMnemonic(KeyEvent.VK_T);
        btnPerformSession.setMnemonic(KeyEvent.VK_R);
        btnCancelPerformedSession.setMnemonic(KeyEvent.VK_N);

        Date date = new Date();
        txtToDate.setDate(date);
        txtFromDate.setDate(date);
        selectPhysioMaster();
        selectPhysioMachineDetail();
    }

    private DisplayLOV lov = new DisplayLOV();
    private PhysioReportingController ctlPhysioPerform = new PhysioReportingController();
    private PatientHospitalVisit order = new PatientHospitalVisit();
    private PhysioMachine objPhysio = new PhysioMachine();
    private PhysioMachine objPerform = new PhysioMachine();
    private PhysioMachine objCancel = new PhysioMachine();

    private List<PhysioMachine> listPhysioMaster = new ArrayList();
    private List<PhysioMachine> listPhysioDetail = new ArrayList();
    private List<PhysioMachine> listTechnicianPerformDetail = new ArrayList();
    private List<PhysioMachine> listPlanDetail = new ArrayList();
    private List<PhysioMachine> listMark = new ArrayList();

    private String physioId = "";
    private String patientId = "";
    private String machineId = "";
    private String bodyRegionId = "";
    private String con = "";
    private String odi = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblConsultantName = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSelectMechine = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBodyType = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtMachineTime = new javax.swing.JTextField();
        txtTotalDays = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        btnPerformPlan = new javax.swing.JButton();
        btnAddPlan = new javax.swing.JButton();
        btnCancelPlan = new javax.swing.JButton();
        btnEditPlan = new javax.swing.JButton();
        btnAddBodyRegions = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMachinePerformPlan = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPlanRemarks = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblPhysioPlanMaster = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblPerformPhysioMachine = new javax.swing.JTable();
        btnCancelPerformedSession = new javax.swing.JButton();
        btnPerformSession = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPerformRemarks = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel18 = new javax.swing.JLabel();
        txtMachineName = new javax.swing.JTextField();
        btnPerformMachineSummary = new javax.swing.JButton();
        btnPerformMachineDetail = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Physio Reporting");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(916, 700));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id :  ");

        txtPatientId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatientIdMouseClicked(evt);
            }
        });
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Age Gender : ");

        lblConsultantName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConsultantName.setForeground(new java.awt.Color(102, 0, 0));
        lblConsultantName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConsultantName.setText("Consultant Name : ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client Name : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsultantName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientName)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId)
                    .addComponent(txtPatientName)
                    .addComponent(txtAgeGender)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblConsultantName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plan Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Select Machine : ");

        txtSelectMechine.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSelectMechine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectMechineActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Body Region : ");

        txtBodyType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBodyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTypeActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Time (min) :  ");

        txtMachineTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMachineTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMachineTimeActionPerformed(evt);
            }
        });

        txtTotalDays.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDaysActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Session : ");

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instructions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.setLineWrap(true);
        txtRemarks.setRows(5);
        txtRemarks.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtRemarks);

        btnPerformPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPerformPlan.setText("Final Plan");
        btnPerformPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformPlanActionPerformed(evt);
            }
        });

        btnAddPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddPlan.setText("Add");
        btnAddPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlanActionPerformed(evt);
            }
        });

        btnCancelPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelPlan.setText("Cancel");
        btnCancelPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPlanActionPerformed(evt);
            }
        });

        btnEditPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditPlan.setText("Edit");
        btnEditPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnCancelPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerformPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerformPlan)
                    .addComponent(btnCancelPlan)
                    .addComponent(btnAddPlan)
                    .addComponent(btnEditPlan))
                .addGap(5, 5, 5))
        );

        btnAddBodyRegions.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddBodyRegions.setText("Regions");
        btnAddBodyRegions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBodyRegionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSelectMechine)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtMachineTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalDays, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtBodyType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddBodyRegions, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSelectMechine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBodyType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBodyRegions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMachineTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalDays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treatment Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblMachinePerformPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Machine Id","Machine Name", "Peform Date", "Perform By"
            }
        ));
        tblMachinePerformPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMachinePerformPlanMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMachinePerformPlanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMachinePerformPlanMouseReleased(evt);
            }
        });
        tblMachinePerformPlan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMachinePerformPlanKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblMachinePerformPlan);

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insatruction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPlanRemarks.setColumns(20);
        txtPlanRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPlanRemarks.setLineWrap(true);
        txtPlanRemarks.setRows(5);
        txtPlanRemarks.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtPlanRemarks);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treatment Advice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPhysioPlanMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Machine Id","Machine Name"
            }
        ));
        tblPhysioPlanMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhysioPlanMasterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPhysioPlanMasterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPhysioPlanMasterMouseReleased(evt);
            }
        });
        tblPhysioPlanMaster.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPhysioPlanMasterKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblPhysioPlanMaster);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perform Sessions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPerformPhysioMachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Machine Id","Machine Name", "Peform Date", "Perform By"
            }
        ));
        tblPerformPhysioMachine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerformPhysioMachineMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPerformPhysioMachineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPerformPhysioMachineMouseReleased(evt);
            }
        });
        tblPerformPhysioMachine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPerformPhysioMachineKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblPerformPhysioMachine);

        btnCancelPerformedSession.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelPerformedSession.setText("Cancel");
        btnCancelPerformedSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPerformedSessionActionPerformed(evt);
            }
        });

        btnPerformSession.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPerformSession.setText("Perform");
        btnPerformSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformSessionActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPerformRemarks.setColumns(20);
        txtPerformRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPerformRemarks.setLineWrap(true);
        txtPerformRemarks.setRows(5);
        txtPerformRemarks.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtPerformRemarks);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelPerformedSession, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPerformSession, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerformSession)
                    .addComponent(btnCancelPerformedSession)
                    .addComponent(btnExit)
                    .addComponent(btnStop)))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("From : ");

        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Machine : ");

        txtMachineName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMachineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMachineNameActionPerformed(evt);
            }
        });

        btnPerformMachineSummary.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPerformMachineSummary.setText("Summary");
        btnPerformMachineSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformMachineSummaryActionPerformed(evt);
            }
        });

        btnPerformMachineDetail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPerformMachineDetail.setText("Detail");
        btnPerformMachineDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformMachineDetailActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("To  : ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMachineName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerformMachineSummary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerformMachineDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMachineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPerformMachineSummary)
                        .addComponent(btnPerformMachineDetail))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtSelectMechineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectMechineActionPerformed
        // TODO add your handling code here:
        String query = " SELECT ID  , DESCRIPTION FROM "
                + Database.DCMS.definitionTypeDetail
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.POFPhysioMachine
                + " AND ACTIVE = 'Y'\n"
                + " AND UPPER(DESCRIPTION) LIKE '%" + txtSelectMechine.getText().toUpperCase() + "%'\n"
                + " AND ID NOT IN (SELECT MACHINE_ID FROM "
                + Database.DCMS.physioMasterPlan
                + " WHERE CON = '" + con + "'  AND ODI = '" + odi + "' \n"
                + " AND ORDER_STATUS_ID NOT IN ('" + Status.hold + "',"
                + " '" + Status.verified + "') )";
        lov.LOVSelection(query, this);
        machineId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            machineId = Constants.lovID;
            txtSelectMechine.setText(Constants.lovDescription);
            txtBodyType.requestFocus();
        }
    }//GEN-LAST:event_txtSelectMechineActionPerformed

    private void txtBodyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTypeActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.bodyType,
                txtBodyType.getText().toUpperCase(), this);
        bodyRegionId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            bodyRegionId = Constants.lovID;
            txtBodyType.setText(Constants.lovDescription);
            txtMachineTime.requestFocus();
        }
    }//GEN-LAST:event_txtBodyTypeActionPerformed

    private void txtMachineTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMachineTimeActionPerformed
        // TODO add your handling code here:
        try {
            Integer.parseInt(txtMachineTime.getText().trim());
            txtTotalDays.requestFocus();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Time in min.");
            txtMachineTime.requestFocus();
        }
    }//GEN-LAST:event_txtMachineTimeActionPerformed

    private void txtTotalDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDaysActionPerformed
        // TODO add your handling code here:
        if (!checkInfromation()) {
            return;
        }
        insertPhysioPlan();
    }//GEN-LAST:event_txtTotalDaysActionPerformed

    private void btnAddPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlanActionPerformed
        // TODO add your handling code here:
        if (!checkInfromation()) {
            return;
        }
        insertPhysioPlan();
    }//GEN-LAST:event_btnAddPlanActionPerformed

    private void tblMachinePerformPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMachinePerformPlanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMachinePerformPlanMouseClicked

    private void tblMachinePerformPlanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMachinePerformPlanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMachinePerformPlanMousePressed

    private void tblMachinePerformPlanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMachinePerformPlanMouseReleased
        // TODO add your handling code here:
        txtPlanRemarks.setText("");
        if (listPhysioDetail.isEmpty() || tblMachinePerformPlan.getSelectedRow() < 0) {
            return;
        }
        objPerform = listPhysioDetail.get(tblMachinePerformPlan.getSelectedRow());
        physioId = objPerform.getPhysioMasterId();
        txtPlanRemarks.setText(objPerform.getRemarks().trim());
        selectTechnicianPerformDetail(objPerform.getPhysioMasterId(),
                objPerform.getMachineId());
        if (objPerform.getOrderStatusId().equalsIgnoreCase(Status.verified)
                || objPerform.getOrderStatusId().equalsIgnoreCase(Status.hold)) {
            if (evt.getClickCount() % 2 == 0
                    && objPerform.getOrderStatusId().equalsIgnoreCase(Status.verified)) {
                JOptionPane.showMessageDialog(null, "This plane has alredy Performed and"
                        + " Completed all the Sessions.");
            }

            if (evt.getClickCount() % 2 == 0
                    && objPerform.getOrderStatusId().equalsIgnoreCase(Status.hold)) {
                JOptionPane.showMessageDialog(null, "This plane has been Hold and"
                        + " can not Perform the Sessions.");
            }
            btnPerformSession.setEnabled(false);
        } else {
            if (evt.getClickCount() % 2 == 0) {

                int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                        + "To Perform. \nDo you want to Perform?");
                if (confirmation != 0) {
                    return;
                }
                objPerform.setRemarks(txtPerformRemarks.getText().trim());
                objPerform.setOrderStatusId(Status.verified);
                if (ctlPhysioPerform.insertPhysioDetail(objPerform)) {
                    selectPhysioMachineDetail();
                    JOptionPane.showMessageDialog(null, "Record Save Successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Unable to Save Record.");
                }
            }
            btnPerformSession.setEnabled(true);
        }
    }//GEN-LAST:event_tblMachinePerformPlanMouseReleased

    private void tblMachinePerformPlanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMachinePerformPlanKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMachinePerformPlanKeyReleased

    private void tblPhysioPlanMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhysioPlanMasterMouseClicked
        // TODO add your handling code here:

//        if (tblUnattachedPhysioMachine.getSelectedRow() < 0
//            || listUnAttachedPhysioMachine.isEmpty()) {
//            return;
//        }
//        if (evt.getClickCount() % 2 == 0) {
//            PhysioMachine m = listUnAttachedPhysioMachine.get(tblUnattachedPhysioMachine.getSelectedRow());
//            m.setCON(order.getCON());
//            m.setODI(order.getODI());
//            m.setPatientId(order.getPatientId());
//            if (ctlPhysioPerform.insertPhysioMaster(m)) {
//                selectPhysioMasterByPatientId();
//                selectUnAttachedPhysioMachine();
//                selectTodayPerformedPhysioMachine();
//            } else {
//                JOptionPane.showMessageDialog(null, "Unable to Save Record,"
//                    + "Kindly Contact Administrator");
//            }
//        }
    }//GEN-LAST:event_tblPhysioPlanMasterMouseClicked

    private void tblPhysioPlanMasterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhysioPlanMasterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhysioPlanMasterMousePressed

    private void tblPhysioPlanMasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhysioPlanMasterMouseReleased
        // TODO add your handling code here:
        if (listPhysioMaster.isEmpty() || tblPhysioPlanMaster.getSelectedRow() < 0) {
            return;
        }
        objPhysio = listPhysioMaster.get(tblPhysioPlanMaster.getSelectedRow());
        machineId = objPhysio.getMachineId();
        bodyRegionId = objPhysio.getBodyRegionId();
        txtSelectMechine.setText(objPhysio.getMachineName());
        txtBodyType.setText(objPhysio.getBodyRegionDescription());
        txtTotalDays.setText(objPhysio.getPlanDays());
        txtMachineTime.setText(objPhysio.getTherapyTime());
        txtRemarks.setText(objPhysio.getRemarks());
        physioId = objPhysio.getPhysioMasterId();
//        selectMachinePerformPlan(physioId, objPhysio.getMachineId());
        if (evt.getClickCount() % 2 == 0) {
            int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                    + "To Delete Record. \nDo you want to Delete?");
            if (confirmation != 0) {
                return;
            }
            if (ctlPhysioPerform.deletePhysioPerform(objPhysio)) {
                JOptionPane.showMessageDialog(null, "Delete Successfully.");
                selectPhysioMachineDetail();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Delete.\n"
                        + "Kindly Contact Support Team.");
            }
        }

    }//GEN-LAST:event_tblPhysioPlanMasterMouseReleased

    private void tblPhysioPlanMasterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhysioPlanMasterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhysioPlanMasterKeyReleased

    private void tblPerformPhysioMachineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerformPhysioMachineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPerformPhysioMachineMouseClicked

    private void tblPerformPhysioMachineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerformPhysioMachineMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPerformPhysioMachineMousePressed

    private void tblPerformPhysioMachineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerformPhysioMachineMouseReleased
        // TODO add your handling code here:
        if (listTechnicianPerformDetail.isEmpty() || tblPerformPhysioMachine.getSelectedRow() < 0) {
            return;
        }
        objCancel = listTechnicianPerformDetail.get(tblPerformPhysioMachine.getSelectedRow());
        txtPerformRemarks.setText(objCancel.getRemarks());
    }//GEN-LAST:event_tblPerformPhysioMachineMouseReleased

    private void tblPerformPhysioMachineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPerformPhysioMachineKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPerformPhysioMachineKeyReleased

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed

    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToDateActionPerformed

    private void txtMachineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMachineNameActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.POFPhysioMachine,
                txtMachineName.getText(), this);
        machineId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            machineId = Constants.lovID;
            txtMachineName.setText(Constants.lovDescription);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtMachineNameActionPerformed

    private void btnPerformMachineSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformMachineSummaryActionPerformed
        // TODO add your handling code here:

        //        printPerformMachineReport(Reports.OPD.physioMachineSummary);
    }//GEN-LAST:event_btnPerformMachineSummaryActionPerformed

    private void btnPerformMachineDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformMachineDetailActionPerformed
        // TODO add your handling code here:
//        printPerformMachineReport(Reports.OPD.physioMachineDetail);
    }//GEN-LAST:event_btnPerformMachineDetailActionPerformed

    private void btnCancelPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPlanActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Delete Record. \nDo you want to Delete?");
        if (confirmation != 0) {
            return;
        }
        if (listPhysioMaster.isEmpty() || tblPhysioPlanMaster.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Please select the Record to Delete.");
            return;
        }

        objPhysio = listPhysioMaster.get(tblPhysioPlanMaster.getSelectedRow());
        if (objPhysio.getOrderStatusId().equalsIgnoreCase(Status.entered)) {
            btnCancelPlan.setEnabled(true);
        } else {
            btnCancelPlan.setEnabled(false);
        }
        if (objPhysio.getOrderStatusId().equalsIgnoreCase(Status.entered)) {
            btnCancelPlan.setEnabled(true);
        } else {
            btnCancelPlan.setEnabled(false);
        }

        if (ctlPhysioPerform.deletePhysioPerform(objPhysio)) {
            JOptionPane.showMessageDialog(null, "Record Delete Successfully.");
            selectPhysioMaster();
            selectPhysioMachineDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Delete Record.\n"
                    + "Kindly Contact Support Team.");
        }
    }//GEN-LAST:event_btnCancelPlanActionPerformed

    private void btnEditPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPlanActionPerformed
        // TODO add your handling code here:
        if (!checkInfromation()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Edit Record. \nDo you want to Edit?");
        if (confirmation != 0) {
            return;
        }
        objPhysio.setMachineId(machineId);
        objPhysio.setBodyRegionId(bodyRegionId);
        objPhysio.setTherapyTime(txtMachineTime.getText().trim());
        objPhysio.setPlanDays(txtTotalDays.getText().trim());
        objPhysio.setRemarks(txtRemarks.getText().trim());
        if (ctlPhysioPerform.updatePlans(objPhysio)) {
            clearTextBoxes();
            selectPhysioMaster();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Updated Record.");
        }
    }//GEN-LAST:event_btnEditPlanActionPerformed

    private void btnCancelPerformedSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPerformedSessionActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Cancel Record. \nDo you want to Cancel?");
        if (confirmation != 0) {
            return;
        }
        if (txtPerformRemarks.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter Remarks. Prior to "
                    + "Cancel the Session.");
            txtPerformRemarks.requestFocus();
            return;
        }
        objCancel.setRemarks(txtPerformRemarks.getText().trim());
        if (ctlPhysioPerform.cancelPerform(objCancel)) {
            selectPhysioMachineDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Record Cancelled Successfuly.");
        }
    }//GEN-LAST:event_btnCancelPerformedSessionActionPerformed

    private void btnPerformSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformSessionActionPerformed
        // TODO add your handling code here:
        if (listPhysioMaster.isEmpty()) {
            return;
        }
        if (txtPerformRemarks.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Remarks. Prior to "
                    + "Cancel the Session.");
            txtPerformRemarks.requestFocus();
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Perform. \nDo you want to Perform?");
        if (confirmation != 0) {
            return;
        }
        objPerform.setRemarks(txtPerformRemarks.getText().trim());
        objPerform.setOrderStatusId(Status.verified);
        if (ctlPhysioPerform.insertPhysioDetail(objPerform)) {
            selectPhysioMachineDetail();
            JOptionPane.showMessageDialog(null, "Record Save Successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record.");
        }
    }//GEN-LAST:event_btnPerformSessionActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPerformPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformPlanActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Perform. \nDo you want to Perform?");
        if (confirmation != 0) {
            return;
        }
        if (ctlPhysioPerform.performPlane(listPhysioMaster)) {
            clearForm();
            selectPhysioMachineDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Perform. Please Contact "
                    + "Support Team.");
        }
    }//GEN-LAST:event_btnPerformPlanActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        if (tblMachinePerformPlan.getSelectedRow() < 0) {
            return;
        }
        if (txtPerformRemarks.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter Remarks. Prior to "
                    + "Stop the Plan.");
            txtPerformRemarks.requestFocus();
            return;
        }
        if (objPerform.getRemarks().trim().equalsIgnoreCase(objPerform.getRemarks().trim())) {
            txtPerformRemarks.setText("");
            objPerform.setRemarks("");
            JOptionPane.showMessageDialog(null, "Please Enter Stop Remarks. Prior "
                    + "to Stop the Plan.");
            txtPerformRemarks.requestFocus();
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Stop the Current Plan. \nDo You Want to Stop?");
        if (confirmation != 0) {
            return;
        }

        objPerform.setRemarks(txtPlanRemarks.getText().trim());
        if (ctlPhysioPerform.stopPhysioPlane(objPerform)) {
            selectPhysioMachineDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Stop Plan. Please Contact "
                    + "Support Team.");
        }
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnAddBodyRegionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBodyRegionsActionPerformed
        // TODO add your handling code here:

//        TypeDetailForm fm = new TypeDetailForm(DefinitionTypes.bodyType, "Body Regions");
//        DCMS_MDI.desktopPane.add(fm);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = fm.getSize();
//        fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        fm.setVisible(true);
    }//GEN-LAST:event_btnAddBodyRegionsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBodyRegions;
    private javax.swing.JButton btnAddPlan;
    private javax.swing.JButton btnCancelPerformedSession;
    private javax.swing.JButton btnCancelPlan;
    private javax.swing.JButton btnEditPlan;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPerformMachineDetail;
    private javax.swing.JButton btnPerformMachineSummary;
    private javax.swing.JButton btnPerformPlan;
    private javax.swing.JButton btnPerformSession;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblConsultantName;
    private javax.swing.JTable tblMachinePerformPlan;
    private javax.swing.JTable tblPerformPhysioMachine;
    private javax.swing.JTable tblPhysioPlanMaster;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBodyType;
    private javax.swing.JTextField txtClient;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtMachineName;
    private javax.swing.JTextField txtMachineTime;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtPerformRemarks;
    private javax.swing.JTextArea txtPlanRemarks;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtSelectMechine;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    private javax.swing.JTextField txtTotalDays;
    // End of variables declaration//GEN-END:variables

    private void selectPhysioMaster() {
        listPhysioMaster = ctlPhysioPerform.selectPhysioMasterByCONODI(con, odi,
                Status.entered);
        if (listPhysioMaster.isEmpty()) {
            List<PhysioMachine> list = new ArrayList();
            list.add(new PhysioMachine());
            tblPhysioPlanMaster.setModel(new PhysioPlanMasterTableModel(list));
        } else {
            tblPhysioPlanMaster.setModel(new PhysioPlanMasterTableModel(listPhysioMaster));
            ListSelectionModel selectionModel = tblPhysioPlanMaster.getSelectionModel();
            tblPhysioPlanMaster.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            selectionModel.setSelectionInterval(0, 0);
            setPhysioMasterColumnsWidths();
            Constants.tablelook.setJTableEnvironment(tblPhysioPlanMaster);
            physioId = listPhysioMaster.get(0).getPhysioMasterId();
//            selectMachinePerformPlan(physioId, objPhysio.getMachineId());
        }
    }

    private void setPhysioMasterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPhysioPlanMaster.getColumnCount(); i++) {
            column = tblPhysioPlanMaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(80);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            } else if (i == 5) {
                column.setPreferredWidth(40);
            } else if (i == 6) {
                column.setPreferredWidth(40);
            }
        }
    }

    private void insertPhysioPlan() {

        objPhysio.setPatientId(patientId);
        objPhysio.setCON(con);
        objPhysio.setODI(odi);
        objPhysio.setOrderStatusId(Status.entered);
        objPhysio.setMachineId(machineId);
        objPhysio.setBodyRegionId(bodyRegionId);
        objPhysio.setTherapyTime(txtMachineTime.getText().trim());
        objPhysio.setPlanDays(txtTotalDays.getText().trim());
        objPhysio.setRemarks(txtRemarks.getText().trim());
        if (ctlPhysioPerform.insertPhysioMaster(objPhysio)) {
            clearTextBoxes();
            selectPhysioMaster();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Mechine Information.\n"
                    + "Kindly contact Support Team.");
        }
    }

    private void selectPhysioMachineDetail() {
        listPhysioDetail = ctlPhysioPerform.selectPhysioMasterByPatientId(patientId);
        if (listPhysioDetail.isEmpty()) {
            List<PhysioMachine> list = new ArrayList();
            list.add(new PhysioMachine());
            tblMachinePerformPlan.setModel(new SelectPhysioMechineDetailTableModel(list));
        } else {
            tblMachinePerformPlan.setModel(new SelectPhysioMechineDetailTableModel(listPhysioDetail));
        }
        ListSelectionModel selectionModel = tblMachinePerformPlan.getSelectionModel();
        tblMachinePerformPlan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        setPhysioMachineDetailColumnsWidths();
        Constants.tablelook.setJTableEnvironment(tblMachinePerformPlan);
        if (!listPhysioDetail.isEmpty()) {
            PhysioMachine phy = listPhysioDetail.get(0);
            selectTechnicianPerformDetail(phy.getPhysioMasterId(), phy.getMachineId());
        }
    }

    private void setPhysioMachineDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblMachinePerformPlan.getColumnCount(); i++) {
            column = tblMachinePerformPlan.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(80);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            } else if (i == 5) {
                column.setPreferredWidth(40);
            } else if (i == 6) {
                column.setPreferredWidth(40);
            } else if (i == 7) {
                column.setPreferredWidth(40);
            }
        }
    }

    private void selectTechnicianPerformDetail(String physioId, String machineId) {
        listTechnicianPerformDetail = ctlPhysioPerform.selectTechnicianDetail(
                physioId, machineId);
        if (listTechnicianPerformDetail.isEmpty()) {
            List<PhysioMachine> list = new ArrayList();
            list.add(new PhysioMachine());
            tblPerformPhysioMachine.setModel(new TechnicianPerformDetailTableModel(list));
        } else {
            tblPerformPhysioMachine.setModel(new TechnicianPerformDetailTableModel(
                    listTechnicianPerformDetail));
        }
        ListSelectionModel selectionModel = tblPerformPhysioMachine.getSelectionModel();
        tblPerformPhysioMachine.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        setTechnicianDetailColumnsWidths();
        Constants.tablelook.setJTableEnvironment(tblPerformPhysioMachine);
    }

    private void setTechnicianDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPerformPhysioMachine.getColumnCount(); i++) {
            column = tblPerformPhysioMachine.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(40);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void clearTextBoxes() {

        txtBodyType.setText("");
        txtSelectMechine.setText("");
        txtMachineTime.setText("");
        txtTotalDays.setText("");
        txtRemarks.setText("");
        txtSelectMechine.requestFocus();

    }

    private void setPatientInformation(PatientHospitalVisit order) {
        txtPatientId.setText(order.getPatientId().substring(3));
        txtPatientName.setText(order.getPatientName());
        txtAgeGender.setText(order.getAge() + " / " + order.getGender());
        txtClient.setText(order.getClientName());
        txtPrimaryPhy.setText(order.getConsultantName());
    }

    private void clearForm() {
        txtPatientId.setText("");
        txtPatientName.setText("");
        txtAgeGender.setText("");
        txtClient.setText("");
        txtPrimaryPhy.setText("");
        txtBodyType.setText("");
        txtSelectMechine.setText("");
        txtMachineTime.setText("");
        txtTotalDays.setText("");
        txtSelectMechine.requestFocus();
        listTechnicianPerformDetail.clear();
        listPhysioDetail.clear();
        listPhysioMaster.clear();
        listPlanDetail.clear();

        tblPerformPhysioMachine.setModel(new TechnicianPerformDetailTableModel(listTechnicianPerformDetail));
        tblPhysioPlanMaster.setModel(new SelectPhysioMechineDetailTableModel(listPhysioDetail));
        tblMachinePerformPlan.setModel(new PhysioPlanMasterTableModel(listPhysioMaster));
    }

    private boolean checkInfromation() {
        if (machineId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Machine.");
            txtSelectMechine.requestFocus();
            return false;
        }
        if (bodyRegionId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Body Region.");
            txtBodyType.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(txtMachineTime.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Machine Time");
            txtMachineTime.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(txtTotalDays.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Total Days");
            txtTotalDays.requestFocus();
            return false;
        }
        if (Integer.parseInt(txtMachineTime.getText()) < 1) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Machine Time");
            txtMachineTime.requestFocus();
            return false;
        }
        if (Integer.parseInt(txtTotalDays.getText()) < 1) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Total Days");
            txtMachineTime.requestFocus();
            return false;
        }
        return true;
    }
}
