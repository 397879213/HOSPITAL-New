package Form.Inventory;

import Inventory.Controller.POFInventoryPurchaseController;
import Inventory.BO.Item;
import Inventory.TableModel.FolicInvTableModel;
import Inventory.TableModel.ItemInvTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class POFInventoryPurchase extends javax.swing.JInternalFrame {

    private DisplayLOV lov = new DisplayLOV();
    private String itemId = "";
    private String folicId = "";
    private String folicSearchId = "";
    private String itemNames = "";
    private String id = "";

    List<Item> listUpdate = new ArrayList();

    public POFInventoryPurchase() {

        initComponents();
        this.setSize(Constants.xSize, Constants.ySize - 100);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnFolicUpdate.setMnemonic(KeyEvent.VK_F);
        btnUpdateStock.setMnemonic(KeyEvent.VK_U);
        btnClear.setMnemonic(KeyEvent.VK_C);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUpdateStock = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtItemNameSearch = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtItemIdSearch = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cboStatusSearch = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtFolicNameSearch = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFolicIdSearch = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cboFolicStatus = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtFolicMap = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFolicIdMap = new javax.swing.JTextField();
        btnFolicUpdate = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblItemsSearch = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblFolicSearch = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Update Item Stock");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1075, 730));
        setRequestFocusEnabled(false);

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUpdateStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdateStock.setText("Update Stock");
        btnUpdateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateStock, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear))
                    .addComponent(btnUpdateStock))
                .addGap(10, 10, 10))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Item Name : ");

        txtItemNameSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItemNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameSearchActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Item Id : ");

        txtItemIdSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItemIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdSearchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Status : ");

        cboStatusSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VERIFIED", "UNVERIFIED"}));
        cboStatusSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtItemNameSearch)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtItemIdSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboStatusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboStatusSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Folic", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Folic Name : ");

        txtFolicNameSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFolicNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolicNameSearchActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Foloic Id : ");

        txtFolicIdSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFolicIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolicIdSearchActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Active : ");

        cboFolicStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "Y"}));
        cboFolicStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFolicStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtFolicIdSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFolicStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFolicNameSearch))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFolicNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFolicIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboFolicStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Folic Name : ");

        txtFolicMap.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFolicMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolicMapActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Folic Id : ");

        txtFolicIdMap.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFolicIdMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolicIdMapActionPerformed(evt);
            }
        });

        btnFolicUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFolicUpdate.setText("Update");
        btnFolicUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolicUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolicMap, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolicIdMap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFolicUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFolicMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFolicIdMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFolicUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblItemsSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblItemsSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No","Item ID","Item Name","Category","Purchase Price","Sale Price","Active"}
        ));
        tblItemsSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemsSearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblItemsSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemsSearchMouseReleased(evt);
            }
        });
        tblItemsSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblItemsSearchKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblItemsSearch);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblFolicSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblFolicSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No","Item ID","Item Name","Category","Purchase Price","Sale Price","Active"}
        ));
        tblFolicSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFolicSearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblFolicSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblFolicSearchMouseReleased(evt);
            }
        });
        tblFolicSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblFolicSearchKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblFolicSearch);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameSearchActionPerformed
     
        selectItemSearch(txtItemNameSearch.getText().toUpperCase().trim(), itemNo, "");
    }//GEN-LAST:event_txtItemNameSearchActionPerformed


    private void txtItemIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdSearchActionPerformed

        if (txtItemIdSearch.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter Item code, prior to "
                    + "search the item.");
            return;
        }
        selectItemSearch(txtItemNameSearch.getText().toUpperCase().trim(),
                txtItemIdSearch.getText(), "");


    }//GEN-LAST:event_txtItemIdSearchActionPerformed

    private void txtFolicNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolicNameSearchActionPerformed
        // TODO add your handling code here:

        String query
                = " SELECT ITM_FOLIO ID,ITM_NOMEN1 DESCRIPTION       \n"
                + " FROM                        \n"
                + Database.Inventory.folicItem + "      \n"
                + " WHERE UPPER(ITM_NOMEN1) LIKE '%" + txtFolicNameSearch.getText().toUpperCase().trim() + "%' \n"
                + " AND ITM_PRO = 'Y'            \n"
                + " ORDER BY ID                 \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        folicSearchId = Constants.lovID;
        txtFolicNameSearch.setText(Constants.lovDescription);
        //txtFolicIdMap.setText(folicId);
