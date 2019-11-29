package Form.Cardiology;

import BO.Cardiology.CardiacSurgeryBO;
import Controller.Cardiology.CardiacSurgeryController;
import TableModel.Cardiology.ExamDetailTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;

public class CardiacSurgeryDetailForm extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    CardiacSurgeryController ctlCardiacSurg = new CardiacSurgeryController();
    List<CardiacSurgeryBO> listExamDetail = new ArrayList();

    public CardiacSurgeryDetailForm() {

        initComponents();
        this.setSize(Constants.xSize + 80, Constants.ySize - Constants.yExtension + 8);
        listExamDetail = ctlCardiacSurg.selectExamDetail();
        setExamDetail();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCardiacInfo = new javax.swing.JTable();
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
        setTitle(Constants.title+"Search Studies");
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiology Surgery Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cardiac Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        tblCardiacInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblCardiacInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null }
            },
            new String [] {"Exam", "Exam Detail", "Remarks"}
        ));
        tblCardiacInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCardiacInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCardiacInfoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCardiacInfoMouseReleased(evt);
            }
        });
        tblCardiacInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCardiacInfoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblCardiacInfo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cardiac Detail", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void tblCardiacInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCardiacInfoMouseClicked

        if (tblCardiacInfo.getSelectedRow() < 0) {
            return;
        }
    }//GEN-LAST:event_tblCardiacInfoMouseClicked

    private void tblCardiacInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCardiacInfoMouseReleased

        if (tblCardiacInfo.getSelectedRow() < 0 || listExamDetail.isEmpty()) {
            return;
        }
        CardiacSurgeryBO obj = listExamDetail.get(tblCardiacInfo.getSelectedRow());
        if (evt.getClickCount() % 2 == 0 && tblCardiacInfo.getSelectedColumn() == 2) {
            lov.LOVDefinitionSelection(obj.getExamId(), "", this);
            obj.setExamDetailId(Constants.lovID);
            obj.setExamDetailDescription(Constants.lovDescription);
            setExamDetail();
        }
        if (evt.getClickCount() % 2 == 0 && tblCardiacInfo.getSelectedColumn() == 3) {
            obj.setExamRemarks(String.valueOf(tblCardiacInfo.getValueAt(
                    tblCardiacInfo.getSelectedRow(), 3)));
        }
    }//GEN-LAST:event_tblCardiacInfoMouseReleased

    private void tblCardiacInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCardiacInfoKeyReleased
        // this.currentRecord = tablePatients.getSelectedRow();
        // setRowData();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCardiacInfoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblCardiacInfo;
    // End of variables declaration//GEN-END:variables

    private void setExamDetail() {

        if (listExamDetail.isEmpty()) {
            List<CardiacSurgeryBO> list = new ArrayList<>();
            list.add(new CardiacSurgeryBO());
            tblCardiacInfo.setModel(new ExamDetailTableModel(list));
            return;
        }
        tblCardiacInfo.setModel(new ExamDetailTableModel(listExamDetail));
        ListSelectionModel selectionModel = tblCardiacInfo.getSelectionModel();
        tblCardiacInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setExamDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCardiacInfo);
    }

    private void setExamDetailColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCardiacInfo.getColumnCount(); i++) {
            column = tblCardiacInfo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            }
        }
    }

}
