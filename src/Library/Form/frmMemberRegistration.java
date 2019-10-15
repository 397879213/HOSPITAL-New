package Library.Form;

import BO.MemberReg;
import Library.Controller.MemberRegController;
import Library.TableModel.MemberRegTableModel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;


public class frmMemberRegistration extends javax.swing.JInternalFrame {

    String memberId="";
    String refId;
    String contactNum;
    String name="";
    String DeptId="";
    String instituteId="";
    String typeId="";
    List<MemberReg> LstMem = new ArrayList();
    MemberRegController ctlMem = new MemberRegController();
    MemberReg memReg = new MemberReg();
    int currentSelectedMember=0;
    String  genderId,departId="";
    MemberReg memRegobj = new MemberReg();
    DisplayLOV lov = new DisplayLOV();




    public frmMemberRegistration() {

        initComponents();
        this.setSize(Constants.xSize - 25, Constants.ySize - 28); 
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnRegister.setMnemonic(KeyEvent.VK_R);
        btnUpdate.setMnemonic(KeyEvent.VK_U);
        btnClear.setMnemonic(KeyEvent.VK_C);
        txtMemberId.setEditable(false);
        txtMemberSince.setEditable(false);
        lovColor();
        
        memberId = txtSearchMemberId.getText();
        LstMem = ctlMem.MemberReg(memberId, "", "", "");
        SetInTbl();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSearchResult = new javax.swing.JTable();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSearchMemberId = new javax.swing.JTextField();
        txtSearchContactNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearchReferenceId = new javax.swing.JTextField();
        txtSearchName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtRefID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtInstitute = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtContactNum = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtMaxBookLimit = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCnic = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbActive = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        txtMemberSince = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnShowPic = new javax.swing.JButton();
        btnAttachPic = new javax.swing.JButton();
        txtType = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(Constants.title+"Member Registration" );
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 0));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnClear)
                    .addComponent(btnUpdate)
                    .addComponent(btnRegister))
                .addGap(3, 3, 3))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblSearchResult.setBackground(java.awt.SystemColor.activeCaption);
        tblSearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.", "Member ID", "Name", "Contact No"
            }
        ));
        tblSearchResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchResultMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSearchResultMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSearchResultMouseReleased(evt);
            }
        });
        tblSearchResult.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblSearchResultPropertyChange(evt);
            }
        });
        tblSearchResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSearchResultKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblSearchResult);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Member Id :");

        txtSearchMemberId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchMemberIdActionPerformed(evt);
            }
        });
        txtSearchMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchMemberIdKeyPressed(evt);
            }
        });

        txtSearchContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchContactNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchContactNoMouseReleased(evt);
            }
        });
        txtSearchContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchContactNoActionPerformed(evt);
            }
        });
        txtSearchContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchContactNoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ref ID :");

        txtSearchReferenceId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchReferenceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchReferenceIdActionPerformed(evt);
            }
        });

        txtSearchName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchNameMouseReleased(evt);
            }
        });
        txtSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNameActionPerformed(evt);
            }
        });
        txtSearchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchNameKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Name :");

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtSearchReferenceId))
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(txtSearchName))
                .addGap(5, 5, 5))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtSearchReferenceId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(5, 5, 5))
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Reference ID :");

        txtRefID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRefID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefIDActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNameMouseReleased(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Name :");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Contact No :");

        txtAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAgeMouseReleased(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtInstitute.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtInstitute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtInstituteMouseReleased(evt);
            }
        });
        txtInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstituteActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Age /Gender :");

        txtAgeGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAgeGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeGenderActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Institute :");

        txtContactNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContactNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContactNumMouseReleased(evt);
            }
        });
        txtContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Max Book Limit :");

        txtMaxBookLimit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMaxBookLimit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMaxBookLimitMouseReleased(evt);
            }
        });
        txtMaxBookLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxBookLimitActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Age :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("CNIC :");

        txtCnic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCnic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCnicMouseReleased(evt);
            }
        });
        txtCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnicActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Email Address :");

        txtEmailAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmailAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEmailAddressMouseReleased(evt);
            }
        });
        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Department :");

        txtDepartment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDepartmentMouseReleased(evt);
            }
        });
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Address :");

        txtMemberId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMemberIdMouseReleased(evt);
            }
        });
        txtMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIdActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Member Id :");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Active :");

        cmbActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));
        cmbActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActiveActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Member Since :");

        txtMemberSince.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMemberSince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMemberSinceMouseReleased(evt);
            }
        });
        txtMemberSince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberSinceActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        btnShowPic.setText("Show");

        btnAttachPic.setText("Attach");

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Type :");

        lblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male_user.png"))); // NOI18N
        lblPicture.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInstitute, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMemberSince)
                                .addComponent(txtCnic)
                                .addComponent(txtType)
                                .addComponent(txtAge)
                                .addComponent(txtMaxBookLimit))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                                .addComponent(btnShowPic, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAttachPic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtContactNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgeGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRefID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMemberId)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(cmbActive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRefID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(27, 27, 27)))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel25)
                        .addGap(6, 6, 6)
                        .addComponent(txtMaxBookLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addGap(10, 10, 10)
                        .addComponent(txtMemberSince, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowPic)
                    .addComponent(btnAttachPic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstitute, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(6, 6, 6)
                .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtSearchMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchMemberIdActionPerformed


         if(txtSearchMemberId.getText().trim().length() >= 0){

            LstMem.clear();
            memberId = txtSearchMemberId.getText();
            LstMem = ctlMem.MemberReg(memberId, "", "", "");
            SetInTbl();
         }
         
     txtSearchMemberId.requestFocus();
    }//GEN-LAST:event_txtSearchMemberIdActionPerformed


    private void txtSearchContactNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchContactNoMouseReleased


    }//GEN-LAST:event_txtSearchContactNoMouseReleased

    private void txtSearchContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchContactNoActionPerformed
        contactNum = txtSearchContactNo.getText();

        if(contactNum.length() > 0){
           LstMem.clear();
           LstMem = ctlMem.MemberReg("", "", "", contactNum);
            SetInTbl();
        }
        
        txtSearchContactNo.requestFocus();
    }//GEN-LAST:event_txtSearchContactNoActionPerformed

    private void txtRefIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefIDActionPerformed

         if(txtRefID.getText().trim().length() > 0){

            LstMem.clear();
            refId = txtRefID.getText();

        }
        txtName.requestFocus();
    }//GEN-LAST:event_txtRefIDActionPerformed

    private void txtNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

        txtAge.requestFocus();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtInstituteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInstituteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstituteMouseReleased

    private void txtInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstituteActionPerformed
        lov.LOVDefinitionSelection(DefinitionTypes.department,
                txtInstitute.getText(), this);
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            if(!Constants.lovDescription.equalsIgnoreCase(txtDepartment.getText())){

                 txtInstitute.setText(Constants.lovDescription);
                instituteId = Constants.lovID;
            }else{
                Constants.lovDescription = txtInstitute.getText();

            }}

        txtDepartment.requestFocus();
    }//GEN-LAST:event_txtInstituteActionPerformed

    private void txtAgeGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeGenderActionPerformed

        txtAgeGender.setBackground(Color.white);
        lov.LOVDefinitionSelection(DefinitionTypes.gender,
                txtAgeGender.getText(), this);
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            if(!Constants.lovDescription.equalsIgnoreCase(txtAgeGender.getText())){
                txtAgeGender.setText(Constants.lovDescription);
                genderId = Constants.lovID;
            }else{
                Constants.lovDescription = txtAgeGender.getText();
            }
        }
        txtType.requestFocus();

    }//GEN-LAST:event_txtAgeGenderActionPerformed

    private void txtContactNumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactNumMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumMouseReleased

    private void txtContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumActionPerformed

        txtCnic.requestFocus();
    }//GEN-LAST:event_txtContactNumActionPerformed

    private void txtMaxBookLimitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaxBookLimitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxBookLimitMouseReleased

    private void txtMaxBookLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxBookLimitActionPerformed

        txtInstitute.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxBookLimitActionPerformed

    private void txtCnicMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnicMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicMouseReleased

    private void txtCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnicActionPerformed

        txtMaxBookLimit.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicActionPerformed

    private void tblSearchResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchResultMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchResultMouseClicked

    private void tblSearchResultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchResultMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchResultMousePressed

    private void tblSearchResultMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchResultMouseReleased

        if(tblSearchResult.getSelectedRow() < 0){
            return;
        }

        int SelectedRow = tblSearchResult.getSelectedRow();
        memReg = LstMem.get(SelectedRow);

        txtMemberSince.setEditable(false);

        memberId = memReg.getMemberId();
        genderId = memReg.getGenderId();
        departId = memReg.getDepartId();
        typeId = memReg.getMemberId();
        instituteId = memReg.getInstituteId();

        txtRefID.setText(memReg.getRefId());
        txtMemberId.setText(memReg.getMemberId());
        cmbActive.setSelectedItem(memReg.getActive());
        txtName.setText(memReg.getName());
        txtAge.setText(memReg.getAge());
        txtAgeGender.setText(memReg.getGender());
        txtContactNum.setText(memReg.getContact());
        txtInstitute.setText(memReg.getInstitute());
        txtDepartment.setText(memReg.getDept());
        txtCnic.setText(memReg.getCnic());
        txtMaxBookLimit.setText(memReg.getMaxBook());
        txtEmailAddress.setText(memReg.getEmail());
        txtAddress.setText(memReg.getAddress());
        txtMemberSince.setText(memReg.getMemberSince());
        txtType.setText(memReg.getMemberType());

        Constants.lovID = memReg.getDepartId();
        btnRegister.setEnabled(false);

    }//GEN-LAST:event_tblSearchResultMouseReleased

    private void tblSearchResultPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSearchResultPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchResultPropertyChange

    private void tblSearchResultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSearchResultKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSearchResultKeyPressed

    private void txtEmailAddressMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailAddressMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressMouseReleased

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed

        txtAddress.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtDepartmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepartmentMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentMouseReleased

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed

         lov.LOVDefinitionSelection(DefinitionTypes.department,
                txtDepartment.getText(), this);
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            if(!Constants.lovDescription.equalsIgnoreCase(txtDepartment.getText())){

                 txtDepartment.setText(Constants.lovDescription);
                departId = Constants.lovID;
            }else{
                Constants.lovDescription = txtDepartment.getText();

            }}

         txtEmailAddress.requestFocus();
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void txtSearchNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNameMouseReleased

    private void txtSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNameActionPerformed

         if(txtSearchName.getText().trim().length() >= 0){

            LstMem.clear();
            name = txtSearchName.getText().toUpperCase();
            LstMem = ctlMem.MemberReg("", name, "", "");
            SetInTbl();
         }
        
         txtSearchReferenceId.requestFocus();
    }//GEN-LAST:event_txtSearchNameActionPerformed

    private void txtSearchReferenceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchReferenceIdActionPerformed

        refId = txtSearchReferenceId.getText().toUpperCase();

        if(refId.length() > 0){
        LstMem.clear();
        LstMem = ctlMem.MemberReg("", "", refId, "");
        SetInTbl();

        }
        
    }//GEN-LAST:event_txtSearchReferenceIdActionPerformed

    private void txtSearchMemberIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMemberIdKeyPressed

// TODO add your handling code here:
    }//GEN-LAST:event_txtSearchMemberIdKeyPressed

    private void txtSearchNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNameKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNameKeyPressed

    private void txtSearchContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchContactNoKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchContactNoKeyPressed

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIdActionPerformed


    }//GEN-LAST:event_txtMemberIdActionPerformed

    private void txtMemberIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMemberIdMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIdMouseReleased

    private void cmbActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbActiveActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        if (!verifyFieldData()) {
            return;
        }

        else{

            MemberReg objIns = new MemberReg();
            objIns.setRefId(txtRefID.getText());
            objIns.setName(txtName.getText());
            objIns.setAge(txtAge.getText());
            objIns.setGender(genderId);
            objIns.setContact(txtContactNum.getText());
            objIns.setInstituteId(instituteId);
            objIns.setDept(departId);
            objIns.setCnic(txtCnic.getText());
            objIns.setMaxBook(txtMaxBookLimit.getText());
            objIns.setEmail(txtEmailAddress.getText());
            objIns.setAddress(txtAddress.getText());
            objIns.setActive(cmbActive.getSelectedItem().toString());
            objIns.setMemberTypeId(typeId);

            if(ctlMem.inserteMemberReg(objIns)){
                JOptionPane.showMessageDialog(null, "Register Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Something Went Wrong");
            }

        LstMem = ctlMem.MemberReg("", "", "", "");
        SetInTbl();
        clearField();
        clearForm();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        MemberReg objSave = new MemberReg();

        objSave.setName(txtName.getText());
        objSave.setGenderId(genderId);
        objSave.setMemberId(memberId);
        objSave.setName(txtName.getText());
        objSave.setAge(txtAge.getText());
        objSave.setCnic(txtCnic.getText());
        objSave.setInstituteId(instituteId);
        objSave.setDept(departId);
        objSave.setMaxBook(txtMaxBookLimit.getText());
        objSave.setContact(txtContactNum.getText());
        objSave.setEmail(txtEmailAddress.getText());
        objSave.setAddress(txtAddress.getText());
        objSave.setActive(cmbActive.getSelectedItem().toString());
        objSave.setMemberTypeId(typeId);

        if (ctlMem.UpdateMemberReg(objSave)) {
            JOptionPane.showMessageDialog(null, "Record Saved Successfully");
            LstMem.clear();
            LstMem = ctlMem.MemberReg("", "", "", "");
            SetInTbl();
            clearField();

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save ! Kindly contact administrator");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearField();
        clearForm();
        btnRegister.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        txtAgeGender.requestFocus();

    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseReleased

    private void txtMemberSinceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMemberSinceMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberSinceMouseReleased

    private void txtMemberSinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberSinceActionPerformed
        txtInstitute.requestFocus();
    }//GEN-LAST:event_txtMemberSinceActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        lov.LOVDefinitionSelection(DefinitionTypes.designation,
                txtType.getText(), this);

        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            if(!Constants.lovDescription.equalsIgnoreCase(txtAgeGender.getText())){
                txtType.setText(Constants.lovDescription);
                typeId = Constants.lovID;
            }else{
                Constants.lovDescription = txtType.getText();
            }

            txtContactNum.requestFocus();
        }
    }//GEN-LAST:event_txtTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttachPic;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnShowPic;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbActive;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblSearchResult;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtInstitute;
    private javax.swing.JTextField txtMaxBookLimit;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtMemberSince;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRefID;
    private javax.swing.JTextField txtSearchContactNo;
    private javax.swing.JTextField txtSearchMemberId;
    private javax.swing.JTextField txtSearchName;
    private javax.swing.JTextField txtSearchReferenceId;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

    //new declarations



  public void GetRow(){

            if (tblSearchResult.getSelectedRow() < 0){
                return;
            }

            currentSelectedMember = tblSearchResult.getSelectedRow();
            memRegobj = LstMem.get(currentSelectedMember);
            memberId= memRegobj.getMemberId();

   }


    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtSearchMemberId);
        comp.add(txtRefID);
        comp.add(txtName);
        comp.add(txtAge);
        comp.add(txtInstitute);
        comp.add(txtName);
        GUIUtils.setClear(comp);
        LstMem.clear();
        tblSearchResult.setModel(new MemberRegTableModel(LstMem));
    }

    private void clearField(){
        txtSearchMemberId.setText("");
        txtSearchReferenceId.setText("");
        txtSearchName.setText("");
        txtSearchContactNo.setText("");
        tblSearchResult.setModel(new MemberRegTableModel(LstMem));
        txtRefID.setText("");
        txtMemberId.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtAgeGender.setText("");
        txtContactNum.setText("");
        txtInstitute.setText("");
        txtDepartment.setText("");
        txtCnic.setText("");
        txtMaxBookLimit.setText("");
        txtEmailAddress.setText("");
        txtAddress.setText("");
        txtType.setText("");
        txtMemberSince.setText("");
    }

    private void SetInTbl() {
        tblSearchResult.setModel(new MemberRegTableModel(LstMem));
        Constants.tablelook.setJTableEnvironment(tblSearchResult);
        setTableColWidth();

    }

    private boolean verifyFieldData() {
        if (txtRefID.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Reference ID");
            txtRefID.requestFocus();
            txtRefID.setBackground(Color.red);
            return false;
        }

        if (txtName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Name");
            txtName.requestFocus();
            txtName.setBackground(Color.red);
            return false;
        }

        if (txtAge.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Age");
            txtAge.requestFocus();
            txtAge.setBackground(Color.red);
            return false;
        }

        if (txtAgeGender.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Reference Gender");
            txtAgeGender.requestFocus();
            txtAgeGender.setBackground(Color.red);
            return false;
        }

        if (txtContactNum.getText().trim().length() != 11) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Contact Number");
            txtContactNum.requestFocus();
            txtContactNum.setBackground(Color.red);
            return false;
        }

        if (txtCnic.getText().trim().length() != 13) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Reference CNIC");
            txtCnic.requestFocus();
            txtCnic.setBackground(Color.red);
            return false;
        }

        if (txtMaxBookLimit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Max. Book Limit");
            txtMaxBookLimit.requestFocus();
            txtMaxBookLimit.setBackground(Color.red);
            return false;
        }

        if (txtInstitute.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Institute");
            txtInstitute.requestFocus();
            txtInstitute.setBackground(Color.red);
            return false;
        }

        if (txtDepartment.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Department");
            txtDepartment.requestFocus();
            txtDepartment.setBackground(Color.red);
            return false;
        }

        if (txtEmailAddress.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Email Address");
            txtEmailAddress.requestFocus();
            txtEmailAddress.setBackground(Color.red);
            return false;
        }

        if (txtAddress.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Address");
            txtAddress.requestFocus();
            txtAddress.setBackground(Color.red);
            return false;
        }

        return true;
    }

    private void setTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblSearchResult.getColumnCount(); i++) {
            column = tblSearchResult.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            } else if (i == 2) {
                column.setPreferredWidth(45);
            } else if (i == 3) {
                column.setPreferredWidth(115);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            }else if (i == 5) {
                column.setPreferredWidth(15);
            }
        }
     }

    private void lovColor() {
    
        txtAgeGender.setBackground(Color.green);
        txtType.setBackground(Color.green);
        txtInstitute.setBackground(Color.green);
        txtDepartment.setBackground(Color.green);
        txtType.setBackground(Color.green);
    }

}

