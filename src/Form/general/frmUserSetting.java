package Form.general;

import BO.LOV;
import BO.User;
import Controller.OPDController;
import Handler.UserHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.Rights;
import utilities.UserActions;

public class frmUserSetting extends javax.swing.JInternalFrame {

    static User currentUser = new User();
    UserHandler userHandler = new UserHandler();
    DisplayLOV lov = new DisplayLOV();
    private String fromUser = "";
    private String fromUserId = "";
    private String toUserId = Constants.userId;
    private String toUser = Constants.userFullName;

    public frmUserSetting() {
        initComponents();
        setUserInfromation();
        setcboMedicineIntakeType();
        txtToUser.setText(toUser);
        txtToUser.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.txtToUserRightsCopy) == null) {
            txtToUser.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserDoseSetting = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCurrentPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        chkMedicineInstructionReq = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cboDoseType = new javax.swing.JComboBox<>();
        cboIntakeType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtFromUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtToUser = new javax.swing.JTextField();
        chkUnverifyPasswordRequired = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtFontSize = new javax.swing.JTextField();
        cboUserCopyType = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnEditSetting = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSave1 = new javax.swing.JButton();
        btnEditSetting1 = new javax.swing.JButton();
        btnEditSetting2 = new javax.swing.JButton();
        btnEditSetting3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setTitle(Constants.title+" Change Profile");

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Intake Type : ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("New Password:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText(" Dose Setting : ");

        txtUserDoseSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserDoseSettingActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Confirm Password:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Current Password:");

        txtCurrentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentPasswordActionPerformed(evt);
            }
        });

        chkMedicineInstructionReq.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkMedicineInstructionReq.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkMedicineInstructionReq.setText("  Med Instruction Required");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Dose Type Id : ");

        cboDoseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Med Abrev.", "In Words", "Syrup","Drops","Quantity" }));
        cboDoseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDoseTypeActionPerformed(evt);
            }
        });

        cboIntakeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Med Abrev.", "In Words", "Syrup","Drops","Quantity" }));
        cboIntakeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIntakeTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("To User : ");

        txtFromUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromUserActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("From User : ");

        txtToUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToUserActionPerformed(evt);
            }
        });

        chkUnverifyPasswordRequired.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkUnverifyPasswordRequired.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkUnverifyPasswordRequired.setText("Unverify Password Required");
        chkUnverifyPasswordRequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUnverifyPasswordRequiredActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Font  :  ");

        txtFontSize.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cboUserCopyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Copy Type", "Replace User", "Add User"}));
        cboUserCopyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUserCopyTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboIntakeType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtFontSize))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(chkUnverifyPasswordRequired, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chkMedicineInstructionReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cboDoseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtConfirmPassword)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtCurrentPassword))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(txtUserDoseSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtFromUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(txtToUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboUserCopyType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtConfirmPassword))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUserDoseSetting)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDoseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMedicineInstructionReq)
                    .addComponent(cboIntakeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToUser)
                    .addComponent(chkUnverifyPasswordRequired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFromUser)
                    .addComponent(cboUserCopyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        btnEditSetting.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditSetting.setText("Edit Setting");
        btnEditSetting.setMaximumSize(new java.awt.Dimension(51, 23));
        btnEditSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSettingActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Change Password");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit2.setForeground(new java.awt.Color(204, 0, 0));
        btnExit2.setText("Exit");
        btnExit2.setMaximumSize(new java.awt.Dimension(51, 23));
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEditSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        lblUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        btnSave1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave1.setText("Medicine Group");
        btnSave1.setEnabled(false);
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnEditSetting1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditSetting1.setText("Favorites");
        btnEditSetting1.setEnabled(false);
        btnEditSetting1.setMaximumSize(new java.awt.Dimension(51, 23));
        btnEditSetting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSetting1ActionPerformed(evt);
            }
        });

        btnEditSetting2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditSetting2.setText("Shortcuts");
        btnEditSetting2.setEnabled(false);
        btnEditSetting2.setMaximumSize(new java.awt.Dimension(51, 23));
        btnEditSetting2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSetting2ActionPerformed(evt);
            }
        });

        btnEditSetting3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditSetting3.setText("Reporting Template");
        btnEditSetting3.setEnabled(false);
        btnEditSetting3.setMaximumSize(new java.awt.Dimension(51, 23));
        btnEditSetting3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSetting3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditSetting1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditSetting2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditSetting3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditSetting3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave1)
                        .addComponent(btnEditSetting1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditSetting2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSettingActionPerformed

        try {
            Integer.parseInt(txtUserDoseSetting.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Medicine Duration");
            txtUserDoseSetting.requestFocus();
            return;
        }
        if (Integer.parseInt(txtUserDoseSetting.getText().trim()) > 30
                || Integer.parseInt(txtUserDoseSetting.getText().trim()) < 1) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Medicine Duration");
            txtUserDoseSetting.requestFocus();
            return;
        }
        try {
            Integer.parseInt(txtFontSize.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Font Size");
            txtUserDoseSetting.requestFocus();
            return;
        }
        if (Integer.parseInt(txtFontSize.getText().trim()) > 16
                || Integer.parseInt(txtFontSize.getText().trim()) < 10) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Font Size");
            txtFontSize.requestFocus();
            return;
        }
        UserActions.userFontSize = Integer.parseInt(txtFontSize.getText().trim());
        UserActions.userMedicineDuration = txtUserDoseSetting.getText().trim();
        UserActions.isMedicineInstructionRequired = chkMedicineInstructionReq.isSelected();
        UserActions.userMedIntakeType = Integer.parseInt(mapIntakeType.get(intakeType));
        String medInst = "N";
        if (UserActions.isMedicineInstructionRequired) {
            medInst = "Y";
        }
        if (userHandler.updateUserSetting(Constants.userId, medInst,
                UserActions.userMedicineDuration,
                "" + (cboDoseType.getSelectedIndex() + 1))) {
            JOptionPane.showMessageDialog(null, "Configuration Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Record, Please Contact Administrator");
        }
        // TODO add your handling code here:
}//GEN-LAST:event_btnEditSettingActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (txtNewPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter new password");
            txtNewPassword.requestFocusInWindow();
            txtNewPassword.setCaretPosition(0);
            return;
        }
        if (!txtConfirmPassword.getText().equalsIgnoreCase(txtNewPassword.getText())) {
            JOptionPane.showMessageDialog(null, "Kindly enter same password");
            txtConfirmPassword.requestFocusInWindow();
            txtConfirmPassword.setCaretPosition(0);
            return;
        }
        User user = new User();
        user.setName(txtName.getText().trim().toUpperCase());
        user.setNewPassword(txtNewPassword.getText());
        user.setCurrentPassword(txtCurrentPassword.getText());
        //user.setEmailAddress(txtEmail.getText().trim().toUpperCase());
        user.setContactNo(txtUserDoseSetting.getText().trim().toUpperCase());

        user.setUserName(Constants.userId);
        if (userHandler.updateUserInformation(user)) {
            if (Constants.totalRowsUpdates == 0) {
                JOptionPane.showMessageDialog(null, "Unable to update user information due to bad password");
            } else {
                JOptionPane.showMessageDialog(null, "Password has successfully changed");
                currentUser = user;
                clearForm();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Unable to update data Please Contact Administrator");
        }

        // TODO add your handling code here:
}//GEN-LAST:event_btnSaveActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.dispose();

        // TODO add your handling code here:
}//GEN-LAST:event_btnExit2ActionPerformed

    private void txtCurrentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentPasswordActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

        txtNewPassword.requestFocusInWindow();
        txtNewPassword.setCaretPosition(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUserDoseSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserDoseSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserDoseSettingActionPerformed

    private void cboIntakeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIntakeTypeActionPerformed
        // TODO add your handling code here:
        intakeType = cboIntakeType.getSelectedItem().toString();

    }//GEN-LAST:event_cboIntakeTypeActionPerformed

    private void txtFromUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromUserActionPerformed
        // TODO add your handling code here:

        String query = "SELECT USER_NAME ID, NAME||' ( '||USER_ID||' )' "
                + " DESCRIPTION FROM " + Database.DCMS.users
                + " WHERE ACTIVE = 'Y' "
                + " AND USER_NAME != '" + toUserId + "'";
        lov.LOVSelection(query, this);
        fromUserId = "";
        if (Constants.lovID.equalsIgnoreCase("ID")) {

        }
        fromUserId = Constants.lovID;
        fromUser = Constants.lovDescription;
        txtFromUser.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtFromUserActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnEditSetting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSetting1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSetting1ActionPerformed

    private void btnEditSetting2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSetting2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSetting2ActionPerformed

    private void btnEditSetting3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSetting3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSetting3ActionPerformed

    private void txtToUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToUserActionPerformed
        // TODO add your handling code here:

        String query = " SELECT USER_NAME ID, NAME||'( '||USER_ID||' )' "
                + " DESCRIPTION FROM " + Database.DCMS.users
                + " WHERE ACTIVE = 'Y' ";
        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        toUserId = Constants.lovID;
        toUser = Constants.lovDescription;
        txtToUser.setText(Constants.lovDescription);

    }//GEN-LAST:event_txtToUserActionPerformed

    private void chkUnverifyPasswordRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUnverifyPasswordRequiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkUnverifyPasswordRequiredActionPerformed

    private void cboUserCopyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUserCopyTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboUserCopyTypeActionPerformed

    private void cboDoseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDoseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDoseTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditSetting;
    private javax.swing.JButton btnEditSetting1;
    private javax.swing.JButton btnEditSetting2;
    private javax.swing.JButton btnEditSetting3;
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JComboBox<String> cboDoseType;
    private javax.swing.JComboBox<String> cboIntakeType;
    private javax.swing.JComboBox<String> cboUserCopyType;
    private javax.swing.JCheckBox chkMedicineInstructionReq;
    private javax.swing.JCheckBox chkUnverifyPasswordRequired;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtCurrentPassword;
    private javax.swing.JTextField txtFontSize;
    private javax.swing.JTextField txtFromUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtToUser;
    private javax.swing.JTextField txtUserDoseSetting;
    // End of variables declaration//GEN-END:variables

    public void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtUserDoseSetting);
        comp.add(txtCurrentPassword);
        comp.add(txtNewPassword);
        comp.add(txtConfirmPassword);
        GUIUtils.setClear(comp);
    }

    private void setUserInfromation() {
        lblUserName.setText(currentUser.getUserName());
        txtName.setText(currentUser.getName());
        txtUserDoseSetting.setText(UserActions.userMedicineDuration);
        chkMedicineInstructionReq.setSelected(UserActions.isMedicineInstructionRequired);
        //txtEmail.setText(currentUser.getEmailAddress()); 
        cboDoseType.setSelectedIndex(UserActions.userDoseTypeId - 1);
        txtFontSize.setText("" + UserActions.userFontSize);
    }

    private void setcboMedicineIntakeType() {
        listIntakeType = ctlOPD.selectMedicineIntakeType();
        String[] intakeTypes = new String[listIntakeType.size()];
        for (int i = 0; i < listIntakeType.size(); i++) {
            intakeTypes[i] = listIntakeType.get(i).getDescription();
            mapIntakeType.put(listIntakeType.get(i).getDescription(),
                    listIntakeType.get(i).getId());
            mapUserIntakeType.put(listIntakeType.get(i).getId(),
                    listIntakeType.get(i).getDescription());
        }
        cboIntakeType.setModel(new javax.swing.DefaultComboBoxModel(intakeTypes));
        cboIntakeType.setSelectedItem(mapUserIntakeType.get(""
                + UserActions.userMedIntakeType));
        intakeType = mapUserIntakeType.get("" + UserActions.userMedIntakeType);
    }

    private OPDController ctlOPD = new OPDController();
    private List<LOV> listIntakeType = new ArrayList();
    private HashMap<String, String> mapIntakeType = new HashMap<>();
    private HashMap<String, String> mapUserIntakeType = new HashMap<>();
    private String intakeType = "";

}
