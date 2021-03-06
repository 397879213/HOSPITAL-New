package Form.Administration;

import BO.Administration.MonthlyLocationExpenseBO;
import Controller.Administration.MonthlyLocationExpenseController;
import TableModel.Administration.HeadExpenseMonthTableModel;
import TableModel.Administration.MonthWiseExpenseTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;
//import utilities.LocationProperties;
import utilities.Status;
import utilities.Stores;

public class MonthlyLocationExpense extends javax.swing.JInternalFrame {

    private String expenseMonth = "N";
    private String closeStatus = "N";
    private String fromDate = "";
    private String toDate = "";

    List<MonthlyLocationExpenseBO> listLocationExpense = new ArrayList();
    List<MonthlyLocationExpenseBO> listMonthWiseExpense = new ArrayList();
    List<MonthlyLocationExpenseBO> listCopy = new ArrayList();

    DisplayLOV lov = new DisplayLOV();
    MonthlyLocationExpenseController ctlLocExpense = new MonthlyLocationExpenseController();
    MonthlyLocationExpenseBO objMonthlyLoc = new MonthlyLocationExpenseBO();
    private String expMonth;

    public MonthlyLocationExpense() {

        initComponents();
        this.setSize(Constants.xSize - 45, Constants.ySize);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnCloseExpense.setMnemonic(KeyEvent.VK_C);
        btnReOpenMonth.setMnemonic(KeyEvent.VK_R);
        btnSearch.setMnemonic(KeyEvent.VK_S);
        txtLocationName.setText(Constants.locationName);
        txtLocDesc.setText(Constants.locationName);
        setMontlyExpense();
        setDate(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtLocationName = new javax.swing.JTextField();
        txtExpMonth = new org.jdesktop.swingx.JXDatePicker();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblHeadExpenseMonth = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtLocDesc = new javax.swing.JTextField();
        txtFromExpMonth = new org.jdesktop.swingx.JXDatePicker();
        txtToExpMonth = new org.jdesktop.swingx.JXDatePicker();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMonthWiseExpense = new javax.swing.JTable();
        cboAll = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btnCloseExpense = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReOpenMonth = new javax.swing.JButton();
        btnSaveExpense = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Outreach Inventory");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(955, 750));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monthly Location Expense", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Location : ");

        txtLocationName.setEditable(false);
        txtLocationName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtExpMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Head Wise Month Expense ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tblHeadExpenseMonth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblHeadExpenseMonth.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblHeadExpenseMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHeadExpenseMonthMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblHeadExpenseMonthMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHeadExpenseMonthMouseReleased(evt);
            }
        });
        tblHeadExpenseMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblHeadExpenseMonthKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblHeadExpenseMonth);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Location Wise Month Expense", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Location : ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtLocDesc.setEditable(false);
        txtLocDesc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFromExpMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromExpMonthActionPerformed(evt);
            }
        });

        txtToExpMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToExpMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFromExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocDesc)
                    .addComponent(txtFromExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Month Wise Expense", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        tblMonthWiseExpense.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblMonthWiseExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblMonthWiseExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonthWiseExpenseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMonthWiseExpenseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMonthWiseExpenseMouseReleased(evt);
            }
        });
        tblMonthWiseExpense.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMonthWiseExpenseKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblMonthWiseExpense);

        cboAll.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        cboAll.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboAll.setText("select all");
        cboAll.setBorder(null);
        cboAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cboAll, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(cboAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCloseExpense.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCloseExpense.setText("Close Month");
        btnCloseExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseExpenseActionPerformed(evt);
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

        btnReOpenMonth.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReOpenMonth.setText("Re-open");
        btnReOpenMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReOpenMonthActionPerformed(evt);
            }
        });

        btnSaveExpense.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveExpense.setText("Save");
        btnSaveExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveExpenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btnSaveExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCloseExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReOpenMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCloseExpense)
                    .addComponent(btnReOpenMonth)
                    .addComponent(btnSaveExpense)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHeadExpenseMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeadExpenseMonthMouseClicked


    }//GEN-LAST:event_tblHeadExpenseMonthMouseClicked

    private void tblHeadExpenseMonthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeadExpenseMonthMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHeadExpenseMonthMousePressed

    private void tblHeadExpenseMonthMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeadExpenseMonthMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHeadExpenseMonthMouseReleased

    private void tblHeadExpenseMonthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHeadExpenseMonthKeyReleased
        // TODO add your handling code here:
        MonthlyLocationExpenseBO obj = listLocationExpense.get(
                tblHeadExpenseMonth.getSelectedRow());
        obj.setAmount(tblHeadExpenseMonth.getValueAt(
                tblHeadExpenseMonth.getSelectedRow(), 2).toString());
        ctlLocExpense.updateAmount(obj);
    }//GEN-LAST:event_tblHeadExpenseMonthKeyReleased

    private void tblMonthWiseExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonthWiseExpenseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMonthWiseExpenseMouseClicked

    private void tblMonthWiseExpenseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonthWiseExpenseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMonthWiseExpenseMousePressed

    private void tblMonthWiseExpenseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonthWiseExpenseMouseReleased

    }//GEN-LAST:event_tblMonthWiseExpenseMouseReleased

    private void tblMonthWiseExpenseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMonthWiseExpenseKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMonthWiseExpenseKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReOpenMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReOpenMonthActionPerformed
        for (int i = 0; i < listMonthWiseExpense.size(); i++) {
            if (tblMonthWiseExpense.getValueAt(i, 4).equals(true)) {
                MonthlyLocationExpenseBO objSave = listMonthWiseExpense.get(i);
                listCopy.add(objSave);
            }
        }
        setExpenseMaster();
        if (ctlLocExpense.insertLocMonthlyExpense(listCopy, objMonthlyLoc)) {
            JOptionPane.showMessageDialog(null, "Expense Re-open successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Re-open the Expense.\n"
                    + "Kindly contact Administrator.");
        }

    }//GEN-LAST:event_btnReOpenMonthActionPerformed

    private void btnCloseExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseExpenseActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Close Month Expense. \nDo you want to Close?");
        if (confirmation != 0) {
            return;
        }
        if (ctlLocExpense.updateTotalAmountStatus(title)) {
            JOptionPane.showMessageDialog(null, "Expense Close successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Close the Expense.\n"
                    + "Kindly contact Administrator.");
        }
    }//GEN-LAST:event_btnCloseExpenseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        searchMonthWiseExpense();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveExpenseActionPerformed
        // TODO add your handling code here:
        objMonthlyLoc.setLocationId(Constants.locationId);


    }//GEN-LAST:event_btnSaveExpenseActionPerformed

    private void txtExpMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpMonthActionPerformed
        // TODO add your handling code here:
        if (txtExpMonth.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-yy");
        expMonth = dateFormat.format(txtExpMonth.getDate());
    }//GEN-LAST:event_txtExpMonthActionPerformed

    private void txtFromExpMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromExpMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromExpMonthActionPerformed

    private void txtToExpMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToExpMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToExpMonthActionPerformed

    private void cboAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAllActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < listMonthWiseExpense.size(); i++) {
            if (cboAll.isSelected()) {
                tblMonthWiseExpense.setValueAt(true, i, 4);
            }
            if (!cboAll.isSelected()) {
                tblMonthWiseExpense.setValueAt(false, i, 4);
            }
        }

    }//GEN-LAST:event_cboAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseExpense;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReOpenMonth;
    private javax.swing.JButton btnSaveExpense;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox cboAll;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JTable tblHeadExpenseMonth;
    private javax.swing.JTable tblMonthWiseExpense;
    private org.jdesktop.swingx.JXDatePicker txtExpMonth;
    private org.jdesktop.swingx.JXDatePicker txtFromExpMonth;
    private javax.swing.JTextField txtLocDesc;
    private javax.swing.JTextField txtLocationName;
    private org.jdesktop.swingx.JXDatePicker txtToExpMonth;
    // End of variables declaration//GEN-END:variables

    private void setMontlyExpense() {
        listLocationExpense = ctlLocExpense.headWiseMonthlyExpense(Constants.locationId,
                expenseMonth, "O");
        if (listLocationExpense.isEmpty()) {
            List<MonthlyLocationExpenseBO> list = new ArrayList();
            list.add(new MonthlyLocationExpenseBO());
            tblHeadExpenseMonth.setModel(new HeadExpenseMonthTableModel(list));
        } else {
            tblHeadExpenseMonth.setModel(new HeadExpenseMonthTableModel(listLocationExpense));
            ListSelectionModel selectionModel = tblHeadExpenseMonth.getSelectionModel();
            tblHeadExpenseMonth.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setMasterColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblHeadExpenseMonth);
        }
    }

    private void setMasterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblHeadExpenseMonth.getColumnCount(); i++) {
            column = tblHeadExpenseMonth.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(15);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void searchMonthWiseExpense() {
        listMonthWiseExpense = ctlLocExpense.monthWiseExpense(Constants.locationId,
                expenseMonth, "C");
        if (listMonthWiseExpense.isEmpty()) {
            List<MonthlyLocationExpenseBO> list = new ArrayList();
            list.add(new MonthlyLocationExpenseBO());
            tblMonthWiseExpense.setModel(new MonthWiseExpenseTableModel(list));
        } else {
            tblMonthWiseExpense.setModel(new MonthWiseExpenseTableModel(listMonthWiseExpense));
            ListSelectionModel selectionModel = tblMonthWiseExpense.getSelectionModel();
            tblMonthWiseExpense.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setMonthWiseExpenseColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblMonthWiseExpense);
        }
    }

    private void setMonthWiseExpenseColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblMonthWiseExpense.getColumnCount(); i++) {
            column = tblMonthWiseExpense.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setExpenseMaster() {
        objMonthlyLoc = new MonthlyLocationExpenseBO();
        objMonthlyLoc.setCloseStatus("O");
        objMonthlyLoc.setActive("Y");
        objMonthlyLoc.setExpenseMonth(expMonth);
        objMonthlyLoc.setTotalAmount("0");
        objMonthlyLoc.setLocationId(Constants.locationId);
    }

    private void setDate(int day) {
        try {
//            Calendar c = Calendar.getInstance();
//            c.add(Calendar.DATE, day);
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM-yyyy");
            String month = dateFormat.format(date);
            System.err.println("ddd " + month);
            txtExpMonth.setDate(dateFormat.parse(dateFormat.format(date)));
            txtFromExpMonth.setDate(dateFormat.parse(month));
            txtToExpMonth.setDate(dateFormat.parse(month));
            expMonth = month;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
