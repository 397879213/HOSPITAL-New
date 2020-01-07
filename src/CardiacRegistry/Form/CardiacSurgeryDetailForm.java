package CardiacRegistry.Form;

import CardiacRegistry.BO.CardiacRegistryECHO;
import CardiacRegistry.BO.CardiacRegistryMedication;
import CardiacRegistry.BO.CardiacSurgeryBO;
import CardiacRegistry.BO.CardiacSurgeryTeam;
import CardiacRegistry.BO.CardiacRegistryCathProcedure;
import CardiacRegistry.Controller.CardiacRegistryDiagnosticController;
import CardiacRegistry.Controller.CardiacRegistryECHOController;
import CardiacRegistry.Controller.CardiacRegistryMedicationController;
import CardiacRegistry.Controller.CardiacSurgeryController;
import CardiacRegistry.Controller.CardiacTeamController;
import CardiacRegistry.Controller.RegistryCathProcedureController;
import CardiacRegistry.TableModel.EchoValveMeasurementTableModel;
import CardiacRegistry.TableModel.EchoValveTableModel;
import CardiacRegistry.TableModel.EchocardiographyMasterTableModel;
import CardiacRegistry.TableModel.ExamDetailTableModel;
import CardiacRegistry.TableModel.PreMedicationsTableModel;
import CardiacRegistry.TableModel.ProcedureDetailTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

