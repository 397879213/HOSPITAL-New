package Form.Client;

import BO.Client.ClientWiseCpt;
import Controller.Setup.ClientWiseCptController;
import TableModel.Setup.AttachedClientsTableModel;
import TableModel.Setup.AttachedCptsTableModel;
import TableModel.Setup.UnAttachedClientsTableModel;
import TableModel.Setup.UnAttachedCptsTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class frmClientWiseCPT extends javax.swing.JInternalFrame {

    public frmClientWiseCPT() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAttachedClients = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUnAttachedClients = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        txtUnAttachedClient = new javax.swing.JTextField();
        chkAttachClient = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        txtFromCpt = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtToCpt = new javax.swing.JTextField();
        btnCopyCpt = new javax.swing.JButton();
        cboUnAttachedClientType = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtAttachedCpt = new javax.swing.JTextField();
        chkUnAttachCpt = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSection = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAttachedCpt = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUnAttachedCpt = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        txtUnAttachedCpt = new javax.swing.JTextField();
        chkAttachCpt = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        txtFromClient = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtToClient = new javax.swing.JTextField();
        btnCopyClient = new javax.swing.JButton();
        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        pnlAdd4 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnUnAttachClient = new javax.swing.JButton();
        btnAttachClient = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCpt = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtAttachedClient = new javax.swing.JTextField();
        cboAttachedClientType = new javax.swing.JComboBox();
        chkUnAttachClient = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btnUnAttachCpt = new javax.swing.JButton();
        btnAttachCpt = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Client Wise CPT");
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

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attached Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAttachedClients.setBackground(java.awt.SystemColor.activeCaption);
        tblAttachedClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {null, null, null, null},

            new String [] {
                "Sr.","DESCRIPTION", "PRICE", "SELECT"
            }
        ));
        tblAttachedClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAttachedClientsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAttachedClientsMouseReleased(evt);
            }
        });
        tblAttachedClients.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblAttachedClientsPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblAttachedClients);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Un-Attached Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblUnAttachedClients.setBackground(java.awt.SystemColor.activeCaption);
        tblUnAttachedClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {null, null, null, null,null},

            new String [] {
                "ID","DESCRIPTION", "SELECT"
            }
        ));
        tblUnAttachedClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUnAttachedClientsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUnAttachedClientsMouseReleased(evt);
            }
        });
        tblUnAttachedClients.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblUnAttachedClientsPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(tblUnAttachedClients);

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Client:");

        txtUnAttachedClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtUnAttachedClient.setForeground(new java.awt.Color(102, 0, 0));
        txtUnAttachedClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnAttachedClientActionPerformed(evt);
            }
        });

        chkAttachClient.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkAttachClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkAttachClient.setForeground(new java.awt.Color(102, 0, 0));
        chkAttachClient.setText("Select All");
        chkAttachClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAttachClientActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("From:");

        txtFromCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFromCpt.setForeground(new java.awt.Color(102, 0, 0));
        txtFromCpt.setToolTipText("");
        txtFromCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromCptActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("To:");

        txtToCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtToCpt.setForeground(new java.awt.Color(102, 0, 0));
        txtToCpt.setToolTipText("");
        txtToCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToCptActionPerformed(evt);
            }
        });

        btnCopyCpt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCopyCpt.setText("Copy");
        btnCopyCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyCptActionPerformed(evt);
            }
        });

        cboUnAttachedClientType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "CREDIT", "CASH" }));
        cboUnAttachedClientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUnAttachedClientTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFromCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToCpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopyCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnAttachedClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboUnAttachedClientType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAttachClient))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnAttachedClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(chkAttachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUnAttachedClientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtFromCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(txtToCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopyCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client:");

        txtClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtClient.setForeground(new java.awt.Color(102, 0, 0));
        txtClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientActionPerformed(evt);
            }
        });
        txtClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClientKeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("CPT:");

        txtAttachedCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAttachedCpt.setForeground(new java.awt.Color(102, 0, 0));
        txtAttachedCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttachedCptActionPerformed(evt);
            }
        });

        chkUnAttachCpt.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkUnAttachCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkUnAttachCpt.setForeground(new java.awt.Color(102, 0, 0));
        chkUnAttachCpt.setText("Select All");
        chkUnAttachCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUnAttachCptActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Department:");

        txtDepartment.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDepartment.setForeground(new java.awt.Color(102, 0, 0));
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });
        txtDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepartmentKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Section:");

        txtSection.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtSection.setForeground(new java.awt.Color(102, 0, 0));
        txtSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClient)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtAttachedCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkUnAttachCpt))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAttachedCpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(chkUnAttachCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attached CPT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAttachedCpt.setBackground(java.awt.SystemColor.activeCaption);
        tblAttachedCpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {null, null, null, null,null},

            new String [] {
                "Sr.","DESCRIPTION", "PRICE", "SELECT"
            }
        ));
        tblAttachedCpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAttachedCptMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAttachedCptMouseReleased(evt);
            }
        });
        tblAttachedCpt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblAttachedCptPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tblAttachedCpt);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Un-Attached CPT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblUnAttachedCpt.setBackground(java.awt.SystemColor.activeCaption);
        tblUnAttachedCpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {null, null, null, null,null},

            new String [] {
                "ID","DESCRIPTION", "SELECT"
            }
        ));
        tblUnAttachedCpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUnAttachedCptMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblUnAttachedCptMouseReleased(evt);
            }
        });
        tblUnAttachedCpt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblUnAttachedCptPropertyChange(evt);
            }
        });
        jScrollPane5.setViewportView(tblUnAttachedCpt);

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("CPT:");

        txtUnAttachedCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtUnAttachedCpt.setForeground(new java.awt.Color(102, 0, 0));
        txtUnAttachedCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnAttachedCptActionPerformed(evt);
            }
        });

        chkAttachCpt.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkAttachCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkAttachCpt.setForeground(new java.awt.Color(102, 0, 0));
        chkAttachCpt.setText("Select All");
        chkAttachCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAttachCptActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("From:");

        txtFromClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFromClient.setForeground(new java.awt.Color(102, 0, 0));
        txtFromClient.setToolTipText("");
        txtFromClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromClientActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("To:");

        txtToClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtToClient.setForeground(new java.awt.Color(102, 0, 0));
        txtToClient.setToolTipText("");
        txtToClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToClientActionPerformed(evt);
            }
        });

        btnCopyClient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCopyClient.setText("Copy");
        btnCopyClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFromClient, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToClient, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopyClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnAttachedCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAttachCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jScrollPane5)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnAttachedCpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(chkAttachCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtFromClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(txtToClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopyClient, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPacsLink, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlAdd4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlAdd4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUnAttachClient.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnUnAttachClient.setText("Unattach");
        btnUnAttachClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnAttachClientActionPerformed(evt);
            }
        });

        btnAttachClient.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnAttachClient.setText("Attach");
        btnAttachClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdd4Layout = new javax.swing.GroupLayout(pnlAdd4);
        pnlAdd4.setLayout(pnlAdd4Layout);
        pnlAdd4Layout.setHorizontalGroup(
            pnlAdd4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdd4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnUnAttachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdd4Layout.setVerticalGroup(
            pnlAdd4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdd4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit)
                .addComponent(btnUnAttachClient)
                .addComponent(btnAttachClient))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search CPT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CPT Name:");

        txtCpt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCpt.setForeground(new java.awt.Color(102, 0, 0));
        txtCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCptActionPerformed(evt);
            }
        });
        txtCpt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCptKeyPressed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Client:");

        txtAttachedClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAttachedClient.setForeground(new java.awt.Color(102, 0, 0));
        txtAttachedClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttachedClientActionPerformed(evt);
            }
        });

        cboAttachedClientType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "CREDIT", "CASH" }));
        cboAttachedClientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAttachedClientTypeActionPerformed(evt);
            }
        });

        chkUnAttachClient.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkUnAttachClient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkUnAttachClient.setForeground(new java.awt.Color(102, 0, 0));
        chkUnAttachClient.setText("Select All");
        chkUnAttachClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUnAttachClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtCpt)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtAttachedClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAttachedClientType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkUnAttachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtAttachedClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAttachedClientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkUnAttachClient, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnUnAttachCpt.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnUnAttachCpt.setText("Unattach");
        btnUnAttachCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnAttachCptActionPerformed(evt);
            }
        });

        btnAttachCpt.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnAttachCpt.setText("Attach");
        btnAttachCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachCptActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnUnAttachCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttachCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnAttachCpt)
                    .addComponent(btnAttachCpt)
                    .addComponent(btnClear)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAdd4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAdd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSectionActionPerformed

        if (departmentId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Department First!");
            txtDepartment.requestFocus();
            return;
        }

        String query = "SELECT SECTION_ID ID, DESCRIPTION               \n"
                + " FROM                                                \n"
                + Database.DCMS.section + "                             \n"
                + " WHERE UPPER(DESCRIPTION) LIKE "
                + " '%" + txtSection.getText().toUpperCase() + "%'      \n"
                + " AND DEPARTMENT_ID = " + departmentId + "            \n";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            txtSection.setText(Constants.lovDescription.toUpperCase());
            sectionId = Constants.lovID;
        }
        txtCpt.requestFocus();
    }//GEN-LAST:event_txtSectionActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed

        String query = "SELECT ID, DESCRIPTION FROM          \n"
                + Database.DCMS.department + "               \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtDepartment.getText().toUpperCase().trim() + "%'\n"
                + " AND DEF_TYPE_ID = '" + DefinitionTypes.department + "'\n";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtDepartment.setText(Constants.lovDescription.toUpperCase());
        departmentId = Constants.lovID;
        txtSection.requestFocus();
        getAttachedCpts();
        getUnAttachedCpts(txtAttachedCpt.getText().trim().toUpperCase());
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void txtDepartmentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartmentKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentKeyPressed
    DisplayLOV lov = new DisplayLOV();

    private void tblAttachedClientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedClientsMouseReleased

        if (listAttachedClients.isEmpty() || tblAttachedClients.getSelectedRow() < 0) {
            return;
        }
        cptWiseClient = listAttachedClients.get(tblAttachedClients.getSelectedRow());
        txtAttachedClient.setText(cptWiseClient.getClientDescription().toUpperCase());


    }//GEN-LAST:event_tblAttachedClientsMouseReleased

    private void tblAttachedClientsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblAttachedClientsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedClientsPropertyChange

    private void tblAttachedClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedClientsMouseClicked

    }//GEN-LAST:event_tblAttachedClientsMouseClicked

    private void tblUnAttachedClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnAttachedClientsMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_tblUnAttachedClientsMouseClicked

    private void tblUnAttachedClientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnAttachedClientsMouseReleased

        if (listUnAttachedClients.isEmpty() || tblUnAttachedClients.getSelectedRow() < 0) {
            return;
        }
        cptWiseClient = listUnAttachedClients.get(tblUnAttachedClients.getSelectedRow());
        txtAttachedClient.setText(cptWiseClient.getClientDescription().toUpperCase());
    }//GEN-LAST:event_tblUnAttachedClientsMouseReleased

    private void tblUnAttachedClientsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblUnAttachedClientsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUnAttachedClientsPropertyChange

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed

        String query = "SELECT ID , DESCRIPTION                  \n"
                + " FROM                                         \n"
                + Database.DCMS.client
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtClient.getText().toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'                             \n";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            clientId = Constants.lovID;
            txtClient.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtClientActionPerformed

    private void txtClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientKeyPressed

    private void tblAttachedCptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedCptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedCptMouseClicked

    private void tblAttachedCptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedCptMouseReleased

        if (listAttachedCpt.isEmpty() || tblAttachedCpt.getSelectedRow() < 0) {
            return;
        }
        clientWiseCpt = listAttachedCpt.get(tblAttachedCpt.getSelectedRow());
        txtAttachedCpt.setText(clientWiseCpt.getCptDescription().toUpperCase());


    }//GEN-LAST:event_tblAttachedCptMouseReleased

    private void tblAttachedCptPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblAttachedCptPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedCptPropertyChange

    private void tblUnAttachedCptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnAttachedCptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUnAttachedCptMouseClicked

    private void tblUnAttachedCptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnAttachedCptMouseReleased

        if (listUnAttachedCpts.isEmpty() || tblUnAttachedCpt.getSelectedRow() < 0) {
            return;
        }
        clientWiseCpt = listUnAttachedCpts.get(tblUnAttachedCpt.getSelectedRow());
        txtUnAttachedCpt.setText(clientWiseCpt.getCptDescription().toUpperCase());

    }//GEN-LAST:event_tblUnAttachedCptMouseReleased

    private void tblUnAttachedCptPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblUnAttachedCptPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUnAttachedCptPropertyChange

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtAttachedClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttachedClientActionPerformed

        getAttachedClients();

    }//GEN-LAST:event_txtAttachedClientActionPerformed

    private void txtUnAttachedClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnAttachedClientActionPerformed

        if (txtUnAttachedClient.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Ente Client Name for Search");
            txtUnAttachedClient.requestFocus();
            return;
        }
        getUnAttachedClients(txtUnAttachedClient.getText().trim().toUpperCase());
    }//GEN-LAST:event_txtUnAttachedClientActionPerformed

    private void txtAttachedCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttachedCptActionPerformed

        getAttachedCpts();
        getUnAttachedCpts(txtAttachedCpt.getText().trim().toUpperCase());

    }//GEN-LAST:event_txtAttachedCptActionPerformed

    private void txtUnAttachedCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnAttachedCptActionPerformed

        getUnAttachedCpts(txtUnAttachedCpt.getText().trim().toUpperCase());
    }//GEN-LAST:event_txtUnAttachedCptActionPerformed

    private void chkUnAttachClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUnAttachClientActionPerformed

        if (chkUnAttachClient.isSelected()) {
            for (int i = 0; i < listAttachedClients.size(); i++) {
                tblAttachedClients.getModel().setValueAt(true, i, 5);
                btnUnAttachClient.requestFocusInWindow();
            }
        } else if (!chkUnAttachClient.isSelected()) {
            for (int i = 0; i < listAttachedClients.size(); i++) {
                tblAttachedClients.getModel().setValueAt(false, i, 5);
            }
        }
    }//GEN-LAST:event_chkUnAttachClientActionPerformed

    private void btnUnAttachClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnAttachClientActionPerformed

        if (tblAttachedClients.getSelectedRow() < 0) {
            return;
        }
        List list = new ArrayList();
        for (int i = 0; i < tblAttachedClients.getRowCount(); i++) {
            if ((Boolean) tblAttachedClients.getValueAt(i, 5)) {
                ClientWiseCpt client = listAttachedClients.get(i);
                client.setCptId(cptId);
                list.add(client);
            }
        }
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select User");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "UN-ATTACH the Selected Clients.");
        if (confirmation != 0) {
            return;
        }
        if (ctlCwc.unAttachClientAndCpt(list)) {
            txtAttachedClient.setText("");
            chkUnAttachClient.setSelected(false);
            cboAttachedClientType.setSelectedIndex(0);
            cboUnAttachedClientType.setSelectedIndex(0);
            getAttachedClients();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnUnAttachClientActionPerformed

    private void chkAttachClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAttachClientActionPerformed

        if (chkAttachClient.isSelected()) {
            for (int i = 0; i < listUnAttachedClients.size(); i++) {
                tblUnAttachedClients.getModel().setValueAt(true, i, 3);
                //    txtContractPrice.requestFocusInWindow();
            }
        } else if (!chkAttachClient.isSelected()) {
            for (int i = 0; i < listUnAttachedClients.size(); i++) {
                tblUnAttachedClients.getModel().setValueAt(false, i, 3);
            }
        }
    }//GEN-LAST:event_chkAttachClientActionPerformed

    private void btnAttachClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachClientActionPerformed

        if (tblUnAttachedClients.getSelectedRow() < 0) {
            return;
        }
        List list = new ArrayList();
        for (int i = 0; i < tblUnAttachedClients.getRowCount(); i++) {
            if ((Boolean) tblUnAttachedClients.getValueAt(i, 3)) {
                ClientWiseCpt client = listUnAttachedClients.get(i);
                client.setCptId(cptId);
                client.setClientCptPrice("0");
                client.setContractStatus("N");
                list.add(client);
            }
        }
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Client.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "ATTACH the Selected CLIENTS to CPT");
        if (confirmation != 0) {
            return;
        }
        if (ctlCwc.attachClientAndCpt(list)) {
            clearUnAttachedClient();
            txtUnAttachedClient.setText("");
            chkAttachClient.setSelected(false);
            cboAttachedClientType.setSelectedIndex(0);
            cboUnAttachedClientType.setSelectedIndex(0);
            getAttachedClients();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnAttachClientActionPerformed

    private void chkUnAttachCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUnAttachCptActionPerformed

        if (chkUnAttachCpt.isSelected()) {
            for (int i = 0; i < listAttachedCpt.size(); i++) {
                tblAttachedCpt.getModel().setValueAt(true, i, 4);
                btnUnAttachCpt.requestFocusInWindow();
            }
        } else if (!chkUnAttachCpt.isSelected()) {
            for (int i = 0; i < listAttachedCpt.size(); i++) {
                tblAttachedCpt.getModel().setValueAt(false, i, 4);
                btnUnAttachCpt.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_chkUnAttachCptActionPerformed

    private void btnUnAttachCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnAttachCptActionPerformed

        if (tblAttachedCpt.getSelectedRow() < 0) {
            return;
        }

        List list = new ArrayList();
        for (int i = 0; i < tblAttachedCpt.getRowCount(); i++) {
            if ((Boolean) tblAttachedCpt.getValueAt(i, 4)) {
                ClientWiseCpt client = listAttachedCpt.get(i);
                client.setClientId(clientId);
                list.add(client);
            }
        }

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select CPT");
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "UN-ATTACH the Selected CPT.");
        if (confirmation != 0) {
            return;
        }

        if (ctlCwc.unAttachClientAndCpt(list)) {
            chkUnAttachCpt.setSelected(false);
            getAttachedCpts();
            getUnAttachedCpts(txtUnAttachedCpt.getText().toUpperCase().trim());
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnUnAttachCptActionPerformed

    private void chkAttachCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAttachCptActionPerformed

        if (chkAttachCpt.isSelected()) {
            for (int i = 0; i < listUnAttachedCpts.size(); i++) {
                tblUnAttachedCpt.getModel().setValueAt(true, i, 4);
                btnUnAttachCpt.requestFocusInWindow();
            }
        } else {
            for (int i = 0; i < listUnAttachedCpts.size(); i++) {
                tblUnAttachedCpt.getModel().setValueAt(false, i, 4);
            }
        }
    }//GEN-LAST:event_chkAttachCptActionPerformed

    private void btnAttachCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachCptActionPerformed

        List list = new ArrayList();
        for (int i = 0; i < tblUnAttachedCpt.getRowCount(); i++) {
            if ((Boolean) tblUnAttachedCpt.getValueAt(i, 4)) {
                ClientWiseCpt client = listUnAttachedCpts.get(i);
                client.setClientId(clientId);
                client.setClientCptPrice("0");
                client.setContractStatus("N");
                list.add(client);
            }
        }
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select CPT.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "ATTACH the Selected CPT to Client");
        if (confirmation != 0) {
            return;
        }
        if (ctlCwc.attachClientAndCpt(list)) {
            clearUnAttachedCpt();
            chkAttachCpt.setSelected(false);
            txtAttachedCpt.setText("");
            getAttachedCpts();

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnAttachCptActionPerformed

    private void txtFromCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromCptActionPerformed

        String query = "SELECT CPT_ID ID , DESCRIPTION           \n"
                + " FROM                                         \n"
                + Database.DCMS.CPT
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtFromCpt.getText().toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'                             \n";

        if (!txtDepartment.getText().isEmpty()) {
            query += " AND DEPARTMENT_ID = '" + departmentId + "'        \n";
        } else if (txtDepartment.getText().isEmpty()) {
            departmentId = "";
        }

        if (!txtSection.getText().isEmpty()) {
            query += " AND SECTION_ID = '" + sectionId + "'              \n";
        } else if (txtSection.getText().isEmpty()) {
            sectionId = "";
        }

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            cptId = Constants.lovID;
            txtFromCpt.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtFromCptActionPerformed

    private void txtToCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToCptActionPerformed

        String query = "SELECT CPT_ID ID , DESCRIPTION           \n"
                + " FROM                                         \n"
                + Database.DCMS.CPT
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtToCpt.getText().toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'                             \n";

        if (!txtDepartment.getText().isEmpty()) {
            query += " AND DEPARTMENT_ID = '" + departmentId + "'        \n";
        } else if (txtDepartment.getText().isEmpty()) {
            departmentId = "";
        }

        if (!txtSection.getText().isEmpty()) {
            query += " AND SECTION_ID = '" + sectionId + "'              \n";
        } else if (txtSection.getText().isEmpty()) {
            sectionId = "";
        }

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            toCpt = Constants.lovID;
            txtToCpt.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtToCptActionPerformed

    private void btnCopyCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyCptActionPerformed

        List list = new ArrayList();
        for (int i = 0; i < tblAttachedClients.getRowCount(); i++) {
            ClientWiseCpt client = listAttachedClients.get(i);
            client.setCptId(toCpt);
            list.add(client);
        }

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "COPY the CPT");
        if (confirmation != 0) {
            return;
        }

        if (ctlCwc.attachClientAndCpt(list)) {
            txtCpt.setText(txtToCpt.getText().toUpperCase());
            txtFromCpt.setText("");
            txtToCpt.setText("");
            toCpt = "";
            cboAttachedClientType.setSelectedIndex(0);
            cboUnAttachedClientType.setSelectedIndex(0);
            txtCpt.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnCopyCptActionPerformed

    private void txtFromClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromClientActionPerformed

        String query = "SELECT ID , DESCRIPTION                  \n"
                + " FROM                                         \n"
                + Database.DCMS.client
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtFromClient.getText().toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'                             \n";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            clientId = Constants.lovID;
            txtFromClient.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtFromClientActionPerformed

    private void txtToClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToClientActionPerformed

        String query = "SELECT ID , DESCRIPTION                  \n"
                + " FROM                                         \n"
                + Database.DCMS.client
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtToClient.getText().toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'                             \n";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            toClient = Constants.lovID;
            txtToClient.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtToClientActionPerformed

    private void btnCopyClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyClientActionPerformed

        List list = new ArrayList();
        for (int i = 0; i < tblAttachedCpt.getRowCount(); i++) {
            ClientWiseCpt client = listAttachedCpt.get(i);
            client.setClientId(toClient);
            list.add(client);
        }

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "COPY the CLIENT");
        if (confirmation != 0) {
            return;
        }

        if (ctlCwc.attachClientAndCpt(list)) {
            txtClient.setText(txtToClient.getText().toUpperCase());
            txtFromClient.setText("");
            txtToClient.setText("");
            toClient = "";
            txtClient.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnCopyClientActionPerformed

    private void txtCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCptActionPerformed

        String query = "SELECT CPT_ID ID , DESCRIPTION           \n"
                + " FROM                                         \n"
                + Database.DCMS.CPT
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtCpt.getText().toUpperCase() + "%'"
                + " AND ACTIVE = 'Y'                             \n";

        if (!txtDepartment.getText().isEmpty()) {
            query += " AND DEPARTMENT_ID = '" + departmentId + "'        \n";
        } else if (txtDepartment.getText().isEmpty()) {
            departmentId = "";
        }

        if (!txtSection.getText().isEmpty()) {
            query += " AND SECTION_ID = '" + sectionId + "'              \n";
        } else if (txtSection.getText().isEmpty()) {
            sectionId = "";
        }

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            cptId = Constants.lovID;
            txtCpt.setText(Constants.lovDescription);
        }
        getAttachedClients();
    }//GEN-LAST:event_txtCptActionPerformed

    private void txtCptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCptKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCptKeyPressed

    private void cboAttachedClientTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAttachedClientTypeActionPerformed

        getAttachedClients();
    }//GEN-LAST:event_cboAttachedClientTypeActionPerformed

    private void cboUnAttachedClientTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUnAttachedClientTypeActionPerformed

        getUnAttachedClients(txtAttachedClient.getText().trim().toUpperCase());
    }//GEN-LAST:event_cboUnAttachedClientTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttachClient;
    private javax.swing.JButton btnAttachCpt;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCopyClient;
    private javax.swing.JButton btnCopyCpt;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUnAttachClient;
    private javax.swing.JButton btnUnAttachCpt;
    private javax.swing.JComboBox cboAttachedClientType;
    private javax.swing.JComboBox cboUnAttachedClientType;
    private javax.swing.JCheckBox chkAttachClient;
    private javax.swing.JCheckBox chkAttachCpt;
    private javax.swing.JCheckBox chkUnAttachClient;
    private javax.swing.JCheckBox chkUnAttachCpt;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlAdd4;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblAttachedClients;
    private javax.swing.JTable tblAttachedCpt;
    private javax.swing.JTable tblUnAttachedClients;
    private javax.swing.JTable tblUnAttachedCpt;
    private javax.swing.JTextField txtAttachedClient;
    private javax.swing.JTextField txtAttachedCpt;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtCpt;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtFromClient;
    private javax.swing.JTextField txtFromCpt;
    private javax.swing.JTextField txtSection;
    private javax.swing.JTextField txtToClient;
    private javax.swing.JTextField txtToCpt;
    private javax.swing.JTextField txtUnAttachedClient;
    private javax.swing.JTextField txtUnAttachedCpt;
    // End of variables declaration//GEN-END:variables

    private String cptId = "";
    private String clientId = "";
    private String departmentId = "";
    private String sectionId = "";

    private String toCpt = "";
    private String toClient = "";
    String cpt = "";
    String client = "";
    String transactionType = "";

    ClientWiseCptController ctlCwc = new ClientWiseCptController();
    List<ClientWiseCpt> listAttachedClients = new ArrayList<>();
    List<ClientWiseCpt> listUnAttachedClients = new ArrayList<>();

    List<ClientWiseCpt> listAttachedCpt = new ArrayList<>();
    List<ClientWiseCpt> listUnAttachedCpts = new ArrayList<>();

    ClientWiseCpt cptWiseClient = new ClientWiseCpt();
    ClientWiseCpt clientWiseCpt = new ClientWiseCpt();

    private void getAttachedClients() {

        if (cboAttachedClientType.getSelectedIndex() == 0) {
            transactionType = "";
        }
        if (cboAttachedClientType.getSelectedIndex() != 0) {
            transactionType = cboAttachedClientType.getSelectedItem().toString();
        }
        if (cptId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kinldy Select the CPT");
            return;
        }
        listAttachedClients = ctlCwc.getClientWiseCpt(client,
                txtAttachedClient.getText().trim().toUpperCase(),
                transactionType, cptId, cpt, departmentId, sectionId);

        if (listAttachedClients.isEmpty()) {
            ClientWiseCpt client = new ClientWiseCpt();
            List list = new ArrayList();
            list.add(client);
            tblAttachedClients.setModel(new AttachedClientsTableModel(list));
            return;
        } else {
            tblAttachedClients.setModel(new AttachedClientsTableModel(listAttachedClients));
            cptWiseClient = listAttachedClients.get(0);

        }

        ListSelectionModel selectionModel = tblAttachedClients.getSelectionModel();
        tblAttachedClients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsAttachedClients();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAttachedClients);

        getUnAttachedClients(txtAttachedClient.getText().trim().toUpperCase());
    }

    public void setColumnsWidthsAttachedClients() {

        TableColumn column = null;
        for (int i = 0; i < tblAttachedClients.getColumnCount(); i++) {
            column = tblAttachedClients.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(160);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            } else if (i == 3) {
                column.setPreferredWidth(30);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(20);
            }
        }
    }

    private void getUnAttachedClients(String clientName) {

        if (cptId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select the CPT");
            return;
        }
        if (txtUnAttachedClient.getText().length() == 0
                && txtCpt.getText().length() == 0) {
            cptId = "";
        }
        if (cboUnAttachedClientType.getSelectedIndex() == 0) {
            transactionType = "";
        }
        if (cboUnAttachedClientType.getSelectedIndex() != 0) {
            transactionType = cboUnAttachedClientType.getSelectedItem().toString();
        }
        listUnAttachedClients = ctlCwc.getUnAttachedClients(cptId,
                clientName,
                transactionType);

        if (listUnAttachedClients.isEmpty()) {
            ClientWiseCpt client = new ClientWiseCpt();
            List list = new ArrayList();
            list.add(client);
            tblUnAttachedClients.setModel(new UnAttachedClientsTableModel(list));
            return;
        } else {
            tblUnAttachedClients.setModel(new UnAttachedClientsTableModel(listUnAttachedClients));
        }

        ListSelectionModel selectionModel = tblUnAttachedClients.getSelectionModel();
        tblUnAttachedClients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsUnAttachedClients();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblUnAttachedClients);
    }

    public void setColumnsWidthsUnAttachedClients() {
        TableColumn column = null;
        for (int i = 0; i < tblUnAttachedClients.getColumnCount(); i++) {
            column = tblUnAttachedClients.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(250);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(10);
            }
        }
    }

    private void getAttachedCpts() {

        if (txtDepartment.getText().length() == 0) {
            departmentId = "";
        }
        if (txtSection.getText().length() == 0) {
            sectionId = "";
        }
        transactionType = "";

        listAttachedCpt = ctlCwc.getClientWiseCpt(clientId, client, transactionType, cpt,
                txtAttachedCpt.getText().trim().toUpperCase(), departmentId, sectionId);

        if (listAttachedCpt.isEmpty()) {

            ClientWiseCpt cpt = new ClientWiseCpt();
            List list = new ArrayList();
            list.add(cpt);
            tblAttachedCpt.setModel(new AttachedCptsTableModel(list));
            return;
        } else {
            tblAttachedCpt.setModel(new AttachedCptsTableModel(listAttachedCpt));
        }

        ListSelectionModel selectionModel = tblAttachedCpt.getSelectionModel();
        tblAttachedCpt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsAttachedCpt();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAttachedCpt);

    }

    public void setColumnsWidthsAttachedCpt() {
        TableColumn column = null;
        for (int i = 0; i < tblAttachedCpt.getColumnCount(); i++) {
            column = tblAttachedCpt.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(30);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            }
        }
    }

    private void getUnAttachedCpts(String cptDescription) {

        if (txtClient.getText().length() == 0) {
            clientId = "";
        }
        if (txtDepartment.getText().length() == 0) {
            departmentId = "";
        }
        if (txtSection.getText().length() == 0) {
            sectionId = "";
        }
        listUnAttachedCpts = ctlCwc.getUnAttachedCpts(clientId, cptDescription, departmentId, sectionId);

        if (listUnAttachedCpts.isEmpty()) {
            ClientWiseCpt cpt = new ClientWiseCpt();
            List list = new ArrayList();
            list.add(cpt);
            tblUnAttachedCpt.setModel(new UnAttachedCptsTableModel(list));
            return;
        } else {
            tblUnAttachedCpt.setModel(new UnAttachedCptsTableModel(listUnAttachedCpts));
        }

        ListSelectionModel selectionModel = tblUnAttachedCpt.getSelectionModel();
        tblUnAttachedCpt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsUnAttachedCpts();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblUnAttachedCpt);
    }

    public void setColumnsWidthsUnAttachedCpts() {
        TableColumn column = null;
        for (int i = 0; i < tblUnAttachedCpt.getColumnCount(); i++) {
            column = tblUnAttachedCpt.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(220);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(30);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            }
        }
    }

    private void clearForm() {

        ClientWiseCpt cpt = new ClientWiseCpt();
        List list = new ArrayList();
        list.add(cpt);
        tblUnAttachedCpt.setModel(new UnAttachedCptsTableModel(list));
        tblUnAttachedClients.setModel(new UnAttachedClientsTableModel(list));
        tblAttachedCpt.setModel(new AttachedCptsTableModel(list));
        tblAttachedClients.setModel(new AttachedClientsTableModel(list));

        txtCpt.setText("");
        txtClient.setText("");

        txtAttachedClient.setText("");
        txtUnAttachedClient.setText("");
        txtAttachedCpt.setText("");
        txtUnAttachedCpt.setText("");
        txtDepartment.setText("");
        txtSection.setText("");
        txtFromClient.setText("");
        txtToClient.setText("");
        txtFromCpt.setText("");
        txtToCpt.setText("");

        chkAttachClient.setSelected(false);
        chkAttachCpt.setSelected(false);
        chkUnAttachClient.setSelected(false);
        chkUnAttachCpt.setSelected(false);
    }

    private void clearUnAttachedCpt() {

        ClientWiseCpt cpt = new ClientWiseCpt();
        List list = new ArrayList();
        list.add(cpt);
        tblUnAttachedCpt.setModel(new UnAttachedCptsTableModel(list));
    }

    private void clearUnAttachedClient() {

        ClientWiseCpt cpt = new ClientWiseCpt();
        List list = new ArrayList();
        list.add(cpt);
        tblUnAttachedClients.setModel(new UnAttachedClientsTableModel(list));
    }
}
