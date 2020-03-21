package Form.Hospital;

import BO.Hospital.BOBirthCertificate;
import BO.OPD.PatientHospitalVisit;
import Controller.Hospital.BirthCertificateController;
import TableModel.Hospital.PastObstetricHistoryTableModel;
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

public class frmPastObstetricHistory extends javax.swing.JInternalFrame {

    String patientId = "001001906987";
    String admissionNum = "1770438";
    String primaryPhyId = "ANITA.BILAL";
    private String dob = "";
    
    


    DisplayLOV lov = new DisplayLOV();
    BirthCertificateController ctlPastObstetricHistory = new BirthCertificateController();
  //  PatientHospitalVisit birthCertificateBO = new PatientHospitalVisit();
    BOBirthCertificate PastObstetricHistoryBO = new BOBirthCertificate();
    
    List<BOBirthCertificate> listPastObstetricHistory = new ArrayList();

    public frmPastObstetricHistory() {
        // PatientHospitalVisit patVisit
        initComponents();
//        patientId = patVisit.getPatientId();
//        admissionNum = patVisit.getAdmissionNumber();
//        primaryPhyId = patVisit.getPrimaryPhysicianId();
        this.setSize(Constants.xSize - 200, Constants.ySize - 30);
//        setDataInTextBox(patVisit);
        setDate(0);
        selectBirthCertificate();
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnEdit.setMnemonic(KeyEvent.VK_U);
        btnRegister.setMnemonic(KeyEvent.VK_R);
        btnEdit.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultant = new javax.swing.JPanel();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtComplications = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPresentAddress = new javax.swing.JTextArea();
        txtDob = new org.jdesktop.swingx.JXDatePicker();
        jLabel22 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtMethodIndecation = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtLabour = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtBirthWeight = new javax.swing.JTextField();
        txtPregnancyWeeks = new javax.swing.JTextField();
        txtDelivery = new javax.swing.JTextField();
        cboPlace = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtBFVaccination = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtPresentStatus = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtBabyName = new javax.swing.JTextField();
        pnlUserDetail2 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblPastObstetricHistory = new javax.swing.JTable();
        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        txtAdmissionNo = new javax.swing.JTextField();
        txtWardName = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Past Obstetric History Form");
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

        Consultant.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        Consultant.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Past Obstetric History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        Consultant.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Gender : ");

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Male","Female"}));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("DOB : ");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Delivery : ");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Pregnancy Weeks : ");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Place : ");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText(" Present Address  : ");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Complications : ");

        txtComplications.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComplications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtComplicationsMouseReleased(evt);
            }
        });
        txtComplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplicationsActionPerformed(evt);
            }
        });

        txtPresentAddress.setColumns(20);
        txtPresentAddress.setRows(5);
        jScrollPane1.setViewportView(txtPresentAddress);

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Age : ");

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAgeMouseReleased(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Method/Indication : ");

        txtMethodIndecation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMethodIndecation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMethodIndecationMouseReleased(evt);
            }
        });
        txtMethodIndecation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMethodIndecationActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Labour : ");

        txtLabour.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLabour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtLabourMouseReleased(evt);
            }
        });
        txtLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabourActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Birth Weight (pound): ");

        txtBirthWeight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBirthWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBirthWeightMouseReleased(evt);
            }
        });
        txtBirthWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthWeightActionPerformed(evt);
            }
        });

        txtPregnancyWeeks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPregnancyWeeks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPregnancyWeeksMouseReleased(evt);
            }
        });
        txtPregnancyWeeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregnancyWeeksActionPerformed(evt);
            }
        });

        txtDelivery.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDeliveryMouseReleased(evt);
            }
        });
        txtDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryActionPerformed(evt);
            }
        });

        cboPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Hospital","Home"}));
        cboPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPlaceActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("B/F Vaccination : ");

        txtBFVaccination.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBFVaccination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBFVaccinationMouseReleased(evt);
            }
        });
        txtBFVaccination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBFVaccinationActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Present Status : ");

        txtPresentStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPresentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPresentStatusMouseReleased(evt);
            }
        });
        txtPresentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentStatusActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Baby Name : ");

        txtBabyName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBabyName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBabyNameMouseReleased(evt);
            }
        });
        txtBabyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBabyNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPregnancyWeeks, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMethodIndecation, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDelivery)))
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLabour)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBFVaccination, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComplications)
                                    .addComponent(txtBirthWeight)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPresentStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addComponent(txtBabyName, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtBabyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDelivery)
                    .addComponent(txtPregnancyWeeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethodIndecation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLabour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBirthWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBFVaccination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPresentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        btnRegister.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 51, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPastObstetricHistory.setBackground(java.awt.SystemColor.activeCaption);
        tblPastObstetricHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPastObstetricHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Crtd Date","Crtd By","Name","Method/Indication","Complications"}
        ));
        tblPastObstetricHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPastObstetricHistoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPastObstetricHistoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPastObstetricHistoryMouseReleased(evt);
            }
        });
        tblPastObstetricHistory.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPastObstetricHistoryPropertyChange(evt);
            }
        });
        tblPastObstetricHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPastObstetricHistoryKeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(tblPastObstetricHistory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

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
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ConsultantLayout = new javax.swing.GroupLayout(Consultant);
        Consultant.setLayout(ConsultantLayout);
        ConsultantLayout.setHorizontalGroup(
            ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultantLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ConsultantLayout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ConsultantLayout.setVerticalGroup(
            ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultantLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Patient ID : ");

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPatientIdMouseReleased(evt);
            }
        });
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPatientNameMouseReleased(evt);
            }
        });
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtAgeGender.setEditable(false);
        txtAgeGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAgeGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAgeGenderMouseReleased(evt);
            }
        });
        txtAgeGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeGenderActionPerformed(evt);
            }
        });

        txtAdmissionNo.setEditable(false);
        txtAdmissionNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAdmissionNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAdmissionNoMouseReleased(evt);
            }
        });
        txtAdmissionNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionNoActionPerformed(evt);
            }
        });

        txtWardName.setEditable(false);
        txtWardName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtWardName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtWardNameMouseReleased(evt);
            }
        });
        txtWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardNameActionPerformed(evt);
            }
        });

        txtBed.setEditable(false);
        txtBed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBedMouseReleased(evt);
            }
        });
        txtBed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBedActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Admi. No : ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText(" Primary Phy : ");

        txtPrimaryPhy.setEditable(false);
        txtPrimaryPhy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrimaryPhy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPrimaryPhyMouseReleased(evt);
            }
        });
        txtPrimaryPhy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryPhyActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Client Name : ");

        txtClientName.setEditable(false);
        txtClientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtClientName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtClientNameMouseReleased(evt);
            }
        });
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgeGender, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBed))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClientName)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Consultant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Consultant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Consultant.getAccessibleContext().setAccessibleName("Consultant");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       
        if (!chkFields()) {
            return;
        }
        setInsertData();
        if (ctlPastObstetricHistory.insertBirthCertificate(PastObstetricHistoryBO)) {
            selectBirthCertificate();
            
            JOptionPane.showMessageDialog(null, "Records save Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save. \n"
                    + "Kindly contact Administrator.");
        }
        clearForm();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed
       
        txtPregnancyWeeks.requestFocus();
        
    }//GEN-LAST:event_cboGenderActionPerformed

    private void txtComplicationsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtComplicationsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplicationsMouseReleased

    private void txtComplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplicationsActionPerformed
        // TODO add your handling code here:
         txtBFVaccination.requestFocus();
    }//GEN-LAST:event_txtComplicationsActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (!chkFields()) {
            return;
        }
        setInsertData();
        if (ctlPastObstetricHistory.updateBirthCertificate(PastObstetricHistoryBO)) {
            selectBirthCertificate();
            JOptionPane.showMessageDialog(null, "Records Updated Successfully");
            
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save. \n"
                    + "Kindly contact Administrator.");
        }
        
       clearForm();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblPastObstetricHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryMouseClicked

    private void tblPastObstetricHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryMousePressed

    private void tblPastObstetricHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryMouseReleased
 
        btnRegister.setEnabled(false);
        btnEdit.setEnabled(true);
        setBodyData(tblPastObstetricHistory.getSelectedRow());
        txtBabyName.requestFocus();
    }//GEN-LAST:event_tblPastObstetricHistoryMouseReleased

    private void tblPastObstetricHistoryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryPropertyChange

    private void tblPastObstetricHistoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryKeyPressed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed

        if (txtDob.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the DOB DD-MON-YY",
                    "Birth Certificate", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        dob = dateFormat.format(txtDob.getDate());

    }//GEN-LAST:event_txtDobActionPerformed

    private void txtPatientIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseReleased

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameMouseReleased

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtAgeGenderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeGenderMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeGenderMouseReleased

    private void txtAgeGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeGenderActionPerformed

    private void txtAdmissionNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdmissionNoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionNoMouseReleased

    private void txtAdmissionNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionNoActionPerformed

    private void txtWardNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWardNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardNameMouseReleased

    private void txtWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardNameActionPerformed

    private void txtBedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBedMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBedMouseReleased

    private void txtBedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBedActionPerformed

    private void txtPrimaryPhyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrimaryPhyMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryPhyMouseReleased

    private void txtPrimaryPhyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryPhyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryPhyActionPerformed

    private void txtClientNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClientNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameMouseReleased

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtAgeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseReleased

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtMethodIndecationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMethodIndecationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMethodIndecationMouseReleased

    private void txtMethodIndecationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMethodIndecationActionPerformed
      
         txtLabour.requestFocus();
    }//GEN-LAST:event_txtMethodIndecationActionPerformed

    private void txtLabourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLabourMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabourMouseReleased

    private void txtLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabourActionPerformed
        // TODO add your handling code here:
         txtComplications.requestFocus();
    }//GEN-LAST:event_txtLabourActionPerformed

    private void txtBirthWeightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBirthWeightMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthWeightMouseReleased

    private void txtBirthWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthWeightActionPerformed
        // TODO add your handling code here:
         txtPresentStatus.requestFocus();
    }//GEN-LAST:event_txtBirthWeightActionPerformed

    private void txtPregnancyWeeksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPregnancyWeeksMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregnancyWeeksMouseReleased

    private void txtPregnancyWeeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregnancyWeeksActionPerformed
        txtDelivery.requestFocus();
    }//GEN-LAST:event_txtPregnancyWeeksActionPerformed

    private void txtDeliveryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeliveryMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryMouseReleased

    private void txtDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryActionPerformed
      
        cboPlace.requestFocus();
    }//GEN-LAST:event_txtDeliveryActionPerformed

    private void cboPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPlaceActionPerformed
            // TODO add your handling code here:
             txtMethodIndecation.requestFocus();
    }//GEN-LAST:event_cboPlaceActionPerformed

    private void txtBFVaccinationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBFVaccinationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBFVaccinationMouseReleased

    private void txtBFVaccinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBFVaccinationActionPerformed
        // TODO add your handling code here:
         txtBirthWeight.requestFocus();
    }//GEN-LAST:event_txtBFVaccinationActionPerformed

    private void txtPresentStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresentStatusMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentStatusMouseReleased

    private void txtPresentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentStatusActionPerformed
        // TODO add your handling code here:
         txtPresentAddress.requestFocus();
    }//GEN-LAST:event_txtPresentStatusActionPerformed

    private void txtBabyNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBabyNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBabyNameMouseReleased

    private void txtBabyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBabyNameActionPerformed
        txtBabyName.requestFocus();
        cboGender.requestFocus();
    }//GEN-LAST:event_txtBabyNameActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultant;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboPlace;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblPastObstetricHistory;
    private javax.swing.JTextField txtAdmissionNo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBFVaccination;
    private javax.swing.JTextField txtBabyName;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtBirthWeight;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtComplications;
    private javax.swing.JTextField txtDelivery;
    private org.jdesktop.swingx.JXDatePicker txtDob;
    private javax.swing.JTextField txtLabour;
    private javax.swing.JTextField txtMethodIndecation;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPregnancyWeeks;
    private javax.swing.JTextArea txtPresentAddress;
    private javax.swing.JTextField txtPresentStatus;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables

    private void selectBirthCertificate() {
        listPastObstetricHistory = ctlPastObstetricHistory.selectPatientSearch(patientId,
                admissionNum);
        setDataInTableModel();
    }

    private void setDate(int dayOfDate) {
        try {
            Date date = new Date();
            txtDob.setDate(date);
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, dayOfDate);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtDob.setDate(date2);
            dob = dateFormat.format(txtDob.getDate());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setInsertData() {
        // BY SIR
        PastObstetricHistoryBO.setBabyPatientId("001000254875");
        PastObstetricHistoryBO.setAdmissionNumber(admissionNum);
        PastObstetricHistoryBO.setPatientId(patientId);
        
        
        PastObstetricHistoryBO.setBabyName(txtBabyName.getText().toUpperCase());
        PastObstetricHistoryBO.setPrimaryPhysicianId(primaryPhyId);
        PastObstetricHistoryBO.setDob(dob);
        PastObstetricHistoryBO.setDayOfBirth(txtAge.getText());
        if (cboGender.getSelectedIndex() == 1) {
            PastObstetricHistoryBO.setGenderId("1");
        }
        if (cboGender.getSelectedIndex() == 2) {
            PastObstetricHistoryBO.setGenderId("2");
        }
        PastObstetricHistoryBO.setPregnancyWeeks(txtPregnancyWeeks.getText());
        PastObstetricHistoryBO.setDelivery(txtDelivery.getText().toUpperCase());
        if (cboPlace.getSelectedIndex() == 1) {
            PastObstetricHistoryBO.setPlace("1");
        }
        if (cboPlace.getSelectedIndex() == 2) {
            PastObstetricHistoryBO.setPlace("2");
        }
        PastObstetricHistoryBO.setMethodIndication(txtMethodIndecation.getText().toUpperCase());
        PastObstetricHistoryBO.setLabour(txtLabour.getText().toUpperCase());
        PastObstetricHistoryBO.setComplications(txtComplications.getText().toUpperCase());
        PastObstetricHistoryBO.setBFVaccination(txtBFVaccination.getText().toUpperCase());
        PastObstetricHistoryBO.setBirthWeight(txtBirthWeight.getText());
        PastObstetricHistoryBO.setPresentStatus(txtPresentStatus.getText().toUpperCase());
        PastObstetricHistoryBO.setPresentAddress(txtPresentAddress.getText().toUpperCase());
       
    }

    private void setDataInTextBox(PatientHospitalVisit patVisit) {

//        txtPatientId.setText(patientId);
//        txtAdmissionNo.setText(admissionNum);
//        txtPatientName.setText(patVisit.getPatientName());
//        txtAgeGender.setText(patVisit.getAge()
//                + "/ " + patVisit.getGenderDescription());
//        txtWardName.setText(patVisit.getWardDescription());
//        txtBed.setText(patVisit.getBedDescription());
//        txtPrimaryPhy.setText(patVisit.getPrimaryPhysicianName());
//        txtClientName.setText(patVisit.getClientName());
    }

    private void setBirthCertificateColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPastObstetricHistory.getColumnCount(); i++) {
            column = tblPastObstetricHistory.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(40);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            } else if (i == 3) {
                column.setPreferredWidth(35);
            } else if (i == 4) {
                column.setPreferredWidth(35);
            }
        }
    }

    private void setDataInTableModel() {
        tblPastObstetricHistory.setModel(new PastObstetricHistoryTableModel(listPastObstetricHistory));
        ListSelectionModel selectionModel = tblPastObstetricHistory.getSelectionModel();
        tblPastObstetricHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setBirthCertificateColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPastObstetricHistory);
    }

    private void setBodyData(int index) {
        // form data setting
        PastObstetricHistoryBO = new BOBirthCertificate();
        PastObstetricHistoryBO = listPastObstetricHistory.get(index);
        
        txtBabyName.setText(PastObstetricHistoryBO.getBabyName());
        txtAge.setText(PastObstetricHistoryBO.getAge());
       if (PastObstetricHistoryBO.getGenderId().equalsIgnoreCase("1")) {
            cboGender.setSelectedIndex(1);
        }
        if (PastObstetricHistoryBO.getGenderId().equalsIgnoreCase("2")) {
            cboGender.setSelectedIndex(2);
        }
        txtPregnancyWeeks.setText(PastObstetricHistoryBO.getPregnancyWeeks());
        txtDelivery.setText(PastObstetricHistoryBO.getDelivery());
         if (PastObstetricHistoryBO.getPlace().equalsIgnoreCase("1")) {
            cboPlace.setSelectedIndex(1);
        }
        if (PastObstetricHistoryBO.getPlace().equalsIgnoreCase("2")) {
            cboPlace.setSelectedIndex(2);
        }
        txtMethodIndecation.setText(PastObstetricHistoryBO.getMethodIndication());
        txtLabour.setText(PastObstetricHistoryBO.getLabour());
        txtComplications.setText(PastObstetricHistoryBO.getComplications());
        txtBFVaccination.setText(PastObstetricHistoryBO.getBFVaccination());
        txtBirthWeight.setText(PastObstetricHistoryBO.getBirthWeight());
        txtPresentStatus.setText(PastObstetricHistoryBO.getPresentStatus());
        txtPresentAddress.setText(PastObstetricHistoryBO.getPresentAddress());
        setDate(Integer.parseInt(PastObstetricHistoryBO.getDayOfBirth()));
    }
    private boolean chkFields() {
        boolean ret = true;
        if (txtBabyName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Baby Name");
            txtBabyName.requestFocus();
            return false;
        }
        if (cboGender.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Gender");
            cboGender.requestFocus();
            return false;
        }
        if (txtPregnancyWeeks.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pregnancy Weeks");
            txtPregnancyWeeks.requestFocus();
            return false;
        }

         if (txtDelivery.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Delivery");
            txtDelivery.requestFocus();
            return false;
        }
         if (cboPlace.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Place");
            cboPlace.requestFocus();
            return false;
        }
         if (txtMethodIndecation.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Method/Indecation ");
            txtMethodIndecation.requestFocus();
            return false;
        }
         if (txtLabour.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Labour");
            txtLabour.requestFocus();
            return false;
         }
        if (txtComplications.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Complications ");
            txtComplications.requestFocus();
        }
        
         
         if (txtBFVaccination.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter B/F Vaccination");
            txtBFVaccination.requestFocus();
            return false;
        }
         
        if (txtBirthWeight.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Birth Weight");
            txtBirthWeight.requestFocus();
        }
        try {
            Float.parseFloat(txtBirthWeight.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtBirthWeight.getText().trim()
                    + " is not a valid value for Birth Weight");
            txtBirthWeight.requestFocus();
            return false;
        }
        if (txtPresentStatus.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Present Status");
            txtPresentStatus.requestFocus();
            return false;
        }
        if (txtPresentAddress.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Present Address");
            txtPresentAddress.requestFocus();
            return false;
        }
        return ret;
    }
    
    private void clearForm() {
        
         setDate(0);
         txtBabyName.setText("");
         txtAge.setText("");
         cboGender.setSelectedIndex(0);
         txtPregnancyWeeks.setText("");
         txtDelivery.setText("");
         cboPlace.setSelectedIndex(0);
         txtMethodIndecation.setText("");
         txtComplications.setText("");
         txtLabour.setText("");
         txtBirthWeight.setText("");
         txtBFVaccination.setText("");
         txtPresentStatus.setText("");
         txtPresentAddress.setText("");
         btnRegister.setEnabled(true);
         btnEdit.setEnabled(false);
         txtBabyName.requestFocus();
       //  listPastObstetricHistory.clear();
       //  tblPastObstetricHistory.setModel(new PastObstetricHistoryTableModel(listPastObstetricHistory));
        
    }

}
