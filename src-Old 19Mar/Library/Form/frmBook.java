package Library.Form;

import Library.BO.BookReg;
import Library.Controller.BookRegController;
import Library.TableModel.BookAuthorsTableModel;
import Library.TableModel.BookRegTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;

public class frmBook extends javax.swing.JInternalFrame {

    BookRegController ctlBookReg = new BookRegController();
    BookReg bookreg = new BookReg();
    DisplayLOV lov = new DisplayLOV();
    List<BookReg> listBook = new ArrayList();
    List<BookReg> listAuthors = new ArrayList();
    String rackId = "";
    String shelfId = "";
    String specialityId = "";
    String categoryId = "";
    String isbnNo = "";
    String bookName = "";
    String authorId = "";
    String bookId = "";
    String categoryName = "";
    String subjectId = "";
    String SubjectName = "";
    String bindingId = "";
    String bindingName = "";
    String publisherId = "";

    private int currentSelectedPatient = 0;

    public frmBook() {

        initComponents();
        this.setSize(Constants.xSize - 125, Constants.ySize - Constants.yExtension - 18);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        cboActive = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtPages = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtIsbnNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBookEdition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRack = new javax.swing.JTextField();
        txtShelf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSubAuthor = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSubject = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBookAuthor = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        txtPublisherName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBindings = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtBookLimit = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtSearchBookName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSearchIsbnNo = new javax.swing.JTextField();
        txtSearchCategory = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSearchAuthor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGetBook = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Book Management");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(940, 680));
        setVisible(true);

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
                .addContainerGap()
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Registeration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Book Name :");

        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });

        cboActive.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Y", "N" }));
        cboActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActiveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Active :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Category :");

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        txtPages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Pages :");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        txtIsbnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Edition :");

        txtBookEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookEditionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Rack :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Shelf :");

        txtRack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRackActionPerformed(evt);
            }
        });

        txtShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShelfActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Author");

        txtAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorNameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("Co-Authors:");

        txtSubAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubAuthorActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Subject :");

        tblBookAuthor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblBookAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]{

            },
            new String [] {"Sr.No","Book Id", "Author Name"}
        ));
        tblBookAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookAuthorMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBookAuthorMouseReleased(evt);
            }
        });
        tblBookAuthor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tblBookAuthorComponentResized(evt);
            }
        });
        tblBookAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblBookAuthorKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblBookAuthor);

        jCheckBox1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 0, 0));
        jCheckBox1.setText(" Ref. Book");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText("Publisher's Name :");

        txtPublisherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublisherNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Binding :");

        txtBindings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBindingsActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Price :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Year :");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtBookLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookLimitActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setText("Book Limit :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("ISBN No :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBindings, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txtYear, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtRack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txtPages)))
                            .addComponent(txtShelf)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBookLimit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIsbnNo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtSubject, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBookEdition, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBookName)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtAuthorName)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPublisherName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtShelf)
                    .addComponent(txtRack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrice)
                    .addComponent(txtPages)
                    .addComponent(txtBindings))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Name:");

        txtSearchBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBookNameActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ISBN No :");

        txtSearchIsbnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIsbnNoActionPerformed(evt);
            }
        });

        txtSearchCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCategoryActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Author :");

        txtSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAuthorActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Category :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(txtSearchAuthor)
                    .addComponent(txtSearchCategory)
                    .addComponent(txtSearchIsbnNo))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchBookName)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchIsbnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tblGetBook.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblGetBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]{

            },
            new String [] {"Sr.No","Book Id", "Book Name", "Shelf ","Rack "}
        ));
        tblGetBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGetBookMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblGetBookMouseReleased(evt);
            }
        });
        tblGetBook.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tblGetBookComponentResized(evt);
            }
        });
        tblGetBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGetBookKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblGetBook);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        bookreg.setBookId(bookId);
        bookreg.setBookName(txtBookName.getText());
        bookreg.setEdition(txtBookEdition.getText());
        bookreg.setPublisherId(publisherId);
        bookreg.setYear(txtYear.getText());
        bookreg.setIsbnNo(txtIsbnNo.getText());
        bookreg.setSubjectId(subjectId);
        bookreg.setCategoryId(categoryId);
        bookreg.setAuthorId(authorId);
        bookreg.setRackId(rackId);
        bookreg.setShelfId(shelfId);
        bookreg.setBookLimitDay(txtBookLimit.getText());
        bookreg.setIsActive(cboActive.getSelectedItem().toString());
        bookreg.setPrice(txtPrice.getText());
        bookreg.setPages(txtPages.getText());
        bookreg.setBindingId(bindingId);
        //txtSearchAuthor.setText(bindingId);

        if (ctlBookReg.insertBook(bookreg)) {
            JOptionPane.showMessageDialog(null, "Book Register Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Something Went Wrong");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (txtBookName.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Book Name Field");
            txtBookName.requestFocus();
            return;
        }
        if (txtCategory.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Category Field");
            txtCategory.requestFocus();
            return;
        }
        setData();
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Update Book.");
        if (confirmation != 0) {
            return;
        }

        if (ctlBookReg.updateBook(bookreg)) {
            JOptionPane.showMessageDialog(null, "Book Update Successfully");
            btnSave.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update Book,Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblGetBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGetBookKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGetBookKeyReleased

    private void tblGetBookComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblGetBookComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGetBookComponentResized

    private void tblGetBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGetBookMouseReleased

        currentSelectedPatient = tblGetBook.getSelectedRow();

        if (tblGetBook.getSelectedRow() < 0 || listBook.isEmpty()) {
            return;
        }

        BookReg currentBook = new BookReg();
        currentBook = listBook.get(currentSelectedPatient);
        bookId = currentBook.getBookId();
        authorId = currentBook.getAuthorId();
        publisherId = currentBook.getPublisherId();
        categoryId = currentBook.getCategoryId();
        txtBookName.setText(currentBook.getBookName());
        txtCategory.setText(currentBook.getCategoryName());
        txtPublisherName.setText(currentBook.getPublisherName());
        txtPrice.setText(currentBook.getPrice());
        txtPages.setText(currentBook.getPages());
        txtAuthorName.setText(currentBook.getAuthorDescription());
        txtRack.setText(currentBook.getRackName());
        txtShelf.setText(currentBook.getShelfName());
        txtIsbnNo.setText(currentBook.getIsbnNo());
        txtCategory.setText(currentBook.getCategoryName());
        txtYear.setText(currentBook.getYear());
        txtSubject.setText(currentBook.getSubjectName());
        txtBookEdition.setText(currentBook.getEdition());
        txtBookLimit.setText(currentBook.getBookLimitDay());
        txtBindings.setText(currentBook.getBindingName());
        cboActive.setSelectedItem(currentBook.getActive());

        GetBookAuthor();
        //txtFromDate.setText(patObj.getFrom);
    }//GEN-LAST:event_tblGetBookMouseReleased

    private void tblGetBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGetBookMouseClicked

    }//GEN-LAST:event_tblGetBookMouseClicked

    private void txtSearchCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCategoryActionPerformed
        String query
                = " SELECT ID , DESCRIPTION  FROM                             \n"
                + Database.DCMS.definitionTypeDetail + "                      \n"
                + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.itemCategory + "' \n"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        categoryId = Constants.lovID;
        txtSearchCategory.setText(Constants.lovDescription);
        if (txtSearchCategory.getText().trim().length() >= 0) {

            txtSearchCategory.setText(Constants.lovDescription);
            listBook = ctlBookReg.SelectBook("", "", categoryId, "");
            tblGetBook.setModel(new BookRegTableModel(listBook));
            setColumnWidth();

        }

    }//GEN-LAST:event_txtSearchCategoryActionPerformed

    private void txtSearchIsbnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIsbnNoActionPerformed
        if (txtSearchIsbnNo.getText().trim().length() >= 0) {

            txtSearchBookName.setText("");
            isbnNo = txtSearchIsbnNo.getText();
            listBook = ctlBookReg.SelectBook("", isbnNo, "", "");
            tblGetBook.setModel(new BookRegTableModel(listBook));
            setColumnWidth();

        }
    }//GEN-LAST:event_txtSearchIsbnNoActionPerformed

    private void txtSearchBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBookNameActionPerformed
        if (txtSearchBookName.getText().trim().length() >= 0) {

            txtSearchIsbnNo.setText("");
            bookName = txtSearchBookName.getText();
            listBook = ctlBookReg.SelectBook(bookName, "", "", "");
            tblGetBook.setModel(new BookRegTableModel(listBook));
            setColumnWidth();

        }
    }//GEN-LAST:event_txtSearchBookNameActionPerformed

    private void tblBookAuthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblBookAuthorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAuthorKeyReleased

    private void tblBookAuthorComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblBookAuthorComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAuthorComponentResized

    private void tblBookAuthorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookAuthorMouseReleased
        currentSelectedPatient = tblBookAuthor.getSelectedRow();

        if (tblBookAuthor.getSelectedRow() < 0 || listAuthors.isEmpty()) {
            return;
        }

        BookReg currentBook = new BookReg();
        currentBook = listAuthors.get(currentSelectedPatient);
        bookId = currentBook.getBookId();
        authorId = currentBook.getAuthorId();
        txtSubAuthor.setText(currentBook.getAuthorDescription());


    }//GEN-LAST:event_tblBookAuthorMouseReleased

    private void tblBookAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookAuthorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBookAuthorMouseClicked

    private void txtSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectActionPerformed
//        lov.LOVDefinitionSelection(DefinitionTypes.librarySubject, txtSubject.getText(), this);
        txtSubject.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            txtSubject.setText(Constants.lovDescription.toUpperCase());
            subjectId = Constants.lovID;
            SubjectName = Constants.lovDescription.toUpperCase();
        }
        txtIsbnNo.requestFocusInWindow();
        txtIsbnNo.moveCaretPosition(0);

    }//GEN-LAST:event_txtSubjectActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        setData();
        if (ctlBookReg.DeleteAuthor(bookreg)) {
            JOptionPane.showMessageDialog(null, "Author Deleted Successfully!");
            GetBookBySearch(bookName, "", "", "");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to delete Author"
                    + "Kindly contact Administrator!");
        }
        GetBookAuthor();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (ctlBookReg.insertBookAuthor(bookreg)) {
            JOptionPane.showMessageDialog(null, "Author is added Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to add Author! "
                    + "Kindly Contact Administrator");
        }
        GetBookAuthor();
        txtSubAuthor.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSubAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubAuthorActionPerformed
        String query
                = " SELECT BA.ID ID ,                                       \n"
                + " BA.DESCRIPTION DESCRIPTION                              \n"
//                + " FROM " + Database.DCMS.bookAuthor + " BA                \n"
                + " ORDER BY BA.ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtSubAuthor.setText(Constants.lovDescription);
        bookreg.setBookId(bookId);
        bookreg.setAuthorId(Constants.lovID);

        GetBookAuthor();


    }//GEN-LAST:event_txtSubAuthorActionPerformed

    private void txtAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorNameActionPerformed
        String query
                = " SELECT BA.ID ID ,                                       \n"
                + " BA.DESCRIPTION DESCRIPTION                              \n"
