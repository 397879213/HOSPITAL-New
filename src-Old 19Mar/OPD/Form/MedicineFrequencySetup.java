package OPD.Form;

import OPD.BO.BOMedicineFrequencySetup;
import OPD.Controller.MedicineFrequencySetupController;
import OPD.TableModel.MedFrequencyTableModel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.UserActions;

public class MedicineFrequencySetup extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    
     MedicineFrequencySetupController medfreqClt = new MedicineFrequencySetupController();
      BOMedicineFrequencySetup medFreqBo = new BOMedicineFrequencySetup();
    
      List<BOMedicineFrequencySetup> listMedicine = new ArrayList<>();
      
      private int actionId = 0;
      private String description = "";

    public MedicineFrequencySetup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultant = new javax.swing.JPanel();
        pnlSearchUser6 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtSearchDescription = new javax.swing.JTextField();
        cboSearchFreqType = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblMedData = new javax.swing.JTable();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtUrduText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAddFrequency = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        cboFrequencyType = new javax.swing.JComboBox<>();
        btnClearFrequency = new javax.swing.JButton();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEditCount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEditDescription = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEditUrduText = new javax.swing.JTextArea();
        txtEditPosition = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        cboActive = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Medicine Frequency Setup");
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

        Consultant.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        Consultant.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine Frequency Setup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        Consultant.setForeground(java.awt.SystemColor.activeCaption);

        pnlSearchUser6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser6.setForeground(java.awt.SystemColor.activeCaption);

        btnSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Desciption : ");

        txtSearchDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDescriptionActionPerformed(evt);
            }
        });

        cboSearchFreqType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All","General", "Med Abrev.", "In Words", "Instructions"}));
        cboSearchFreqType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSearchFreqTypeActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(103, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblMedData.setBackground(java.awt.SystemColor.activeCaption);
        tblMedData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblMedData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Description","Position","Count","Urdu Text","Active" }
        ));
        tblMedData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedDataMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMedDataMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMedDataMouseReleased(evt);
            }
        });
        tblMedData.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblMedDataPropertyChange(evt);
            }
        });
        tblMedData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblMedDataKeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(tblMedData);

        javax.swing.GroupLayout pnlSearchUser6Layout = new javax.swing.GroupLayout(pnlSearchUser6);
        pnlSearchUser6.setLayout(pnlSearchUser6Layout);
        pnlSearchUser6Layout.setHorizontalGroup(
            pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSearchFreqType, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
        );
        pnlSearchUser6Layout.setVerticalGroup(
            pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser6Layout.createSequentialGroup()
                .addGroup(pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSearchFreqType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser6Layout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Desciption : ");

        txtDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        txtUrduText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUrduText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtUrduTextMouseReleased(evt);
            }
        });
        txtUrduText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrduTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Urdu Text : ");

        btnAddFrequency.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddFrequency.setText("Add");
        btnAddFrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFrequencyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Count : ");

        txtCount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCountMouseReleased(evt);
            }
        });
        txtCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Position : ");

        txtPosition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPosition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPositionMouseReleased(evt);
            }
        });
        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        cboFrequencyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","General", "Med Abrev.", "In Words", "Instructions" }));
        cboFrequencyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFrequencyTypeActionPerformed(evt);
            }
        });

        btnClearFrequency.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClearFrequency.setText("Clear");
        btnClearFrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFrequencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUrduText)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFrequencyType, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescription))
                .addContainerGap())
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription))
                .addGap(10, 10, 10)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUrduText)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFrequency, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClearFrequency, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboFrequencyType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Desciption : ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Urdu Text : ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Count");

        txtEditCount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEditCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEditCountMouseReleased(evt);
            }
        });
        txtEditCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditCountActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Position");

        txtEditDescription.setColumns(20);
        txtEditDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEditDescription.setLineWrap(true);
        txtEditDescription.setRows(3);
        txtEditDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtEditDescription);

        txtEditUrduText.setColumns(20);
        txtEditUrduText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEditUrduText.setLineWrap(true);
        txtEditUrduText.setRows(3);
        txtEditUrduText.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtEditUrduText);

        txtEditPosition.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEditPosition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEditPositionMouseReleased(evt);
            }
        });
        txtEditPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditPositionActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        cboActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Active");

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(txtEditPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(txtEditCount, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboActive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ConsultantLayout = new javax.swing.GroupLayout(Consultant);
        Consultant.setLayout(ConsultantLayout);
        ConsultantLayout.setHorizontalGroup(
            ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultantLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchUser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
            .addGroup(ConsultantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ConsultantLayout.setVerticalGroup(
            ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultantLayout.createSequentialGroup()
                .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Consultant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Consultant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Consultant.getAccessibleContext().setAccessibleName("Consultant");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed


    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void txtUrduTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUrduTextMouseReleased


    }//GEN-LAST:event_txtUrduTextMouseReleased

    private void txtUrduTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrduTextActionPerformed


    }//GEN-LAST:event_txtUrduTextActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        description = txtSearchDescription.getText().toUpperCase().trim();
        selectMedicineInfo(actionId,description);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddFrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFrequencyActionPerformed

        if (!verifyFieldData()) {
            return;
        }

        else{

            BOMedicineFrequencySetup objIns = new BOMedicineFrequencySetup();
            objIns.setDescription(txtDescription.getText());
            objIns.setActionId(Integer.toString(actionId));
            objIns.setCount(txtCount.getText());
            objIns.setPosition(txtPosition.getText());
            objIns.setUrduText(txtUrduText.getText());
            
                if(medfreqClt.inserteMedicineReg(objIns)){
                JOptionPane.showMessageDialog(null, " Add Successfully");
            }else{
                JOptionPane.showMessageDialog(null, " Unable to Add, Kindly Contact Administrator ");
            }
          
            clearForm();
        }
    }//GEN-LAST:event_btnAddFrequencyActionPerformed

    private void txtCountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCountMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountMouseReleased

    private void txtCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountActionPerformed

    private void txtPositionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPositionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionMouseReleased

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void txtSearchDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDescriptionActionPerformed
       
    }//GEN-LAST:event_txtSearchDescriptionActionPerformed

    private void btnClearFrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFrequencyActionPerformed
            clearForm();

    }//GEN-LAST:event_btnClearFrequencyActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     if (listMedicine.isEmpty() || tblMedData.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No Medicine Frequency Is Selected");
            return;
        }

        medFreqBo = listMedicine.get(tblMedData.getSelectedRow());
        medFreqBo.setDescription(txtEditDescription.getText().trim());
        medFreqBo.setCount(txtEditCount.getText().trim());
        medFreqBo.setActive(cboActive.getSelectedItem().toString());
        medFreqBo.setUrduText(txtEditUrduText.getText().trim());
        medFreqBo.setPosition(txtEditPosition.getText().trim());
        
         int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "Update Medicine Information.");
        if (confirmation != 0) {
            return;
        }
        if (medfreqClt.updateMedicineInfo(medFreqBo)) {
            JOptionPane.showMessageDialog(null, "Information Updated Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update,Kindly Contact Administrator");
        }
        clearForm();
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtEditCountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditCountMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditCountMouseReleased

    private void txtEditCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditCountActionPerformed

    private void txtEditPositionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditPositionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditPositionMouseReleased

    private void txtEditPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditPositionActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       this.dispose(); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void cboSearchFreqTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSearchFreqTypeActionPerformed
        // TODO add your handling code here:
        actionId = cboSearchFreqType.getSelectedIndex();
    }//GEN-LAST:event_cboSearchFreqTypeActionPerformed

    private void tblMedDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedDataMouseClicked

    private void tblMedDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedDataMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedDataMousePressed

    private void tblMedDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedDataMouseReleased
       
        medFreqBo = listMedicine.get(tblMedData.getSelectedRow());
       
        txtEditDescription.setText(medFreqBo.getDescription());
        txtEditCount.setText(medFreqBo.getCount());
        txtEditUrduText.setText(medFreqBo.getUrduText());
        txtEditPosition.setText(medFreqBo.getPosition());
        cboActive.setSelectedItem(medFreqBo.getActive());
    }//GEN-LAST:event_tblMedDataMouseReleased

    private void tblMedDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblMedDataPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedDataPropertyChange

    private void tblMedDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMedDataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedDataKeyPressed

    private void cboFrequencyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFrequencyTypeActionPerformed
        // TODO add your handling code here:
        actionId = cboFrequencyType.getSelectedIndex();
    }//GEN-LAST:event_cboFrequencyTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultant;
    private javax.swing.JButton btnAddFrequency;
    private javax.swing.JButton btnClearFrequency;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboActive;
    private javax.swing.JComboBox<String> cboFrequencyType;
    private javax.swing.JComboBox<String> cboSearchFreqType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlSearchUser6;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblMedData;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEditCount;
    private javax.swing.JTextArea txtEditDescription;
    private javax.swing.JTextField txtEditPosition;
    private javax.swing.JTextArea txtEditUrduText;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSearchDescription;
    private javax.swing.JTextField txtUrduText;
    // End of variables declaration//GEN-END:variables

    private void selectMedicineInfo(int actionId, String description) {
       
        listMedicine = medfreqClt.selectMediSearch(actionId,description);
        tblMedData.setModel(new MedFrequencyTableModel(listMedicine));
        System.err.println("ccc: "+ listMedicine.size());
        ListSelectionModel selectionMod = tblMedData.getSelectionModel();
        tblMedData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsMedFreq();
        selectionMod.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblMedData);  
    }
    
     private boolean verifyFieldData() {
       
           if (txtDescription.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter User Description ");
            txtDescription.requestFocus();
            return false;
        }

        if (txtUrduText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Urdu Text ");
            txtUrduText.requestFocus();
             return false;
        }

        if (txtCount.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Count ");
            txtCount.requestFocus();
            return false;
        }

        if (txtPosition.getText().trim().length()== 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Department ");
            txtPosition.requestFocus();
            return false;
        }
        
         if (cboFrequencyType.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Frequency Type ");
            cboFrequencyType.requestFocus();
            return false;
        }
         
        return true;
    }
    
    public void setColumnsWidthsMedFreq() {

        TableColumn column = null;
        for (int i = 0; i < tblMedData.getColumnCount(); i++) {
            column = tblMedData.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(0);
            }else if (i == 1) {
                column.setPreferredWidth(200);
            }else if (i == 2) {
                column.setPreferredWidth(15);
            } else if (i == 3) {
                column.setPreferredWidth(10);
            } else if (i == 4) {
                column.setPreferredWidth(180);
            } else if (i == 5)  {
                column.setPreferredWidth(10);
            } 
        }
    }
    
    
    private void clearForm() {
        
        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtDescription);
        comp.add(txtUrduText);
        comp.add(txtCount);
        comp.add(txtPosition);
        comp.add(txtSearchDescription);
        comp.add(txtEditDescription);
        comp.add(txtEditCount);
        comp.add(txtEditUrduText);
        comp.add(txtEditPosition);
        comp.add(cboActive);
        
        GUIUtils.setClear(comp);
        
        listMedicine.clear();
        tblMedData.setModel(new MedFrequencyTableModel(listMedicine));
   }
}
