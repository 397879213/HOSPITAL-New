package Form.Hospital;

import BO.Hospital.ManageAdmissionServices;
import BO.StudyData;
import Controller.Hospital.PendingAdmissionServicesController;
import TableModel.Hospital.AdmissionServicesTableModel;
import TableModel.Hospital.PendingAdmissionServicesTableModel;
import TableModel.Hospital.PendingRefundStatusTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;

public class PendingAdmissionServices extends javax.swing.JInternalFrame {

    private String patientId = "001002724226";
    private String admissionNo = "";
    private String departmentId = "";
    private String CON = "";
    private String tableName = Database.DCMS.item;
    String departments[] = {"", Departments.pathology, Departments.radiology,
        Departments.inpatient, Departments.opd, Departments.operationTheatre};

    public PendingAdmissionServices() {

        initComponents();
        this.setSize(Constants.xSize - 80, Constants.ySize - 120);
        setPatientDemography(patientId);
        selectPendingServices();
        displayRefundData();
    }

    public PendingAdmissionServices(String patientId) {

        initComponents();
        this.patientId = patientId;
        setPatientDemography(patientId);
        selectPendingServices();
        setPendingRefundOrders();
    }

    PendingAdmissionServicesController ctlPendingServices = new PendingAdmissionServicesController();
    ManageAdmissionServices objPendingServices = new ManageAdmissionServices();
    List<ManageAdmissionServices> listAdmittedPatient = new ArrayList();
    List<ManageAdmissionServices> listPendingsServices = new ArrayList();
    Vector<StudyData> listPendingRefundServices = new Vector();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblPendingServices = new javax.swing.JTable();
        cboDepartment = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtDepStatus = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblRefundPendings = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCancelReq = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtClient = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtPatName = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cboInvoiceType = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Adm Pending Services");
        setFrameIcon(null);
        setMinimumSize(new java.awt.Dimension(95, 29));
        setPreferredSize(new java.awt.Dimension(940, 670));
        setRequestFocusEnabled(false);

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adm Pending Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admission Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPendingServices.setBackground(java.awt.SystemColor.activeCaption);
        tblPendingServices.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPendingServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Inv. By", "CPT", "Price"
            }
        ));
        tblPendingServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPendingServicesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPendingServicesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPendingServicesMouseReleased(evt);
            }
        });
        tblPendingServices.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPendingServicesPropertyChange(evt);
            }
        });
        tblPendingServices.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPendingServicesKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(tblPendingServices);

        cboDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department", "Pathology", "Radiology", "IPD", "OPD", "OT" }));
        cboDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartmentActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Department Status :  ");

        txtDepStatus.setEditable(false);
        txtDepStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDepStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Refund Pending(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblRefundPendings.setBackground(java.awt.SystemColor.activeCaption);
        tblRefundPendings.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblRefundPendings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "CPT Name","requested By","Requested Status", "Date"
            }
        ));
        tblRefundPendings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRefundPendingsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRefundPendingsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblRefundPendingsMouseReleased(evt);
            }
        });
        tblRefundPendings.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblRefundPendingsPropertyChange(evt);
            }
        });
        tblRefundPendings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblRefundPendingsKeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(tblRefundPendings);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Status :  ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Request By :  ");

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "s", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCancelReq))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(4, 4, 4))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCancelReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id :  ");

        txtPrimaryPhy.setEditable(false);
        txtPrimaryPhy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtWard.setEditable(false);
        txtWard.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtClient.setEditable(false);
        txtClient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Admission No : ");

        txtAdmissionNumber.setEditable(false);
        txtAdmissionNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatName.setEditable(false);
        txtPatName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatNameActionPerformed(evt);
            }
        });

        txtAgeGender.setEditable(false);
        txtAgeGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Physician :  ");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText(" Name : ");

        cboInvoiceType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboInvoiceType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Services", "Pharmacy" }));
        cboInvoiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboInvoiceTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtAdmissionNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatName, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(txtPrimaryPhy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboInvoiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboInvoiceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPendingServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPendingServicesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPendingServicesMouseClicked

    private void tblPendingServicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPendingServicesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPendingServicesMousePressed

    private void tblPendingServicesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPendingServicesMouseReleased
        // TODO add your handling code here:
        setDepartmentStatus();
    }//GEN-LAST:event_tblPendingServicesMouseReleased

    private void tblPendingServicesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPendingServicesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPendingServicesPropertyChange

    private void tblPendingServicesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPendingServicesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPendingServicesKeyPressed

    private void cboDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartmentActionPerformed
        // TODO add your handling code here:
        selectPendingServices();
    }//GEN-LAST:event_cboDepartmentActionPerformed

    private void txtDepStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepStatusActionPerformed

    private void tblRefundPendingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRefundPendingsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRefundPendingsMouseClicked

    private void tblRefundPendingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRefundPendingsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRefundPendingsMousePressed

    private void tblRefundPendingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRefundPendingsMouseReleased
        // TODO add your handling code here:
        StudyData data = listPendingRefundServices.get(
                tblRefundPendings.getSelectedRow());
        txtStatus.setText(data.getOrderStatus());
        txtCancelReq.setText(data.getCancelRequestBy());
    }//GEN-LAST:event_tblRefundPendingsMouseReleased

    private void tblRefundPendingsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblRefundPendingsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRefundPendingsPropertyChange

    private void tblRefundPendingsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRefundPendingsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRefundPendingsKeyPressed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatNameActionPerformed

    private void cboInvoiceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboInvoiceTypeActionPerformed
        // TODO add your handling code here:
        displayRefundData();
    }//GEN-LAST:event_cboInvoiceTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboDepartment;
    private javax.swing.JComboBox cboInvoiceType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblPendingServices;
    private javax.swing.JTable tblRefundPendings;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtCancelReq;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtDepStatus;
    private javax.swing.JTextField txtPatName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void selectPendingServices() {
        departmentId = departments[cboDepartment.getSelectedIndex()];
        listPendingsServices = ctlPendingServices.selectPendingServices(admissionNo,
                departmentId, tableName);
        if (listPendingsServices.isEmpty()) {
            List<ManageAdmissionServices> listPendingsServices = new ArrayList();
            tblPendingServices.setModel(new PendingAdmissionServicesTableModel(
                    listPendingsServices));
        } else {
            tblPendingServices.setModel(new PendingAdmissionServicesTableModel(
                    listPendingsServices));
            ListSelectionModel selectionModel = tblPendingServices.getSelectionModel();
            tblPendingServices.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setAdmissionWiseServicesColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblPendingServices);
        }

    }

    private void setAdmissionWiseServicesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPendingServices.getColumnCount(); i++) {
            column = tblPendingServices.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(250);
            } else if (i == 1) {
                column.setPreferredWidth(110);
            }
        }
    }

    private void setPatientDemography(String patientId) {
        listAdmittedPatient = ctlPendingServices.selectAdmittedPatient(patientId);
        if (listAdmittedPatient.isEmpty()) {
            listAdmittedPatient.clear();
            txtPatientId.setText("");
            txtPatName.setText("");
            txtAgeGender.setText("");
            txtAdmissionNumber.setText("");
            txtWard.setText("");
            txtClient.setText("");
            txtPrimaryPhy.setText("");
        } else {
            ManageAdmissionServices objPendingServices = listAdmittedPatient.get(0);
            admissionNo = objPendingServices.getAdmissionNo();
            txtPatientId.setText(patientId.substring(3));
            txtPatName.setText(objPendingServices.getFullName());
            txtAgeGender.setText(objPendingServices.getAge()
                    + " / " + objPendingServices.getGenderDesc());
            txtAdmissionNumber.setText(admissionNo);
            txtWard.setText(objPendingServices.getWardDesc() + " / "
                    + objPendingServices.getBedDesc());
            txtClient.setText(objPendingServices.getClientDesc());
            txtPrimaryPhy.setText(objPendingServices.getPrimaryPhysicianName());
        }

    }

    private void setDepartmentStatus() {
        txtDepStatus.setText("");
        objPendingServices = listPendingsServices.get(
                tblPendingServices.getSelectedRow());
        departmentId = objPendingServices.getDepartmentId();
        CON = objPendingServices.getCON();
        if (departmentId.equalsIgnoreCase(Departments.pathology)) {
            txtDepStatus.setText(ctlPendingServices.selectDepartmentStatus(CON,
                    Database.DCMS.pathologyResultMaster));
        } else if (departmentId.equalsIgnoreCase(Departments.radiology)
                || departmentId.equalsIgnoreCase(Departments.cardiology)) {
            txtDepStatus.setText(ctlPendingServices.selectDepartmentStatus(CON,
                    Database.DCMS.imagingResult));
        } else {
            txtDepStatus.setText("In Progress");
        }

    }

    private void clear() {
        txtAdmissionNumber.setText("");
        txtAgeGender.setText("");
        txtClient.setText("");
        txtDepStatus.setText("");
        txtPatName.setText("");
        txtPatientId.setText("");
        txtPrimaryPhy.setText("");
        txtWard.setText("");
        txtCancelReq.setText("");
        txtStatus.setText("");

        listPendingRefundServices.clear();
        listPendingsServices.clear();
        tblRefundPendings.setModel(new PendingRefundStatusTableModel(
                listPendingRefundServices));
        tblPendingServices.setModel(new AdmissionServicesTableModel(listPendingsServices));
        tblPendingServices.setModel(new PendingRefundStatusTableModel(listPendingRefundServices));
    }

    private void setPendingRefundOrders() {
        listPendingRefundServices = ctlPendingServices.selectPendingCancelRequest(
                admissionNo, tableName);
        if (listPendingRefundServices.isEmpty()) {
            Vector<StudyData> listPendingRefundServices = new Vector();
            tblRefundPendings.setModel(new PendingRefundStatusTableModel(
                    listPendingRefundServices));
        } else {
            tblRefundPendings.setModel(new PendingRefundStatusTableModel(
                    listPendingRefundServices));
            ListSelectionModel selectionModel = tblRefundPendings.getSelectionModel();
            tblRefundPendings.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setPendingRefundOrdersColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblRefundPendings);
        }
    }

    private void setPendingRefundOrdersColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblRefundPendings.getColumnCount(); i++) {
            column = tblRefundPendings.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(260);
            } else if (i == 1) {
                column.setPreferredWidth(90);
            }
        }
    }

    private void displayRefundData() {
        tableName = Database.DCMS.item;
        if (cboInvoiceType.getSelectedIndex() == 0) {
            tableName = Database.DCMS.CPT;
        }
        setPendingRefundOrders();
    }

}
