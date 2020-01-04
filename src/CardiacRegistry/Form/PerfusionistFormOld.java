package CardiacRegistry.Form;

import CardiacRegistry.BO.PerfusionistBO;
import CardiacRegistry.Controller.PerfusionistController;
import CardiacRegistry.TableModel.PerfusionBloodGasesTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;

public class PerfusionistFormOld extends javax.swing.JInternalFrame {

    String cardiacId = "1";
    List<PerfusionistBO> listBG = new ArrayList();

    public PerfusionistFormOld() {

        initComponents();
        this.setSize(Constants.xSize - 120, Constants.ySize - 90);
        selectBloodGases();
    }
    PerfusionistBO objPerfusionist = new PerfusionistBO();
    PerfusionistController ctlPerfusionist = new PerfusionistController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMemberId3 = new javax.swing.JTextField();
        txtMemberId4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMemberId6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMemberId7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMemberId8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMemberId9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtPerformDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtMemberId11 = new javax.swing.JTextField();
        txtMemberId12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtMemberId13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtMemberId14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtMemberId17 = new javax.swing.JTextField();
        txtMemberId18 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtMemberId19 = new javax.swing.JTextField();
        txtMemberId20 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtMemberId21 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtMemberId22 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtMemberId23 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtMemberId24 = new javax.swing.JTextField();
        txtMemberId25 = new javax.swing.JTextField();
        txtMemberId26 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtMemberId27 = new javax.swing.JTextField();
        txtMemberId28 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        txtMemberId43 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtMemberId44 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtMemberId45 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtMemberId46 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtMemberId29 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtMemberId30 = new javax.swing.JTextField();
        txtMemberId31 = new javax.swing.JTextField();
        txtMemberId32 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtMemberId33 = new javax.swing.JTextField();
        txtMemberId34 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtMemberId35 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtMemberId36 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtMemberId37 = new javax.swing.JTextField();
        txtMemberId38 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtMemberId39 = new javax.swing.JTextField();
        txtMemberId40 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtMemberId41 = new javax.swing.JTextField();
        txtMemberId42 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        txtMemberId10 = new javax.swing.JTextField();
        txtMemberId47 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblDrugs = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblCheckList = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tblPatientInfo = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        txtMemberId50 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtMemberId51 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tblPatientInfo1 = new javax.swing.JTable();
        txtMemberId74 = new javax.swing.JTextField();
        txtMemberId75 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tblPatientInfo2 = new javax.swing.JTable();
        txtMemberId76 = new javax.swing.JTextField();
        txtMemberId77 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtBloodFlow = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtFio2 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtGflow = new javax.swing.JTextField();
        txtPH = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txtHco2 = new javax.swing.JTextField();
        txtPco2 = new javax.swing.JTextField();
        txtPo2 = new javax.swing.JTextField();
        txtBE = new javax.swing.JTextField();
        txtTco2 = new javax.swing.JTextField();
        txtNa = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtO2 = new javax.swing.JTextField();
        txtK = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtCA = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtLac = new javax.swing.JTextField();
        txtHb = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtSugar = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtAct = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txtHeparin = new javax.swing.JTextField();
        btnSaveBloodGases = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblBloodGases = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMemberId1 = new javax.swing.JTextField();
        txtMemberId2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(868, 721));
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

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Exit");

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 102));
        jButton3.setText("Save");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "s", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Perfusionist : ");

        txtMemberId3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId3ActionPerformed(evt);
            }
        });

        txtMemberId4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Asst. Perfusionist : ");

        txtMemberId6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId6ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Heparinized@ : ");

        txtMemberId7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId7ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Operation : ");

        txtMemberId8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId8ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Oxygenator : ");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Cpg System : ");

        txtMemberId9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId9ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("IAB Catheter : ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Redo : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N"}));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N"}));

        txtPerformDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPerformDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerformDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId3)
                    .addComponent(txtMemberId4)
                    .addComponent(txtMemberId7)
                    .addComponent(txtMemberId8)
                    .addComponent(txtMemberId9)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtMemberId6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 116, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPerformDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerformDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Surgeon : ");

        txtMemberId11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId11ActionPerformed(evt);
            }
        });

        txtMemberId12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId12ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Assitant : ");

        txtMemberId13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId13ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Anesthetist : ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId11)
                    .addComponent(txtMemberId12)
                    .addComponent(txtMemberId13))
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cannulae", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Venous : ");

        txtMemberId14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId14ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Antegrade : ");

        txtMemberId17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId17ActionPerformed(evt);
            }
        });

        txtMemberId18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId18ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Aortic : ");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Retrograde : ");

        txtMemberId19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId19ActionPerformed(evt);
            }
        });

        txtMemberId20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId20ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Hemofilter : ");

        txtMemberId21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId21ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Sump/ Vent : ");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Connectors : ");

        txtMemberId22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMemberId14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMemberId21)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtMemberId18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMemberId17, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMemberId19))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMemberId20))))
                            .addComponent(txtMemberId22))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Height (m) : ");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Weight (kg) : ");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Hb gm/dl : ");

        txtMemberId23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId23ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Blood Group : ");

        txtMemberId24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId24ActionPerformed(evt);
            }
        });

        txtMemberId25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId25ActionPerformed(evt);
            }
        });

        txtMemberId26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId26ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("S. Area (m3) : ");

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("B. Flow (Lmin4) : ");

        txtMemberId27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId27ActionPerformed(evt);
            }
        });

        txtMemberId28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemberId23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemberId27, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemberId28, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMemberId26, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtMemberId24)
                    .addComponent(txtMemberId25))
                .addGap(5, 5, 5))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prime", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Hartmanns : ");

        txtMemberId43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId43ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Heparin : ");

        txtMemberId44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId44ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Mannitol : ");

        txtMemberId45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId45ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Blood/ RBC : ");

        txtMemberId46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId45)
                    .addComponent(txtMemberId46)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtMemberId43, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMemberId44, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(102, 0, 0));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Aortic : ");

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Mitral : ");

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Pulmonary : ");

        txtMemberId29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId29ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("E. F : ");

        txtMemberId30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId30ActionPerformed(evt);
            }
        });

        txtMemberId31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId31ActionPerformed(evt);
            }
        });

        txtMemberId32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId32ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Urea : ");

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Creatinine : ");

        txtMemberId33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId33ActionPerformed(evt);
            }
        });

        txtMemberId34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId34ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Valve : ");

        txtMemberId35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId35ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("L. M. S : ");

        txtMemberId36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId36ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Diabetic : ");

        jLabel50.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("HBs/Anti Hcv : ");

        txtMemberId37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId37ActionPerformed(evt);
            }
        });

        txtMemberId38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId38ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Other : ");

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Allergies : ");

        txtMemberId39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId39ActionPerformed(evt);
            }
        });

        txtMemberId40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId40ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("E. F : ");

        txtMemberId41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId41ActionPerformed(evt);
            }
        });

        txtMemberId42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId42ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Pulmonary : ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMemberId40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtMemberId37, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId35, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId29, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId34, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId33, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemberId42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMemberId32)
                    .addComponent(txtMemberId30)
                    .addComponent(txtMemberId31)
                    .addComponent(txtMemberId36)
                    .addComponent(txtMemberId38)
                    .addComponent(txtMemberId39)
                    .addComponent(txtMemberId41, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Perfusion", jPanel7);

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "s", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(102, 0, 0));

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drugs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel17.setForeground(new java.awt.Color(102, 0, 0));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Drug : ");

        txtMemberId10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId10ActionPerformed(evt);
            }
        });

        txtMemberId47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId47ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 0, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Dose/ Quantity : ");

        tblDrugs.setBackground(java.awt.SystemColor.activeCaption);
        tblDrugs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Medicine", "Quantity"
            }
        ));
        tblDrugs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDrugsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDrugsMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDrugsMouseReleased(evt);
            }
        });
        tblDrugs.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblDrugsPropertyChange(evt);
            }
        });
        tblDrugs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDrugsKeyReleased(evt);
            }
        });
        jScrollPane26.setViewportView(tblDrugs);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemberId10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemberId47, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(102, 0, 0));

        tblCheckList.setBackground(java.awt.SystemColor.activeCaption);
        tblCheckList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Description", "Y/N"

            }
        ));
        tblCheckList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCheckListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCheckListMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCheckListMouseReleased(evt);
            }
        });
        tblCheckList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblCheckListPropertyChange(evt);
            }
        });
        tblCheckList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCheckListKeyReleased(evt);
            }
        });
        jScrollPane27.setViewportView(tblCheckList);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bypass Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel22.setForeground(new java.awt.Color(102, 0, 0));

        tblPatientInfo.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ON Time", "OFF Time", "Total Time"
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
        jScrollPane29.setViewportView(tblPatientInfo);

        jLabel63.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("ON : ");

        txtMemberId50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId50ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("OFF : ");

        txtMemberId51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId50, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId51, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circ. Arrest Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel23.setForeground(new java.awt.Color(102, 0, 0));

        tblPatientInfo1.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Start Time", "End Time", "Total Time"
            }
        ));
        tblPatientInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientInfo1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientInfo1MouseReleased(evt);
            }
        });
        tblPatientInfo1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientInfo1PropertyChange(evt);
            }
        });
        tblPatientInfo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientInfo1KeyReleased(evt);
            }
        });
        jScrollPane30.setViewportView(tblPatientInfo1);

        txtMemberId74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId74.setVerifyInputWhenFocusTarget(false);
        txtMemberId74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId74ActionPerformed(evt);
            }
        });

        txtMemberId75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId75ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Start : ");

        jLabel68.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("End : ");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel65)
                .addGap(4, 4, 4)
                .addComponent(txtMemberId74, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId75, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "X-Clamp Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel24.setForeground(new java.awt.Color(102, 0, 0));

        tblPatientInfo2.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ON Time", "OFF Time", "Total Time"
            }
        ));
        tblPatientInfo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientInfo2MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientInfo2MouseReleased(evt);
            }
        });
        tblPatientInfo2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientInfo2PropertyChange(evt);
            }
        });
        tblPatientInfo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientInfo2KeyReleased(evt);
            }
        });
        jScrollPane31.setViewportView(tblPatientInfo2);

        txtMemberId76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId76ActionPerformed(evt);
            }
        });

        txtMemberId77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId77ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("ON : ");

        jLabel69.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("OFF : ");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel66)
                .addGap(3, 3, 3)
                .addComponent(txtMemberId76, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtMemberId77, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberId76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Detail Info", jPanel15);

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Gases", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        jPanel20.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Values", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(102, 0, 0));

        jLabel60.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Blood Flow L/min :");

        txtBloodFlow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBloodFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodFlowActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Temperature°C :");

        txtTemperature.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("FiO2 % :");

        txtFio2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFio2ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(102, 0, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("G. Flow L/min :");

        txtGflow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtGflow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGflowActionPerformed(evt);
            }
        });

        txtPH.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 0, 0));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("PO2 mm Hg : ");

        jLabel74.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 0, 0));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("PH :");

        jLabel75.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 0, 0));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel75.setText("HCO2 mmol/l :");

        jLabel76.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel76.setText("PCO2 mm Hg :");

        txtHco2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHco2ActionPerformed(evt);
            }
        });

        txtPco2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPco2ActionPerformed(evt);
            }
        });

        txtPo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPo2ActionPerformed(evt);
            }
        });

        txtBE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBEActionPerformed(evt);
            }
        });

        txtTco2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTco2ActionPerformed(evt);
            }
        });

        txtNa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 0, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("TCO2 mmol/l :");

        jLabel78.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("B. E. mmol/l :");

        jLabel79.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 0, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("O2Sat% :");

        jLabel80.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 0, 0));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("Na + mmol/l :");

        txtO2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtO2ActionPerformed(evt);
            }
        });

        txtK.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 0, 0));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("Lac :");

        txtCA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCAActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 0, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("Hb gm/dl :");

        jLabel83.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("Ca++mmol/l :");

        txtLac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLacActionPerformed(evt);
            }
        });

        txtHb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHbActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 0, 0));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("K+ mmol/l :");

        jLabel86.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(102, 0, 0));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("Sugar mg/dl :");

        txtSugar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSugarActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(102, 0, 0));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setText("ACT sec : ");

        txtAct.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 0, 0));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("Heparin KU : ");

        txtHeparin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHeparin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeparinActionPerformed(evt);
            }
        });

        btnSaveBloodGases.setText("Save and Fianl");
        btnSaveBloodGases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBloodGasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBE, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBloodFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPH, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSugar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAct, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCA, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPco2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtO2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtHeparin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTco2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(btnSaveBloodGases)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGflow, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHco2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFio2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGflow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPco2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHco2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtO2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTco2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSugar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeparin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveBloodGases))
                .addGap(3, 3, 3))
        );

        jPanel21.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Gases Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel21.setForeground(new java.awt.Color(102, 0, 0));

        tblBloodGases.setBackground(java.awt.SystemColor.activeCaption);
        tblBloodGases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Blood Flow", "PH", "B.E", "K+", "Sugar",
                "Temparture", "Fio2", "G Flow"

            }
        ));
        tblBloodGases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBloodGasesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblBloodGasesMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBloodGasesMouseReleased(evt);
            }
        });
        tblBloodGases.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblBloodGasesPropertyChange(evt);
            }
        });
        tblBloodGases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblBloodGasesKeyReleased(evt);
            }
        });
        jScrollPane28.setViewportView(tblBloodGases);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Blood Gases", jPanel8);

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demography", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id : ");

        txtMemberId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIdActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Full Name : ");

        txtMemberId1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId1ActionPerformed(evt);
            }
        });

        txtMemberId2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberId2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberId2)
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberId2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlPL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIdActionPerformed

    private void txtMemberId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId1ActionPerformed

    private void txtMemberId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId2ActionPerformed

    private void txtMemberId3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId3ActionPerformed

    private void txtMemberId4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId4ActionPerformed

    private void txtMemberId6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId6ActionPerformed

    private void txtMemberId7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId7ActionPerformed

    private void txtMemberId8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId8ActionPerformed

    private void txtMemberId9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId9ActionPerformed

    private void txtPerformDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerformDateActionPerformed
        // TODO add your handling code here:
        //        if (txtPerformDate.getDate().getDate() == 0) {
        //            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
        //                "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
        //            return;
        //        }
        //        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        //        performDate = dateFormat.format(txtPerformDate.getDate());
    }//GEN-LAST:event_txtPerformDateActionPerformed

    private void txtMemberId11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId11ActionPerformed

    private void txtMemberId12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId12ActionPerformed

    private void txtMemberId13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId13ActionPerformed

    private void txtMemberId14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId14ActionPerformed

    private void txtMemberId17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId17ActionPerformed

    private void txtMemberId18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId18ActionPerformed

    private void txtMemberId19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId19ActionPerformed

    private void txtMemberId20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId20ActionPerformed

    private void txtMemberId21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId21ActionPerformed

    private void txtMemberId22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId22ActionPerformed

    private void txtMemberId23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId23ActionPerformed

    private void txtMemberId24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId24ActionPerformed

    private void txtMemberId25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId25ActionPerformed

    private void txtMemberId26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId26ActionPerformed

    private void txtMemberId27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId27ActionPerformed

    private void txtMemberId28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId28ActionPerformed

    private void txtMemberId43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId43ActionPerformed

    private void txtMemberId44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId44ActionPerformed

    private void txtMemberId45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId45ActionPerformed

    private void txtMemberId46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId46ActionPerformed

    private void txtMemberId29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId29ActionPerformed

    private void txtMemberId30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId30ActionPerformed

    private void txtMemberId31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId31ActionPerformed

    private void txtMemberId32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId32ActionPerformed

    private void txtMemberId33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId33ActionPerformed

    private void txtMemberId34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId34ActionPerformed

    private void txtMemberId35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId35ActionPerformed

    private void txtMemberId36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId36ActionPerformed

    private void txtMemberId37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId37ActionPerformed

    private void txtMemberId38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId38ActionPerformed

    private void txtMemberId39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId39ActionPerformed

    private void txtMemberId40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId40ActionPerformed

    private void txtMemberId41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId41ActionPerformed

    private void txtMemberId42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId42ActionPerformed

    private void txtMemberId50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId50ActionPerformed

    private void txtMemberId51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId51ActionPerformed

    private void txtMemberId10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId10ActionPerformed

    private void txtMemberId47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId47ActionPerformed

    private void tblDrugsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrugsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsMouseClicked

    private void tblDrugsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrugsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsMouseEntered

    private void tblDrugsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrugsMouseReleased

    }//GEN-LAST:event_tblDrugsMouseReleased

    private void tblDrugsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblDrugsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsPropertyChange

    private void tblDrugsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDrugsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDrugsKeyReleased

    private void tblCheckListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListMouseClicked

    private void tblCheckListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListMouseEntered

    private void tblCheckListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheckListMouseReleased

    }//GEN-LAST:event_tblCheckListMouseReleased

    private void tblCheckListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCheckListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListPropertyChange

    private void tblCheckListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCheckListKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCheckListKeyReleased

    private void txtBloodFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodFlowActionPerformed
        // TODO add your handling code here:
        txtTemperature.requestFocus();
    }//GEN-LAST:event_txtBloodFlowActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
        txtFio2.requestFocus();
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtFio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFio2ActionPerformed
        // TODO add your handling code here:
        txtGflow.requestFocus();
    }//GEN-LAST:event_txtFio2ActionPerformed

    private void txtGflowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGflowActionPerformed
        // TODO add your handling code here:
        txtPH.requestFocus();
    }//GEN-LAST:event_txtGflowActionPerformed

    private void txtPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHActionPerformed
        // TODO add your handling code here:
        txtPco2.requestFocus();
    }//GEN-LAST:event_txtPHActionPerformed

    private void txtHco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHco2ActionPerformed
        // TODO add your handling code here:
        txtBE.requestFocus();
    }//GEN-LAST:event_txtHco2ActionPerformed

    private void txtPco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPco2ActionPerformed
        // TODO add your handling code here:
        txtPo2.requestFocus();
    }//GEN-LAST:event_txtPco2ActionPerformed

    private void txtPo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPo2ActionPerformed
        // TODO add your handling code here:
        txtHco2.requestFocus();
    }//GEN-LAST:event_txtPo2ActionPerformed

    private void txtBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBEActionPerformed
        // TODO add your handling code here:
        txtO2.requestFocus();
    }//GEN-LAST:event_txtBEActionPerformed

    private void txtTco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTco2ActionPerformed
        // TODO add your handling code here:
        txtNa.requestFocus();
    }//GEN-LAST:event_txtTco2ActionPerformed

    private void txtNaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaActionPerformed
        // TODO add your handling code here:
        txtK.requestFocus();
    }//GEN-LAST:event_txtNaActionPerformed

    private void txtO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtO2ActionPerformed
        // TODO add your handling code here:
        txtTco2.requestFocus();
    }//GEN-LAST:event_txtO2ActionPerformed

    private void txtKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKActionPerformed
        // TODO add your handling code here:
        txtCA.requestFocus();
    }//GEN-LAST:event_txtKActionPerformed

    private void txtCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCAActionPerformed
        // TODO add your handling code here:
        txtLac.requestFocus();
    }//GEN-LAST:event_txtCAActionPerformed

    private void txtLacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLacActionPerformed
        // TODO add your handling code here:
        txtHb.requestFocus();
    }//GEN-LAST:event_txtLacActionPerformed

    private void txtHbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHbActionPerformed
        // TODO add your handling code here:
        txtSugar.requestFocus();
    }//GEN-LAST:event_txtHbActionPerformed

    private void txtSugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSugarActionPerformed
        // TODO add your handling code here:
        txtAct.requestFocus();
    }//GEN-LAST:event_txtSugarActionPerformed

    private void txtActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActActionPerformed
        // TODO add your handling code here:
        txtHeparin.requestFocus();
    }//GEN-LAST:event_txtActActionPerformed

    private void txtHeparinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeparinActionPerformed
        // TODO add your handling code here:
        btnSaveBloodGases.requestFocus();
    }//GEN-LAST:event_txtHeparinActionPerformed

    private void tblBloodGasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBloodGasesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesMouseClicked

    private void tblBloodGasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBloodGasesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesMouseEntered

    private void tblBloodGasesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBloodGasesMouseReleased

    }//GEN-LAST:event_tblBloodGasesMouseReleased

    private void tblBloodGasesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBloodGasesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesPropertyChange

    private void tblBloodGasesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBloodGasesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBloodGasesKeyReleased

    private void tblPatientInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoMouseClicked

    private void tblPatientInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoMouseEntered

    private void tblPatientInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseReleased

    }//GEN-LAST:event_tblPatientInfoMouseReleased

    private void tblPatientInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoPropertyChange

    private void tblPatientInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientInfoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoKeyReleased

    private void tblPatientInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo1MouseClicked

    private void tblPatientInfo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo1MouseEntered

    private void tblPatientInfo1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo1MouseReleased

    private void tblPatientInfo1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfo1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo1PropertyChange

    private void tblPatientInfo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientInfo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo1KeyReleased

    private void txtMemberId74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId74ActionPerformed

    private void txtMemberId75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId75ActionPerformed

    private void tblPatientInfo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2MouseClicked

    private void tblPatientInfo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2MouseEntered

    private void tblPatientInfo2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2MouseReleased

    private void tblPatientInfo2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfo2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2PropertyChange

    private void tblPatientInfo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientInfo2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2KeyReleased

    private void txtMemberId76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId76ActionPerformed

    private void txtMemberId77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberId77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberId77ActionPerformed

    private void btnSaveBloodGasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBloodGasesActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Save and Final the information.\nDo you want to Save and Final?");
        if (confirmation != 0) {
            return;
        }

