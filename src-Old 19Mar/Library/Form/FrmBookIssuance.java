package Library.Form;

import Library.BO.BookIssue;
import Library.Controller.BookIssuanceController;
import Library.TableModel.BookIssuanceHistoryTableModel;
import Library.TableModel.BookIssuanceTableModel;
import Library.TableModel.BookRegTableModel;
import Library.TableModel.RecentIssuedTableModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class FrmBookIssuance extends javax.swing.JInternalFrame {

    //Initialization.
    private String memberId = "";
    private String hisMemberId = "";
    int selectedRow = 0;
    private List<BookIssue> lstMemInfo = new ArrayList();
    private List<BookIssue> lstOrderInfo = new ArrayList();
    private List<BookIssue> lstRecentIssued = new ArrayList();
    private List<BookIssue> lstIssuedHistory = new ArrayList();
    private List<BookIssue> lstOrderDetail = new ArrayList();
    
    //Objects.
    private BookIssue objBO = new BookIssue();
    BookIssuanceController ctlBookIssue = new BookIssuanceController();
    DisplayLOV lov = new DisplayLOV();
    private String bookId;
    private String bookName;
            
    
    public FrmBookIssuance() {
       
       
        initComponents();
     this.setSize(Constants.xSize + 95 , Constants.ySize  - 123);
     txtMemName.setEditable(false);
     txtMemDep.setEditable(false);
     txtMemContact.setEditable(false);
     txtMemType.setEditable(false);
     txtTotalBook.setEditable(false);
     txtMemHisName.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtMemID = new javax.swing.JTextField();
        txtMemDep = new javax.swing.JTextField();
        txtMemContact = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        txtMemName = new javax.swing.JTextField();
        btnNewMember = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtMemType = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblBookIssue = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        txtBookDesc = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtTotalBook = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnBookIssue = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtMemHis = new javax.swing.JTextField();
        lblMemHis = new javax.swing.JLabel();
        txtMemHisName = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblBookIssuehis = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblBookAllHis = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(635, 690));
        setRequestFocusEnabled(false);
        setVisible(true);

        jPanel52.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Issued", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel53.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Department :");

        jLabel62.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Name :");

        jLabel63.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Contact No :");

        txtMemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemIDjTextField1ActionPerformed(evt);
            }
        });

        txtMemDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemDepjTextField3ActionPerformed(evt);
            }
        });

        txtMemContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemContactjTextField4ActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl.setForeground(new java.awt.Color(102, 0, 0));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl.setText("Member Id :");

        txtMemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemNamejTextField1ActionPerformed(evt);
            }
        });

        btnNewMember.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnNewMember.setForeground(new java.awt.Color(102, 0, 0));
        btnNewMember.setText("New");
        btnNewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMemberActionPerformed(evt);
            }
        });

        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male_user.png"))); // NOI18N
        lblPicture.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel65.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Type :");

        txtMemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemTypejTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addComponent(txtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtMemName)))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemType, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMemDep, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtMemContact))))
                .addGap(5, 5, 5)
                .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemDep, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel57.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel57.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblBookIssue.setBackground(java.awt.SystemColor.activeCaption);
        tblBookIssue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblBookIssue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Member Id","Book Id","Book Name","Issued Date","Issued By"
            }
        ));
        tblBookIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookIssueMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBookIssueMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBookIssueMouseReleased(evt);
            }
        });
        tblBookIssue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblBookIssuePropertyChange(evt);
            }
        });
        tblBookIssue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblBookIssueKeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(tblBookIssue);

        jLabel66.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("Description :");

        txtBookDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookDescActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Total Books :");

        txtTotalBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalBookActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBookIssue.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBookIssue.setText("Issue");
        btnBookIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookIssueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel57Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalBook, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBookDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBookDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalBook, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Books History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtMemHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemHisjTextField1ActionPerformed(evt);
            }
        });

        lblMemHis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMemHis.setForeground(new java.awt.Color(102, 0, 0));
        lblMemHis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMemHis.setText("Member Id :");

        txtMemHisName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemHisNamejTextField1ActionPerformed(evt);
            }
        });

        tblBookIssuehis.setBackground(java.awt.SystemColor.activeCaption);
        tblBookIssuehis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblBookIssuehis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Member Id","Book Id","Book Name","Issued Date","Issued By"
            }
        ));
        tblBookIssuehis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookIssuehisMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBookIssuehisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBookIssuehisMouseReleased(evt);
            }
        });
        tblBookIssuehis.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblBookIssuehisPropertyChange(evt);
            }
        });
        tblBookIssuehis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblBookIssuehisKeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(tblBookIssuehis);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMemHis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemHis, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemHisName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemHis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMemHis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemHisName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblBookAllHis.setBackground(java.awt.SystemColor.activeCaption);
        tblBookAllHis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblBookAllHis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Member Id","Book Id","Book Name","Issued Date","Issued By"
            }
        ));
        tblBookAllHis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookAllHisMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBookAllHisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBookAllHisMouseReleased(evt);
            }
        });
        tblBookAllHis.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblBookAllHisPropertyChange(evt);
            }
        });
        tblBookAllHis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblBookAllHisKeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(tblBookAllHis);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane17)
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnClear.setLabel("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(475, 475, 475))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        lblPacsLink.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblPacsLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPacsLink.setForeground(new java.awt.Color(0, 102, 102));
        lblPacsLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacsLink.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemIDjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemIDjTextField1ActionPerformed
        
        if(txtMemID.getText().trim().length() > 0){

            memberId = txtMemID.getText();
            lstMemInfo = ctlBookIssue.Memberinfo(memberId);
            setMemberinfo();
            txtBookDesc.requestFocus();
            
        }
           
    }//GEN-LAST:event_txtMemIDjTextField1ActionPerformed

    private void txtMemDepjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemDepjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemDepjTextField3ActionPerformed

    private void txtMemContactjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemContactjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemContactjTextField4ActionPerformed

    private void btnBookIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookIssueActionPerformed
        if (!verifyFieldData()) {
            return;
        }

        else{
//lstOrderDetail
            BookIssue objIns = new BookIssue();
            objIns.setMemberId(memberId);
            objIns.setBookId("");
            if(ctlBookIssue.insertOrderInfo(objBO, lstOrderDetail)){
                JOptionPane.showMessageDialog(null, "Book(s) issued Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Something Went Wrong");
            }
        }
        
        clear();
    }//GEN-LAST:event_btnBookIssueActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblBookIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookIssueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssueMouseClicked

    private void tblBookIssueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookIssueMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssueMousePressed

    private void tblBookIssueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookIssueMouseReleased
        selectedRow = tblBookIssue.getSelectedRow();
    }//GEN-LAST:event_tblBookIssueMouseReleased

    private void tblBookIssuePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBookIssuePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssuePropertyChange

    private void tblBookIssueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookIssueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssueKeyPressed

    private void txtBookDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookDescActionPerformed
     
        String query = " SELECT ID, LB.BOOK_NAME DESCRIPTION FROM       \n"