public class CardiacSurgeryDetailForm extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    CardiacRegistryECHO objEchocardiography = new CardiacRegistryECHO();
    CardiacRegistryMedication objMedication = new CardiacRegistryMedication();
    CardiacRegistryCathProcedure objProcedure = new CardiacRegistryCathProcedure();
    CardiacSurgeryBO objCardiacSurger = new CardiacSurgeryBO();
    
    private CardiacSurgeryController ctlCardiacSurg = new CardiacSurgeryController();
    private CardiacTeamController ctlTeam = new CardiacTeamController();
    CardiacRegistryMedicationController ctlMed = new CardiacRegistryMedicationController();
    CardiacRegistryECHOController ctlEcho = new CardiacRegistryECHOController();
    RegistryCathProcedureController ctlProcedure = new RegistryCathProcedureController();
    CardiacRegistryDiagnosticController ctlDiagnostic = new CardiacRegistryDiagnosticController();
    
    private List<CardiacSurgeryBO> listExamDetail = new ArrayList();
    private List<CardiacRegistryCathProcedure> listProcedure = new ArrayList();
    private List<CardiacRegistryECHO> listEchocardiographyMaster = new ArrayList();
    private List<CardiacRegistryECHO> listEchoValve = new ArrayList();
    private List<CardiacRegistryECHO> listEchoValveMeasurement = new ArrayList();
    private List<CardiacRegistryMedication> listMedication = new ArrayList();
    
    private String cardiacSurgeryId = "";
    private String patientId = "";
    private String performDate = "";
    private String surgProcedureId = "";
    private String procedureInstId = "";
    private String procedurePerformingId = "";
    private String procedureType = "";
    private String medId = "";
    private String teamId = "0";
    private String actionId = "0";
    private String actionDescription = "";
    private String doseId = "";
    private String timePeroid = "";
    private String echoInstId = "";
    private String echoPerformingId = "";
    private String echoPerDate = "";
    private String echoId = "";

    public CardiacSurgeryDetailForm(String cardiacId, String patientId) {

        initComponents();
        this.setSize(Constants.xSize - 20, Constants.ySize - Constants.yExtension + 8);
        this.cardiacSurgeryId = cardiacId;
        this.patientId = patientId;
        setExamDetail();
        setDateOfProcedure(0);
        selectProcedureDetail();
        selectPreMedications();
        selectEchocardiographyMaster();
        setTmePeriod(0);
        setEchocardiography(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblExamDetail = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPreMedications = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txtMedication = new javax.swing.JTextField();
        btnAddProcePerforming2 = new javax.swing.JButton();
        txtDose = new javax.swing.JTextField();
        txtTimePeriod = new org.jdesktop.swingx.JXDatePicker();
        jLabel27 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtMedDuration = new javax.swing.JTextField();
        cboMonthsDays = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOTTeam = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        txtSelectTeam = new javax.swing.JTextField();
        btnManageTeam = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtActionType = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtActionBy = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProcedureDetail = new javax.swing.JTable();
        cboProcType = new javax.swing.JComboBox<>();
        txtProcedureName = new javax.swing.JTextField();
        txtPerformDate = new org.jdesktop.swingx.JXDatePicker();
        txtProcedureInstitute = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnAddProceInst = new javax.swing.JButton();
        btnAddProcedureName = new javax.swing.JButton();
        txtProcedurePerforming = new javax.swing.JTextField();
        txtLVEDP = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPAPS = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtPAPD = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtPAWP = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cboEjectionFraction = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        cboLeftDisease = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        cboDiseaseExtent = new javax.swing.JComboBox<>();
        btnSaveCathData1 = new javax.swing.JButton();
        btnSaveCathData2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtanterobasal = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtanterolateral = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtApical = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaphragmatic = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtPosterobasal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        ChkCSS = new javax.swing.JCheckBox();
        btnSaveCathData = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtEchoPerformDate = new org.jdesktop.swingx.JXDatePicker();
        txtEchoInstitue = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtEchoPerforming = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblEchocardiographyMaster = new javax.swing.JTable();
        btnAddProcedureName1 = new javax.swing.JButton();
        btnAddProcedureName2 = new javax.swing.JButton();
        btnSaveEcho = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEchoValveMeasurement = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblEchoValve = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtTicketNo = new javax.swing.JTextField();
        txtReqBySearch = new javax.swing.JTextField();
        txtSearchByType = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtEnteredBy = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(975, 720));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiology Surgery Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exam Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblExamDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblExamDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblExamDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblExamDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExamDetailMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblExamDetailMouseReleased(evt);
            }
        });
        tblExamDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblExamDetailKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblExamDetail);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Pre-Oper. Medication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        tblPreMedications.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblPreMedications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblPreMedications.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPreMedications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPreMedicationsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPreMedicationsMouseReleased(evt);
            }
        });
        tblPreMedications.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPreMedicationsKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tblPreMedications);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Medication : ");

        txtMedication.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicationActionPerformed(evt);
            }
        });

        btnAddProcePerforming2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddProcePerforming2.setText("+");

        txtDose.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseActionPerformed(evt);
            }
        });

        txtTimePeriod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTimePeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimePeriodActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Dose : ");

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Duration : ");

        txtMedDuration.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtMedDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedDurationActionPerformed(evt);
            }
        });

        cboMonthsDays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year(s)", "Month(s)", "Day(s)" }));
        cboMonthsDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMonthsDaysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtMedication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddProcePerforming2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtMedDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMonthsDays, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTimePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDose))
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProcePerforming2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMonthsDays, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OT Team", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tblOTTeam.setBackground(java.awt.SystemColor.activeCaption);
        tblOTTeam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblOTTeam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "Sr.No", "Question", "Selected User"
            }
        ));
        tblOTTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOTTeamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOTTeamMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOTTeamMouseReleased(evt);
            }
        });
        tblOTTeam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOTTeamKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblOTTeam);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Team : ");

        txtSelectTeam.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtSelectTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectTeamActionPerformed(evt);
            }
        });

        btnManageTeam.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnManageTeam.setText("Manage");
        btnManageTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTeamActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Action : ");

        txtActionType.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtActionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionTypeActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("By: ");

        txtActionBy.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtActionBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionByActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtSelectTeam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnManageTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtActionType, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtActionBy))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtSelectTeam)
                    .addComponent(btnManageTeam))
                .addGap(7, 7, 7)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtActionType)
                    .addComponent(txtActionBy)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Cardiac Detail", jPanel5);

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Cath. Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procedure Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblProcedureDetail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblProcedureDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblProcedureDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProcedureDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProcedureDetailMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblProcedureDetailMouseReleased(evt);
            }
        });
        tblProcedureDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProcedureDetailKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblProcedureDetail);

        cboProcType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Surgery", "Intervention"}));
        cboProcType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProcTypeActionPerformed(evt);
            }
        });

        txtProcedureName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtProcedureName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcedureNameActionPerformed(evt);
            }
        });

        txtPerformDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPerformDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerformDateActionPerformed(evt);
            }
        });

        txtProcedureInstitute.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtProcedureInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcedureInstituteActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Institute :  ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Perform By : ");

        btnAddProceInst.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddProceInst.setText("+");

        btnAddProcedureName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddProcedureName.setText("+");

        txtProcedurePerforming.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtProcedurePerforming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcedurePerformingActionPerformed(evt);
            }
        });

        txtLVEDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLVEDPActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("LVEDP : ");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("PAPS : ");

        txtPAPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAPSActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("PAPD : ");

        txtPAPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAPDActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("PAWP : ");

        txtPAWP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAWPActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Ejection Fraction : ");

        cboEjectionFraction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Unknown", "Good > 50%"}));
        cboEjectionFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEjectionFractionActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Left Main Disease : ");

        cboLeftDisease.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Nill or < 50%", "50-70", " > 70" }));
        cboLeftDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLeftDiseaseActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Disease Extent: ");

        cboDiseaseExtent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Nill", "Single Vessel", "2-Vessel", "3-Vessel" }));
        cboDiseaseExtent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiseaseExtentActionPerformed(evt);
            }
        });

        btnSaveCathData1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveCathData1.setText("Save");
        btnSaveCathData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCathData1ActionPerformed(evt);
            }
        });

        btnSaveCathData2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveCathData2.setText("Edit");
        btnSaveCathData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCathData2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboProcType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProcedureName, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtProcedureInstitute))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddProcedureName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddProceInst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedurePerforming))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPerformDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveCathData1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveCathData2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLVEDP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPAPS, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEjectionFraction, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboLeftDisease, 0, 88, Short.MAX_VALUE)
                            .addComponent(txtPAPD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPAWP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDiseaseExtent, 0, 94, Short.MAX_VALUE)))))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboProcType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProcedureName)
                        .addComponent(btnAddProcedureName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProcedurePerforming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcedureInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProceInst, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerformDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveCathData1)
                    .addComponent(btnSaveCathData2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEjectionFraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLeftDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDiseaseExtent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLVEDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPAWP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Procedure Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Anterobasal : ");

        txtanterobasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanterobasalActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Anterolateral : ");

        txtanterolateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanterolateralActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Apical : ");

        txtApical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApicalActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Diaphragmatic : ");

        txtDiaphragmatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaphragmaticActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Posterobasal : ");

        txtPosterobasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosterobasalActionPerformed(evt);
            }
        });

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.setLineWrap(true);
        txtRemarks.setRows(5);
        txtRemarks.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtRemarks);

        ChkCSS.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        ChkCSS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ChkCSS.setForeground(new java.awt.Color(102, 0, 0));
        ChkCSS.setText("CSS Performed");
        ChkCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkCSSActionPerformed(evt);
            }
        });

        btnSaveCathData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveCathData.setText("Save");
        btnSaveCathData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCathDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtanterobasal)
                                .addComponent(txtanterolateral, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApical, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDiaphragmatic)
                                .addComponent(txtPosterobasal, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(ChkCSS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveCathData, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtanterobasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtanterolateral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaphragmatic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosterobasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkCSS)
                    .addComponent(btnSaveCathData))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Echo Cardiography", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Echo info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        txtEchoPerformDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEchoPerformDateActionPerformed(evt);
            }
        });

        txtEchoInstitue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEchoInstitueActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Physician : ");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Date : ");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Institute : ");

        txtEchoPerforming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEchoPerformingActionPerformed(evt);
            }
        });

        tblEchocardiographyMaster.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblEchocardiographyMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblEchocardiographyMaster.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEchocardiographyMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEchocardiographyMasterMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEchocardiographyMasterMouseReleased(evt);
            }
        });
        tblEchocardiographyMaster.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEchocardiographyMasterKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblEchocardiographyMaster);

        btnAddProcedureName1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddProcedureName1.setText("+");

        btnAddProcedureName2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddProcedureName2.setText("+");

        btnSaveEcho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveEcho.setText("Save");
        btnSaveEcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEchoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtEchoPerformDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveEcho, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEchoInstitue)
                            .addComponent(txtEchoPerforming))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddProcedureName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddProcedureName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEchoInstitue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProcedureName2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEchoPerforming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProcedureName1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEchoPerformDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveEcho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Measurement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        tblEchoValveMeasurement.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblEchoValveMeasurement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblEchoValveMeasurement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEchoValveMeasurement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEchoValveMeasurementMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEchoValveMeasurementMouseReleased(evt);
            }
        });
        tblEchoValveMeasurement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEchoValveMeasurementKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tblEchoValveMeasurement);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valve", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        tblEchoValve.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblEchoValve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblEchoValve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEchoValve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEchoValveMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEchoValveMouseReleased(evt);
            }
        });
        tblEchoValve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEchoValveKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblEchoValve);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("History", jPanel4);

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Patient Id : ");

        txtTicketNo.setEditable(false);
        txtTicketNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTicketNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketNoActionPerformed(evt);
            }
        });

        txtReqBySearch.setEditable(false);
        txtReqBySearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReqBySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReqBySearchActionPerformed(evt);
            }
        });

        txtSearchByType.setEditable(false);
        txtSearchByType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchByType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByTypeActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Surgery Date : ");

        txtEnteredBy.setEditable(false);
        txtEnteredBy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEnteredBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnteredByActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReqBySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchByType, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnteredBy)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTicketNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReqBySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchByType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnteredBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblExamDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamDetailMouseClicked

        if (tblExamDetail.getSelectedRow() < 0) {
            return;
        }
    }//GEN-LAST:event_tblExamDetailMouseClicked

    private void tblExamDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamDetailMouseReleased

        if (tblExamDetail.getSelectedRow() < 0 || listExamDetail.isEmpty()) {
            return;
        }
        objCardiacSurger = listExamDetail.get(tblExamDetail.getSelectedRow());
        if (evt.getClickCount() % 2 == 0 && tblExamDetail.getSelectedColumn() == 2) {
            lov.LOVDefinitionSelection(objCardiacSurger.getExamId(), "", this);
            objCardiacSurger.setExamDetailId(Constants.lovID);
            objCardiacSurger.setExamDetailDescription(Constants.lovDescription);
            objCardiacSurger.setCardiacRegistryId(cardiacSurgeryId);
            if (ctlDiagnostic.updateExamDetail(objCardiacSurger)) {
                System.out.println("Records Save Successfully.");
                setExamDetail();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save Exam Detail.");
            }

        }
    }//GEN-LAST:event_tblExamDetailMouseReleased

    private void tblExamDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblExamDetailKeyReleased

        if (tblExamDetail.getSelectedRow() < 0 || listExamDetail.isEmpty()) {
            return;
        }
        if (tblExamDetail.getSelectedColumn() == 3) {
            objCardiacSurger = listExamDetail.get(tblExamDetail.getSelectedRow());
            objCardiacSurger.setExamRemarks(String.valueOf(tblExamDetail.getValueAt(
                    tblExamDetail.getSelectedRow(), 3)).trim());
            objCardiacSurger.setCardiacRegistryId(cardiacSurgeryId);
            if (ctlDiagnostic.updateExamDetailRemarks(objCardiacSurger)) {
                System.out.println("Remarks Save Successfully.");
                setExamDetail();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save Remarks.");
            }
        }
    }//GEN-LAST:event_tblExamDetailKeyReleased

    private void tblProcedureDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcedureDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProcedureDetailMouseClicked

    private void tblProcedureDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcedureDetailMouseReleased
        // TODO add your handling code here:
        if (tblProcedureDetail.getSelectedRow() < 0 || listProcedure.isEmpty()) {
            return;
        }

        if (tblProcedureDetail.getSelectedColumn() == 5) {
            setProecedureDetail();
            if (ctlProcedure.updateCardiacProcedureDetail(objProcedure)) {
                System.out.println("Remarks Save Successfully.");
                setExamDetail();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save Remarks.");
            }
        }

        objProcedure = listProcedure.get(tblProcedureDetail.getSelectedRow());
        if (evt.getClickCount() % 2 == 0) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to Delete?");
            if (confirmation != 0) {
                return;
            }
            if (ctlProcedure.deleteProcedure(objProcedure)) {
                JOptionPane.showMessageDialog(null, "Record Delete Successsfully.");
                selectProcedureDetail();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Delete Record.");
            }
        }
        surgProcedureId = objProcedure.getProcedureId();
        procedureInstId = objProcedure.getInstituteId();
        procedurePerformingId = objProcedure.getPerformingPhysicianId();
        setDateOfProcedure(Integer.parseInt(objProcedure.getDayOfProcedure()));
        txtProcedureInstitute.setText(objProcedure.getInstituteDescription());
        txtProcedureName.setText(objProcedure.getProcedureDescription());
        txtProcedurePerforming.setText(objProcedure.getPerformingPhysicianName());
        if (objProcedure.getProcedureType().equals("Surgery")) {
            cboProcType.setSelectedIndex(1);
            procedureType = DefinitionTypes.cardiacSurgery;
        }
        if (objProcedure.getProcedureType().equals("Intervention")) {
            cboProcType.setSelectedIndex(2);
            procedureType = DefinitionTypes.cardiacIntervention;
        }
        cboEjectionFraction.setSelectedItem(objProcedure.getEjectionFraction());
        cboLeftDisease.setSelectedItem(objProcedure.getLeftMainDisease());
        cboDiseaseExtent.setSelectedItem(objProcedure.getExtentofDisease());
        txtLVEDP.setText(objProcedure.getLVEDP());
        txtPAPS.setText(objProcedure.getPAPS());
        txtPAPD.setText(objProcedure.getPAPD());
        txtPAWP.setText(objProcedure.getPAWP());
        txtanterobasal.setText(objProcedure.getAnterobasal());
        txtanterolateral.setText(objProcedure.getAnterolateral());
        txtApical.setText(objProcedure.getApical());
        txtDiaphragmatic.setText(objProcedure.getDiaphragmatic());
        txtPosterobasal.setText(objProcedure.getPosterobasal());
        txtRemarks.setText(objProcedure.getProcedureRemarks());
        ChkCSS.setSelected(false);
        if (objProcedure.getCSSPerformed().equalsIgnoreCase("Y")) {
            ChkCSS.setSelected(true);
        }

        btnSaveCathData.setEnabled(false);
        cboProcType.setEnabled(false);
        txtProcedureName.setEditable(false);


    }//GEN-LAST:event_tblProcedureDetailMouseReleased

    private void tblProcedureDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProcedureDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProcedureDetailKeyReleased

    private void txtPerformDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerformDateActionPerformed
        // TODO add your handling code here:
        if (txtPerformDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        performDate = dateFormat.format(txtPerformDate.getDate());
        txtProcedureInstitute.requestFocus();
    }//GEN-LAST:event_txtPerformDateActionPerformed

    private void txtProcedureNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcedureNameActionPerformed
        // TODO add your handling code here:
        if(cboProcType.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please Select Procedure Type.");
            cboProcType.requestFocus();
            return;
        }
        lov.LOVDefinitionSelection(procedureType, txtProcedureName.getText().trim(), this);
        surgProcedureId = Constants.lovID;
        txtProcedureName.setText(Constants.lovDescription);
        txtPerformDate.requestFocus();
    }//GEN-LAST:event_txtProcedureNameActionPerformed

    private void txtProcedureInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcedureInstituteActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacInstitutes,
                txtProcedureInstitute.getText().trim(), this);
        procedureInstId = Constants.lovID;
        txtProcedureInstitute.setText(Constants.lovDescription);
        txtProcedurePerforming.requestFocus();
    }//GEN-LAST:event_txtProcedureInstituteActionPerformed

    private void txtProcedurePerformingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcedurePerformingActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtProcedurePerforming.getText().trim(), this);
        txtProcedurePerforming.setText(Constants.lovDescription);
        procedurePerformingId = Constants.lovID;
        cboEjectionFraction.requestFocus();
    }//GEN-LAST:event_txtProcedurePerformingActionPerformed

    private void tblEchoValveMeasurementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchoValveMeasurementMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchoValveMeasurementMouseClicked

    private void tblEchoValveMeasurementMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchoValveMeasurementMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchoValveMeasurementMouseReleased

    private void tblEchoValveMeasurementKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEchoValveMeasurementKeyReleased
        // TODO add your handling code here:
        CardiacRegistryECHO objMea = listEchoValveMeasurement.get(
                tblEchoValveMeasurement.getSelectedRow());
        objMea.setValue(tblEchoValveMeasurement.getValueAt(
                tblEchoValveMeasurement.getSelectedRow(), 1).toString());
        if (ctlEcho.updateEchoMeasurement(objMea)) {
            selectEchoValveMeasurement();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Value.");
        }
    }//GEN-LAST:event_tblEchoValveMeasurementKeyReleased

    private void tblPreMedicationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreMedicationsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreMedicationsMouseClicked

    private void tblPreMedicationsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreMedicationsMouseReleased
        // TODO add your handling code here:
        CardiacRegistryMedication objMed = listMedication.get(tblPreMedications.getSelectedRow());
        if (evt.getClickCount() % 2 == 0) {
            int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                    + "To Remove " + objMed.getMedicineDesc() + ". \nDo you want to Remove?");
            if (confirmation != 0) {
                return;
            }
            if (ctlMed.updateMedications(objMed.getMedicationId())) {
                JOptionPane.showMessageDialog(null, "Medicine Remove Successfully.");
                selectPreMedications();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Remove Medicine.");
            }

        }

    }//GEN-LAST:event_tblPreMedicationsMouseReleased

    private void tblPreMedicationsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPreMedicationsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreMedicationsKeyReleased

    private void txtTimePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimePeriodActionPerformed
        // TODO add your handling code here:
        if (txtTimePeriod.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Select the Time Period DD-MON-YY",
                    "Pre Medication", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        timePeroid = dateFormat.format(txtTimePeriod.getDate());
    }//GEN-LAST:event_txtTimePeriodActionPerformed

    private void txtEchoPerformDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEchoPerformDateActionPerformed
        // TODO add your handling code here:
        if (txtEchoPerformDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Select the Echo Date DD-MON-YY",
                    "Echo Per Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        echoPerDate = dateFormat.format(txtEchoPerformDate.getDate());
    }//GEN-LAST:event_txtEchoPerformDateActionPerformed

    private void tblEchocardiographyMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchocardiographyMasterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchocardiographyMasterMouseClicked

    private void tblEchocardiographyMasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchocardiographyMasterMouseReleased
        // TODO add your handling code here:
        CardiacRegistryECHO obj = listEchocardiographyMaster.get(
                tblEchocardiographyMaster.getSelectedRow());
        echoId = obj.getEchoId();
        
        selectEchoValve();
        selectEchoValveMeasurement();
    }//GEN-LAST:event_tblEchocardiographyMasterMouseReleased

    private void tblEchocardiographyMasterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEchocardiographyMasterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchocardiographyMasterKeyReleased

    private void tblEchoValveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchoValveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchoValveMouseClicked

    private void tblEchoValveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchoValveMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchoValveMouseReleased

    private void tblEchoValveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEchoValveKeyReleased
        // TODO add your handling code here:
        int col = tblEchoValve.getSelectedColumn();
        CardiacRegistryECHO objValve = listEchoValve.get(tblEchoValve.getSelectedRow());
        objValve.setColumnName(String.valueOf(col));
        objValve.setValue(tblEchoValve.getValueAt(tblEchoValve.getSelectedRow(), col).toString());
        if (ctlEcho.updateEchoValve(objValve)) {
            System.err.println("updated.");
            selectEchoValve();
        } else {
            JOptionPane.showConfirmDialog(null, "Unable to save value.");
        }
    }//GEN-LAST:event_tblEchoValveKeyReleased

    private void txtEchoInstitueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEchoInstitueActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacInstitutes, txtEchoInstitue.getText().trim(), this);
        echoInstId = Constants.lovID;
        txtEchoInstitue.setText(Constants.lovDescription);
        txtEchoPerforming.requestFocus();
    }//GEN-LAST:event_txtEchoInstitueActionPerformed

    private void cboProcTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProcTypeActionPerformed
        // TODO add your handling code here:
        if (cboProcType.getSelectedIndex() == 1) {
            procedureType = DefinitionTypes.cardiacSurgery;
        }
        if (cboProcType.getSelectedIndex() == 2) {
            procedureType = DefinitionTypes.cardiacIntervention;
        }
        txtProcedureName.requestFocus();
    }//GEN-LAST:event_cboProcTypeActionPerformed

    private void txtMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicationActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM            \n"
                + Database.DCMS.item + "                       \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtMedication.getText().toUpperCase().trim() + "%' \n"
                + " AND ACTIVE = 'Y'                           \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            medId = "";
            return;
        }
        medId = Constants.lovID;
        txtMedication.setText(Constants.lovDescription);
        txtDose.requestFocus();
    }//GEN-LAST:event_txtMedicationActionPerformed

    private void txtEchoPerformingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEchoPerformingActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtEchoPerforming.getText().trim(), this);
        txtEchoPerforming.setText(Constants.lovDescription);
        echoPerformingId = Constants.lovID;
        txtEchoPerformDate.requestFocus();
    }//GEN-LAST:event_txtEchoPerformingActionPerformed

    private void txtDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.doseQuantity, txtDose.getText().trim(), this);
        doseId = Constants.lovID;
        txtDose.setText(Constants.lovDescription);
        sevePreMedication();
        txtMedDuration.requestFocus();
    }//GEN-LAST:event_txtDoseActionPerformed

    private void tblOTTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTTeamMouseClicked

//        if (listTeamMembers.isEmpty() || tblOTTeam.getSelectedRow() < 0) {
//            return;
//        }
//        if (evt.getClickCount() % 2 == 0) {
//            int i = JOptionPane.showConfirmDialog(null,
//                    "you are going to delete selected team member");
//
//            if (i != 0) {
//                return;
//            }
//            CardiacSurgeryTeam member = listTeamMembers.get(tblOTTeam.getSelectedRow());
//            if (ctlTeam.deleteProcedureTeamMember(member)) {
//                selectTeam();
//            } else {
//                JOptionPane.showMessageDialog(null,
//                        "Unable to Save Data, Kindly Contact Support Team");
//            }
//        }
    }//GEN-LAST:event_tblOTTeamMouseClicked

    private void tblOTTeamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTTeamMousePressed

    }//GEN-LAST:event_tblOTTeamMousePressed

    private void tblOTTeamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTTeamMouseReleased

    }//GEN-LAST:event_tblOTTeamMouseReleased

    private void tblOTTeamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOTTeamKeyReleased

    }//GEN-LAST:event_tblOTTeamKeyReleased

    private void txtSelectTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectTeamActionPerformed
        // TODO add your handling code here:

//        String query = " SELECT MP.ID, MP.DESCRIPTION                   \n"
//                + " FROM  " + Database.DCMS.medicinePackage + " MP      \n"
//                + " WHERE MP.ACTION_ID = " + Actions.OTTeamSetup + "    \n"
//                + " AND ACTIVE = 'Y' \n";
//
//        lov.LOVSelection(query, this);
//        if (!Constants.lovID.equalsIgnoreCase("ID")) {
//            teamId = Constants.lovID;
//            txtSelectTeam.setText(Constants.lovDescription);
//            if (ctlTeam.selectTeamMembers(teamId, cardiacSurgeryId)) {
//                selectTeam();
//                txtActionType.requestFocus();
//            } else {
//                JOptionPane.showMessageDialog(null, "Unable to Select Team Members, "
//                        + "Kindly Contact Administrator");
//            }
//        }

    }//GEN-LAST:event_txtSelectTeamActionPerformed

    private void btnManageTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTeamActionPerformed

//        CardiacTeamSetup fm = new CardiacTeamSetup();
//        DCMS_MDI.desktopPane.add(fm);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = fm.getSize();
//        fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        fm.setVisible(true);

    }//GEN-LAST:event_btnManageTeamActionPerformed

    private void txtActionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionTypeActionPerformed
        // TODO add your handling code here:

//        String query = " SELECT  ID,  DESCRIPTION\n"
//                + " FROM  " + Database.DCMS.definitionTypeDetail + "\n"
//                + " WHERE DEF_TYPE_ID = "
//                + DefinitionTypes.OTTeamActions + "\n"
//                + " AND  ID NOT IN (SELECT OTP.ACTION_ID FROM      \n"
//                + Database.DCMS.cardiacProcedureTeam + " OTP "
//                + " WHERE OTP.CARDIAC_ID = " + cardiacSurgeryId + ")";
//
//        lov.LOVSelection(query, this);
//        if (!Constants.lovID.equalsIgnoreCase("ID")) {
//            actionId = Constants.lovID;
//            actionDescription = Constants.lovDescription;
//            txtActionType.setText(actionDescription);
//            txtActionBy.requestFocus();
//        }

    }//GEN-LAST:event_txtActionTypeActionPerformed

    private void txtActionByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionByActionPerformed
        // TODO add your handl ing code here:
