package Library.Form;


import Library.BO.AuthorRegBO;
import Library.Controller.AuthorRegController;
import Library.TableModel.AuthorTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;

public class frmAuthorRegs extends javax.swing.JInternalFrame {
    
    

    public frmAuthorRegs() {

        initComponents();
        
     this.setSize(Constants.xSize - 420, Constants.ySize  - 107);
      btnClear.setMnemonic(KeyEvent.VK_C);
      btnExit.setMnemonic(KeyEvent.VK_X);

    }
    
    DisplayLOV lov = new DisplayLOV();
    AuthorRegController ctlAuthorReg = new AuthorRegController();
    AuthorRegBO objBo = new AuthorRegBO();
            
    
    List<AuthorRegBO> lstauthorReg = new ArrayList();
    String authorID;
    String authorName;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        btnAuthorAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDescrip = new javax.swing.JLabel();
        txtsearchdesc = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSearchAuthor = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtEditAuthor = new javax.swing.JTextField();
        lblEditDescrip = new javax.swing.JLabel();
        btnEditAuthor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Author Registration");
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
                .addGap(18, 18, 18)
                .addComponent(lblPacsLink, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Author Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Author", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        lblName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 0, 0));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Author Name :");
        lblName.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorNameActionPerformed(evt);
            }
        });

        btnAuthorAdd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAuthorAdd.setText("Add");
        btnAuthorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAuthorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAuthorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Author", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        lblDescrip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescrip.setForeground(new java.awt.Color(102, 0, 0));
        lblDescrip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescrip.setText("Description :");

        txtsearchdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchdescActionPerformed(evt);
            }
        });

        tblSearchAuthor.setBackground(java.awt.SystemColor.activeCaption);
        tblSearchAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {"BOOK_ID","BOOK_NAME"}));
    tblSearchAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblSearchAuthorMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tblSearchAuthorMousePressed(evt);
        }
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            tblSearchAuthorMouseReleased(evt);
        }
    });
    tblSearchAuthor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblSearchAuthorPropertyChange(evt);
        }
    });
    tblSearchAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblSearchAuthorKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblSearchAuthorKeyReleased(evt);
        }
    });
    jScrollPane7.setViewportView(tblSearchAuthor);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(lblDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtsearchdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtsearchdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Author", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    txtEditAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEditAuthorActionPerformed(evt);
        }
    });

    lblEditDescrip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    lblEditDescrip.setForeground(new java.awt.Color(102, 0, 0));
    lblEditDescrip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblEditDescrip.setText("Description :");

    btnEditAuthor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnEditAuthor.setText("Edit");
    btnEditAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditAuthorActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblEditDescrip, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(txtEditAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnEditAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(lblEditDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEditAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(209, 209, 209))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorNameActionPerformed

        
    }//GEN-LAST:event_txtAuthorNameActionPerformed

    private void txtsearchdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchdescActionPerformed
  
//        String query = " SELECT ID, DESCRIPTION "
//                + " FROM " + Database.DCMS.bookAuthor + " \n"
//                + " WHERE DESCRIPTION LIKE '%"
//                + txtsearchdesc.getText().toUpperCase().trim() + "%'"
//                + " ORDER BY ID";
//        
//        lov.LOVSelection(query, this);
//        
//        if (Constants.lovID.equalsIgnoreCase("ID")){
//            return;
//         }
//        
//        authorID = Constants.lovID;
        authorName = txtsearchdesc.getText().toUpperCase();
        
        txtsearchdesc.setText(authorName);
        
        
        lstauthorReg = ctlAuthorReg.Authorinfo(authorName);
       setDataIntable();
    }//GEN-LAST:event_txtsearchdescActionPerformed

    private void tblSearchAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchAuthorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchAuthorMouseClicked

    private void tblSearchAuthorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchAuthorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchAuthorMousePressed

    private void tblSearchAuthorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchAuthorMouseReleased

        int row = tblSearchAuthor.getSelectedRow();
        
        objBo = lstauthorReg.get(row);
        txtEditAuthor.setText(objBo.getAuthorDescription());
    }//GEN-LAST:event_tblSearchAuthorMouseReleased

    private void tblSearchAuthorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSearchAuthorPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchAuthorPropertyChange

    private void tblSearchAuthorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSearchAuthorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchAuthorKeyPressed

    private void tblSearchAuthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSearchAuthorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchAuthorKeyReleased

    private void txtEditAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditAuthorActionPerformed

    private void btnAuthorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorAddActionPerformed
        
        objBo.setAuthorDescription(txtAuthorName.getText().toUpperCase());
        
        if(ctlAuthorReg.insertAuthorReg(objBo)){
                JOptionPane.showMessageDialog(null, "Register Successfully");
            }
        else{
                JOptionPane.showMessageDialog(null, "Something Went Wrong");
            }
        txtAuthorName.setText("");
    }//GEN-LAST:event_btnAuthorAddActionPerformed

    private void btnEditAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAuthorActionPerformed
       objBo.setAuthorDescription(txtEditAuthor.getText().toUpperCase());
        
//        if(ctlAuthorReg.UpdateAuthorReg(objBo)){
//                JOptionPane.showMessageDialog(null, "Update Successfully");
//            }
//        else{
//                JOptionPane.showMessageDialog(null, "Something Went Wrong. \n Kindly Contact Administrator");
//            }
        
        txtAuthorName.setText("");
        txtEditAuthor.setText("");
        txtsearchdesc.setText("");
        
        setDataIntable();
    }//GEN-LAST:event_btnEditAuthorActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtAuthorName.setText("");
       txtEditAuthor.setText("");
       txtsearchdesc.setText("");
       lstauthorReg.clear();
       tblSearchAuthor.setModel(new AuthorTableModel(lstauthorReg));
      
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthorAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEditAuthor;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblDescrip;
    private javax.swing.JLabel lblEditDescrip;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblSearchAuthor;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtEditAuthor;
    private javax.swing.JTextField txtsearchdesc;
    // End of variables declaration//GEN-END:variables

    private void setDataIntable() {
        
        tblSearchAuthor.setModel(new AuthorTableModel(lstauthorReg));
        Constants.tablelook.setJTableEnvironment(tblSearchAuthor);
        
            TableColumn column;
        for (int i = 0; i < tblSearchAuthor.getColumnCount(); i++) {
            column = tblSearchAuthor.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(15);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            }
        }
    }

}
