package Form.Client;
 
import BO.CPT.CPT;
import BO.Client.Client;
import Controller.Setup.CPTController;
import Controller.Setup.ClientController;
import TableModel.Client.ClientServicesSearchTable;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.Forms;

public class ClientServicesManagement extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtSearchCPTClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchCPT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSection = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEditDiscount = new javax.swing.JTextField();
        chkDiscountType = new javax.swing.JCheckBox();
        chkAllCPT = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClientCPTInformation = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnSearchClear = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

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
        setPreferredSize(new java.awt.Dimension(830, 660));

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
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Services Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Client Name:");

        txtSearchCPTClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCPTClientActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Service:");

        txtSearchCPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCPTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Department:");

        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Section:");

        txtSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSectionActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Contract Price:");

        txtEditDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditDiscountActionPerformed(evt);
            }
        });

        chkDiscountType.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkDiscountType.setText("%");
        chkDiscountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDiscountTypeActionPerformed(evt);
            }
        });

        chkAllCPT.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkAllCPT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkAllCPT.setForeground(new java.awt.Color(102, 0, 0));
        chkAllCPT.setText("Select All");
        chkAllCPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAllCPTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchCPTClient, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(txtSearchCPT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtEditDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDepartment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkAllCPT, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txtSection))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchCPTClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchCPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEditDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkDiscountType, 0, 0, Short.MAX_VALUE)
                        .addComponent(chkAllCPT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tableClientCPTInformation.setBackground(java.awt.SystemColor.activeCaption);
        tableClientCPTInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {null, null, null, null,null},

            new String [] {
                "CLIEN ID","TRANSACTION TYPE", "AMOUNT RECIEVED", "CHECK NO", "BANK NAME"
            }
        ));
        tableClientCPTInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableClientCPTInformationMouseReleased(evt);
            }
        });
        tableClientCPTInformation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableClientCPTInformationPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tableClientCPTInformation);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSearchClear.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnSearchClear.setText("Clear");
        btnSearchClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClearActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Search");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchClear)
                    .addComponent(btnEdit)
                    .addComponent(btnExit)
                    .addComponent(btnClear)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ClientServicesManagement() {

        initComponents();
        this.setSize(Constants.xSize - 180, Constants.ySize - 120);
        locationId = "";
        sectionId = "";
        departmentId = "";
        clientId = "";
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnEdit.setMnemonic(KeyEvent.VK_E);
        btnClear.setMnemonic(KeyEvent.VK_R);
    }


    private void tableClientCPTInformationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientCPTInformationMouseReleased

        if (tableClientCPTInformation.getSelectedRow() < 0) {
            return;
        }
        CPT cpt = (CPT) vecClientCPT.get(tableClientCPTInformation.getSelectedRow());
        vecCptTestSelected.add(cpt.cptId);

        clientId = cpt.clientId;
        cptId = cpt.cptId;
        // TODO add your handling code here:
}//GEN-LAST:event_tableClientCPTInformationMouseReleased

    private void tableClientCPTInformationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableClientCPTInformationPropertyChange
}//GEN-LAST:event_tableClientCPTInformationPropertyChange

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSearchCPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCPTActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCPTActionPerformed

    private void txtSearchCPTClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCPTClientActionPerformed

        lov.LOVGeneralSelection(Database.DCMS.client,
                txtSearchCPTClient.getText().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSearchCPTClient.setText("");
        } else {
            txtSearchCPTClient.setText(Constants.lovDescription.toUpperCase());
            clientId = Constants.lovID;
            txtSearchCPT.requestFocusInWindow();
            txtSearchCPT.setCaretPosition(0);
        }

    }//GEN-LAST:event_txtSearchCPTClientActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed

        lov.LOVDefinitionSelection(utilities.DefinitionTypes.department,
                txtDepartment.getText(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtDepartment.requestFocusInWindow();
            txtDepartment.setCaretPosition(0);
        } else {
            txtDepartment.setText(Constants.lovDescription.toUpperCase());
            departmentId = Constants.lovID;
            txtSection.requestFocusInWindow();
            txtSection.setCaretPosition(0);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        searchClientCPT();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSectionActionPerformed

        if (departmentId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Department");
            txtDepartment.requestFocusInWindow();
            txtDepartment.setCaretPosition(0);
            return;
        }
        String query = " SELECT SECTION_ID ID , SECTION_ID DESCRIPTION FROM "
                + Database.DCMS.section + "  \n"
                + " WHERE DEPARTMENT_ID = '" + departmentId + "'"
                + " AND SECTION_ID LIKE '%" + txtSection.getText().toUpperCase() + "%'";
        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            sectionId = "";
            txtSection.requestFocusInWindow();
            txtSection.setCaretPosition(0);
        } else {
            txtSection.setText(Constants.lovDescription.toUpperCase());
            sectionId = Constants.lovID;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSectionActionPerformed

    private void chkAllCPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAllCPTActionPerformed

        boolean status = false;
        if (chkAllCPT.isSelected()) {
            status = true;
        }
        checkUncheckAllCPT(status);
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAllCPTActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        CPT editInfo = new CPT();
        Vector selectedCPT = new Vector();
        for (int i = 0; i < tableClientCPTInformation.getRowCount(); i++) {
            if ((Boolean) tableClientCPTInformation.getValueAt(i, selectIndex)) {
                CPT cpt = (CPT) vecClientCPT.get(i);
                if (!chkDiscountType.isSelected()) {
                    cpt.clientPrice = tableClientCPTInformation.getValueAt(i, selectCostIndex).toString();
                    try {
                        cpt.clientPrice = "" + Float.parseFloat(txtEditDiscount.getText().trim());

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Kindly Enter Correct Service Price");
                        return;
                    }
                } else {

                    int price = Integer.parseInt(cpt.price);
                    cpt.clientPrice = "" + (price * discount);
                }
                selectedCPT.add(cpt);
            }
        }
        if (ctlCPT.updateClientCPT(selectedCPT, editInfo)) {
            JOptionPane.showMessageDialog(null, "Record Save Successfully");
            txtEditDiscount.setText("0");
            chkDiscountType.setSelected(false);
            chkAllCPT.setSelected(false);
            searchClientCPT();

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record "
                    + "Kindly Contact Administrator");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtEditDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditDiscountActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditDiscountActionPerformed

    private void chkDiscountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDiscountTypeActionPerformed

        try {
            discount = Float.parseFloat(txtEditDiscount.getText().trim());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Discount Value");
            return;
        }
        if (discount < 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Discount Value");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_chkDiscountTypeActionPerformed

    private void btnSearchClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClearActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSearchClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearchClear;
    private javax.swing.JCheckBox chkAllCPT;
    private javax.swing.JCheckBox chkDiscountType;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableClientCPTInformation;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEditDiscount;
    private javax.swing.JTextField txtSearchCPT;
    private javax.swing.JTextField txtSearchCPTClient;
    private javax.swing.JTextField txtSection;
    // End of variables declaration//GEN-END:variables

    public static Client client = new Client();
    ClientController ctlClient = new ClientController();
    Vector vecClient = new Vector();
    Vector vecCptTestSelected = new Vector();
    Vector vecClientCPT = new Vector();
    private String locationId = "";
    private String clientId = "";
    private String cptId = "";
    private float discount = 0;

    public String departmentId = "";
    public String sectionId = "";
    public CPTController ctlCPT = new CPTController();

    public void searchClientCPT() {

        if (clientId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Client");
            txtSearchCPTClient.requestFocus();
            return;
        }

        CPT cpt = new CPT();
        cpt.clientId = clientId;
        cpt.locationId = locationId;
        cpt.description = txtSearchCPT.getText().trim().toUpperCase();
        cpt.sectionId = sectionId;
        cpt.departmentId = departmentId;
        vecClientCPT = ctlCPT.getSearchClientCPT(cpt);

        if (vecClientCPT.isEmpty()) {
            CPT cptEmpty = new CPT();
            Vector vec = new Vector();
            vec.add(cptEmpty);
            tableClientCPTInformation.setModel(new ClientServicesSearchTable(vec));
        } else {
            tableClientCPTInformation.setModel(new ClientServicesSearchTable(vecClientCPT));
        }
        ListSelectionModel selectionModel = tableClientCPTInformation.getSelectionModel();
        tableClientCPTInformation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setSearchClientCPTTablesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tableClientCPTInformation);
    }

    public void setSearchClientCPTTablesColumnsWidths() {

        TableColumn column = null;
        for (int i = 0; i < tableClientCPTInformation.getColumnCount(); i++) {
            column = tableClientCPTInformation.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(400);
            } else {
                column.setPreferredWidth(40);
            }
        }
    }

    int selectIndex = 4;// 5 status
    int selectCostIndex = 3;// 5 status

    public void checkUncheckAllCPT(boolean status) {

        for (int i = 0; i < tableClientCPTInformation.getRowCount(); i++) {
            tableClientCPTInformation.setValueAt(new Boolean(status), i, selectIndex);
        }
    }

    String formId = Forms.clientRegistration + "_";
}
