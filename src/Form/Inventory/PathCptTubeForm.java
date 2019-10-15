package Form.Inventory;

import Inventory.BO.PathCptWiseTubes;
import Inventory.Controller.PathCptWiseTubesController;
import TableModel.Inventory.PathCptWiseTubesTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.Departments;
import utilities.DisplayLOV;

public class PathCptTubeForm extends javax.swing.JInternalFrame {

    private String cptId = "";
    private String sectionId = "";

    public PathCptTubeForm() {

        initComponents();
        this.setSize(Constants.xSize + 80, Constants.ySize - Constants.yExtension + 8);

        displayData();
    }
    DisplayLOV lov = new DisplayLOV();
    PathCptWiseTubesController ctlPathCptWiseTubes = new PathCptWiseTubesController();
    List<PathCptWiseTubes> listPathptTubes = new ArrayList();
    JScrollPane scrollBar = new JScrollPane(this.tbcptWiseTubes,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbcptWiseTubes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCpt = new javax.swing.JTextField();
        txtSection = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRunProcess = new javax.swing.JButton();
        btnLocationConsumption = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Pathology CPT Tubes");
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
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pathology CPT Tubes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPT Consumption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        tbcptWiseTubes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbcptWiseTubes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tbcptWiseTubes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcptWiseTubesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbcptWiseTubesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbcptWiseTubesMouseReleased(evt);
            }
        });
        tbcptWiseTubes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbcptWiseTubesKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tbcptWiseTubes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("CPT Name : ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Section Name : ");

        txtCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCptActionPerformed(evt);
            }
        });

        txtSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSection)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRunProcess.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRunProcess.setText("Run Process");
        btnRunProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunProcessActionPerformed(evt);
            }
        });

        btnLocationConsumption.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLocationConsumption.setText("Location Consumption");
        btnLocationConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocationConsumptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLocationConsumption)
                .addGap(18, 18, 18)
                .addComponent(btnRunProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnRunProcess)
                    .addComponent(btnLocationConsumption))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRunProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunProcessActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnRunProcessActionPerformed

    private void btnLocationConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocationConsumptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocationConsumptionActionPerformed

    private void tbcptWiseTubesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcptWiseTubesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbcptWiseTubesMouseClicked

    private void tbcptWiseTubesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcptWiseTubesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbcptWiseTubesMousePressed

    private void tbcptWiseTubesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcptWiseTubesMouseReleased
        // TODO add your handling code here:
        setSaveData();
    }//GEN-LAST:event_tbcptWiseTubesMouseReleased

    private void tbcptWiseTubesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcptWiseTubesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbcptWiseTubesKeyReleased

    private void txtCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCptActionPerformed
        String query = "SELECT CPT_ID ID,DESCRIPTION           \n"
                + " FROM " + Database.DCMS.CPT + "    \n"
                + "WHERE DESCRIPTION LIKE '%" + txtCpt.getText().trim() + "%'"
                + "AND DEPARTMENT_ID = " + Departments.pathology + "        \n"
                + "AND ACTIVE = 'Y'                                     \n"
                + "ORDER BY CPT_ID";

        lov.LOVSelection(query, this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            cptId = Constants.lovID;
            txtCpt.setText(Constants.lovDescription);
            displayData();
        }

    }//GEN-LAST:event_txtCptActionPerformed

    private void txtSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSectionActionPerformed
        String query = "SELECT SECTION_ID ID,DESCRIPTION           \n"
                + " FROM " + Database.DCMS.section + "    \n"
                + "WHERE DESCRIPTION LIKE '%" + txtSection.getText().trim() + "%'"
                + "AND DEPARTMENT_ID = " + Departments.pathology + "        \n"
                + "AND ACTIVE = 'Y'                                     \n"
                + "ORDER BY SECTION_ID";

        lov.LOVSelection(query, this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            sectionId = Constants.lovID;
            txtCpt.setText(Constants.lovDescription);
            displayData();
        }

    }//GEN-LAST:event_txtSectionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLocationConsumption;
    private javax.swing.JButton btnRunProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tbcptWiseTubes;
    private javax.swing.JTextField txtCpt;
    private javax.swing.JTextField txtSection;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
//        listPathptTubes = ctlPathCptWiseTubes.selectCondemMaster(cptId);
        if (listPathptTubes.isEmpty()) {
            List<PathCptWiseTubes> listPathptTubes = new ArrayList();
            tbcptWiseTubes.setModel(new PathCptWiseTubesTableModel(listPathptTubes));
        } else {
            tbcptWiseTubes.setModel(new PathCptWiseTubesTableModel(listPathptTubes));
            ListSelectionModel selectionModel = tbcptWiseTubes.getSelectionModel();
            tbcptWiseTubes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setPathCptWiseTubesColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tbcptWiseTubes);
        }

    }

    private void setPathCptWiseTubesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tbcptWiseTubes.getColumnCount(); i++) {
            column = tbcptWiseTubes.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(80);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setSaveData() {
        PathCptWiseTubes objUpdate = new PathCptWiseTubes();
        objUpdate.setYellowTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 2).toString());
        objUpdate.setPurpleTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 3).toString());
        objUpdate.setBlueTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 4).toString());
        objUpdate.setRedTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 5).toString());
        objUpdate.setGrayTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 6).toString());
        objUpdate.setGreenTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 7).toString());
        objUpdate.setUrineContainer(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 8).toString());
        objUpdate.setStoolContainer(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 9).toString());
        objUpdate.setDroper(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 10).toString());
        objUpdate.setTransportSwab(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 11).toString());
        objUpdate.setEpinDropCup(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 12).toString());
        objUpdate.setBloodCsAdult(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 13).toString());
        objUpdate.setBloodCsPeads(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 14).toString());
        objUpdate.setNonMedicatedUrineContainer(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 15).toString());
        objUpdate.setSyringe(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 16).toString());
        objUpdate.setAirSampling(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 17).toString());
        objUpdate.setContainerWithBorricAcid(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 18).toString());
        objUpdate.setSlide(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 19).toString());
        objUpdate.setPetridish(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 20).toString());
        objUpdate.setBloodBankComponent(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 21).toString());
        objUpdate.setSwab(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 22).toString());
        objUpdate.setBlocks(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 23).toString());
        objUpdate.setStrileContainer(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 24).toString());
        objUpdate.setUrineContainer24Hrs(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 25).toString());
        objUpdate.setBlackTop(tbcptWiseTubes.getValueAt(
                tbcptWiseTubes.getSelectedRow(), 26).toString());

    }

}
