package Form.Client;

import BO.Administration.DocumentAtachement;
import BO.Client.Client;
import BO.SetupColumnDetail;
import Controller.Client.ClientController;
import TableModel.Client.ClientInformationModel;
import TableModel.Client.ClientLocationModel;
import TableModel.Client.ClientPropertiesModel;
import TableModel.Client.ClientUnattachedLocationTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.Forms;
import utilities.GUIUtils;
import utilities.Rights;

public class frmClientRegistration extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    ClientController ctlClient = new ClientController();
    List<SetupColumnDetail> listClientProperties = new ArrayList();
    List<Client> listUnAttachLocation = new ArrayList();
    List<Client> listAttachLocation = new ArrayList();
    List<Client> listUnattach = new ArrayList();
    List<Client> listAttach = new ArrayList();

    public frmClientRegistration() {

        initComponents();
        this.setSize(Constants.xSize + 195, Constants.ySize);
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProperties = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        cboTransactionType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtRefClient = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cboActive = new javax.swing.JComboBox<>();
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

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblProperties.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,null,null,null}
            },
            new String [] {
                "Sr.No","Location","Select" }
        ));
        tblProperties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPropertiesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPropertiesMouseReleased(evt);
            }
        });
        tblProperties.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPropertiesKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblProperties);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                .addGap(68, 68, 68)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClear, 0, 23, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Client Name : ");

        txtClientName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });

        cboTransactionType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CREDIT", "CASH"}));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Default Client : ");

        txtRefClient.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtRefClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefClientActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Register");
        btnSave.setPreferredSize(new java.awt.Dimension(80, 60));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cboActive.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N"}));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRefClient)
                    .addComponent(txtClientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTransactionType, 0, 110, Short.MAX_VALUE)
                    .addComponent(cboActive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTransactionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtRefClient, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
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
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 8, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientSelectedtoCopyCPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
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
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSelectClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectClientActionPerformed

        btnSave.setEnabled(false);
        searchClientInformation();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectClientActionPerformed

    public void setClientInformation() {
        listClientProperties = ctlClient.selectClientProprties(clientId);
        if (listClientProperties.isEmpty()) {
            List<SetupColumnDetail> listClientProperties = new ArrayList();
            listClientProperties.add(new SetupColumnDetail());
            tblProperties.setModel(new ClientPropertiesModel(listClientProperties));
        } else {
            tblProperties.setModel(new ClientPropertiesModel(listClientProperties));
            ListSelectionModel selectionModel = tblProperties.getSelectionModel();
            tblProperties.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setClientInformationColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblProperties);
        }
//        locationId = client.getLocationId();
//        txtClientName.setText(client.getClientName().trim());
//        cboTransactionType.setSelectedItem(client.getTransactionType());
    }

    public boolean getClientInformation() {

        boolean ret = true;

        return ret;

    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if(txtClientName.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter Client Name.");
            txtClientName.requestFocus();
            return;
        }
        if(client.getRefClientId().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Select Default Client."
                    + " Prior to Create a new Client");
            txtRefClient.requestFocus();
            return;
        }
        client.setClientName(txtClientName.getText().trim());
        client.setTransactionType(cboTransactionType.getSelectedItem().toString());
        client.setActive("Y");
        if (ctlClient.registerClient(client)) {
            JOptionPane.showMessageDialog(null, "Client Created Successfuly.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Create Client.\n"
                    + "Please Contact Support Team.");
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
        if (ctlClient.updateClientSetupProprties(listClientProperties)) {
            setClientInformation();
        } else {
            JOptionPane.showMessageDialog(null, Constants.errorMessage);
        }
//        if (ctlClient.updateClient(client)) {
//            JOptionPane.showMessageDialog(null, "Record Save Successfully ");
//            this.clearForm();
//        } else {
//            JOptionPane.showMessageDialog(null, Constants.errorMessage);
//        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void tableSearchClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSearchClientMouseReleased

        if (tableSearchClient.getSelectedRow() < 0 || vecClient.isEmpty()) {
            return;
        }
        client = (Client) vecClient.get(tableSearchClient.getSelectedRow());
        txtClientName.setText(client.getClientName());
        clientId = client.getClientId();
        cboActive.setSelectedItem(client.getActive());
        cboTransactionType.setSelectedItem(client.getTransactionType());
        setClientInformation();
//        setClientWiseLocation();

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

    private void tblUnattachedClientLocationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnattachedClientLocationMousePressed

    }//GEN-LAST:event_tblUnattachedClientLocationMousePressed

    private void tblUnattachedClientLocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnattachedClientLocationMouseReleased

    }//GEN-LAST:event_tblUnattachedClientLocationMouseReleased

    private void tblUnattachedClientLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUnattachedClientLocationKeyReleased

    }//GEN-LAST:event_tblUnattachedClientLocationKeyReleased

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

    private void tblPropertiesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMousePressed

    private void tblPropertiesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMouseReleased

    private void tblPropertiesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPropertiesKeyReleased
        // TODO add your handling code here:
        SetupColumnDetail objSetup = listClientProperties.get(
                tblProperties.getSelectedRow());
        objSetup.setDefaultValue(tblProperties.getValueAt(
                tblProperties.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tblPropertiesKeyReleased

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtRefClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefClientActionPerformed
        // TODO add your handling code here:
        String query = " SELECT ID, DESCRIPTION FROM "
                + Database.DCMS.client
                + "\n WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtRefClient.getText().trim().toUpperCase() + "%'"
                + "\n AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);
        if(Constants.lovID.equalsIgnoreCase("ID")){
            client.setRefClientId("");
            return;
        }
        client.setRefClientId(Constants.lovID);
        txtRefClient.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtRefClientActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(txtClientName.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter Client Name.");
            txtClientName.requestFocus();
            return;
        }
        client.setClientName(txtClientName.getText().trim());
        client.setTransactionType(cboTransactionType.getSelectedItem().toString());
        if(ctlClient.updateClient(client)){
            JOptionPane.showMessageDialog(null, "Record Save Successfully.");
        }else{
            JOptionPane.showMessageDialog(null, "Unable to Save Record.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteClientCPT;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditExit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchClear;
    private javax.swing.JButton btnSearchClientCPT;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbAddAll;
    private javax.swing.JCheckBox cbDeleteAll;
    private javax.swing.JComboBox<String> cboActive;
    private javax.swing.JComboBox cboTransactionType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblType2;
    private javax.swing.JLabel lblType3;
    private javax.swing.JTable tableSearchClient;
    private javax.swing.JTable tblClientLocation;
    private javax.swing.JTable tblProperties;
    private javax.swing.JTable tblUnattachedClientLocation;
    private javax.swing.JTextField txtAddLocation;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtClientSelectedtoCopyCPT;
    private javax.swing.JTextField txtDeleteLocation;
    private javax.swing.JTextField txtRefClient;
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
        client = (Client) vecClient.get(0);
        clientId = client.getClientId();
        setClientInformation();
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
        comp.add(txtClientName);
        comp.add(txtDeleteLocation);
        comp.add(txtSelectClient);
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
    }

    private void setClientInformationColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblProperties.getColumnCount(); i++) {
            column = tblProperties.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(250);
            } else if (i == 3) {
                column.setPreferredWidth(300);
            }
        }
    }

}
