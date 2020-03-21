package Form.Inventory;

import Inventory.BO.MedicineRequestBO;
import Inventory.Controller.MedicineWiseWardController;
import Inventory.TableModel.MedicineWiseWardTableModel;
import Inventory.TableModel.SearchMedicineWiseWardTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class MedicineRequestForm extends javax.swing.JInternalFrame {

    public MedicineRequestForm() {

        initComponents();
        this.setSize(Constants.xSize + 80, Constants.ySize - Constants.yExtension + 8);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtWardName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblWardwiseItem = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsearchWardId = new javax.swing.JTextField();
        txtsearchUserId = new javax.swing.JTextField();
        txtsearchItemId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSearchWardWiseItem = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"btnSearch Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(996, 710));

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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Ward Name : ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("User Name : ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Item Name : ");

        txtWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardNameActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(txtWardName)
                    .addComponent(txtItemName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N

        tblWardwiseItem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblWardwiseItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Receive No","Voucher No", "Store", "Invoice Date"
            }
        ));
        tblWardwiseItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWardwiseItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblWardwiseItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblWardwiseItemMouseReleased(evt);
            }
        });
        tblWardwiseItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblWardwiseItemKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblWardwiseItem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Criteria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Ward Name : ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("User Name : ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Item Name : ");

        txtsearchWardId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchWardIdActionPerformed(evt);
            }
        });

        txtsearchUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchUserIdActionPerformed(evt);
            }
        });

        txtsearchItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchItemIdActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsearchUserId)
                    .addComponent(txtsearchWardId)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtsearchItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsearchWardId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsearchUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsearchItemId)
                        .addComponent(btnSearch))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 13))); // NOI18N

        tblSearchWardWiseItem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblSearchWardWiseItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Receive No","Voucher No", "Store", "Invoice Date"
            }
        ));
        jScrollPane10.setViewportView(tblSearchWardWiseItem);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DisplayLOV lov = new DisplayLOV();
    MedicineWiseWardController ctlMW = new MedicineWiseWardController();
    private String wardId = "";
    private String searchWardId = "";
    private String userId = "";
    private String searchUserId = "";
    private String itemId = "";
    private String searchItemId = "";
    MedicineRequestBO medReq = new MedicineRequestBO();
    List<MedicineRequestBO> listWardMedicine = new ArrayList();
    List<MedicineRequestBO> listSearchWardItem = new ArrayList();
    private void tblWardwiseItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWardwiseItemMouseClicked
        if (tblWardwiseItem.getSelectedRow() < 0
                || listWardMedicine.isEmpty()) {
            return;
        }
        if (evt.getClickCount() % 2 == 0) {
            medReq = listWardMedicine.get(tblWardwiseItem.getSelectedRow());
            String medId = medReq.getItemId();
            medReq.setStatus("N");
            medReq.setActionUserId(Constants.userId);
            //m.setActionDate(Constants.);
            medReq.setActionTerminalId(Constants.terminalId);
            medReq.setWardId(wardId);
            medReq.setItemId(medId);
            medReq.setUserId(userId);
            if (ctlMW.UpdateMedicine(medReq)) {
                JOptionPane.showMessageDialog(null, "Update Record Successfully,"
                        + "");
                selectMedicine();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save Record,"
                        + "Kindly Contact Administrator");
            }
        }
    }//GEN-LAST:event_tblWardwiseItemMouseClicked

    private void tblWardwiseItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWardwiseItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblWardwiseItemMousePressed

    private void tblWardwiseItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWardwiseItemMouseReleased

    }//GEN-LAST:event_tblWardwiseItemMouseReleased

    private void tblWardwiseItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblWardwiseItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblWardwiseItemKeyReleased

    private void txtWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardNameActionPerformed
        String query = "SELECT ID,DESCRIPTION           \n"
                + " FROM " + Database.DCMS.ward + "WAR    \n"
                + "WHERE WAR.ACTIVE = 'Y'               \n"
                + "ORDER BY ID";

        lov.LOVSelection(query, this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            wardId = Constants.lovID;
            txtWardName.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtWardNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        String query = "SELECT USER_ID ID,NAME DESCRIPTION                        \n"
                + " FROM " + Database.DCMS.users + "USR               \n"
                //                + " WHERE USR.NAME LIKE "
                //                + "'%"+ txtUsername+ "%'+    \n"
                + " WHERE USR.ACTIVE = 'Y'                            \n"
                + " ORDER BY USR.NAME";

        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            userId = Constants.lovID;
            txtUsername.setText(Constants.lovDescription);
            selectMedicine();
        }
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        if (wardId.isEmpty() && userId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Ward And User Name");
            return;
        } else if (wardId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Ward ");
            return;
        } else if (userId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select User Name ");
            return;
        }

        String query = "SELECT ITM.ID,ITM.DESCRIPTION               \n"
                + " FROM " + Database.DCMS.item + " ITM             \n"
                + " WHERE ITM.ID                                    \n"
                + " NOT IN (SELECT MR.ITEM_ID FROM "
                + Database.DCMS.medicineRequest + " MR               \n"
                + " WHERE MR.WARD_ID = " + wardId + "               \n"
                + " AND MR.USER_ID = '" + userId + "'                     \n"
                + " AND MR.ACTIVE = 'Y')                            \n"
                + " AND ITM.ACTIVE = 'Y'"
                + " ORDER BY ITM.ID";

        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = Constants.lovID;
            txtItemName.setText(Constants.lovDescription);
            getWardWiseMedicine();
            selectMedicine();
        }
        txtItemName.setText("");
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtsearchWardIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchWardIdActionPerformed
        String query = "SELECT ID,DESCRIPTION                       \n"
                + " FROM " + Database.DCMS.ward + "WAR              \n"
                + "WHERE WAR.ACTIVE = 'Y'                           \n"
                + "AND WAR.ID IN                                    \n"
                + "(SELECT WARD_ID FROM " + Database.DCMS.medicineRequest + ")\n"
                + "ORDER BY ID";

        lov.LOVSelection(query, this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            searchWardId = Constants.lovID;
            txtsearchWardId.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtsearchWardIdActionPerformed

    private void txtsearchUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchUserIdActionPerformed
        String query = "SELECT USER_ID ID,NAME DESCRIPTION            \n"
                + " FROM " + Database.DCMS.users + "USR               \n"
                + " WHERE  USR.ACTIVE = 'Y'                            \n"
                + " AND USR.USER_NAME IN (SELECT USER_ID "
                + " FROM " + Database.DCMS.medicineRequest + " MF )       \n"
                + " ORDER BY USR.NAME";

        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            searchUserId = Constants.lovID;
            txtsearchUserId.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtsearchUserIdActionPerformed

    private void txtsearchItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchItemIdActionPerformed
        String query = "SELECT ITM.ID,UPPER(ITM.DESCRIPTION) DESCRIPTION \n"
                + " FROM " + Database.DCMS.item + " ITM                  \n"
                + " WHERE ITM.ID                                         \n"
                + " IN (SELECT MR.ITEM_ID "
                + " FROM " + Database.DCMS.medicineRequest + " MR        \n"
                + " WHERE  MR.ACTIVE = 'Y' )                             \n"
                + " AND ITM.ACTIVE = 'Y'                                 \n"
                + " ORDER BY ITM.ID";

        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            searchItemId = Constants.lovID;
            txtsearchItemId.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtsearchItemIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchWardWiseItem();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblSearchWardWiseItem;
    private javax.swing.JTable tblWardwiseItem;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWardName;
    private javax.swing.JTextField txtsearchItemId;
    private javax.swing.JTextField txtsearchUserId;
    private javax.swing.JTextField txtsearchWardId;
    // End of variables declaration//GEN-END:variables

    private void getWardWiseMedicine() {
        medReq.setItemId(itemId);
        medReq.setWardId(wardId);
        medReq.setUserId(userId);
        ctlMW.InsertWardWiseMedicine(medReq);
    }

    private void selectMedicine() {

        listWardMedicine = ctlMW.selectMedicineRequest(wardId, userId);

        if (listWardMedicine.isEmpty()) {
            List list = new ArrayList();
            list.add(new MedicineRequestBO());
            tblWardwiseItem.setModel(new MedicineWiseWardTableModel(list));

        } else {
            tblWardwiseItem.setModel(new MedicineWiseWardTableModel(listWardMedicine));
            return;
        }

        ListSelectionModel selectionModel = tblWardwiseItem.getSelectionModel();
        tblWardwiseItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsMedicineRequest();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblWardwiseItem);
    }

    private void setColumnsWidthsMedicineRequest() {
        TableColumn column = null;
        for (int i = 0; i < tblWardwiseItem.getColumnCount(); i++) {
            column = tblWardwiseItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            } else if (i == 2) {
                column.setPreferredWidth(70);
            } else if (i == 3) {
                column.setPreferredWidth(70);
            }
        }
    }

    private void searchWardWiseItem() {

        medReq.setWardId(searchWardId);
        medReq.setUserId(searchUserId);
        medReq.setItemId(searchItemId);
        
        if (medReq.getWardId().equalsIgnoreCase("")
        && medReq.getUserId().equalsIgnoreCase("")
        && medReq.getItemId().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Search Critera");
            return;
        }
     
        listSearchWardItem = ctlMW.selectSearchMedicineRequest(medReq);

        if (listSearchWardItem.isEmpty()) {
            List list = new ArrayList();
            list.add(new MedicineRequestBO());
            tblSearchWardWiseItem.setModel(new SearchMedicineWiseWardTableModel(list));
        } else {
            tblSearchWardWiseItem.setModel(new SearchMedicineWiseWardTableModel(listSearchWardItem));
            return;
        }
        ListSelectionModel selectionModel = tblSearchWardWiseItem.getSelectionModel();
        tblSearchWardWiseItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsSearchMedicine();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblSearchWardWiseItem);
    }

    private void setColumnsWidthsSearchMedicine() {
        TableColumn column = null;
        for (int i = 0; i < tblSearchWardWiseItem.getColumnCount(); i++) {
            column = tblSearchWardWiseItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            } else if (i == 2) {
                column.setPreferredWidth(70);
            } else if (i == 3) {
                column.setPreferredWidth(70);
            }
        }
    }
}
