package Form.Cardiology;

import BO.Cardiology.AngioReporting;
import Controller.Cardiology.AngioReportingController;
import TableModel.Cardiology.AngioAdditionalInfoTableModel;
import TableModel.Cardiology.AngioParameterTableModel;
import TableModel.Cardiology.CatheterInfoTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.Status;

public class AngioReportingForm extends javax.swing.JInternalFrame {

    private String route = "";
    private String cathType = "";
    private String cathLR = "";
    private String cathValue;
    private String angioMasterId = "1";
    private String patientId = "001001522154";
    private String CON = "0010036565";
    private String ODI = "1";
//    private String angioId = "";
    private String angioParameterId = "";
    private String additionalInfo;
    private String lvAngiogramId = "16191";

    public AngioReportingForm() {

        initComponents();
        this.setSize(Constants.xSize - 40, Constants.ySize + 30);
        listAngioMaster = ctlAngio.selectAngioReportingMaster(CON, ODI);
        insertAngioReportingMaster();
        selectAngioCatheter();
        selectAngioVessel();
//        selectAngioAdditionalInfo();
    }
    AngioReporting objAngio = new AngioReporting();
    AngioReporting objAngioParam = new AngioReporting();
    AngioReporting objAdditionalInfo = new AngioReporting();
    private DisplayLOV lov = new DisplayLOV();
    AngioReportingController ctlAngio = new AngioReportingController();

