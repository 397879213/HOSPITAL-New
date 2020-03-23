package EMRWEB.Form;

import EMRWEB.BO.DoctorDiagnosis;
import EMRWEB.Controller.DoctorDiagnosisController;
import EMRWEB.TableModel.PatientPendingTableModel;
import EMRWEB.TableModel.PatientPerformedTableModel;
import EMRWEB.TableModel.SymptomQuestionTableModel;
import EMRWEB.TableModel.VisitMedicinesTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class frmDoctorDiagnostic extends javax.swing.JInternalFrame {

    public frmDoctorDiagnostic() {

        initComponents();
        this.setSize(Constants.xSize + 180, Constants.ySize + 160);
        selectPendingPatients();
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
        txtFullName = new javax.swing.JTextField();
        txtAgeGen = new javax.swing.JTextField();
        txtCityArea = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtDiagnosis = new javax.swing.JTextField();
        jScrollPane30 = new javax.swing.JScrollPane();
        tblDiagnosis = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        txtItemId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDays = new javax.swing.JTextField();
        jScrollPane29 = new javax.swing.JScrollPane();
        tblMedicines = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtDose1 = new javax.swing.JTextField();
        btnSaveMedicine = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblPatientInfo = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblQuesDetail = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblPatientPendings = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1202, 710));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id :");

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtFullName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        txtAgeGen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAgeGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeGenActionPerformed(evt);
            }
        });

        txtCityArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCityArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityAreaActionPerformed(evt);
            }
        });

        txtContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgeGen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCityArea, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCityArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnosis Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instr. / Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.setLineWrap(true);
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Select : ");

        txtDiagnosis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosisActionPerformed(evt);
            }
        });

        tblDiagnosis.setBackground(java.awt.SystemColor.activeCaption);
        tblDiagnosis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Id", "Description"

            }
        ));
        tblDiagnosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiagnosisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDiagnosisMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDiagnosisMouseReleased(evt);
            }
        });
        tblDiagnosis.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblDiagnosisPropertyChange(evt);
            }
        });
        tblDiagnosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDiagnosisKeyReleased(evt);
            }
        });
        jScrollPane30.setViewportView(tblDiagnosis);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        txtItemId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Item Id : ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Dose : ");

        txtDose.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Days : ");

        txtDays.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDaysActionPerformed(evt);
            }
        });

        tblMedicines.setBackground(java.awt.SystemColor.activeCaption);
        tblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Id", "Description"

            }
        ));
        tblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicinesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblMedicinesMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMedicinesMouseReleased(evt);
            }
        });
        tblMedicines.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblMedicinesPropertyChange(evt);
            }
        });
        tblMedicines.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMedicinesKeyReleased(evt);
            }
        });
        jScrollPane29.setViewportView(tblMedicines);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Instruction : ");

        txtDose1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDose1ActionPerformed(evt);
            }
        });

        btnSaveMedicine.setText("Save");
        btnSaveMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtItemId)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDose1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDays)
                            .addComponent(btnSaveMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDose1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveMedicine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Perform", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        tblPatientInfo.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Id", "Description"

            }
        ));
        tblPatientInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseReleased(evt);
            }
        });
        tblPatientInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientInfoPropertyChange(evt);
            }
        });
        tblPatientInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientInfoKeyReleased(evt);
            }
        });
        jScrollPane26.setViewportView(tblPatientInfo);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tblQuesDetail.setBackground(java.awt.SystemColor.activeCaption);
        tblQuesDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Id", "Description"

            }
        ));
        tblQuesDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuesDetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblQuesDetailMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblQuesDetailMouseReleased(evt);
            }
        });
        tblQuesDetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblQuesDetailPropertyChange(evt);
            }
        });
        tblQuesDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblQuesDetailKeyReleased(evt);
            }
        });
        jScrollPane27.setViewportView(tblQuesDetail);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pending Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        tblPatientPendings.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientPendings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Id", "Description"

            }
        ));
        tblPatientPendings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientPendingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientPendingsMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientPendingsMouseReleased(evt);
            }
        });
        tblPatientPendings.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientPendingsPropertyChange(evt);
            }
        });
        tblPatientPendings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientPendingsKeyReleased(evt);
            }
        });
        jScrollPane28.setViewportView(tblPatientPendings);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(jButton2)
                    .addComponent(btnFinal))
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
                .addGap(10, 10, 10))
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
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void tblPatientInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoMouseClicked

    private void tblPatientInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoMouseEntered

    private void tblPatientInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseReleased

        DoctorDiagnosis obj = listPerformedPatients.get(tblPatientInfo.getSelectedRow());
        setSymptomQuestions(obj.getVisitId());
        selectVisitMedicines(obj.getVisitId());
    }//GEN-LAST:event_tblPatientInfoMouseReleased

    private void tblPatientInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoPropertyChange

    private void tblPatientInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientInfoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoKeyReleased

    private void txtAgeGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeGenActionPerformed

    private void txtCityAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityAreaActionPerformed

    private void tblQuesDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuesDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblQuesDetailMouseClicked

    private void tblQuesDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuesDetailMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblQuesDetailMouseEntered

    private void tblQuesDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuesDetailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblQuesDetailMouseReleased

    private void tblQuesDetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblQuesDetailPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblQuesDetailPropertyChange

    private void tblQuesDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQuesDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblQuesDetailKeyReleased

    private void tblPatientPendingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientPendingsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientPendingsMouseClicked

    private void tblPatientPendingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientPendingsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientPendingsMouseEntered

    private void tblPatientPendingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientPendingsMouseReleased
        // TODO add your handling code here:
        if (listPendingPatients.isEmpty() || tblPatientPendings.getSelectedRow() < 0) {
            return;
        }
        obj = listPendingPatients.get(tblPatientPendings.getSelectedRow());
        txtPatientId.setText(obj.getPatientId());
        txtFullName.setText(obj.getFullName());
        txtContactNo.setText(obj.getContactNo());
        txtAgeGen.setText(obj.getAge() + "/ " + obj.getGenderDesc());
        txtCityArea.setText(obj.getCityDescription() + "/ " + obj.getArea());
        visitId = obj.getVisitId();
        System.err.println("Table vsid" + visitId);
        setSymptomQuestions(visitId);
        selectVisitMedicines(visitId);
        selectPerformedPaients(obj.getPatientId());
    }//GEN-LAST:event_tblPatientPendingsMouseReleased

    private void tblPatientPendingsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientPendingsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientPendingsPropertyChange

    private void tblPatientPendingsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientPendingsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientPendingsKeyReleased

    private void txtItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM "
                + "\n" + Database.DCMS.item
                + "\n WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtItemId.getText().trim().toUpperCase() + "%'"
                + "\n AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);
        itemId = Constants.lovID;
        txtItemId.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtItemIdActionPerformed

    private void txtDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosisActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.diagnosisOPD,
                txtDiagnosis.getText().trim().toUpperCase(), this);
        diagnosisId = Constants.lovID;
    }//GEN-LAST:event_txtDiagnosisActionPerformed

    private void txtDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.doseTime, txtDose.getText().trim(), this);
        doseId = Constants.lovID;
        txtDose.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtDoseActionPerformed

    private void txtDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDaysActionPerformed
        // TODO add your handling code here:
        saveVisitMedicines();
    }//GEN-LAST:event_txtDaysActionPerformed

    private void tblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinesMouseClicked

    private void tblMedicinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinesMouseEntered

    private void tblMedicinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinesMouseReleased

    private void tblMedicinesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblMedicinesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinesPropertyChange

    private void tblMedicinesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMedicinesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinesKeyReleased

    private void tblDiagnosisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiagnosisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiagnosisMouseClicked

    private void tblDiagnosisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiagnosisMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiagnosisMouseEntered

    private void tblDiagnosisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiagnosisMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiagnosisMouseReleased

    private void tblDiagnosisPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDiagnosisPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiagnosisPropertyChange

    private void tblDiagnosisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDiagnosisKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiagnosisKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtDose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDose1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDose1ActionPerformed

    private void btnSaveMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMedicineActionPerformed
        // TODO add your handling code here:
        saveVisitMedicines();
    }//GEN-LAST:event_btnSaveMedicineActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        // TODO add your handling code here:

        if (ctlDocDiag.fianlPerformedVisits(obj)) {
            JOptionPane.showMessageDialog(null, "Patient Perform Successfully.");
            selectPendingPatients();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Final the Patient.\n"
                    + "Please Contact the Support Team.");
        }
    }//GEN-LAST:event_btnFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnSaveMedicine;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblDiagnosis;
    private javax.swing.JTable tblMedicines;
    private javax.swing.JTable tblPatientInfo;
    private javax.swing.JTable tblPatientPendings;
    private javax.swing.JTable tblQuesDetail;
    private javax.swing.JTextField txtAgeGen;
    private javax.swing.JTextField txtCityArea;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtDose1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables

    private String visitId = "";
    private String diagnosisId = "";
    private String itemId = "";
    private String doseId = "";

    List<DoctorDiagnosis> listPendingPatients = new ArrayList();
    List<DoctorDiagnosis> listPerformedPatients = new ArrayList();
    List<DoctorDiagnosis> listSymptomQues = new ArrayList();
    List<DoctorDiagnosis> listMedicines = new ArrayList();

    DoctorDiagnosis objInsrMed = new DoctorDiagnosis();
    DoctorDiagnosis obj = new DoctorDiagnosis();
    DisplayLOV lov = new DisplayLOV();
    DoctorDiagnosisController ctlDocDiag = new DoctorDiagnosisController();

    private void selectPendingPatients() {
        listPendingPatients = ctlDocDiag.selectPendingPatients(""); //visitId
        if (listPendingPatients.isEmpty()) {
            List<DoctorDiagnosis> listPendingPatients = new ArrayList();
            listPendingPatients.add(new DoctorDiagnosis());
            tblPatientPendings.setModel(new PatientPendingTableModel(listPendingPatients));
        } else {
            tblPatientPendings.setModel(new PatientPendingTableModel(listPendingPatients));
            ListSelectionModel selectionModel = tblPatientPendings.getSelectionModel();
            tblPatientPendings.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setCondumDetailColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblPatientPendings);
            DoctorDiagnosis obj = listPendingPatients.get(0);
            setSymptomQuestions(obj.getVisitId());
            selectVisitMedicines(obj.getVisitId());
        }
    }

    private void setCondumDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPatientPendings.getColumnCount(); i++) {
            column = tblPatientPendings.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void setSymptomQuestions(String visitId) {
        listSymptomQues = ctlDocDiag.selectVisitQuestionDetail(visitId);
        if (listSymptomQues.isEmpty()) {
            List<DoctorDiagnosis> listPendingPatients = new ArrayList();
            listSymptomQues.add(new DoctorDiagnosis());
            tblQuesDetail.setModel(new SymptomQuestionTableModel(listSymptomQues));
        } else {
            tblQuesDetail.setModel(new SymptomQuestionTableModel(listSymptomQues));
            ListSelectionModel selectionModel = tblQuesDetail.getSelectionModel();
            tblQuesDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setSymptomQuestionColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblQuesDetail);
        }
    }

    private void setSymptomQuestionColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblQuesDetail.getColumnCount(); i++) {
            column = tblQuesDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(60);
            } else if (i == 1) {
                column.setPreferredWidth(500);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void selectVisitMedicines(String visitId) {
        listMedicines = ctlDocDiag.selectVisitMedicines(visitId);
        if (listMedicines.isEmpty()) {
            List<DoctorDiagnosis> listPendingPatients = new ArrayList();
            listMedicines.add(new DoctorDiagnosis());
            tblMedicines.setModel(new VisitMedicinesTableModel(listMedicines));
        } else {
            tblMedicines.setModel(new VisitMedicinesTableModel(listMedicines));
            ListSelectionModel selectionModel = tblMedicines.getSelectionModel();
            tblMedicines.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setMedicinesColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblMedicines);
        }
    }

    private void setMedicinesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblMedicines.getColumnCount(); i++) {
            column = tblMedicines.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(120);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            }
        }
    }

    private void saveVisitMedicines() {
        if (itemId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Item Prior to Save.");
            txtItemId.requestFocus();
            return;
        }
        if (doseId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Dose Prior to Save "
                    + "Medicine.");
            txtDose.requestFocus();
            return;
        }
        if (txtDays.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Days Prior to Save "
                    + "Medicine.");
            txtDays.requestFocus();
            return;
        }
        try {
            Integer.parseInt(txtDays.getText().trim());
            objInsrMed.setDays(txtDays.getText().trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please enter Correct Dys.");
            txtDays.setText("");
            txtDays.requestFocus();
            return;
        }
        System.out.println("Insrt vsid" + visitId);
        objInsrMed.setItemId(itemId);
        objInsrMed.setDoseId(doseId);
        objInsrMed.setInstructions(doseId);
        objInsrMed.setVisitId(visitId);
        if (ctlDocDiag.insertVisitMedicines(objInsrMed)) {
            selectVisitMedicines(visitId);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Medicines.\n"
                    + "Please Contact the Support Team.");
        }
    }

    private void selectPerformedPaients(String patientId) {
        listPerformedPatients = ctlDocDiag.selectPerformedPatients(patientId);
        if (listPerformedPatients.isEmpty()) {
            List<DoctorDiagnosis> listPendingPatients = new ArrayList();
            listPerformedPatients.add(new DoctorDiagnosis());
            tblPatientInfo.setModel(new PatientPerformedTableModel(listPerformedPatients));
        } else {
            tblPatientInfo.setModel(new PatientPerformedTableModel(listPerformedPatients));
            ListSelectionModel selectionModel = tblPatientInfo.getSelectionModel();
            tblPatientInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setPerformedPatientsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblPatientInfo);
        }
    }

    private void setPerformedPatientsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPatientInfo.getColumnCount(); i++) {
            column = tblPatientInfo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(120);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            }
        }
    }

}
