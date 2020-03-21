package Library.Form;

 
import BO.GroupForm;
import Library.BO.BookIssue;
import Library.Controller.MemberBookStatusHistoryController;
import TableModel.GeneralTableLookAndFeel;
import Library.TableModel.MemberBookIssuanceHistoryTableModel;
import Library.TableModel.MemberRecentIssuedTableModel;
import java.awt.event.KeyEvent;
 
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;
import utilities.Status;

public class frmMemberBookStatusHistory extends javax.swing.JInternalFrame {

    //Objects Deleration.
    DisplayLOV lov = new DisplayLOV();
    BookIssue objBO = new BookIssue();
    
    //Variable Deleration.
    String memberId = "";
    
  
      public frmMemberBookStatusHistory() {

        initComponents();
         
        //Setting Mnemonic.
        btnExitAssign.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
 
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel()
        ;
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCurrentStatus = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel()
        ;
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblBookHistory = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        txtMemberName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExitAssign = new javax.swing.JButton();

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

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Member Book History");
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Book History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recently Issued Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblCurrentStatus.setBackground(java.awt.SystemColor.activeCaption);
        tblCurrentStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {"Book ID", "Book Description"}));
    tblCurrentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblCurrentStatusMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tblCurrentStatusMousePressed(evt);
        }
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            tblCurrentStatusMouseReleased(evt);
        }
    });
    tblCurrentStatus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblCurrentStatusPropertyChange(evt);
        }
    });
    tblCurrentStatus.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblCurrentStatusKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblCurrentStatusKeyReleased(evt);
        }
    });
    jScrollPane6.setViewportView(tblCurrentStatus);

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane6)
    );
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
    );

    jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Issued History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    tblBookHistory.setBackground(java.awt.SystemColor.activeCaption);
    tblBookHistory.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null}
        },
        new String [] {"BOOK_ID","BOOK_NAME"}));
