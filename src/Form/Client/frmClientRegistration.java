package Form.Client;

import BO.Client.Client;
import Controller.Client.ClientController;
import Form.Administration.TypeDetailForm;
import TableModel.Client.ClientInformationModel;
import TableModel.Client.ClientLocationModel;
import TableModel.Client.ClientUnattachedLocationTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.Forms;
import utilities.GUIUtils;
import utilities.Rights;

public class frmClientRegistration extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    ClientController ctlClient = new ClientController();
    List<Client> listUnAttachLocation = new ArrayList();
    List<Client> listAttachLocation = new ArrayList();
    List<Client> listUnattach = new ArrayList();
    List<Client> listAttach = new ArrayList();

    public frmClientRegistration() {

        initComponents();
        this.setSize(Constants.xSize + 195, Constants.ySize - 100);
        clientId = "";
        txtClientName.requestFocusInWindow();
        txtClientName.setCaretPosition(0);
        txtClientName.requestFocusInWindow();
        txtClientName.setCaretPosition(0);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnEditExit.setMnemonic(KeyEvent.VK_X);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnEdit.setMnemonic(KeyEvent.VK_E);
        btnSearchClientCPT.setMnemonic(KeyEvent.VK_R);
        btnSave.setEnabled(true);

        setFormRights();

        btnDeleteClientCPT.setEnabled(true);
//        if (Constants.userRightsMap.get(Rights.btnDeleteClientCPT) == null) {
//            btnDeleteClientCPT.setEnabled(false);
//        }
//        btnEditClientPrice.setEnabled(true);
//        if (Constants.userRightsMap.get(Rights.btnEditClientPrice) == null) {
//            btnEditClientPrice.setEnabled(false);
//        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel()
        ;
        jPanel9 = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtLandLine = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        lblType4 = new javax.swing.JLabel();
        txtCreditLimit = new javax.swing.JTextField();
        lblType6 = new javax.swing.JLabel();
        txtAccountId = new javax.swing.JTextField();
        btnAddDepartment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtClientAddress = new javax.swing.JTextArea();
        lblType7 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cboClientActive = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cboTransactionType = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        cboTestLimit = new javax.swing.JComboBox();
        cboClientType = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        cboCreditLimit = new javax.swing.JComboBox();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cboSelectIt = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cboPatientUpdate = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        cboSelectionAllow = new javax.swing.JComboBox();
        cboSendSms = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        cboDisplayReport = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtPatientContactNo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtPatientReportEmail = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnSearchClear = new javax.swing.JButton();
        btnEditExit = new javax.swing.JButton();
        btnSearchClientCPT = new javax.swing.JButton();
        btnDeleteClientCPT = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClientLocation = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUnattachedClientLocation = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        lblType2 = new javax.swing.JLabel();
        txtAddLocation = new javax.swing.JTextField();
        lblType3 = new javax.swing.JLabel();
        txtDeleteLocation = new javax.swing.JTextField();
        cbAddAll = new javax.swing.JCheckBox();
        cbDeleteAll = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        txtSelectClient = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearchClient = new javax.swing.JTable();
        txtClientSelectedtoCopyCPT = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        setTitle(Constants.title+"Client Management");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1150, 800));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(102, 0, 0));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType.setText("Address:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Phone No:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");

        txtClientName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });

        txtLandLine.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtLandLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLandLineActionPerformed(evt);
            }
        });

        txtEmailAddress.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });
        txtEmailAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailAddressKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailAddressKeyTyped(evt);
            }
        });

        lblType4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblType4.setForeground(new java.awt.Color(102, 0, 0));
        lblType4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType4.setText("Credit Limit:");

        txtCreditLimit.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtCreditLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditLimitActionPerformed(evt);
            }
        });
        txtCreditLimit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreditLimitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditLimitKeyTyped(evt);
            }
        });

        lblType6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblType6.setForeground(new java.awt.Color(102, 0, 0));
        lblType6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType6.setText("Discount :");

        txtAccountId.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtAccountId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountIdActionPerformed(evt);
            }
        });
        txtAccountId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountIdKeyTyped(evt);
            }
        });

        btnAddDepartment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddDepartment.setForeground(new java.awt.Color(102, 0, 0));
        btnAddDepartment.setText("+");
        btnAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepartmentActionPerformed(evt);
            }
        });

        txtClientAddress.setColumns(20);
        txtClientAddress.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtClientAddress.setLineWrap(true);
        txtClientAddress.setRows(5);
        txtClientAddress.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtClientAddress);

        lblType7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblType7.setForeground(new java.awt.Color(102, 0, 0));
        lblType7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType7.setText("Account Id:");

        txtDiscount.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblType6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtLandLine, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblType4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblType7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtAccountId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addComponent(txtClientName)
                    .addComponent(txtEmailAddress))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCreditLimit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblType4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLandLine, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscount))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddress)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Active:");

        cboClientActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N"}));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Test Limit:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Trans Type:");

        cboTransactionType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CREDIT", "CASH"}));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Client Type:");

        cboTestLimit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N", "Y"  }));

        cboClientType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PANEL", "RESEARCH"  }));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Credit Limit:");

        cboCreditLimit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N", "Y"  }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboClientActive, 0, 121, Short.MAX_VALUE)
                    .addComponent(cboTransactionType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTestLimit, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboClientType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCreditLimit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboClientActive, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTestLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(cboTransactionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboClientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Select IT :");

        cboSelectIt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N", "Y"}));
        cboSelectIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelectItActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Selection Allow :");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Patient Update :");

        cboPatientUpdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N"}));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Send SMS :");

        cboSelectionAllow.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N"  }));
        cboSelectionAllow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelectionAllowActionPerformed(evt);
            }
        });

        cboSendSms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N"}));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Display Report :");

        cboDisplayReport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N"  }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboSelectIt, 0, 109, Short.MAX_VALUE)
                    .addComponent(cboPatientUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSelectionAllow, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSendSms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDisplayReport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSelectIt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSelectionAllow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPatientUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSendSms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDisplayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Patient Contact No :");

        txtPatientContactNo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPatientContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientContactNoActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Patient Report Email :");

        txtPatientReportEmail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPatientReportEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientReportEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientReportEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPatientContactNo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(330, 330, 330))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtPatientContactNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientReportEmail)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Register");
        btnSave.setPreferredSize(new java.awt.Dimension(80, 60));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(80, 60));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(80, 60));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setPreferredSize(new java.awt.Dimension(80, 60));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.CENTER, 0, 23, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client CPT Prices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSearchClear.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnSearchClear.setText("Clear");
        btnSearchClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClearActionPerformed(evt);
            }
        });

        btnEditExit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnEditExit.setForeground(new java.awt.Color(102, 0, 0));
        btnEditExit.setText("Exit");
        btnEditExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditExitActionPerformed(evt);
            }
        });

        btnSearchClientCPT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearchClientCPT.setText("Add");
        btnSearchClientCPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientCPTActionPerformed(evt);
            }
        });

        btnDeleteClientCPT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteClientCPT.setText("Delete");
        btnDeleteClientCPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientCPTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnSearchClientCPT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(btnDeleteClientCPT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSearchClear)
                .addComponent(btnEditExit)
                .addComponent(btnSearchClientCPT)
                .addComponent(btnDeleteClientCPT))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblClientLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblClientLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,null,null,null}
            },
            new String [] {
                "Sr.No","Location","Select" }
        ));
        tblClientLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClientLocationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblClientLocationMouseReleased(evt);
            }
        });
        tblClientLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblClientLocationKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblClientLocation);

        tblUnattachedClientLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblUnattachedClientLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,null,null,null}
            },
            new String [] {
                "Sr.No","Location","Select" }
        ));
        tblUnattachedClientLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUnattachedClientLocationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUnattachedClientLocationMouseReleased(evt);
            }
        });
        tblUnattachedClientLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblUnattachedClientLocationKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblUnattachedClientLocation);

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblType2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblType2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblType2.setForeground(new java.awt.Color(102, 0, 0));
        lblType2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType2.setText("Add Loc:");

        txtAddLocation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtAddLocation.setToolTipText("");
        txtAddLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddLocationActionPerformed(evt);
            }
        });
        txtAddLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddLocationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddLocationKeyTyped(evt);
            }
        });

        lblType3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblType3.setForeground(new java.awt.Color(102, 0, 0));
        lblType3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblType3.setText("Delete:");

        txtDeleteLocation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtDeleteLocation.setToolTipText("");
        txtDeleteLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteLocationActionPerformed(evt);
            }
        });
        txtDeleteLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDeleteLocationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeleteLocationKeyTyped(evt);
            }
        });

        cbAddAll.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        cbAddAll.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cbAddAll.setForeground(new java.awt.Color(102, 0, 0));
        cbAddAll.setText("ALL");
        cbAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddAllActionPerformed(evt);
            }
        });

        cbDeleteAll.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        cbDeleteAll.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cbDeleteAll.setForeground(new java.awt.Color(102, 0, 0));
        cbDeleteAll.setText("ALL");
        cbDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDeleteAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(lblType2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAddAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblType3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDeleteLocation)
                .addGap(18, 18, 18)
                .addComponent(cbDeleteAll)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeleteLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAddAll)
                    .addComponent(cbDeleteAll))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

        txtSelectClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSelectClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectClientActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Select Client:");

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tableSearchClient.setBackground(java.awt.SystemColor.activeCaption);
        tableSearchClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {null, null, null, null},

            new String [] {
                "Client Id","Location", "Client Name", "Active"
            }
        ));
        tableSearchClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSearchClientMouseReleased(evt);
            }
        });
        tableSearchClient.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableSearchClientPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tableSearchClient);

        txtClientSelectedtoCopyCPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientSelectedtoCopyCPTActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Copy Selected Client CPT:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClientSelectedtoCopyCPT, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientSelectedtoCopyCPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Search");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectClient, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtSelectClient, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLandLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLandLineActionPerformed
        txtClientAddress.requestFocusInWindow();
        txtClientAddress.setCaretPosition(0);

    }//GEN-LAST:event_txtLandLineActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed

        txtLandLine.requestFocusInWindow();
        txtLandLine.setCaretPosition(0);
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
//        txtLocationId.requestFocusInWindow();
        //       txtLocationId.setCaretPosition(0);
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtEmailAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressKeyPressed

    private void txtEmailAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressKeyTyped

    private void txtCreditLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditLimitActionPerformed

        txtEmailAddress.requestFocusInWindow();
        txtEmailAddress.setCaretPosition(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditLimitActionPerformed

    private void txtCreditLimitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditLimitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditLimitKeyPressed

    private void txtCreditLimitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditLimitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditLimitKeyTyped

    private void txtSelectClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectClientActionPerformed

        btnSave.setEnabled(false);
        searchClientInformation();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectClientActionPerformed

    public void setClientInformation() {

        locationId = client.getLocationId();
        txtClientAddress.setText(client.getAddress().trim());
        txtClientName.setText(client.getClientName().trim());
        txtLandLine.setText(client.getLandLineNo().trim());
        txtCreditLimit.setText(client.getCreditLimit().trim());
        txtEmailAddress.setText(client.getEmail().trim());
        txtAccountId.setText(client.getAccountId().trim());
        cboTransactionType.setSelectedItem(client.getTransactionType());
        cboClientActive.setSelectedItem(client.getActive());
        cboClientType.setSelectedItem(client.getClientType());
        cboTestLimit.setSelectedItem(client.getTestLimit());
        cboCreditLimit.setSelectedItem(client.getCheckCreditLimit());
        cboSelectIt.setSelectedItem(client.getSelectIt());
        cboSelectionAllow.setSelectedItem(client.getSelectionAllow());
        cboPatientUpdate.setSelectedItem(client.getPatientUpdate());
        cboDisplayReport.setSelectedItem(client.getDisplayReport());
        cboSendSms.setSelectedItem(client.getSendSms());
        txtPatientContactNo.setText(client.getPatientContact());
        txtPatientReportEmail.setText(client.getPatientReportEmail());

    }

    public boolean getClientInformation() {

        boolean ret = true;

        int accountId = 0;
        try {
            accountId = Integer.parseInt(txtAccountId.getText());
        } catch (NumberFormatException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Account Id");
            txtAccountId.setText("");
            txtAccountId.requestFocusInWindow();
            txtAccountId.setCaretPosition(0);
            return false;
        }

        if (cboTransactionType.getSelectedItem().toString().equalsIgnoreCase("CREDIT")
                && accountId == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Account Id");
            txtAccountId.setText("");
            txtAccountId.requestFocusInWindow();
            txtAccountId.setCaretPosition(0);
            return false;
        }

        if (txtClientName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Client Name");
            txtClientName.requestFocusInWindow();
            txtClientName.setCaretPosition(0);
            return false;
        }

        if (locationId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Location Name");
            txtDeleteLocation.setText("");
            txtDeleteLocation.requestFocusInWindow();
            txtDeleteLocation.setCaretPosition(0);
            return false;
        }

        try {

            client.setActive(cboClientActive.getSelectedItem().toString());
            client.setTransactionType(cboTransactionType.getSelectedItem().toString());
            client.setAddress(txtClientAddress.getText().trim());
            client.setClientName(txtClientName.getText().trim());

            client.setEmail(txtEmailAddress.getText().trim());
            client.setLandLineNo(txtLandLine.getText().trim());
            client.setAccountId("" + accountId);
            client.setMobileNo(txtCreditLimit.getText().trim());
            client.setLocationId(locationId);
            client.setCreditLimit(txtCreditLimit.getText().trim());
            client.setTransactionType(cboTransactionType.getSelectedItem().toString());
            client.setClientType(cboClientType.getSelectedItem().toString());
            client.setCheckCreditLimit(cboCreditLimit.getSelectedItem().toString());
            client.setTestLimit(cboTestLimit.getSelectedItem().toString());
            client.setSelectIt(cboSelectIt.getSelectedItem().toString());
            client.setSelectionAllow(cboSelectionAllow.getSelectedItem().toString());
            client.setPatientUpdate(cboPatientUpdate.getSelectedItem().toString());
            client.setPatientContact(txtPatientContactNo.getText());
            client.setPatientReportEmail(txtPatientReportEmail.getText());
            client.setSendSms(cboTestLimit.getSelectedItem().toString());
            client.setDisplayReport(cboDisplayReport.getSelectedItem().toString());

        } catch (Exception ex) {
            ret = false;
        }
        return ret;

    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (txtClientName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Client Name");
            txtClientName.requestFocusInWindow();
            txtClientName.setCaretPosition(0);
            return;
        }

        int accountId = 0;
        try {
            accountId = Integer.parseInt(txtAccountId.getText());
        } catch (NumberFormatException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Account Id");
            txtAccountId.setText("");
            txtAccountId.requestFocusInWindow();
            txtAccountId.setCaretPosition(0);
            return;
        }

        if (cboTransactionType.getSelectedItem().toString().equalsIgnoreCase("CREDIT")
                && accountId == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Account Id");
            txtAccountId.setText("");
            txtAccountId.requestFocusInWindow();
            txtAccountId.setCaretPosition(0);
            return;
        }

        int creditLimit = 0;
        try {
            creditLimit = Integer.parseInt(txtCreditLimit.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Credit Limit in Number");
            txtCreditLimit.requestFocusInWindow();
            txtCreditLimit.setCaretPosition(0);
            return;
        }
        client = new Client();
        client.setActive("Y");
        client.setAddress(txtClientAddress.getText().trim());
        client.setClientName(txtClientName.getText().trim());
        client.setAccountId("" + accountId);
        client.setEmail(txtEmailAddress.getText().trim());
        client.setLandLineNo(txtLandLine.getText().trim());
        client.setCreditLimit("" + creditLimit);
        client.setTerminalId(Constants.terminalId);
        client.setRegisteredBy(Constants.userId);
        client.setClientType(cboClientType.getSelectedItem().toString());
        client.setCheckCreditLimit(cboCreditLimit.getSelectedItem().toString());
        client.setTransactionType(cboTransactionType.getSelectedItem().toString());
        client.setTestLimit(cboTestLimit.getSelectedItem().toString());
        client.setSelectIt(cboSelectIt.getSelectedItem().toString());
        client.setSelectionAllow(cboSelectionAllow.getSelectedItem().toString());
        client.setPatientUpdate(cboPatientUpdate.getSelectedItem().toString());
        client.setSendSms(cboSendSms.getSelectedItem().toString());
        client.setDisplayReport(cboDisplayReport.getSelectedItem().toString());
        client.setPatientContact(txtPatientContactNo.getText().toString());
        client.setPatientReportEmail(txtPatientReportEmail.getText().toString());

        if (ctlClient.registerClient(client)) {
            JOptionPane.showMessageDialog(null, Constants.infoMessage);
            client = new Client();
            locationId = "";
            this.clearForm();
        } else {
            JOptionPane.showMessageDialog(null, Constants.errorMessage);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtDeleteLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteLocationActionPerformed

        attachedLocationName = txtDeleteLocation.getText().trim().toUpperCase();
        unAttachedLocationName = "";
        setClientWiseLocation();
    }//GEN-LAST:event_txtDeleteLocationActionPerformed

    private void txtDeleteLocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteLocationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteLocationKeyPressed

    private void txtDeleteLocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeleteLocationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteLocationKeyTyped

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (!this.getClientInformation()) {
            return;
        }
        if (ctlClient.updateClient(client)) {
            JOptionPane.showMessageDialog(null, "Record Save Successfully ");
            this.clearForm();
        } else {
            JOptionPane.showMessageDialog(null, Constants.errorMessage);
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void tableSearchClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSearchClientMouseReleased

        if (tableSearchClient.getSelectedRow() < 0 || vecClient.isEmpty()) {
            return;
        }
        client = (Client) vecClient.get(tableSearchClient.getSelectedRow());
        setClientInformation();
        setClientWiseLocation();

        // TODO add your handling code here:
}//GEN-LAST:event_tableSearchClientMouseReleased

    private void tableSearchClientPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableSearchClientPropertyChange
    }//GEN-LAST:event_tableSearchClientPropertyChange

    private void btnEditExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditExitActionPerformed

    private void btnSearchClientCPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientCPTActionPerformed

        boolean sat = true;
        listUnattach.clear();

        for (int rowIndex = 0; rowIndex < tblUnattachedClientLocation.getRowCount(); rowIndex++) {
            sat = (boolean) tblUnattachedClientLocation.getValueAt(rowIndex, 2);
            if (sat) {
                listUnattach.add(listUnAttachLocation.get(rowIndex));
            }
        }

        for (int i = 0; i < listUnattach.size(); i++) {
            sat = ctlClient.insertClientWiseLocation(listUnattach.get(i).getLocationId(), listUnattach.get(i).getClientId());
        }

        setClientInformation();
        setClientWiseLocation();

    }//GEN-LAST:event_btnSearchClientCPTActionPerformed

    private void txtAddLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddLocationActionPerformed

        unAttachedLocationName = txtAddLocation.getText().trim().toUpperCase();
        attachedLocationName = "";
        setClientWiseLocation();


    }//GEN-LAST:event_txtAddLocationActionPerformed

    private void txtAddLocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddLocationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddLocationKeyPressed

    private void txtAddLocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddLocationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddLocationKeyTyped

    private void tblClientLocationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientLocationMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientLocationMousePressed

    private void tblClientLocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientLocationMouseReleased

        if (tblClientLocation.getSelectedRow() < 0) {
            return;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientLocationMouseReleased

    private void tblClientLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientLocationKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientLocationKeyReleased

    private void btnSearchClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClearActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSearchClearActionPerformed

    private void btnDeleteClientCPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientCPTActionPerformed

        listAttach.clear();

        for (int i = 0; i < tblClientLocation.getRowCount(); i++) {
            if ((boolean) tblClientLocation.getValueAt(i, 2)) {
                listAttach.add(listAttachLocation.get(i));
            }
        }
        if (ctlClient.deleteClientWiseLocation(listAttach)) {
            //setClientInformation();
            setClientWiseLocation();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record, Kindly Contact Administrator");

        }


    }//GEN-LAST:event_btnDeleteClientCPTActionPerformed

    private void txtClientSelectedtoCopyCPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientSelectedtoCopyCPTActionPerformed

        if (client.getClientId().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Client to Copy CPT Contract");
            return;
        }

        String query = "SELECT ID , DESCRIPTION FROM  " + Database.DCMS.client
                + " WHERE ID !='" + client.getClientId() + "' \n"
                + " AND ACTIVE = 'Y' \n"
                + " AND UPPER(DESCRIPTION) LIKE '%"
                + txtClientSelectedtoCopyCPT.getText().trim().toUpperCase() + "%'";
        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            int i = JOptionPane.showConfirmDialog(null, "You are going to copy Services contract of \n"
                    + client.getClientName() + " to \n " + Constants.lovDescription);

            if (i != 0) {
                return;
            }
            if (ctlClient.copyClientCPT(client.getClientId(), Constants.lovID)) {
                JOptionPane.showMessageDialog(null, "Record Saved Successfuly");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save Data, kindly Contact Administrator");
            }

        }
    }//GEN-LAST:event_txtClientSelectedtoCopyCPTActionPerformed

    private void txtAccountIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountIdActionPerformed

    private void txtAccountIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountIdKeyPressed

    private void txtAccountIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountIdKeyTyped

    private void btnAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepartmentActionPerformed

        TypeDetailForm fm = new TypeDetailForm(DefinitionTypes.billingAccounts,
                "BILLING ACCOUNTS");
