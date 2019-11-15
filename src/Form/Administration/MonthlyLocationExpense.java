package Form.Administration;

import BO.Administration.MonthlyLocationExpenseBO;
import Controller.Administration.MonthlyLocationExpenseController;
import TableModel.Administration.HeadExpenseMonthTableModel;
import TableModel.Administration.MonthWiseExpenseTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    DisplayLOV lov = new DisplayLOV();
    MonthlyLocationExpenseController ctlLocExpense = new MonthlyLocationExpenseController();
    MonthlyLocationExpenseBO objMonthlyLoc = new MonthlyLocationExpenseBO();

    public MonthlyLocationExpense() {

        initComponents();
        this.setSize(Constants.xSize - 45, Constants.ySize);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnCloseExpense.setMnemonic(KeyEvent.VK_C);
        btnReOpenMonth.setMnemonic(KeyEvent.VK_R);
        btnSearch.setMnemonic(KeyEvent.VK_S);
        txtLocationName.setText(Constants.locationName);
        setMontlyExpense();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtLocationName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblHeadExpenseMonth = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtToStoreName1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMonthWiseExpense = new javax.swing.JTable();
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLocationName)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(5, 5, 5))
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

        txtToStoreName1.setEditable(false);
        txtToStoreName1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToStoreName1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, 0, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtToStoreName1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(173, 173, 173)
                .addComponent(btnSaveExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    }//GEN-LAST:event_btnReOpenMonthActionPerformed

    private void btnCloseExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseExpenseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCloseExpenseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        searchMonthWiseExpense();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveExpenseActionPerformed
        // TODO add your handling code here:
        objMonthlyLoc.setLocationId(Constants.locationId);


    }//GEN-LAST:event_btnSaveExpenseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseExpense;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReOpenMonth;
    private javax.swing.JButton btnSaveExpense;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JTextField txtLocationName;
    private javax.swing.JTextField txtToStoreName1;
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
                column.setPreferredWidth(30);
            }
        }
    }
}
