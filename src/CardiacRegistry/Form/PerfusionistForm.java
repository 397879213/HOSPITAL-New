package CardiacRegistry.Form;

import CardiacRegistry.BO.PerfusionistBO;
import CardiacRegistry.Controller.PerfusionistController;
import CardiacRegistry.TableModel.PerfusionBloodGasesTableModel;
import CardiacRegistry.TableModel.PerfusionCheckListTableModel;
import CardiacRegistry.TableModel.PerfusionGraphTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class PerfusionistForm extends javax.swing.JInternalFrame {

    String cardiacId = "111";
    String patientId = "0012121";
    private String perfusionistId = "";
    private String asstPerfusionistId = "";
    private String operationId = "";
    private String surgeonId = "";
    private String asstSurgeonId = "";
    private String anesthetistId = "";
    private String bloodGroupId = "";

    List<PerfusionistBO> listBG = new ArrayList();
    List<PerfusionistBO> listPerGraph = new ArrayList();
    List<PerfusionistBO> listPerCheckList = new ArrayList();

    public PerfusionistForm() {

        initComponents();
        this.setSize(Constants.xSize - 120, Constants.ySize - 90);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnFinal.setMnemonic(KeyEvent.VK_F);
        btnGraph.setMnemonic(KeyEvent.VK_G);
        selectPerfusionGraph();
        selectPerfusionInfo();
        selectPerfusionCheckList();
        selectBloodGases();
    }

    DisplayLOV lov = new DisplayLOV();
    PerfusionistBO objCheckList = new PerfusionistBO();
    PerfusionistBO objPerfusionGraph = new PerfusionistBO();
    PerfusionistBO perfusionInfo = new PerfusionistBO();
    PerfusionistBO objPerfusionist = new PerfusionistBO();
    PerfusionistController ctlPerfusionist = new PerfusionistController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnGraph = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPerfusionist = new javax.swing.JTextField();
        txtAsstPerfusionist = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHeparinized = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtOperation = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtOxygenator = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCpgSystem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cboRedo = new javax.swing.JComboBox<>();
        cboIabCatheter = new javax.swing.JComboBox<>();
        txtIabCatheterTime = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtSurgeon = new javax.swing.JTextField();
        txtAsstSurgeon = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAnesthetist = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtVenous = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtAntegrade = new javax.swing.JTextField();
        txtAorticCannulae = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtRetrograde = new javax.swing.JTextField();
        txtSumpVent = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtHemofilter = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtConnectors = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtHb = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        txtBloodFlow = new javax.swing.JTextField();
        txtSurArea = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        txtHartmanns = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtHeparin = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtMannitol = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtBloodRbc = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtPulmonary = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtEF = new javax.swing.JTextField();
        txtCreatinine = new javax.swing.JTextField();
        txtUrea = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtMitral = new javax.swing.JTextField();
        txtAortic = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtValve = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtLMS = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtDiabetic = new javax.swing.JTextField();
        txtHBsAntiHcv = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtOtherPer = new javax.swing.JTextField();
        txtAllergies = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        txtSelectDrug = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblDrugs = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblCheckList = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tblTimeManagement = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        txtOnTime = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtOffTime = new javax.swing.JTextField();
        cboTimeManag = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        txtPressure = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jScrollPane30 = new javax.swing.JScrollPane();
        tblGraph = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblBloodGases = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        txtSugar1 = new javax.swing.JTextField();
        txtSugar2 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtSugar3 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtSugar4 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        txtSugar5 = new javax.swing.JTextField();
        txtSugar6 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtSugar7 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txtSugar8 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtSugar9 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        txtSugar10 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        txtSugar13 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txtSugar14 = new javax.swing.JTextField();
        jScrollPane32 = new javax.swing.JScrollPane();
        tblPatientInfo3 = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMemberId1 = new javax.swing.JTextField();
        txtMemberId2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Perfusion Form");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(868, 721));
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

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");

        btnFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnGraph.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGraph.setText("View Graph");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnFinal)
                    .addComponent(btnSave)
                    .addComponent(btnGraph))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Perfusionist : ");

        txtPerfusionist.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPerfusionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfusionistActionPerformed(evt);
            }
        });

        txtAsstPerfusionist.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAsstPerfusionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsstPerfusionistActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Asst. Perfusionist : ");

        txtHeparinized.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHeparinized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeparinizedActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Heparinized@ : ");

        txtOperation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperationActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Operation : ");

        txtOxygenator.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOxygenator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOxygenatorActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Oxygenator : ");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Cpg System : ");

        txtCpgSystem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCpgSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpgSystemActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("IAB Catheter : ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Redo : ");

        cboRedo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N"}));
        cboRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRedoActionPerformed(evt);
            }
        });

        cboIabCatheter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N"}));
        cboIabCatheter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIabCatheterActionPerformed(evt);
            }
        });

        txtIabCatheterTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIabCatheterTimeActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 0, 0));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("Prime : ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPerfusionist)
                    .addComponent(txtAsstPerfusionist)
                    .addComponent(txtOxygenator)
                    .addComponent(txtCpgSystem)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtHeparinized, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cboIabCatheter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIabCatheterTime, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOperation, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerfusionist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsstPerfusionist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeparinized, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOxygenator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpgSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboIabCatheter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIabCatheterTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Surgeon : ");

        txtSurgeon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSurgeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurgeonActionPerformed(evt);
            }
        });

        txtAsstSurgeon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAsstSurgeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsstSurgeonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Assistant : ");

        txtAnesthetist.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAnesthetist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnesthetistActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Anesthetist : ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurgeon, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(txtAsstSurgeon)
                    .addComponent(txtAnesthetist))
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurgeon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsstSurgeon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnesthetist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cannulae", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Venous : ");

        txtVenous.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVenous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenousActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Antegrade : ");

        txtAntegrade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAntegrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAntegradeActionPerformed(evt);
            }
        });

        txtAorticCannulae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAorticCannulae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAorticCannulaeActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Aortic : ");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Retrograde : ");

        txtRetrograde.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRetrograde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetrogradeActionPerformed(evt);
            }
        });

        txtSumpVent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSumpVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumpVentActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Hemofilter : ");

        txtHemofilter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHemofilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHemofilterActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Sump/ Vent : ");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Connectors : ");

        txtConnectors.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtConnectors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConnectorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVenous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHemofilter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(txtAorticCannulae)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRetrograde)
                            .addComponent(txtAntegrade)
                            .addComponent(txtSumpVent)))
                    .addComponent(txtConnectors))
                .addGap(5, 5, 5))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVenous, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAntegrade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAorticCannulae, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetrograde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHemofilter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSumpVent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConnectors, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Height (m) : ");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Weight (kg) : ");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Hb gm/dl : ");

        txtHb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHbActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Blood Group : ");

        txtBloodGroup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });

        txtBloodFlow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBloodFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodFlowActionPerformed(evt);
            }
        });

        txtSurArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSurArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurAreaActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("S. Area (m3) : ");

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("B. Flow (Lmin4) : ");

        txtWeight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        txtHeight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSurArea)
                    .addComponent(txtBloodGroup)
                    .addComponent(txtBloodFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prime", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Hartmanns : ");

        txtHartmanns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHartmanns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHartmannsActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Heparin : ");

        txtHeparin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHeparin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeparinActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Mannitol : ");

        txtMannitol.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMannitol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMannitolActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Blood/ RBC : ");

        txtBloodRbc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBloodRbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodRbcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMannitol)
                    .addComponent(txtBloodRbc)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtHartmanns, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHeparin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHartmanns, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeparin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMannitol, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodRbc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(102, 0, 0));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Aortic : ");

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Mitral : ");

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Pulmonary : ");

        txtPulmonary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPulmonary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulmonaryActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("E. F : ");

        txtEF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEFActionPerformed(evt);
            }
        });

        txtCreatinine.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCreatinine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatinineActionPerformed(evt);
            }
        });

        txtUrea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUreaActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Urea : ");

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Creatinine : ");

        txtMitral.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMitral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMitralActionPerformed(evt);
            }
        });

        txtAortic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAortic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAorticActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Valve : ");

        txtValve.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtValve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValveActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("L. M. S : ");

        txtLMS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLMSActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Diabetic : ");

        jLabel50.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("HBs/Anti Hcv : ");

        txtDiabetic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDiabetic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiabeticActionPerformed(evt);
            }
        });

        txtHBsAntiHcv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHBsAntiHcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHBsAntiHcvActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Other : ");

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Allergies : ");

        txtOtherPer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOtherPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtherPerActionPerformed(evt);
            }
        });

        txtAllergies.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAllergies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAllergies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtDiabetic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValve, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPulmonary, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAortic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMitral, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUrea, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtEF)
                    .addComponent(txtCreatinine)
                    .addComponent(txtLMS)
                    .addComponent(txtHBsAntiHcv)
                    .addComponent(txtOtherPer))
                .addGap(5, 5, 5))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAortic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUrea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMitral, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreatinine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPulmonary, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValve, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLMS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiabetic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHBsAntiHcv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtherPer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfusion", jPanel7);

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(102, 0, 0));

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drugs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel17.setForeground(new java.awt.Color(102, 0, 0));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Drug : ");

        txtSelectDrug.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSelectDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectDrugActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 0, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Dose/ Quantity : ");

        tblDrugs.setBackground(java.awt.SystemColor.activeCaption);
        tblDrugs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Medicine", "Quantity"
            }
        ));
        tblDrugs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDrugsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDrugsMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDrugsMouseReleased(evt);
            }
        });
        tblDrugs.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblDrugsPropertyChange(evt);
            }
        });
        tblDrugs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDrugsKeyReleased(evt);
            }
        });
        jScrollPane26.setViewportView(tblDrugs);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSelectDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(102, 0, 0));

        tblCheckList.setBackground(java.awt.SystemColor.activeCaption);
        tblCheckList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Description", "Y/N"

            }
        ));
        tblCheckList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCheckListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCheckListMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCheckListMouseReleased(evt);
            }
        });
        tblCheckList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblCheckListPropertyChange(evt);
            }
        });
        tblCheckList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCheckListKeyReleased(evt);
            }
        });
        jScrollPane27.setViewportView(tblCheckList);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel22.setForeground(new java.awt.Color(102, 0, 0));

        tblTimeManagement.setBackground(java.awt.SystemColor.activeCaption);
        tblTimeManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ON Time", "OFF Time", "Total Time"
            }
        ));
        tblTimeManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTimeManagementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblTimeManagementMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblTimeManagementMouseReleased(evt);
            }
        });
        tblTimeManagement.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblTimeManagementPropertyChange(evt);
            }
        });
        tblTimeManagement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblTimeManagementKeyReleased(evt);
            }
        });
        jScrollPane29.setViewportView(tblTimeManagement);

        jLabel63.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("ON : ");

        txtOnTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnTimeActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("OFF : ");

        txtOffTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOffTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOffTimeActionPerformed(evt);
            }
        });

        cboTimeManag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bypass Time", "X-Clamp time", "Circ. Arrest Time", "Rewarming Time" }));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboTimeManag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOnTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOnTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTimeManag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perfusionist Graph", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(102, 0, 0));

        jLabel65.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Pressure : ");

        txtPressure.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPressureActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Time (min) : ");

        txtTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        tblGraph.setBackground(java.awt.SystemColor.activeCaption);
        tblGraph.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Grade", "Grade Description", "Child Above 12", "Child Under 12", "Spouse",
                "Parents", "Self", "Class"

            }
        ));
        tblGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGraphMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblGraphMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblGraphMouseReleased(evt);
            }
        });
        tblGraph.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblGraphPropertyChange(evt);
            }
        });
        tblGraph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGraphKeyReleased(evt);
            }
        });
        jScrollPane30.setViewportView(tblGraph);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addGap(4, 4, 4)
                .addComponent(txtPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jScrollPane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Detail Info", jPanel15);

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Gases", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        jPanel21.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Gases Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel21.setForeground(new java.awt.Color(102, 0, 0));

        tblBloodGases.setBackground(java.awt.SystemColor.activeCaption);
        tblBloodGases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Blood Flow", "PH", "B.E", "K+", "Sugar",
                "Temparture", "Fio2", "G Flow"

            }
        ));
        tblBloodGases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBloodGasesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblBloodGasesMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBloodGasesMouseReleased(evt);
            }
        });
        tblBloodGases.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblBloodGasesPropertyChange(evt);
            }
        });
        tblBloodGases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblBloodGasesKeyReleased(evt);
            }
        });
        jScrollPane28.setViewportView(tblBloodGases);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel18.setForeground(new java.awt.Color(102, 0, 0));

        jLabel87.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(102, 0, 0));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Transfusion :");

        txtSugar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar1ActionPerformed(evt);
            }
        });

        txtSugar2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar2ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(102, 0, 0));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("Prime :");

        txtSugar3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar3ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 0, 0));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Blood :");

        txtSugar4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar4ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 0, 0));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("Others :");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSugar3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSugar4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel23.setForeground(new java.awt.Color(102, 0, 0));

        jLabel91.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(102, 0, 0));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("Autologous BC :");

        txtSugar5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar5ActionPerformed(evt);
            }
        });

        txtSugar6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar6ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 0, 0));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Urine Before CPB :");

        jLabel95.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(102, 0, 0));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setText("Urine During CPB :");

        txtSugar7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar7ActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(102, 0, 0));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("Urine After CPB :");

        txtSugar8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar8ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(102, 0, 0));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("MU Filtration :");

        txtSugar9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar9ActionPerformed(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 0, 0));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel98.setText("Hemofilterate :");

        txtSugar10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSugar5, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txtSugar6)
                    .addComponent(txtSugar7))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSugar9, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtSugar10)
                    .addComponent(txtSugar8))
                .addGap(41, 41, 41))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSugar6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSugar7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Blood Gases", jPanel8);

        jPanel20.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(102, 0, 0));

        jPanel26.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel26.setForeground(new java.awt.Color(102, 0, 0));

        jLabel99.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(102, 0, 0));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setText("Medicine :");

        txtSugar13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar13ActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 0, 0));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setText("Dose :");

        txtSugar14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugar14ActionPerformed(evt);
            }
        });

        tblPatientInfo3.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Medicine", "Dose"    }
        ));
        tblPatientInfo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfo3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientInfo3MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientInfo3MouseReleased(evt);
            }
        });
        tblPatientInfo3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientInfo3PropertyChange(evt);
            }
        });
        tblPatientInfo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientInfo3KeyReleased(evt);
            }
        });
        jScrollPane32.setViewportView(tblPatientInfo3);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSugar13, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSugar14)
                .addContainerGap())
            .addComponent(jScrollPane32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prosthesis Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel27.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel28.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel28.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Medication & Notes", jPanel20);

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demography", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id : ");

        txtMemberId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIdActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Full Name : ");

        txtMemberId1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId1ActionPerformed(evt);
            }
        });

        txtMemberId2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIdActionPerformed

    private void txtMemberId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId1ActionPerformed

    private void txtMemberId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId2ActionPerformed

    private void txtPerfusionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfusionistActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtPerfusionist.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtPerfusionist.setText("");
            perfusionistId = "";
        }
        txtPerfusionist.setText(Constants.lovDescription);
        perfusionistId = Constants.lovID;
        txtAsstPerfusionist.requestFocus();
    }//GEN-LAST:event_txtPerfusionistActionPerformed

    private void txtAsstPerfusionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsstPerfusionistActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtAsstPerfusionist.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtAsstPerfusionist.setText("");
            asstPerfusionistId = "";
        }
        txtAsstPerfusionist.setText(Constants.lovDescription);
        asstPerfusionistId = Constants.lovID;
        txtHeparinized.requestFocus();
    }//GEN-LAST:event_txtAsstPerfusionistActionPerformed

    private void txtHeparinizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeparinizedActionPerformed
        // TODO add your handling code here:
        cboRedo.requestFocus();
    }//GEN-LAST:event_txtHeparinizedActionPerformed

    private void txtOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperationActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacSurgery,
                txtOperation.getText().trim(), this);
        operationId = Constants.lovID;
        txtOperation.setText(Constants.lovDescription);
        txtOxygenator.requestFocus();
    }//GEN-LAST:event_txtOperationActionPerformed

    private void txtOxygenatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOxygenatorActionPerformed
        // TODO add your handling code here:
        txtCpgSystem.requestFocus();
    }//GEN-LAST:event_txtOxygenatorActionPerformed

    private void txtCpgSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpgSystemActionPerformed
        // TODO add your handling code here:
        cboIabCatheter.requestFocus();
    }//GEN-LAST:event_txtCpgSystemActionPerformed

    private void txtSurgeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurgeonActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtSurgeon.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSurgeon.setText("");
            surgeonId = "";
        }
        txtSurgeon.setText(Constants.lovDescription);
        surgeonId = Constants.lovID;
        txtAsstSurgeon.requestFocus();
    }//GEN-LAST:event_txtSurgeonActionPerformed

    private void txtAsstSurgeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsstSurgeonActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtAsstSurgeon.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtAsstSurgeon.setText("");
            asstSurgeonId = "";
        }
        txtAsstSurgeon.setText(Constants.lovDescription);
        asstSurgeonId = Constants.lovID;
        txtAnesthetist.requestFocus();
    }//GEN-LAST:event_txtAsstSurgeonActionPerformed

    private void txtAnesthetistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnesthetistActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtAnesthetist.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtAnesthetist.setText("");
            anesthetistId = "";
        }
        txtAnesthetist.setText(Constants.lovDescription);
        anesthetistId = Constants.lovID;
        txtHeight.requestFocus();
    }//GEN-LAST:event_txtAnesthetistActionPerformed

    private void txtVenousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenousActionPerformed
        // TODO add your handling code here:
        txtAorticCannulae.requestFocus();
    }//GEN-LAST:event_txtVenousActionPerformed

    private void txtAntegradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAntegradeActionPerformed
        // TODO add your handling code here:
        txtRetrograde.requestFocus();
    }//GEN-LAST:event_txtAntegradeActionPerformed

    private void txtAorticCannulaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAorticCannulaeActionPerformed
        // TODO add your handling code here:
        txtHemofilter.requestFocus();
    }//GEN-LAST:event_txtAorticCannulaeActionPerformed

    private void txtRetrogradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetrogradeActionPerformed
        // TODO add your handling code here:
        txtSumpVent.requestFocus();
    }//GEN-LAST:event_txtRetrogradeActionPerformed

    private void txtSumpVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumpVentActionPerformed
        // TODO add your handling code here:
        txtConnectors.requestFocus();
    }//GEN-LAST:event_txtSumpVentActionPerformed

    private void txtHemofilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHemofilterActionPerformed
        // TODO add your handling code here:
        txtAntegrade.requestFocus();
    }//GEN-LAST:event_txtHemofilterActionPerformed

    private void txtConnectorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConnectorsActionPerformed
        // TODO add your handling code here:
        txtAortic.requestFocus();
    }//GEN-LAST:event_txtConnectorsActionPerformed

    private void txtHbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHbActionPerformed
        // TODO add your handling code here:
        txtSurArea.requestFocus();
    }//GEN-LAST:event_txtHbActionPerformed

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.bloodGroup,
                txtBloodGroup.getText().trim(), this);
        bloodGroupId = Constants.lovID;
        txtBloodGroup.setText(Constants.lovDescription);
        txtVenous.requestFocus();
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtBloodFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodFlowActionPerformed
        // TODO add your handling code here:
        txtBloodGroup.requestFocus();
    }//GEN-LAST:event_txtBloodFlowActionPerformed

    private void txtSurAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurAreaActionPerformed
        // TODO add your handling code here:
        txtBloodFlow.requestFocus();
    }//GEN-LAST:event_txtSurAreaActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
        txtHb.requestFocus();
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
        txtWeight.requestFocus();
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtHartmannsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHartmannsActionPerformed
        // TODO add your handling code here:
        txtHeparin.requestFocus();
    }//GEN-LAST:event_txtHartmannsActionPerformed

    private void txtHeparinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeparinActionPerformed
        // TODO add your handling code here:
        txtMannitol.requestFocus();
    }//GEN-LAST:event_txtHeparinActionPerformed

    private void txtMannitolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMannitolActionPerformed
        // TODO add your handling code here:
        txtBloodRbc.requestFocus();
    }//GEN-LAST:event_txtMannitolActionPerformed

    private void txtBloodRbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodRbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodRbcActionPerformed

    private void txtPulmonaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulmonaryActionPerformed
        // TODO add your handling code here:
        txtValve.requestFocus();
    }//GEN-LAST:event_txtPulmonaryActionPerformed

    private void txtEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEFActionPerformed
        // TODO add your handling code here:
        txtLMS.requestFocus();
    }//GEN-LAST:event_txtEFActionPerformed

    private void txtCreatinineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatinineActionPerformed
        // TODO add your handling code here:
        txtEF.requestFocus();
    }//GEN-LAST:event_txtCreatinineActionPerformed

    private void txtUreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUreaActionPerformed
        // TODO add your handling code here:
        txtCreatinine.requestFocus();
    }//GEN-LAST:event_txtUreaActionPerformed

    private void txtMitralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMitralActionPerformed
        // TODO add your handling code here:
        txtPulmonary.requestFocus();
    }//GEN-LAST:event_txtMitralActionPerformed

    private void txtAorticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAorticActionPerformed
        // TODO add your handling code here:
        txtMitral.requestFocus();
    }//GEN-LAST:event_txtAorticActionPerformed

    private void txtValveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValveActionPerformed
        // TODO add your handling code here:
        txtDiabetic.requestFocus();
    }//GEN-LAST:event_txtValveActionPerformed

    private void txtLMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLMSActionPerformed
        // TODO add your handling code here:
        txtHBsAntiHcv.requestFocus();
    }//GEN-LAST:event_txtLMSActionPerformed

    private void txtDiabeticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiabeticActionPerformed
        // TODO add your handling code here:
        txtAllergies.requestFocus();
    }//GEN-LAST:event_txtDiabeticActionPerformed

    private void txtHBsAntiHcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHBsAntiHcvActionPerformed
        // TODO add your handling code here:
        txtOtherPer.requestFocus();
    }//GEN-LAST:event_txtHBsAntiHcvActionPerformed

    private void txtOtherPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtherPerActionPerformed
        // TODO add your handling code here:
        txtHartmanns.requestFocus();
    }//GEN-LAST:event_txtOtherPerActionPerformed

    private void txtAllergiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergiesActionPerformed
        // TODO add your handling code here:
        txtUrea.requestFocus();
    }//GEN-LAST:event_txtAllergiesActionPerformed

    private void txtOnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnTimeActionPerformed

    private void txtOffTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOffTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOffTimeActionPerformed

    private void txtSelectDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectDrugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectDrugActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void tblDrugsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrugsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsMouseClicked

    private void tblDrugsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrugsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsMouseEntered

    private void tblDrugsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrugsMouseReleased

    }//GEN-LAST:event_tblDrugsMouseReleased

    private void tblDrugsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDrugsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsPropertyChange

    private void tblDrugsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDrugsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsKeyReleased

    private void tblCheckListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListMouseClicked

    private void tblCheckListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListMouseEntered

    private void tblCheckListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckListMouseReleased
        // TODO add your handling code here:
        objCheckList = listPerCheckList.get(tblCheckList.getSelectedRow());
        objCheckList.setChecked("N");
        if(tblCheckList.getValueAt(tblCheckList.getSelectedRow(), 2).equals(true)){
            objCheckList.setChecked("Y");
        }
        if(ctlPerfusionist.updateCheckList(objCheckList)){
            selectPerfusionCheckList();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to update Check List.\n"
                    + "Kindly Contact Support Team.");
        }
    }//GEN-LAST:event_tblCheckListMouseReleased

    private void tblCheckListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCheckListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListPropertyChange

    private void tblCheckListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCheckListKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListKeyReleased

    private void tblBloodGasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBloodGasesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesMouseClicked

    private void tblBloodGasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBloodGasesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesMouseEntered

    private void tblBloodGasesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBloodGasesMouseReleased

    }//GEN-LAST:event_tblBloodGasesMouseReleased

    private void tblBloodGasesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBloodGasesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesPropertyChange

    private void tblBloodGasesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBloodGasesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesKeyReleased

    private void tblTimeManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTimeManagementMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTimeManagementMouseClicked

    private void tblTimeManagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTimeManagementMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTimeManagementMouseEntered

    private void tblTimeManagementMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTimeManagementMouseReleased

    }//GEN-LAST:event_tblTimeManagementMouseReleased

    private void tblTimeManagementPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblTimeManagementPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTimeManagementPropertyChange

    private void tblTimeManagementKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTimeManagementKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTimeManagementKeyReleased

    private void txtPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPressureActionPerformed
        // TODO add your handling code here:
        txtTime.requestFocus();
    }//GEN-LAST:event_txtPressureActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
        objPerfusionGraph.setCardiacId(cardiacId);
        objPerfusionGraph.setPatientId(patientId);
        objPerfusionGraph.setPerPressure(txtPressure.getText().trim());
        objPerfusionGraph.setTimeMin(txtTime.getText().trim());
        if (ctlPerfusionist.insertPerfusionPressureGraph(objPerfusionGraph)) {
            txtPressure.setText("");
            txtTime.setText("");
            txtPressure.requestFocus();
            selectPerfusionGraph();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save");
        }
    }//GEN-LAST:event_txtTimeActionPerformed

    private void tblGraphMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGraphMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGraphMouseClicked

    private void tblGraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGraphMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGraphMouseEntered

    private void tblGraphMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGraphMouseReleased
        objPerfusionGraph = listPerGraph.get(tblGraph.getSelectedRow());
        if (evt.getClickCount() % 2 == 0) {
            int confirmation = JOptionPane.showConfirmDialog(null, "You Are "
                    + "Going To Detele the Record. \nDo you want to Delete?");
            if (confirmation != 0) {
                return;
            }
            if (ctlPerfusionist.deletePerfusionPressureGraph(
                    objPerfusionGraph.getPerfusionGraphId())) {
                selectPerfusionGraph();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Deleted Record.");
            }
        }
    }//GEN-LAST:event_tblGraphMouseReleased

    private void tblGraphPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblGraphPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGraphPropertyChange

    private void tblGraphKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGraphKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGraphKeyReleased

    private void txtSugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar1ActionPerformed

    private void txtSugar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar2ActionPerformed

    private void txtSugar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar3ActionPerformed

    private void txtSugar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar4ActionPerformed

    private void txtSugar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar5ActionPerformed

    private void txtSugar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar6ActionPerformed

    private void txtSugar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar7ActionPerformed

    private void txtSugar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar8ActionPerformed

    private void txtSugar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar9ActionPerformed

    private void txtSugar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar10ActionPerformed

    private void txtSugar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar13ActionPerformed

    private void txtSugar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugar14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSugar14ActionPerformed

    private void tblPatientInfo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo3MouseClicked

    private void tblPatientInfo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo3MouseEntered

    private void tblPatientInfo3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo3MouseReleased

    private void tblPatientInfo3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfo3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo3PropertyChange

    private void tblPatientInfo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientInfo3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo3KeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!chkInformation()) {
            return;
        }
        objPerfusionist.setIsFinal("N");
        objPerfusionist.setFinalBy("");
        objPerfusionist.setFinalTerminalId("");
        objPerfusionist.setFinalDate("''");
        savePerfusionInfo();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cboRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRedoActionPerformed
        // TODO add your handling code here:
        txtOperation.requestFocus();
    }//GEN-LAST:event_cboRedoActionPerformed

    private void cboIabCatheterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIabCatheterActionPerformed
        // TODO add your handling code here:
        txtIabCatheterTime.requestFocus();
    }//GEN-LAST:event_cboIabCatheterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        // TODO add your handling code here:
        if (!chkInformation()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final the information. \nDo you want to Final?");
        if (confirmation != 0) {
            return;
        }
        objPerfusionist.setIsFinal("Y");
        objPerfusionist.setFinalBy(Constants.userId);
        objPerfusionist.setFinalTerminalId(Constants.terminalId);
        objPerfusionist.setFinalDate(Constants.today);
        savePerfusionInfo();
    }//GEN-LAST:event_btnFinalActionPerformed

    private void txtIabCatheterTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIabCatheterTimeActionPerformed
        // TODO add your handling code here:
        txtSurgeon.requestFocus();
    }//GEN-LAST:event_txtIabCatheterTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnGraph;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboIabCatheter;
    private javax.swing.JComboBox<String> cboRedo;
    private javax.swing.JComboBox<String> cboTimeManag;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblBloodGases;
    private javax.swing.JTable tblCheckList;
    private javax.swing.JTable tblDrugs;
    private javax.swing.JTable tblGraph;
    private javax.swing.JTable tblPatientInfo3;
    private javax.swing.JTable tblTimeManagement;
    private javax.swing.JTextField txtAllergies;
    private javax.swing.JTextField txtAnesthetist;
    private javax.swing.JTextField txtAntegrade;
    private javax.swing.JTextField txtAortic;
    private javax.swing.JTextField txtAorticCannulae;
    private javax.swing.JTextField txtAsstPerfusionist;
    private javax.swing.JTextField txtAsstSurgeon;
    private javax.swing.JTextField txtBloodFlow;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtBloodRbc;
    private javax.swing.JTextField txtConnectors;
    private javax.swing.JTextField txtCpgSystem;
    private javax.swing.JTextField txtCreatinine;
    private javax.swing.JTextField txtDiabetic;
    private javax.swing.JTextField txtEF;
    private javax.swing.JTextField txtHBsAntiHcv;
    private javax.swing.JTextField txtHartmanns;
    private javax.swing.JTextField txtHb;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHemofilter;
    private javax.swing.JTextField txtHeparin;
    private javax.swing.JTextField txtHeparinized;
    private javax.swing.JTextField txtIabCatheterTime;
    private javax.swing.JTextField txtLMS;
    private javax.swing.JTextField txtMannitol;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtMemberId1;
    private javax.swing.JTextField txtMemberId2;
    private javax.swing.JTextField txtMitral;
    private javax.swing.JTextField txtOffTime;
    private javax.swing.JTextField txtOnTime;
    private javax.swing.JTextField txtOperation;
    private javax.swing.JTextField txtOtherPer;
    private javax.swing.JTextField txtOxygenator;
    private javax.swing.JTextField txtPerfusionist;
    private javax.swing.JTextField txtPressure;
    private javax.swing.JTextField txtPulmonary;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRetrograde;
    private javax.swing.JTextField txtSelectDrug;
    private javax.swing.JTextField txtSugar1;
    private javax.swing.JTextField txtSugar10;
    private javax.swing.JTextField txtSugar13;
    private javax.swing.JTextField txtSugar14;
    private javax.swing.JTextField txtSugar2;
    private javax.swing.JTextField txtSugar3;
    private javax.swing.JTextField txtSugar4;
    private javax.swing.JTextField txtSugar5;
    private javax.swing.JTextField txtSugar6;
    private javax.swing.JTextField txtSugar7;
    private javax.swing.JTextField txtSugar8;
    private javax.swing.JTextField txtSugar9;
    private javax.swing.JTextField txtSumpVent;
    private javax.swing.JTextField txtSurArea;
    private javax.swing.JTextField txtSurgeon;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtUrea;
    private javax.swing.JTextField txtValve;
    private javax.swing.JTextField txtVenous;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void selectBloodGases() {
        listBG = ctlPerfusionist.selectBloodGases(cardiacId);
        if (listBG.isEmpty()) {
            List<PerfusionistBO> listBG = new ArrayList<>();
            listBG.add(new PerfusionistBO());
            tblBloodGases.setModel(new PerfusionBloodGasesTableModel(listBG));
            return;
        }
        tblBloodGases.setModel(new PerfusionBloodGasesTableModel(listBG));
        ListSelectionModel selectionModel = tblBloodGases.getSelectionModel();
        tblBloodGases.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setBloodGasesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblBloodGases);
    }

    private void setBloodGasesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblBloodGases.getColumnCount(); i++) {
            column = tblBloodGases.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(120);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            } else if (i == 5) {
                column.setPreferredWidth(60);
            } else if (i == 6) {
                column.setPreferredWidth(60);
            } else if (i == 7) {
                column.setPreferredWidth(60);
            } else if (i == 8) {
                column.setPreferredWidth(60);
            } else if (i == 9) {
                column.setPreferredWidth(60);
            } else if (i == 10) {
                column.setPreferredWidth(60);
            } else if (i == 11) {
                column.setPreferredWidth(60);
            } else if (i == 12) {
                column.setPreferredWidth(60);
            } else if (i == 13) {
                column.setPreferredWidth(60);
            } else if (i == 14) {
                column.setPreferredWidth(60);
            } else if (i == 15) {
                column.setPreferredWidth(60);
            } else if (i == 16) {
                column.setPreferredWidth(60);
            } else if (i == 17) {
                column.setPreferredWidth(60);
            } else if (i == 18) {
                column.setPreferredWidth(60);
            } else if (i == 19) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void clearBloodGases() {
//        txtAct.setText("");
//        txtBE.setText("");
//        txtBloodFlow.setText("");
//        txtCA.setText("");
//        txtFio2.setText("");
//        txtGflow.setText("");
//        txtHb.setText("");
//        txtHco2.setText("");
//        txtHeparin.setText("");
//        txtK.setText("");
//        txtLac.setText("");
//        txtNa.setText("");
//        txtO2.setText("");
//        txtPH.setText("");
//        txtPco2.setText("");
//        txtPo2.setText("");
//        txtSugar.setText("");
//        txtTco2.setText("");
//        txtTemperature.setText("");
    }

    private void setPerfusionInfo() {

        objPerfusionist.setPatientId(patientId);
        objPerfusionist.setCardiacId(cardiacId);
        objPerfusionist.setPerfusionistId(perfusionistId);
        objPerfusionist.setAsstPerfusionistId(asstPerfusionistId);
        objPerfusionist.setHeparinized(txtHeparinized.getText().trim());
        objPerfusionist.setRedo(cboRedo.getSelectedItem().toString());
        objPerfusionist.setOperationId(operationId);
        objPerfusionist.setOxygenator(txtOxygenator.getText().trim());
        objPerfusionist.setCpgSystem(txtCpgSystem.getText().trim());
        objPerfusionist.setIABCatheter(cboIabCatheter.getSelectedItem().toString());
        objPerfusionist.setIABCatheterTime(txtIabCatheterTime.getText().trim());
        objPerfusionist.setSurgeonId(surgeonId);
        objPerfusionist.setAssistantSurgeonId(asstSurgeonId);
        objPerfusionist.setAnesthetistId(anesthetistId);
        // Cannulae
        objPerfusionist.setVenous(txtVenous.getText().trim());
        objPerfusionist.setAorticCannulae(txtAorticCannulae.getText().trim());
        objPerfusionist.setHemofilter(txtHemofilter.getText().trim());
        objPerfusionist.setAntegrade(txtAntegrade.getText().trim());
        objPerfusionist.setRetrograde(txtRetrograde.getText().trim());
        objPerfusionist.setSumpVent(txtSumpVent.getText().trim());
        objPerfusionist.setConnectors(txtConnectors.getText().trim());

        objPerfusionist.setHeight(txtHeight.getText().trim());
        objPerfusionist.setWeight(txtWeight.getText().trim());
        objPerfusionist.setHb(txtHb.getText().trim());
        objPerfusionist.setSurfaceArea(txtSurArea.getText().trim());
        objPerfusionist.setBloodGroupId(bloodGroupId);
        objPerfusionist.setBloodFlow(txtBloodFlow.getText().trim());

        objPerfusionist.setAortic(txtAortic.getText().trim());
        objPerfusionist.setMitral(txtMitral.getText().trim());
        objPerfusionist.setPulmonary(txtPulmonary.getText().trim());
        objPerfusionist.setValve(txtValve.getText().trim());
        objPerfusionist.setDiabetic(txtDiabetic.getText().trim());
        objPerfusionist.setAllergies(txtAllergies.getText().trim());
        objPerfusionist.setUrea(txtUrea.getText().trim());
        objPerfusionist.setCreatinine(txtCreatinine.getText().trim());
        objPerfusionist.setEF(txtEF.getText().trim());
        objPerfusionist.setLMS(txtLMS.getText().trim());
        objPerfusionist.setHBsAntiHcv(txtHBsAntiHcv.getText().trim());
        objPerfusionist.setOtherPerfusion(txtOtherPer.getText().trim());

        objPerfusionist.setHartmanns(txtHartmanns.getText().trim());
        objPerfusionist.setHeparin(txtHeparin.getText().trim());
        objPerfusionist.setMannitol(txtMannitol.getText().trim());
        objPerfusionist.setBloodRBC(txtBloodRbc.getText().trim());
    }

    private void selectPerfusionInfo() {
        perfusionInfo = ctlPerfusionist.selectPerfusionInfo(cardiacId, patientId);
        if (perfusionInfo == null) {
            return;
        }
        objPerfusionist = perfusionInfo;
        patientId = objPerfusionist.getPatientId();
        cardiacId = objPerfusionist.getCardiacId();
        asstSurgeonId = objPerfusionist.getAssistantSurgeonId();
        anesthetistId = objPerfusionist.getAnesthetistId();
        surgeonId = objPerfusionist.getSurgeonId();
        operationId = objPerfusionist.getOperationId();
        perfusionistId = objPerfusionist.getPerfusionistId();
        asstPerfusionistId = objPerfusionist.getAsstPerfusionistId();
        bloodGroupId = objPerfusionist.getBloodGroupId();

        txtPerfusionist.setText(objPerfusionist.getPerfusionistName());
        txtAsstPerfusionist.setText(objPerfusionist.getAsstPerfusionistName());
        txtHeparinized.setText(objPerfusionist.getHeparinized());
        cboRedo.setSelectedItem(objPerfusionist.getRedo());
        txtOperation.setText(objPerfusionist.getOperationDescription());
        txtOxygenator.setText(objPerfusionist.getOxygenator());
        txtCpgSystem.setText(objPerfusionist.getCpgSystem());
        cboIabCatheter.setSelectedItem(objPerfusionist.getIABCatheter());
        txtIabCatheterTime.setText(objPerfusionist.getIABCatheterTime());
        txtSurgeon.setText(objPerfusionist.getSurgeonName());
        txtAsstSurgeon.setText(objPerfusionist.getAssistantSurgeonName());
        txtAnesthetist.setText(objPerfusionist.getAnesthetistName());

        txtVenous.setText(objPerfusionist.getVenous());
        txtAorticCannulae.setText(objPerfusionist.getAorticCannulae());
        txtHemofilter.setText(objPerfusionist.getHemofilter());
        txtAntegrade.setText(objPerfusionist.getAntegrade());
        txtRetrograde.setText(objPerfusionist.getRetrograde());
        txtSumpVent.setText(objPerfusionist.getSumpVent());
        txtConnectors.setText(objPerfusionist.getConnectors());

        txtHeight.setText(objPerfusionist.getHeight());
        txtWeight.setText(objPerfusionist.getWeight());
        txtHb.setText(objPerfusionist.getHb());
        txtSurArea.setText(objPerfusionist.getSurfaceArea());
        txtBloodGroup.setText(objPerfusionist.getBloodGroupDescription());
        txtBloodFlow.setText(objPerfusionist.getBloodFlow());

        txtAortic.setText(objPerfusionist.getAortic());
        txtMitral.setText(objPerfusionist.getMitral());
        txtPulmonary.setText(objPerfusionist.getPulmonary());
        txtValve.setText(objPerfusionist.getValve());
        txtDiabetic.setText(objPerfusionist.getDiabetic());
        txtAllergies.setText(objPerfusionist.getAllergies());
        txtUrea.setText(objPerfusionist.getUrea());
        txtCreatinine.setText(objPerfusionist.getCreatinine());
        txtEF.setText(objPerfusionist.getEF());
        txtLMS.setText(objPerfusionist.getLMS());
        txtHBsAntiHcv.setText(objPerfusionist.getHBsAntiHcv());
        txtOtherPer.setText(objPerfusionist.getOtherPerfusion());

        txtHartmanns.setText(objPerfusionist.getHartmanns());
        txtHeparin.setText(objPerfusionist.getHeparin());
        txtMannitol.setText(objPerfusionist.getMannitol());
        txtBloodRbc.setText(objPerfusionist.getBloodRBC());

        if (objPerfusionist.getIsFinal().equalsIgnoreCase("Y")) {
            disableFields();
        }
    }

    private void clear() {
        txtPerfusionist.setText("");
        txtAsstPerfusionist.setText("");
        txtHeparinized.setText("");
        cboRedo.setSelectedIndex(0);
        txtOperation.setText("");
        txtOxygenator.setText("");
        txtCpgSystem.setText("");
        txtIabCatheterTime.setText("");
        cboIabCatheter.setSelectedIndex(0);
        txtSurgeon.setText("");
        txtAsstSurgeon.setText("");
        txtAnesthetist.setText("");

        txtVenous.setText("");
        txtAorticCannulae.setText("");
        txtHemofilter.setText("");
        txtAntegrade.setText("");
        txtRetrograde.setText("");
        txtSumpVent.setText("");
        txtConnectors.setText("");

        txtHeight.setText("");
        txtWeight.setText("");
        txtHb.setText("");
        txtSurArea.setText("");
        txtBloodGroup.setText("");
        txtBloodFlow.setText("");

        txtAortic.setText("");
        txtMitral.setText("");
        txtPulmonary.setText("");
        txtValve.setText("");
        txtDiabetic.setText("");
        txtAllergies.setText("");
        txtUrea.setText("");
        txtCreatinine.setText("");
        txtEF.setText("");
        txtLMS.setText("");
        txtHBsAntiHcv.setText("");
        txtOtherPer.setText("");

        txtHartmanns.setText("");
        txtHeparin.setText("");
        txtMannitol.setText("");
        txtBloodRbc.setText("");
    }

    private void savePerfusionInfo() {

        setPerfusionInfo();
        if (perfusionInfo == null) {
            if (ctlPerfusionist.insertPerfusionInformation(objPerfusionist)) {
                JOptionPane.showMessageDialog(null, "Record save successfully.");
                clear();
                selectPerfusionInfo();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save Record.\n"
                        + "Kindly contact Support Team.");
            }
        } else {
            if (ctlPerfusionist.updatePerfusionInformation(objPerfusionist)) {
                JOptionPane.showMessageDialog(null, "Record save successfully.");
                clear();
                selectPerfusionInfo();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save Record.\n"
                        + "Kindly contact Support Team.");
            }
        }
    }

    private void disableFields() {

        btnSave.setEnabled(false);
        btnFinal.setEnabled(false);

        txtPerfusionist.setEditable(false);
        txtAsstPerfusionist.setEditable(false);
        txtHeparinized.setEditable(false);
        cboRedo.setEnabled(false);
        txtOperation.setEditable(false);
        txtOxygenator.setEditable(false);
        txtCpgSystem.setEditable(false);
        cboIabCatheter.setEnabled(false);
        txtIabCatheterTime.setEditable(false);
        txtSurgeon.setEditable(false);
        txtAsstSurgeon.setEditable(false);
        txtAnesthetist.setEditable(false);

        txtVenous.setEditable(false);
        txtAorticCannulae.setEditable(false);
        txtHemofilter.setEditable(false);
        txtAntegrade.setEditable(false);
        txtRetrograde.setEditable(false);
        txtSumpVent.setEditable(false);
        txtConnectors.setEditable(false);

        txtHeight.setEditable(false);
        txtWeight.setEditable(false);
        txtHb.setEditable(false);
        txtSurArea.setEditable(false);
        txtBloodGroup.setEditable(false);
        txtBloodFlow.setEditable(false);

        txtAortic.setEditable(false);
        txtMitral.setEditable(false);
        txtPulmonary.setEditable(false);
        txtValve.setEditable(false);
        txtDiabetic.setEditable(false);
        txtAllergies.setEditable(false);
        txtUrea.setEditable(false);
        txtCreatinine.setEditable(false);
        txtEF.setEditable(false);
        txtLMS.setEditable(false);
        txtHBsAntiHcv.setEditable(false);
        txtOtherPer.setEditable(false);

        txtHartmanns.setEditable(false);
        txtHeparin.setEditable(false);
        txtMannitol.setEditable(false);
        txtBloodRbc.setEditable(false);
    }

    private boolean chkInformation() {
        boolean ret = true;
        if (cboIabCatheter.getSelectedIndex() == 0
                && txtIabCatheterTime.getText().trim().length() == 0) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Please enter the IAB Catheter Time");
            txtIabCatheterTime.requestFocus();
        }
        if (perfusionistId.equalsIgnoreCase("")) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Please Select Perfusionist.");
            txtPerfusionist.requestFocus();
        }
        if (asstPerfusionistId.equalsIgnoreCase("")) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Please Select Assistant Perfusionist.");
            txtAsstPerfusionist.requestFocus();
        }
        if (surgeonId.equalsIgnoreCase("")) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Please Select Surgeon.");
            txtSurgeon.requestFocus();
        }
        if (asstSurgeonId.equalsIgnoreCase("")) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Please Select Assistant Surgeon.");
            txtAsstSurgeon.requestFocus();
        }
        if (anesthetistId.equalsIgnoreCase("")) {
            ret = false;
            JOptionPane.showMessageDialog(null, "Please Select Anesthetist.");
            txtAnesthetist.requestFocus();
        }
        return ret;
    }

    private void selectPerfusionGraph() {
        listPerGraph = ctlPerfusionist.selectPerfusionPressureGraph(cardiacId,
                patientId);
        if (listPerGraph.isEmpty()) {
            List<PerfusionistBO> listPerGraph = new ArrayList<>();
            listBG.add(new PerfusionistBO());
            tblGraph.setModel(new PerfusionGraphTableModel(listPerGraph));
            return;
        }
        tblGraph.setModel(new PerfusionGraphTableModel(listPerGraph));
        ListSelectionModel selectionModel = tblGraph.getSelectionModel();
        tblGraph.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPerfusionGraphColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblGraph);
    }

    private void setPerfusionGraphColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblGraph.getColumnCount(); i++) {
            column = tblGraph.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }
        }
    }
    
    private void selectPerfusionCheckList(){
        listPerCheckList = ctlPerfusionist.selectPerfusionCheckList(cardiacId, 
                patientId);
        if (listPerCheckList.isEmpty()) {
            List<PerfusionistBO> listPerCheckList = new ArrayList<>();
            listBG.add(new PerfusionistBO());
            tblCheckList.setModel(new PerfusionCheckListTableModel(listPerCheckList));
            return;
        }
        tblCheckList.setModel(new PerfusionCheckListTableModel(listPerCheckList));
        ListSelectionModel selectionModel = tblCheckList.getSelectionModel();
        tblCheckList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPerfusionCheckListColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCheckList);
    }
    
    private void setPerfusionCheckListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCheckList.getColumnCount(); i++) {
            column = tblCheckList.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            }
        }
    }
}
