package Form.Hospital;






import BO.Hospital.TraumaPerformVisitBO;
import Controller.Hospital.TraumaPerformVisitController;
import TableModel.Hospital.PatientsSearchTableModel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;

public class frmTraumaPerformVisit extends javax.swing.JInternalFrame {

    private DisplayLOV lov = new DisplayLOV();
    TraumaPerformVisitController performVisitClt = new TraumaPerformVisitController();
    TraumaPerformVisitBO performVisitmBo = new TraumaPerformVisitBO();

    List<TraumaPerformVisitBO> listPatientSearch = new ArrayList<>();
    List<TraumaPerformVisitBO> listItemPO = new ArrayList<>();

    private String fromDate = "";
    private String toDate = "";
    private String patientId = "";
    private String categoryId = "";
    private String complaintId = "";
   

    public frmTraumaPerformVisit() {
        initComponents();
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        setDate(0);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCategorySearch = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtComplainSearch = new javax.swing.JTextField();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblPatientSearch = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblVisitOrders = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecentNotes = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+""
            + "Trauma Perform Visit");
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(392, 392, 392))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("MR No. :");

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Category :");

        txtCategorySearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCategorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategorySearchActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Complain :");

        txtComplainSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComplainSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplainSearchActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategorySearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtComplainSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplainSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPatientSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPatientSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No","Consultancy ID","Patient ID","Patient Name","Visit Date","Status"}
        ));
        tblPatientSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientSearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPatientSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientSearchMouseReleased(evt);
            }
        });
        tblPatientSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientSearchKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblPatientSearch);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Visit Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblVisitOrders.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblVisitOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No","Test Name","Order Date","Order By","Status"}
        ));
        tblVisitOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVisitOrdersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVisitOrdersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblVisitOrdersMouseReleased(evt);
            }
        });
        tblVisitOrders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblVisitOrdersKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblVisitOrders);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Recent Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtRecentNotes.setColumns(20);
        txtRecentNotes.setRows(5);
        jScrollPane1.setViewportView(txtRecentNotes);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();

    }//GEN-LAST:event_btnClearActionPerformed

    private void tblPatientSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientSearchMouseClicked

    private void tblPatientSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientSearchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientSearchMousePressed

    private void tblPatientSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientSearchMouseReleased
//        if (!listItemSearch.isEmpty()) {
//            PurchaseOrderDetailBO obj = listItemSearch.get(tblPatientSearch.getSelectedRow());
//            selectPurchaseOrder(obj.getItemId(), partyId, fromDate, toDate);
//            fromDate = "";
//            toDate = "";
//            partyId = "";
//        }

    }//GEN-LAST:event_tblPatientSearchMouseReleased

    private void tblPatientSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientSearchKeyReleased

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

        categoryId = "";
        complaintId = "";
        patientId = txtPatientId.getText();
        selectPatient(patientId, categoryId, complaintId,fromDate,toDate);
       
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtCategorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategorySearchActionPerformed

        complaintId = "";
        lov.LOVDefinitionSelection(DefinitionTypes.ERCategory, txtCategorySearch.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        categoryId = Constants.lovID;
        txtCategorySearch.setText(Constants.lovDescription);
        selectPatient(patientId, categoryId, complaintId,fromDate,toDate);
       
        
    }//GEN-LAST:event_txtCategorySearchActionPerformed

    private void txtComplainSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplainSearchActionPerformed
       
        lov.LOVDefinitionSelection(DefinitionTypes.complaints, txtComplainSearch.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        complaintId = Constants.lovID;
        txtComplainSearch.setText(Constants.lovDescription);
        selectPatient(patientId, categoryId, complaintId,fromDate,toDate);
         categoryId = "";
         complaintId = "";
         

    }//GEN-LAST:event_txtComplainSearchActionPerformed

    private void tblVisitOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitOrdersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVisitOrdersMouseClicked

    private void tblVisitOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitOrdersMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVisitOrdersMousePressed

    private void tblVisitOrdersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitOrdersMouseReleased

        performVisitmBo = listItemPO.get(tblVisitOrders.getSelectedRow());

