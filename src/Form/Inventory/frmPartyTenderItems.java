package Form.Inventory;

import BO.Inventory.PartyTenderItems;
import Inventory.Controller.PartyTenderItemsController;
import Form.general.*;
import TableModel.Inventory.PartyWiseItemTableModel;
import TableModel.Inventory.TenderWisePartyTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class frmPartyTenderItems extends javax.swing.JInternalFrame {

    private String tenderId = "";
    private String partyId = "";
    private String itemId = "";
    private String manufacturerId = "";

    public frmPartyTenderItems() {

        initComponents();
        this.setSize(Constants.xSize + 80, Constants.ySize - Constants.yExtension + 8);

    }

    PartyTenderItemsController ctlPartyTenderItems = new PartyTenderItemsController();
    private DisplayLOV lov = new DisplayLOV();
    List<PartyTenderItems> listParties = new ArrayList();
    List<PartyTenderItems> listPartyWiseItems = new ArrayList();
    List<PartyTenderItems> listItems = new ArrayList();
    PartyTenderItems objPartyTenderItems = new PartyTenderItems();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtParty = new javax.swing.JTextField();
        btnSearchTendeParty = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblParty = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtAddParty = new javax.swing.JTextField();
        btnAddVendor = new javax.swing.JButton();
        btnDltVendor = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTenderItem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSearchItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDisplayVendor = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 710));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Party tender Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Tender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tender Name : ");

        txtTender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Vendor  Name : ");

        txtParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartyActionPerformed(evt);
            }
        });

        btnSearchTendeParty.setText("Search");
        btnSearchTendeParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTendePartyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtParty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchTendeParty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtTender))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchTendeParty)))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendor (s)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        tblParty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblParty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No","PO No.","Manufacture","Status","Approve Date","Approve By"}
        ));
        tblParty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPartyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPartyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPartyMouseReleased(evt);
            }
        });
        tblParty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPartyKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblParty);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Vendor  Name : ");

        txtAddParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddPartyActionPerformed(evt);
            }
        });

        btnAddVendor.setText("Add");
        btnAddVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVendorActionPerformed(evt);
            }
        });

        btnDltVendor.setText("Delete ");
        btnDltVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltVendorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddParty, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddVendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDltVendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVendor)
                    .addComponent(btnDltVendor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attach New Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Item Name : ");

        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tender  Item : ");

        txtTenderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenderItemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Price : ");

        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Manufacturer : ");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItem))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenderItem))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtManufacturer)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTenderItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAddItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Delete ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Final Tender");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(btnDelete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAddItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnAddItem)
                    .addComponent(btnDelete)
                    .addComponent(jButton7))
                .addGap(8, 8, 8))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Search Item : ");

        txtSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchItemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Vendor  Name : ");

        txtDisplayVendor.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(txtDisplayVendor))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDisplayVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tblItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No","PO No.","Manufacture","Status","Approve Date","Approve By"}
        ));
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemMouseReleased(evt);
            }
        });
        tblItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblItemKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblItem);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Tender Items");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Vendor Items");

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 0, 0));
        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton10))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenderActionPerformed
        // TODO add your handling code here:
        String query
                = "  SELECT ID , DESCRIPTION                                 \n"
                + "FROM                                                      \n"
                + Database.Inventory.tenderMaster + "                                    \n"
                + "WHERE UPPER(DESCRIPTION) LIKE '%" + txtTender.getText().toUpperCase().trim() + "%' \n"
                + "AND ACTIVE = 'Y'                                          \n"
                + "ORDER BY ID                                               \n";

        lov.LOVSelection(query, this);
        partyId="";
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        tenderId = Constants.lovID;
        txtTender.setText(Constants.lovDescription);
        setTenderWiseParty();
    }//GEN-LAST:event_txtTenderActionPerformed

    private void tblPartyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartyMouseClicked

    private void tblPartyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartyMousePressed

    private void tblPartyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartyMouseReleased
        listPartyWiseItems.clear();
        PartyTenderItems objParty = listParties.get(tblParty.getSelectedRow());
        partyId = objParty.getPartyId();
        listPartyWiseItems = ctlPartyTenderItems.selectPartyWiseItems(tenderId, 
                partyId, "");
        txtDisplayVendor.setText(objParty.getPartyName());
        setDataPartyWiseItems();
        btnAddItem.setEnabled(true);
    }//GEN-LAST:event_tblPartyMouseReleased

    private void tblPartyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPartyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPartyKeyReleased

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemMouseClicked

    private void tblItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemMousePressed

    private void tblItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseReleased
        // TODO add your handling code here:
        PartyTenderItems objItem = listPartyWiseItems.get(tblItem.getSelectedRow());
        itemId = objItem.getItemId();
        manufacturerId = objItem.getManufacturerId();
        txtItem.setText(objItem.getItemDesc());
        txtPrice.setText(objItem.getPrice());
        txtManufacturer.setText(objItem.getManufacturerDesc());
        txtTenderItem.setText(objItem.getTenderItemId());
        btnAddItem.setEnabled(false);
    }//GEN-LAST:event_tblItemMouseReleased

    private void tblItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemKeyReleased

    private void txtPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartyActionPerformed
        // TODO add your handling code here:
        String query
                = " SELECT PRT.ID, PRT.DESCRIPTION                          \n"
                + "FROM                                                     \n"
                + Database.Inventory.party + " PRT,                         \n"
                + Database.Inventory.tenderWiseParties + " TWP              \n"
                + "WHERE UPPER(PRT.DESCRIPTION) LIKE '%"
                + txtParty.getText().toUpperCase().trim() + "%'               \n"
                + " AND TWP.TENDER_ID = '" + tenderId + "'                    \n"
                + " AND PRT.ID = TWP.PARTY_ID                               \n"
                + "AND PRT.ACTIVE = 'Y'                                     \n"
                + "ORDER BY PRT.ID                                          \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        partyId = Constants.lovID;
        txtParty.setText(Constants.lovDescription);
        setTenderWiseParty();
    }//GEN-LAST:event_txtPartyActionPerformed

    private void txtAddPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddPartyActionPerformed
        // TODO add your handling code here:
        String query
                = " SELECT PRT.ID, PRT.DESCRIPTION                          \n"
                + "FROM                                                     \n"
                + Database.Inventory.party + " PRT                          \n"
                + "WHERE UPPER(PRT.DESCRIPTION) LIKE '%"
                + txtAddParty.getText().toUpperCase().trim() + "%'          \n"
                +" AND PRT.ID NOT IN ( SELECT PARTY_ID FROM "
                + Database.Inventory.tenderWiseParties 
                + " WHERE TENDER_ID = "+ tenderId +") \n"
                + "AND PRT.ACTIVE = 'Y'                                     \n"
                + "ORDER BY PRT.ID                                          \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        partyId = Constants.lovID;
        txtAddParty.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtAddPartyActionPerformed

    private void txtSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchItemActionPerformed
        // TODO add your handling code here:
        String query = "SELECT  ID, ITM.DESCRIPTION   FROM                  \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE ID IN ( SELECT ITEM_ID FROM "
                + Database.Inventory.tenderWisePartyItems + "               \n"
                + "WHERE TENDER_ID = " + tenderId 
                + " AND PARTY_ID = " + partyId + ")                         \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtSearchItem.getText().toUpperCase().trim() + "%'              \n"
                + " AND ACTIVE = 'Y'                                        \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";
        lov.LOVSelection(query, this);
        itemId = Constants.lovID;
        txtSearchItem.setText(Constants.lovDescription);
        listPartyWiseItems = ctlPartyTenderItems.selectPartyWiseItems(tenderId, 
                partyId, itemId);
        setDataPartyWiseItems();
        
    }//GEN-LAST:event_txtSearchItemActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.manufacturer, 
                txtManufacturer.getText().trim(), this);
        
        manufacturerId = Constants.lovID;
        txtManufacturer.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Delete the Item.");
        if (confirmation != 0) {
            return;
        }
        objPartyTenderItems.setTenderId(tenderId);
        objPartyTenderItems.setPartyId(partyId);
        objPartyTenderItems.setItemId(itemId);
        if(ctlPartyTenderItems.deletePartyItem(objPartyTenderItems)){
            JOptionPane.showMessageDialog(null, "Item Deleted Successfully!");
            clearDlt();
            setTenderWiseParty();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to Delete Item.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        // TODO add your handling code here:
        String query = "SELECT  ID, ITM.DESCRIPTION   FROM                  \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE ID NOT IN ( SELECT ITEM_ID FROM "
                + Database.Inventory.tenderWisePartyItems + "               \n"
                + "WHERE TENDER_ID = " + tenderId 
                + " AND PARTY_ID = " + partyId + ")                         \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtItem.getText().toUpperCase().trim() + "%'              \n"
                + " AND ACTIVE = 'Y'                                        \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";
        lov.LOVSelection(query, this);
        itemId = Constants.lovID;
        txtItem.setText(Constants.lovDescription);
        txtPrice.requestFocus();
    }//GEN-LAST:event_txtItemActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        objPartyTenderItems.setTenderId(tenderId);
        objPartyTenderItems.setPartyId(partyId);
        objPartyTenderItems.setItemId(itemId);
        objPartyTenderItems.setManufacturerId(manufacturerId);
        objPartyTenderItems.setPrice(txtPrice.getText().trim());
        objPartyTenderItems.setTenderItemId(txtTenderItem.getText().trim());
        if(ctlPartyTenderItems.updatePartyWiseItem(objPartyTenderItems)){
            JOptionPane.showMessageDialog(null, "Item Updated Successfully!");
            clearDlt();
            setTenderWiseParty();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to Update Item.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        if (txtTenderItem.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "Please Write Item Tender Number.");
            txtTenderItem.requestFocus();
            return;
        }
        if (txtPrice.getText().length()== 0) {
            JOptionPane.showMessageDialog(null, "Please enter Price.");
            txtPrice.requestFocus();
            return;
        }
        if (manufacturerId.length()== 0) {
            JOptionPane.showMessageDialog(null, "Please Select the Manufacturer.");
            txtManufacturer.requestFocus();
            return;
        }
        listItems = ctlPartyTenderItems.selectFromItems(itemId);
        PartyTenderItems obj = listItems.get(0);
        objPartyTenderItems.setTenderId(tenderId);
        objPartyTenderItems.setPartyId(partyId);
        objPartyTenderItems.setItemId(itemId);
        objPartyTenderItems.setManufacturerId(manufacturerId);
        objPartyTenderItems.setTenderItemId(txtTenderItem.getText().trim());
        objPartyTenderItems.setPrice(txtPrice.getText().trim());
        System.err.println("" + obj.getUnit() + " , "+obj.getPackSize());
        objPartyTenderItems.setUnit(obj.getUnit());
        objPartyTenderItems.setPackSize(obj.getPackSize());
        if(ctlPartyTenderItems.addPartyItem(objPartyTenderItems)){
            JOptionPane.showMessageDialog(null, "Item Add Successfully!");
            clearDlt();
            setTenderWiseParty();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to Add Item.");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnAddVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVendorActionPerformed
        // TODO add your handling code here:
        objPartyTenderItems.setTenderId(tenderId);
        objPartyTenderItems.setPartyId(partyId);
        if(ctlPartyTenderItems.addPartyInTender(objPartyTenderItems)){
            JOptionPane.showMessageDialog(null, "Party Added Successfully!");
            clearDlt();
            setTenderWiseParty();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to Add Party.");
        }
    }//GEN-LAST:event_btnAddVendorActionPerformed

    private void btnDltVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltVendorActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Delete the Party.");
        if (confirmation != 0) {
            return;
        }
        objPartyTenderItems.setTenderId(tenderId);
        objPartyTenderItems.setPartyId(partyId);
        if(ctlPartyTenderItems.deleteTenderParty(objPartyTenderItems)){
            JOptionPane.showMessageDialog(null, "Party Deleted Successfully!");
            clearDlt();
            setTenderWiseParty();
        }else{
            JOptionPane.showMessageDialog(null, "Unable to Delete Party.");
        }
    }//GEN-LAST:event_btnDltVendorActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
        txtTenderItem.requestFocus();
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtTenderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenderItemActionPerformed
        // TODO add your handling code here:
        txtManufacturer.requestFocus();
    }//GEN-LAST:event_txtTenderItemActionPerformed

    private void btnSearchTendePartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTendePartyActionPerformed
        // TODO add your handling code here:
        if(txtParty.getText().length() == 0){
            partyId = "";
        }
        setTenderWiseParty();
    }//GEN-LAST:event_btnSearchTendePartyActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddVendor;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDltVendor;
    private javax.swing.JButton btnSearchTendeParty;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblParty;
    private javax.swing.JTextField txtAddParty;
    private javax.swing.JTextField txtDisplayVendor;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtParty;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchItem;
    private javax.swing.JTextField txtTender;
    private javax.swing.JTextField txtTenderItem;
    // End of variables declaration//GEN-END:variables

    private void setTenderWiseParty() {

        listParties = ctlPartyTenderItems.selectTenderWiseParty(tenderId, partyId);
        tblParty.setModel(new TenderWisePartyTableModel(listParties));
        ListSelectionModel selectionModel = tblParty.getSelectionModel();
        tblParty.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setTenderWisePartyColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblParty);
    }

    private void setTenderWisePartyColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblParty.getColumnCount(); i++) {
            column = tblParty.getColumnModel().getColumn(i);
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

    private void setDataPartyWiseItems() {
        tblItem.setModel(new PartyWiseItemTableModel(listPartyWiseItems));
        ListSelectionModel selectionModel = tblItem.getSelectionModel();
        tblItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPartyWiseItemsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblItem);
    }

    private void setPartyWiseItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblItem.getColumnCount(); i++) {
            column = tblItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void clearDlt() {
        txtAddParty.setText("");
        txtItem.setText("");
        txtPrice.setText("");
        txtManufacturer.setText("");
        txtDisplayVendor.setText("");
        txtTenderItem.setText("");
        partyId = "";
        listPartyWiseItems.clear();
        tblItem.setModel(new PartyWiseItemTableModel(listPartyWiseItems));
    }
}