//                + " FROM " + Database.DCMS.bookAuthor + " BA                \n"
                + " ORDER BY BA.ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtAuthorName.setText(Constants.lovDescription);
        authorId = Constants.lovID;

        txtPublisherName.requestFocusInWindow();
        txtPublisherName.moveCaretPosition(0);
    }//GEN-LAST:event_txtAuthorNameActionPerformed

    private void txtShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShelfActionPerformed

        if (rackId.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Select Rack");
        } else {
            String query
                    = " SELECT SH.ID ID,                                       \n"
                    + " SH.DESCRIPTION DESCRIPTION                         \n"
                    + " FROM EMR.SHELF SH                                      \n"
                    + " WHERE RACK_ID = '" + rackId + "'";

            lov.LOVSelection(query, this);

            if (Constants.lovID.equalsIgnoreCase("ID")) {
                return;
            }
            txtShelf.setText(Constants.lovDescription);
            shelfId = Constants.lovID;

            txtYear.requestFocusInWindow();
            txtYear.moveCaretPosition(0);
        }
    }//GEN-LAST:event_txtShelfActionPerformed

    private void txtRackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRackActionPerformed

        String query
                = " SELECT RA.ID ID ,                                        \n"
                + " RA.DESCRIPTION DESCRIPTION                               \n"
                + " FROM " + Database.DCMS.rack + " RA                        \n"
                + " WHERE LOCATION_ID='001'"
                + " ORDER BY RA.ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtRack.setText(Constants.lovDescription);
        rackId = Constants.lovID;
        Constants.lovID = "";

        txtShelf.requestFocus();
    }//GEN-LAST:event_txtRackActionPerformed

    private void txtBookEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookEditionActionPerformed
        txtAuthorName.requestFocusInWindow();
        txtAuthorName.moveCaretPosition(0);
    }//GEN-LAST:event_txtBookEditionActionPerformed

    private void txtIsbnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnNoActionPerformed
        txtBookEdition.requestFocusInWindow();
        txtBookEdition.moveCaretPosition(0);

    }//GEN-LAST:event_txtIsbnNoActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        txtPages.requestFocusInWindow();
        txtPages.moveCaretPosition(0);
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagesActionPerformed
        txtSubAuthor.requestFocusInWindow();
        txtSubAuthor.moveCaretPosition(0);
    }//GEN-LAST:event_txtPagesActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        lov.LOVDefinitionSelection(DefinitionTypes.itemCategory, txtCategory.getText(), this);