//        DCMS_MDI.desktopPane.add(fm);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = fm.getSize();
//        fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        fm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDepartmentActionPerformed

    private void tblUnattachedClientLocationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnattachedClientLocationMousePressed

    }//GEN-LAST:event_tblUnattachedClientLocationMousePressed

    private void tblUnattachedClientLocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnattachedClientLocationMouseReleased

    }//GEN-LAST:event_tblUnattachedClientLocationMouseReleased

    private void tblUnattachedClientLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUnattachedClientLocationKeyReleased

    }//GEN-LAST:event_tblUnattachedClientLocationKeyReleased

    private void txtPatientContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientContactNoActionPerformed

    private void txtPatientReportEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientReportEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientReportEmailActionPerformed

    private void cboSelectItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectItActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSelectItActionPerformed

    private void cboSelectionAllowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectionAllowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSelectionAllowActionPerformed

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void cbAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddAllActionPerformed

        for (int i = 0; i < tblUnattachedClientLocation.getRowCount(); i++) {
            tblUnattachedClientLocation.setValueAt(cbAddAll.isSelected(), i, 2);
        }


    }//GEN-LAST:event_cbAddAllActionPerformed

    private void cbDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDeleteAllActionPerformed

        for (int i = 0; i < tblUnattachedClientLocation.getRowCount(); i++) {
            tblClientLocation.setValueAt(cbDeleteAll.isSelected(), i, 2);
        }


    }//GEN-LAST:event_cbDeleteAllActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDepartment;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteClientCPT;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditExit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchClear;
    private javax.swing.JButton btnSearchClientCPT;
    private javax.swing.JCheckBox cbAddAll;
    private javax.swing.JCheckBox cbDeleteAll;
    private javax.swing.JComboBox cboClientActive;
    private javax.swing.JComboBox cboClientType;
    private javax.swing.JComboBox cboCreditLimit;
    private javax.swing.JComboBox cboDisplayReport;
    private javax.swing.JComboBox cboPatientUpdate;
    private javax.swing.JComboBox cboSelectIt;
    private javax.swing.JComboBox cboSelectionAllow;
    private javax.swing.JComboBox cboSendSms;
    private javax.swing.JComboBox cboTestLimit;
    private javax.swing.JComboBox cboTransactionType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblType2;
    private javax.swing.JLabel lblType3;
    private javax.swing.JLabel lblType4;
    private javax.swing.JLabel lblType6;
    private javax.swing.JLabel lblType7;
    private javax.swing.JTable tableSearchClient;
    private javax.swing.JTable tblClientLocation;
    private javax.swing.JTable tblUnattachedClientLocation;
    private javax.swing.JTextField txtAccountId;
    private javax.swing.JTextField txtAddLocation;
    private javax.swing.JTextArea txtClientAddress;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientSelectedtoCopyCPT;
    private javax.swing.JTextField txtCreditLimit;
    private javax.swing.JTextField txtDeleteLocation;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtLandLine;
    private javax.swing.JTextField txtPatientContactNo;
    private javax.swing.JTextField txtPatientReportEmail;
    private javax.swing.JTextField txtSelectClient;
    // End of variables declaration//GEN-END:variables

    private Client client = new Client();
    private String unAttachedLocationName = "";
    private String attachedLocationName = "";
