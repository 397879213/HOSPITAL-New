package Form.Inventory;

//import Controller.LocationController;
import Inventory.Controller.StoreManualIndentController;
import Inventory.BO.StoreManualIndent;
import Inventory.TableModel.ManualIndentDetailTableModel;
import Inventory.TableModel.ManualIndentItemsTableModel;
import Inventory.TableModel.ManualIndentMasterTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
//import utilities.LocationProperties;
import utilities.Status;
import utilities.Stores;

public class ReceiveStoreManualIndent extends javax.swing.JInternalFrame {

    private String inStoreId = "0";
    private String fromStoreId = Stores.pathologyManualStore;
    private String itemId = "0";
    private String indentId = "";
    private String manualIndentNo = "";
    private String searchToStoreId = "";
    private String searchFromStoreId = "";
    private String searchItemId = "";
    private String fromDate = "";
    private String manualIndentDate = "";
    private String toDate = "";
//    private LocationController ctlLocation = new LocationController();
    StoreManualIndentController ctlManualIndent
            = new StoreManualIndentController();
    StoreManualIndent currentIndent = new StoreManualIndent();
    StoreManualIndent objSearch = new StoreManualIndent();
    List<StoreManualIndent> listManualIndentMaster = new ArrayList();
    List<StoreManualIndent> listManualIndentDetail = new ArrayList();
    List<StoreManualIndent> listRequest = new ArrayList();
    DisplayLOV lov = new DisplayLOV();

    public ReceiveStoreManualIndent() {

//        ctlLocation.selectLocationDefaultStore(Constants.locationId);
//        if (LocationProperties.locationDefaultStoreId.equalsIgnoreCase("0")) {
//            JOptionPane.showMessageDialog(null, "Location Store is not properly "
//                    + "configured, Kindly Contact Support Team");
//            return;
//        }
        initComponents();
        this.setSize(Constants.xSize - 45, Constants.ySize);
        btnEdit.setMnemonic(KeyEvent.VK_A);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnReceived.setMnemonic(KeyEvent.VK_R);
        btnSearch.setMnemonic(KeyEvent.VK_S);
        chkMove.setSelected(false);
        txtFromStore.setEditable(false);
//        inStoreId = LocationProperties.locationDefaultStoreId;
//        txtToStoreName.setText(LocationProperties.locationDefaultStoreName);
        Date date = new Date();
        txtFromDate.setDate(date);
        txtToDate.setDate(date);
        txtManualIndentDate.setDate(date);
        objSearch.setStoreId(inStoreId);
        objSearch.setOrderStatusId(Status.entered);
//        List<StoreManualIndent> list
//                = ctlManualIndent.selectManualIndentMaster(objSearch);

        btnSave.setEnabled(false);
        btnEdit.setEnabled(true);
//        if (list.isEmpty()) {
//            btnSave.setEnabled(true);
//            btnEdit.setEnabled(false);
//            return;
//        }
//        currentIndent = list.get(0);
//        if (!currentIndent.getFromStoreId().equalsIgnoreCase(Stores.pathologyManualStore)) {
//            txtFromStore.setText(currentIndent.getFromStoreName());
//        }
        indentId = currentIndent.getManualIndentId();
        txtManualIndentNo.setText(currentIndent.getManualBookIndentNo());
        txtDisplayManualIndentNo.setText(currentIndent.getManualBookIndentNo());
        txtIndentMasterDate.setText(currentIndent.getManualBookIndentDate());

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            Date date2 = sdf.parse(currentIndent.getManualBookIndentDate());
            txtManualIndentDate.setDate(date2);
        } catch (Exception ex) {

        }
        selectRequestItems(indentId);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtFromStore = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        chkMove = new javax.swing.JCheckBox();
        txtToStoreName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtManualIndentNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtManualIndentDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbRequestedItem = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDisplayManualIndentNo = new javax.swing.JTextField();
        txtIndentMasterDate = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSearchToStore = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        txtSearchItem = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        chkDate = new javax.swing.JCheckBox();
        txtSearchManualIndentNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSearchFromStore = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblIndentDetail = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblIndentRequest = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReceived = new javax.swing.JButton();
        btnLocationWiseReport = new javax.swing.JButton();
        btnCancelIndent = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manual Indent Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("From Store :  ");

        txtFromStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFromStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromStoreActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Store Name :  ");

        btnEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
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

        txtToStoreName.setEditable(false);
        txtToStoreName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Indent No :  ");

        txtManualIndentNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtManualIndentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManualIndentNoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Indent Date :  ");

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtManualIndentDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtManualIndentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManualIndentDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManualIndentNo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFromStore, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkMove, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtManualIndentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtToStoreName))
                .addGap(8, 8, 8))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtToStoreName)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFromStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkMove, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManualIndentNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManualIndentDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(8, 8, 8))
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
        jLabel7.setText("Item :  ");

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
        jLabel11.setText("Indent No :  ");

        txtDisplayManualIndentNo.setEditable(false);
        txtDisplayManualIndentNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDisplayManualIndentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayManualIndentNoActionPerformed(evt);
            }
        });

        txtIndentMasterDate.setEditable(false);
        txtIndentMasterDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIndentMasterDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndentMasterDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtDisplayManualIndentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIndentMasterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDisplayManualIndentNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIndentMasterDate))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtItemName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Indent", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Indent No :  ");

        txtSearchToStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchToStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchToStoreActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("From Date :  ");

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
        jLabel8.setText("Store Name : ");

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

        txtSearchManualIndentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchManualIndentNoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Item Name : ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("From Store : ");

        txtSearchFromStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchFromStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFromStoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtSearchFromStore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToDate, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearchToStore)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchManualIndentNo)))
                .addGap(5, 5, 5))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchToStore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearchManualIndentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchFromStore, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indent Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
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
            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
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
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnReceived.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReceived.setText("Received");
        btnReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceivedActionPerformed(evt);
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

        btnCancelIndent.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelIndent.setText("Cancel");
        btnCancelIndent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelIndentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCancelIndent, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLocationWiseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnReceived)
                    .addComponent(btnLocationWiseReport)
                    .addComponent(btnCancelIndent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
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

        if (tbRequestedItem.getSelectedRow() < 0 || listRequest.isEmpty()) {
            return;
        }
        if (evt.getClickCount() % 2 == 0) {
            StoreManualIndent obj
                    = listRequest.get(tbRequestedItem.getSelectedRow());
//            if (ctlManualIndent.deleteManualIndentDetail(
//                    obj.getManualIndentId(), obj.getItemId())) {
//                selectRequestItems(indentId);
//            }
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
                + " WHERE SWI.STORE_ID = " + currentIndent.getStoreId() + " \n"
                + " AND SWI.ITEM_ID = ITM.ID                                \n"
                + " AND ITM.ID NOT IN ( SELECT ITEM_ID FROM                 \n"
                + Database.Inventory.manualIndentDetail + "                 \n"
                + " WHERE MANUAL_INDENT_ID = " + indentId + " )             \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtItemName.getText().toUpperCase().trim() + "%'          \n"
                + " AND SWI.ACTIVE = 'Y'                                    \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";

        lov.LOVSelection(query, this);
        itemId = "0";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = Constants.lovID;
            txtItemName.setText(Constants.lovDescription);
        }
        txtQty.requestFocus();
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtFromStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromStoreActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM                         \n"
                + Database.DCMS.store + "                                   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtFromStore.getText().toUpperCase().trim() + "%'         \n"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            inStoreId = "0";
            return;
        } else {
            inStoreId = Constants.lovID;
            txtFromStore.setText(Constants.lovDescription);
        }
        txtManualIndentNo.requestFocus();
    }//GEN-LAST:event_txtFromStoreActionPerformed

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
        StoreManualIndent obj = listManualIndentMaster.get(tblIndentRequest.getSelectedRow());
//        listManualIndentDetail = ctlManualIndent.selectManualIndentDetail(
//                obj.getManualIndentId());
        searchIndentDetail();
    }//GEN-LAST:event_tblIndentRequestMouseReleased

    private void tblIndentRequestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentRequestKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequestKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceivedActionPerformed

        if (indentId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent For Edit.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You are Going "
                + "To Request the item(s).");
        if (confirmation != 0) {
            return;
        }
        currentIndent.setOrderStatusId(Status.receiveBill);
        currentIndent.setManualIndentId(indentId);
