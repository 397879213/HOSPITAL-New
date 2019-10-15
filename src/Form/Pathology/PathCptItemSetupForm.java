package Form.Pathology;

import Inventory.BO.PathCptItemSetup;
import Inventory.BO.PathCptWiseTubes;
import Inventory.Controller.PathCptItemSetupController;
import Inventory.TableModel.ConsumableItemsTableModel;
import Inventory.TableModel.CptWiseItemsTableModel;
import Inventory.TableModel.ItemServicesTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;
import utilities.DisplayLOV;

public class PathCptItemSetupForm extends javax.swing.JInternalFrame {

    private String sectionId = "ALL";
    private String itemId = "";

    public PathCptItemSetupForm() {

        initComponents();
        this.setSize(Constants.xSize - 70, Constants.ySize - Constants.yExtension + 8);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSrchService = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCpt = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtSection = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAddItem = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCptWiseItem = new javax.swing.JTable();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSrchItem = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCptItem = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAddService = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblItemWiseCpt = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Path Cpt Item Setup");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(945, 710));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Service Item Setup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Service Wise Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Service", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Service : ");

        txtSrchService.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSrchService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSrchServiceActionPerformed(evt);
            }
        });

        tblCpt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblCpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "CPT ID","CPT Name"
            }
        ));
        tblCpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCptMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCptMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCptMouseReleased(evt);
            }
        });
        tblCpt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCptKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblCpt);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Section : ");

        txtSection.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSrchService, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSection, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSrchService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Service Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Add Item : ");

        txtAddItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddItemActionPerformed(evt);
            }
        });

        tblCptWiseItem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblCptWiseItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Item Id","Item Name"
            }
        ));
        tblCptWiseItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCptWiseItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCptWiseItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCptWiseItemMouseReleased(evt);
            }
        });
        tblCptWiseItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCptWiseItemKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblCptWiseItem);

        txtQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Qty : ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Wise Service", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Search Item : ");

        txtSrchItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSrchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSrchItemActionPerformed(evt);
            }
        });

        tblCptItem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblCptItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Item Id","Item Name"
            }
        ));
        tblCptItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCptItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCptItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCptItemMouseReleased(evt);
            }
        });
        tblCptItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCptItemKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblCptItem);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSrchItem)
                .addContainerGap())
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSrchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Service", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Add Item to Service  : ");

        txtAddService.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tblItemWiseCpt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tblItemWiseCpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "CPT Id","CPT Name"
            }
        ));
        tblItemWiseCpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemWiseCptMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblItemWiseCptMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemWiseCptMouseReleased(evt);
            }
        });
        tblItemWiseCpt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblItemWiseCptKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblItemWiseCpt);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddService)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAddService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    List<PathCptItemSetup> listCpt = new ArrayList();
    List<PathCptItemSetup> listItem = new ArrayList();
    List<PathCptItemSetup> listCptWiseItem = new ArrayList();
    private DisplayLOV lov = new DisplayLOV();
    PathCptItemSetupController ctlPathCptItem = new PathCptItemSetupController();


    private void tblCptWiseItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptWiseItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseItemMouseClicked

    private void tblCptWiseItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptWiseItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseItemMousePressed

    private void tblCptWiseItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptWiseItemMouseReleased

    }//GEN-LAST:event_tblCptWiseItemMouseReleased

    private void tblCptWiseItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCptWiseItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseItemKeyReleased

    private void tblCptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptMouseClicked

    private void tblCptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptMousePressed

    private void tblCptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptMouseReleased
        // TODO add your handling code here:
        PathCptItemSetup objCpt = listCpt.get(tblCpt.getSelectedRow());
        listCptWiseItem = ctlPathCptItem.cptWiseCOnsumableItems(objCpt.getCptId(),
                "", "");
        displayCptWiseItems();
    }//GEN-LAST:event_tblCptMouseReleased

    private void tblCptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCptKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptKeyReleased

    private void tblCptItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptItemMouseClicked

    private void tblCptItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptItemMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptItemMousePressed

    private void tblCptItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptItemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptItemMouseReleased

    private void tblCptItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCptItemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptItemKeyReleased

    private void tblItemWiseCptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemWiseCptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemWiseCptMouseClicked

    private void tblItemWiseCptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemWiseCptMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemWiseCptMousePressed

    private void tblItemWiseCptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemWiseCptMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemWiseCptMouseReleased

    private void tblItemWiseCptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemWiseCptKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemWiseCptKeyReleased

    private void txtSrchServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrchServiceActionPerformed
        // TODO add your handling code here:
        searchCptWiseItems();
    }//GEN-LAST:event_txtSrchServiceActionPerformed

    private void txtSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSectionActionPerformed
        // TODO add your handling code here:
        String query = "SELECT  SECTION_ID ID, DESCRIPTION   FROM   \n"
                + Database.DCMS.section + "                         \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtSection.getText().toUpperCase().trim() + "%'   \n"
                + " AND ACTIVE = 'Y'                                \n"
                + " ORDER BY DESCRIPTION                            \n";
        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            sectionId = Constants.lovID;
            txtSection.setText(Constants.lovDescription);
        }


    }//GEN-LAST:event_txtSectionActionPerformed

    private void txtSrchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrchItemActionPerformed
        // TODO add your handling code here:
        String query = "SELECT  ID, ITM.DESCRIPTION   FROM          \n"
                + Database.DCMS.item + "  ITM                       \n"
                + " WHERE UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtSrchItem.getText().toUpperCase().trim() + "%'  \n"
                + " AND CATEGORY_ID = '" + Departments.pathology + "'  \n"
                + " AND ACTIVE = 'Y'                                \n"
                + " ORDER BY ITM.DESCRIPTION                        \n";
        lov.LOVSelection(query, this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = Constants.lovID;
            txtSrchItem.setText(Constants.lovDescription);
        }
        ctlPathCptItem.cptWiseCOnsumableItems("", "", itemId);
        displayItems();
    }//GEN-LAST:event_txtSrchItemActionPerformed

    private void txtAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddItemActionPerformed
        // TODO add your handling code here:
        String query = "SELECT  ID, ITM.DESCRIPTION   FROM        \n"
                + Database.DCMS.item + "  ITM                     \n"
                + " WHERE UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtSrchItem.getText().toUpperCase().trim() + "%'\n"
                + " AND ACTIVE = 'Y'                              \n"
                + " ORDER BY ITM.DESCRIPTION                      \n";
        lov.LOVSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = Constants.lovID;
            txtAddItem.setText(Constants.lovDescription);
            txtQuantity.requestFocus();
        }

    }//GEN-LAST:event_txtAddItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblCpt;
    private javax.swing.JTable tblCptItem;
    private javax.swing.JTable tblCptWiseItem;
    private javax.swing.JTable tblItemWiseCpt;
    private javax.swing.JTextField txtAddItem;
    private javax.swing.JTextField txtAddService;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSection;
    private javax.swing.JTextField txtSrchItem;
    private javax.swing.JTextField txtSrchService;
    // End of variables declaration//GEN-END:variables

    private void searchCptWiseItems() {
        listCpt = ctlPathCptItem.searchCpt(
                txtSrchService.getText().trim().toUpperCase(), sectionId);
        if (listCpt.isEmpty()) {
            List<PathCptItemSetup> listRequest = new ArrayList();
            tblCpt.setModel(new ItemServicesTableModel(listCpt));
        } else {
            tblCpt.setModel(new ItemServicesTableModel(listCpt));
            ListSelectionModel selectionModel = tblCpt.getSelectionModel();
            tblCpt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setServiceColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblCpt);
        }
    }

    private void setServiceColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCpt.getColumnCount(); i++) {
            column = tblCpt.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(150);
            }
        }

    }

    private void displayCptWiseItems() {
        if (listCptWiseItem.isEmpty()) {
            List<PathCptItemSetup> list = new ArrayList();
            list.add(new PathCptItemSetup());
            tblCptWiseItem.setModel(new ItemServicesTableModel(list));
        } else {
            tblCptWiseItem.setModel(new CptWiseItemsTableModel(listCptWiseItem));
            ListSelectionModel selectionModel = tblCptWiseItem.getSelectionModel();
            tblCptWiseItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setCptWiseItemsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblCptWiseItem);
        }
    }

    private void setCptWiseItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCptWiseItem.getColumnCount(); i++) {
            column = tblCptWiseItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(150);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void displayItems() {
        if (listItem.isEmpty()) {
            List<PathCptItemSetup> list = new ArrayList();
            list.add(new PathCptItemSetup());
            tblCpt.setModel(new ItemServicesTableModel(list));
        } else {
            tblCptItem.setModel(new ConsumableItemsTableModel(listItem));
            ListSelectionModel selectionModel = tblCptItem.getSelectionModel();
            tblCptItem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setItemsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblCptItem);
        }
    }

    private void setItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCptItem.getColumnCount(); i++) {
            column = tblCptItem.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(150);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            }
        }
    }
}
