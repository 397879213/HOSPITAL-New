package Form.Inventory;

import Controller.Inventory.OutreachPathInventoryController;
import Inventory.BO.StoreWiseItems;
import TableModel.Inventory.ManualIndentDetailTableModel;
import TableModel.Inventory.ManualIndentItemsTableModel;
import TableModel.Inventory.ManualIndentMasterTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.Status;
import utilities.Stores;

public class frmOutreachPathInventory extends javax.swing.JInternalFrame {

    private int storeId = 0;
    private int itemId = 0;
    private String userId = "";
    private String indentId = "";
    private String manualIndentNo = "";
    private String statusId = "";
    private int searchStoreId = 0;
    private int searchItemId = 0;
    private String fromDate = "";
    private String toDate = "";

    public frmOutreachPathInventory() {

        initComponents();
        this.setSize(Constants.xSize - 45, Constants.ySize);
        btnAdd.setMnemonic(KeyEvent.VK_A);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnRecieved.setMnemonic(KeyEvent.VK_R);
        btnSearch.setMnemonic(KeyEvent.VK_S);
        chkMove.setSelected(false);
        txtStore.setEditable(false);
        indentId = ctlOutreachPathInventory.manualIndentId();
        lblStoreName.setText(ctlOutreachPathInventory.storeName(Constants.storeId));
        
        JScrollPane scrollBar = new JScrollPane(this.tbRequestedItem,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        setDate(0);
    }

    OutreachPathInventoryController ctlOutreachPathInventory
            = new OutreachPathInventoryController();
    StoreWiseItems objStoreWiseItems = new StoreWiseItems();
    StoreWiseItems objSearch = new StoreWiseItems();
    List<StoreWiseItems> listManualIndentMaster = new ArrayList();
    List<StoreWiseItems> listManualIndentDetail = new ArrayList();
    List<StoreWiseItems> listRequest = new ArrayList();

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
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        chkMove = new javax.swing.JCheckBox();
        lblStoreName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtManualIndentNo = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbRequestedItem = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtmanualIndntNoMaster = new javax.swing.JTextField();
        txtIndentDateMaster = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtStoreSrch = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        txtSearchItem = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        chkDate = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtSrchManulaIndentNo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblIndentDetail = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblIndentRequest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRecieved = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Outreach Inventory");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(955, 800));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outreach Inventory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("From Store : ");

        txtStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStoreActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Store Name : ");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        chkMove.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkMove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkMove.setForeground(new java.awt.Color(102, 0, 0));
        chkMove.setText("Move");
        chkMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMoveActionPerformed(evt);
            }
        });

        lblStoreName.setEditable(false);
        lblStoreName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Indent No : ");

        txtManualIndentNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtManualIndentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManualIndentNoActionPerformed(evt);
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
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStoreName)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtStore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkMove, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtManualIndentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManualIndentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Item(s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tbRequestedItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbRequestedItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tbRequestedItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRequestedItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRequestedItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbRequestedItemMouseReleased(evt);
            }
        });
        tbRequestedItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbRequestedItemKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tbRequestedItem);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Item : ");

        txtItemName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        txtQty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Indent No : ");

        txtmanualIndntNoMaster.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtmanualIndntNoMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanualIndntNoMasterActionPerformed(evt);
            }
        });

        txtIndentDateMaster.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIndentDateMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndentDateMasterActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Date : ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtmanualIndntNoMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndentDateMaster))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQty)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtmanualIndntNoMaster)
                        .addComponent(txtIndentDateMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemName)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("From Date : ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("To Date : ");

        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Item Name : ");

        txtSearchItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchItemActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        chkDate.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkDate.setForeground(new java.awt.Color(102, 0, 0));
        chkDate.setText("All");
        chkDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Manual Indent No : ");

        txtSrchManulaIndentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSrchManulaIndentNoActionPerformed(evt);
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
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearchItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkDate, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSrchManulaIndentNo)
                                .addContainerGap())))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStoreSrch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSrchManulaIndentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtStoreSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        tblIndentDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIndentDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Name","Indent Quantity"}
        ));
        tblIndentDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIndentDetailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIndentDetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIndentDetailMouseReleased(evt);
            }
        });
        tblIndentDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIndentDetailKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblIndentDetail);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        tblIndentRequest.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIndentRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblIndentRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIndentRequestMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIndentRequestMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIndentRequestMouseReleased(evt);
            }
        });
        tblIndentRequest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIndentRequestKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblIndentRequest);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRecieved.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRecieved.setText("Recieved");
        btnRecieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecievedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecieved, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnRecieved))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbRequestedItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItemMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() % 2 == 0) {
            if (tbRequestedItem.getSelectedRow() < 0 || listRequest.isEmpty()) {
                return;
            }

            StoreWiseItems objdltItem = listRequest.get(tbRequestedItem.getSelectedRow());
            if (ctlOutreachPathInventory.deleteManualIndentDetail(objdltItem.getIndentId(),
                    objdltItem.getItemId())) {
                selectRerquestItems(indentId);
            }
        }
    }//GEN-LAST:event_tbRequestedItemMouseClicked

    private void tbRequestedItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItemMousePressed

    private void tbRequestedItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItemMouseReleased

    private void tbRequestedItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRequestedItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItemKeyReleased

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
        String query = " SELECT ITM.ID, ITM.DESCRIPTION ||' ('|| SWI.QTY || ')' "
                + " DESCRIPTION FROM                 \n"
                + Database.DCMS.storeWiseItems + "  SWI,                    \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE SWI.STORE_ID = " + Constants.storeId + "          \n"
                + " AND SWI.ITEM_ID = ITM.ID"
                + " AND ITM.ID NOT IN ( SELECT ITEM_ID FROM                 \n"
                + Database.Inventory.manualIndentDetail + "                 \n"
                + " WHERE MANUAL_ID = "+ indentId +" )                      \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtItemName.getText().toUpperCase().trim() + "%'          \n"
                + " AND SWI.ACTIVE = 'Y'                                    \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";

        lov.LOVSelection(query, this);
        itemId = 0;
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = Integer.parseInt(Constants.lovID);
            txtItemName.setText(Constants.lovDescription);
        }
        txtQty.requestFocus();
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
            storeId = 0;
            return;
        } else {
            storeId = Integer.parseInt(Constants.lovID);
            txtStore.setText(Constants.lovDescription);
        }
        txtManualIndentNo.requestFocus();
    }//GEN-LAST:event_txtStoreActionPerformed

    private void tblIndentDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentDetailMouseClicked

    private void tblIndentDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentDetailMousePressed

    private void tblIndentDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentDetailMouseReleased
        if (tblIndentDetail.getSelectedRow() < 0 || listManualIndentDetail.isEmpty()) {
            return;
        }
    }//GEN-LAST:event_tblIndentDetailMouseReleased

    private void tblIndentDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentDetailKeyReleased

    private void tblIndentRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequestMouseClicked

    private void tblIndentRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequestMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequestMousePressed

    private void tblIndentRequestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequestMouseReleased
        if (tblIndentRequest.getSelectedRow() < 0 || listManualIndentMaster.isEmpty()) {
            return;
        }
        StoreWiseItems obj = listManualIndentMaster.get(tblIndentRequest.getSelectedRow());
        listManualIndentDetail = ctlOutreachPathInventory.selecttManualIndentDetail(
                obj.getIndentId());
        searchIndentDetail();
    }//GEN-LAST:event_tblIndentRequestMouseReleased

    private void tblIndentRequestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentRequestKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequestKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRecievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecievedActionPerformed
        // TODO add your handling code here:

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Request the item(s).");
        if (confirmation != 0) {
            return;
        }
        objStoreWiseItems.setStatusId(Status.receiveBill);
        objStoreWiseItems.setIndentId(indentId);
        listRequest = ctlOutreachPathInventory.selecttManualIndentDetail(indentId);
        if (ctlOutreachPathInventory.saveUpdateStoresStock(listRequest, objStoreWiseItems)) {
            searchManualIndentMaster();
            JOptionPane.showMessageDialog(null, "Items Request Successfully.");
            listRequest.clear();
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
            txtmanualIndntNoMaster.setText("");
            txtIndentDateMaster.setText("");
            txtQty.setText("");
            txtmanualIndntNoMaster.setEditable(true);
            txtIndentDateMaster.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Request Successfully.");
        }
    }//GEN-LAST:event_btnRecievedActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        saveIndentMaster();
        txtItemName.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtStoreSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStoreSrchActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM                         \n"
                + Database.DCMS.store + "                                   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtStoreSrch.getText().toUpperCase().trim() + "%'             \n"
                + " AND ID IN (SELECT MOVE_STORE_ID FROM "
                + Database.Inventory.manualIndentMaster + ""
                + "WHERE STORE_ID = " + Constants.storeId + ")"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            searchStoreId = 0;
            return;
        } else {
            searchStoreId = Integer.parseInt(Constants.lovID);
            txtStoreSrch.setText(Constants.lovDescription);
            searchManualIndentMaster();
        }
    }//GEN-LAST:event_txtStoreSrchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtItemName.setText("");
        txtQty.setText("");
        txtStore.setText("");
        txtStoreSrch.setText("");

        storeId = 0;
        itemId = 0;
        userId = "";
        statusId = "";

        listManualIndentDetail.clear();
        listManualIndentMaster.clear();
        listRequest.clear();
        tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
        tblIndentDetail.setModel(new ManualIndentDetailTableModel(listManualIndentDetail));
        tblIndentRequest.setModel(new ManualIndentMasterTableModel(listManualIndentMaster));
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        // TODO add your handling code here: birthDate
        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                    "Path Outreach Inventory", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());
        objSearch.setFromDate(fromDate);
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                    "Path Outreach Inventory", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtToDate.getDate());
        objSearch.setToDate(toDate);
        searchManualIndentMaster();
    }//GEN-LAST:event_txtToDateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        searchManualIndentMaster();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchItemActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ITM.ID, ITM.DESCRIPTION ||' ('|| SWI.QTY || ')' "
                + " DESCRIPTION FROM                 \n"
                + Database.DCMS.storeWiseItems + "  SWI,                    \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE SWI.STORE_ID = " + Constants.storeId + "          \n"
                + " AND SWI.ITEM_ID = ITM.ID                                \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtSearchItem.getText().toUpperCase().trim() + "%'        \n"
                + " AND SWI.ACTIVE = 'Y'                                    \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = 0;
            return;
        } else {
            searchItemId = Integer.parseInt(Constants.lovID);
            txtSearchItem.setText(Constants.lovDescription);
            searchManualIndentMaster();

        }
    }//GEN-LAST:event_txtSearchItemActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
        saveIndentDetail();

    }//GEN-LAST:event_txtQtyActionPerformed

    private void chkMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMoveActionPerformed
        // TODO add your handling code here:
        if (chkMove.isSelected()) {
            txtStore.setEditable(true);
            txtStore.requestFocus();
        }
        if (!chkMove.isSelected()) {
            txtStore.setEditable(false);
        }

    }//GEN-LAST:event_chkMoveActionPerformed

    private void chkDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDateActionPerformed
        // TODO add your handling code here:
        if (chkDate.isSelected()) {
            txtFromDate.setEditable(false);
            txtToDate.setEditable(false);
        }
        if (!chkDate.isSelected()) {
            txtFromDate.setEditable(true);
            txtToDate.setEditable(true);
        }

    }//GEN-LAST:event_chkDateActionPerformed

    private void txtManualIndentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManualIndentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManualIndentNoActionPerformed

    private void txtmanualIndntNoMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanualIndntNoMasterActionPerformed
        // TODO add your handling code here:
        listManualIndentMaster.clear();
        objSearch.setManualIndentNo(txtmanualIndntNoMaster.getText().trim());
        objSearch.setStatusId(Status.admissionRequest);
        listManualIndentMaster = ctlOutreachPathInventory.selecttManualIndentMaster(
                objSearch);
        // where status is requested 
        if (listManualIndentMaster.isEmpty()) {
            return;
        } else {
            StoreWiseItems objMaster = listManualIndentMaster.get(0);
            txtIndentDateMaster.setText(objMaster.getCrtdDate());
            indentId = objMaster.getIndentId();
            selectRerquestItems(indentId);
        }
        txtItemName.requestFocus();
    }//GEN-LAST:event_txtmanualIndntNoMasterActionPerformed

    private void txtIndentDateMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndentDateMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndentDateMasterActionPerformed

    private void txtSrchManulaIndentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrchManulaIndentNoActionPerformed
        // TODO add your handling code here:
        searchManualIndentMaster();
    }//GEN-LAST:event_txtSrchManulaIndentNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRecieved;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkDate;
    private javax.swing.JCheckBox chkMove;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JTextField lblStoreName;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tbRequestedItem;
    private javax.swing.JTable tblIndentDetail;
    private javax.swing.JTable tblIndentRequest;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtIndentDateMaster;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtManualIndentNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearchItem;
    private javax.swing.JTextField txtSrchManulaIndentNo;
    private javax.swing.JTextField txtStore;
    private javax.swing.JTextField txtStoreSrch;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    private javax.swing.JTextField txtmanualIndntNoMaster;
    // End of variables declaration//GEN-END:variables

    private void saveIndentDetail() {

        if (txtQty.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter the quantity.");
            txtQty.requestFocus();
            return;
        }

        try {
            Integer.parseInt(txtQty.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Quantity.");
            txtQty.requestFocus();
            return;
        }

        objStoreWiseItems.setIndentId(indentId);
        objStoreWiseItems.setItemId(itemId);
        objStoreWiseItems.setQty(Integer.parseInt(txtQty.getText().trim()));

        if (ctlOutreachPathInventory.insertManualIndentDetail(objStoreWiseItems)) {
            selectRerquestItems(indentId);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to add item. \n"
                    + "Kindly contact Administrator.");
        }
        txtItemName.setText("");
        txtQty.setText("");
        txtItemName.requestFocus();
    }

    private void selectRerquestItems(String indentId) {
        listRequest = ctlOutreachPathInventory.selecttManualIndentDetail(
                indentId);
        if (listRequest.isEmpty()) {
            List<StoreWiseItems> listRequest = new ArrayList();
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
        } else {
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
            ListSelectionModel selectionModel = tbRequestedItem.getSelectionModel();
            tbRequestedItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setRerquestItemsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tbRequestedItem);
        }
    }

    private void setRerquestItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tbRequestedItem.getColumnCount(); i++) {
            column = tbRequestedItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            }
        }
    }

    private void searchManualIndentMaster() {
        listManualIndentMaster.clear();
        listManualIndentDetail.clear();
        if (txtSrchManulaIndentNo.getText().trim().length() != 0) {
            manualIndentNo = txtSrchManulaIndentNo.getText().trim();
        } else {
            manualIndentNo = "";
        }
        if (txtStoreSrch.getText().trim().length() == 0) {
            searchStoreId = 0;
        } 
        if (txtSearchItem.getText().trim().length() == 0) {
            searchItemId = 0;
        }
        if (chkDate.isSelected()) {
            fromDate = "";
            toDate = "";
        }
        objSearch.setStatusId(Status.receiveBill);
        objSearch.setItemId(searchItemId);
        objSearch.setStoreId(searchStoreId);
        objSearch.setManualIndentNo(txtSrchManulaIndentNo.getText().trim());
        listManualIndentMaster = ctlOutreachPathInventory.selecttManualIndentMaster(objSearch);
        if (listManualIndentMaster.isEmpty()) {
            List<StoreWiseItems> listManualIndentMaster = new ArrayList();
            tblIndentRequest.setModel(new ManualIndentMasterTableModel(listManualIndentMaster));
            tblIndentDetail.setModel(new ManualIndentDetailTableModel(listManualIndentDetail));
        } else {
            tblIndentRequest.setModel(new ManualIndentMasterTableModel(listManualIndentMaster));
            ListSelectionModel selectionModel = tblIndentRequest.getSelectionModel();
            tblIndentRequest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setMasterColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblIndentRequest);
            StoreWiseItems obj = listManualIndentMaster.get(0);
            listManualIndentDetail = ctlOutreachPathInventory.selecttManualIndentDetail(
                    obj.getIndentId());
            searchIndentDetail();
        }
    }

    private void setMasterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblIndentRequest.getColumnCount(); i++) {
            column = tblIndentRequest.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(130);
            } else if (i == 3) {
                column.setPreferredWidth(110);
            }
        }
    }

    private void setDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblIndentDetail.getColumnCount(); i++) {
            column = tblIndentDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(300);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void searchIndentDetail() {
        if (listManualIndentDetail.isEmpty()) {
            List<StoreWiseItems> listManualIndentDetail = new ArrayList();
            tblIndentDetail.setModel(new ManualIndentDetailTableModel(listManualIndentDetail));
        } else {
            tblIndentDetail.setModel(new ManualIndentDetailTableModel(listManualIndentDetail));
            tblIndentDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            ListSelectionModel selectionModel = tblIndentDetail.getSelectionModel();
            setDetailColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblIndentDetail);
        }
    }

    private void setDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtFromDate.setDate(date2);
            txtToDate.setDate(date2);
            fromDate = dateFormat.format(date2);
            toDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void saveIndentMaster() {
        objStoreWiseItems.setIndentId(indentId);
        objStoreWiseItems.setManualIndentNo(txtManualIndentNo.getText().trim());
        objStoreWiseItems.setStatusId(Status.admissionRequest);
        objStoreWiseItems.setStoreId(Integer.parseInt(Constants.storeId));
        objStoreWiseItems.setRequestedUserId(Constants.userId);

        if (chkMove.isSelected()) {
            objStoreWiseItems.setMoveStoreId(storeId);
        } else {
            objStoreWiseItems.setMoveStoreId(Integer.parseInt(
                    Stores.pathologyManualStore));
        }

        if (chkMove.isSelected() && storeId == 0) {
            JOptionPane.showMessageDialog(null, "Kindly select the From Store.");
            txtStore.requestFocus();
            return;
        }

        if (ctlOutreachPathInventory.insertManualIndentMaster(objStoreWiseItems)) {
            JOptionPane.showMessageDialog(null, "Indent save successfully.\n"
                    + "Kindly add item(s) to indent.");
            objSearch.setIndentId(indentId);
            objSearch.setStatusId(Status.admissionRequest);
            listManualIndentMaster = ctlOutreachPathInventory.selecttManualIndentMaster(
                    objSearch);
            if (listManualIndentMaster.isEmpty()) {
                return;
            } else {
                objStoreWiseItems = listManualIndentMaster.get(0);
                txtmanualIndntNoMaster.setText(objStoreWiseItems.getManualIndentNo());
                txtIndentDateMaster.setText(objStoreWiseItems.getCrtdDate());
                indentId = objStoreWiseItems.getIndentId();
                manualIndentNo = objStoreWiseItems.getManualIndentNo();
                txtmanualIndntNoMaster.setEditable(false);
                txtIndentDateMaster.setEditable(false);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Unable to save indent.");
        }
    }
}