//        if (actionId.trim().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Action First");
//            txtActionType.requestFocus();
//            return;
//        }
//        String query = " SELECT ID,  DESCRIPTION FROM \n"
//                + Database.DCMS.definitionTypeDetail
//                + " WHERE ID NOT IN (SELECT OTP.USER_ID FROM\n"
//                + Database.DCMS.cardiacProcedureTeam + " OTP "
//                + " WHERE OTP.CARDIAC_ID = " + cardiacSurgeryId + ")"
//                + " AND DEF_TYPE_ID =" + DefinitionTypes.cardiacPhysician + "\n"
//                + " AND ACTIVE = 'Y' "
//                + " AND DESCRIPTION LIKE '%"
//                + txtActionBy.getText().toUpperCase() + "%' ";
//
//        lov.LOVSelection(query, this);
//        if (!Constants.lovID.equalsIgnoreCase("ID")) {
//            CardiacSurgeryTeam team = new CardiacSurgeryTeam();
//            team.setUserId(Constants.lovID);
//            team.setUserName(Constants.lovDescription);
//            team.setActionId(actionId);
//            team.setActionDescription(actionDescription);
//            team.setTeamId(teamId);
//            team.setCardiacId(cardiacSurgeryId);
//            if (ctlTeam.insertAction(team)) {
//                actionId = "";
//                actionDescription = "";
//                txtActionType.setText("");
//                selectTeam();
//            } else {
//                JOptionPane.showMessageDialog(null, "Unable to Save Data Kindly Contact Administrator");
//            }
//
//        }
    }//GEN-LAST:event_txtActionByActionPerformed

    private void txtLVEDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLVEDPActionPerformed
        // TODO add your handling code here:
        txtPAPS.requestFocus();
    }//GEN-LAST:event_txtLVEDPActionPerformed

    private void txtPAPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAPSActionPerformed
        // TODO add your handling code here:
        txtPAPD.requestFocus();
    }//GEN-LAST:event_txtPAPSActionPerformed

    private void txtPAPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAPDActionPerformed
        // TODO add your handling code here:
        txtPAWP.requestFocus();
    }//GEN-LAST:event_txtPAPDActionPerformed

    private void txtPAWPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAWPActionPerformed
        // TODO add your handling code here:
        txtanterobasal.requestFocus();
    }//GEN-LAST:event_txtPAWPActionPerformed

    private void txtanterobasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanterobasalActionPerformed
        // TODO add your handling code here:
        txtanterolateral.requestFocus();
    }//GEN-LAST:event_txtanterobasalActionPerformed

    private void txtanterolateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanterolateralActionPerformed
        // TODO add your handling code here:
        txtApical.requestFocus();
    }//GEN-LAST:event_txtanterolateralActionPerformed

    private void txtApicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApicalActionPerformed
        // TODO add your handling code here:
        txtDiaphragmatic.requestFocus();
    }//GEN-LAST:event_txtApicalActionPerformed

    private void txtDiaphragmaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaphragmaticActionPerformed
        // TODO add your handling code here:
        txtPosterobasal.requestFocus();
    }//GEN-LAST:event_txtDiaphragmaticActionPerformed

    private void txtPosterobasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosterobasalActionPerformed
        // TODO add your handling code here
        txtRemarks.requestFocus();
    }//GEN-LAST:event_txtPosterobasalActionPerformed

    private void ChkCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkCSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkCSSActionPerformed

    private void txtMedDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedDurationActionPerformed
        // TODO add your handling code here:
        if (txtMedDuration.getText().trim().length() == 0) {
            return;
        }
        setMedicineStartDate();
        cboMonthsDays.requestFocus();
    }//GEN-LAST:event_txtMedDurationActionPerformed

    private void txtTicketNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketNoActionPerformed

    }//GEN-LAST:event_txtTicketNoActionPerformed

    private void txtReqBySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReqBySearchActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqBySearchActionPerformed

    private void txtSearchByTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByTypeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByTypeActionPerformed

    private void txtEnteredByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnteredByActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnteredByActionPerformed

    private void cboMonthsDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMonthsDaysActionPerformed
        // TODO add your handling code here:
        if (txtMedDuration.getText().trim().length() == 0) {
            return;
        }
        setMedicineStartDate();
    }//GEN-LAST:event_cboMonthsDaysActionPerformed

    private void btnSaveCathDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCathDataActionPerformed
        // TODO add your handling code here:
        if (cboProcType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Procedure Type.");
            cboProcType.requestFocus();
        }
        listProcedure = ctlProcedure.selectCardiacProcedureDetail(actionId);
        setProecedureDetail();
        if (ctlProcedure.insertcardiacProcedureDetail(objProcedure)) {
            JOptionPane.showMessageDialog(null, "Record Save Successsfully.");
            selectProcedureDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record.");
        }
    }//GEN-LAST:event_btnSaveCathDataActionPerformed

    private void btnSaveEchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEchoActionPerformed
        // TODO add your handling code here:
        saveEchocardiographyMaster(Status.entered);
    }//GEN-LAST:event_btnSaveEchoActionPerformed

    private void cboEjectionFractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEjectionFractionActionPerformed
        // TODO add your handling code here:
        cboLeftDisease.requestFocus();
    }//GEN-LAST:event_cboEjectionFractionActionPerformed

    private void cboLeftDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLeftDiseaseActionPerformed
        // TODO add your handling code here:
        cboDiseaseExtent.requestFocus();
    }//GEN-LAST:event_cboLeftDiseaseActionPerformed

    private void cboDiseaseExtentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiseaseExtentActionPerformed
        // TODO add your handling code here:
        txtLVEDP.requestFocus();
    }//GEN-LAST:event_cboDiseaseExtentActionPerformed

    private void btnSaveCathData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCathData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCathData1ActionPerformed

    private void btnSaveCathData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCathData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCathData2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkCSS;
    private javax.swing.JButton btnAddProceInst;
    private javax.swing.JButton btnAddProcePerforming2;
    private javax.swing.JButton btnAddProcedureName;
    private javax.swing.JButton btnAddProcedureName1;
    private javax.swing.JButton btnAddProcedureName2;
    private javax.swing.JButton btnManageTeam;
    private javax.swing.JButton btnSaveCathData;
    private javax.swing.JButton btnSaveCathData1;
    private javax.swing.JButton btnSaveCathData2;
    private javax.swing.JButton btnSaveEcho;
    private javax.swing.JComboBox<String> cboDiseaseExtent;
    private javax.swing.JComboBox<String> cboEjectionFraction;
    private javax.swing.JComboBox<String> cboLeftDisease;
    private javax.swing.JComboBox<String> cboMonthsDays;
    private javax.swing.JComboBox<String> cboProcType;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEchoValve;
    private javax.swing.JTable tblEchoValveMeasurement;
    private javax.swing.JTable tblEchocardiographyMaster;
    private javax.swing.JTable tblExamDetail;
    private javax.swing.JTable tblOTTeam;
    private javax.swing.JTable tblPreMedications;
    private javax.swing.JTable tblProcedureDetail;
    private javax.swing.JTextField txtActionBy;
    private javax.swing.JTextField txtActionType;
    private javax.swing.JTextField txtApical;
    private javax.swing.JTextField txtDiaphragmatic;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtEchoInstitue;
    private org.jdesktop.swingx.JXDatePicker txtEchoPerformDate;
    private javax.swing.JTextField txtEchoPerforming;
    private javax.swing.JTextField txtEnteredBy;
    private javax.swing.JTextField txtLVEDP;
    private javax.swing.JTextField txtMedDuration;
    private javax.swing.JTextField txtMedication;
    private javax.swing.JTextField txtPAPD;
    private javax.swing.JTextField txtPAPS;
    private javax.swing.JTextField txtPAWP;
    private org.jdesktop.swingx.JXDatePicker txtPerformDate;
    private javax.swing.JTextField txtPosterobasal;
    private javax.swing.JTextField txtProcedureInstitute;
    private javax.swing.JTextField txtProcedureName;
    private javax.swing.JTextField txtProcedurePerforming;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtReqBySearch;
    private javax.swing.JTextField txtSearchByType;
    private javax.swing.JTextField txtSelectTeam;
    private javax.swing.JTextField txtTicketNo;
    private org.jdesktop.swingx.JXDatePicker txtTimePeriod;
    private javax.swing.JTextField txtanterobasal;
    private javax.swing.JTextField txtanterolateral;
    // End of variables declaration//GEN-END:variables

    private void setExamDetail() {
        listExamDetail = ctlDiagnostic.selectExamDetail(cardiacSurgeryId);
        if (listExamDetail.isEmpty()) {
            List<CardiacSurgeryBO> list = new ArrayList<>();
            list.add(new CardiacSurgeryBO());
            tblExamDetail.setModel(new ExamDetailTableModel(list));
            return;
        }
        tblExamDetail.setModel(new ExamDetailTableModel(listExamDetail));
        ListSelectionModel selectionModel = tblExamDetail.getSelectionModel();
        tblExamDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setExamDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblExamDetail);
    }

    private void setExamDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblExamDetail.getColumnCount(); i++) {
            column = tblExamDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(180);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setProecedureDetail() {
        objProcedure.setCardiacRegistryId(cardiacSurgeryId);
        objProcedure.setProcedureType(cboProcType.getSelectedItem().toString());
        objProcedure.setInstituteId(procedureInstId);
        objProcedure.setPerformingPhysicianId(procedurePerformingId);
        objProcedure.setDateOfProcedure(performDate);
        objProcedure.setProcedureId(surgProcedureId);
        objProcedure.setEjectionFraction(cboEjectionFraction.getSelectedItem().toString());
        objProcedure.setLeftMainDisease(cboLeftDisease.getSelectedItem().toString());
        objProcedure.setExtentofDisease(cboDiseaseExtent.getSelectedItem().toString());
        objProcedure.setLVEDP(txtLVEDP.getText().trim());
        objProcedure.setPAPS(txtPAPS.getText().trim());
        objProcedure.setPAPD(txtPAPD.getText().trim());
        objProcedure.setPAWP(txtPAWP.getText().trim());
        objProcedure.setAnterobasal(txtanterobasal.getText().trim());
        objProcedure.setAnterolateral(txtanterolateral.getText().trim());
        objProcedure.setApical(txtApical.getText().trim());
        objProcedure.setDiaphragmatic(txtDiaphragmatic.getText().trim());
        objProcedure.setPosterobasal(txtPosterobasal.getText().trim());
        objProcedure.setProcedureRemarks(txtRemarks.getText().trim().replaceAll(",", " "));
        objProcedure.setCSSPerformed("N");
        if (ChkCSS.isSelected()) {
            objProcedure.setCSSPerformed("Y");
        }
    }

    private void selectProcedureDetail() {
        listProcedure = ctlProcedure.selectCardiacProcedureDetail(cardiacSurgeryId);
        if (listProcedure.isEmpty()) {
            List<CardiacRegistryCathProcedure> listProcedure = new ArrayList<>();
            listProcedure.add(new CardiacRegistryCathProcedure());
            tblProcedureDetail.setModel(new ProcedureDetailTableModel(listProcedure));
            return;
        }
        tblProcedureDetail.setModel(new ProcedureDetailTableModel(listProcedure));
        ListSelectionModel selectionModel = tblProcedureDetail.getSelectionModel();
        tblProcedureDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setProcedureDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblProcedureDetail);
    }

    private void setProcedureDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblProcedureDetail.getColumnCount(); i++) {
            column = tblProcedureDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(160);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(120);
            } else if (i == 5) {
                column.setPreferredWidth(40);
            }
        }
    }

    private void setDateOfProcedure(int day) {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtPerformDate.setDate(date2);
            performDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setTmePeriod(int day) {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtTimePeriod.setDate(date2);
            timePeroid = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private List<CardiacSurgeryTeam> listTeamMembers = new ArrayList<>();

//    private void selectTeam() {
//
//        listTeamMembers = ctlTeam.selectProcedureTeamMember(cardiacSurgeryId);
//        if (listTeamMembers.isEmpty()) {
//            CardiacSurgeryTeam team = new CardiacSurgeryTeam();
//            List<CardiacSurgeryTeam> list = new ArrayList();
//            list.add(team);
//            tblOTTeam.setModel(new CardiacOTTeamTableModel(list));
//        } else {
//            tblOTTeam.setModel(new CardiacOTTeamTableModel(listTeamMembers));
//        }
//        ListSelectionModel selectionModel = tblOTTeam.getSelectionModel();
//        tblOTTeam.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblOTTeam);
//        setColumnsWidthsMemberList();
//
//    }
//    private void setColumnsWidthsMemberList() {
//
//        TableColumn column = null;
//        for (int i = 0; i < tblOTTeam.getColumnCount(); i++) {
//            column = tblOTTeam.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(5);
//            } else if (i == 1) {
//                column.setPreferredWidth(120);
//            } else if (i == 1) {
//                column.setPreferredWidth(150);
//            }
//        }
//    }
    private void setMedicineStartDate() {

        int duration;
        try {
            duration = Integer.parseInt(txtMedDuration.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Duration");
            txtMedDuration.requestFocus();
            return;
        }
        if (duration <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Duration");
            txtMedDuration.requestFocus();
            return;
        }
        if (cboMonthsDays.getSelectedIndex() == 0) {
            duration = duration * 365;
        }
        if (cboMonthsDays.getSelectedIndex() == 1) {
            duration = duration * 30;
        }
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, -duration);
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            Date date = sdf.parse(sdf.format(c.getTime()));
            txtTimePeriod.setDate(date);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Duration");
            txtMedDuration.requestFocus();

        }

    }

    private void sevePreMedication() {
        objMedication.setPatientId(patientId);
        objMedication.setCardiacRegistryId(cardiacSurgeryId);
        objMedication.setMedicineId(medId);
        objMedication.setDoseId(doseId);
        objMedication.setTimeTaking(timePeroid);
        objMedication.setMedicineDuration(txtMedDuration.getText().trim());
        objMedication.setMedicineMonthDays(cboMonthsDays.getSelectedItem().toString());
        objMedication.setActionId("1"); //Pre Medication

        if (ctlMed.insertMedications(objMedication)) {
            JOptionPane.showMessageDialog(null, "Medication Save Successfully.");
            clearMedication();
            selectPreMedications();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Medication.\n"
                    + "Kindly contact Administrator.");
        }
    }

    private void selectPreMedications() {
        listMedication = ctlMed.selectMedications(cardiacSurgeryId);
        if (listMedication.isEmpty()) {
            List<CardiacRegistryMedication> listPreMedication = new ArrayList<>();
            listPreMedication.add(new CardiacRegistryMedication());
            tblPreMedications.setModel(new PreMedicationsTableModel(listPreMedication));
            return;
        }
        tblPreMedications.setModel(new PreMedicationsTableModel(listMedication));
        ListSelectionModel selectionModel = tblPreMedications.getSelectionModel();
        tblPreMedications.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPreMedicationsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPreMedications);
    }

    private void setPreMedicationsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPreMedications.getColumnCount(); i++) {
            column = tblPreMedications.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(180);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void saveEchocardiographyMaster(String status) {
        objEchocardiography.setCardiacRegistryId(cardiacSurgeryId);
        objEchocardiography.setEchoPerformDate(echoPerDate);
        objEchocardiography.setPerformingPhysicianId(echoPerformingId);
        objEchocardiography.setInstituteId(echoInstId);
        objEchocardiography.setOrderStatusId(status);
        if (ctlEcho.insertEchocrdiographyMaster(objEchocardiography)) {
            JOptionPane.showMessageDialog(null, "Record Save Successfully.");
            clearEchocardiography();
            selectEchocardiographyMaster();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Information.\n"
                    + "Kindly contact information");
        }
    }

    private void selectEchocardiographyMaster() {
        listEchocardiographyMaster = ctlEcho.selectEchocardiographyMaster(
                cardiacSurgeryId);
        if (listEchocardiographyMaster.isEmpty()) {
            List<CardiacRegistryECHO> listEchocardiographyMaster = new ArrayList<>();
            listEchocardiographyMaster.add(new CardiacRegistryECHO());
            tblEchocardiographyMaster.setModel(new EchocardiographyMasterTableModel(
                    listEchocardiographyMaster));
            return;
        }
        tblEchocardiographyMaster.setModel(new EchocardiographyMasterTableModel(
                listEchocardiographyMaster));
        ListSelectionModel selectionModel = tblEchocardiographyMaster.getSelectionModel();
        tblEchocardiographyMaster.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setEchocardiographyMasterColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblEchocardiographyMaster);
        CardiacRegistryECHO obj = listEchocardiographyMaster.get(0);
        echoId = obj.getEchoId();
        selectEchoValve();
        selectEchoValveMeasurement();
    }

    private void setEchocardiographyMasterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblEchocardiographyMaster.getColumnCount(); i++) {
            column = tblEchocardiographyMaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(60);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void selectEchoValve() {
        listEchoValve = ctlEcho.selectEchoValve(echoId);
        if (listEchoValve.isEmpty()) {
            List<CardiacRegistryECHO> listEchoValve = new ArrayList<>();
            listEchoValve.add(new CardiacRegistryECHO());
            tblEchoValve.setModel(new EchoValveTableModel(listEchoValve));
            return;
        }
        tblEchoValve.setModel(new EchoValveTableModel(listEchoValve));
        ListSelectionModel selectionModel = tblEchoValve.getSelectionModel();
        tblEchoValve.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setEchoValveColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblEchoValve);
    }

    private void setEchoValveColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblEchoValve.getColumnCount(); i++) {
            column = tblEchoValve.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(60);
            } else if (i == 1) {
                column.setPreferredWidth(40);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(40);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void selectEchoValveMeasurement() {
        listEchoValveMeasurement = ctlEcho.selectEchoValveMeasurement(echoId);
        if (listEchoValveMeasurement.isEmpty()) {
            List<CardiacRegistryECHO> listEchoValveMeasurement = new ArrayList<>();
            listEchoValveMeasurement.add(new CardiacRegistryECHO());
            tblEchoValveMeasurement.setModel(new EchoValveMeasurementTableModel(listEchoValveMeasurement));
            return;
        }
        tblEchoValveMeasurement.setModel(new EchoValveMeasurementTableModel(listEchoValveMeasurement));
        ListSelectionModel selectionModel = tblEchoValveMeasurement.getSelectionModel();
        tblEchoValveMeasurement.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setEchoValveMeasurement();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblEchoValveMeasurement);
    }

    private void setEchoValveMeasurement() {
        TableColumn column = null;
        for (int i = 0; i < tblEchoValveMeasurement.getColumnCount(); i++) {
            column = tblEchoValveMeasurement.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(120);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void clearMedication() {
        txtMedication.setText("");
        txtDose.setText("");
        txtMedDuration.setText("");
        cboMonthsDays.setSelectedIndex(0);
    }

    private void clearEchocardiography() {
        txtEchoInstitue.setText("");
        txtEchoPerforming.setText("");
        setEchocardiography(0);
    }

    private void setEchocardiography(int day) {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtEchoPerformDate.setDate(date2);
            echoPerDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
