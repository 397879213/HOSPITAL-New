package CardiacRegistry.Form;

import CardiacRegistry.BO.OutsidePatientRegistry;
import CardiacRegistry.Controller.OutsidePatientRegistryController;
//import static Form.patient.frmPatientRegistration.patientAge;
//import static Form.patient.frmPatientRegistration.patientContactNo;
//import static Form.patient.frmPatientRegistration.patientFirstName;
//import static Form.patient.frmPatientRegistration.patientLastName;
import CardiacRegistry.TableModel.OutsidePatientTableModel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperReport;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.Status;

public class frmOutsidePatientRegistration extends javax.swing.JInternalFrame {

//    Webcam webcam = null;
//    WebcamPanel panel;
    DisplayLOV lov = new DisplayLOV();
    private String priPhysicianId;

    public frmOutsidePatientRegistration() {

        initComponents();
//        txtFirstName.setText(patientFirstName.trim());
//        txtLastName.setText(patientLastName.trim());
//        txtContactNo.setText(patientContactNo.trim());
//        txtAge.setText(patientAge.trim());
        txtFirstName.requestFocusInWindow();
        txtFirstName.setCaretPosition(0);
        this.setSize(Constants.xSize + 250, Constants.ySize - 170);
        btnRegister.setMnemonic(KeyEvent.VK_S);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        setDateOfBirth(0);
        setDateOfRegistration(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel()
        ;
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchPatientId = new javax.swing.JTextField();
        txtSearchPatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearchContactNo = new javax.swing.JTextField();
        txtSearchCNIC = new javax.swing.JTextField();
        btntsearchPatient = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtSearchPhysician = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtSearchToDate = new org.jdesktop.swingx.JXDatePicker();
        txtSearchFromDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOutsidePatients = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lblContactNo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblContactNo2 = new javax.swing.JLabel();
        txtInstitute = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRegistrationDate = new org.jdesktop.swingx.JXDatePicker();
        lblContactNo3 = new javax.swing.JLabel();
        txtGuardian = new javax.swing.JTextField();
        lblContactNo4 = new javax.swing.JLabel();
        txtRelation = new javax.swing.JTextField();
        txtPriPhysician = new javax.swing.JTextField();
        lblContactNo5 = new javax.swing.JLabel();
        lblContactNo6 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboAge = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtCNIC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtHusbandName = new javax.swing.JTextField();
        txtMaritalStatus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtReligion = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtDOB = new org.jdesktop.swingx.JXDatePicker();
        cboGender = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPatientUpdate = new javax.swing.JButton();
        btnExitForm = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Patient Registration");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1237, 630));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient Id : ");

        jLabel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Patient Name : ");

        txtSearchPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientIdActionPerformed(evt);
            }
        });

        txtSearchPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientNameActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Contact # : ");

        jLabel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("C.N.I.C # : ");

        txtSearchContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchContactNoActionPerformed(evt);
            }
        });

        txtSearchCNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCNICActionPerformed(evt);
            }
        });

        btntsearchPatient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btntsearchPatient.setText("Search");
        btntsearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntsearchPatientActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Registration : ");

        txtSearchPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPhysicianActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Physician : ");

        jLabel32.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Between : ");

        txtSearchToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchToDateActionPerformed(evt);
            }
        });

        txtSearchFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFromDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchPatientName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearchFromDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtSearchPatientId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addComponent(txtSearchPhysician))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchContactNo)
                            .addComponent(txtSearchCNIC)
                            .addComponent(txtSearchToDate, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btntsearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txtSearchCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel32)
                            .addComponent(txtSearchToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtSearchPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntsearchPatient))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblOutsidePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Patient Id","Full Name",
                "Age","Contact No" }
        ));
        tblOutsidePatients.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblOutsidePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOutsidePatientsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOutsidePatientsMouseReleased(evt);
            }
        });
        tblOutsidePatients.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOutsidePatientsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblOutsidePatients);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblContactNo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo1.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo1.setText("Address : ");

        txtAddress.setColumns(20);
        txtAddress.setLineWrap(true);
        txtAddress.setRows(4);
        txtAddress.setTabSize(3);
        txtAddress.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAddress);

        lblContactNo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo2.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo2.setText("Institute : ");

        txtInstitute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstituteActionPerformed(evt);
            }
        });
        txtInstitute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInstituteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInstituteKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Reg Date : ");

        txtRegistrationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrationDateActionPerformed(evt);
            }
        });

        lblContactNo3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo3.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo3.setText("Guardian Name : ");

        txtGuardian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGuardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardianActionPerformed(evt);
            }
        });
        txtGuardian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGuardianKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGuardianKeyTyped(evt);
            }
        });

        lblContactNo4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo4.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo4.setText("Relation : ");

        txtRelation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationActionPerformed(evt);
            }
        });
        txtRelation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRelationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRelationKeyTyped(evt);
            }
        });

        txtPriPhysician.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPriPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriPhysicianActionPerformed(evt);
            }
        });
        txtPriPhysician.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriPhysicianKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriPhysicianKeyTyped(evt);
            }
        });

        lblContactNo5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo5.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo5.setText("Pri Physician : ");

        lblContactNo6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo6.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo6.setText("Category : ");

        txtCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });
        txtCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoryKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoryKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(lblContactNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContactNo6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addComponent(txtInstitute)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtGuardian, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblContactNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRelation))
                    .addComponent(txtPriPhysician)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuardian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo6))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblContactNo1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name : ");

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFirstName.setNextFocusableComponent(txtLastName);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Age : ");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.setNextFocusableComponent(txtLastName);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("DOB : ");

        jLabel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Gender : ");

        jLabel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No : ");

        txtContactNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Last Name : ");

        cboAge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "M", "D" }));
        cboAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAgeActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Patient Id : ");

        txtPatientId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPatientId.setNextFocusableComponent(txtLastName);
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        txtPatientId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatientIdKeyTyped(evt);
            }
        });

        txtCNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNICActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("C.N.I.C : ");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Father Name : ");

        txtFatherName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Husband Name : ");

        txtHusbandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHusbandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHusbandNameActionPerformed(evt);
            }
        });
        txtHusbandName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHusbandNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHusbandNameKeyTyped(evt);
            }
        });

        txtMaritalStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaritalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaritalStatusActionPerformed(evt);
            }
        });
        txtMaritalStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaritalStatusKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaritalStatusKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Marital Status : ");

        txtReligion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReligionActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Religion : ");

        lblContactNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(102, 0, 0));
        lblContactNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNo.setText("Blood Group : ");

        txtBloodGroup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });
        txtBloodGroup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBloodGroupKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBloodGroupKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("City : ");

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Nuteral" }));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientId)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAge, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFatherName)
                    .addComponent(txtReligion)
                    .addComponent(txtFirstName)
                    .addComponent(txtBloodGroup)
                    .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLastName)
                    .addComponent(txtContactNo)
                    .addComponent(txtCNIC)
                    .addComponent(txtHusbandName)
                    .addComponent(txtMaritalStatus)
                    .addComponent(txtCity)
                    .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtAge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(cboAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(txtPatientId)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHusbandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtMaritalStatus)))
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setPreferredSize(new java.awt.Dimension(80, 60));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(80, 60));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(80, 60));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnPatientUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPatientUpdate.setText("Update");
        btnPatientUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientUpdateActionPerformed(evt);
            }
        });

        btnExitForm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExitForm.setForeground(new java.awt.Color(255, 0, 0));
        btnExitForm.setText("Exit");
        btnExitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPatientUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitForm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnPatientUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExitForm))
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        if (txtFirstName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter First Name ");
            txtFirstName.setBackground(Color.red);
            return;

        }
        if (txtCNIC.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter CNIC ");
            txtCNIC.setBackground(Color.red);
            return;

        }
        if (txtPatientId.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Patient ID ");
            txtPatientId.setBackground(Color.red);

            return;

        }
        if (txtAge.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Age ");
            txtAge.setBackground(Color.red);

            return;

        }
        if (txtContactNo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter contactNo ");
            txtContactNo.setBackground(Color.red);
            return;

        }
        insertOutsidePatientRegister();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed

        txtDOB.requestFocus();

    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        txtLastName.requestFocus();
     }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        txtAge.requestFocus();
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtCNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNICActionPerformed

        txtFatherName.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNICActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed

        txtPatientId.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtHusbandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHusbandNameActionPerformed

        txtReligion.requestFocus();

        // TODO add your handling code here:
}//GEN-LAST:event_txtHusbandNameActionPerformed

    private void txtHusbandNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHusbandNameKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtHusbandNameKeyPressed

    private void txtHusbandNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHusbandNameKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_txtHusbandNameKeyTyped

    private void txtReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReligionActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.religion, txtReligion.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtReligion.setText("");
            religionId = "";

        } else {
            religionId = Constants.lovID;
            txtReligion.setText(Constants.lovDescription.toUpperCase());
        }
        //txtType.requestFocus();

        txtMaritalStatus.requestFocus();
    }//GEN-LAST:event_txtReligionActionPerformed

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
        txtHusbandName.requestFocus();
}//GEN-LAST:event_txtFatherNameActionPerformed

    private void txtMaritalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaritalStatusActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.maritalStatus,
                txtMaritalStatus.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtMaritalStatus.setText("");
            maritalStatusId = "";

        } else {
            maritalStatusId = Constants.lovID;
            txtMaritalStatus.setText(Constants.lovDescription.toUpperCase());
        }
        txtBloodGroup.requestFocus();
        // TODO add your handling code here:
}//GEN-LAST:event_txtMaritalStatusActionPerformed

    private void txtMaritalStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaritalStatusKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtMaritalStatusKeyPressed

    private void txtMaritalStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaritalStatusKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_txtMaritalStatusKeyTyped

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.bloodGroup, txtBloodGroup.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtBloodGroup.setText("");
            bloodGroupId = "";

        } else {
            bloodGroupId = Constants.lovID;
            txtBloodGroup.setText(Constants.lovDescription.toUpperCase());
        }
        // TODO add your handling code here:

        txtCity.requestFocus();
}//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtBloodGroupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodGroupKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtBloodGroupKeyPressed

    private void txtBloodGroupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodGroupKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_txtBloodGroupKeyTyped

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.city, txtCity.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtCity.setText("");
            cityId = "";

        } else {
            cityId = Constants.lovID;
            txtCity.setText(Constants.lovDescription.toUpperCase());
        }
        txtGuardian.requestFocus();
        // TODO add your handling code here:
}//GEN-LAST:event_txtCityActionPerformed

    private void tblOutsidePatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutsidePatientsMouseClicked

}//GEN-LAST:event_tblOutsidePatientsMouseClicked

    private void tblOutsidePatientsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOutsidePatientsKeyReleased
        // this.currentRecord = tablePatients.getSelectedRow();
        // setRowData();
        // TODO add your handling code here:
}//GEN-LAST:event_tblOutsidePatientsKeyReleased

    private void btntsearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntsearchPatientActionPerformed

        patientId = txtSearchPatientId.getText();
        contactNo = txtSearchContactNo.getText();
        patientId = txtSearchPatientId.getText();
        cnic = txtSearchCNIC.getText();
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
//         fromDate = dateFormat.format(txtSearchFromDate.getDate());
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        //toDate = dateFormat.format(txtSearchToDate.getDate());
        physician = txtSearchPhysician.getText();
        searchPatient(patientId, contactNo, patName, cnic, fromDate, toDate, physician);


    }//GEN-LAST:event_btntsearchPatientActionPerformed

    private void tblOutsidePatientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutsidePatientsMouseReleased

        if (tblOutsidePatients.getSelectedRow() < 0 || listPatRegistryData.isEmpty()) {
            return;
        }

        outsidePatRegistry = listPatRegistryData.get(
                tblOutsidePatients.getSelectedRow());
        Id = outsidePatRegistry.getId();
        religionId = outsidePatRegistry.getReligionId();
        cityId = outsidePatRegistry.getCityId();
        bloodGroupId = outsidePatRegistry.getBloodGroupId();
        maritalStatusId = outsidePatRegistry.getMaritalStatusId();
        relationId = outsidePatRegistry.getRelationId();
        instituteId = outsidePatRegistry.getInstituteId();
        categoryId = outsidePatRegistry.getCategoryId();
        priPhysicianId = outsidePatRegistry.getPrimaryPhysicianId();
        setDateOfBirth(Integer.parseInt(outsidePatRegistry.getDayOfBirth()));
        setDateOfRegistration(Integer.parseInt(outsidePatRegistry.getDayOfRegistration()));
        txtFirstName.setText(outsidePatRegistry.getPatientFirstName().trim());
        txtLastName.setText(outsidePatRegistry.getPatientLastName().trim());
        txtAge.setText(outsidePatRegistry.getAge().trim());
        //txtDOB.se
        cboGender.setSelectedItem(outsidePatRegistry.getGender());
        txtContactNo.setText(outsidePatRegistry.getContactNo().trim());
        txtPatientId.setText(outsidePatRegistry.getPatientId().trim());
        txtCNIC.setText(outsidePatRegistry.getCnic().trim());
        txtFatherName.setText(outsidePatRegistry.getFatherName().trim());
        txtHusbandName.setText(outsidePatRegistry.getHusbandName().trim());
        txtReligion.setText(outsidePatRegistry.getReligion().trim());
        txtBloodGroup.setText(outsidePatRegistry.getBloodGroup().trim());
        txtMaritalStatus.setText(outsidePatRegistry.getMaritalStatus().trim());
        txtCity.setText(outsidePatRegistry.getCity().trim());
        txtRelation.setText(outsidePatRegistry.getRelation().trim());
        txtGuardian.setText(outsidePatRegistry.getGuardian().trim());
        txtPriPhysician.setText(outsidePatRegistry.getPrimaryPhysician().trim());
        txtAddress.setText(outsidePatRegistry.getAddress().trim());
        txtInstitute.setText(outsidePatRegistry.getInstitute().trim());
        txtCategory.setText(outsidePatRegistry.getCategory().trim());
        //txtInstitute.setText(outsidePatRegistry.getInstitute().trim());

    }//GEN-LAST:event_tblOutsidePatientsMouseReleased

    private void btnPatientUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientUpdateActionPerformed

        outsidePatRegistry.setId(Id);
        outsidePatRegistry.setPatientFirstName(txtFirstName.getText());
        outsidePatRegistry.setPatientLastName(txtLastName.getText());
        outsidePatRegistry.setAge(txtAge.getText());
        outsidePatRegistry.setDob(dob);
        outsidePatRegistry.setRegistrationDate(regDate);
        outsidePatRegistry.setContactNo(txtContactNo.getText());
        outsidePatRegistry.setPatientId(txtPatientId.getText());
        outsidePatRegistry.setCnic(txtCNIC.getText());
        outsidePatRegistry.setFatherName(txtFatherName.getText());
        outsidePatRegistry.setHusbandName(txtHusbandName.getText());
        outsidePatRegistry.setMaritalStatusId(maritalStatusId);
        outsidePatRegistry.setBloodGroupId(bloodGroupId);
        outsidePatRegistry.setCityId(cityId);
        outsidePatRegistry.setReligionId(religionId);
        outsidePatRegistry.setGuardian(txtGuardian.getText());
        outsidePatRegistry.setRelationId(relationId);
        outsidePatRegistry.setInstituteId(instituteId);
        outsidePatRegistry.setCategoryId(categoryId);
        outsidePatRegistry.setPrimaryPhysician(txtPriPhysician.getText());
        outsidePatRegistry.setAddress(txtAddress.getText());
        if (cboGender.getSelectedIndex() == 0) {
            outsidePatRegistry.setGender("1");
        } else {
            outsidePatRegistry.setGender("2");
        }
        if (ctlPatRegistry.updateOutsidePatientData(outsidePatRegistry)) {
            JOptionPane.showMessageDialog(null, "Patient Data Successfully Updated");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update Data");
        }

        //clear();

    }//GEN-LAST:event_btnPatientUpdateActionPerformed

    private void txtSearchPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientIdActionPerformed
        patientId = txtSearchPatientId.getText().trim();
        searchPatient(patientId, contactNo, patName, cnic, fromDate, toDate, physician);
    }//GEN-LAST:event_txtSearchPatientIdActionPerformed

    private void txtSearchContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchContactNoActionPerformed
        contactNo = txtSearchContactNo.getText();
        searchPatient(patientId, contactNo, patName, cnic, fromDate, toDate, physician);

    }//GEN-LAST:event_txtSearchContactNoActionPerformed

    private void txtSearchPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientNameActionPerformed

        patName = txtSearchPatientName.getText();
        searchPatient(patientId, contactNo, patName, cnic, fromDate, toDate, physician);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientNameActionPerformed

    private void txtSearchCNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCNICActionPerformed

        // TODO add your handling code here:
        cnic = txtSearchCNIC.getText();
        searchPatient(patientId, contactNo, patName, cnic, fromDate, toDate,
                physician);
    }//GEN-LAST:event_txtSearchCNICActionPerformed

    private void cboAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAgeActionPerformed
