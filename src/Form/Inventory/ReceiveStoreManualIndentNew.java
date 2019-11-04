package Form.Inventory;

//import Controller.LocationController;
import Inventory.Controller.StoreManualIndentController;
import Inventory.BO.StoreManualIndent;
import Inventory.TableModel.ManualIndentItemsTableModel;
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
import utilities.TypeDetailId;

public class ReceiveStoreManualIndentNew extends javax.swing.JInternalFrame {

    private String fromStoreId = Constants.storeId;
    private String indentClosingDate = "";
//    private LocationController ctlLocation = new LocationController();
    StoreManualIndentController ctlManualIndent
            = new StoreManualIndentController();
    StoreManualIndent indent = new StoreManualIndent();
    StoreManualIndent currentIndent = new StoreManualIndent();
    StoreManualIndent objSearch = new StoreManualIndent();
    List<StoreManualIndent> listItemHistory = new ArrayList();
    List<StoreManualIndent> listCCItems = new ArrayList();
    List<StoreManualIndent> listRequest = new ArrayList();
    DisplayLOV lov = new DisplayLOV();
    private String storeId = "";
    private String indentId = "";

    public ReceiveStoreManualIndentNew() {

        initComponents();
        this.setSize(Constants.xSize + 50, Constants.ySize + 10);
        btnCancel.setMnemonic(KeyEvent.VK_A);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnRequest.setMnemonic(KeyEvent.VK_R);
        setDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIndentMonth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        txtFromStoreName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtIndentClosingDate = new org.jdesktop.swingx.JXDatePicker();
        cboIndent = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cboIndentType = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIndentBy = new javax.swing.JTextField();
        txtIndentDate = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbRequestedItem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        btnLocationWiseReport = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnForward = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Outreach Inventory");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1035, 800));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manual Indent Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Indent Type :  ");

        txtIndentMonth.setEditable(false);
        txtIndentMonth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIndentMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndentMonthActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Store Name :  ");

        btnCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtFromStoreName.setEditable(false);
        txtFromStoreName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFromStoreName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromStoreNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Closing Date :  ");

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtIndentClosingDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIndentClosingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndentClosingDateActionPerformed(evt);
            }
        });

        cboIndent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboIndent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Medicl Supply", "Office Supply" }));
        cboIndent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIndentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Remarks :  ");

        cboIndentType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboIndentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Main Indent", "Emergency Indent" }));
        cboIndentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIndentTypeActionPerformed(evt);
            }
        });

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Indent By :  ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Indent Date :  ");

        txtIndentBy.setEditable(false);
        txtIndentBy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIndentBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndentByActionPerformed(evt);
            }
        });

        txtIndentDate.setEditable(false);
        txtIndentDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIndentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndentDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtFromStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboIndent, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIndentBy)
                    .addComponent(cboIndentType, 0, 131, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtIndentMonth)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(txtIndentDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addComponent(txtIndentClosingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFromStoreName)
                            .addComponent(cboIndent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboIndentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIndentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIndentClosingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIndentBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIndentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave)
                            .addComponent(btnCancel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane11)
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnLocationWiseReport.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLocationWiseReport.setForeground(new java.awt.Color(102, 0, 0));
        btnLocationWiseReport.setText("Location Wise Report");
        btnLocationWiseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationWiseReportActionPerformed(evt);
            }
        });

        btnApprove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnForward.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnForward.setText("Forward");
        btnForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForwardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnForward, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLocationWiseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnRequest)
                    .addComponent(btnLocationWiseReport)
                    .addComponent(btnApprove)
                    .addComponent(btnForward))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tbRequestedItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItemMouseClicked

    }//GEN-LAST:event_tbRequestedItemMouseClicked

    private void tbRequestedItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItemMousePressed

    private void tbRequestedItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItemMouseReleased

    private void tbRequestedItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRequestedItemKeyReleased
        // TODO add your handling code here:
        if (listRequest.isEmpty()) {
            StoreManualIndent obj = listRequest.get(tbRequestedItem.getSelectedRow());
            tbRequestedItem.setValueAt(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 4),
                    tbRequestedItem.getSelectedRow(), 2);
            obj.setOpeningBalance(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 4).toString());
            obj.setClosingBalance(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 4).toString());
            obj.setRequiredQty(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 5).toString());
            obj.setApprovedQty(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 6).toString());
            obj.setConsumedQty(String.valueOf(Integer.parseInt(
                    ctlManualIndent.selectPreviousQty(obj)) 
                    - Integer.parseInt(tbRequestedItem.getValueAt(
                            tbRequestedItem.getSelectedRow(), 4).toString()))
                    );
            obj.setManualIndentId(indentId);
        }
        if (!listRequest.isEmpty()) {
            StoreManualIndent obj = listRequest.get(tbRequestedItem.getSelectedRow());
            tbRequestedItem.setValueAt(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 4), tbRequestedItem.getSelectedRow(),
                    2);
            obj.setOpeningBalance(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 4).toString());
            obj.setClosingBalance(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 4).toString());
            obj.setRequiredQty(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 5).toString());
            obj.setApprovedQty(tbRequestedItem.getValueAt(
                    tbRequestedItem.getSelectedRow(), 6).toString());
            obj.setManualIndentId(indentId);
        }
    }//GEN-LAST:event_tbRequestedItemKeyReleased

    private void txtIndentMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndentMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndentMonthActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed

        if (indent == null) {
            JOptionPane.showMessageDialog(null, "Kindly Make Indent To Request the Indent.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You are Going "
                + "To Request the Indent.");
        if (confirmation != 0) {
            return;
        }
        if (ctlManualIndent.insertRequest(indentId, Status.requested, listRequest)) {
            JOptionPane.showMessageDialog(null, "Indent Request Successfully.");
            listRequest.clear();
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
            setPendingIndent();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Request Successfully.");
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        if (indent == null) {
            JOptionPane.showMessageDialog(null, "No Indent to Cancel.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You are Going "
                + "To Cancel the Indent.");
        if (confirmation != 0) {
            return;
        }
        if (ctlManualIndent.cancelIndent(indent)) {
            JOptionPane.showMessageDialog(null, "Indent has cancelled succefully.");
            btnSave.setEnabled(true);
            cboIndent.setEnabled(true);
            cboIndentType.setEnabled(true);
            txtIndentClosingDate.setEditable(true);
            setPendingIndent();
        } else {
            JOptionPane.showMessageDialog(null, "Indent can not cancel. Kindly conact support team.");
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLocationWiseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationWiseReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocationWiseReportActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveIndentMaster();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIndentClosingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndentClosingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndentClosingDateActionPerformed

    private void txtIndentByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndentByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndentByActionPerformed

    private void cboIndentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIndentTypeActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("MMM-YY");
        Calendar cal = Calendar.getInstance();
        if (cboIndentType.getSelectedIndex() == 1) { // Main Indent
            cal.add(Calendar.MONTH, 1);
            txtIndentMonth.setText(df.format(cal.getTime()).toUpperCase());
            if (cboIndent.getSelectedIndex() == 1) {
                if (cboIndentType.getSelectedIndex() != 0) {
                    txtRemarks.setText("Monthly " + cboIndent.getSelectedItem());
                }
            }
        }
        if (cboIndentType.getSelectedIndex() == 2) { // Emergency Indent
            storeId = Stores.ERStore;
            txtIndentMonth.setText(df.format(cal.getTime()).toUpperCase());
            if (cboIndentType.getSelectedIndex() != 0) {
                txtRemarks.setText("Short " + cboIndent.getSelectedItem());
            }
        }
    }//GEN-LAST:event_cboIndentTypeActionPerformed

    private void cboIndentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIndentActionPerformed
        // TODO add your handling code here:
        if (cboIndent.getSelectedIndex() == 1) { // Medical
            storeId = Stores.ddrlStore;
            currentIndent.setRequestTypeId(TypeDetailId.medicalSupplyIndent);
        }
        if (cboIndent.getSelectedIndex() == 2) { // Office
            storeId = Stores.general;
            currentIndent.setRequestTypeId(TypeDetailId.officeSupplyIndent);
        }
        setPendingIndent();
    }//GEN-LAST:event_cboIndentActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        if (indent == null && listRequest.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent Approve.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You are Going "
                + "To Approve the Indent.");
        if (confirmation != 0) {
            return;
        }
        if (ctlManualIndent.UpdateApproveQty(listRequest, indent.getManualIndentId(),
                Status.Approved, listItemHistory)) {
            setPendingIndent();
            JOptionPane.showMessageDialog(null, "Items Indent Approved Successfully.");
            listRequest.clear();
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Approved Indent. \n"
                    + "Kindly contact Support Team.");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForwardActionPerformed
        // TODO add your handling code here:
        if (indent == null && listRequest.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent To Forward.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You are Going "
                + "To Forward the Indent.");
        if (confirmation != 0) {
            return;
        }
        if (ctlManualIndent.UpdateItemQtyDetail(listRequest, indent.getManualIndentId(),
                Status.forwarded, listItemHistory)) {
            setPendingIndent();
            JOptionPane.showMessageDialog(null, "Items Indent Forward Successfully.");
            listRequest.clear();
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Approved Indent. \n"
                    + "Kindly contact Support Team.");
        }
    }//GEN-LAST:event_btnForwardActionPerformed

    private void txtIndentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndentDateActionPerformed

    private void txtFromStoreNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromStoreNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromStoreNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForward;
    private javax.swing.JButton btnLocationWiseReport;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cboIndent;
    private javax.swing.JComboBox cboIndentType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable tbRequestedItem;
    private javax.swing.JTextField txtFromStoreName;
    private javax.swing.JTextField txtIndentBy;
    private org.jdesktop.swingx.JXDatePicker txtIndentClosingDate;
    private javax.swing.JTextField txtIndentDate;
    private javax.swing.JTextField txtIndentMonth;
    private javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables

    private void selectRequestItems(String indentId, String status) {
        listRequest = ctlManualIndent.selectManualIndentDetail(indentId);
        if (listRequest.isEmpty()) {
            listRequest = ctlManualIndent.selectCCItems(indent.getRequestTypeId());
            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
            ListSelectionModel selectionModel = tbRequestedItem.getSelectionModel();
            tbRequestedItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setRerquestItemsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tbRequestedItem);
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
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(300);
            } else if (i == 2) {
                column.setPreferredWidth(70);
            } else if (i == 3) {
                column.setPreferredWidth(70);
            } else if (i == 4) {
                column.setPreferredWidth(70);
            } else if (i == 5) {
                column.setPreferredWidth(70);
            } else if (i == 6) {
                column.setPreferredWidth(70);
            }
        }
    }

    private void saveIndentMaster() {

        if (cboIndent.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent.");
            return;
        }
        if (cboIndentType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent Type.");
            return;
        }
        try {
            if (txtIndentClosingDate.getDate().getDate() == 0) {
                JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                        "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
                return;
            }
            SimpleDateFormat dateFormat
                    = new SimpleDateFormat("dd-MMM-yyyy");
            indentClosingDate = dateFormat.format(txtIndentClosingDate.getDate());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Indent Closing Date",
                    "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
            return;
        }
        setPendingIndent();
//        currentIndent.setManualBookIndentNo(txtManualIndentNo.getText().trim());
        currentIndent.setOrderStatusId(Status.entered);
        currentIndent.setIndentClosingDate(indentClosingDate);
        currentIndent.setIndentMonth(txtIndentMonth.getText().trim());
        currentIndent.setFromStoreId(Constants.storeId);
        currentIndent.setIndenType(cboIndentType.getSelectedItem().toString().toUpperCase());
        currentIndent.setToStoreId(storeId);
        currentIndent.setRemarks(txtRemarks.getText().trim());

        if (ctlManualIndent.insertManualIndentMaster(currentIndent)) {
            JOptionPane.showMessageDialog(null, "Indent Save successfully.");
            setPendingIndent();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record, "
                    + "Kindly Contact Support Team");
        }
    }

    private void clearForm() {
//        txtItemName.setText("");
//        txtQty.setText("");
        txtIndentMonth.setText("");
//        txtSearchToStore.setText("");
        listItemHistory.clear();
        listRequest.clear();
        tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));

    }

    private void setPendingIndent() {
        indent = ctlManualIndent.selectManualIndentMaster(currentIndent.getRequestTypeId());
        if (indent != null) {
            indentId = indent.getManualIndentId();
            txtFromStoreName.setText(indent.getFromStoreName());
            txtIndentMonth.setText(indent.getIndentMonth());
            txtRemarks.setText(indent.getRemarks());
            txtIndentBy.setText(indent.getCrtdByName());
            txtIndentDate.setText(indent.getCrtdDate());

            if (indent.getRequestTypeId().equalsIgnoreCase(
                    TypeDetailId.officeSupplyIndent)) { //OFFICE SUPPLY
                cboIndent.setSelectedIndex(2);
                cboIndentType.setSelectedIndex(1);
            }
            if (indent.getRequestTypeId().equalsIgnoreCase(
                    TypeDetailId.medicalSupplyIndent)) { //MEDICAL SUPPLY
                cboIndent.setSelectedIndex(1);
                cboIndentType.setSelectedIndex(1);
            }
            if (indent.getToStoreId().equalsIgnoreCase(Stores.ERStore)) { //SET INFDENT TYPE
                cboIndentType.setSelectedIndex(2);
            }
            try {
                Calendar c = Calendar.getInstance();
                c.add(Calendar.DATE, Integer.parseInt(indent.getClosingDay()));
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
                Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
                txtIndentClosingDate.setDate(date2);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (indent.getOrderStatusId().equalsIgnoreCase(Status.entered)) {
                btnSave.setEnabled(false);
                btnApprove.setEnabled(false);
                btnForward.setEnabled(false);
            }
            if (indent.getOrderStatusId().equalsIgnoreCase(Status.requested)) {
                btnSave.setEnabled(false);
                btnCancel.setEnabled(false);
                btnRequest.setEnabled(false);
                btnApprove.setEnabled(false);
                btnForward.setEnabled(true);
            }
            if (indent.getOrderStatusId().equalsIgnoreCase(Status.forwarded)) {
                btnSave.setEnabled(false);
                btnCancel.setEnabled(false);
                btnRequest.setEnabled(false);
                btnApprove.setEnabled(true);
            }

            cboIndent.setEnabled(false);
            cboIndentType.setEnabled(false);
            txtIndentClosingDate.setEditable(false);
            selectRequestItems(indent.getManualIndentId(), "");
        }
    }

    private void setDate() {
        try {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, 0);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtIndentClosingDate.setDate(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