//        txtQuantity.setText(itemBo.getQuantity());
//        txtUnitPrice.setText(itemBo.getUnitPrice());
//        txtStoreName.setText(itemBo.getStoreName());
//        txtPrice.setText(itemBo.getPrice());
//        txtItemName.setText(itemBo.getItemName());
    }//GEN-LAST:event_tblVisitOrdersMouseReleased

    private void tblVisitOrdersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVisitOrdersKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVisitOrdersKeyReleased

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        
        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date DD-MON-YY",
                    "Trauma Perform Visit", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
      
         if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the DOB DD-MON-YY",
                    "Birth Certificate", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtToDate.getDate());
      //  PurchaseOrderDetailBO obj = listItemSearch.get(tblItemsSearch.getSelectedRow());
        selectPatient(patientId,categoryId,complaintId,fromDate,toDate);
    }//GEN-LAST:event_txtToDateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblPatientSearch;
    private javax.swing.JTable tblVisitOrders;
    private javax.swing.JTextField txtCategorySearch;
    private javax.swing.JTextField txtComplainSearch;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextArea txtRecentNotes;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    // End of variables declaration//GEN-END:variables

    private void selectPatient(String patientId, String categoryId,
            String complaintId,String fromDate, String toDate) {
        listPatientSearch = performVisitClt.selectPatientSearch(patientId,categoryId,complaintId,fromDate,toDate);

        if (!listPatientSearch.isEmpty()) {
            performVisitmBo = listPatientSearch.get(0);
        }

        if (listPatientSearch.isEmpty()) {
            listPatientSearch.clear();
            tblPatientSearch.setModel(new PatientsSearchTableModel(listPatientSearch));
            JOptionPane.showMessageDialog(null, " Search Patient is not Available ");

        } else {
            tblPatientSearch.setModel(new PatientsSearchTableModel(listPatientSearch));
        }
        ListSelectionModel selectionMod = tblPatientSearch.getSelectionModel();
        tblPatientSearch.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsPatientsInfo();
        selectionMod.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPatientSearch);

    }

    private void selectPurchaseOrder(String itemId,
            String partyId, String fromDate, String toDate) {
      //  listItemPO = itemClt.selectPurchaseOrderSearch(itemId, partyId, fromDate,
       //         toDate);


       // tblVisitOrders.setModel(new PurchaseOrderTableModel(listItemPO));
        ListSelectionModel selectionMod = tblVisitOrders.getSelectionModel();
        tblVisitOrders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsPurchaseOrder();
        selectionMod.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblVisitOrders);

    }

    private void setDate(int dayOfDate) {
        try {
            Date date = new Date();
            txtFromDate.setDate(date);
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, dayOfDate);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtFromDate.setDate(date2);
            //  fromDate = dateFormat.format(txtFromDate.getDate());
            txtToDate.setDate(date2);
            //  toDate = dateFormat.format(txtToDate.getDate());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setColumnsWidthsPatientsInfo() {

        TableColumn column = null;
        for (int i = 0; i < tblPatientSearch.getColumnCount(); i++) {
            column = tblPatientSearch.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(0);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            } 
        }
    }

    public void setColumnsWidthsPurchaseOrder() {

        TableColumn column = null;
        for (int i = 0; i < tblVisitOrders.getColumnCount(); i++) {
            column = tblVisitOrders.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(3);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(90);
            } else if (i == 3) {
                column.setPreferredWidth(40);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void clearForm() {

        fromDate = "";
        toDate = "";
        patientId = "";
        categoryId = "";
        complaintId = "";
        txtPatientId.setText("");
        txtCategorySearch.setText("");
        txtComplainSearch.setText("");

        listPatientSearch.clear();
        listItemPO.clear();
        tblPatientSearch.setModel(new PatientsSearchTableModel(listPatientSearch));
        //tblVisitOrders.setModel(new PurchaseOrderTableModel(listItemSearch));
    }
}
