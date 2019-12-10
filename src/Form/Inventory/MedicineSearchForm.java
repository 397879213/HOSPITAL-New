package Form.Inventory;

import Inventory.BO.Item;
import Inventory.Controller.MedicineSearchController;
import Inventory.TableModel.ItemDetailTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class MedicineSearchForm extends javax.swing.JInternalFrame {

    public MedicineSearchForm() {

        initComponents();
        this.setSize(Constants.xSize - 220, Constants.ySize - 120  );

    }

    MedicineSearchController ctlMedSrch = new MedicineSearchController();
    private DisplayLOV lov = new DisplayLOV();
    Item item = new Item();
    List<Item> listMedDetail = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMedType = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGeneric = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        chkFormulary = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblItemDetail = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Medicine Search");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 710));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Medicine Name :");

        txtItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Medicine Type : ");

        txtMedType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedTypeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Generic :");

        txtGeneric.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtGeneric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenericActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Formulary : ");

        chkFormulary.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkFormulary.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkFormulary.setForeground(new java.awt.Color(102, 0, 0));
        chkFormulary.setText("Formulary");
        chkFormulary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFormularyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtItem, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(txtGeneric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMedType)
                    .addComponent(chkFormulary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneric, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkFormulary))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        tblItemDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblItemDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr No","Item ID","Item Name","Store Name","Quantity","Price","Status"}
        ));
        tblItemDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemDetailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblItemDetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemDetailMouseReleased(evt);
            }
        });
        tblItemDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblItemDetailKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblItemDetail);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(200, 200, 200)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        // TODO add your handling code here:
        String query
                = " SELECT ID, DESCRIPTION  FROM               \n"
                + Database.DCMS.item + "                       \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%" 
                + txtItem.getText().toUpperCase().trim() + "%' \n"
                + " AND ACTIVE = 'Y'                           \n"
                + " ORDER BY ID                                \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            txtItem.setText("");
            item.setId("");
            return;
        }
        item.setId(Constants.lovID);
        txtItem.setText(Constants.lovDescription);
        selectMedicineInfo();
    }//GEN-LAST:event_txtItemActionPerformed

    private void txtMedTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedTypeActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.itemType, txtMedType.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            txtMedType.setText("");
            item.setItemTypeId("");
            return;
        }
        item.setItemTypeId(Constants.lovID);
        txtMedType.setText(Constants.lovDescription);
        selectMedicineInfo();
    }//GEN-LAST:event_txtMedTypeActionPerformed

    private void txtGenericActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenericActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.generic, txtGeneric.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            txtGeneric.setText("");
            item.setGenericId("");
            return;
        }
        item.setGenericId(Constants.lovID);
        txtGeneric.setText(Constants.lovDescription);
        selectMedicineInfo();
    }//GEN-LAST:event_txtGenericActionPerformed

    private void tblItemDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemDetailMouseClicked

    private void tblItemDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemDetailMousePressed

    private void tblItemDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemDetailMouseReleased

    }//GEN-LAST:event_tblItemDetailMouseReleased

    private void tblItemDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemDetailKeyReleased

    private void chkFormularyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFormularyActionPerformed
        // TODO add your handling code here:
        if(chkFormulary.isSelected()){
            item.setIsFormulary("Y");
        }else{
            item.setIsFormulary("N");
        }
        selectMedicineInfo();
    }//GEN-LAST:event_chkFormularyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox chkFormulary;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblItemDetail;
    private javax.swing.JTextField txtGeneric;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtMedType;
    // End of variables declaration//GEN-END:variables

    private void selectMedicineInfo() {
        if(txtItem.getText().trim().length() == 0){
            item.setId("");
        }
        if(txtMedType.getText().trim().length() == 0){
            item.setItemTypeId("");
        }
        if(txtGeneric.getText().trim().length() == 0){
            item.setGenericId("");
        }
        listMedDetail = ctlMedSrch.searchMedicineDetail(item);
        if (listMedDetail.isEmpty()) {
            List<Item> listMedDetail = new ArrayList();
            listMedDetail.add(new Item());
            tblItemDetail.setModel(new ItemDetailTableModel(listMedDetail));
            return;
        }
        tblItemDetail.setModel(new ItemDetailTableModel(listMedDetail));
        ListSelectionModel selectionMod = tblItemDetail.getSelectionModel();
        tblItemDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setMedicineInfoColumnsWidths();
        selectionMod.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblItemDetail);
    }

    private void setMedicineInfoColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblItemDetail.getColumnCount(); i++) {
            column = tblItemDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(0);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(30);
            } else if (i == 6) {
                column.setPreferredWidth(15);
            } else if (i == 7) {
                column.setPreferredWidth(60);
            }
        }
    }

}