//        listRequest = ctlManualIndent.selectManualIndentDetail(indentId);
        if (ctlManualIndent.updateStoresStock(listRequest, currentIndent)) {
            searchManualIndentMaster();
            JOptionPane.showMessageDialog(null, "Items Request Successfully.");
            indentId = "";
            listRequest.clear();
//            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
            txtDisplayManualIndentNo.setText("");
            txtIndentMasterDate.setText("");
            txtQty.setText("");
            txtDisplayManualIndentNo.setEditable(true);
            txtIndentMasterDate.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Request Successfully.");
        }
    }//GEN-LAST:event_btnReceivedActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:

        if (indentId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent For Edit.");
            return;
        }
        if (txtManualIndentNo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Manual Indent Book No.");
            return;
        }
        try {
            if (txtManualIndentDate.getDate().getDate() == 0) {
                JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                        "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
                return;
            }
            SimpleDateFormat dateFormat
                    = new SimpleDateFormat("dd-MMM-yyyy");
            manualIndentDate = dateFormat.format(txtManualIndentDate.getDate());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Manual Indent Date",
                    "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
            return;
        }
        StoreManualIndent indent
                = ctlManualIndent.checkManualIndentBookNo(
                        txtManualIndentNo.getText().trim().toUpperCase(),
                        indentId);//Check
        if (indent != null) {
            JOptionPane.showMessageDialog(null,
                    " This Manual Indent No. has already generated \n"
                    + "(" + indent.getManualBookIndentNo() + ") on "
                    + indent.getManualBookIndentDate() + " \n"
                    + " by " + indent.getCrtdByName());
            return;
        }
        currentIndent.setManualBookIndentNo(txtManualIndentNo.getText().trim());
        currentIndent.setOrderStatusId(Status.entered);
        currentIndent.setStoreId(inStoreId);
        currentIndent.setManualBookIndentDate(manualIndentDate.toUpperCase());
        currentIndent.setFromStoreId(fromStoreId);
        if (chkMove.isSelected()
                && fromStoreId.equalsIgnoreCase(Stores.pathologyManualStore)) {
            JOptionPane.showMessageDialog(null, "Kindly Select the From Store.");
            txtFromStore.requestFocus();
            return;
        }//
        if (ctlManualIndent.updateManualIndentMaster(currentIndent)) {
            JOptionPane.showMessageDialog(null, "Indent Save Successfully");
            txtManualIndentNo.setText(currentIndent.getManualBookIndentNo());
            txtDisplayManualIndentNo.setText(currentIndent.getManualBookIndentNo());
            txtIndentMasterDate.setText(currentIndent.getManualBookIndentDate());
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
                Date date2 = sdf.parse(currentIndent.getManualBookIndentDate());
                txtManualIndentDate.setDate(date2);
            } catch (Exception ex) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record,"
                    + " Kindly Contact Support Team");
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchToStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchToStoreActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM                      \n"
                + Database.DCMS.store + "                                \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtSearchToStore.getText().toUpperCase().trim() + "%'   \n"
                + " AND ID IN (SELECT TO_STORE_ID FROM "
                + Database.Inventory.manualIndentMaster + " )"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        searchToStoreId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            searchToStoreId = Constants.lovID;
            txtSearchToStore.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtSearchToStoreActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();


    }//GEN-LAST:event_btnClearActionPerformed

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        // TODO add your handling code here: birthDate
        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                    "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());
        objSearch.setFromDate(fromDate);
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:

        searchManualIndentMaster();
    }//GEN-LAST:event_txtToDateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //
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
            itemId = "0";

        } else {
            searchItemId = Constants.lovID;
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
            txtFromStore.setEditable(true);
            txtFromStore.requestFocus();
        }
        if (!chkMove.isSelected()) {
            txtFromStore.setEditable(false);
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

    private void txtDisplayManualIndentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayManualIndentNoActionPerformed
        // TODO add your handling code here:
        listManualIndentMaster.clear();
        objSearch.setManualBookIndentNo(txtDisplayManualIndentNo.getText().trim());
        //objSearch.setOrderStatusId(Status.admissionRequest);
//        listManualIndentMaster = ctlManualIndent.selectManualIndentMaster(objSearch);
        // where status is requested 
        if (listManualIndentMaster.isEmpty()) {
            return;
        } else {
            StoreManualIndent objMaster = listManualIndentMaster.get(0);
            txtIndentMasterDate.setText(objMaster.getCrtdDate());
            indentId = objMaster.getManualIndentId();
            selectRequestItems(indentId);
        }
        txtItemName.requestFocus();
    }//GEN-LAST:event_txtDisplayManualIndentNoActionPerformed

    private void txtIndentMasterDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndentMasterDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndentMasterDateActionPerformed

    private void txtSearchManualIndentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchManualIndentNoActionPerformed
        // TODO add your handling code here:
        searchManualIndentMaster();
    }//GEN-LAST:event_txtSearchManualIndentNoActionPerformed

    private void btnLocationWiseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationWiseReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocationWiseReportActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveIndentMaster();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtManualIndentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManualIndentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManualIndentDateActionPerformed

    private void btnCancelIndentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelIndentActionPerformed
        // TODO add your handling code here:

        if (indentId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Indent to Cancel.");
            return;
        }
        int i = JOptionPane.showConfirmDialog(null,
                "you are going to cancel selected Indent");
        if (i != 0) {
            return;
        }
        if (ctlManualIndent.cancelManualIndent(indentId)) {
            JOptionPane.showMessageDialog(null, "Indent Cancel Successfully.");
            clearForm();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record, "
                    + "Kindly Contact Support Team");
        }
    }//GEN-LAST:event_btnCancelIndentActionPerformed

    private void txtSearchFromStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFromStoreActionPerformed
        // TODO add your handling code here:

        if (searchToStoreId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Store Name First");
            txtSearchToStore.requestFocus();
            return;
        }
        String query = "SELECT ID, DESCRIPTION FROM                         \n"
                + Database.DCMS.store + "                                   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtSearchFromStore.getText().toUpperCase().trim() + "%'   \n"
                + " AND ID IN (SELECT FROM_STORE_ID FROM "
                + Database.Inventory.manualIndentMaster + ""
                + " WHERE TO_STORE_ID = " + searchToStoreId + ")"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        searchFromStoreId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            searchFromStoreId = Constants.lovID;
            txtSearchFromStore.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtSearchFromStoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelIndent;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLocationWiseReport;
    private javax.swing.JButton btnReceived;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkDate;
    private javax.swing.JCheckBox chkMove;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTable tbRequestedItem;
    private javax.swing.JTable tblIndentDetail;
    private javax.swing.JTable tblIndentRequest;
    private javax.swing.JTextField txtDisplayManualIndentNo;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtFromStore;
    private javax.swing.JTextField txtIndentMasterDate;
    private javax.swing.JTextField txtItemName;
    private org.jdesktop.swingx.JXDatePicker txtManualIndentDate;
    private javax.swing.JTextField txtManualIndentNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearchFromStore;
    private javax.swing.JTextField txtSearchItem;
    private javax.swing.JTextField txtSearchManualIndentNo;
    private javax.swing.JTextField txtSearchToStore;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    private javax.swing.JTextField txtToStoreName;
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
        currentIndent.setManualIndentId(indentId);
        currentIndent.setItemId(itemId);
        currentIndent.setQuantity(txtQty.getText().trim());
        if (ctlManualIndent.insertManualIndentDetail(currentIndent)) {
            selectRequestItems(indentId);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to add item. \n"
                    + "Kindly contact Administrator.");
        }
        txtItemName.setText("");
        txtQty.setText("");
        txtItemName.requestFocus();
    }

    private void selectRequestItems(String indentId) {
//        listRequest = ctlManualIndent.selectManualIndentDetail(
//                indentId);
        if (listRequest.isEmpty()) {
            List<StoreManualIndent> listRequest = new ArrayList();
//            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
        } else {
//            tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
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
        objSearch = new StoreManualIndent();
        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                    "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                    "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtToDate.getDate());
        objSearch.setToDate(toDate);
        fromDate = dateFormat.format(txtFromDate.getDate());
        objSearch.setFromDate(fromDate);

        if (chkDate.isSelected()) {
            fromDate = "";
            toDate = "";
        }
        objSearch.setItemId(searchItemId);
        objSearch.setStoreId(searchToStoreId);
        objSearch.setFromStoreId(searchFromStoreId);
        objSearch.setManualBookIndentNo(txtSearchManualIndentNo.getText().trim());
//        listManualIndentMaster = ctlManualIndent.selectManualIndentMaster(objSearch);
        if (listManualIndentMaster.isEmpty()) {
            List<StoreManualIndent> list = new ArrayList();
            list.add(new StoreManualIndent());
            tblIndentRequest.setModel(new ManualIndentMasterTableModel(list));
        } else {
            tblIndentRequest.setModel(new ManualIndentMasterTableModel(listManualIndentMaster));
            ListSelectionModel selectionModel = tblIndentRequest.getSelectionModel();
            tblIndentRequest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setMasterColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblIndentRequest);
            StoreManualIndent obj = listManualIndentMaster.get(0);
//            listManualIndentDetail = ctlManualIndent.selectManualIndentDetail(
//                    obj.getManualIndentId());
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
            List<StoreManualIndent> list = new ArrayList();
            list.add(new StoreManualIndent());
            tblIndentDetail.setModel(new ManualIndentDetailTableModel(list));
        } else {
            tblIndentDetail.setModel(new ManualIndentDetailTableModel(listManualIndentDetail));
            tblIndentDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            ListSelectionModel selectionModel = tblIndentDetail.getSelectionModel();
            setDetailColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblIndentDetail);
        }
    }

    private void saveIndentMaster() {

        if (txtManualIndentNo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Manual Indent Book No.");
            return;
        }
        try {
            if (txtManualIndentDate.getDate().getDate() == 0) {
                JOptionPane.showMessageDialog(null, "Enter the Date DD-MON-YY",
                        "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
                return;
            }
            SimpleDateFormat dateFormat
                    = new SimpleDateFormat("dd-MMM-yyyy");
            manualIndentDate = dateFormat.format(txtManualIndentDate.getDate());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Manual Indent Date",
                    "Manual Indent Management", JOptionPane.WARNING_MESSAGE);
            return;
        }
        StoreManualIndent indent
                = ctlManualIndent.checkManualIndentBookNo(
                        txtManualIndentNo.getText().trim().toUpperCase(), "");//new indent
        if (indent != null) {
            JOptionPane.showMessageDialog(null,
                    " This Manual Indent No. has already generated \n"
                    + "(" + indent.getManualBookIndentNo() + ") on "
                    + indent.getManualBookIndentDate() + " \n"
                    + " by " + indent.getCrtdByName());
            return;
        }
        currentIndent.setManualBookIndentNo(txtManualIndentNo.getText().trim());
        currentIndent.setOrderStatusId(Status.entered);
        currentIndent.setStoreId(inStoreId);
        currentIndent.setManualBookIndentDate(manualIndentDate);
        currentIndent.setFromStoreId(fromStoreId);
        if (chkMove.isSelected()
                && fromStoreId.equalsIgnoreCase(Stores.pathologyManualStore)) {
            JOptionPane.showMessageDialog(null, "Kindly Select the From Store.");
            txtFromStore.requestFocus();
            return;
        }
        if (ctlManualIndent.insertManualIndentMaster(currentIndent)) {
            JOptionPane.showMessageDialog(null, "Indent Save successfully.");
            txtItemName.requestFocus();
            txtDisplayManualIndentNo.setText(currentIndent.getManualBookIndentNo());
            txtIndentMasterDate.setText(currentIndent.getManualBookIndentDate());
            indentId = currentIndent.getManualIndentId();
            manualIndentNo = currentIndent.getManualBookIndentNo();
            txtItemName.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record, "
                    + "Kindly Contact Support Team");
        }
    }

    private void clearForm() {
        txtItemName.setText("");
        txtQty.setText("");
        txtFromStore.setText("");
        txtSearchToStore.setText("");
        inStoreId = "0";
        itemId = "0";
        listManualIndentDetail.clear();
        listManualIndentMaster.clear();
        listRequest.clear();
//        tbRequestedItem.setModel(new ManualIndentItemsTableModel(listRequest));
        tblIndentDetail.setModel(new ManualIndentDetailTableModel(listManualIndentDetail));
        tblIndentRequest.setModel(new ManualIndentMasterTableModel(listManualIndentMaster));

    }
}