//        if(folicId == "0"){
//            txtFolicIdMap.setEditable(true);
//        }
//        else{
//            txtFolicIdMap.setEditable(false);
//         }

        selectFolic(folicSearchId, "", "");


    }//GEN-LAST:event_txtFolicNameSearchActionPerformed

    private void txtFolicIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolicIdSearchActionPerformed
        // TODO add your handling code here:

        selectFolic("", txtFolicIdSearch.getText(), "");

    }//GEN-LAST:event_txtFolicIdSearchActionPerformed

    private void tblItemsSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemsSearchMouseClicked

    private void tblItemsSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsSearchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemsSearchMousePressed

    private void tblItemsSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsSearchMouseReleased

        if (tblItemsSearch.getSelectedRow() < 0 || listItem.isEmpty()) {
            return;
        }

        itm = listItem.get(tblItemsSearch.getSelectedRow());

        refItemId = itm.getRefItemId();
        id = itm.getId();
        System.out.println(refItemId);
        System.out.println(id);
        mapData(refItemId);


    }//GEN-LAST:event_tblItemsSearchMouseReleased

    private void tblItemsSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemsSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemsSearchKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();


    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtFolicMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolicMapActionPerformed

        String query
                = " SELECT ITM_FOLIO ID,ITM_NOMEN1 DESCRIPTION       \n"
                + " FROM                        \n"
                + Database.Inventory.folicItem + "      \n"
                + " WHERE UPPER(ITM_NOMEN1) LIKE '%"
                + txtFolicMap.getText().toUpperCase().trim() + "%' \n"
                + " AND ITM_FOLIO NOT IN (SELECT REF_ITEM_ID FROM "
                + Database.DCMS.item + "\n"
                + " WHERE REF_ITEM_ID != 0)              \n"
                + " AND ITM_PRO = 'Y'            \n"
                + " ORDER BY ID                 \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        folicId = Constants.lovID;
        txtFolicMap.setText(Constants.lovDescription);
        txtFolicIdMap.setText(folicId);

//        if(folicId == "0"){
//            txtFolicIdMap.setEditable(true);
//        }
//        else{
//            txtFolicIdMap.setEditable(false);
//         }

    }//GEN-LAST:event_txtFolicMapActionPerformed

    private void txtFolicIdMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolicIdMapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolicIdMapActionPerformed

    private void btnFolicUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolicUpdateActionPerformed
        // TODO add your handling code here:

        updatefolic.setId(id);
        updatefolic.setRefItemId(txtFolicIdMap.getText());

        if (ctlItem.updateData(updatefolic)) {
            JOptionPane.showMessageDialog(null, "Patient Data Successfully Updated");
            selectItemSearch(txtItemNameSearch.getText().toUpperCase().trim(),
                    itemNo, "");
            txtFolicMap.setText("");
            txtFolicIdMap.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update Data");

        }

    }//GEN-LAST:event_btnFolicUpdateActionPerformed

    private void cboStatusSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStatusSearchActionPerformed
        // TODO add your handling code here:

        if (cboStatusSearch.getSelectedIndex() == 0) {
            txtItemNameSearch.setText("");
            txtItemIdSearch.setText("");
            selectItemSearch("", "", "Y");
        }
        if (cboStatusSearch.getSelectedIndex() == 1) {
            txtItemNameSearch.setText("");
            txtItemIdSearch.setText("");
            selectItemSearch("", "", "N");
        }


    }//GEN-LAST:event_cboStatusSearchActionPerformed

    private void tblFolicSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFolicSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblFolicSearchKeyReleased

    private void tblFolicSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFolicSearchMouseReleased

    }//GEN-LAST:event_tblFolicSearchMouseReleased

    private void tblFolicSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFolicSearchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblFolicSearchMousePressed

    private void tblFolicSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFolicSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblFolicSearchMouseClicked

    private void cboFolicStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFolicStatusActionPerformed
        // TODO add your handling code here:

        if (cboFolicStatus.getSelectedIndex() == 0) {
            selectFolic("", "", "N");
        }
        if (cboFolicStatus.getSelectedIndex() == 1) {
            selectFolic("", "", "Y");
        }


    }//GEN-LAST:event_cboFolicStatusActionPerformed

    private void btnUpdateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStockActionPerformed
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(null, "You are going to Update the"
                + " Stock.\n" + "Do you want to Update the Stock.");
        if (conf != 0) {
            return;
        }
        updateQuantityProcess();
    }//GEN-LAST:event_btnUpdateStockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFolicUpdate;
    private javax.swing.JButton btnUpdateStock;
    private javax.swing.JComboBox<String> cboFolicStatus;
    private javax.swing.JComboBox<String> cboStatusSearch;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblFolicSearch;
    private javax.swing.JTable tblItemsSearch;
    private javax.swing.JTextField txtFolicIdMap;
    private javax.swing.JTextField txtFolicIdSearch;
    private javax.swing.JTextField txtFolicMap;
    private javax.swing.JTextField txtFolicNameSearch;
    private javax.swing.JTextField txtItemIdSearch;
    private javax.swing.JTextField txtItemNameSearch;
    // End of variables declaration//GEN-END:variables