//        objPerfusionist.setCardiacRegistryId(cardiacId);
//        objPerfusionist.setBloodFlow(txtBloodFlow.getText().trim());
//        objPerfusionist.setTemperature(txtTemperature.getText().trim());
//        objPerfusionist.setFIO2(txtFio2.getText().trim());
//        objPerfusionist.setgFlow(txtGflow.getText().trim());
//        objPerfusionist.setpH(txtPH.getText().trim());
//        objPerfusionist.setPCO2(txtPco2.getText().trim());
//        objPerfusionist.setPO2(txtPo2.getText().trim());
//        objPerfusionist.setHCO2(txtHco2.getText().trim());
//        objPerfusionist.setBE(txtBE.getText().trim());
//        objPerfusionist.setO2Sat(txtO2.getText().trim());
//        objPerfusionist.setTCO2(txtTco2.getText().trim());
//        objPerfusionist.setNa(txtNa.getText().trim());
//        objPerfusionist.setK(txtK.getText().trim());
//        objPerfusionist.setCa(txtCA.getText().trim());
//        objPerfusionist.setLac(txtLac.getText().trim());
//        objPerfusionist.setHb(txtHb.getText().trim());
//        objPerfusionist.setSugar(txtSugar.getText().trim());
//        objPerfusionist.setACT(txtAct.getText().trim());
//        objPerfusionist.setHeparinKU(txtHeparin.getText().trim());

