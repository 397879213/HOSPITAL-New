package Form.Inventory;

import BO.Inventory.CondemItems;
import Controller.Inventory.CondemItemsController;
import TableModel.Inventory.CondemDetailTableModel;
import TableModel.Inventory.CondemItemsTableModel;
import TableModel.Inventory.CondemMasterTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.Status;
import utilities.Stores;

public class frmCondemItems extends javax.swing.JInternalFrame {

    private String storeId = "";
    private String itemId = "";
    private String userId = "";
    private String condemId = "";
    private String statusId = "";

    public frmCondemItems() {

        initComponents();
        this.setSize(Constants.xSize - 150, Constants.ySize - 40);
        btnRequest.setEnabled(false);
        btnApprove.setEnabled(false);
        btnReject.setEnabled(false);
        checkInprogressRequest();

    }

    CondemItemsController ctlCondemItems = new CondemItemsController();
    CondemItems objCondemItems = new CondemItems();
    CondemItems srchCondemItems = new CondemItems();
    List<CondemItems> listCondumMaster = new ArrayList();
    List<CondemItems> listCondumDetail = new ArrayList();
    List<CondemItems> listApprove = new ArrayList();

    DisplayLOV lov = new DisplayLOV();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtStore = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRequestBy = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCondumItem = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtReqQuantity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCondumId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtReqBy = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtStoreSrch = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCondumSrch = new javax.swing.JTextField();
        cboStatus = new javax.swing.JComboBox<String>();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCondumDetail = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblCondumMaster = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRejectRemarks = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Condum Items");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(886, 730));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condem Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Store Name : ");

        txtStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStoreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Request By : ");

        txtRequestBy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRequestBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequestByActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStore))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRequestBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRequestBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condem Item(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tblCondumItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCondumItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblCondumItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCondumItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCondumItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCondumItemMouseReleased(evt);
            }
        });
        tblCondumItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCondumItemKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblCondumItem);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Item Name : ");

        txtItemName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Request Quantity : ");

        txtReqQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReqQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReqQuantityActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Condemetion Id : ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Req. by : ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtReqQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtItemName)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtCondumId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReqBy)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCondumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtReqBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtReqQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Store Name : ");

        txtStoreSrch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStoreSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStoreSrchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Condem No : ");

        txtCondumSrch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCondumSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCondumSrchActionPerformed(evt);
            }
        });

        cboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Requested", "Approved", "Rejected" }));
        cboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStoreSrch))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCondumSrch, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtStoreSrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCondumSrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condem Request Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        tblCondumDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCondumDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Condum No","Item Name","Req. Quantity", "App. Quantity", "Check"}
        ));
        tblCondumDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCondumDetailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCondumDetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCondumDetailMouseReleased(evt);
            }
        });
        tblCondumDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCondumDetailKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblCondumDetail);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condem Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        tblCondumMaster.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCondumMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Condum No","Request By","Store Name", "Requested Date"}
        ));
        tblCondumMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCondumMasterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCondumMasterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCondumMasterMouseReleased(evt);
            }
        });
        tblCondumMaster.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCondumMasterKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblCondumMaster);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reject Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        txtRejectRemarks.setColumns(20);
        txtRejectRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRejectRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRejectRemarks);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnApprove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(51, 204, 0));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(102, 0, 0));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRequest.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject)
                    .addComponent(btnExit)
                    .addComponent(btnRequest)
                    .addComponent(jButton2)
                    .addComponent(btnClear))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCondumItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumItemMouseClicked
        // TODO add your handling code here:
        itemId = tblCondumItem.getValueAt(tblCondumItem.getSelectedRow(), 1).toString();
        objCondemItems.setItemId(itemId);
        objCondemItems.setCondemId(condemId);
        if (evt.getClickCount() == 2) {
            if (ctlCondemItems.deleteCondemDetailItem(objCondemItems)) {
                selectCondumDetail();
            }

        }
    }//GEN-LAST:event_tblCondumItemMouseClicked

    private void tblCondumItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumItemMousePressed

    private void tblCondumItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumItemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumItemMouseReleased

    private void tblCondumItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCondumItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumItemKeyReleased

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ITM.ID, ITM.DESCRIPTION ||' ('|| SWI.QTY || ')' "
                + " DESCRIPTION FROM                            \n"
                + Database.DCMS.storeWiseItems + "  SWI,        \n"
                + Database.DCMS.item + "  ITM                   \n"
                + " WHERE SWI.STORE_ID = " + storeId + "        \n"
                + " AND SWI.ITEM_ID = ITM.ID                    \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtItemName.getText().toUpperCase().trim() + "%'\n"
                + " AND ITM.ID NOT IN ( SELECT ITEM_ID FROM "
                + Database.Inventory.itemCondemDetail + "    \n"
                + " WHERE CONDEM_ID = " + condemId + ")      \n"
                + " AND SWI.ACTIVE = 'Y'                     \n"
                + " ORDER BY ITM.DESCRIPTION                 \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = "";
            return;
        } else {
            itemId = Constants.lovID;
            txtItemName.setText(Constants.lovDescription);
        }
        txtReqQuantity.requestFocus();
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStoreActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM                         \n"
                + Database.DCMS.store + "                                   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtStore.getText().toUpperCase().trim() + "%'             \n"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            storeId = "";
            return;
        } else {
            storeId = Constants.lovID;
            txtStore.setText(Constants.lovDescription);
        }
        txtRequestBy.requestFocus();
        condemId = ctlCondemItems.condemId();
    }//GEN-LAST:event_txtStoreActionPerformed

    private void tblCondumDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumDetailMouseClicked

    private void tblCondumDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumDetailMousePressed

    private void tblCondumDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumDetailMouseReleased

    }//GEN-LAST:event_tblCondumDetailMouseReleased

    private void tblCondumDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCondumDetailKeyReleased
        // TODO add your handling code here:
        CondemItems objChk = listCondumDetail.get(tblCondumDetail.getSelectedRow()); // 
        if (Integer.parseInt(objChk.getRequestedQuantity())
                < Integer.parseInt(tblCondumDetail.getValueAt(tblCondumDetail.getSelectedRow(), 2).toString())) {
            JOptionPane.showMessageDialog(null, "Quantity not gratter than Requested quantity");
        }
    }//GEN-LAST:event_tblCondumDetailKeyReleased

    private void tblCondumMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumMasterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumMasterMouseClicked

    private void tblCondumMasterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumMasterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumMasterMousePressed

    private void tblCondumMasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCondumMasterMouseReleased

        if(tblCondumMaster.getSelectedRow() < 0 || listCondumMaster.isEmpty()){
            return;
        }
        CondemItems obj = listCondumMaster.get(tblCondumMaster.getSelectedRow());
        listCondumDetail = ctlCondemItems.selectCondemDetail(obj.getCondemId(),
                statusId);
        searchDetail();
    }//GEN-LAST:event_tblCondumMasterMouseReleased

    private void tblCondumMasterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCondumMasterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCondumMasterKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtRequestByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequestByActionPerformed
        // TODO add your handling code here:
        String query = "SELECT USR.USER_NAME ID, USR.NAME DESCRIPTION FROM  \n"
                + Database.DCMS.users + " USR,                              \n"
                + Database.Inventory.storeWiseUser + "  SWU                 \n"
                + " WHERE UPPER(USR.NAME) LIKE '%"
                + txtRequestBy.getText().toUpperCase().trim() + "%'         \n"
                + " AND SWU.STORE_ID = " + storeId + "                      \n"
                + " AND USR.USER_NAME = SWU.USER_ID                         \n"
                + " AND USR.ACTIVE = 'Y'                                    \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            userId = "";
            return;
        } else {
            userId = Constants.lovID;
            txtRequestBy.setText(Constants.lovDescription);
        }
        txtItemName.requestFocus();
    }//GEN-LAST:event_txtRequestByActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Request the item(s).");
        if (confirmation != 0) {
            return;
        }

        if (ctlCondemItems.updateRequestStoreStocks(listApprove, storeId,
                Stores.condemStore, "Y")) {
            txtCondumId.setText("");
            txtReqBy.setText("");
            condemId = "";
            listCondumDetail.clear();
            tblCondumItem.setModel(new CondemItemsTableModel(listCondumDetail));
            btnRequest.setEnabled(true);
            btnApprove.setEnabled(true);
            btnReject.setEnabled(true);
            searchData();
            JOptionPane.showMessageDialog(null, "Items Request Successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Request Successfully.");
        }     
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        setDataForInsert();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtReqQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReqQuantityActionPerformed
        // TODO add your handling code here:
        setDataForInsert();
    }//GEN-LAST:event_txtReqQuantityActionPerformed

    private void txtStoreSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStoreSrchActionPerformed
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_txtStoreSrchActionPerformed

    private void txtCondumSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCondumSrchActionPerformed
        // TODO add your handling code here:
        searchData();

    }//GEN-LAST:event_txtCondumSrchActionPerformed

    private void cboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStatusActionPerformed
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_cboStatusActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Approve the item(s).");
        if (confirmation != 0) {
            return;
        }
        listApprove.clear();
        setUpdateData();
        if (ctlCondemItems.updateCondemDetail(listApprove, Stores.condemStore,
                Stores.discartedStore, "")) {
            System.err.println("cond idd for master " + condemId);
            if (ctlCondemItems.checkMasterForUpdate(condemId).length() == 0) {
                objCondemItems.setOrderStatusId(Status.Approved);
                objCondemItems.setCondemId(condemId);
                ctlCondemItems.updateCondemMaster(objCondemItems);
            }
            JOptionPane.showMessageDialog(null, listApprove.size() + " Items(s) "
                    + "Approved Successfully.");
            searchData();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Approve.");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        if (txtRejectRemarks.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Reject Remarks.",
                    "Condem Item",
                    JOptionPane.INFORMATION_MESSAGE);
            txtRejectRemarks.requestFocus();
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Reject the item(s).");
        if (confirmation != 0) {
            return;
        }
        listApprove.clear();
        setUpdateData();
        if (ctlCondemItems.updateRejectRequest(listApprove, Stores.condemStore,
                storeId, "Y")) {

            if (ctlCondemItems.checkMasterForUpdate(condemId).length() == 0) {
                objCondemItems.setOrderStatusId(Status.Approved);
                objCondemItems.setCondemId(condemId);
                ctlCondemItems.updateCondemMaster(objCondemItems);
            }
            JOptionPane.showMessageDialog(null, listApprove.size() + " Items(s) "
                    + "Rejected Successfully.");
            listCondumDetail.clear();
            tblCondumDetail.setModel(new CondemDetailTableModel(listCondumDetail));
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Approve.");
        }
        txtRejectRemarks.setText("");
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtCondumSrch.setText("");
        txtItemName.setText("");
        txtRejectRemarks.setText("");
        txtReqQuantity.setText("");
        txtStore.setText("");
        txtStoreSrch.setText("");
        cboStatus.setSelectedIndex(0);

        storeId = "";
        itemId = "";
        userId = "";
        statusId = "";

        listApprove.clear();
        listCondumDetail.clear();
        listCondumMaster.clear();
        tblCondumItem.setModel(new CondemItemsTableModel(listCondumDetail));
        tblCondumDetail.setModel(new CondemDetailTableModel(listCondumDetail));
        tblCondumMaster.setModel(new CondemMasterTableModel(listCondumMaster));
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        objCondemItems.setStoreId(storeId);
        objCondemItems.setRequestedBy(userId);
        objCondemItems.setOrderStatusId(Status.pending);
        if (ctlCondemItems.insertCondumMaster(objCondemItems)) {
            txtCondumId.setEditable(false);
            txtReqBy.setEditable(false);
            txtItemName.setEditable(true);
            txtReqQuantity.setEditable(true);
            listCondumMaster = ctlCondemItems.selectCondemMaster(srchCondemItems);
            objCondemItems = listCondumMaster.get(0);
            srchCondemItems.setCondemId(objCondemItems.getCondemId());
            txtCondumId.setText(objCondemItems.getCondemId());
            txtReqBy.setText(objCondemItems.getRequestedByName());
            srchCondemItems.setCondemId(objCondemItems.getCondemId());
        }
        txtStore.setText("");
        txtRequestBy.setText("");
        txtItemName.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Cancel the item(s).\n"
                + "Do you want to Cancel?");
        if (confirmation != 0) {
            return;
        }
        if(ctlCondemItems.cancelCondemItem(listApprove)){
            JOptionPane.showMessageDialog(null, "Cancelled succcessfully");
        }else{
            JOptionPane.showMessageDialog(null, "Unable to cancel succcessfully");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblCondumDetail;
    private javax.swing.JTable tblCondumItem;
    private javax.swing.JTable tblCondumMaster;
    private javax.swing.JTextField txtCondumId;
    private javax.swing.JTextField txtCondumSrch;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextArea txtRejectRemarks;
    private javax.swing.JTextField txtReqBy;
    private javax.swing.JTextField txtReqQuantity;
    private javax.swing.JTextField txtRequestBy;
    private javax.swing.JTextField txtStore;
    private javax.swing.JTextField txtStoreSrch;
    // End of variables declaration//GEN-END:variables

    private void setDataForInsert() {
        if (!confirmation()) {
            return;
        }

        objCondemItems.setItemId(itemId);
        objCondemItems.setOrderStatusId(Status.pending);

        try {
            Integer.parseInt(txtReqQuantity.getText().trim());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly enter correct quantity.");
            txtReqQuantity.setText("");
            txtReqQuantity.requestFocus();
            return;
        }
        objCondemItems.setRequestedQuantity(txtReqQuantity.getText().trim());

        if (ctlCondemItems.insertCondumDetail(objCondemItems)) {
            selectCondumDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to add item. \n"
                    + "Kindly contact Administrator.");
        }
        txtItemName.setText("");
        txtReqQuantity.setText("");
        txtItemName.requestFocus();
        btnRequest.setEnabled(true);
    }

    private void selectCondumDetail() {
        
        listApprove = ctlCondemItems.selectCondemDetail(condemId, statusId);
        if(listApprove.isEmpty()){
            List<CondemItems> listApprove = new ArrayList();
            tblCondumItem.setModel(new CondemItemsTableModel(listApprove));
        }
        tblCondumItem.setModel(new CondemItemsTableModel(listApprove));
        ListSelectionModel selectionModel = tblCondumItem.getSelectionModel();
        tblCondumItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setCondumDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCondumItem);
    }

    private void setCondumDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCondumItem.getColumnCount(); i++) {
            column = tblCondumItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            }
        }
    }

    private boolean confirmation() {
        boolean ret = true;
        if (itemId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Item.",
                    "Condem Item",
                    JOptionPane.INFORMATION_MESSAGE);
            txtItemName.requestFocus();
            ret = false;
        }
        if (txtReqQuantity.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Request Quantity.",
                    "Condem Item",
                    JOptionPane.INFORMATION_MESSAGE);
            txtReqQuantity.requestFocus();
            ret = false;
        }
        return ret;
    }

    private void searchData() {
        setStatusData();
        listCondumMaster = ctlCondemItems.selectCondemMaster(srchCondemItems);
        if(listCondumMaster.isEmpty()){
            List<CondemItems> listCondumMaster = new ArrayList();
            tblCondumMaster.setModel(new CondemItemsTableModel(listCondumMaster));
        }
        tblCondumMaster.setModel(new CondemMasterTableModel(listCondumMaster));
        ListSelectionModel selectionModel = tblCondumMaster.getSelectionModel();
        tblCondumMaster.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setMasterColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCondumMaster);
    }

    private void setMasterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCondumMaster.getColumnCount(); i++) {
            column = tblCondumMaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void setDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCondumDetail.getColumnCount(); i++) {
            column = tblCondumDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(150);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setStatusData() {
        if (cboStatus.getSelectedIndex() == 0) {
            srchCondemItems.setOrderStatusId("");
            btnApprove.setEnabled(true);
            btnReject.setEnabled(true);
        }
        if (cboStatus.getSelectedIndex() == 1) {
            srchCondemItems.setOrderStatusId(Status.admissionRequest);
            btnApprove.setEnabled(true);
            btnReject.setEnabled(true);
        }
        if (cboStatus.getSelectedIndex() == 2) {
            srchCondemItems.setOrderStatusId(Status.Approved);
            btnApprove.setEnabled(false);
        }
        if (cboStatus.getSelectedIndex() == 3) {
            srchCondemItems.setOrderStatusId(Status.rejected);
            btnReject.setEnabled(false);
        }
    }

    private void setUpdateData() {

        for (int i = 0; i < listCondumDetail.size(); i++) {
            if (tblCondumDetail.getValueAt(i, 3).equals(true)) {
                objCondemItems = listCondumDetail.get(i);
                objCondemItems.setApprovedQuantity(
                        tblCondumDetail.getValueAt(i, 2).toString());
                objCondemItems.setOrderStatusId(Status.Approved);
                objCondemItems.setRejectRemarks(txtRejectRemarks.getText().trim());
                objCondemItems.setStoreId(objCondemItems.getStoreId());
                listApprove.add(objCondemItems);
            }
        }
    }

    private void searchDetail() {
        if(listCondumDetail.isEmpty()){
            List<CondemItems> listCondumMaster = new ArrayList();
            tblCondumDetail.setModel(new CondemItemsTableModel(listCondumDetail));
        }
        tblCondumDetail.setModel(new CondemDetailTableModel(listCondumDetail));
        tblCondumDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel selectionModel = tblCondumDetail.getSelectionModel();
        setDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCondumDetail);
        CondemItems objSet = listCondumDetail.get(0);
        storeId = objSet.getStoreId();
        txtStore.setText(objSet.getStoreDescription());
        txtReqBy.setText(objSet.getRequestedByName());
        txtCondumId.setText(objSet.getCondemId());
    }

    private void checkInprogressRequest() {

        srchCondemItems.setCondemId("");
        srchCondemItems.setRequestedBy(Constants.userId);
        srchCondemItems.setStoreId(Constants.storeId);
        srchCondemItems.setOrderStatusId(Status.pending);
        listCondumMaster = ctlCondemItems.selectCondemMaster(srchCondemItems);
        if (!listCondumMaster.isEmpty()) {
            txtRequestBy.setEditable(false);
            txtStore.setEditable(false);
            txtCondumId.setEditable(false);
            txtReqBy.setEditable(false);
            txtItemName.setEditable(true);
            txtReqQuantity.setEditable(true);

            objCondemItems = listCondumMaster.get(0);
            txtCondumId.setText(objCondemItems.getCondemId());
            txtReqBy.setText(objCondemItems.getRequestedByName());
            srchCondemItems.setCondemId(objCondemItems.getCondemId());
            condemId = objCondemItems.getCondemId();
            storeId = objCondemItems.getStoreId();
            listApprove = ctlCondemItems.selectCondemDetail(
                    objCondemItems.getCondemId(), Status.pending);
            selectCondumDetail();
            btnRequest.setEnabled(true);
            btnApprove.setEnabled(false);
            btnReject.setEnabled(false);
        } else {
            txtRequestBy.setEditable(true);
            txtStore.setEditable(true);
            txtCondumId.setEditable(false);
            txtReqBy.setEditable(false);
            txtItemName.setEditable(false);
            txtReqQuantity.setEditable(false);
        }
    }
}
