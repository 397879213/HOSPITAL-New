package Form.Administration;

//import BO.Administration.SupportEmail;
//import Controller.Administration.SupportEmailController;
import BO.Trauma.EmergencyVisit;
import Controller.PatientController;
import Controller.Trauma.EmergencyVisitController;
import TableModel.Administration.EmergencyPendingTableModel;
import TableModel.Administration.EmergencyPerformedTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.UndoManager;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import utilities.Constants;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.JDocumentEditor;
import utilities.Status;

public class frmEmergency extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    private Action boldAction = new StyledEditorKit.BoldAction();
    private Action italicAction = new StyledEditorKit.ItalicAction();
    private Action underlineAction = new StyledEditorKit.UnderlineAction();
    KeyStroke boldKey = KeyStroke.getKeyStroke("control B");
    KeyStroke italicKey = KeyStroke.getKeyStroke("control I");
    KeyStroke underlineKey = KeyStroke.getKeyStroke("control U");
    JDocumentEditor ed = new JDocumentEditor();
    private UndoManager undoManager;
    public static AutoCompletion ac = null;
    public static CompletionProvider provider = null;

    public frmEmergency() {

        initComponents();

        this.setSize(Constants.xSize + 80, Constants.ySize - 35);
        //selectSupportEmail("", Status.save, "", "", "", "");
        btnExit.setMnemonic(KeyEvent.VK_X);
//        btnSave.setMnemonic(KeyEvent.VK_S);
        //btnSendRequest.setMnemonic(KeyEvent.VK_U);
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
        btnSave = new javax.swing.JButton();
        btnPerformed = new javax.swing.JButton();
        pnlSearchUser7 = new javax.swing.JPanel();
        pnlUserDetail = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtSearchPatientId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmerUnit = new javax.swing.JTextField();
        pnlSearchUser4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEmerPendingVisit = new javax.swing.JTable();
        pnlSearchUser5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEmerPerformedVisit = new javax.swing.JTable();
        pnlSearchUser9 = new javax.swing.JPanel();
        pnlUserDetail3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTransferTo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDischargeType = new javax.swing.JTextField();
        chkMedicalLegalCase = new javax.swing.JCheckBox();
        btnClear1 = new javax.swing.JButton();
        pnlSearchUser8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtTreatment = new javax.swing.JTextArea();
        pnlSearchUser6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtComplaints = new javax.swing.JTextArea();
        pnlUserDetail4 = new javax.swing.JPanel();
        btnSaveAndVerified = new javax.swing.JButton();
        btnVerifiedVitals = new javax.swing.JButton();
        btnSaveVitals = new javax.swing.JButton();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiastolic = new javax.swing.JTextField();
        txtFbs = new javax.swing.JTextField();
        txtRbs = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSystolic = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCurrentStatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Report Configuration");
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
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6)
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

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPerformed.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPerformed.setText("Discharge");
        btnPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnSave)
                    .addComponent(btnPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Performed Visit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient ID :");

        txtSearchPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Emerg. Unit:");

        txtEmerUnit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmerUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEmerUnitMouseReleased(evt);
            }
        });
        txtEmerUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmerUnitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetailLayout = new javax.swing.GroupLayout(pnlUserDetail);
        pnlUserDetail.setLayout(pnlUserDetailLayout);
        pnlUserDetailLayout.setHorizontalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlUserDetailLayout.setVerticalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pnlSearchUser4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Pending Visit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser4.setForeground(java.awt.SystemColor.activeCaption);

        tblEmerPendingVisit.setBackground(java.awt.SystemColor.activeCaption);
        tblEmerPendingVisit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Patient Id","Name","Age","Gender","Contact No"
            }
        ));
        tblEmerPendingVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmerPendingVisitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEmerPendingVisitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmerPendingVisitMouseReleased(evt);
            }
        });
        tblEmerPendingVisit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblEmerPendingVisitPropertyChange(evt);
            }
        });
        tblEmerPendingVisit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblEmerPendingVisitKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblEmerPendingVisit);

        javax.swing.GroupLayout pnlSearchUser4Layout = new javax.swing.GroupLayout(pnlSearchUser4);
        pnlSearchUser4.setLayout(pnlSearchUser4Layout);
        pnlSearchUser4Layout.setHorizontalGroup(
            pnlSearchUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        pnlSearchUser4Layout.setVerticalGroup(
            pnlSearchUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );

        pnlSearchUser5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Performed Visit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser5.setForeground(java.awt.SystemColor.activeCaption);

        tblEmerPerformedVisit.setBackground(java.awt.SystemColor.activeCaption);
        tblEmerPerformedVisit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null}},
            new String [] {
                "Sr.","Item Description"
            }
        ));
        tblEmerPerformedVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmerPerformedVisitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEmerPerformedVisitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmerPerformedVisitMouseReleased(evt);
            }
        });
        tblEmerPerformedVisit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblEmerPerformedVisitPropertyChange(evt);
            }
        });
        tblEmerPerformedVisit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblEmerPerformedVisitKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblEmerPerformedVisit);

        javax.swing.GroupLayout pnlSearchUser5Layout = new javax.swing.GroupLayout(pnlSearchUser5);
        pnlSearchUser5.setLayout(pnlSearchUser5Layout);
        pnlSearchUser5Layout.setHorizontalGroup(
            pnlSearchUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        pnlSearchUser5Layout.setVerticalGroup(
            pnlSearchUser5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlSearchUser7Layout = new javax.swing.GroupLayout(pnlSearchUser7);
        pnlSearchUser7.setLayout(pnlSearchUser7Layout);
        pnlSearchUser7Layout.setHorizontalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUserDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlSearchUser7Layout.setVerticalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlUserDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSearchUser9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treatment Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser9.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transfer Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail3.setForeground(java.awt.SystemColor.activeCaption);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Transfer To :");

        txtTransferTo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTransferTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferToActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Discharge Type:");

        txtDischargeType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDischargeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDischargeTypeActionPerformed(evt);
            }
        });

        chkMedicalLegalCase.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkMedicalLegalCase.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkMedicalLegalCase.setText("Medical  Case");
        chkMedicalLegalCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMedicalLegalCaseActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear1.setText("Transfer");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail3Layout = new javax.swing.GroupLayout(pnlUserDetail3);
        pnlUserDetail3.setLayout(pnlUserDetail3Layout);
        pnlUserDetail3Layout.setHorizontalGroup(
            pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                        .addComponent(txtTransferTo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                        .addComponent(txtDischargeType, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMedicalLegalCase, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        pnlUserDetail3Layout.setVerticalGroup(
            pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTransferTo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDischargeType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkMedicalLegalCase))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pnlSearchUser8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treatment Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser8.setForeground(java.awt.SystemColor.activeCaption);

        txtTreatment.setColumns(20);
        txtTreatment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTreatment.setLineWrap(true);
        txtTreatment.setRows(5);
        txtTreatment.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txtTreatment);

        javax.swing.GroupLayout pnlSearchUser8Layout = new javax.swing.GroupLayout(pnlSearchUser8);
        pnlSearchUser8.setLayout(pnlSearchUser8Layout);
        pnlSearchUser8Layout.setHorizontalGroup(
            pnlSearchUser8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlSearchUser8Layout.setVerticalGroup(
            pnlSearchUser8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        pnlSearchUser6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Complaints", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser6.setForeground(java.awt.SystemColor.activeCaption);

        txtComplaints.setColumns(20);
        txtComplaints.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComplaints.setLineWrap(true);
        txtComplaints.setRows(5);
        txtComplaints.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtComplaints);

        javax.swing.GroupLayout pnlSearchUser6Layout = new javax.swing.GroupLayout(pnlSearchUser6);
        pnlSearchUser6.setLayout(pnlSearchUser6Layout);
        pnlSearchUser6Layout.setHorizontalGroup(
            pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        pnlSearchUser6Layout.setVerticalGroup(
            pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlUserDetail4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail4.setForeground(java.awt.SystemColor.activeCaption);

        btnSaveAndVerified.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveAndVerified.setForeground(new java.awt.Color(0, 102, 0));
        btnSaveAndVerified.setText("Save & Verified");
        btnSaveAndVerified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAndVerifiedActionPerformed(evt);
            }
        });

        btnVerifiedVitals.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVerifiedVitals.setText("Verified");
        btnVerifiedVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifiedVitalsActionPerformed(evt);
            }
        });

        btnSaveVitals.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveVitals.setText("Save");
        btnSaveVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail4Layout = new javax.swing.GroupLayout(pnlUserDetail4);
        pnlUserDetail4.setLayout(pnlUserDetail4Layout);
        pnlUserDetail4Layout.setHorizontalGroup(
            pnlUserDetail4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerifiedVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveAndVerified)
                .addGap(58, 58, 58))
        );
        pnlUserDetail4Layout.setVerticalGroup(
            pnlUserDetail4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSaveAndVerified)
                .addComponent(btnVerifiedVitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveVitals))
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Vitals", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Temp (F) :");

        txtTemp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rbs :");

        txtDiastolic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDiastolic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDiastolicMouseReleased(evt);
            }
        });
        txtDiastolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiastolicActionPerformed(evt);
            }
        });

        txtFbs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFbsActionPerformed(evt);
            }
        });

        txtRbs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRbsActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Fbs :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Pulse :");

        txtPulse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Systolic :");

        txtSystolic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSystolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSystolicActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Diastolic :");

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRbs)
                    .addComponent(txtTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSystolic, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(txtPulse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFbs, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRbs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Patient Id :");

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContactNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContactNoMouseReleased(evt);
            }
        });
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtCurrentStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCurrentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCurrentStatusMouseReleased(evt);
            }
        });
        txtCurrentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentStatusActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Current Status:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No :");

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(txtContactNo))
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout pnlSearchUser9Layout = new javax.swing.GroupLayout(pnlSearchUser9);
        pnlSearchUser9.setLayout(pnlSearchUser9Layout);
        pnlSearchUser9Layout.setHorizontalGroup(
            pnlSearchUser9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlSearchUser9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlUserDetail3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlSearchUser9Layout.setVerticalGroup(
            pnlSearchUser9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser9Layout.createSequentialGroup()
                .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSearchUser9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtSearchPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientIdActionPerformed
        if (GUIUtils.completePatientId(txtSearchPatientId.getText().trim())) {
            patientId = (Constants.completePatientId);
            selectPending(patientId);
        } else {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Patient Id");
        }


    }//GEN-LAST:event_txtSearchPatientIdActionPerformed

    private void txtEmerUnitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmerUnitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmerUnitMouseReleased

    private void txtEmerUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmerUnitActionPerformed


    }//GEN-LAST:event_txtEmerUnitActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

        // selectSupportEmail("", "", txtPatientId.getText().trim(), "", "", "");
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtContactNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactNoMouseReleased


    }//GEN-LAST:event_txtContactNoMouseReleased

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        //selectSupportEmail(txtSubject.getText().trim(), "", "", "", "", "");
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

