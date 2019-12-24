package CardiacRegistry.Form;

import CardiacRegistry.BO.CardiacSurgeryBO;
import CardiacRegistry.Controller.CardiacSurgeryController;
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

public class CardiacSurgeryDetailFormRaheel extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    CardiacSurgeryBO objEchocardiography = new CardiacSurgeryBO();
    CardiacSurgeryBO objCardiacSurger = new CardiacSurgeryBO();
    CardiacSurgeryBO objProcedure = new CardiacSurgeryBO();
    CardiacSurgeryBO objPreMedication = new CardiacSurgeryBO();
    CardiacSurgeryController ctlCardiacSurg = new CardiacSurgeryController();

    List<CardiacSurgeryBO> listEchocardiographyMaster = new ArrayList();
    List<CardiacSurgeryBO> listEchoValve = new ArrayList();
    List<CardiacSurgeryBO> listEchoValveMeasurement = new ArrayList();
    List<CardiacSurgeryBO> listExamDetail = new ArrayList();
    List<CardiacSurgeryBO> listProcedure = new ArrayList();
    List<CardiacSurgeryBO> listPreMedication = new ArrayList();

    private String echoId = "";
    private String cardiacId = "";
    private String performDate;
    private String surgProcedureId;
    private String procedureInstId;
    private String procedurePerformingId;
    private String procedureType = "";
    private String medId;
    private String doseId;
    private String timePeroid;
    private String echoPerDate;
    private String echoInstId;
    private String echoPerformingId;

    public CardiacSurgeryDetailFormRaheel(String id) {

        initComponents();
        this.setSize(Constants.xSize + 80, Constants.ySize - Constants.yExtension + 8);
        this.cardiacId = id;
        setExamDetail();
        setDateOfProcedure(0);
        selectProcedureDetail();
        setTmePeriod(0);
        setEchocardiography(0);
        selectPreMedications();
        selectEchocardiographyMaster();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblExamDetail = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProcedureDetail = new javax.swing.JTable();
        cboProcType = new javax.swing.JComboBox<>();
        txtProcedureName = new javax.swing.JTextField();
        txtPerformDate = new org.jdesktop.swingx.JXDatePicker();
        txtProcedureInstitute = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnAddProceInst = new javax.swing.JButton();
        btnAddProcedureName = new javax.swing.JButton();
        txtProcedurePerforming = new javax.swing.JTextField();
        btnAddProcePerforming = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPreMedications = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txtMedication = new javax.swing.JTextField();
        btnAddProcePerforming2 = new javax.swing.JButton();
        txtDose = new javax.swing.JTextField();
        txtTimePeriod = new org.jdesktop.swingx.JXDatePicker();
        jLabel27 = new javax.swing.JLabel();
        btnUpdtMed = new javax.swing.JButton();
        btnSaveMed = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
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
        btnFinalEcho = new javax.swing.JButton();
        btnSaveEcho = new javax.swing.JButton();
        btnEditEcho = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEchoValveMeasurement = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblEchoValve = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1080, 770));
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
                .addGap(21, 21, 21)
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiology Surgery Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exam Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblExamDetail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

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

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Perform Date : ");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Procedure : ");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Institute : ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Performing : ");

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

        btnAddProcePerforming.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddProcePerforming.setText("+");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboProcType, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedureName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddProcedureName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerformDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedureInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddProceInst, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedurePerforming)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddProcePerforming, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProcType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcedureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerformDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProcedureName))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcedureInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProceInst)
                    .addComponent(txtProcedurePerforming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProcePerforming)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cureent Pre-Oper. Medication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
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

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Medication : ");

        txtMedication.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicationActionPerformed(evt);
            }
        });

        btnAddProcePerforming2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Dose : ");

        btnUpdtMed.setText("Edit");
        btnUpdtMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdtMedActionPerformed(evt);
            }
        });

        btnSaveMed.setText("Save");
        btnSaveMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMedActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Time Taking : ");

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("+");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddProcePerforming2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtTimePeriod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdtMed, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveMed, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(5, 5, 5))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProcePerforming2))
                .addGap(2, 2, 2)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimePeriod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveMed)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdtMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cardiac Detail", jPanel5);

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Cath. Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
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

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Physician : ");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Date : ");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        btnFinalEcho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinalEcho.setForeground(new java.awt.Color(0, 153, 0));
        btnFinalEcho.setText("Final");
        btnFinalEcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalEchoActionPerformed(evt);
            }
        });

        btnSaveEcho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveEcho.setText("Save");
        btnSaveEcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEchoActionPerformed(evt);
            }
        });

        btnEditEcho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditEcho.setText("Edit");
        btnEditEcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEchoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtEchoPerformDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEchoInstitue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEchoPerforming))))
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditEcho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveEcho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalEcho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEchoPerformDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEchoInstitue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEchoPerforming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalEcho)
                    .addComponent(btnSaveEcho)
                    .addComponent(btnEditEcho))
                .addGap(3, 3, 3))
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
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("History", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 204, 102));
        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            objCardiacSurger.setCardiacRegistryId(cardiacId);
            if (ctlCardiacSurg.updateExamDetail(objCardiacSurger)) {
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
        objCardiacSurger = listExamDetail.get(tblExamDetail.getSelectedRow());
        objCardiacSurger.setExamRemarks(String.valueOf(tblExamDetail.getValueAt(
                tblExamDetail.getSelectedRow(), 3)).trim());
        objCardiacSurger.setCardiacRegistryId(cardiacId);
        if (ctlCardiacSurg.updateExamDetailRemarks(objCardiacSurger)) {
            System.out.println("Remarks Save Successfully.");
            setExamDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Remarks.");
        }
    }//GEN-LAST:event_tblExamDetailKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (cboProcType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Procedure Type.");
            cboProcType.requestFocus();
        }
        setProecedureDetail();
        if (ctlCardiacSurg.insertcardiacProcedureDetail(objProcedure)) {
            JOptionPane.showMessageDialog(null, "Record Save Successsfully.");
            selectProcedureDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record.");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblProcedureDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcedureDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProcedureDetailMouseClicked

    private void tblProcedureDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcedureDetailMouseReleased
        // TODO add your handling code here:
        objProcedure = listProcedure.get(tblProcedureDetail.getSelectedRow());
        if (evt.getClickCount() % 2 == 0) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to Cancel?");
            if (confirmation != 0) {
                return;
            }
            if (ctlCardiacSurg.deleteProcedure(objProcedure)) {
                JOptionPane.showMessageDialog(null, "Record Cancel Successsfully.");
                selectProcedureDetail();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Cancel Record.");
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
        lov.LOVDefinitionSelection(procedureType, txtProcedureName.getText().trim(), this);
        surgProcedureId = Constants.lovID;
        txtProcedureName.setText(Constants.lovDescription);
        txtPerformDate.requestFocus();
    }//GEN-LAST:event_txtProcedureNameActionPerformed

    private void txtProcedureInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcedureInstituteActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacInstitutes, txtProcedureInstitute.getText().trim(), this);
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
    }//GEN-LAST:event_txtProcedurePerformingActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        setProecedureDetail();
        if (ctlCardiacSurg.updateCardiacProcedureDetail(objProcedure)) {
            JOptionPane.showMessageDialog(null, "Record Update Successsfully.");
            selectProcedureDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update Record.");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblEchoValveMeasurementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchoValveMeasurementMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchoValveMeasurementMouseClicked

    private void tblEchoValveMeasurementMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchoValveMeasurementMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchoValveMeasurementMouseReleased

    private void tblEchoValveMeasurementKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEchoValveMeasurementKeyReleased
        // TODO add your handling code here:
        CardiacSurgeryBO objMea = listEchoValveMeasurement.get(
                tblEchoValveMeasurement.getSelectedRow());
        objMea.setValue(tblEchoValveMeasurement.getValueAt(
                tblEchoValveMeasurement.getSelectedRow(), 1).toString());
        if (ctlCardiacSurg.updateEchoMeasurement(objMea)) {
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
        CardiacSurgeryBO obj = listPreMedication.get(tblPreMedications.getSelectedRow());
        txtDose.setText(obj.getDoseDesc());
        txtMedication.setText(obj.getMedicineDesc());
        medId = obj.getMedicineId();
        doseId = obj.getDoseId();
        setTmePeriod(Integer.parseInt(obj.getDayTimeTaking()));
    }//GEN-LAST:event_tblPreMedicationsMouseReleased

    private void tblPreMedicationsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPreMedicationsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreMedicationsKeyReleased

    private void txtTimePeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimePeriodActionPerformed
        // TODO add your handling code here:
        if (txtPerformDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Select the Time Period DD-MON-YY",
                    "Pre Medication", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        timePeroid = dateFormat.format(txtPerformDate.getDate());
        txtTimePeriod.requestFocus();
        sevePreMedication();
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
        txtEchoInstitue.requestFocus();
    }//GEN-LAST:event_txtEchoPerformDateActionPerformed

    private void tblEchocardiographyMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchocardiographyMasterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEchocardiographyMasterMouseClicked

    private void tblEchocardiographyMasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEchocardiographyMasterMouseReleased
        // TODO add your handling code here:
        CardiacSurgeryBO objEcm = listEchocardiographyMaster.get(
                tblEchocardiographyMaster.getSelectedRow());
        txtEchoInstitue.setText(objEcm.getInstituteDescription());
        txtEchoPerforming.setText(objEcm.getPerformingPhysicianName());
        echoInstId = objEcm.getInstituteId();
        echoPerformingId = objEcm.getPerformingPhysicianId();
        setEchocardiography(Integer.parseInt(objEcm.getEchoPerformDay()));
        echoId = objEcm.getEchoId();
        btnFinalEcho.setEnabled(true);
        btnEditEcho.setEnabled(true);
        if (objEcm.getOrderStatusId().equalsIgnoreCase(Status.verified)) {
            btnFinalEcho.setEnabled(false);
            btnEditEcho.setEnabled(false);
        }
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
        CardiacSurgeryBO objValve = listEchoValve.get(tblEchoValve.getSelectedRow());
        objValve.setColumnName(String.valueOf(col));
        objValve.setValue(tblEchoValve.getValueAt(tblEchoValve.getSelectedRow(), col).toString());
        if (ctlCardiacSurg.updateEchoValve(objValve)) {
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
    }//GEN-LAST:event_txtEchoPerformingActionPerformed

    private void txtDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.doseQuantity, txtDose.getText().trim(), this);
        doseId = Constants.lovID;
        txtDose.setText(Constants.lovDescription);
        txtTimePeriod.requestFocus();
    }//GEN-LAST:event_txtDoseActionPerformed

    private void btnSaveMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMedActionPerformed
        // TODO add your handling code here:.
        sevePreMedication();
    }//GEN-LAST:event_btnSaveMedActionPerformed

    private void btnUpdtMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdtMedActionPerformed
        // TODO add your handling code here:
        objPreMedication.setCardiacRegistryId(cardiacId);
        objPreMedication.setMedicineId(medId);
        objPreMedication.setDoseId(doseId);
        objPreMedication.setTimeTaking(timePeroid);
        if (ctlCardiacSurg.updatePreMedications("")) {
            JOptionPane.showMessageDialog(null, "Medicine Info updated Successfuly.");
            selectPreMedications();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to update Medication.\n"
                    + "Kindly contact Administrator.");
        }
    }//GEN-LAST:event_btnUpdtMedActionPerformed

    private void btnSaveEchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEchoActionPerformed
        // TODO add your handling code here:
        saveEchocardiographyMaster(Status.entered);
    }//GEN-LAST:event_btnSaveEchoActionPerformed

    private void btnFinalEchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalEchoActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final.\nDo you want to Final?");
        if (confirmation != 0) {
            return;
        }
        objCardiacSurger.setCardiacRegistryId(cardiacId);
        objCardiacSurger.setEchoId(echoId);
        if (ctlCardiacSurg.finalEchoCardiography(objCardiacSurger)) {
            selectEchocardiographyMaster();
            JOptionPane.showMessageDialog(null, "Record Final Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Final. Contact Support person.");
        }
    }//GEN-LAST:event_btnFinalEchoActionPerformed

    private void btnEditEchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEchoActionPerformed
        // TODO add your handling code here:
        objEchocardiography.setEchoPerformDate(echoPerDate);
        objEchocardiography.setPerformingPhysicianId(echoPerformingId);
        objEchocardiography.setInstituteId(echoInstId);
        if (ctlCardiacSurg.updateEchoCardiographyMaster(objCardiacSurger)) {
            selectEchocardiographyMaster();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Edit the Information");
        }
    }//GEN-LAST:event_btnEditEchoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddProceInst;
    private javax.swing.JButton btnAddProcePerforming;
    private javax.swing.JButton btnAddProcePerforming2;
    private javax.swing.JButton btnAddProcedureName;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditEcho;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinalEcho;
    private javax.swing.JButton btnSaveEcho;
    private javax.swing.JButton btnSaveMed;
    private javax.swing.JButton btnUpdtMed;
    private javax.swing.JComboBox<String> cboProcType;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblEchoValve;
    private javax.swing.JTable tblEchoValveMeasurement;
    private javax.swing.JTable tblEchocardiographyMaster;
    private javax.swing.JTable tblExamDetail;
    private javax.swing.JTable tblPreMedications;
    private javax.swing.JTable tblProcedureDetail;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtEchoInstitue;
    private org.jdesktop.swingx.JXDatePicker txtEchoPerformDate;
    private javax.swing.JTextField txtEchoPerforming;
    private javax.swing.JTextField txtMedication;
    private org.jdesktop.swingx.JXDatePicker txtPerformDate;
    private javax.swing.JTextField txtProcedureInstitute;
    private javax.swing.JTextField txtProcedureName;
    private javax.swing.JTextField txtProcedurePerforming;
    private org.jdesktop.swingx.JXDatePicker txtTimePeriod;
    // End of variables declaration//GEN-END:variables

    private void setExamDetail() {
        listExamDetail = ctlCardiacSurg.selectExamDetail(cardiacId);
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
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(180);
            }
        }
    }

    private void setProecedureDetail() {
        objProcedure.setCardiacRegistryId(cardiacId);
        objProcedure.setProcedureType(cboProcType.getSelectedItem().toString());
        objProcedure.setInstituteId(procedureInstId);
        objProcedure.setPerformingPhysicianId(procedurePerformingId);
        objProcedure.setDateOfProcedure(performDate);
        objProcedure.setProcedureId(surgProcedureId);
    }

    private void selectProcedureDetail() {
        listProcedure = ctlCardiacSurg.selectCardiacProcedureDetail(cardiacId);
        if (listProcedure.isEmpty()) {
            List<CardiacSurgeryBO> listProcedure = new ArrayList<>();
            listProcedure.add(new CardiacSurgeryBO());
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
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(160);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            } else if (i == 4) {
                column.setPreferredWidth(120);
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

    private void sevePreMedication() {
        objPreMedication.setCardiacRegistryId(cardiacId);
        objPreMedication.setMedicineId(medId);
        objPreMedication.setDoseId(doseId);
        objPreMedication.setTimeTaking(timePeroid);
        if (ctlCardiacSurg.insertPreMedications(objPreMedication)) {
            JOptionPane.showMessageDialog(null, "Sve");
            selectPreMedications();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Medication.\n"
                    + "Kindly contact Administrator.");
        }
    }

    private void selectPreMedications() {
        listPreMedication = ctlCardiacSurg.selectPreMedications(cardiacId);
        if (listProcedure.isEmpty()) {
            List<CardiacSurgeryBO> listPreMedication = new ArrayList<>();
            listProcedure.add(new CardiacSurgeryBO());
            tblPreMedications.setModel(new PreMedicationsTableModel(listPreMedication));
            return;
        }
        tblPreMedications.setModel(new PreMedicationsTableModel(listPreMedication));
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

    private void selectEchoValve() {
        listEchoValve = ctlCardiacSurg.selectEchoValve(echoId);
        if (listEchoValve.isEmpty()) {
            List<CardiacSurgeryBO> listEchoValve = new ArrayList<>();
            listEchoValve.add(new CardiacSurgeryBO());
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
        listEchoValveMeasurement = ctlCardiacSurg.selectEchoValveMeasurement(echoId);
        if (listEchoValveMeasurement.isEmpty()) {
            List<CardiacSurgeryBO> listEchoValveMeasurement = new ArrayList<>();
            listEchoValveMeasurement.add(new CardiacSurgeryBO());
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

    private void saveEchocardiographyMaster(String status) {
        objEchocardiography.setCardiacRegistryId(cardiacId);
        objEchocardiography.setEchoPerformDate(echoPerDate);
        objEchocardiography.setPerformingPhysicianId(echoPerformingId);
        objEchocardiography.setInstituteId(echoInstId);
        objEchocardiography.setOrderStatusId(status);
        if (ctlCardiacSurg.insertEchocrdiographyMaster(objEchocardiography)) {
            JOptionPane.showMessageDialog(null, "Record Save Successfully.");
            selectEchocardiographyMaster();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save Information.\n"
                    + "Kindly contact information");
        }
    }

    private void selectEchocardiographyMaster() {
        listEchocardiographyMaster = ctlCardiacSurg.selectEchocardiographyMaster(cardiacId);
        if (listEchocardiographyMaster.isEmpty()) {
            List<CardiacSurgeryBO> listEchocardiographyMaster = new ArrayList<>();
            listEchocardiographyMaster.add(new CardiacSurgeryBO());
            tblEchocardiographyMaster.setModel(new EchocardiographyMasterTableModel(listEchocardiographyMaster));
            return;
        }
        tblEchocardiographyMaster.setModel(new EchocardiographyMasterTableModel(listEchocardiographyMaster));
        ListSelectionModel selectionModel = tblEchocardiographyMaster.getSelectionModel();
        tblEchocardiographyMaster.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setEchocardiographyMasterColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblEchocardiographyMaster);
        btnFinalEcho.setEnabled(true);
        btnEditEcho.setEnabled(true);
        CardiacSurgeryBO obj = listEchocardiographyMaster.get(0);
        if (obj.getOrderStatusId().equalsIgnoreCase(Status.verified)) {
            btnFinalEcho.setEnabled(false);
            btnEditEcho.setEnabled(false);
        }
        echoId = obj.getEchoId();
        selectEchoValve();
        selectEchoValveMeasurement();
    }

    private void setEchocardiographyMasterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblEchocardiographyMaster.getColumnCount(); i++) {
            column = tblEchocardiographyMaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(40);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            }
        }
    }
}
