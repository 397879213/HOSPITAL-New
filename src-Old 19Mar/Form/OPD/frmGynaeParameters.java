package Form.OPD;

import BO.OPD.GynaeParameter;
import BO.OPD.PatientHospitalVisit;
import Controller.OPD.GynaeParameterController;
import TableModel.OPD.GynaeParameterListTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;

public class frmGynaeParameters extends javax.swing.JInternalFrame {

    private String patientId = "";
    private String eddDate = "";
    private String referenceId = "";

    List<GynaeParameter> listGayneeParam = new ArrayList();
    List<GynaeParameter> listFianlParameters = new ArrayList();

    public frmGynaeParameters(PatientHospitalVisit patVisit) { 

        initComponents();
        this.setSize(Constants.xSize + 25, Constants.ySize + 25);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnFianlSign.setMnemonic(KeyEvent.VK_F);
        selectGayneeParameter(patientId, "");
        setUltrasoundEddDate();
        setDemography(patVisit);
    }
    DisplayLOV lov = new DisplayLOV();
    GynaeParameterController ctlGayneeParameter = new GynaeParameterController();
    GynaeParameter objSave = new GynaeParameter();
    GynaeParameter gayneeParameterObj = new GynaeParameter();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtLmp = new javax.swing.JTextField();
        txtAc = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtEdd = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtGestationSac = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cboCervix = new javax.swing.JComboBox<>();
        cboPlacenta = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cboGrade = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cboCord = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        cboAmnioticFluidVolume = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        txtNuchalTranslucency = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtHeadCircumference = new javax.swing.JTextField();
        txtUltrasoundEdd = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConclusion = new javax.swing.JTextArea();
        cboFetus = new javax.swing.JComboBox<>();
        cboFca = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtBiparietalDiameter = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCrl = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cboLie = new javax.swing.JComboBox<>();
        cboPresentation = new javax.swing.JComboBox<>();
        cboLiquor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtFemur = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblGyaneeParameter = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFianlSign = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Gynae Parameters");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 710));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gynae Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id : ");

        txtPatientName.setEditable(false);

        txtPatientId.setEditable(false);
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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Admission No : ");

        txtAgeGender.setEditable(false);

        txtWard.setEditable(false);

        txtAdmissionNumber.setEditable(false);

        txtBed.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Patient Name : ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ward Name : ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Age Gender : ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Bed : ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Primary Phy. : ");

        txtPrimaryPhy.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client name : ");

        txtClient.setEditable(false);
        txtClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtAdmissionNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName)
                            .addComponent(txtWard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBed, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtAgeGender)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText(" Fetus : ");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText(" Liquor : ");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Lie : ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText(" Placenta : ");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText(" LMP : ");

        txtLmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLmpMouseClicked(evt);
            }
        });
        txtLmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLmpActionPerformed(evt);
            }
        });

        txtAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAcMouseClicked(evt);
            }
        });
        txtAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText(" EDD : ");

        txtEdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEddMouseClicked(evt);
            }
        });
        txtEdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEddActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText(" Ultrasound E.D.D : ");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("FCA : ");

        txtGestationSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGestationSacMouseClicked(evt);
            }
        });
        txtGestationSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGestationSacActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText(" CERVIX : ");

        cboCervix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Closed","Open"}));
        cboCervix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCervixActionPerformed(evt);
            }
        });

        cboPlacenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Ant","Post","Fundal","Previa","Partial Previa","Low Lying"}));
        cboPlacenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPlacentaActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText(" Grade : ");

        cboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","0","1","2","3"}));
        cboGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGradeActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("CORD : ");

        cboCord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","3V","2V"}));
        cboCord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCordActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText(" Amniotic Fluid Volume :");

        cboAmnioticFluidVolume.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Normal","High Normal","Increased","Decreased"}));
        cboAmnioticFluidVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAmnioticFluidVolumeActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText(" Nuchal Translucency : ");

        txtNuchalTranslucency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuchalTranslucencyMouseClicked(evt);
            }
        });
        txtNuchalTranslucency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuchalTranslucencyActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText(" AC : ");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText(" Head Circumference : ");

        txtHeadCircumference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHeadCircumferenceMouseClicked(evt);
            }
        });
        txtHeadCircumference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeadCircumferenceActionPerformed(evt);
            }
        });

        txtUltrasoundEdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltrasoundEddActionPerformed(evt);
            }
        });

        txtConclusion.setColumns(20);
        txtConclusion.setRows(5);
        txtConclusion.setText("Conclusion/ Remarks");
        txtConclusion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConclusionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtConclusion);

        cboFetus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","1","2","3"}));
        cboFetus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFetusActionPerformed(evt);
            }
        });

        cboFca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","Normal","Abnormal"}));
        cboFca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFcaActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText(" Biparietal diameter :");

        txtBiparietalDiameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBiparietalDiameterMouseClicked(evt);
            }
        });
        txtBiparietalDiameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiparietalDiameterActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText(" CRL : ");

        txtCrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrlActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Presentation : ");

        cboLie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","L","O","T"}));
        cboLie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLieActionPerformed(evt);
            }
        });

        cboPresentation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","B","C"}));
        cboPresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPresentationActionPerformed(evt);
            }
        });

        cboLiquor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Adequate", ">", "<" }));
        cboLiquor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLiquorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText(" Femur Length :");

        txtFemur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFemurActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText(" Gestation Sac : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cboLiquor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboPlacenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBiparietalDiameter)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGestationSac, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFetus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboLie, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtLmp)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboCord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAc))
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboPresentation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboFca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdd)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addComponent(cboAmnioticFluidVolume, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFemur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeadCircumference, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuchalTranslucency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCervix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUltrasoundEdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboFetus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboFca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLiquor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAmnioticFluidVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBiparietalDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFemur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPlacenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGestationSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeadCircumference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuchalTranslucency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboCervix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltrasoundEdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Scans", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblGyaneeParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.","LMP","EDD", "Fetus", "FCA","HC", "AC",
                "Lie Presentation", "AFI", "BPD"
            }
        ));
        tblGyaneeParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMouseReleased(evt);
            }
        });
        tblGyaneeParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGyaneeParameterKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblGyaneeParameter);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 102, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFianlSign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFianlSign.setForeground(new java.awt.Color(0, 51, 153));
        btnFianlSign.setText("Final Sign");
        btnFianlSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFianlSignActionPerformed(evt);
            }
        });

        btnCopy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCopy.setForeground(new java.awt.Color(51, 102, 0));
        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFianlSign, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSave)
                .addComponent(btnClear)
                .addComponent(btnExit)
                .addComponent(btnFianlSign)
                .addComponent(btnCopy))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!chkFields()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Save the Patient Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSave.setIsFinal("N");
        objSave.setFianlBy("");
        objSave.setFianlDate("");
        objSave.setFianlTerminalId("");
        saveRecord();
        selectGayneeParameter(patientId, "");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
        btnSave.setEnabled(true);
        btnFianlSign.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFianlSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFianlSignActionPerformed

        if (!chkFields()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final the Patient Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSave.setIsFinal("Y");
        objSave.setFianlBy(Constants.userId);
        objSave.setFianlDate("SYSDATE");
        objSave.setFianlTerminalId(Constants.terminalId);
        saveRecord();
        selectGayneeParameter(patientId, "");
    }//GEN-LAST:event_btnFianlSignActionPerformed

    private void txtLmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLmpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLmpMouseClicked

    private void txtLmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLmpActionPerformed
        // TODO add your handling code here:
        txtEdd.requestFocus();
    }//GEN-LAST:event_txtLmpActionPerformed

    private void txtAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcMouseClicked

    private void txtAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcActionPerformed
        // TODO add your handling code here:
        txtNuchalTranslucency.requestFocus();

    }//GEN-LAST:event_txtAcActionPerformed

    private void txtEddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEddMouseClicked

    private void txtEddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEddActionPerformed
        // TODO add your handling code here:
        cboFetus.requestFocus();
    }//GEN-LAST:event_txtEddActionPerformed

    private void tblGyaneeParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblGyaneeParameterMouseClicked

    private void tblGyaneeParameterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterMousePressed

    private void tblGyaneeParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMouseReleased
        
        setBodyData(tblGyaneeParameter.getSelectedRow());
        setEnableFalse();
    }//GEN-LAST:event_tblGyaneeParameterMouseReleased

    private void tblGyaneeParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGyaneeParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterKeyReleased

    private void txtGestationSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestationSacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGestationSacMouseClicked

    private void txtGestationSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGestationSacActionPerformed
        txtHeadCircumference.requestFocus();
    }//GEN-LAST:event_txtGestationSacActionPerformed

    private void txtNuchalTranslucencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuchalTranslucencyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuchalTranslucencyMouseClicked

    private void txtNuchalTranslucencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuchalTranslucencyActionPerformed
        cboGrade.requestFocus();
    }//GEN-LAST:event_txtNuchalTranslucencyActionPerformed

    private void txtHeadCircumferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHeadCircumferenceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeadCircumferenceMouseClicked

    private void txtHeadCircumferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeadCircumferenceActionPerformed
        txtAc.requestFocus();
    }//GEN-LAST:event_txtHeadCircumferenceActionPerformed

    private void txtUltrasoundEddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltrasoundEddActionPerformed

        if (txtUltrasoundEdd.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        eddDate = dateFormat.format(txtUltrasoundEdd.getDate());
    }//GEN-LAST:event_txtUltrasoundEddActionPerformed

    private void txtBiparietalDiameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBiparietalDiameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiparietalDiameterMouseClicked

    private void txtBiparietalDiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiparietalDiameterActionPerformed
        txtFemur.requestFocus();
    }//GEN-LAST:event_txtBiparietalDiameterActionPerformed

    private void cboFcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFcaActionPerformed
        // TODO add your handling code here:
        cboLiquor.requestFocus();
    }//GEN-LAST:event_cboFcaActionPerformed

    private void cboFetusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFetusActionPerformed
        cboLie.requestFocus();
    }//GEN-LAST:event_cboFetusActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        // TODO add your handling code here:
        copyParameter();
        selectGayneeParameter(patientId, "");
    }//GEN-LAST:event_btnCopyActionPerformed

    private void cboAmnioticFluidVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAmnioticFluidVolumeActionPerformed
        txtBiparietalDiameter.requestFocus();
    }//GEN-LAST:event_cboAmnioticFluidVolumeActionPerformed

    private void cboPlacentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPlacentaActionPerformed
        txtCrl.requestFocus();
    }//GEN-LAST:event_cboPlacentaActionPerformed

    private void cboCordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCordActionPerformed
        cboCervix.requestFocus();
    }//GEN-LAST:event_cboCordActionPerformed

    private void cboGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGradeActionPerformed
        cboCord.requestFocus();
    }//GEN-LAST:event_cboGradeActionPerformed

    private void txtConclusionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConclusionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConclusionMouseClicked

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientActionPerformed

    private void cboLieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLieActionPerformed
        // TODO add your handling code here:
        cboPresentation.requestFocus();
    }//GEN-LAST:event_cboLieActionPerformed

    private void cboPresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPresentationActionPerformed
        // TODO add your handling code here:
        cboFca.requestFocus();
    }//GEN-LAST:event_cboPresentationActionPerformed

    private void cboLiquorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLiquorActionPerformed
        // TODO add your handling code here:
        cboAmnioticFluidVolume.requestFocus();
    }//GEN-LAST:event_cboLiquorActionPerformed

    private void txtFemurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFemurActionPerformed
        // TODO add your handling code here:
        cboPlacenta.requestFocus();
    }//GEN-LAST:event_txtFemurActionPerformed

    private void txtCrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrlActionPerformed
        // TODO add your handling code here:
        txtGestationSac.requestFocus();
    }//GEN-LAST:event_txtCrlActionPerformed

    private void cboCervixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCervixActionPerformed
        // TODO add your handling code here:
        txtUltrasoundEdd.requestFocus();
    }//GEN-LAST:event_cboCervixActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFianlSign;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboAmnioticFluidVolume;
    private javax.swing.JComboBox<String> cboCervix;
    private javax.swing.JComboBox<String> cboCord;
    private javax.swing.JComboBox<String> cboFca;
    private javax.swing.JComboBox<String> cboFetus;
    private javax.swing.JComboBox<String> cboGrade;
    private javax.swing.JComboBox<String> cboLie;
    private javax.swing.JComboBox<String> cboLiquor;
    private javax.swing.JComboBox<String> cboPlacenta;
    private javax.swing.JComboBox<String> cboPresentation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblGyaneeParameter;
    private javax.swing.JTextField txtAc;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtBiparietalDiameter;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextArea txtConclusion;
    private javax.swing.JTextField txtCrl;
    private javax.swing.JTextField txtEdd;
    private javax.swing.JTextField txtFemur;
    private javax.swing.JTextField txtGestationSac;
    private javax.swing.JTextField txtHeadCircumference;
    private javax.swing.JTextField txtLmp;
    private javax.swing.JTextField txtNuchalTranslucency;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrimaryPhy;
    private org.jdesktop.swingx.JXDatePicker txtUltrasoundEdd;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void setInsertData() {
        
        objSave.setPatientId(patientId);
        objSave.setReferenceId(referenceId);
        objSave.setLmp(txtLmp.getText().trim().replaceAll(",", " "));
        objSave.setEddDate(eddDate);
        objSave.setEdd(txtEdd.getText().trim().replaceAll(",", " "));
        objSave.setFemurLength(txtFemur.getText().trim().replaceAll(",", " "));
        objSave.setHeadCircumference(txtHeadCircumference.getText().trim().replaceAll(",", " "));
        objSave.setAc(txtAc.getText().trim().replaceAll(",", " "));
        objSave.setCrl(txtCrl.getText().trim().replaceAll(",", " "));
        objSave.setBiparietalDiameter(txtBiparietalDiameter.getText().trim().replaceAll(",", " "));
        objSave.setGestationSac(txtGestationSac.getText().trim().replaceAll(",", " "));
        objSave.setNuchalTranslucency(txtNuchalTranslucency.getText().trim().replaceAll(",", " "));
        objSave.setRemarks(txtConclusion.getText().trim().replaceAll(",", " "));
        objSave.setAmnioticFluidVolume(cboAmnioticFluidVolume.getSelectedItem().toString());
        objSave.setLiquor(cboLiquor.getSelectedItem().toString());
        objSave.setLie(cboLie.getSelectedItem().toString());
        objSave.setPresentation(cboPresentation.getSelectedItem().toString());
        objSave.setCervix(cboCervix.getSelectedItem().toString());
        objSave.setCord(cboCord.getSelectedItem().toString());
        objSave.setFca(cboFca.getSelectedItem().toString());
        objSave.setFetus(cboFetus.getSelectedItem().toString());
        objSave.setGrade(cboGrade.getSelectedItem().toString());
        objSave.setPlacenta(cboPlacenta.getSelectedItem().toString());

    }

    private void selectGayneeParameter(String patientId, String referenceId) {
        clear();
        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId, referenceId);
        if (!listGayneeParam.isEmpty()) {
            for (int i = 0; i < listGayneeParam.size(); i++) {
                gayneeParameterObj = listGayneeParam.get(i);
                if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
                    listFianlParameters.add(gayneeParameterObj);
                }
                if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("N")) {
                    setDataInTextBox();
                }
            }
            tblGyaneeParameter.setModel(new GynaeParameterListTableModel(listFianlParameters));
            ListSelectionModel selectionModel = tblGyaneeParameter.getSelectionModel();
            tblGyaneeParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setParameterListColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblGyaneeParameter);
        } else {
            System.out.println("Data is not Availabe of this Patient.");
        }
    }

    private void setParameterListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblGyaneeParameter.getColumnCount(); i++) {
            column = tblGyaneeParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(20);
            } else if (i == 3) {
                column.setPreferredWidth(20);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(15);
            } else if (i == 6) {
                column.setPreferredWidth(15);
            } else if (i == 7) {
                column.setPreferredWidth(15);
            } else if (i == 8) {
                column.setPreferredWidth(15);
            } else if (i == 9) {
                column.setPreferredWidth(15);
            }else if (i == 9) {
                column.setPreferredWidth(15);
            }else if (i == 10) {
                column.setPreferredWidth(15);
            }else if (i == 11) {
                column.setPreferredWidth(15);
            }else if (i == 12) {
                column.setPreferredWidth(15);
            }else if (i == 13) {
                column.setPreferredWidth(15);
            }else if (i == 14) {
                column.setPreferredWidth(15);
            }else if (i == 15) {
                column.setPreferredWidth(15);
            }else if (i == 16) {
                column.setPreferredWidth(15);
            }else if (i == 17) {
                column.setPreferredWidth(15);
            }else if (i == 18) {
                column.setPreferredWidth(15);
            }else if (i == 19) {
                column.setPreferredWidth(15);
            }
        }
    }

    private void setDataInTextBox() {

        if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
            return;
        }
        txtLmp.setText(gayneeParameterObj.getLmp());
        txtAc.setText(gayneeParameterObj.getAc());
        txtEdd.setText(gayneeParameterObj.getEdd());
        txtFemur.setText(gayneeParameterObj.getFemurLength());
        txtNuchalTranslucency.setText(gayneeParameterObj.getNuchalTranslucency());
        cboAmnioticFluidVolume.setSelectedItem(gayneeParameterObj.getAmnioticFluidVolume());
        cboLie.setSelectedItem(gayneeParameterObj.getLie());
        cboPresentation.setSelectedItem(gayneeParameterObj.getPresentation());
        cboCervix.setSelectedItem(gayneeParameterObj.getCervix());
        cboCord.setSelectedItem(gayneeParameterObj.getCord());
        cboFca.setSelectedItem(gayneeParameterObj.getFca());
        cboFetus.setSelectedItem(gayneeParameterObj.getFetus());
        cboGrade.setSelectedItem(gayneeParameterObj.getGrade());
        cboPlacenta.setSelectedItem(gayneeParameterObj.getPlacenta());
        cboLiquor.setSelectedItem(gayneeParameterObj.getLiquor());
        txtHeadCircumference.setText(gayneeParameterObj.getHeadCircumference());
        txtCrl.setText(gayneeParameterObj.getCrl());
        txtBiparietalDiameter.setText(gayneeParameterObj.getBiparietalDiameter());
        txtGestationSac.setText(gayneeParameterObj.getGestationSac());
        txtConclusion.setText(gayneeParameterObj.getRemarks());
    }

    private void saveRecord() {
        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId,
                referenceId);
        setInsertData();
        if (listGayneeParam.isEmpty()) {
            if (ctlGayneeParameter.insertGayneeParameters(objSave)) {
                JOptionPane.showMessageDialog(null, "Record save Sucesssfully");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
        if (!listGayneeParam.isEmpty()) {
            if (ctlGayneeParameter.updateGayneeParameters(objSave)) {
                JOptionPane.showMessageDialog(null, "Record save Sucesssfully");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
    }

    public void clear() {

        txtFemur.setText("");
        txtCrl.setText("");
        txtLmp.setText("");
        txtEdd.setText("");
        txtHeadCircumference.setText("");
        txtAc.setText("");
        txtBiparietalDiameter.setText("");
        txtGestationSac.setText("");
        txtNuchalTranslucency.setText("");
        txtConclusion.setText("");
        cboLiquor.setSelectedIndex(0);
        cboFetus.setSelectedIndex(0);
        cboFca.setSelectedIndex(0);
        cboAmnioticFluidVolume.setSelectedIndex(0);
        cboPlacenta.setSelectedIndex(0);
        cboCord.setSelectedIndex(0);
        cboGrade.setSelectedIndex(0);
        cboLie.setSelectedIndex(0);
        cboPresentation.setSelectedIndex(0);
        cboCervix.setSelectedIndex(0);
        listFianlParameters.clear();
        listGayneeParam.clear();
        tblGyaneeParameter.setModel(new GynaeParameterListTableModel(listGayneeParam));
    }

    private boolean chkFields() {
        boolean ret = true;
        if (txtLmp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter LMP");
            txtLmp.requestFocus();
            return false;
        }
        if (txtEdd.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter EDD");
            txtEdd.requestFocus();
            return false;
        }
        if (txtFemur.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Femur Length.");
            txtFemur.requestFocus();
            return false;
        }
//          if (cboFetus.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Fetus.");
//            cboFetus.requestFocus();
//            return false;
//        }
//          if (cboFca.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select FCA.");
//            cboFca.requestFocus();
//            return false;
//        }
//         if (txtHeadCircumference.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Head Circumference");
//            txtHeadCircumference.requestFocus();
//            return false;
//        }
//         if (txtAc.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter AC");
//            txtAc.requestFocus();
//            return false;
//        }
//         if (txtLiePresentation.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Lie/Presentation");
//            txtLiePresentation.requestFocus();
//            return false;
//        }
//         if (txtAfi.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter AFI");
//            txtAfi.requestFocus();
//            return false;
//         }
        if (txtBiparietalDiameter.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Biparietal Diameter");
            txtBiparietalDiameter.requestFocus();
        }
        try {
            Float.parseFloat(txtBiparietalDiameter.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtBiparietalDiameter.getText().trim()
                    + " is not a valid value for Biparietal Diameter");
            txtBiparietalDiameter.requestFocus();
            return false;
        }
         
//         if (txtLiquor.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Liquor");
//            txtLiquor.requestFocus();
//            return false;
//        }
          if (cboAmnioticFluidVolume.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly Select Amniotic FluidVolume.");
            cboAmnioticFluidVolume.requestFocus();
            return false;
        }
          if (cboPlacenta.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly Select Placenta.");
            cboPlacenta.requestFocus();
            return false;
        }
          
         if (txtGestationSac.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Gestation Sac");
            txtGestationSac.requestFocus();
            return false;
        }

        if (txtNuchalTranslucency.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Nuchal Translucency");
            txtNuchalTranslucency.requestFocus();
        }
        try {
            Float.parseFloat(txtNuchalTranslucency.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtNuchalTranslucency.getText().trim()
                    + " is not a valid value for Nuchal Translucencys");
            txtNuchalTranslucency.requestFocus();
            return false;
        }
        if (cboCord.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Cord.");
            cboCord.requestFocus();
            return false;
        }
        if (cboGrade.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly Select Grade.");
            cboGrade.requestFocus();
            return false;
        }
        if (cboCervix.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly Select Cervix.");
            cboCervix.requestFocus();
            return false;
        }
        return ret;
    }
    

    private void copyParameter() {
        if (listFianlParameters.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is nothing to Copy.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Copy Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSave = listFianlParameters.get(tblGyaneeParameter.getSelectedRow());
        objSave.setPatientId(patientId);
        objSave.setReferenceId(referenceId);
        objSave.setIsFinal("Y");
        objSave.setFianlBy(Constants.userId);
        objSave.setFianlDate("SYSDATE");
        objSave.setFianlTerminalId(Constants.terminalId);
        if (ctlGayneeParameter.insertGayneeParameters(objSave)) {
            JOptionPane.showMessageDialog(null, "Record Copy Sucesssfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Copy! Kindly contact "
                    + "Administrator.");
        }
        selectGayneeParameter(patientId, "");
    }

    private void setUltrasoundEddDate() {
        try {
            Date date = new Date();
            txtUltrasoundEdd.setDate(date);
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, 0);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtUltrasoundEdd.setDate(date2);
            eddDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setBodyData(int selectedRow) {

        gayneeParameterObj = listFianlParameters.get(tblGyaneeParameter.getSelectedRow());

        txtLmp.setText(gayneeParameterObj.getLmp());
        txtEdd.setText(gayneeParameterObj.getEdd());
        txtFemur.setText(gayneeParameterObj.getFemurLength());
        txtHeadCircumference.setText(gayneeParameterObj.getHeadCircumference());
        txtAc.setText(gayneeParameterObj.getAc());
        txtCrl.setText(gayneeParameterObj.getCrl());
        txtBiparietalDiameter.setText(gayneeParameterObj.getBiparietalDiameter());
        txtGestationSac.setText(gayneeParameterObj.getGestationSac());
        cboFetus.setSelectedItem(gayneeParameterObj.getFetus());
        cboFca.setSelectedItem(gayneeParameterObj.getFca());
        cboAmnioticFluidVolume.setSelectedItem(gayneeParameterObj.getAmnioticFluidVolume());
        cboPlacenta.setSelectedItem(gayneeParameterObj.getPlacenta());
        cboCord.setSelectedItem(gayneeParameterObj.getCord());
        cboGrade.setSelectedItem(gayneeParameterObj.getGrade());
        cboCervix.setSelectedItem(gayneeParameterObj.getCervix());
        cboLie.setSelectedItem(gayneeParameterObj.getLie());
        cboPresentation.setSelectedItem(gayneeParameterObj.getPresentation());
        cboLiquor.setSelectedItem(gayneeParameterObj.getLiquor());
        txtNuchalTranslucency.setText(gayneeParameterObj.getNuchalTranslucency());
        txtConclusion.setText(gayneeParameterObj.getRemarks());
    }

    private void setDemography(PatientHospitalVisit patVisit) {
        patientId = patVisit.getPatientId();
        referenceId = patVisit.getConsultancyId();
        txtPatientId.setText(patientId);
        txtAdmissionNumber.setText(patVisit.getAdmissionNumber());
        txtPatientName.setText(patVisit.getPatientName());
        txtAgeGender.setText(patVisit.getAge()
                + "/ " + patVisit.getGenderDescription());
        txtWard.setText(patVisit.getWardDescription());
        txtBed.setText(patVisit.getBedDescription());
        txtPrimaryPhy.setText(patVisit.getPrimaryPhysicianName());
        txtClient.setText(patVisit.getClientName());
    }

    private void setEnableFalse() {
        btnSave.setEnabled(false);
        btnFianlSign.setEnabled(false); 
        txtLmp.setEditable(false);
        txtEdd.setEditable(false);
        cboFetus.setEnabled(false);
        cboLie.setEnabled(false);
        cboPresentation.setEnabled(false);
        cboFca.setEnabled(false);
        cboLiquor.setEnabled(false);
        cboAmnioticFluidVolume.setEnabled(false);
        txtBiparietalDiameter.setEditable(false);
        txtFemur.setEditable(false);
        cboPlacenta.setEnabled(false);
        txtCrl.setEditable(false);
        txtGestationSac.setEditable(false);
        txtHeadCircumference.setEditable(false);
        txtAc.setEditable(false);    
        txtNuchalTranslucency.setEditable(false);
        txtConclusion.setEditable(false);
        cboGrade.setEnabled(false);
        cboCervix.setEnabled(false);
        cboCord.setEnabled(false);
    }
}