//
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAgeActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

        txtCNIC.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyPressed

    private void txtPatientIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyTyped

    private void txtSearchPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPhysicianActionPerformed
        String query = "SELECT USER_NAME ID, NAME DESCRIPTION FROM  \n"
                + Database.DCMS.users + "                           \n"
                + " WHERE UPPER(NAME) LIKE '%"
                + txtSearchPhysician.getText().toUpperCase().trim() + "%'\n"
                + " AND ACTIVE = 'Y'                                \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            physician = "";
            return;
        }
        txtSearchPhysician.setText(Constants.lovDescription);
        physician = Constants.lovID;
        searchPatient(patientId, contactNo, patName, cnic, fromDate, toDate, physician);


    }//GEN-LAST:event_txtSearchPhysicianActionPerformed

    private void txtInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstituteActionPerformed
        // TODO add your handling code here:

        lov.LOVDefinitionSelection(DefinitionTypes.institute,
                txtInstitute.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtInstitute.setText("");
            instituteId = "";

        } else {
            instituteId = Constants.lovID;
            txtInstitute.setText(Constants.lovDescription.toUpperCase());
        }
        txtPriPhysician.requestFocus();
    }//GEN-LAST:event_txtInstituteActionPerformed

    private void txtInstituteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInstituteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstituteKeyPressed

    private void txtInstituteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInstituteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstituteKeyTyped
    private String dob;
    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        dob = dateFormat.format(txtDOB.getDate());
        System.err.println("DOB: " + dob);
        cboGender.requestFocus();

    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtSearchToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchToDateActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtSearchToDate.getDate());
        searchPatient(patientId, contactNo, patName, cnic, fromDate,
                toDate, physician);

    }//GEN-LAST:event_txtSearchToDateActionPerformed

    private void txtSearchFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFromDateActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtSearchFromDate.getDate());