//        clearForm();

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed

    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (listRep.isEmpty() || tblEmerPendingVisit.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "List Is Empty");
            return;
        }

        current = listRep.get(tblEmerPendingVisit.getSelectedRow());
        current.setEmergencyUnit(TransferTo);
        if (ctlEmer.updatePendingVitals(current)) {
            JOptionPane.showMessageDialog(null, "Assigned Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Assign,Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

    private void txtDiastolicMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiastolicMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiastolicMouseReleased

    private void txtDiastolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiastolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiastolicActionPerformed

    private void txtFbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFbsActionPerformed

    private void txtRbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRbsActionPerformed

    private void txtTransferToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransferToActionPerformed
       lov.LOVDefinitionSelection(DefinitionTypes.medicalUnitId, txtTransferTo.getText(), this);
        txtTransferTo.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            
            txtTransferTo.setText(Constants.lovDescription.toUpperCase());
            current.setEmergencyUnit(Constants.lovID);
            TransferTo = Constants.lovDescription.toUpperCase();
        }
    }//GEN-LAST:event_txtTransferToActionPerformed

    private void txtCurrentStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCurrentStatusMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentStatusMouseReleased

    private void txtCurrentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentStatusActionPerformed

    private void btnSaveAndVerifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAndVerifiedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveAndVerifiedActionPerformed

    private void btnSaveVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVitalsActionPerformed
    
        
        if (txtTemp.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Temperature");
            txtTemp.requestFocus();
            return;
        }
        if (txtPulse.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pulse");
            txtPulse.requestFocus();
            return;
        }
        if (txtRbs.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pulse");
            txtRbs.requestFocus();
            return;
        }
        if (txtFbs.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pulse");
            txtFbs.requestFocus();
            return;
        }
        if (txtSystolic.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pulse");
            txtSystolic.requestFocus();
            return;
        }
        if (txtDiastolic.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pulse");
            txtDiastolic.requestFocus();
            return;
        }

        current.setTemperature(txtTemp.getText().trim());
        current.setPulse(txtPulse.getText().trim());
        current.setRbs(txtRbs.getText().trim());
        current.setFbs(txtFbs.getText().trim());
        current.setSystolic(txtSystolic.getText().trim());
        current.setDiastolic(txtDiastolic.getText().trim());
        current.setIsVitalFinal("N");

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Save Vitals.");
        if (confirmation != 0) {
            return;
        }
        if (ctlEmer.updatePendingVitals(current)) {
            JOptionPane.showMessageDialog(null, "Save Successfully");
            btnVerifiedVitals.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Unable to save, Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnSaveVitalsActionPerformed

    private void btnVerifiedVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifiedVitalsActionPerformed
        current.setTemperature(txtTemp.getText().trim());
        current.setPulse(txtPulse.getText().trim());
        current.setRbs(txtRbs.getText().trim());
        current.setFbs(txtFbs.getText().trim());
        current.setSystolic(txtSystolic.getText().trim());
        current.setDiastolic(txtDiastolic.getText().trim());
        current.setIsVitalFinal("Y");
        current.setOrderStatusId(Status.verified);

         int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Verify Vitals.");
        if (confirmation != 0) {
            return;
        }
        if (ctlEmer.updatePendingVitals(current)) {
            JOptionPane.showMessageDialog(null, "Verified Successfully");
            btnSaveVitals.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Verify, Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnVerifiedVitalsActionPerformed

    private void btnPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerformedActionPerformed

    private void tblEmerPendingVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmerPendingVisitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPendingVisitMouseClicked

    private void tblEmerPendingVisitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmerPendingVisitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPendingVisitMousePressed

    private void tblEmerPendingVisitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmerPendingVisitMouseReleased
         if (listRep.isEmpty() || tblEmerPendingVisit.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "List Is Empty");
            return;
        }

        current = listRep.get(tblEmerPendingVisit.getSelectedRow());
        txtPatientId.setText(current.getPatientId());
        txtPatientName.setText(current.getFullName());
        txtContactNo.setText(current.getContactNo());
        txtAge.setText(current.getAge() + "-" + current.getGender());
        txtCurrentStatus.setText(current.getEmergencyUnit());
        txtPulse.setText(current.getPulse());
        txtTemp.setText(current.getTemperature());
        txtSystolic.setText(current.getSystolic());
        txtDiastolic.setText(current.getDiastolic());
        txtFbs.setText(current.getFbs());
        txtRbs.setText(current.getRbs());
        txtComplaints.setText(current.getComplaints());
        txtTreatment.setText(current.getTreatment());
        
        btnVerifiedVitals.setEnabled(false);
//        btnSendEmail.setEnabled(false);

    }//GEN-LAST:event_tblEmerPendingVisitMouseReleased

    private void tblEmerPendingVisitPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblEmerPendingVisitPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPendingVisitPropertyChange

    private void tblEmerPendingVisitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmerPendingVisitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPendingVisitKeyPressed

    private void tblEmerPerformedVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmerPerformedVisitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPerformedVisitMouseClicked

    private void tblEmerPerformedVisitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmerPerformedVisitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPerformedVisitMousePressed

    private void tblEmerPerformedVisitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmerPerformedVisitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPerformedVisitMouseReleased

    private void tblEmerPerformedVisitPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblEmerPerformedVisitPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPerformedVisitPropertyChange

    private void tblEmerPerformedVisitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmerPerformedVisitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmerPerformedVisitKeyPressed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void txtSystolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSystolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSystolicActionPerformed

    private void txtDischargeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeTypeActionPerformed
       lov.LOVDefinitionSelection(DefinitionTypes.dischargeStatus, txtDischargeType.getText(), this);
        txtDischargeType.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            
            txtDischargeType.setText(Constants.lovDescription.toUpperCase());
            patientDischarge.setDischargeTypeId(Constants.lovID);
            DischargeType = Constants.lovDescription.toUpperCase();
        }
        
    }//GEN-LAST:event_txtDischargeTypeActionPerformed

    private void chkMedicalLegalCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMedicalLegalCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMedicalLegalCaseActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPerformed;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAndVerified;
    private javax.swing.JButton btnSaveVitals;
    private javax.swing.JButton btnVerifiedVitals;
    private javax.swing.JCheckBox chkMedicalLegalCase;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel pnlSearchUser4;
    private javax.swing.JPanel pnlSearchUser5;
    private javax.swing.JPanel pnlSearchUser6;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlSearchUser8;
    private javax.swing.JPanel pnlSearchUser9;
    private javax.swing.JPanel pnlUserDetail;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JPanel pnlUserDetail3;
    private javax.swing.JPanel pnlUserDetail4;
    private javax.swing.JTable tblEmerPendingVisit;
    private javax.swing.JTable tblEmerPerformedVisit;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtComplaints;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCurrentStatus;
    private javax.swing.JTextField txtDiastolic;
    private javax.swing.JTextField txtDischargeType;
    private javax.swing.JTextField txtEmerUnit;
    private javax.swing.JTextField txtFbs;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRbs;
    private javax.swing.JTextField txtSearchPatientId;
    private javax.swing.JTextField txtSystolic;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtTransferTo;
    private javax.swing.JTextArea txtTreatment;
    // End of variables declaration//GEN-END:variables

    //new declarations
    PatientController ctlPatient = new PatientController();

    EmergencyVisitController ctlEmer = new EmergencyVisitController();
    EmergencyVisit current = new EmergencyVisit();
    EmergencyVisit patientDischarge = new EmergencyVisit();

    List<EmergencyVisit> listRep = new ArrayList<>();
    String patientId = "";
    String fromDate = "";
    String TransferTo = "";
    String DischargeType = "";

    private void selectPending(String patientId) {

        listRep = ctlEmer.selectPendingByPatient(patientId);// FOR ALL DEPARTMENTS

        if (listRep.isEmpty()) {
            EmergencyVisit approvedFS
                    = new EmergencyVisit();
            List list = new ArrayList();
            list.add(approvedFS);
            tblEmerPendingVisit.setModel(new EmergencyPendingTableModel(list));
        } else {
            tblEmerPendingVisit.setModel(new EmergencyPendingTableModel(listRep));
        }
        ListSelectionModel selectionModel = tblEmerPendingVisit.getSelectionModel();
        tblEmerPendingVisit.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsComplainlist();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblEmerPendingVisit);

    }

    public void setColumnsWidthsComplainlist() {
        TableColumn column = null;
        for (int i = 0; i < tblEmerPendingVisit.getColumnCount(); i++) {
            column = tblEmerPendingVisit.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(70);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(90);
            } else if (i == 4) {
                column.setPreferredWidth(70);
            } else if (i == 5) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();

        comp.add(txtSearchPatientId);
        comp.add(txtAge);
        comp.add(txtComplaints);
        comp.add(txtContactNo);
        comp.add(txtCurrentStatus);
        comp.add(txtDiastolic);
        comp.add(txtEmerUnit);
        comp.add(txtPatientId);
        comp.add(txtFbs);
        comp.add(txtRbs);
        comp.add(txtPulse);
        comp.add(txtTemp);
        comp.add(txtTransferTo);
        comp.add(txtTreatment);
        comp.add(txtPatientName);
        comp.add(txtTemp);

        GUIUtils.setClear(comp);

        listRep.clear();

        tblEmerPendingVisit.setModel(new EmergencyPendingTableModel(listRep));
        tblEmerPerformedVisit.setModel(new EmergencyPerformedTableModel(listRep));

        listRep.clear();

    }
}