//                + Database.DCMS.book + "     LB                         \n"
                + " WHERE LB.BOOK_NAME LIKE '%"
                + txtBookDesc.getText().toUpperCase().trim() + "%'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        
        bookId = Constants.lovID;
        bookName = Constants.lovDescription;
        
        BookIssue objBookBO = ctlBookIssue.OrderInfo(bookId);
        
        System.out.println("order book info : " + lstOrderInfo.size());
        
        lstOrderDetail.add(new BookIssue(objBookBO.getBookId(), objBookBO.getBookName(),
                                         objBookBO.getSubject(), objBookBO.getEdition(),
                                         objBookBO.getAuthorName(), objBookBO.getMemberId()));
        displayOrderInformation();
        objBookBO.setMemberId(memberId);
        txtMemDep.setText(objBookBO.getMemberId());
        txtTotalBook.setText(Integer.toString(lstOrderDetail.size()));
        System.out.println("order info : " + lstOrderDetail.size());
    }//GEN-LAST:event_txtBookDescActionPerformed

    private void txtMemNamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemNamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemNamejTextField1ActionPerformed

    private void btnNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewMemberActionPerformed

    private void txtMemTypejTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemTypejTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemTypejTextField4ActionPerformed

    private void txtTotalBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalBookActionPerformed
         
    }//GEN-LAST:event_txtTotalBookActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if (tblBookIssue.getSelectedRow() < 0||lstOrderDetail.isEmpty()) {
            return;
        }
        
        else 
        {
            lstOrderDetail.remove(selectedRow);
        }
        displayOrderInformation();
        txtTotalBook.setText(Integer.toString(lstOrderDetail.size()));
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtMemHisjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemHisjTextField1ActionPerformed
        
        BookIssue data = new BookIssue();