// TODO add your handling code here:
    }//GEN-LAST:event_txtSearchFromDateActionPerformed
    private String regDate = "";
    private void txtRegistrationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrationDateActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        regDate = dateFormat.format(txtDOB.getDate());
        txtCategory.requestFocus();

// TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrationDateActionPerformed

    private void txtGuardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardianActionPerformed
        // TODO add your handling code here:
        if (txtGuardian.getText().equalsIgnoreCase("")) {
            txtInstitute.requestFocus();
            txtRelation.setEditable(false);

        } else {
            txtRelation.setEditable(true);
            txtRelation.requestFocus();
        }
    }//GEN-LAST:event_txtGuardianActionPerformed

    private void txtGuardianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuardianKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuardianKeyPressed

    private void txtGuardianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuardianKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuardianKeyTyped

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:

        lov.LOVDefinitionSelection(DefinitionTypes.relation,
                txtRelation.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtRelation.setText("");
            relationId = "";

        } else {
            relationId = Constants.lovID;
            txtRelation.setText(Constants.lovDescription.toUpperCase());
        }
        txtInstitute.requestFocus();
    }//GEN-LAST:event_txtRelationActionPerformed

    private void txtRelationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationKeyPressed

    private void txtRelationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationKeyTyped

    private void txtPriPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriPhysicianActionPerformed
        // TODO add your handling code here:
        String query = "SELECT USER_NAME ID, NAME DESCRIPTION FROM  \n"
                + Database.DCMS.users + "                           \n"
                + " WHERE UPPER(NAME) LIKE '%"
                + txtPriPhysician.getText().toUpperCase().trim() + "%'\n"
                + " AND ACTIVE = 'Y'                                \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            priPhysicianId = "";
            return;
        }
        txtPriPhysician.setText(Constants.lovDescription);
        priPhysicianId = Constants.lovID;
        txtRegistrationDate.requestFocus();
    }//GEN-LAST:event_txtPriPhysicianActionPerformed

    private void txtPriPhysicianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriPhysicianKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriPhysicianKeyPressed

    private void txtPriPhysicianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriPhysicianKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriPhysicianKeyTyped

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed

        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.category,
                txtCategory.getText().trim(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtCategory.setText("");
            categoryId = "";

        } else {
            categoryId = Constants.lovID;
            txtCategory.setText(Constants.lovDescription.toUpperCase());
        }

        txtAddress.requestFocus();


    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtCategoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryKeyPressed

    private void txtCategoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoryKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryKeyTyped

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed
        // TODO add your handling code here:
        txtContactNo.requestFocus();
    }//GEN-LAST:event_cboGenderActionPerformed

    private void btnExitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFormActionPerformed
        // TODO add your handling code here:
        this.dispose();


    }//GEN-LAST:event_btnExitFormActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExitForm;
    private javax.swing.JButton btnPatientUpdate;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btntsearchPatient;
    private javax.swing.JComboBox cboAge;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblContactNo2;
    private javax.swing.JLabel lblContactNo3;
    private javax.swing.JLabel lblContactNo4;
    private javax.swing.JLabel lblContactNo5;
    private javax.swing.JLabel lblContactNo6;
    private javax.swing.JTable tblOutsidePatients;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNo;
    private org.jdesktop.swingx.JXDatePicker txtDOB;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGuardian;
    private javax.swing.JTextField txtHusbandName;
    private javax.swing.JTextField txtInstitute;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPriPhysician;
    private org.jdesktop.swingx.JXDatePicker txtRegistrationDate;
    private javax.swing.JTextField txtRelation;
    private javax.swing.JTextField txtReligion;
    private javax.swing.JTextField txtSearchCNIC;
    private javax.swing.JTextField txtSearchContactNo;
    private org.jdesktop.swingx.JXDatePicker txtSearchFromDate;
    private javax.swing.JTextField txtSearchPatientId;
    private javax.swing.JTextField txtSearchPatientName;
    private javax.swing.JTextField txtSearchPhysician;
    private org.jdesktop.swingx.JXDatePicker txtSearchToDate;
    // End of variables declaration//GEN-END:variables

    private String Id = "";
    private String patientId = "";
    private String contactNo = "";
    private String patName = "";
    private String cnic = "";
    private String religionId = "";
    private String maritalStatusId = "";
    private String bloodGroupId = "";
    private String cityId = "";
    private String instituteId = "";
    private String relationId = "";
    private String categoryId = "";
    private String fromDate = "";
    private String toDate = "";
    private String physician = "";
    private String fullName = "";

    OutsidePatientRegistry outsidePatRegistry = new OutsidePatientRegistry();

    OutsidePatientRegistryController ctlPatRegistry = new OutsidePatientRegistryController();

    List<OutsidePatientRegistry> listPatRegistryData = new ArrayList<>();

    private void insertOutsidePatientRegister() {

        OutsidePatientRegistry outsidePatient = new OutsidePatientRegistry();
        fullName = txtFirstName.getText() + "  " + txtLastName.getText();
        if (outsidePatient.bloodGroupId.equalsIgnoreCase("LOV")) {
            outsidePatient.bloodGroupId = "52";
        }
        outsidePatient.setId(Id);
        outsidePatient.setPatientId(txtPatientId.getText());
        outsidePatient.setPatientFirstName(txtFirstName.getText());
        outsidePatient.setPatientLastName(txtLastName.getText());
        outsidePatient.setAge(txtAge.getText());
        outsidePatient.setDob(dob);
        outsidePatient.setCnic(txtCNIC.getText());
        outsidePatient.setFatherName(txtFatherName.getText());
        outsidePatient.setHusbandName(txtHusbandName.getText());
        outsidePatient.setAddress(txtAddress.getText());
        outsidePatient.setPrimaryPhysicianId(priPhysicianId);
        outsidePatient.setInstituteId(instituteId);
        outsidePatient.setReligionId(religionId);
        outsidePatient.setMaritalStatusId(maritalStatusId);
        outsidePatient.setBloodGroupId(bloodGroupId);
        outsidePatient.setCityId(cityId);
        outsidePatient.setCategoryId(categoryId);
        outsidePatient.setContactNo(txtContactNo.getText());
        outsidePatient.setOrderStatusId(Status.entered);
        outsidePatient.setRelationId(relationId);
        outsidePatient.setRegistrationDate(regDate);
        outsidePatient.setPatientFullName(fullName);
        if (cboGender.getSelectedIndex() == 0) {
            outsidePatient.setGender("1");
        } else {
            outsidePatient.setGender("2");
        }
        if (ctlPatRegistry.insertOutsidePatientRegister(outsidePatient)) {
            JOptionPane.showMessageDialog(null, "Patient Register Successfully");
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Register Patient");
        }
    }

    public void clear() {

        txtFirstName.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtDOB.setDate(null);
        txtContactNo.setText("");
        txtHusbandName.setText("");
        txtFatherName.setText("");
        txtCNIC.setText("");
        txtReligion.setText("");
        txtMaritalStatus.setText("");
        txtCity.setText("");
        txtBloodGroup.setText("");
        txtGuardian.setText("");
        txtRelation.setText("");
        txtInstitute.setText("");
        txtPriPhysician.setText("");
        txtCategory.setText("");
        txtAddress.setText("");
        txtRegistrationDate.setDate(null);
        cboGender.setSelectedItem("");
        txtPatientId.setText("");
        //txtFirstName.setText("");
        //txtFirstName.setText("");       
    }

    private void searchPatient(String patientId, String contactNo,
            String patName, String cnic, String fromDate, String toDate, String physician) {
        if (txtSearchPatientId.getText().trim().length() == 0) {
            patientId = "";
        } // 
        if (txtSearchContactNo.getText().trim().length() == 0) {
            contactNo = "";
        }
        if (txtSearchPatientName.getText().trim().length() == 0) {
            patName = "";
        }
        if (txtSearchCNIC.getText().trim().length() == 0) {
            cnic = "";
        }
        if (txtSearchPhysician.getText().trim().length() == 0) {
            physician = "";
        }

        listPatRegistryData = ctlPatRegistry.searchPatient(patientId,
                contactNo, patName, cnic, fromDate, toDate, physician);

        if (listPatRegistryData.isEmpty()) {

            List list = new ArrayList();
            OutsidePatientRegistry usr = new OutsidePatientRegistry();
            list.add(usr);
            tblOutsidePatients.setModel(new OutsidePatientTableModel(list));
        } else {
            tblOutsidePatients.setModel(new OutsidePatientTableModel(listPatRegistryData));
        }

        tblOutsidePatients.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblOutsidePatients.getSelectionModel();
        tblOutsidePatients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsCwUModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOutsidePatients);
    }

    public void setColumnsWidthsCwUModel() {
        TableColumn column = null;
        for (int i = 0; i < tblOutsidePatients.getColumnCount(); i++) {
            column = tblOutsidePatients.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(100);
            } else if (i == 1) {
                column.setPreferredWidth(300);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setDateOfBirth(int day) {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtDOB.setDate(date2);
            txtRegistrationDate.setDate(date2);
            dob = dateFormat.format(date2);
            regDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setDateOfRegistration(int day) {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtRegistrationDate.setDate(date2);
            regDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
