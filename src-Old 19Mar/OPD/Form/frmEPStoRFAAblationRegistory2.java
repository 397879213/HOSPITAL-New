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


public class frmEPStoRFAAblationRegistory2 extends javax.swing.JInternalFrame {

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

    public frmEPStoRFAAblationRegistory2() {
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
        jLabel24 = new javax.swing.JLabel();
        txtFromDate1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel25 = new javax.swing.JLabel();
        txtTotalInvoice1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtTotalInvoice2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtTotalInvoice3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTotalInvoice4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtTotalInvoice5 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtTotalInvoice6 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtTotalInvoice7 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtTotalInvoice8 = new javax.swing.JTextField();
        pnlSearch = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtTotalInvoice9 = new javax.swing.JTextField();
        txtFromDate2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel34 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"EPS-RFA Ablation Registory");
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUpdateHistory.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUpdateHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procedural Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUpdateHistory.setForeground(java.awt.SystemColor.activeCaption);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Procedure Date :");

        txtFromDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDate1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Procedure Duration :");

        txtTotalInvoice1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Fluoroscopy Time :");

        txtTotalInvoice2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("# Energy Appli. :");

        txtTotalInvoice3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice3ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Time Energy Appli. :");

        txtTotalInvoice4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice4ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Exposure Dose :");

        txtTotalInvoice5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice5ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Complications :");

        txtTotalInvoice6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice6ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Medication :");

        txtTotalInvoice7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice7ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Power of Energy Appli. (Ws) :");

        txtTotalInvoice8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUpdateHistoryLayout = new javax.swing.GroupLayout(pnlUpdateHistory);
        pnlUpdateHistory.setLayout(pnlUpdateHistoryLayout);
        pnlUpdateHistoryLayout.setHorizontalGroup(
            pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                        .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalInvoice2)
                            .addComponent(txtFromDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalInvoice5)
                            .addComponent(txtTotalInvoice6))
                        .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalInvoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHistoryLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalInvoice4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHistoryLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalInvoice3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateHistoryLayout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalInvoice7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalInvoice8)))
                .addContainerGap())
        );
        pnlUpdateHistoryLayout.setVerticalGroup(
            pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateHistoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFromDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpdateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalInvoice8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlSearch.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ablation Target", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jCheckBox3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox3.setText("Sinus Node");

        jCheckBox4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox4.setText("AV Node Re-Entry");

        jCheckBox5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox5.setText("AV Conduction (Therapeutic AV Block / Modulation)");

        jCheckBox6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox6.setText("Single Accessory Pathway");

        jCheckBox7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox7.setText("Multiple Accessory Pathway");

        jCheckBox8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox8.setText("Focal Atrial Tachycardia");

        jCheckBox9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox9.setText("Typical flutter");

        jCheckBox10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox10.setText("Macroreentrant Atrial Tachycardia (RA)");

        jCheckBox11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox11.setText("Other Foci Triggering");

        jCheckBox12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox12.setText("Macroreentrant Atrial Tachycardia (LA)");

        jCheckBox13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox13.setText("Focal VT RVOT/LVOT");

        jCheckBox14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox14.setText("Fascicular VT LV");

        jCheckBox15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox15.setText("Pulm Vein Foci Triggering AF");

        jCheckBox16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox16.setText("Pulm Venous Encirclement (AF)");

        jCheckBox17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox17.setText("LV Scar Related VT");

        jCheckBox18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox18.setText("RV Scar / Dysplasia Related VT");

        jCheckBox19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox19.setText("Other Target");

        jCheckBox20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox20.setText("Bundle Branch Re-Entrant VT");

        jCheckBox21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox21.setText("Unknown");

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox5)
                .addGap(27, 27, 27))
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addGap(96, 96, 96)
                        .addComponent(jCheckBox15))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox19))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox18)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox12)))
                    .addComponent(jCheckBox21))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discharge", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Survival Status :");

        txtTotalInvoice9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTotalInvoice9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvoice9ActionPerformed(evt);
            }
        });

        txtFromDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDate2ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Discharge Date :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalInvoice9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFromDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFromDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalInvoice9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSearchUser7Layout = new javax.swing.GroupLayout(pnlSearchUser7);
        pnlSearchUser7.setLayout(pnlSearchUser7Layout);
        pnlSearchUser7Layout.setHorizontalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlUpdateHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSearchUser7Layout.setVerticalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUpdateHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchUser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
//        txtConsultant.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void txtFromDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromDate1ActionPerformed

    private void txtTotalInvoice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice1ActionPerformed

    private void txtTotalInvoice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice2ActionPerformed

    private void txtTotalInvoice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice3ActionPerformed

    private void txtTotalInvoice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice4ActionPerformed

    private void txtTotalInvoice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice5ActionPerformed

    private void txtTotalInvoice6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice6ActionPerformed

    private void txtTotalInvoice7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice7ActionPerformed

    private void txtTotalInvoice8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice8ActionPerformed

    private void txtTotalInvoice9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvoice9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvoice9ActionPerformed

    private void txtFromDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromDate2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlUpdateHistory;
    private org.jdesktop.swingx.JXDatePicker txtFromDate1;
    private org.jdesktop.swingx.JXDatePicker txtFromDate2;
    private javax.swing.JTextField txtTotalInvoice1;
    private javax.swing.JTextField txtTotalInvoice2;
    private javax.swing.JTextField txtTotalInvoice3;
    private javax.swing.JTextField txtTotalInvoice4;
    private javax.swing.JTextField txtTotalInvoice5;
    private javax.swing.JTextField txtTotalInvoice6;
    private javax.swing.JTextField txtTotalInvoice7;
    private javax.swing.JTextField txtTotalInvoice8;
    private javax.swing.JTextField txtTotalInvoice9;
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
     //   ListSelectionModel selectionMod = tblUpdateHistory.getSelectionModel();
       // tblUpdateHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setColumnsWidthsUpdateHistory();
     //   selectionMod.setSelectionInterval(0, 0);
     //   Constants.tablelook.setJTableEnvironment(tblUpdateHistory);
    }

    private void selectPatientHistory() {

       // tblPatientInfo.setModel(new OPDPatientInfoTableModel(listPatientHistory));
      //  ListSelectionModel selectionMod = tblPatientInfo.getSelectionModel();
      // tblPatientInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   //     setColumnsWidthsPatientInfo();
       // selectionMod.setSelectionInterval(0, 0);
     //   Constants.tablelook.setJTableEnvironment(tblPatientInfo);
       
       
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
      //  comp.add(txtConsultant);
     //   comp.add(txtSpecility);
        GUIUtils.setClear(comp);
        listFS.clear();
    //    tblUpdateHistory.setModel(new ConsultantInfoTableModel(listFS));
        listPatientHistory.clear();
      //  tblPatientInfo.setModel(new OPDPatientInfoTableModel(listPatientHistory));
    }
}