//    ClientController ctlClient = new ClientController();
    private Vector vecClient = new Vector();

    private Vector vecClientCPT = new Vector();
    private String locationId = "";
    private String clientId = "";
    private String cptId = "";
    private int testLimit = -1;

//    public CPTController ctlCPT = new CPTController();
    public void searchClientInformation() {

        if (txtSelectClient.getText().trim().length() == 0) {

            return;
        }
        vecClient = ctlClient.searchClientByName(txtSelectClient.getText().trim());
        if (vecClient.isEmpty()) {
            Client clt = new Client();
            vecClient.add(clt);
        }
        tableSearchClient.setModel(new ClientInformationModel(vecClient));
        ListSelectionModel selectionModel = tableSearchClient.getSelectionModel();
        tableSearchClient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setClientTablesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tableSearchClient);
    }

    public void setClientTablesColumnsWidths() {

        TableColumn column = null;
        for (int i = 0; i < tableSearchClient.getColumnCount(); i++) {
            column = tableSearchClient.getColumnModel().getColumn(i);
            if (i == 1) {
                column.setPreferredWidth(250);
            } else {
                column.setPreferredWidth(30);
            }
        }
    }

    int selectIndex = 5;// 5 status

    public void setClientWiseLocation() {

        listAttachLocation = ctlClient.selectClientLocations(client.getClientId(), attachedLocationName);
        listUnAttachLocation = ctlClient.selectUnattachedClientLocations(client.getClientId(),
                unAttachedLocationName);

        tblClientLocation.setModel(new ClientLocationModel(listAttachLocation));
        tblUnattachedClientLocation.setModel(new ClientUnattachedLocationTableModel(listUnAttachLocation));

        ListSelectionModel selectionModel = tblClientLocation.getSelectionModel();
        ListSelectionModel UnattachedselectionModel = tblUnattachedClientLocation.getSelectionModel();
        tblClientLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblUnattachedClientLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        UnattachedselectionModel.setSelectionInterval(0, 0);

        Constants.tablelook.setJTableEnvironment(tblClientLocation);
        Constants.tablelook.setJTableEnvironment(tblUnattachedClientLocation);

        setClientLocationTablesColumnsWidths(tblClientLocation);
        setClientLocationTablesColumnsWidths(tblUnattachedClientLocation);
    }

    public void setClientLocationTablesColumnsWidths(JTable table) {

        TableColumn column = null;
        for (int i = 0; i < table.getColumnCount(); i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            }
            if (i == 1) {
                column.setPreferredWidth(150);
            }
        }
    }

    public void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtClientAddress);
        comp.add(txtClientName);
        comp.add(txtDeleteLocation);
        comp.add(txtEmailAddress);
        comp.add(txtLandLine);
        comp.add(txtCreditLimit);
        comp.add(txtSelectClient);
        comp.add(txtAccountId);
        GUIUtils.setClear(comp);
        client = null;
    }

    String formId = Forms.clientRegistration + "_";

    private void setFormRights() {

        btnSave.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.clientRegistration) == null) {
            btnSave.setEnabled(false);
        }
        btnEdit.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.updateClient) == null) {
            btnEdit.setEnabled(false);
        }
        cboClientActive.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientActive) == null) {
            cboClientActive.setEnabled(false);
        }
        cboCreditLimit.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientCreditLimit) == null) {
            cboCreditLimit.setEnabled(false);
        }
        cboDisplayReport.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientDisplayRecord) == null) {
            cboDisplayReport.setEnabled(false);
        }

        cboPatientUpdate.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientPatientUpdate) == null) {
            cboPatientUpdate.setEnabled(false);
        }

        cboSelectIt.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientSelectIt) == null) {
            cboSelectIt.setEnabled(false);
        }

        cboSelectionAllow.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientSelectionAllow) == null) {
            cboSelectionAllow.setEnabled(false);
        }

        cboSendSms.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientSendSMS) == null) {
            cboSendSms.setEnabled(false);
        }
        cboTestLimit.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientTestLimit) == null) {
            cboTestLimit.setEnabled(false);
        }

        cboTransactionType.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientTransactionType) == null) {
            cboTransactionType.setEnabled(false);
        }

        cboClientType.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.cboClientType) == null) {
            cboClientType.setEnabled(false);
        }

        txtPatientContactNo.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.txtClientPatientContact) == null) {
            txtPatientContactNo.setEnabled(false);
        }

        txtPatientReportEmail.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.txtClientReportEmail) == null) {
            txtPatientReportEmail.setEnabled(false);
        }
    }

}