tblBookHistory.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblBookHistoryMouseClicked(evt);
    }
    public void mousePressed(java.awt.event.MouseEvent evt) {
        tblBookHistoryMousePressed(evt);
    }
    public void mouseReleased(java.awt.event.MouseEvent evt) {
        tblBookHistoryMouseReleased(evt);
    }
    });
    tblBookHistory.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblBookHistoryPropertyChange(evt);
        }
    });
    tblBookHistory.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblBookHistoryKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblBookHistoryKeyReleased(evt);
        }
    });
    jScrollPane7.setViewportView(tblBookHistory);

    javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
    jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
    );
    jPanel14Layout.setVerticalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    jLabel8.setBackground(new java.awt.Color(255, 255, 255));
    jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(102, 0, 0));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Member Id:");
    jLabel8.setToolTipText("");

    txtMemberId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtMemberId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtMemberIdActionPerformed(evt);
        }
    });
    txtMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtMemberIdKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtMemberIdKeyTyped(evt);
        }
    });

    txtMemberName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtMemberName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtMemberNameActionPerformed(evt);
        }
    });
    txtMemberName.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtMemberNameKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtMemberNameKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(39, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMemberId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addComponent(txtMemberName, javax.swing.GroupLayout.Alignment.LEADING))
            .addGap(5, 5, 5))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(0, 102, 102));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText(Constants.footerAllScreens);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
    );

    jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    jPanel12.setForeground(new java.awt.Color(255, 255, 255));

    btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnClear.setText("Clear");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
        }
    });

    btnExitAssign.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnExitAssign.setForeground(new java.awt.Color(102, 0, 0));
    btnExitAssign.setText("Exit");
    btnExitAssign.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExitAssignActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnExitAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(177, 177, 177))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExitAssign)
                .addComponent(btnClear))
            .addGap(3, 3, 3))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCurrentStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCurrentStatusMouseClicked
}//GEN-LAST:event_tblCurrentStatusMouseClicked

    private void tblCurrentStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCurrentStatusMousePressed
        // TODO add your handling code here:
}//GEN-LAST:event_tblCurrentStatusMousePressed

    /**
     * Populate the data in form wise columns
     *
     * Vector vecGroup=new Vector();
     */
    private void tblCurrentStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCurrentStatusMouseReleased
 
}//GEN-LAST:event_tblCurrentStatusMouseReleased

    private void tblCurrentStatusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCurrentStatusPropertyChange
        // TODO add your handling code here:
}//GEN-LAST:event_tblCurrentStatusPropertyChange

    private void tblCurrentStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCurrentStatusKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_tblCurrentStatusKeyPressed

    private void tblCurrentStatusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCurrentStatusKeyReleased
    }//GEN-LAST:event_tblCurrentStatusKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //call clear Form 
        clear();
}//GEN-LAST:event_btnClearActionPerformed

    private void btnExitAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAssignActionPerformed

        this.dispose();
}//GEN-LAST:event_btnExitAssignActionPerformed

   
    

    
    private void tblBookHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookHistoryMouseClicked

    private void tblBookHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookHistoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookHistoryMousePressed

    private void tblBookHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookHistoryMouseReleased


       
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookHistoryMouseReleased

    private void tblBookHistoryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBookHistoryPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookHistoryPropertyChange

    private void tblBookHistoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookHistoryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookHistoryKeyPressed

    private void tblBookHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookHistoryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookHistoryKeyReleased

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIdActionPerformed
         
        //Declear the memberID
        memberId = txtMemberId.getText();
        selectMemberHistory();
        selectCurrentMemberStatus();
        setMemberInfo();
        
        
    }//GEN-LAST:event_txtMemberIdActionPerformed

    private void txtMemberIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIdKeyPressed

    private void txtMemberIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIdKeyTyped

    private void txtMemberNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberNameActionPerformed

    private void txtMemberNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberNameKeyPressed

    private void txtMemberNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExitAssign;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblBookHistory;
    private javax.swing.JTable tblCurrentStatus;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtMemberName;
    // End of variables declaration//GEN-END:variables

    
    List<BookIssue> listStatusHistory = new ArrayList<>();
    List<BookIssue> listMemberHistory = new ArrayList<>();
    MemberBookStatusHistoryController ctlMemberBookStatusHistory = new MemberBookStatusHistoryController();
    
    private void selectCurrentMemberStatus() {
        
        listStatusHistory = ctlMemberBookStatusHistory.selectCurrentMemberStatus(memberId);
        
        if (listStatusHistory.isEmpty()) {

            List list = new ArrayList();
            BookIssue usr = new BookIssue();
            list.add(usr);
            tblCurrentStatus.setModel(new MemberRecentIssuedTableModel(list));
        } else {
            tblCurrentStatus.setModel(new MemberRecentIssuedTableModel(listStatusHistory));
        }

        tblCurrentStatus.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblCurrentStatus.getSelectionModel();
        tblCurrentStatus.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCurrentStatus);
        
        //Setting column width.
        TableColumn column = null;
        for (int i = 0; i < tblCurrentStatus.getColumnCount(); i++) {
            column = tblCurrentStatus.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(15);
             } else if (i == 1) {
                column.setPreferredWidth(250);
            }else if (i == 2) {
                column.setPreferredWidth(35);
            }else if (i == 3) {
                column.setPreferredWidth(100);
            }else if (i == 4) {
                column.setPreferredWidth(100);
            }   
        }
    }

    private void selectMemberHistory() {
        
        listMemberHistory = ctlMemberBookStatusHistory.selectMemberHistory(memberId);
                
                        
        if (listMemberHistory.isEmpty()) {

            List list = new ArrayList();
            BookIssue usr = new BookIssue();
            list.add(usr);
            tblBookHistory.setModel(new MemberBookIssuanceHistoryTableModel(list));
        } else {
            tblBookHistory.setModel(new MemberBookIssuanceHistoryTableModel(listMemberHistory));
        }

        tblBookHistory.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblBookHistory.getSelectionModel();
        tblBookHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblBookHistory);     
        
        //Setting column width.
        TableColumn column = null;
        for (int i = 0; i < tblBookHistory.getColumnCount(); i++) {
            column = tblBookHistory.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(15);
             } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(25);
            }else if (i == 3) {
                column.setPreferredWidth(60);
            }else if (i == 4) {
                column.setPreferredWidth(60);
            }else if (i == 5) {
                column.setPreferredWidth(80);
            }  
        }
    }

    private void setMemberInfo() {
        
        List lis = ctlMemberBookStatusHistory.Memberinfo(memberId);
      objBO = (BookIssue) lis.get(0);
      txtMemberName.setText(objBO.getName());
    }

    private void clear() {
        
        //text field clear
        txtMemberId.setText("");
        txtMemberName.setText("");
        
        //Clear List.
        listMemberHistory.clear();
        listStatusHistory.clear();
        
        //Cleat Table Model.
        tblBookHistory.setModel(new MemberBookIssuanceHistoryTableModel(listMemberHistory));
        tblCurrentStatus.setModel(new MemberRecentIssuedTableModel(listStatusHistory));
    }
        
}

 

    



 
   

