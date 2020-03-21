package Form.OPD;

import BO.OPD.DengueFeverAssesmentBO;
import BO.OPD.PatientHospitalVisit;
import Controller.OPD.DengueFeverAssesmentController;
import TableModel.OPD.DengueAssestmentTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class DengueFeverAssesment extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    String con = "112", odi = "1";
    DengueFeverAssesmentController ctlDengue = new DengueFeverAssesmentController();
    List<DengueFeverAssesmentBO> listDengueMaster = new ArrayList();
    List<DengueFeverAssesmentBO> listMedicalHist = new ArrayList();
    List<DengueFeverAssesmentBO> listExamination = new ArrayList();
    List<DengueFeverAssesmentBO> listLabInv = new ArrayList();
    List<DengueFeverAssesmentBO> listUltrasound = new ArrayList();
    List<DengueFeverAssesmentBO> listWarningSign = new ArrayList();
    List<DengueFeverAssesmentBO> listPresumtiveDiag = new ArrayList();
    List<DengueFeverAssesmentBO> listERManagement = new ArrayList();
    List<DengueFeverAssesmentBO> listDisposal = new ArrayList();

    public DengueFeverAssesment() {// PatientHospitalVisit pat

        initComponents();
        this.setSize(Constants.xSize - 45, Constants.ySize - 70);
        btnExit.setMnemonic(KeyEvent.VK_X);
//        setDemgraphy(pat);
        checkDengueInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAgeGen = new javax.swing.JTextField();
        txtVisitNo = new javax.swing.JTextField();
        txtVisitDate = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblWarningSign = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblPresumtiveDiag = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblERManagment = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblDisposal = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblUltrasound = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblLabInv = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblExamination = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblMedicalHistory = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Outreach Inventory");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(964, 738));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dengue Fever Assesment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Patient Id : ");

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAgeGen.setEditable(false);
        txtAgeGen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtVisitNo.setEditable(false);
        txtVisitNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVisitNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisitNoActionPerformed(evt);
            }
        });

        txtVisitDate.setEditable(false);
        txtVisitDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVisitDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisitDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgeGen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVisitNo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVisitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId)
                    .addComponent(txtPatientName)
                    .addComponent(txtAgeGen)
                    .addComponent(txtVisitNo)
                    .addComponent(txtVisitDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Warning Signs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(102, 0, 0));

        tblWarningSign.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblWarningSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblWarningSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWarningSignMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblWarningSignMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblWarningSignMouseReleased(evt);
            }
        });
        tblWarningSign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblWarningSignKeyReleased(evt);
            }
        });
        jScrollPane16.setViewportView(tblWarningSign);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Presumtive Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel17.setForeground(new java.awt.Color(102, 0, 0));

        tblPresumtiveDiag.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPresumtiveDiag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblPresumtiveDiag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPresumtiveDiagMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPresumtiveDiagMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPresumtiveDiagMouseReleased(evt);
            }
        });
        tblPresumtiveDiag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPresumtiveDiagKeyReleased(evt);
            }
        });
        jScrollPane17.setViewportView(tblPresumtiveDiag);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel18.setForeground(new java.awt.Color(102, 0, 0));

        tblERManagment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblERManagment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblERManagment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblERManagmentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblERManagmentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblERManagmentMouseReleased(evt);
            }
        });
        tblERManagment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblERManagmentKeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(tblERManagment);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disposal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(102, 0, 0));

        tblDisposal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblDisposal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblDisposal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisposalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDisposalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDisposalMouseReleased(evt);
            }
        });
        tblDisposal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDisposalKeyReleased(evt);
            }
        });
        jScrollPane19.setViewportView(tblDisposal);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(102, 0, 0));

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ultrasound Findings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(102, 0, 0));

        tblUltrasound.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblUltrasound.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblUltrasound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUltrasoundMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUltrasoundMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUltrasoundMouseReleased(evt);
            }
        });
        tblUltrasound.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblUltrasoundKeyReleased(evt);
            }
        });
        jScrollPane15.setViewportView(tblUltrasound);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laboratory Investigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        tblLabInv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblLabInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblLabInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLabInvMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLabInvMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblLabInvMouseReleased(evt);
            }
        });
        tblLabInv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLabInvKeyReleased(evt);
            }
        });
        jScrollPane14.setViewportView(tblLabInv);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        tblExamination.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblExamination.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblExamination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExaminationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblExaminationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblExaminationMouseReleased(evt);
            }
        });
        tblExamination.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblExaminationKeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(tblExamination);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tblMedicalHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblMedicalHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblMedicalHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicalHistoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMedicalHistoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMedicalHistoryMouseReleased(evt);
            }
        });
        tblMedicalHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMedicalHistoryKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblMedicalHistory);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMedicalHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicalHistoryMouseClicked


    }//GEN-LAST:event_tblMedicalHistoryMouseClicked

    private void tblMedicalHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicalHistoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicalHistoryMousePressed

    private void tblMedicalHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicalHistoryMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listMedicalHist.get(tblMedicalHistory.getSelectedRow());
        if (tblMedicalHistory.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblMedicalHistory.getValueAt(tblMedicalHistory.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listMedicalHist = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengMedicalHistory, con, odi);
                setDengueInfo(listMedicalHist, tblMedicalHistory);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }

        if (tblMedicalHistory.getSelectedColumn() == 4
                && !obj.getAdditionlaInfo().equalsIgnoreCase("RE")
                && evt.getClickCount() % 2 == 0) {
            String query = "SELECT ID,DESCRIPTION                       \n"
                    + " FROM " + Database.DCMS.definitionTypeDetail + " \n"
                    + "WHERE DEF_TYPE_ID = " + obj.getAdditionlaInfo() + "\n"
                    + "ORDER BY ID                                      \n";

            lov.LOVSelection(query, this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                obj.setRemarks("");
                return;
            }
            obj.setRemarks(Constants.lovDescription);
            if (ctlDengue.updateRemarks(obj)) {
                listMedicalHist = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengMedicalHistory, con, odi);
                setDengueInfo(listMedicalHist, tblMedicalHistory);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }

    }//GEN-LAST:event_tblMedicalHistoryMouseReleased

    private void tblMedicalHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMedicalHistoryKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listMedicalHist.get(tblMedicalHistory.getSelectedRow());
        if (tblMedicalHistory.getSelectedColumn() == 4) {
            obj.setRemarks(tblMedicalHistory.getValueAt(
                    tblMedicalHistory.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listMedicalHist = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengMedicalHistory, con, odi);
                setDengueInfo(listMedicalHist, tblMedicalHistory);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }

    }//GEN-LAST:event_tblMedicalHistoryKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtVisitDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisitDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisitDateActionPerformed

    private void txtVisitNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisitNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisitNoActionPerformed

    private void tblExaminationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExaminationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblExaminationMouseClicked

    private void tblExaminationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExaminationMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblExaminationMousePressed

    private void tblExaminationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExaminationMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listExamination.get(tblExamination.getSelectedRow());
        if (tblExamination.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblExamination.getValueAt(tblExamination.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listExamination = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueExamination, con, odi);
                setDengueInfo(listExamination, tblExamination);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblExaminationMouseReleased

    private void tblExaminationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblExaminationKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listExamination.get(tblExamination.getSelectedRow());
        if (tblExamination.getSelectedColumn() == 4) {
            obj.setRemarks(tblExamination.getValueAt(
                    tblExamination.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listExamination = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueExamination, con, odi);
                setDengueInfo(listExamination, tblExamination);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblExaminationKeyReleased

    private void tblLabInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLabInvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLabInvMouseClicked

    private void tblLabInvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLabInvMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLabInvMousePressed

    private void tblLabInvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLabInvMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listLabInv.get(tblLabInv.getSelectedRow());
        if (tblLabInv.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblLabInv.getValueAt(tblLabInv.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listLabInv = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueLabInvestigation, con, odi);
                setDengueInfo(listLabInv, tblLabInv);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblLabInvMouseReleased

    private void tblLabInvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLabInvKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listLabInv.get(tblLabInv.getSelectedRow());
        if (tblLabInv.getSelectedColumn() == 4) {
            obj.setRemarks(tblLabInv.getValueAt(
                    tblLabInv.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listLabInv = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueLabInvestigation, con, odi);
                setDengueInfo(listLabInv, tblLabInv);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblLabInvKeyReleased

    private void tblUltrasoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUltrasoundMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUltrasoundMouseClicked

    private void tblUltrasoundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUltrasoundMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUltrasoundMousePressed

    private void tblUltrasoundMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUltrasoundMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listUltrasound.get(tblUltrasound.getSelectedRow());
        if (tblUltrasound.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblUltrasound.getValueAt(tblUltrasound.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listUltrasound = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueUltrasoundInves, con, odi);
                setDengueInfo(listUltrasound, tblUltrasound);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblUltrasoundMouseReleased

    private void tblUltrasoundKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUltrasoundKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listUltrasound.get(tblUltrasound.getSelectedRow());
        if (tblUltrasound.getSelectedColumn() == 4) {
            obj.setRemarks(tblUltrasound.getValueAt(
                    tblUltrasound.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listUltrasound = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueUltrasoundInves, con, odi);
                setDengueInfo(listUltrasound, tblUltrasound);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblUltrasoundKeyReleased

    private void tblWarningSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarningSignMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblWarningSignMouseClicked

    private void tblWarningSignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarningSignMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblWarningSignMousePressed

    private void tblWarningSignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarningSignMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listWarningSign.get(tblWarningSign.getSelectedRow());
        if (tblWarningSign.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblWarningSign.getValueAt(tblWarningSign.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listWarningSign = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueWarningSigns, con, odi);
                setDengueInfo(listWarningSign, tblWarningSign);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblWarningSignMouseReleased

    private void tblWarningSignKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblWarningSignKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listWarningSign.get(tblWarningSign.getSelectedRow());
        if (tblWarningSign.getSelectedColumn() == 4) {
            obj.setRemarks(tblWarningSign.getValueAt(
                    tblWarningSign.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listWarningSign = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueWarningSigns, con, odi);
                setDengueInfo(listWarningSign, tblWarningSign);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblWarningSignKeyReleased

    private void tblPresumtiveDiagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresumtiveDiagMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPresumtiveDiagMouseClicked

    private void tblPresumtiveDiagMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresumtiveDiagMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPresumtiveDiagMousePressed

    private void tblPresumtiveDiagMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresumtiveDiagMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listPresumtiveDiag.get(tblPresumtiveDiag.getSelectedRow());
        if (tblPresumtiveDiag.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblPresumtiveDiag.getValueAt(tblPresumtiveDiag.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listPresumtiveDiag = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.denguePresumtiveDiagnosis, con, odi);
                setDengueInfo(listPresumtiveDiag, tblPresumtiveDiag);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblPresumtiveDiagMouseReleased

    private void tblPresumtiveDiagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPresumtiveDiagKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listPresumtiveDiag.get(tblPresumtiveDiag.getSelectedRow());
        if (tblPresumtiveDiag.getSelectedColumn() == 4) {
            obj.setRemarks(tblPresumtiveDiag.getValueAt(
                    tblPresumtiveDiag.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listPresumtiveDiag = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.denguePresumtiveDiagnosis, con, odi);
                setDengueInfo(listPresumtiveDiag, tblPresumtiveDiag);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblPresumtiveDiagKeyReleased

    private void tblERManagmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblERManagmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblERManagmentMouseClicked

    private void tblERManagmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblERManagmentMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblERManagmentMousePressed

    private void tblERManagmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblERManagmentMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listERManagement.get(tblERManagment.getSelectedRow());
        if (tblERManagment.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblERManagment.getValueAt(tblERManagment.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listERManagement = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueEmergencyManag, con, odi);
                setDengueInfo(listERManagement, tblERManagment);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblERManagmentMouseReleased

    private void tblERManagmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblERManagmentKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listERManagement.get(tblERManagment.getSelectedRow());
        if (tblERManagment.getSelectedColumn() == 4) {
            obj.setRemarks(tblERManagment.getValueAt(
                    tblERManagment.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listERManagement = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueEmergencyManag, con, odi);
                setDengueInfo(listERManagement, tblERManagment);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblERManagmentKeyReleased

    private void tblDisposalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisposalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDisposalMouseClicked

    private void tblDisposalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisposalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDisposalMousePressed

    private void tblDisposalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisposalMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listDisposal.get(tblDisposal.getSelectedRow());
        if (tblDisposal.getSelectedColumn() == 3) {
            obj.setSelection("N");
            if (tblDisposal.getValueAt(tblDisposal.getSelectedRow(), 3).equals(true)) {
                obj.setSelection("Y");
            }
            if (ctlDengue.updateDengueAsst(obj)) {
                listDisposal = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueDisposal, con, odi);
                setDengueInfo(listDisposal, tblDisposal);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }

        if (tblDisposal.getSelectedColumn() == 4
                && !obj.getAdditionlaInfo().equalsIgnoreCase("RE")
                && evt.getClickCount() % 2 == 0) {
            String query = "SELECT ID,DESCRIPTION                       \n"
                    + " FROM " + Database.DCMS.definitionTypeDetail + " \n"
                    + " WHERE DEF_TYPE_ID = " + obj.getAdditionlaInfo() + "\n"
                    + " ORDER BY ID                                     \n";

            lov.LOVSelection(query, this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                obj.setRemarks("");
                return;
            }
            obj.setRemarks(Constants.lovDescription);
            if (ctlDengue.updateRemarks(obj)) {
                listDisposal = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueDisposal, con, odi);
                setDengueInfo(listDisposal, tblDisposal);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblDisposalMouseReleased

    private void tblDisposalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDisposalKeyReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listDisposal.get(tblDisposal.getSelectedRow());
        if (tblDisposal.getSelectedColumn() == 4) {
            obj.setRemarks(tblDisposal.getValueAt(
                    tblDisposal.getSelectedRow(), 4).toString().trim());
            if (ctlDengue.updateRemarks(obj)) {
                listDisposal = ctlDengue.selectDengueDefinitions(
                        DefinitionTypes.dengueDisposal, con, odi);
                setDengueInfo(listDisposal, tblDisposal);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save info.");
            }
        }
    }//GEN-LAST:event_tblDisposalKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JTable tblDisposal;
    private javax.swing.JTable tblERManagment;
    private javax.swing.JTable tblExamination;
    private javax.swing.JTable tblLabInv;
    private javax.swing.JTable tblMedicalHistory;
    private javax.swing.JTable tblPresumtiveDiag;
    private javax.swing.JTable tblUltrasound;
    private javax.swing.JTable tblWarningSign;
    private javax.swing.JTextField txtAgeGen;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtVisitDate;
    private javax.swing.JTextField txtVisitNo;
    // End of variables declaration//GEN-END:variables

    private void setDengueInfo(List<DengueFeverAssesmentBO> listDengue, JTable table) {
        if (listDengue.isEmpty()) {
            listDengue.add(new DengueFeverAssesmentBO());
            table.setModel(new DengueAssestmentTableModel(listDengue));
        } else {
            table.setModel(new DengueAssestmentTableModel(listDengue));
            ListSelectionModel selectionModel = table.getSelectionModel();
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setItemsColumnsWidths(table);
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(table);
        }

    }

    private void setItemsColumnsWidths(JTable table) {
        TableColumn column = null;
        for (int i = 0; i < table.getColumnCount(); i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(180);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void selectDengueAssestInfo() {
        listMedicalHist = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengMedicalHistory, con, odi);
        setDengueInfo(listMedicalHist, tblMedicalHistory);
        listExamination = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengueExamination, con, odi);
        setDengueInfo(listExamination, tblExamination);
        listLabInv = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengueLabInvestigation, con, odi);
        setDengueInfo(listLabInv, tblLabInv);
        listUltrasound = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengueUltrasoundInves, con, odi);
        setDengueInfo(listUltrasound, tblUltrasound);
        listWarningSign = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengueWarningSigns, con, odi);
        setDengueInfo(listWarningSign, tblWarningSign);
        listPresumtiveDiag = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.denguePresumtiveDiagnosis, con, odi);
        setDengueInfo(listPresumtiveDiag, tblPresumtiveDiag);
        listERManagement = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengueEmergencyManag, con, odi);
        setDengueInfo(listERManagement, tblERManagment);
        listDisposal = ctlDengue.selectDengueDefinitions(
                DefinitionTypes.dengueDisposal, con, odi);
        setDengueInfo(listDisposal, tblDisposal);
    }

    private void checkDengueInfo() {
        listDengueMaster = ctlDengue.selectDengueAssetmentMaster(con, odi);
        if (listDengueMaster.isEmpty()) {
            if (ctlDengue.insertDefinitionsInDengueMaster(con, odi)) {
                selectDengueAssestInfo();
            } else {
                JOptionPane.showMessageDialog(null, "There is some configuration issue.\n"
                        + "Please Contact Support Team.");
            }
        } else {
            selectDengueAssestInfo();
        }
    }

    private void setDemgraphy(PatientHospitalVisit pat) {
        this.con = pat.getCON();
        this.odi = pat.getODI();
        txtPatientId.setText(pat.getPatientId().substring(3));
        txtPatientName.setText(pat.getPatientName());
        txtAgeGen.setText(pat.getAge()+"/ "+ pat.getGenderDescription());
//        txtVisitNo.setText(pat.getvis());
//        txtVisitDate.setText(pat.getvis());
    }

}
