package CardiacRegistry.Form;

import CardiacRegistry.BO.CardiacSurgeryBO;
import BO.Patient;
import CardiacRegistry.BO.OutsidePatientRegistry;
import CardiacRegistry.Controller.CardiacSurgeryController;
import Form.general.DCMS_MDI;
import CardiacRegistry.TableModel.PatientListTableModel;
import java.awt.Dimension;
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
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class CardiacSurgeryRegistry extends javax.swing.JInternalFrame {

    OutsidePatientRegistry patient = new OutsidePatientRegistry();
    DisplayLOV lov = new DisplayLOV();
    CardiacSurgeryBO cardiacSurgery = new CardiacSurgeryBO();
    CardiacSurgeryBO cardiacSurgeryDetail = new CardiacSurgeryBO();
    CardiacSurgeryController ctlCardiacSurg = new CardiacSurgeryController();
    private String cardiacId = "";
    private String surgeryDate = "";
    private String patientId = "2254";
    private String wardId = "";
    private String consultantSurgeonId = "";
    private String consultantCardiologistId = "";
    private String admittingConsultantd = "";
    private String categoryId = "";
    List<OutsidePatientRegistry> lisPatient = new ArrayList();
    private String instituteId = "";

    public CardiacSurgeryRegistry() {
        initComponents();
        this.setSize(Constants.xSize + 220, Constants.ySize - 40);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnEdit.setMnemonic(KeyEvent.VK_E);
        btnFinal.setMnemonic(KeyEvent.VK_F);
        setDateOfSurgery(0);
        setPatientInfo(patientId);
        setCardiacRegistryDetail();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPatFullNmae = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtContactPerName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtContactPerContactNo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtContactPerAddress = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatientsList = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtFilterPatId = new javax.swing.JTextField();
        txtFilterPatName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtInstitute = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtAdmissionDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel19 = new javax.swing.JLabel();
        txtConsultantSurgeon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtConsultantCardiologist = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtWard = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtCategory = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtAdmittingConsultant = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Cardiac Surgery Form");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1220, 810));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Surgery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id : ");

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Full Name : ");

        txtPatFullNmae.setEditable(false);
        txtPatFullNmae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatFullNmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatFullNmaeActionPerformed(evt);
            }
        });

        txtAgeGender.setEditable(false);
        txtAgeGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAgeGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeGenderActionPerformed(evt);
            }
        });

        txtContactNo.setEditable(false);
        txtContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Nationality :");

        txtNationality.setEditable(false);
        txtNationality.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationalityActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Contact No : ");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("City : ");

        txtCity.setEditable(false);
        txtCity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        txtAddress.setEditable(false);
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtContactNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtPatFullNmae)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatFullNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Person Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Full Name : ");
        jLabel24.setPreferredSize(new java.awt.Dimension(86, 17));

        txtContactPerName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContactPerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactPerNameActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Contact No :");

        txtContactPerContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Address :");

        txtContactPerAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactPerName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactPerContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactPerAddress))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContactPerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContactPerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContactPerContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registred Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPatientsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Patient Id","Full Name",
                "Age","Contact No" }
        ));
        tblPatientsList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPatientsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsListMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientsListMouseReleased(evt);
            }
        });
        tblPatientsList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientsListKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblPatientsList);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Patient Id : ");

        txtFilterPatId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFilterPatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterPatIdActionPerformed(evt);
            }
        });

        txtFilterPatName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Institute : ");

        txtInstitute.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstituteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilterPatId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilterPatName))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInstitute)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilterPatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilterPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Surgery Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Adm. Date : ");

        txtAdmissionDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAdmissionDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionDateActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Consultant Surgeon : ");

        txtConsultantSurgeon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtConsultantSurgeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultantSurgeonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("+");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Consultant Cardiologist : ");

        txtConsultantCardiologist.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtConsultantCardiologist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultantCardiologistActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("+");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Ward/ Area : ");

        txtWard.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("+");

        txtCategory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Category : ");

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("+");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Admitting Consultant : ");

        txtAdmittingConsultant.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAdmittingConsultant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmittingConsultantActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("+");

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Brief Remarks of Surgery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtWard)
                            .addComponent(txtAdmissionDate, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txtCategory))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdmittingConsultant, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtConsultantSurgeon)
                            .addComponent(txtConsultantCardiologist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultantCardiologist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultantSurgeon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmittingConsultant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        btnEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 204, 102));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFinal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFinal.setForeground(new java.awt.Color(0, 204, 102));
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnSave)
                    .addComponent(btnFinal)
                    .addComponent(btnEdit)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatFullNmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatFullNmaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatFullNmaeActionPerformed

    private void txtAgeGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeGenderActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNationalityActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAdmissionDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionDateActionPerformed
        // TODO add your handling code here:
        if (txtAdmissionDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        surgeryDate = dateFormat.format(txtAdmissionDate.getDate());
        txtConsultantSurgeon.requestFocus();
    }//GEN-LAST:event_txtAdmissionDateActionPerformed

    private void txtConsultantSurgeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultantSurgeonActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtConsultantSurgeon.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtConsultantSurgeon.setText("");
            consultantSurgeonId = "";
        }
        txtConsultantSurgeon.setText(Constants.lovDescription);
        consultantSurgeonId = Constants.lovID;
        txtWard.requestFocus();
    }//GEN-LAST:event_txtConsultantSurgeonActionPerformed

    private void txtConsultantCardiologistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultantCardiologistActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtConsultantCardiologist.getText().trim(), this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            consultantCardiologistId = "";
            return;
        }
        txtConsultantCardiologist.setText(Constants.lovDescription);
        consultantCardiologistId = Constants.lovID;
        txtCategory.requestFocus();
    }//GEN-LAST:event_txtConsultantCardiologistActionPerformed

    private void txtWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM            \n"
                + Database.DCMS.ward + "                       \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtWard.getText().toUpperCase().trim() + "%' \n"
                + " AND ACTIVE = 'Y'                           \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            wardId = "";
            return;
        }
        wardId = Constants.lovID;
        txtWard.setText(Constants.lovDescription);
        txtConsultantCardiologist.requestFocus();
    }//GEN-LAST:event_txtWardActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.category, txtCategory.getText().trim(), this);
        categoryId = Constants.lovID;
        txtCategory.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtAdmittingConsultantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmittingConsultantActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cardiacPhysician,
                txtAdmittingConsultant.getText().trim(), this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            admittingConsultantd = "";
            return;
        }
        txtAdmittingConsultant.setText(Constants.lovDescription);
        admittingConsultantd = Constants.lovID;
        txtCategory.requestFocus();
    }//GEN-LAST:event_txtAdmittingConsultantActionPerformed

    private void txtContactPerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactPerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactPerNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveCardiacSurgeryInformation();
        if (ctlCardiacSurg.insertCardiacRegisteryMaster(cardiacSurgery)) {
            JOptionPane.showMessageDialog(null, "Surgery Information Save successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Surgery Information.\n"
                    + "Kindly Contact Support Person.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblPatientsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsListMouseClicked

        if (tblPatientsList.getSelectedRow() < 0 || lisPatient.isEmpty()) {
            return;
        }
        patient = lisPatient.get(tblPatientsList.getSelectedRow());
        setPatientInfo(patient);
    }//GEN-LAST:event_tblPatientsListMouseClicked

    private void tblPatientsListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsListMouseReleased

        if (tblPatientsList.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Please Registered the Patient.");
            return;
        }
        OutsidePatientRegistry pat = lisPatient.get(tblPatientsList.getSelectedRow());

        if (evt.getClickCount() % 2 == 0) {
            if (cardiacSurgeryDetail == null) {
                JOptionPane.showMessageDialog(null, "Please Final the Surgery "
                        + "Information Prior to Examine the Patient.");
                return;
            }
            if (cardiacSurgeryDetail.getIsFinal().equalsIgnoreCase("Y")) {
                CardiacSurgeryDetailFormRaheel fm = new CardiacSurgeryDetailFormRaheel(pat.getId());
                DCMS_MDI.desktopPane.add(fm);
                Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
                Dimension fmSize = fm.getSize();
                fm.setLocation((desktopSize.width - fmSize.width) / 2,
                        (desktopSize.height - fmSize.height) / 2);
                fm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please Final the Surgery "
                        + "Information Prior to Examine the Patient.");
            }

        }
    }//GEN-LAST:event_tblPatientsListMouseReleased

    private void tblPatientsListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientsListKeyReleased
        // this.currentRecord = tablePatients.getSelectedRow();
        // setRowData();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientsListKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtFilterPatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterPatIdActionPerformed
        // TODO add your handling code here:
        setPatientInfo(txtFilterPatId.getText().trim());
    }//GEN-LAST:event_txtFilterPatIdActionPerformed

    private void txtInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstituteActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.institute,
                txtInstitute.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtInstitute.setText("");
            instituteId = "";
            return;

        } else {
            instituteId = Constants.lovID;
            txtInstitute.setText(Constants.lovDescription.toUpperCase());
            setPatientInfo(patient);
        }
    }//GEN-LAST:event_txtInstituteActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final.\nDo you want to Final?");
        if (confirmation != 0) {
            return;
        }
        saveCardiacSurgeryInformation();
        cardiacSurgery.setIsFinal("Y");
        cardiacSurgery.setFinalBy(Constants.userId);
        cardiacSurgery.setFinalDate(Constants.today);
        cardiacSurgery.setFinalTerminalId(Constants.terminalId);
        if (ctlCardiacSurg.FinalCardiacRegisteryMaster(cardiacSurgery)) {
            JOptionPane.showMessageDialog(null, "Surgery Information Save successfully.");
            setCardiacRegistryDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update Surgery Information.\n"
                    + "Kindly Contact Support Person.");
        }
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        saveCardiacSurgeryInformation();
        if (ctlCardiacSurg.updateCardiacRegisteryMaster(cardiacSurgery)) {
            JOptionPane.showMessageDialog(null, "Surgery Information Edit successfully.");
            setCardiacRegistryDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Edit Surgery Information.\n"
                    + "Kindly Contact Support Person.");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtAddress.setText("");
        txtAdmittingConsultant.setText("");
        txtAgeGender.setText("");
        txtCategory.setText("");
        txtCity.setText("");
        txtConsultantCardiologist.setText("");
        txtConsultantSurgeon.setText("");
        txtContactNo.setText("");
        txtContactPerAddress.setText("");
        txtContactPerContactNo.setText("");
        txtContactPerName.setText("");
        txtFilterPatId.setText("");
        txtFilterPatName.setText("");
        txtInstitute.setText("");
        txtNationality.setText("");
        txtPatFullNmae.setText("");
        txtRemarks.setText("");
        txtWard.setText("");
        lisPatient.clear();
        tblPatientsList.setModel(new PatientListTableModel(lisPatient));
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblPatientsList;
    private javax.swing.JTextArea txtAddress;
    private org.jdesktop.swingx.JXDatePicker txtAdmissionDate;
    private javax.swing.JTextField txtAdmittingConsultant;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtConsultantCardiologist;
    private javax.swing.JTextField txtConsultantSurgeon;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtContactPerAddress;
    private javax.swing.JTextField txtContactPerContactNo;
    private javax.swing.JTextField txtContactPerName;
    private javax.swing.JTextField txtFilterPatId;
    private javax.swing.JTextField txtFilterPatName;
    private javax.swing.JTextField txtInstitute;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPatFullNmae;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void setPatientInfo(String patientId) {
        lisPatient = ctlCardiacSurg.selectPateitnInformation(patientId,
                txtFilterPatName.getText().trim(), instituteId);
        if (lisPatient.isEmpty()) {
            List<OutsidePatientRegistry> lisPatient = new ArrayList<>();
            lisPatient.add(new OutsidePatientRegistry());
            tblPatientsList.setModel(new PatientListTableModel(lisPatient));
            return;
        }
        tblPatientsList.setModel(new PatientListTableModel(lisPatient));
        ListSelectionModel selectionModel = tblPatientsList.getSelectionModel();
        tblPatientsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPatientInfoColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPatientsList);
        OutsidePatientRegistry pat = lisPatient.get(0);
        setPatientInfo(pat);

    }

    private void saveCardiacSurgeryInformation() {
        cardiacSurgery.setId(cardiacId);
        cardiacSurgery.setPatientId(patientId);
        cardiacSurgery.getAdmissionNo();
        cardiacSurgery.setDateOfSurgery(surgeryDate);
        cardiacSurgery.setCategoryId(categoryId);
        cardiacSurgery.setWardId(wardId);
        cardiacSurgery.setConsultantCardiologistId(consultantCardiologistId);
        cardiacSurgery.setAdmittingConsultantId(admittingConsultantd);
        cardiacSurgery.setConsultantSurgeonId(consultantSurgeonId);
        cardiacSurgery.setRemarks(txtRemarks.getText().trim());
        cardiacSurgery.setContactPerName(txtContactPerName.getText().trim());
        cardiacSurgery.setContactPerContactNo(txtContactPerContactNo.getText().trim());
        cardiacSurgery.setContactPerAddress(txtContactPerAddress.getText().trim());
    }

    private void setPatientInfoColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPatientsList.getColumnCount(); i++) {
            column = tblPatientsList.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void setCardiacRegistryDetail() {
        cardiacSurgeryDetail = ctlCardiacSurg.selectCardiacSurgDetail(cardiacId);
        if (cardiacSurgeryDetail == null) {
            return;
        }
        txtContactPerAddress.setText(cardiacSurgeryDetail.getContactPerAddress());
        txtContactPerName.setText(cardiacSurgeryDetail.getContactPerName());
        txtContactPerContactNo.setText(cardiacSurgeryDetail.getContactPerContactNo());
        txtConsultantCardiologist.setText(cardiacSurgeryDetail.getConsultantCardiologistName());
        txtConsultantSurgeon.setText(cardiacSurgeryDetail.getConsultantSurgeonName());
        txtAdmittingConsultant.setText(cardiacSurgeryDetail.getAdmittingConsultantName());
        txtCategory.setText(cardiacSurgeryDetail.getCategoryDescription());
        txtRemarks.setText(cardiacSurgeryDetail.getRemarks());
        txtWard.setText(cardiacSurgeryDetail.getWardDescription());
        setDateOfSurgery(Integer.parseInt(cardiacSurgeryDetail.getDayOfSurgery()));
        cardiacId = cardiacSurgeryDetail.getId();
        wardId = cardiacSurgeryDetail.getWardId();
        categoryId = cardiacSurgeryDetail.getCategoryId();
        System.err.println("Categry" + categoryId);
        patientId = cardiacSurgeryDetail.getPatientId();
        consultantCardiologistId = cardiacSurgeryDetail.getConsultantCardiologistId();
        consultantSurgeonId = cardiacSurgeryDetail.getConsultantSurgeonId();
        admittingConsultantd = cardiacSurgeryDetail.getAdmittingConsultantId();
        if (cardiacSurgeryDetail.getIsFinal().equalsIgnoreCase("Y")) {
            btnEdit.setEnabled(false);
            btnFinal.setEnabled(false);
            btnSave.setEnabled(false);
        }
    }

    private void setDateOfSurgery(int day) {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtAdmissionDate.setDate(date2);
            surgeryDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setPatientInfo(OutsidePatientRegistry patient) {
        txtInstitute.setText(patient.getInstituteDescription());
        cardiacId = patient.getId();
        txtPatientId.setText(patient.getPatientId().substring(3));
        txtPatFullNmae.setText(patient.getPatientFullName());
        txtAgeGender.setText(patient.getAge() + " / " + patient.getGender());
        txtContactNo.setText(patient.getContactNo());
        txtAddress.setText(patient.getAddress());
        txtNationality.setText(patient.getCity());
        txtCity.setText(patient.getCity());
        txtInstitute.setText(patient.getInstituteDescription());
    }

}