//        if (ctlPerfusionist.insertBloodGases(objPerfusionist)) {
//            JOptionPane.showMessageDialog(null, "Record save successfully.");
//            clearBloodGases();
//            selectBloodGases();
//        } else {
//            JOptionPane.showMessageDialog(null, "Uanble to save record.\n"
//                    + "Please contact support Team.");
//        }
    }//GEN-LAST:event_btnSaveBloodGasesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSaveBloodGases;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblBloodGases;
    private javax.swing.JTable tblCheckList;
    private javax.swing.JTable tblDrugs;
    private javax.swing.JTable tblPatientInfo;
    private javax.swing.JTable tblPatientInfo1;
    private javax.swing.JTable tblPatientInfo2;
    private javax.swing.JTextField txtAct;
    private javax.swing.JTextField txtBE;
    private javax.swing.JTextField txtBloodFlow;
    private javax.swing.JTextField txtCA;
    private javax.swing.JTextField txtFio2;
    private javax.swing.JTextField txtGflow;
    private javax.swing.JTextField txtHb;
    private javax.swing.JTextField txtHco2;
    private javax.swing.JTextField txtHeparin;
    private javax.swing.JTextField txtK;
    private javax.swing.JTextField txtLac;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtMemberId1;
    private javax.swing.JTextField txtMemberId10;
    private javax.swing.JTextField txtMemberId11;
    private javax.swing.JTextField txtMemberId12;
    private javax.swing.JTextField txtMemberId13;
    private javax.swing.JTextField txtMemberId14;
    private javax.swing.JTextField txtMemberId17;
    private javax.swing.JTextField txtMemberId18;
    private javax.swing.JTextField txtMemberId19;
    private javax.swing.JTextField txtMemberId2;
    private javax.swing.JTextField txtMemberId20;
    private javax.swing.JTextField txtMemberId21;
    private javax.swing.JTextField txtMemberId22;
    private javax.swing.JTextField txtMemberId23;
    private javax.swing.JTextField txtMemberId24;
    private javax.swing.JTextField txtMemberId25;
    private javax.swing.JTextField txtMemberId26;
    private javax.swing.JTextField txtMemberId27;
    private javax.swing.JTextField txtMemberId28;
    private javax.swing.JTextField txtMemberId29;
    private javax.swing.JTextField txtMemberId3;
    private javax.swing.JTextField txtMemberId30;
    private javax.swing.JTextField txtMemberId31;
    private javax.swing.JTextField txtMemberId32;
    private javax.swing.JTextField txtMemberId33;
    private javax.swing.JTextField txtMemberId34;
    private javax.swing.JTextField txtMemberId35;
    private javax.swing.JTextField txtMemberId36;
    private javax.swing.JTextField txtMemberId37;
    private javax.swing.JTextField txtMemberId38;
    private javax.swing.JTextField txtMemberId39;
    private javax.swing.JTextField txtMemberId4;
    private javax.swing.JTextField txtMemberId40;
    private javax.swing.JTextField txtMemberId41;
    private javax.swing.JTextField txtMemberId42;
    private javax.swing.JTextField txtMemberId43;
    private javax.swing.JTextField txtMemberId44;
    private javax.swing.JTextField txtMemberId45;
    private javax.swing.JTextField txtMemberId46;
    private javax.swing.JTextField txtMemberId47;
    private javax.swing.JTextField txtMemberId50;
    private javax.swing.JTextField txtMemberId51;
    private javax.swing.JTextField txtMemberId6;
    private javax.swing.JTextField txtMemberId7;
    private javax.swing.JTextField txtMemberId74;
    private javax.swing.JTextField txtMemberId75;
    private javax.swing.JTextField txtMemberId76;
    private javax.swing.JTextField txtMemberId77;
    private javax.swing.JTextField txtMemberId8;
    private javax.swing.JTextField txtMemberId9;
    private javax.swing.JTextField txtNa;
    private javax.swing.JTextField txtO2;
    private javax.swing.JTextField txtPH;
    private javax.swing.JTextField txtPco2;
    private org.jdesktop.swingx.JXDatePicker txtPerformDate;
    private javax.swing.JTextField txtPo2;
    private javax.swing.JTextField txtSugar;
    private javax.swing.JTextField txtTco2;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void selectBloodGases() {
        listBG = ctlPerfusionist.selectBloodGases(cardiacId);
        if (listBG.isEmpty()) {
            List<PerfusionistBO> listBG = new ArrayList<>();
            listBG.add(new PerfusionistBO());
            tblBloodGases.setModel(new PerfusionBloodGasesTableModel(listBG));
            return;
        }
        tblBloodGases.setModel(new PerfusionBloodGasesTableModel(listBG));
        ListSelectionModel selectionModel = tblBloodGases.getSelectionModel();
        tblBloodGases.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setBloodGasesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblBloodGases);
    }

    private void setBloodGasesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblBloodGases.getColumnCount(); i++) {
            column = tblBloodGases.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            } else if (i == 5) {
                column.setPreferredWidth(60);
            } else if (i == 6) {
                column.setPreferredWidth(60);
            } else if (i == 7) {
                column.setPreferredWidth(60);
            } else if (i == 8) {
                column.setPreferredWidth(60);
            } else if (i == 9) {
                column.setPreferredWidth(60);
            } else if (i == 10) {
                column.setPreferredWidth(60);
            } else if (i == 11) {
                column.setPreferredWidth(60);
            } else if (i == 12) {
                column.setPreferredWidth(60);
            } else if (i == 13) {
                column.setPreferredWidth(60);
            } else if (i == 14) {
                column.setPreferredWidth(60);
            } else if (i == 15) {
                column.setPreferredWidth(60);
            } else if (i == 16) {
                column.setPreferredWidth(60);
            } else if (i == 17) {
                column.setPreferredWidth(60);
            } else if (i == 18) {
                column.setPreferredWidth(60);
            } else if (i == 19) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void clearBloodGases() {
        txtAct.setText("");
        txtBE.setText("");
        txtBloodFlow.setText("");
        txtCA.setText("");
        txtFio2.setText("");
        txtGflow.setText("");
        txtHb.setText("");
        txtHco2.setText("");
        txtHeparin.setText("");
        txtK.setText("");
        txtLac.setText("");
        txtNa.setText("");
        txtO2.setText("");
        txtPH.setText("");
        txtPco2.setText("");
        txtPo2.setText("");
        txtSugar.setText("");
        txtTco2.setText("");
        txtTemperature.setText("");
    }

}