    List<AngioReporting> listAngioMaster = new ArrayList();
    List<AngioReporting> listCatheter = new ArrayList();
    List<AngioReporting> listParameter = new ArrayList();
    List<AngioReporting> listAdditionalInfo = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane28 = new javax.swing.JScrollPane();
        tblPatientInfo2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtRoute = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtXrayDose = new javax.swing.JTextField();
        txtContrastVol = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFemoralTime = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtLvAngiogram = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtLvef = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtParameter = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPoximal = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDistal = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblParameter = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtOstium = new javax.swing.JTextField();
        btnSaveVessel = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblCatheter = new javax.swing.JTable();
        txtCathType = new javax.swing.JTextField();
        txtCathLR = new javax.swing.JTextField();
        txtCathValue = new javax.swing.JTextField();
        cboCatheterGui = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtAgeGender = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblConsultantName = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        tblPatientInfo2.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Grade", "Grade Description", "Child Above 12", "Child Under 12", "Spouse",
                "Parents", "Self", "Class"

            }
        ));
        tblPatientInfo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientInfo2MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientInfo2MouseReleased(evt);
            }
        });
        tblPatientInfo2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientInfo2PropertyChange(evt);
            }
        });
        tblPatientInfo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPatientInfo2KeyReleased(evt);
            }
        });
        jScrollPane28.setViewportView(tblPatientInfo2);

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

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Angio Repoting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Select Route : ");

        txtRoute.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRouteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Contrast Vol. (ml) :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("X ray Dose :");

        txtXrayDose.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtXrayDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXrayDoseActionPerformed(evt);
            }
        });

        txtContrastVol.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContrastVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrastVolActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("F. Time(min) :");

        txtFemoralTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFemoralTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFemoralTimeActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("LV Angiogram :");

        txtLvAngiogram.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLvAngiogram.setText("NORMAL");
        txtLvAngiogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLvAngiogramActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("LVEF % :");

        txtLvef.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLvef.setText("60");
        txtLvef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLvefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRoute)
                    .addComponent(txtContrastVol)
                    .addComponent(txtLvAngiogram, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFemoralTime)
                    .addComponent(txtLvef, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(txtXrayDose))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXrayDose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrastVol, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFemoralTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLvAngiogram, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLvef, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vessel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        txtParameter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtParameterMouseReleased(evt);
            }
        });
        txtParameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParameterActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Proximal :");

        txtPoximal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPoximal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPoximalMouseReleased(evt);
            }
        });
        txtPoximal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoximalActionPerformed(evt);
            }
        });

        txtMid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMidMouseReleased(evt);
            }
        });
        txtMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMidActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Mid :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Distal :");

        txtDistal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDistal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDistalMouseReleased(evt);
            }
        });
        txtDistal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistalActionPerformed(evt);
            }
        });

        tblParameter.setBackground(java.awt.SystemColor.activeCaption);
        tblParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Value of", "Diagonal/ OM", "Poximal", "Mid", "Distal",

            }
        ));
        tblParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParameterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblParameterMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblParameterMouseReleased(evt);
            }
        });
        tblParameter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblParameterPropertyChange(evt);
            }
        });
        tblParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblParameterKeyReleased(evt);
            }
        });
        jScrollPane27.setViewportView(tblParameter);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Vessel :");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Ostium :");

        txtOstium.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOstium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtOstiumMouseReleased(evt);
            }
        });
        txtOstium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOstiumActionPerformed(evt);
            }
        });

        btnSaveVessel.setText("Save");
        btnSaveVessel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVesselActionPerformed(evt);
            }
        });

        jButton9.setText("Edit");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParameter)
                    .addComponent(txtDistal)
                    .addComponent(txtPoximal))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOstium, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtMid, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnSaveVessel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOstium, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoximal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveVessel)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Catheter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        tblCatheter.setBackground(java.awt.SystemColor.activeCaption);
        tblCatheter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Cath/ Guid", "Value of", "Left/ Right", "Value"

            }
        ));
        tblCatheter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatheterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCatheterMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCatheterMouseReleased(evt);
            }
        });
        tblCatheter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblCatheterPropertyChange(evt);
            }
        });
        tblCatheter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCatheterKeyReleased(evt);
            }
        });
        jScrollPane26.setViewportView(tblCatheter);

        txtCathType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCathType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCathTypeActionPerformed(evt);
            }
        });

        txtCathLR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCathLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCathLRActionPerformed(evt);
            }
        });

        txtCathValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCathValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCathValueActionPerformed(evt);
            }
        });

        cboCatheterGui.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Diagnostic Catheter", "Guiding Catheter"}));
        cboCatheterGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCatheterGuiActionPerformed(evt);
            }
        });

        jButton1.setText("Edit");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCatheterGui, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCathType, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCathLR, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCathValue, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
            .addComponent(jScrollPane26)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCatheterGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCathType, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtCathLR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCathValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clinical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conclusion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Findings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id :  ");

        txtPatientId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatientIdMouseClicked(evt);
            }
        });
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Age Gender : ");

        lblConsultantName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConsultantName.setForeground(new java.awt.Color(102, 0, 0));
        lblConsultantName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConsultantName.setText("Consultant Name : ");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Client Name : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsultantName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientName)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId)
                    .addComponent(txtPatientName)
                    .addComponent(txtAgeGender)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblConsultantName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Management Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
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
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("Investigation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Pacs Study");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("Notes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("Final Sign");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setText("View");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRouteActionPerformed
        // TODO add your handling code here
        lov.LOVDefinitionSelection(DefinitionTypes.route, txtRoute.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        route = Constants.lovID;
        txtRoute.setText(Constants.lovDescription);
        txtXrayDose.requestFocus();
    }//GEN-LAST:event_txtRouteActionPerformed

    private void tblCatheterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatheterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCatheterMouseClicked

    private void tblCatheterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatheterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCatheterMouseEntered

    private void tblCatheterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatheterMouseReleased
        if (listCatheter.isEmpty() || tblCatheter.getSelectedRow() < 0) {
            return;
        }
        AngioReporting objCatheter = listCatheter.get(tblCatheter.getSelectedRow());
        setCatherInformation(objCatheter);
        if (evt.getClickCount() % 2 == 0) {
            if (ctlAngio.deleteCatheterInfo(objCatheter.getCatherterPk())) {
//                JOptionPane.showMessageDialog(null, "Record Deleted Successfully.");
                selectAngioCatheter();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Deleted Record.\n"
                        + "Please Contact Support Team.");
            }
        }
    }//GEN-LAST:event_tblCatheterMouseReleased

    private void tblCatheterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCatheterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCatheterPropertyChange

    private void tblCatheterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCatheterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCatheterKeyReleased

    private void txtCathTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCathTypeActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cathType, txtCathType.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        cathType = Constants.lovID;
        txtCathType.setText(Constants.lovDescription);
        txtCathLR.requestFocus();
    }//GEN-LAST:event_txtCathTypeActionPerformed

    private void txtCathLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCathLRActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.cathLR, txtCathLR.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        cathLR = Constants.lovID;
        txtCathLR.setText(Constants.lovDescription);
        txtCathValue.requestFocus();
    }//GEN-LAST:event_txtCathLRActionPerformed

    private void txtCathValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCathValueActionPerformed
        // TODO add your handling code here:
        String query = " SELECT ID  , DESCRIPTION FROM "
                + Database.DCMS.definitionTypeDetail
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.cathValue
                + " AND ADDITIONAL_INFO = '" + cboCatheterGui.getSelectedItem() + "'\n"
                + " AND ACTIVE = 'Y'\n";
        lov.LOVSelection(query, this);
        cathValue = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            cathValue = Constants.lovID;
            txtCathValue.setText(Constants.lovDescription);
            insertCatheter();
        }

    }//GEN-LAST:event_txtCathValueActionPerformed

    private void txtParameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParameterActionPerformed
        // TODO add your handling code here:
        String query = " SELECT ID  , DESCRIPTION FROM "
                + Database.DCMS.definitionTypeDetail
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.angioParameter
                + " AND ID NOT IN ( SELECT VESSEL_ID FROM " + Database.DCMS.angioReportingVessel + "\n"
                + " WHERE ANGIO_MASTER_ID = " + angioMasterId + ")"
                + " AND ACTIVE = 'Y'\n";
        lov.LOVSelection(query, this);
        lov.LOVDefinitionSelection(DefinitionTypes.angioParameter,
                txtParameter.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        angioParameterId = Constants.lovID;
        txtParameter.setText(Constants.lovDescription);
        txtOstium.requestFocus();
    }//GEN-LAST:event_txtParameterActionPerformed

    private void txtPoximalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoximalActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.angioParameterValues,
                txtPoximal.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