private String itemName = "";
    private String itemNo = "";
    private String refItemId = "";
    POFInventoryPurchaseController ctlItem = new POFInventoryPurchaseController();
    List<Item> listItem = new ArrayList<>();
    List<Item> listFolicItem = new ArrayList<>();
    Item itm = new Item();
    Item updatefolic = new Item();
    private String Id = "";

    private void selectItemSearch(String itemDesc, String itmNo, String veri) {

        listItem = ctlItem.selectItemSearch(itemDesc, itmNo, veri);

        if (listItem.isEmpty()) {
            List list = new ArrayList();
            Item usr = new Item();
            list.add(usr);
            tblItemsSearch.setModel(new ItemInvTableModel(list));
        } else {
            tblItemsSearch.setModel(new ItemInvTableModel(listItem));
        }
        tblItemsSearch.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblItemsSearch.getSelectionModel();
        tblItemsSearch.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsCwUModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblItemsSearch);

    }

    public void setColumnsWidthsCwUModel() {
        TableColumn column = null;
        for (int i = 0; i < tblItemsSearch.getColumnCount(); i++) {
            column = tblItemsSearch.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(70);
            }
        }
    }

    private void mapData(String refItemId) {

        Item itm = ctlItem.selectPOFItemSearch(refItemId);

        if (itm == null) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Folic Name & ID");
            txtFolicMap.setText("");
            txtFolicIdMap.setText("");
            txtFolicMap.requestFocus();
            return;
        }
        txtFolicMap.setText(itm.getFolicItemDesc());
        txtFolicIdMap.setText(itm.getRefItemId());

    }

    private void clear() {

        txtItemNameSearch.setText("");
        txtItemIdSearch.setText("");
        txtFolicMap.setText("");
        txtFolicIdMap.setText("");

        listItem.clear();

        tblItemsSearch.setModel(new ItemInvTableModel(listItem));
    }

    private void selectFolic(String folicSearchId, String folicItemNo, String sts) {

        listFolicItem = ctlItem.selectFolicSearch(folicSearchId, folicItemNo, sts);

        if (listFolicItem.isEmpty()) {
            List list = new ArrayList();
            Item usr = new Item();
            list.add(usr);
            tblFolicSearch.setModel(new FolicInvTableModel(list));
        } else {
            tblFolicSearch.setModel(new FolicInvTableModel(listFolicItem));
        }

        tblFolicSearch.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblFolicSearch.getSelectionModel();
        tblFolicSearch.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsCwUModel1();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblFolicSearch);

    }

    public void setColumnsWidthsCwUModel1() {
        TableColumn column = null;
        for (int i = 0; i < tblFolicSearch.getColumnCount(); i++) {
            column = tblFolicSearch.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(250);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void updateQuantityProcess() {
        if (ctlItem.updateQuantityProcess()) {
            String str = "";
            listUpdate = ctlItem.selectPOFItemUpdateHistory();
            for (int i = 0; i < listUpdate.size(); i++) {
                Item itm = listUpdate.get(i);

                str = str + itm.getId() + " " + itm.getDescription()
                        + " with Quantity: " + itm.getQuantity() + "\n";
            }

            JOptionPane.showMessageDialog(null, "You have Updated the Following"
                    + " Item's Quantity: \n" + str);
            if (ctlItem.updatePOFItemUpdateHistory(listUpdate)) {
                System.out.println("Done!");
            } else {
                System.err.println("Not Done!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update");
        }
    }

}
