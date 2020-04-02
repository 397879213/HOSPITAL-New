package Form.general;

import BO.GroupForm;
import BO.SetupColumnDetail;
import java.util.Vector;
import javax.swing.JComponent;
import utilities.Constants;
import BO.User;

import TableModel.UserTableModel;

import Controller.UserController;
import Controller.UserGroupController;
import static Form.general.frmUserSetting.currentUser;
import Handler.UserHandler;
import TableModel.Administration.DefineUserPropertiesModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.Forms;
import utilities.GUIUtils;
import utilities.Rights;
import utilities.TypeDetailId;

public class frmDefineUser extends javax.swing.JInternalFrame {

    private int currentRecord;
    public static List<User> vecUsers = new ArrayList<>();
    GroupForm groupForm = new GroupForm();
    UserGroupController ctlUserGroup = new UserGroupController();
    List<SetupColumnDetail> listProperties = new ArrayList();

    public frmDefineUser() {

        initComponents();

        this.setSize(Constants.xSize, Constants.ySize - 130);
        disableFormActionAbleComponents();
        this.enableFormActionAbleComponents();
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSearch.setMnemonic(KeyEvent.VK_R);
        btnCreateUser.setMnemonic(KeyEvent.VK_T);
        btnCreateUser.setEnabled(true);
        btnSave.setEnabled(true);
        txtLocation.setEnabled(true);
        txtUserName.setEnabled(true);
        txtUserFullName.setEnabled(true);

        btnChangePassword.setEnabled(true);
        cboActive.setEnabled(true);
        btnCopyRights.setEnabled(true);
        txtPassword.setEnabled(true);
        txtConfirmPassword.setEnabled(true);

        if (Constants.userRightsMap.get(Rights.btnCreateUser_defineUser) == null) {
            btnCreateUser.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.btnSave_defineUser) == null) {
            btnSave.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.btnChangePassword_defineUser) == null) {
            btnChangePassword.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.cboActive_defineUser) == null) {
            cboActive.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.btnCopyRights_defineUser) == null) {
            btnCopyRights.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.txtPassword_defineUser) == null) {
            txtPassword.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.txtConfrimPassword_defineUser) == null) {
            txtConfirmPassword.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.txtLocation_defineUser) == null) {
            txtLocation.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.txtUserId_defineUser) == null) {
            txtUserName.setEnabled(false);
        }
        if (Constants.userRightsMap.get(Rights.txtUserName_defineUser) == null) {
            txtUserFullName.setEnabled(false);
        }
        btnEditLoginId.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.updateUserLoginId) == null) {
            btnEditLoginId.setEnabled(false);
        }
        
        btnManageRights.setEnabled(false);
        if (Constants.userId.equalsIgnoreCase("PLC")
                || Constants.userId.equalsIgnoreCase("MISSION")) {
            btnManageRights.setEnabled(true);
        }
        txtUserName.requestFocusInWindow();
        txtUserName.setCaretPosition(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPatientDetail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserFullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboType = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cboActive = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtLocation = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        btnChangePassword = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnCreateUser = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCopyRights = new javax.swing.JButton();
        btnEditLoginId = new javax.swing.JButton();
        btnDefaultColor = new javax.swing.JButton();
        btnManageRights = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtSearchUserId = new javax.swing.JTextField();
        txtSearchUserFullName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSearchDesignation = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtSearchUserName = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtSearchDepartment = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSearchSection = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtUserId1 = new javax.swing.JTextField();
        txtDesignation1 = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtUserId2 = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtDesignation2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblProperties = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"User Registration");
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

        pnlPatientDetail.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPatientDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("User Full Name :");

        txtUserFullName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserFullNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Location:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("User Name:");

        cboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Type","General","Faculty","Visiting-Faculty","WMC", "POF", "NON"}));
        cboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTypeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Active: ");

        cboActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Password:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Confirm Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setText("Login Id");

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        btnChangePassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnChangePassword.setText("Change");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordCreate_User(evt);
            }
        });

        javax.swing.GroupLayout pnlPatientDetailLayout = new javax.swing.GroupLayout(pnlPatientDetail);
        pnlPatientDetail.setLayout(pnlPatientDetailLayout);
        pnlPatientDetailLayout.setHorizontalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                        .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtConfirmPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChangePassword))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPatientDetailLayout.createSequentialGroup()
                        .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName)
                            .addComponent(txtUserFullName)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboActive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtUserId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLocation)
                            .addComponent(cboType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlPatientDetailLayout.setVerticalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboType)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(1, 1, 1)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePassword))
                .addGap(8, 8, 8))
        );

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
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        btnCreateUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreateUser.setText("Register");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_User(evt);
            }
        });

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
        btnExit.setMaximumSize(new java.awt.Dimension(53, 30));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_User_Form(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Edit");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_User(evt);
            }
        });

        btnCopyRights.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCopyRights.setText("Copy Rights");
        btnCopyRights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyRightsCreate_User(evt);
            }
        });

        btnEditLoginId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditLoginId.setText("Edit Login Id");
        btnEditLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditLoginIdCreate_User(evt);
            }
        });

        btnDefaultColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDefaultColor.setText("Set Default Color");
        btnDefaultColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultColorActionPerformed(evt);
            }
        });

        btnManageRights.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnManageRights.setText("Manage");
        btnManageRights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRightsCreate_User(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnDefaultColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopyRights, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageRights, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnCreateUser)
                    .addComponent(btnSave)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopyRights)
                    .addComponent(btnEditLoginId)
                    .addComponent(btnDefaultColor)
                    .addComponent(btnManageRights)))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search  Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null}
            },
            new String [] {
                "User Name", "User Id", "Designation","Location","Active"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableUserMouseReleased(evt);
            }
        });
        tableUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableUserKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Login ID:");

        txtSearchUserId.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSearchUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchUserIdActionPerformed(evt);
            }
        });

        txtSearchUserFullName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSearchUserFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchUserFullNameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText(" Name:");

        txtSearchDesignation.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSearchDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDesignationActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Designation:");

        btnSearch.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setText("User Name:");

        txtSearchUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchUserNameActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setText("Department:");

        txtSearchDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDepartmentActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Section:");

        txtSearchSection.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSearchSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSearchUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtSearchUserId)
                    .addComponent(txtSearchSection))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearchDesignation)
                    .addComponent(txtSearchUserFullName)
                    .addComponent(txtSearchDepartment))
                .addGap(10, 10, 10))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchUserId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchUserFullName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtSearchUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchDepartment, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchSection, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchDesignation, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addComponent(btnSearch))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("From User Id:");

        txtUserId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserId1ActionPerformed(evt);
            }
        });

        txtUserId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserId2ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("To User Id:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserId1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtUserId2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(txtName2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesignation1)
                    .addComponent(txtDesignation2))
                .addGap(11, 11, 11))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserId1)
                        .addComponent(txtName1)
                        .addComponent(txtDesignation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserId2)
                    .addComponent(txtName2)
                    .addComponent(txtDesignation2))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblProperties.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "User ID","User Name","Designation","Location","Active"}
        ));
        tblProperties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPropertiesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPropertiesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPropertiesMouseReleased(evt);
            }
        });
        tblProperties.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPropertiesKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblProperties);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlPatientDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
    DisplayLOV lov = new DisplayLOV();

    private void txtSearchUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchUserIdActionPerformed
        searchUser();

    }//GEN-LAST:event_txtSearchUserIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        this.clearForm();
        clearSearchPanel();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void Create_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_User

        if (txtUserId.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter User Id");
            return;
        }
        if (Constants.hrEnable.equalsIgnoreCase("Y")) {
            if (!ctlUser.getEmployee(txtUserId.getText().trim())) {
                updateUserData("CREATE");
            } else {
                JOptionPane.showMessageDialog(null, "Can't Create User, Employee Is Not Registered");
            }
        } else {
            updateUserData("CREATE");
        }
    }//GEN-LAST:event_Create_User

    private void Update_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_User

        updateUserData("UPDATE");

    }//GEN-LAST:event_Update_User

    private void Exit_User_Form(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_User_Form
        this.dispose();
    }//GEN-LAST:event_Exit_User_Form

    private void txtSearchUserFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchUserFullNameActionPerformed

        searchUser();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchUserFullNameActionPerformed

    private void txtSearchDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDesignationActionPerformed

        String query = "SELECT ID ID, DESCRIPTION FROM "
                + Database.DCMS.definitionTypeDetail + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.designation + "'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            txtSearchDesignation.setText(Constants.lovDescription);
            designationId = Constants.lovID;
            txtSearchDesignation.requestFocusInWindow();
            txtSearchDesignation.setCaretPosition(0);
            searchUser();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchDesignationActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed

        txtLocation.requestFocusInWindow();
        txtLocation.setCaretPosition(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void cboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTypeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        searchUser();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseReleased
        // TODO add your handling code here:
        currentRecord = tableUser.getSelectedRow();
        if (currentRecord < 0 || vecUsers.isEmpty()) {
            return;
        }
        user = (User) vecUsers.get(currentRecord);
        userId = user.getUserId();
        selectUserProperties();
        txtUserFullName.setText(user.getName());
        txtUserName.setText(user.getUserName());
        txtUserId.setText(user.getUserId());
        cboActive.setSelectedItem(user.getActive());
        cboType.setSelectedItem(user.getType());
        if (user.getType().equalsIgnoreCase(TypeDetailId.faculty)) {
            cboType.setSelectedIndex(2);
        }
        if (user.getType().equalsIgnoreCase(TypeDetailId.nonFaculty)) {
            cboType.setSelectedIndex(3);
        }

        txtLocation.setText(user.getLocationName());
        txtPassword.setText(user.getCurrentPassword());
        txtConfirmPassword.setText(user.getCurrentPassword());
        txtUserName.setEnabled(false);

        locationId = user.getLocationId();
        departmentId = user.getDepartmentId();

    }//GEN-LAST:event_tableUserMouseReleased

    private void tableUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableUserKeyReleased

        if (tableUser.getSelectedRow() < 0) {
            return;
        }
        if (!vecUsers.isEmpty()) {
            User usr = (User) vecUsers.get(tableUser.getSelectedRow());
            txtUserFullName.setText(usr.getUserName());
            txtUserName.setText(usr.getName());
            cboActive.setSelectedItem(usr.getActive());
            cboType.setSelectedItem(usr.getType());
            //Disable the Username Text So that they cannot edit it;
            txtUserFullName.setEnabled(false);
        }

    }//GEN-LAST:event_tableUserKeyReleased

    private void txtUserFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserFullNameActionPerformed
        txtUserName.requestFocusInWindow();
        txtUserName.setCaretPosition(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserFullNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

        txtConfirmPassword.requestFocusInWindow();
        txtConfirmPassword.setCaretPosition(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed

        lov.LOVGeneralSelection(Database.DCMS.location,
                txtLocation.getText().toUpperCase().trim(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtLocation.setText("");
        } else {
            txtLocation.setText(Constants.lovDescription.toUpperCase());
            user.setLocationName(Constants.lovDescription);
//            user.setLocationId(Constants.lovID);
            locationId = Constants.lovID;
            if (!locationId.equalsIgnoreCase(user.getLocationId())) {
                user.setLocationId(Constants.lovID);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSearchUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchUserNameActionPerformed
        // TODO add your handling code here:
        searchUser();


    }//GEN-LAST:event_txtSearchUserNameActionPerformed

    private void txtSearchDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDepartmentActionPerformed

        String query
                = "  SELECT ID , DESCRIPTION  FROM \n"
                + Database.DCMS.department + " LOC \n"
                + " WHERE ID IN (SELECT DEPARTMENT_ID FROM  "
                + Database.DCMS.locationWiseDepartment + " LWD \n"
                + " WHERE LWD.LOCATION_ID = '" + locationId + "') \n"
                + " AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtSearchDepartment.setText(Constants.lovDescription);
        departmentId = Constants.lovID;
        txtSearchSection.requestFocusInWindow();
        txtSearchSection.setCaretPosition(0);
        searchUser();

    }//GEN-LAST:event_txtSearchDepartmentActionPerformed

    private void txtSearchSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSectionActionPerformed

        String query = "SELECT SECTION_ID ID, DESCRIPTION FROM "
                + Database.DCMS.section + " WHERE DEPARTMENT_ID = '" + departmentId + "'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            txtSearchSection.setText(Constants.lovDescription);
            sectionId = Constants.lovID;
            txtSearchDesignation.requestFocusInWindow();
            txtSearchDesignation.setCaretPosition(0);
            searchUser();

        }
    }//GEN-LAST:event_txtSearchSectionActionPerformed

    private void btnChangePasswordCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordCreate_User
        if (txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter new password");
            txtPassword.requestFocusInWindow();
            txtPassword.setCaretPosition(0);
            return;
        }
        if (!txtConfirmPassword.getText().equalsIgnoreCase(txtPassword.getText())) {
            JOptionPane.showMessageDialog(null, "Kindly enter same password");
            txtConfirmPassword.requestFocusInWindow();
            txtConfirmPassword.setCaretPosition(0);
            return;
        }

        User user = new User();
        UserHandler userHandler = new UserHandler();
        //String oldPassword = JOptionPane.showInputDialog("Enter your old password");

        user.setPassword(txtPassword.getText());
        user.setConfirmPassword(txtConfirmPassword.getText());
        user.setUserName(txtUserName.getText().trim().toUpperCase());

        if (userHandler.updateUserPassword(user)) {
            {
                JOptionPane.showMessageDialog(null, "Password has successfully changed");
                userHandler.insertPasswordChangeHistory(user);
                currentUser = user;
                clearForm();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Unable to update data Please Contact Administrator");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePasswordCreate_User
    String fromUser = "";
    String toUser = "";
    String cptId = "";
    private void txtUserId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserId1ActionPerformed
        // TODO add your handling code here:

        String query = "SELECT USER_NAME, NAME, DESCRIPTION FROM "
                + Database.DCMS.users + " , "
                + Database.DCMS.designation
                + " WHERE DESIGNATION_ID = ID "
                + " AND USER_NAME LIKE '%" + txtUserId1.getText().toUpperCase() + "%'";
        lov.LOVSpecializedSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtUserId1.setText("");
        } else {
            txtUserId1.setText(Constants.lovID.toUpperCase());
            groupForm.setRoleId(Constants.lovID);
            txtName1.setText(Constants.lovDescription);
            txtDesignation1.setText(Constants.userDesignation);
            fromUser = Constants.lovID;

            txtUserId2.requestFocusInWindow();
            txtUserId2.setCaretPosition(0);

        }
    }//GEN-LAST:event_txtUserId1ActionPerformed

    private void txtUserId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserId2ActionPerformed

        Constants.lovDescription = "DESCRIPTION";
        Constants.lovID = "ID";
        String query = "SELECT USER_NAME, NAME, DESCRIPTION FROM "
                + Database.DCMS.users + " , "
                + Database.DCMS.designation
                + " WHERE DESIGNATION_ID = ID "
                + " AND USER_NAME LIKE '%" + txtUserId2.getText().toUpperCase() + "%'";

        lov.LOVSpecializedSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtUserId2.setText("");
        } else {
            txtUserId2.setText(Constants.lovID.toUpperCase());
            groupForm.setRoleId(Constants.lovID);
            txtName2.setText(Constants.lovDescription);
            txtDesignation2.setText(Constants.userDesignation);
            toUser = Constants.lovID;
        }
    }//GEN-LAST:event_txtUserId2ActionPerformed

    private void btnCopyRightsCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyRightsCreate_User
        if (fromUser.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select From User to Copy Rights");
            return;
        }
        if (toUser.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select To User to Copy Rights");
            return;
        }
        if (ctlUserGroup.copyLocationDepartStorePerformingRights(fromUser, toUser)) {
            JOptionPane.showMessageDialog(null, "Copy User Rights Successfully");
            //txtUserId1.setText("");
            //txtName1.setText("");
            //txtDesignation1.setText("");
            txtUserId2.setText("");
            txtName2.setText("");
            txtDesignation2.setText("");
            //fromUser = "";
            toUser = "";

        } else {
            JOptionPane.showMessageDialog(null, "Unable to copy user Rights Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnCopyRightsCreate_User

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnEditLoginIdCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditLoginIdCreate_User

        if (currentRecord < 0 || vecUsers.isEmpty()) {
            return;
        }
        user = (User) vecUsers.get(currentRecord);
        if (txtUserId.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter User Login Id");
            return;
        }
        int i = JOptionPane.showConfirmDialog(null, " you are going to change user login Id to "
                + txtUserId.getText().trim() + " from " + user.getUserId());

        if (i != 0) {
            return;
        }
        user.setUserId(txtUserId.getText().trim());
        if (ctlUser.updateLoginId(user)) {
            JOptionPane.showMessageDialog(null, "User Login Id Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update, Kindly Contact Administrator");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditLoginIdCreate_User

    private void btnDefaultColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultColorActionPerformed
        // TODO add your handling code here:
        if (currentRecord < 0 || vecUsers.isEmpty()) {
            return;
        }
        user = (User) vecUsers.get(currentRecord);
        int i = JOptionPane.showConfirmDialog(null, " you are going to "
                + " change user default color scheme of selected user ");
        if (i != 0) {
            return;
        }
        if (ctlUser.setUserDefaultColor(user)) {
            JOptionPane.showMessageDialog(null, "Default Coloros Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update, Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnDefaultColorActionPerformed

    private void btnManageRightsCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRightsCreate_User
        // TODO add your handling code here:
        UserApplicationRights fm = new UserApplicationRights();
//        DCMS_MDI.desktopPane.add(fm);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = fm.getSize();
//        fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        fm.setVisible(true);


    }//GEN-LAST:event_btnManageRightsCreate_User

    private void tblPropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMouseClicked

    private void tblPropertiesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMousePressed

    private void tblPropertiesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMouseReleased

    private void tblPropertiesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPropertiesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesKeyReleased

    public void searchUser() {

        User search = new User();
        search.setUserName(txtSearchUserName.getText().toUpperCase());
        search.setName(txtSearchUserFullName.getText().toUpperCase());
        search.setDesignation(txtSearchDesignation.getText().toUpperCase());
        search.setSection(txtSearchSection.getText().toUpperCase());
        search.setDepartment(txtSearchDepartment.getText().toUpperCase());
        search.setUserId(txtSearchUserId.getText().toUpperCase());

        if (txtSearchDepartment.getText().length() == 0) {
            departmentId = "";
        }
        if (txtSearchSection.getText().length() == 0) {
            sectionId = "";
        }
        if (txtSearchDesignation.getText().length() == 0) {
            designationId = "";
        }
        vecUsers = this.ctlUser.searchUser(search);

        if (vecUsers.isEmpty()) {
            Vector vec = new Vector();
            User emptyUser = new User();
            vec.add(emptyUser);
            tableUser.setModel(new UserTableModel(vec));

        } else {
            tableUser.setModel(new UserTableModel(vecUsers));
        }
        tableUser.addRowSelectionInterval(0, 0);
        setTablesColumnsWidths();
        ListSelectionModel selectionModel = tableUser.getSelectionModel();
        tableUser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, currentRecord);
        Constants.tablelook.setJTableEnvironment(tableUser);
        this.currentRecord = 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCopyRights;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDefaultColor;
    private javax.swing.JButton btnEditLoginId;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageRights;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cboActive;
    private javax.swing.JComboBox cboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JPanel pnlPatientDetail;
    private javax.swing.JTable tableUser;
    private javax.swing.JTable tblProperties;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtDesignation1;
    private javax.swing.JTextField txtDesignation2;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchDepartment;
    private javax.swing.JTextField txtSearchDesignation;
    private javax.swing.JTextField txtSearchSection;
    private javax.swing.JTextField txtSearchUserFullName;
    private javax.swing.JTextField txtSearchUserId;
    private javax.swing.JTextField txtSearchUserName;
    private javax.swing.JTextField txtUserFullName;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserId1;
    private javax.swing.JTextField txtUserId2;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
    public String orderFormTitle = "Define User";
    User user = new User();
    UserController ctlUser = new UserController();
    public String locationId = "";
    public String departmentId = "";
    public String sectionId = "";
    public String designationId = "";
    public String userId = "";

    public void clearForm() {

        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtConfirmPassword);
        //comp.add(txtContact);
        comp.add(txtLocation);
        comp.add(txtUserName);
        comp.add(txtUserFullName);
        comp.add(txtPassword);
        comp.add(cboActive);
        comp.add(cboType);
        GUIUtils.setClear(comp);
    }

    public void clearSearchPanel() {

        txtSearchSection.setText("");
        txtSearchDesignation.setText("");
        txtSearchUserId.setText("");
        txtSearchUserFullName.setText("");
        Vector vec = new Vector();
        User empty = new User();
        vec.add(empty);
        tableUser.setModel(new UserTableModel(vec));
        user = new User();
    }

    public boolean verifyOrderData() {
        return false;

    }
    public Vector myComponents = new Vector();

    private void disableFormActionAbleComponents() {

        for (int i = 0; i < myComponents.size(); i++) {
            ((JComponent) myComponents.get(i)).setEnabled(false);
        }
    }
    String formId = Forms.orderInvoice + "_";

    private void enableFormActionAbleComponents() {

        for (int i = 0; i < myComponents.size(); i++) {
            if (Constants.hashComponent.get(formId
                    + (((JComponent) myComponents.get(i)).getToolTipText())) != null) {
                ((JComponent) myComponents.get(i)).setEnabled(true);
            }
            ((JComponent) myComponents.get(i)).setToolTipText("");
        }
    }

    public void updateUserData(String action) {

        boolean registered = true;
        if (action.equalsIgnoreCase("UPDATE")) {
            registered = false;
        }
        if (cboType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select User Type");
            return;
        }
        if (verifyUserData(registered)) {
            user.setUserName(txtUserName.getText().trim().toUpperCase());
            user.setName(txtUserFullName.getText().trim().toUpperCase());
            user.setNewPassword(txtPassword.getText());
            user.setType(cboType.getSelectedItem().toString());
            user.setActive(cboActive.getSelectedItem().toString());
            user.setType(cboType.getSelectedItem().toString());

            if (cboType.getSelectedIndex() == 2) {
                user.setType(TypeDetailId.faculty);
            }
            if (cboType.getSelectedIndex() == 3) {
                user.setType(TypeDetailId.nonFaculty);
            }

            if (action.equalsIgnoreCase("CREATE")) {
                if (!txtPassword.getText().equals(txtConfirmPassword.getText())) {
                    JOptionPane.showMessageDialog(null, "Both Password are not equal");
                    return;
                }

                if (!ctlUser.createUser(user)) {
                    JOptionPane.showMessageDialog(null, "Unable to create User Kindly Contact "
                            + "Administrator");
                    return;
                }
                clearForm();
            } else if (action.equalsIgnoreCase("UPDATE") && ctlUser.updateUserDataUser(user)) {
                clearForm();
                tableUser.setModel(new UserTableModel(vecUsers));
                setTablesColumnsWidths();
                ListSelectionModel selectionModel = tableUser.getSelectionModel();
                tableUser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                selectionModel.setSelectionInterval(0, currentRecord);
                Constants.tablelook.setJTableEnvironment(tableUser);
                this.currentRecord = 0;
                JOptionPane.showMessageDialog(null, "Save Record Successfully");
                txtUserFullName.requestFocus();
                txtUserFullName.setCaretPosition(0);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save Record Kindly Contact Administrator");
            }
        }
    }

    private void setTablesColumnsWidths() {

        TableColumn column = null;
        for (int i = 0; i < tableUser.getColumnCount(); i++) {
            column = tableUser.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50); //third column is bigger
            } else if (i == 1) {
                column.setPreferredWidth(180);
            } else if (i == 2) {
                //column.setPreferredWidth(20);
            }
        }
    }

    public boolean verifyUserData(boolean registered) {

        boolean ret = true;
        if (txtUserName.getText().equalsIgnoreCase("")) {
            txtUserName.setBackground(Color.red);
            ret = false;
        }
        if (txtUserFullName.getText().equalsIgnoreCase("")) {
            txtUserFullName.setBackground(Color.red);
            ret = false;
        }
        if (registered && txtPassword.getText().equalsIgnoreCase("")) {
            txtPassword.setBackground(Color.red);
            ret = false;
        }
        if (registered && txtConfirmPassword.getText().equalsIgnoreCase("")) {
            txtConfirmPassword.setBackground(Color.red);
            ret = false;
        }//
        if (user.getLocationId().trim().length() == 0) {
            txtLocation.setBackground(Color.red);
            ret = false;
        }
        
        return ret;
    }
    
    private void selectUserProperties() {
        listProperties = ctlUserGroup.selectUserProprties(userId);
        if (listProperties.isEmpty()) {
            List<SetupColumnDetail> listProperties = new ArrayList();
            listProperties.add(new SetupColumnDetail());
            tblProperties.setModel(new DefineUserPropertiesModel(listProperties));
        } else {
            tblProperties.setModel(new DefineUserPropertiesModel(listProperties));
            ListSelectionModel selectionModel = tblProperties.getSelectionModel();
            tblProperties.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setUserInformationColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblProperties);
        }
    }

    private void setUserInformationColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblProperties.getColumnCount(); i++) {
            column = tblProperties.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(250);
            } else if (i == 3) {
                column.setPreferredWidth(300);
            }
        }
    }
}