//        angioParameterId = Constants.lovID;
        txtPoximal.setText(Constants.lovDescription);
        txtMid.requestFocus();
    }//GEN-LAST:event_txtPoximalActionPerformed

    private void txtMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMidActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.angioParameterValues,
                txtMid.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
//        angioParameterId = Constants.lovID;
        txtMid.setText(Constants.lovDescription);
        txtDistal.requestFocus();
    }//GEN-LAST:event_txtMidActionPerformed

    private void txtDistalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistalActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.angioParameterValues,
                txtDistal.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
//        angioParameterId = Constants.lovID;
        txtDistal.setText(Constants.lovDescription);
        txtOstium.requestFocus();
        insertAngioVessel();
    }//GEN-LAST:event_txtDistalActionPerformed

    private void tblPatientInfo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2MouseClicked

    private void tblPatientInfo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2MouseEntered

    private void tblPatientInfo2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfo2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2MouseReleased

    private void tblPatientInfo2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfo2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2PropertyChange

    private void tblPatientInfo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPatientInfo2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfo2KeyReleased

    private void txtContrastVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrastVolActionPerformed
        // TODO add your handling code here:
        txtFemoralTime.requestFocus();
    }//GEN-LAST:event_txtContrastVolActionPerformed

    private void txtFemoralTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFemoralTimeActionPerformed
        // TODO add your handling code here:
        txtXrayDose.requestFocus();
    }//GEN-LAST:event_txtFemoralTimeActionPerformed

    private void txtXrayDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXrayDoseActionPerformed
        // TODO add your handling code here:
        txtContrastVol.requestFocus();
    }//GEN-LAST:event_txtXrayDoseActionPerformed

    private void tblParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParameterMouseClicked

    private void tblParameterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParameterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParameterMouseEntered

    private void tblParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParameterMouseReleased
        // TODO add your handling code here:
        if (listParameter.isEmpty() || tblParameter.getSelectedRow() < 0) {
            return;
        }
        AngioReporting objParameter = listParameter.get(tblParameter.getSelectedRow());
        setParameterInfo(objParameter);
        if (evt.getClickCount() % 2 == 0) {
            if (ctlAngio.deleteParameterInfo(objParameter.getParameterPk())) {
//                JOptionPane.showMessageDialog(null, "Record Deleted Successfully.");
                selectAngioVessel();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Deleted Record.\n"
                        + "Please Contact Support Team.");
            }
        }
    }//GEN-LAST:event_tblParameterMouseReleased

    private void tblParameterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblParameterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParameterPropertyChange

    private void tblParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParameterKeyReleased

    private void cboCatheterGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCatheterGuiActionPerformed
        // TODO add your handling code here:
        txtCathType.requestFocus();
    }//GEN-LAST:event_cboCatheterGuiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        saveDataInAngioMaster();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtOstiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOstiumActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.angioParameterValues,
                txtOstium.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