//        
//        String hisMemberId = txtMemHis.getText();
//       txtMemContact.setText(hisMemberId);
//        
        
        if(txtMemHis.getText().trim().length() > 0){

            hisMemberId = txtMemHis.getText();
            lstMemInfo = ctlBookIssue.Memberinfo(hisMemberId);
            
            setMemName();
        }
        
        memberId = txtMemHis.getText();
        currentIssuedBooks();
        previousIssueHistory();
        
        
    }//GEN-LAST:event_txtMemHisjTextField1ActionPerformed

    private void txtMemHisNamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemHisNamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemHisNamejTextField1ActionPerformed

    private void tblBookIssuehisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookIssuehisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssuehisMouseClicked

    private void tblBookIssuehisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookIssuehisMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssuehisMousePressed

    private void tblBookIssuehisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookIssuehisMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssuehisMouseReleased

    private void tblBookIssuehisPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBookIssuehisPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssuehisPropertyChange

    private void tblBookIssuehisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookIssuehisKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookIssuehisKeyPressed

    private void tblBookAllHisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookAllHisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAllHisMouseClicked

    private void tblBookAllHisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookAllHisMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAllHisMousePressed

    private void tblBookAllHisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookAllHisMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAllHisMouseReleased

    private void tblBookAllHisPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBookAllHisPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAllHisPropertyChange

    private void tblBookAllHisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookAllHisKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAllHisKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookIssue;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewMember;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblMemHis;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTable tblBookAllHis;
    private javax.swing.JTable tblBookIssue;
    private javax.swing.JTable tblBookIssuehis;
    private javax.swing.JTextField txtBookDesc;
    private javax.swing.JTextField txtMemContact;
    private javax.swing.JTextField txtMemDep;
    private javax.swing.JTextField txtMemHis;
    private javax.swing.JTextField txtMemHisName;
    private javax.swing.JTextField txtMemID;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JTextField txtMemType;
    private javax.swing.JTextField txtTotalBook;
    // End of variables declaration//GEN-END:variables

    private void setMemberinfo() {
      List lis = ctlBookIssue.Memberinfo(memberId);
      objBO = (BookIssue) lis.get(0);
      txtMemContact.setText(objBO.getContactNo());
      txtMemName.setText(objBO.getName());
      txtMemDep.setText(objBO.getDepartmentDescription());
      txtMemType.setText(objBO.getTypeDescription());
    } 
    
     
     

    private void setInTable() {
    
        tblBookIssue.setModel(new BookIssuanceTableModel(lstOrderInfo));
        Constants.tablelook.setJTableEnvironment(tblBookIssue);
        setTableColWidth();
    }

    private void setTableColWidth() {
    
        TableColumn column;
        for (int i = 0; i < tblBookIssue.getColumnCount(); i++) {
            column = tblBookIssue.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(2);
            } else if (i == 1) {
                column.setPreferredWidth(10);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(30);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void previousIssueHistory() {
        
        lstIssuedHistory = ctlBookIssue.bookIssueHistory(memberId);
        tblBookAllHis.setModel(new BookIssuanceHistoryTableModel(lstIssuedHistory));
        Constants.tablelook.setJTableEnvironment(tblBookAllHis);
        txtMemHisName.setText(objBO.getName());
        System.out.println("list history : " + lstIssuedHistory.size());
        
        TableColumn column;
        for (int i = 0; i < tblBookAllHis.getColumnCount(); i++) {
            column = tblBookAllHis.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            } else if (i == 5) {
                column.setPreferredWidth(80);
            } 
        }
    }

    private void displayOrderInformation() {
    
        tblBookIssue.setModel(new BookIssuanceTableModel(lstOrderDetail));
        tblBookIssue.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel selectionModel = tblBookIssue.getSelectionModel();
        selectionModel.setSelectionInterval(0, 0);
        tblBookIssue.addRowSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblBookIssue);
        setTableColWidth();
    }

    private boolean verifyFieldData() {
     
        if (txtMemID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Address");
            txtMemID.requestFocus();
            txtMemID.setBackground(Color.red);
            return false;
        }

        return true;
        
    }

    private void setMemName() {
    
       List lis = ctlBookIssue.Memberinfo(hisMemberId);
      objBO = (BookIssue) lis.get(0);
//      txtMemContact.setText(objBO.getContactNo());
//      txtMemHisName.setText(objBO.getName());
//S      txtMemDep.setText(objBO.getDepartmentDescription());
//      txtMemType.setText(objBO.getTypeDescription());
    }

    private void currentIssuedBooks() {
      
        lstRecentIssued = ctlBookIssue.recentIssued(memberId);
        tblBookIssuehis.setModel(new RecentIssuedTableModel(lstRecentIssued));
        Constants.tablelook.setJTableEnvironment(tblBookIssuehis);
        
        
        TableColumn column;
        for (int i = 0; i < tblBookIssuehis.getColumnCount(); i++) {
            column = tblBookIssuehis.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void clear() {
    
        txtBookDesc.setText("");
        txtMemContact.setText("");
        txtMemDep.setText("");
        txtMemHis.setText("");
        txtMemHisName.setText("");
        txtMemID.setText("");
        txtMemName.setText("");
        txtMemType.setText("");
        txtTotalBook.setText("");
        
        lstIssuedHistory.clear();
        lstMemInfo.clear();
        lstOrderDetail.clear();
        lstOrderInfo.clear();
        lstRecentIssued.clear();
        
        tblBookIssue.setModel(new BookIssuanceTableModel(lstOrderDetail));
        tblBookIssuehis.setModel(new RecentIssuedTableModel(lstRecentIssued));
        tblBookAllHis.setModel(new BookIssuanceHistoryTableModel(lstIssuedHistory));
    }

}
