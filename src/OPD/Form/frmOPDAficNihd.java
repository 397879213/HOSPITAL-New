package OPD.Form;


import OPD.BO.BOOPDConsultant;
import OPD.Controller.OPDConsultantController;
import OPD.TableModel.ConsultantInfoTableModel;
import OPD.TableModel.OPDPatientInfoTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;


public class frmOPDAficNihd extends javax.swing.JInternalFrame {

    private DisplayLOV lov = new DisplayLOV();
    OPDConsultantController consulClt = new OPDConsultantController();
    BOOPDConsultant consulBo = new BOOPDConsultant();

    List<BOOPDConsultant> listFS = new ArrayList<>();
    List<BOOPDConsultant> listPatientHistory = new ArrayList<>();
    List<BOOPDConsultant> listtotalPerform = new ArrayList<>();
    String patientId = "";

    private String fromDate = "";
    private String toDate = "";
    private String userId = "";
    private String specialityId = "";

    public frmOPDAficNihd() {
        initComponents();
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        pnlSearchUser7 = new javax.swing.JPanel();
        pnlUpdateHistory = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtWholeBlood = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtFFPs = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtRCC = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPlatelets = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtCryoprecipitate = new javax.swing.JTextField();
        pnlSearch = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtICUStay = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtValidationTime = new javax.swing.JTextField();
        txtMrNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ChkVentilationYes = new javax.swing.JCheckBox();
        ChkVentilationNo = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        cboInotropicSupport = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cboInotropesDuration = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        ChkLowCardiacOutputYes = new javax.swing.JCheckBox();
        ChkLowCardiacOutputNo = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        ChkVentilationNo1 = new javax.swing.JCheckBox();
        ChkVentilationYes1 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        ChkVentilationYes2 = new javax.swing.JCheckBox();
        ChkVentilationNo2 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        ChkVentilationYes3 = new javax.swing.JCheckBox();
        ChkVentilationNo3 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtCryoprecipitate1 = new javax.swing.JTextField();
        ChkVentilationYes4 = new javax.swing.JCheckBox();
        ChkVentilationNo4 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        ChkVentilationYes5 = new javax.swing.JCheckBox();
        ChkVentilationNo5 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        ChkVentilationYes6 = new javax.swing.JCheckBox();
        ChkVentilationNo6 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        cboInotropesDuration1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        ChkVentilationYes7 = new javax.swing.JCheckBox();
        ChkVentilationNo7 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        ChkVentilationYes8 = new javax.swing.JCheckBox();
        ChkVentilationNo8 = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        ChkVentilationYes9 = new javax.swing.JCheckBox();
        ChkVentilationNo9 = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        ChkVentilationYes10 = new javax.swing.JCheckBox();
        ChkVentilationNo10 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        cboInotropesDuration2 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        ChkVentilationYes11 = new javax.swing.JCheckBox();
        ChkVentilationNo11 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        ChkVentilationNo12 = new javax.swing.JCheckBox();
        ChkVentilationYes12 = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        ChkVentilationYes13 = new javax.swing.JCheckBox();
        ChkVentilationNo13 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        ChkVentilationYes14 = new javax.swing.JCheckBox();
        ChkVentilationNo14 = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        ChkVentilationYes15 = new javax.swing.JCheckBox();
        ChkVentilationNo15 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        ChkVentilationYes16 = new javax.swing.JCheckBox();
        ChkVentilationNo16 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        ChkVentilationYes17 = new javax.swing.JCheckBox();
        ChkVentilationNo17 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cboInotropesDuration3 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        cboInotropesDuration4 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        ChkVentilationNo18 = new javax.swing.JCheckBox();
        ChkVentilationYes18 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        ChkVentilationYes19 = new javax.swing.JCheckBox();
        ChkVentilationNo19 = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        ChkVentilationYes20 = new javax.swing.JCheckBox();
        ChkVentilationNo20 = new javax.swing.JCheckBox();
        jLabel51 = new javax.swing.JLabel();
        ChkVentilationYes21 = new javax.swing.JCheckBox();
        ChkVentilationNo21 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"AFIC NIHD");
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear1.setText("Add");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OutCome Variables", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUpdateHistory.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUpdateHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Use of Blood Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUpdateHistory.setForeground(java.awt.SystemColor.activeCaption);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Whole Blood :");

        txtWholeBlood.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtWholeBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWholeBloodActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("FFPs :");

        txtFFPs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFFPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFPsActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("RCC :");

        txtRCC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRCCActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Platelets :");

        txtPlatelets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPlatelets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlateletsActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Cryoprecipitate :");

        txtCryoprecipitate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCryoprecipitate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCryoprecipitateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUpdateHistoryLayout = new javax.swing.GroupLayout(pnlUpdateHistory);
        pnlUpdateHistory.setLayout(pnlUpdateHistoryLayout);
        pnlUpdateHistoryLayout.setHorizontalGroup(
            pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWholeBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFFPs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRCC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlatelets, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCryoprecipitate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlUpdateHistoryLayout.setVerticalGroup(
            pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWholeBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFFPs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlatelets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCryoprecipitate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearch.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("MR No :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Name  :");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("ICU Stay (H) :");

        txtICUStay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtICUStay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtICUStayActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Ventilation Time :");

        txtValidationTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtValidationTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidationTimeActionPerformed(evt);
            }
        });

        txtMrNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMrNoActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAgeGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAgeGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeGenderActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Ventilation >72 hrs :");

        ChkVentilationYes.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes.setText("YES");
        ChkVentilationYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYesActionPerformed(evt);
            }
        });

        ChkVentilationNo.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo.setText("NO");
        ChkVentilationNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Inotropic Support :");

        cboInotropicSupport.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cboInotropicSupport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select",">72 Hrs", "<72 Hrs"}));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Inotropes Duration :");

        cboInotropesDuration.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cboInotropesDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select",">72 Hrs", "<72 Hrs"}));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Low Cardiac Output :");

        ChkLowCardiacOutputYes.setBackground(new java.awt.Color(255, 255, 255));
        ChkLowCardiacOutputYes.setText("YES");
        ChkLowCardiacOutputYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkLowCardiacOutputYesActionPerformed(evt);
            }
        });

        ChkLowCardiacOutputNo.setBackground(new java.awt.Color(255, 255, 255));
        ChkLowCardiacOutputNo.setText("NO");
        ChkLowCardiacOutputNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkLowCardiacOutputNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkLowCardiacOutputYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChkLowCardiacOutputNo)
                        .addGap(1, 1, 1))
                    .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSearchLayout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtICUStay, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValidationTime)
                            .addComponent(cboInotropicSupport, 0, 104, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSearchLayout.createSequentialGroup()
                                .addComponent(ChkVentilationYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChkVentilationNo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboInotropesDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgeGender)))
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtICUStay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidationTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkVentilationYes)
                    .addComponent(ChkVentilationNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboInotropicSupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboInotropesDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkLowCardiacOutputYes)
                    .addComponent(ChkLowCardiacOutputNo)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Complication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Bleeding :");

        ChkVentilationNo1.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo1.setText("NO");
        ChkVentilationNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo1ActionPerformed(evt);
            }
        });

        ChkVentilationYes1.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes1.setText("YES");
        ChkVentilationYes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Haemothorax :");

        ChkVentilationYes2.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes2.setText("YES");
        ChkVentilationYes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes2ActionPerformed(evt);
            }
        });

        ChkVentilationNo2.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo2.setText("NO");
        ChkVentilationNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo2ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Pacing :");

        ChkVentilationYes3.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes3.setText("YES");
        ChkVentilationYes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes3ActionPerformed(evt);
            }
        });

        ChkVentilationNo3.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo3.setText("NO");
        ChkVentilationNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo3ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sepsis/ Wound Infection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("If yes, name of isolated Organism :");

        txtCryoprecipitate1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCryoprecipitate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCryoprecipitate1ActionPerformed(evt);
            }
        });

        ChkVentilationYes4.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes4.setText("YES");
        ChkVentilationYes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes4ActionPerformed(evt);
            }
        });

        ChkVentilationNo4.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo4.setText("NO");
        ChkVentilationNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo4ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("If yes, name of isolated Organism :");

        ChkVentilationYes5.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes5.setText("YES");
        ChkVentilationYes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes5ActionPerformed(evt);
            }
        });

        ChkVentilationNo5.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo5.setText("NO");
        ChkVentilationNo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCryoprecipitate1))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ChkVentilationYes4)
                        .addGap(10, 10, 10)
                        .addComponent(ChkVentilationNo4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChkVentilationYes5)
                        .addGap(18, 18, 18)
                        .addComponent(ChkVentilationNo5)))
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkVentilationYes4)
                    .addComponent(ChkVentilationNo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCryoprecipitate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChkVentilationYes5)
                        .addComponent(ChkVentilationNo5))))
        );

        jLabel32.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Fever :");

        ChkVentilationYes6.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes6.setText("YES");
        ChkVentilationYes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes6ActionPerformed(evt);
            }
        });

        ChkVentilationNo6.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo6.setText("NO");
        ChkVentilationNo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo6ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Anatomical Deformities :");

        cboInotropesDuration1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cboInotropesDuration1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dextocardia","Situs Inversus", "Structural Abnormalities","Ohter"}));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("DHCA :");

        ChkVentilationYes7.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes7.setText("YES");
        ChkVentilationYes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes7ActionPerformed(evt);
            }
        });

        ChkVentilationNo7.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo7.setText("NO");
        ChkVentilationNo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo7ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Re-Ventilation :");

        ChkVentilationYes8.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes8.setText("YES");
        ChkVentilationYes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes8ActionPerformed(evt);
            }
        });

        ChkVentilationNo8.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo8.setText("NO");
        ChkVentilationNo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo8ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Cardiac Failure :");

        ChkVentilationYes9.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes9.setText("YES");
        ChkVentilationYes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes9ActionPerformed(evt);
            }
        });

        ChkVentilationNo9.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo9.setText("NO");
        ChkVentilationNo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo9ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Re-Opening :");

        ChkVentilationYes10.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes10.setText("ITC");
        ChkVentilationYes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes10ActionPerformed(evt);
            }
        });

        ChkVentilationNo10.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo10.setText("OT");
        ChkVentilationNo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo10ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Cause of Re-Opening :");

        cboInotropesDuration2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cboInotropesDuration2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bleeding","Low Pressure", "Teperature Effect","Ohter"}));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Pulmonary Hypertension :");

        ChkVentilationYes11.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes11.setText("YES");
        ChkVentilationYes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes11ActionPerformed(evt);
            }
        });

        ChkVentilationNo11.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo11.setText("NO");
        ChkVentilationNo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo11ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pulmonary Complications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Pleural Effusion :");

        ChkVentilationNo12.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo12.setText("NO");
        ChkVentilationNo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo12ActionPerformed(evt);
            }
        });

        ChkVentilationYes12.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes12.setText("YES");
        ChkVentilationYes12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes12ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Pneumothorax :");

        ChkVentilationYes13.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes13.setText("YES");
        ChkVentilationYes13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes13ActionPerformed(evt);
            }
        });

        ChkVentilationNo13.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo13.setText("NO");
        ChkVentilationNo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo13ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Pneumonia :");

        ChkVentilationYes14.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes14.setText("Chest");
        ChkVentilationYes14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes14ActionPerformed(evt);
            }
        });

        ChkVentilationNo14.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo14.setText("Upper air way");
        ChkVentilationNo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo14ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Pulm Edema :");

        ChkVentilationYes15.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes15.setText("YES");
        ChkVentilationYes15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes15ActionPerformed(evt);
            }
        });

        ChkVentilationNo15.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo15.setText("NO");
        ChkVentilationNo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo15ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Spasm :");

        ChkVentilationYes16.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes16.setText("YES");
        ChkVentilationYes16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes16ActionPerformed(evt);
            }
        });

        ChkVentilationNo16.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo16.setText("NO");
        ChkVentilationNo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo16ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Respiratory Failure :");

        ChkVentilationYes17.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes17.setText("YES");
        ChkVentilationYes17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes17ActionPerformed(evt);
            }
        });

        ChkVentilationNo17.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo17.setText("NO");
        ChkVentilationNo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationYes12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationYes15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ChkVentilationYes13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ChkVentilationYes16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationYes14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationYes17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo17))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChkVentilationYes12)
                        .addComponent(ChkVentilationNo12)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChkVentilationYes13)
                        .addComponent(ChkVentilationNo13))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChkVentilationYes14)
                        .addComponent(ChkVentilationNo14)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChkVentilationYes15)
                        .addComponent(ChkVentilationNo15))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChkVentilationYes16)
                        .addComponent(ChkVentilationNo16)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChkVentilationYes17)
                        .addComponent(ChkVentilationNo17))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rhythm Problems", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Arrhythmia :");

        cboInotropesDuration3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cboInotropesDuration3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bradycardia","Tachycardia"}));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Rhythm :");

        cboInotropesDuration4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cboInotropesDuration4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SR","ST","IR"}));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("CPR :");

        ChkVentilationNo18.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo18.setText("NO");
        ChkVentilationNo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo18ActionPerformed(evt);
            }
        });

        ChkVentilationYes18.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes18.setText("YES");
        ChkVentilationYes18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes18ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Neurological Complication :");

        ChkVentilationYes19.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes19.setText("YES");
        ChkVentilationYes19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes19ActionPerformed(evt);
            }
        });

        ChkVentilationNo19.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo19.setText("NO");
        ChkVentilationNo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo19ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Renal Complication :");

        ChkVentilationYes20.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes20.setText("YES");
        ChkVentilationYes20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes20ActionPerformed(evt);
            }
        });

        ChkVentilationNo20.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo20.setText("NO");
        ChkVentilationNo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo20ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Anticoagulation Complication :");

        ChkVentilationYes21.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationYes21.setText("YES");
        ChkVentilationYes21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationYes21ActionPerformed(evt);
            }
        });

        ChkVentilationNo21.setBackground(new java.awt.Color(255, 255, 255));
        ChkVentilationNo21.setText("NO");
        ChkVentilationNo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkVentilationNo21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ChkVentilationNo19)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ChkVentilationYes19)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboInotropesDuration3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ChkVentilationNo20)
                                    .addComponent(ChkVentilationYes20)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChkVentilationYes21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ChkVentilationNo21)
                                .addGap(124, 124, 124))
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboInotropesDuration4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkVentilationYes18)
                    .addComponent(ChkVentilationNo18))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboInotropesDuration3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboInotropesDuration4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkVentilationYes21)
                    .addComponent(ChkVentilationNo21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes19)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkVentilationNo19)
                            .addComponent(ChkVentilationNo18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChkVentilationYes20)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo20))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboInotropesDuration1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboInotropesDuration2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChkVentilationYes10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationYes11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChkVentilationYes7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChkVentilationYes8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationYes9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChkVentilationNo9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChkVentilationYes1)
                                .addGap(18, 18, 18)
                                .addComponent(ChkVentilationNo1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(ChkVentilationYes2)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChkVentilationNo2))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(ChkVentilationYes3)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChkVentilationNo3))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(ChkVentilationYes6)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChkVentilationNo6)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes1)
                            .addComponent(ChkVentilationNo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes2)
                            .addComponent(ChkVentilationNo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes3)
                            .addComponent(ChkVentilationNo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes6)
                            .addComponent(ChkVentilationNo6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboInotropesDuration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes7)
                            .addComponent(ChkVentilationNo7)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes8)
                            .addComponent(ChkVentilationNo8)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkVentilationYes9)
                            .addComponent(ChkVentilationNo9)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChkVentilationYes10)
                        .addComponent(ChkVentilationNo10)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChkVentilationYes11)
                        .addComponent(ChkVentilationNo11))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboInotropesDuration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlSearchUser7Layout = new javax.swing.GroupLayout(pnlSearchUser7);
        pnlSearchUser7.setLayout(pnlSearchUser7Layout);
        pnlSearchUser7Layout.setHorizontalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUpdateHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSearchUser7Layout.setVerticalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUpdateHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pnlSearchUser7.getAccessibleContext().setAccessibleName("Patient Info");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
        txtICUStay.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtICUStayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICUStayActionPerformed
        String query
                = " SELECT USER_NAME ID, USR.NAME||' - ('||USER_ID||')' "
                + " DESCRIPTION   FROM            \n"
                + Database.DCMS.users + " USR     \n"
                + " WHERE USER_NAME IN ( SELECT CONSULTANT_ID FROM "
                + Database.DCMS.opdPerformedConsultancy
                + " WHERE TRUNC(CRTD_DATE) BETWEEN '" + fromDate + "' AND '" + toDate + "')\n"
                + " AND USR.NAME LIKE '%" + txtICUStay.getText().toUpperCase().trim() + "%' \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        userId = Constants.lovID;
        txtICUStay.setText(Constants.lovDescription);

    }//GEN-LAST:event_txtICUStayActionPerformed

    private void txtValidationTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidationTimeActionPerformed
        // TODO add your handling code here:

        lov.LOVDefinitionSelection(DefinitionTypes.speciality, txtValidationTime.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        specialityId = Constants.lovID;
        txtValidationTime.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtValidationTimeActionPerformed

    private void txtMrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMrNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeGenderActionPerformed

    private void ChkVentilationYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYesActionPerformed

    private void ChkVentilationNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNoActionPerformed

    private void ChkLowCardiacOutputYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkLowCardiacOutputYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkLowCardiacOutputYesActionPerformed

    private void ChkLowCardiacOutputNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkLowCardiacOutputNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkLowCardiacOutputNoActionPerformed

    private void txtWholeBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWholeBloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWholeBloodActionPerformed

    private void txtFFPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFPsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFPsActionPerformed

    private void txtRCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRCCActionPerformed

    private void txtPlateletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlateletsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlateletsActionPerformed

    private void txtCryoprecipitateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCryoprecipitateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCryoprecipitateActionPerformed

    private void ChkVentilationYes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes1ActionPerformed

    private void ChkVentilationNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo1ActionPerformed

    private void ChkVentilationYes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes2ActionPerformed

    private void ChkVentilationNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo2ActionPerformed

    private void ChkVentilationYes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes3ActionPerformed

    private void ChkVentilationNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo3ActionPerformed

    private void txtCryoprecipitate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCryoprecipitate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCryoprecipitate1ActionPerformed

    private void ChkVentilationYes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes4ActionPerformed

    private void ChkVentilationNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo4ActionPerformed

    private void ChkVentilationYes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes5ActionPerformed

    private void ChkVentilationNo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo5ActionPerformed

    private void ChkVentilationYes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes6ActionPerformed

    private void ChkVentilationNo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo6ActionPerformed

    private void ChkVentilationYes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes7ActionPerformed

    private void ChkVentilationNo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo7ActionPerformed

    private void ChkVentilationYes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes8ActionPerformed

    private void ChkVentilationNo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo8ActionPerformed

    private void ChkVentilationYes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes9ActionPerformed

    private void ChkVentilationNo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo9ActionPerformed

    private void ChkVentilationYes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes10ActionPerformed

    private void ChkVentilationNo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo10ActionPerformed

    private void ChkVentilationYes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes11ActionPerformed

    private void ChkVentilationNo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo11ActionPerformed

    private void ChkVentilationYes12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes12ActionPerformed

    private void ChkVentilationNo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo12ActionPerformed

    private void ChkVentilationYes13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes13ActionPerformed

    private void ChkVentilationNo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo13ActionPerformed

    private void ChkVentilationYes14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes14ActionPerformed

    private void ChkVentilationNo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo14ActionPerformed

    private void ChkVentilationYes15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes15ActionPerformed

    private void ChkVentilationNo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo15ActionPerformed

    private void ChkVentilationYes16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes16ActionPerformed

    private void ChkVentilationNo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo16ActionPerformed

    private void ChkVentilationYes17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes17ActionPerformed

    private void ChkVentilationNo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo17ActionPerformed

    private void ChkVentilationYes18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes18ActionPerformed

    private void ChkVentilationNo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo18ActionPerformed

    private void ChkVentilationYes19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes19ActionPerformed

    private void ChkVentilationNo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo19ActionPerformed

    private void ChkVentilationYes20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes20ActionPerformed

    private void ChkVentilationNo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo20ActionPerformed

    private void ChkVentilationYes21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationYes21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationYes21ActionPerformed

    private void ChkVentilationNo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkVentilationNo21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkVentilationNo21ActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkLowCardiacOutputNo;
    private javax.swing.JCheckBox ChkLowCardiacOutputYes;
    private javax.swing.JCheckBox ChkVentilationNo;
    private javax.swing.JCheckBox ChkVentilationNo1;
    private javax.swing.JCheckBox ChkVentilationNo10;
    private javax.swing.JCheckBox ChkVentilationNo11;
    private javax.swing.JCheckBox ChkVentilationNo12;
    private javax.swing.JCheckBox ChkVentilationNo13;
    private javax.swing.JCheckBox ChkVentilationNo14;
    private javax.swing.JCheckBox ChkVentilationNo15;
    private javax.swing.JCheckBox ChkVentilationNo16;
    private javax.swing.JCheckBox ChkVentilationNo17;
    private javax.swing.JCheckBox ChkVentilationNo18;
    private javax.swing.JCheckBox ChkVentilationNo19;
    private javax.swing.JCheckBox ChkVentilationNo2;
    private javax.swing.JCheckBox ChkVentilationNo20;
    private javax.swing.JCheckBox ChkVentilationNo21;
    private javax.swing.JCheckBox ChkVentilationNo3;
    private javax.swing.JCheckBox ChkVentilationNo4;
    private javax.swing.JCheckBox ChkVentilationNo5;
    private javax.swing.JCheckBox ChkVentilationNo6;
    private javax.swing.JCheckBox ChkVentilationNo7;
    private javax.swing.JCheckBox ChkVentilationNo8;
    private javax.swing.JCheckBox ChkVentilationNo9;
    private javax.swing.JCheckBox ChkVentilationYes;
    private javax.swing.JCheckBox ChkVentilationYes1;
    private javax.swing.JCheckBox ChkVentilationYes10;
    private javax.swing.JCheckBox ChkVentilationYes11;
    private javax.swing.JCheckBox ChkVentilationYes12;
    private javax.swing.JCheckBox ChkVentilationYes13;
    private javax.swing.JCheckBox ChkVentilationYes14;
    private javax.swing.JCheckBox ChkVentilationYes15;
    private javax.swing.JCheckBox ChkVentilationYes16;
    private javax.swing.JCheckBox ChkVentilationYes17;
    private javax.swing.JCheckBox ChkVentilationYes18;
    private javax.swing.JCheckBox ChkVentilationYes19;
    private javax.swing.JCheckBox ChkVentilationYes2;
    private javax.swing.JCheckBox ChkVentilationYes20;
    private javax.swing.JCheckBox ChkVentilationYes21;
    private javax.swing.JCheckBox ChkVentilationYes3;
    private javax.swing.JCheckBox ChkVentilationYes4;
    private javax.swing.JCheckBox ChkVentilationYes5;
    private javax.swing.JCheckBox ChkVentilationYes6;
    private javax.swing.JCheckBox ChkVentilationYes7;
    private javax.swing.JCheckBox ChkVentilationYes8;
    private javax.swing.JCheckBox ChkVentilationYes9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cboInotropesDuration;
    private javax.swing.JComboBox<String> cboInotropesDuration1;
    private javax.swing.JComboBox<String> cboInotropesDuration2;
    private javax.swing.JComboBox<String> cboInotropesDuration3;
    private javax.swing.JComboBox<String> cboInotropesDuration4;
    private javax.swing.JComboBox<String> cboInotropicSupport;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlUpdateHistory;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtCryoprecipitate;
    private javax.swing.JTextField txtCryoprecipitate1;
    private javax.swing.JTextField txtFFPs;
    private javax.swing.JTextField txtICUStay;
    private javax.swing.JTextField txtMrNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPlatelets;
    private javax.swing.JTextField txtRCC;
    private javax.swing.JTextField txtValidationTime;
    private javax.swing.JTextField txtWholeBlood;
    // End of variables declaration//GEN-END:variables

    private void selectConsultantInfo(String fromDate, String toDate, String userId, String SpecialityId) {
        listFS = consulClt.selectConsultantSearch(fromDate, toDate, userId, SpecialityId);

        if (!listFS.isEmpty()) {
            consulBo = listFS.get(0);
        }

        if (listFS.isEmpty()) {

            listFS = consulClt.selectConsultantSearch(fromDate, toDate, userId, SpecialityId);
        } else {
//            tblUpdateHistory.setModel(new ConsultantInfoTableModel(listFS));
        }
  //      ListSelectionModel selectionMod = tblUpdateHistory.getSelectionModel();
   //     tblUpdateHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setColumnsWidthsUpdateHistory();
    //    selectionMod.setSelectionInterval(0, 0);
    //    Constants.tablelook.setJTableEnvironment(tblUpdateHistory);
    }

    private void selectPatientHistory() {

    //    tblPatientInfo.setModel(new OPDPatientInfoTableModel(listPatientHistory));
    //    ListSelectionModel selectionMod = tblPatientInfo.getSelectionModel();
    //    tblPatientInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       // setColumnsWidthsPatientInfo();
      //  selectionMod.setSelectionInterval(0, 0);
    //    Constants.tablelook.setJTableEnvironment(tblPatientInfo);
       
       
    }

//    public void setColumnsWidthsUpdateHistory() {
//
//        TableColumn column = null;
//        for (int i = 0; i < tblUpdateHistory.getColumnCount(); i++) {
//            column = tblUpdateHistory.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(0);
//            } else if (i == 1) {
//                column.setPreferredWidth(115);
//            } else if (i == 2) {
//                column.setPreferredWidth(70);
//            } else if (i == 3) {
//                column.setPreferredWidth(70);
//            } else if (i == 4) {
//                column.setPreferredWidth(10);
//            } else if (i == 5) {
//                column.setPreferredWidth(10);
//            }
//        }
//    }

//    public void setColumnsWidthsPatientInfo() {
//
//        TableColumn column = null;
//        for (int i = 0; i < tblPatientInfo.getColumnCount(); i++) {
//            column = tblPatientInfo.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(0);
//            } else if (i == 1) {
//                column.setPreferredWidth(40);
//            } else if (i == 2) {
//                column.setPreferredWidth(90);
//            } else if (i == 3) {
//                column.setPreferredWidth(105);
//            } else if (i == 4) {
//                column.setPreferredWidth(35);
//            }else if (i == 5) {
//                column.setPreferredWidth(20);
//            }
//        }
//    }

    private void clearForm() {

        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtICUStay);
        comp.add(txtValidationTime);
        GUIUtils.setClear(comp);
        listFS.clear();
      //  tblUpdateHistory.setModel(new ConsultantInfoTableModel(listFS));
        listPatientHistory.clear();
      //  tblPatientInfo.setModel(new OPDPatientInfoTableModel(listPatientHistory));
    }
}