//        angioParameterId = Constants.lovID;
        txtPoximal.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtOstiumActionPerformed

    private void txtLvAngiogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLvAngiogramActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.LVAngiogram,
                txtLvAngiogram.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        lvAngiogramId = Constants.lovID;
        txtLvAngiogram.setText(Constants.lovDescription);
        txtLvef.requestFocus();
    }//GEN-LAST:event_txtLvAngiogramActionPerformed

    private void txtLvefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLvefActionPerformed
        // TODO add your handling code here:
        saveDataInAngioMaster();
    }//GEN-LAST:event_txtLvefActionPerformed

    private void txtParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParameterMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() % 2 == 0) {
            lov.LOVDefinitionSelection(DefinitionTypes.angioAdditionalInfo,
                    "", this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                return;
            }
            txtParameter.setText(txtParameter.getText() + " " + Constants.lovDescription);
        }
    }//GEN-LAST:event_txtParameterMouseReleased

    private void txtPoximalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPoximalMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() % 2 == 0) {
            lov.LOVDefinitionSelection(DefinitionTypes.angioAdditionalInfo,
                    "", this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                return;
            }
            txtPoximal.setText(txtPoximal.getText() + " " + Constants.lovDescription);
        }
    }//GEN-LAST:event_txtPoximalMouseReleased

    private void txtMidMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMidMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() % 2 == 0) {
            lov.LOVDefinitionSelection(DefinitionTypes.angioAdditionalInfo,
                    "", this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                return;
            }
            txtMid.setText(txtMid.getText() + " " + Constants.lovDescription);
        }
    }//GEN-LAST:event_txtMidMouseReleased

    private void txtDistalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDistalMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() % 2 == 0) {
            lov.LOVDefinitionSelection(DefinitionTypes.angioAdditionalInfo,
                    "", this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                return;
            }
            txtDistal.setText(txtDistal.getText() + " " + Constants.lovDescription);
        }
    }//GEN-LAST:event_txtDistalMouseReleased

    private void txtOstiumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOstiumMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() % 2 == 0) {
            lov.LOVDefinitionSelection(DefinitionTypes.angioAdditionalInfo,
                    "", this);
            if (Constants.lovID.equalsIgnoreCase("ID")) {
                return;
            }
            txtOstium.setText(txtOstium.getText() + " " + Constants.lovDescription);
        }
    }//GEN-LAST:event_txtOstiumMouseReleased

    private void btnSaveVesselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVesselActionPerformed
        // TODO add your handling code here:
        insertAngioVessel();
    }//GEN-LAST:event_btnSaveVesselActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSaveVessel;
    private javax.swing.JComboBox<String> cboCatheterGui;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel lblConsultantName;
    private javax.swing.JTable tblCatheter;
    private javax.swing.JTable tblParameter;
    private javax.swing.JTable tblPatientInfo2;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtCathLR;
    private javax.swing.JTextField txtCathType;
    private javax.swing.JTextField txtCathValue;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtContrastVol;
    private javax.swing.JTextField txtDistal;
    private javax.swing.JTextField txtFemoralTime;
    private javax.swing.JTextField txtLvAngiogram;
    private javax.swing.JTextField txtLvef;
    private javax.swing.JTextField txtMid;
    private javax.swing.JTextField txtOstium;
    private javax.swing.JTextField txtParameter;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPoximal;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtRoute;
    private javax.swing.JTextField txtXrayDose;
    // End of variables declaration//GEN-END:variables

    private void insertCatheter() {
        objAngio.setAngioMasterId(angioMasterId);
        objAngio.setCatherter(cboCatheterGui.getSelectedItem().toString());
        objAngio.setCatherterTypeId(cathType);
        objAngio.setCatherterLRId(cathLR);
        objAngio.setCatherterValueId(cathValue);
        if (ctlAngio.insertAngioReportingCatheter(objAngio)) {
            selectAngioCatheter();
            clearCatheter();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save. Kindly Contact"
                    + " Support Person.");
        }
    }

    private void selectAngioCatheter() {
        listCatheter = ctlAngio.selectAngioReportingCatheter(angioMasterId);
        if (listCatheter.isEmpty()) {
            List<AngioReporting> list = new ArrayList();
            list.add(new AngioReporting());
            tblCatheter.setModel(new CatheterInfoTableModel(list));
        } else {
            tblCatheter.setModel(new CatheterInfoTableModel(listCatheter));
        }
        ListSelectionModel selectionModel = tblCatheter.getSelectionModel();
        tblCatheter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        setAngioCatheterColumnsWidths();
        Constants.tablelook.setJTableEnvironment(tblCatheter);
    }

    private void insertAngioReportingMaster() {

        if (listAngioMaster.isEmpty()) {
            objAngio.setPatientId(patientId);
            objAngio.setCON(CON);
            objAngio.setODI(ODI);
            objAngio.setOrderStatusId(Status.invoiced);
            objAngio.setContrast(txtContrastVol.getText().trim());
            objAngio.setxRayDose(txtXrayDose.getText().trim());
            objAngio.setFTime(txtFemoralTime.getText().trim());
//            objAngio.setPTime(txtPTime.getText().trim());

            if (ctlAngio.insertAngioReportingMaster(objAngio)) {
                selectAngioReportingMaster();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save. Kindly Contact"
                        + " Support Person.");
            }
        } else {
            selectAngioReportingMaster();
        }

    }

    private void selectAngioReportingMaster() {
        if (listAngioMaster.isEmpty()) {
            return;
        }
        objAngio = listAngioMaster.get(0);
        angioMasterId = objAngio.getAngioMasterId();
        System.err.println("Angio Master Id: " + angioMasterId);
        txtRoute.setText(objAngio.getRouteDescription());
        txtContrastVol.setText(objAngio.getContrast());
        txtXrayDose.setText(objAngio.getxRayDose());
//        txtPTime.setText(objAngio.getPTime());
        txtFemoralTime.setText(objAngio.getFTime());

    }

    private void setAngioCatheterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCatheter.getColumnCount(); i++) {
            column = tblCatheter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void clearCatheter() {
        cboCatheterGui.setSelectedIndex(0);
        txtCathLR.setText("");
        txtCathType.setText("");
        txtCathValue.setText("");
        cathLR = "";
        cathType = "";
        cathValue = "";

        cboCatheterGui.requestFocus();
    }

    private void insertAngioVessel() {
        objAngioParam.setAngioMasterId(angioMasterId);
        objAngioParam.setAngioParameterId(angioParameterId);
        objAngioParam.setProximal(txtPoximal.getText().trim());
        objAngioParam.setMid(txtMid.getText().trim());
        objAngioParam.setDistal(txtDistal.getText().trim());
        objAngioParam.setOstium(txtOstium.getText().trim());
//        objAngioParam.setTemplate(txtTemplate.getText().trim());
        if (ctlAngio.insertAngioParameter(objAngioParam)) {
            selectAngioVessel();
//            clearAngioParameter();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save. Kindly Contact"
                    + " Support Team.");
        }
    }

    private void selectAngioVessel() {
        listParameter = ctlAngio.selectAngioParameter(angioMasterId);
        if (listParameter.isEmpty()) {
            List<AngioReporting> list = new ArrayList();
            list.add(new AngioReporting());
            tblParameter.setModel(new AngioParameterTableModel(list));
        } else {
            tblParameter.setModel(new AngioParameterTableModel(listParameter));
        }
        ListSelectionModel selectionModel = tblParameter.getSelectionModel();
        tblParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        setAngioParameterColumnsWidths();
        Constants.tablelook.setJTableEnvironment(tblParameter);
    }

    private void setAngioParameterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblParameter.getColumnCount(); i++) {
            column = tblParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(40);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            }
        }
    }

    private void clearAngioParameter() {
        txtParameter.setText("");
        txtPoximal.setText("");
        txtMid.setText("");
        txtDistal.setText("");
        angioParameterId = "";
    }