//        txtCategory.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            txtCategory.setText(Constants.lovDescription.toUpperCase());
            categoryId = Constants.lovID;
            categoryName = Constants.lovDescription.toUpperCase();
        }
        txtSubject.requestFocusInWindow();
        txtSubject.moveCaretPosition(0);
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        txtCategory.requestFocus();
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAuthorActionPerformed
        String query
                = " SELECT BA.ID ID ,                                       \n"
                + " BA.DESCRIPTION DESCRIPTION                              \n"
//                + " FROM " + Database.DCMS.bookAuthor + " BA                \n"
                + " ORDER BY BA.ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtSearchAuthor.setText(Constants.lovDescription);

        authorId = Constants.lovID;
        listBook = ctlBookReg.SelectBook("", "", "", authorId);
        tblGetBook.setModel(new BookRegTableModel(listBook));
        setColumnWidth();
    }//GEN-LAST:event_txtSearchAuthorActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPublisherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublisherNameActionPerformed
        String query
                = " SELECT PUB.ID ID ,                                       \n"
                + " PUB.DESCRIPTION DESCRIPTION                              \n"
//                + " FROM " + Database.DCMS.publisher + " PUB                 \n"
                + " ORDER BY PUB.ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtPublisherName.setText(Constants.lovDescription);
        publisherId = Constants.lovID;
        txtRack.requestFocusInWindow();
        txtRack.moveCaretPosition(0);
    }//GEN-LAST:event_txtPublisherNameActionPerformed

    private void txtBindingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBindingsActionPerformed
//        lov.LOVDefinitionSelection(DefinitionTypes.libraryBinding, txtBindings.getText(), this);
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            txtBindings.setText(Constants.lovDescription.toUpperCase());
            bindingId = Constants.lovID;
            bindingName = Constants.lovDescription.toUpperCase();
        }
        txtPrice.requestFocusInWindow();
        txtPrice.moveCaretPosition(0);
    }//GEN-LAST:event_txtBindingsActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        txtBookLimit.requestFocusInWindow();
        txtBookLimit.moveCaretPosition(0);
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtBookLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookLimitActionPerformed
        txtBindings.requestFocusInWindow();
        txtBindings.moveCaretPosition(0);
    }//GEN-LAST:event_txtBookLimitActionPerformed

    private void cboActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActiveActionPerformed


    }//GEN-LAST:event_cboActiveActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
       if (cboActive.getSelectedItem().toString().length() >= 0){
        txtBookLimit.setEnabled(false);   
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cboActive;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblBookAuthor;
    private javax.swing.JTable tblGetBook;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtBindings;
    private javax.swing.JTextField txtBookEdition;
    private javax.swing.JTextField txtBookLimit;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtIsbnNo;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPublisherName;
    private javax.swing.JTextField txtRack;
    private javax.swing.JTextField txtSearchAuthor;
    private javax.swing.JTextField txtSearchBookName;
    private javax.swing.JTextField txtSearchCategory;
    private javax.swing.JTextField txtSearchIsbnNo;
    private javax.swing.JTextField txtShelf;
    private javax.swing.JTextField txtSubAuthor;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void GetBookBySearch(String bookName, String isbnNo,
            String categoryId, String author) {
        listBook = ctlBookReg.SelectBook(bookName, isbnNo, categoryId, author);

        BookReg order = new BookReg();
        if (!listBook.isEmpty()) {
            order = listBook.get(0);
        }
        //txtBookName.setText(order.getBookName().trim());

        if (listBook.isEmpty()) {

            tblGetBook.setModel(new BookRegTableModel(listBook));
        } else {
            tblGetBook.setModel(new BookRegTableModel(listBook));
        }
        ListSelectionModel selectionModel = tblGetBook.getSelectionModel();
        tblGetBook.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsSearchBook();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblGetBook);
    }

    public void setColumnsWidthsSearchBook() {

        TableColumn column = null;
        for (int i = 0; i < tblGetBook.getColumnCount(); i++) {
            column = tblGetBook.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(110);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void GetBookAuthor() {
        listAuthors = ctlBookReg.getBookAuthor(bookId);

        BookReg author = new BookReg();
        if (!listAuthors.isEmpty()) {
            author = listAuthors.get(0);
        }

        if (listAuthors.isEmpty()) {

            tblBookAuthor.setModel(new BookAuthorsTableModel(listAuthors));
        } else {
            tblBookAuthor.setModel(new BookAuthorsTableModel(listAuthors));
        }
        ListSelectionModel selectionModel = tblBookAuthor.getSelectionModel();
        tblBookAuthor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsBookAuthor();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblBookAuthor);

    }

    public void setColumnsWidthsBookAuthor() {

        TableColumn column = null;
        for (int i = 0; i < tblBookAuthor.getColumnCount(); i++) {
            column = tblBookAuthor.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(8);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            }
        }
    }

    public void clearForm() {

        List<JComponent> clist = new ArrayList<>();

        clist.add(txtAuthorName);
        clist.add(txtSubAuthor);
        clist.add(txtBindings);
        clist.add(txtSubject);
        clist.add(txtYear);
        clist.add(txtBookLimit);
        clist.add(txtBookEdition);
        clist.add(txtCategory);
        clist.add(txtIsbnNo);
        clist.add(txtBookName);
        clist.add(txtPublisherName);
        clist.add(txtRack);
        clist.add(txtShelf);
        clist.add(txtPrice);
        clist.add(txtPages);
        clist.add(txtSearchAuthor);
        clist.add(txtSearchBookName);
        clist.add(txtSearchCategory);
        clist.add(txtSearchIsbnNo);
        listBook.clear();
        listAuthors.clear();
        tblGetBook.setModel(new BookRegTableModel(listBook));
        tblBookAuthor.setModel(new BookAuthorsTableModel(listAuthors));

        GUIUtils.setClear(clist);
    }

    private void setData() {
        bookreg.setBookId(bookId);
        bookreg.setBookName(txtBookName.getText());
        bookreg.setCategoryId(categoryId);
        bookreg.setSubjectId(subjectId);
        bookreg.setIsbnNo(txtIsbnNo.getText());
        bookreg.setEdition(txtBookEdition.getText());
        bookreg.setAuthorId(authorId);
        bookreg.setPublisherId(publisherId);
        bookreg.setRackId(rackId);
        bookreg.setShelfId(shelfId);
        bookreg.setYear(txtYear.getText());
        bookreg.setBookLimitDay(txtBookLimit.getText());
        bookreg.setBindingId(bindingId);
        bookreg.setPrice(txtPrice.getText());
        bookreg.setPages(txtPages.getText());
        bookreg.setActive(cboActive.getSelectedItem().toString());

    }

    private void setColumnWidth() {
       
        TableColumn column = null;
        for (int i = 0; i < tblBookAuthor.getColumnCount(); i++) {
            column = tblBookAuthor.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            }else if (i == 2) {
                column.setPreferredWidth(120);
            }else if (i == 3) {
                column.setPreferredWidth(60);
            }else if (i == 4) {
                column.setPreferredWidth(60);
            }
        }
    }

}