//    private void insertAdditionalInfo() {
//        objAdditionalInfo.setAngioMasterId(angioMasterId);
//        objAdditionalInfo.setAdditionalInfoId(additionalInfo);
//        objAdditionalInfo.setInfoValue(txtInfoValue.getText().trim());
//
//        if (ctlAngio.insertAngioAdditionalInfo(objAdditionalInfo)) {
//            selectAngioAdditionalInfo();
//            txtTemplate.setText("");
//            txtInfoValue.setText("");
//            additionalInfo = "";
//            txtTemplate.requestFocus();
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable to Save. Kindly Contact"
//                    + " Support Team.");
//        }
//    }
//    private void selectAngioAdditionalInfo() {
//        listAdditionalInfo = ctlAngio.selectAngioAdditionalInfo(angioMasterId);
//        if (listAdditionalInfo.isEmpty()) {
//            List<AngioReporting> list = new ArrayList();
//            list.add(new AngioReporting());
//            tblAdditionalInfo.setModel(new AngioAdditionalInfoTableModel(list));
//            insertAngioReportingMaster();
//        } else {
//            tblAdditionalInfo.setModel(new AngioAdditionalInfoTableModel(listAdditionalInfo));
//        }
//        ListSelectionModel selectionModel = tblAdditionalInfo.getSelectionModel();
//        tblAdditionalInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        selectionModel.setSelectionInterval(0, 0);
//        setAngioAdditionalInfoColumnsWidths();
//        Constants.tablelook.setJTableEnvironment(tblAdditionalInfo);
//    }
//
//    private void setAngioAdditionalInfoColumnsWidths() {
//        TableColumn column = null;
//        for (int i = 0; i < tblAdditionalInfo.getColumnCount(); i++) {
//            column = tblAdditionalInfo.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(40);
//            } else if (i == 1) {
//                column.setPreferredWidth(60);
//            } else if (i == 2) {
//                column.setPreferredWidth(120);
//            } else if (i == 3) {
//                column.setPreferredWidth(50);
//            }
//        }
//    }
    private void saveDataInAngioMaster() {
        objAngio.setAngioMasterId(angioMasterId);
        objAngio.setRouteId(route);
        objAngio.setContrast(txtContrastVol.getText().trim());
        objAngio.setxRayDose(txtXrayDose.getText().trim());
        objAngio.setFTime(txtFemoralTime.getText().trim());
        objAngio.setLVAngiogramId(lvAngiogramId);
        objAngio.setLVEF(txtLvef.getText().trim());
        if (ctlAngio.updateAngioReportingMaster(objAngio)) {
            selectAngioReportingMaster();
        } else {
            JOptionPane.showMessageDialog(null, "Uable to save information.\n"
                    + "Please Contact Support Person.");
        }
    }

    private void setCatherInformation(AngioReporting objCatheter) {

        cboCatheterGui.setSelectedItem(objCatheter.getCatherter());
        txtCathType.setText(objCatheter.getCatherterTypeDescription());
        txtCathLR.setText(objCatheter.getCatherterLRDescription());
        txtCathValue.setText(objCatheter.getCatherterValueDescription());
        cathLR = objCatheter.getCatherterLRId();
        cathType = objCatheter.getCatherterTypeId();
        cathValue = objCatheter.getCatherterValueId();
    }

    private void setParameterInfo(AngioReporting objParameter) {

        txtParameter.setText(objParameter.getAngioParameterDescription());
        txtPoximal.setText(objParameter.getProximal());
        txtMid.setText(objParameter.getMid());
        txtDistal.setText(objParameter.getDistal());
        txtOstium.setText(objParameter.getOstium());
//        txtTemplate.setText(objParameter.getTemplate());
    }

}
