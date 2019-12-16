package Form.OPD;

import BO.OPD.DengueFeverAssesmentBO;
import Controller.OPD.DengueFeverAssesmentController;
import TableModel.OPD.DengueAssestmentTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class DengueFeverAssesment extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    DengueFeverAssesmentController ctlDengue = new DengueFeverAssesmentController();
    List<DengueFeverAssesmentBO> listDengue = new ArrayList();
    private String valueId;

    public DengueFeverAssesment() {

        initComponents();
        this.setSize(Constants.xSize - 45, Constants.ySize - 70);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnCloseExpense.setMnemonic(KeyEvent.VK_C);
        setDengueInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtToStoreName1 = new javax.swing.JTextField();
        txtToStoreName2 = new javax.swing.JTextField();
        txtToStoreName3 = new javax.swing.JTextField();
        txtToStoreName4 = new javax.swing.JTextField();
        txtToStoreName5 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblIndentRequest1 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblIndentRequest2 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblIndentRequest3 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblIndentRequest4 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbRequestedItem3 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbRequestedItem2 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbRequestedItem1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblMedicalHistory = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCloseExpense = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSaveExpense = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Outreach Inventory");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(964, 738));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dengue Fever Assesment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(102, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Patient Id : ");

        txtToStoreName1.setEditable(false);
        txtToStoreName1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtToStoreName2.setEditable(false);
        txtToStoreName2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtToStoreName2.setText("Patient Name");

        txtToStoreName3.setEditable(false);
        txtToStoreName3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtToStoreName3.setText("Age/Gender");

        txtToStoreName4.setEditable(false);
        txtToStoreName4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtToStoreName4.setText("ER Visit No.");
        txtToStoreName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToStoreName4ActionPerformed(evt);
            }
        });

        txtToStoreName5.setEditable(false);
        txtToStoreName5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtToStoreName5.setText("VIsit Date");
        txtToStoreName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToStoreName5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToStoreName1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToStoreName2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToStoreName3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToStoreName4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtToStoreName5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToStoreName1)
                    .addComponent(txtToStoreName2)
                    .addComponent(txtToStoreName3)
                    .addComponent(txtToStoreName4)
                    .addComponent(txtToStoreName5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(102, 0, 0));

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Warning Signs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(102, 0, 0));

        tblIndentRequest1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIndentRequest1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblIndentRequest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIndentRequest1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIndentRequest1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIndentRequest1MouseReleased(evt);
            }
        });
        tblIndentRequest1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIndentRequest1KeyReleased(evt);
            }
        });
        jScrollPane16.setViewportView(tblIndentRequest1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Presumtive Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel17.setForeground(new java.awt.Color(102, 0, 0));

        tblIndentRequest2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIndentRequest2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblIndentRequest2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIndentRequest2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIndentRequest2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIndentRequest2MouseReleased(evt);
            }
        });
        tblIndentRequest2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIndentRequest2KeyReleased(evt);
            }
        });
        jScrollPane17.setViewportView(tblIndentRequest2);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel18.setForeground(new java.awt.Color(102, 0, 0));

        tblIndentRequest3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIndentRequest3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblIndentRequest3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIndentRequest3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIndentRequest3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIndentRequest3MouseReleased(evt);
            }
        });
        tblIndentRequest3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIndentRequest3KeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(tblIndentRequest3);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disposal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(102, 0, 0));

        tblIndentRequest4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIndentRequest4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Indent No","Indent By","Indent Store", "Requested Date"}
        ));
        tblIndentRequest4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIndentRequest4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIndentRequest4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIndentRequest4MouseReleased(evt);
            }
        });
        tblIndentRequest4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIndentRequest4KeyReleased(evt);
            }
        });
        jScrollPane19.setViewportView(tblIndentRequest4);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(102, 0, 0));

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ultrasound Findings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(102, 0, 0));

        tbRequestedItem3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbRequestedItem3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tbRequestedItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRequestedItem3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRequestedItem3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbRequestedItem3MouseReleased(evt);
            }
        });
        tbRequestedItem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbRequestedItem3KeyReleased(evt);
            }
        });
        jScrollPane15.setViewportView(tbRequestedItem3);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laboratory Investigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        tbRequestedItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbRequestedItem2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tbRequestedItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRequestedItem2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRequestedItem2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbRequestedItem2MouseReleased(evt);
            }
        });
        tbRequestedItem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbRequestedItem2KeyReleased(evt);
            }
        });
        jScrollPane14.setViewportView(tbRequestedItem2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(102, 0, 0));

        tbRequestedItem1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbRequestedItem1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tbRequestedItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRequestedItem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRequestedItem1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbRequestedItem1MouseReleased(evt);
            }
        });
        tbRequestedItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbRequestedItem1KeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(tbRequestedItem1);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(102, 0, 0));

        tblMedicalHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblMedicalHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Item Id","Item Name","Request Quantity"}
        ));
        tblMedicalHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicalHistoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMedicalHistoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMedicalHistoryMouseReleased(evt);
            }
        });
        tblMedicalHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMedicalHistoryKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblMedicalHistory);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCloseExpense.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCloseExpense.setText("Final");
        btnCloseExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseExpenseActionPerformed(evt);
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

        btnSaveExpense.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSaveExpense.setText("Save");
        btnSaveExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveExpenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(btnSaveExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCloseExpense)
                    .addComponent(btnSaveExpense)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMedicalHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicalHistoryMouseClicked


    }//GEN-LAST:event_tblMedicalHistoryMouseClicked

    private void tblMedicalHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicalHistoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicalHistoryMousePressed

    private void tblMedicalHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicalHistoryMouseReleased
        // TODO add your handling code here:
        DengueFeverAssesmentBO obj = listDengue.get(tblMedicalHistory.getSelectedRow());
        if (tblMedicalHistory.getSelectedColumn() == 3 && evt.getClickCount() == 2) {
            if (obj.getAdditionlaInfo().equalsIgnoreCase("RE")) {
                System.out.println("Remarks");
            } else {
                String query = "SELECT ID,DESCRIPTION                       \n"
                        + " FROM " + Database.DCMS.definitionTypeDetail + " \n"
                        + "WHERE DEF_TYPE_ID = " + obj.getAdditionlaInfo() + "\n"
                        + "ORDER BY ID                                      \n";

                lov.LOVSelection(query, this);
                if (Constants.lovID.equalsIgnoreCase("ID")) {
                    valueId = "";
                    return;

                }
                valueId = Constants.lovID;
                obj.setResult(Constants.lovDescription);
                setDengueInfo();
            }
        }
    }//GEN-LAST:event_tblMedicalHistoryMouseReleased

    private void tblMedicalHistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMedicalHistoryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicalHistoryKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCloseExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseExpenseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCloseExpenseActionPerformed

    private void btnSaveExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveExpenseActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnSaveExpenseActionPerformed

    private void txtToStoreName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToStoreName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToStoreName5ActionPerformed

    private void txtToStoreName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToStoreName4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToStoreName4ActionPerformed

    private void tbRequestedItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem1MouseClicked

    private void tbRequestedItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem1MousePressed

    private void tbRequestedItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem1MouseReleased

    private void tbRequestedItem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRequestedItem1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem1KeyReleased

    private void tbRequestedItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem2MouseClicked

    private void tbRequestedItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem2MousePressed

    private void tbRequestedItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem2MouseReleased

    private void tbRequestedItem2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRequestedItem2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem2KeyReleased

    private void tbRequestedItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem3MouseClicked

    private void tbRequestedItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem3MousePressed

    private void tbRequestedItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRequestedItem3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem3MouseReleased

    private void tbRequestedItem3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRequestedItem3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRequestedItem3KeyReleased

    private void tblIndentRequest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest1MouseClicked

    private void tblIndentRequest1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest1MousePressed

    private void tblIndentRequest1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest1MouseReleased

    private void tblIndentRequest1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentRequest1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest1KeyReleased

    private void tblIndentRequest2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest2MouseClicked

    private void tblIndentRequest2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest2MousePressed

    private void tblIndentRequest2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest2MouseReleased

    private void tblIndentRequest2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentRequest2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest2KeyReleased

    private void tblIndentRequest3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest3MouseClicked

    private void tblIndentRequest3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest3MousePressed

    private void tblIndentRequest3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest3MouseReleased

    private void tblIndentRequest3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentRequest3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest3KeyReleased

    private void tblIndentRequest4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest4MouseClicked

    private void tblIndentRequest4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest4MousePressed

    private void tblIndentRequest4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIndentRequest4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest4MouseReleased

    private void tblIndentRequest4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIndentRequest4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIndentRequest4KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseExpense;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveExpense;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JTable tbRequestedItem1;
    private javax.swing.JTable tbRequestedItem2;
    private javax.swing.JTable tbRequestedItem3;
    private javax.swing.JTable tblIndentRequest1;
    private javax.swing.JTable tblIndentRequest2;
    private javax.swing.JTable tblIndentRequest3;
    private javax.swing.JTable tblIndentRequest4;
    private javax.swing.JTable tblMedicalHistory;
    private javax.swing.JTextField txtToStoreName1;
    private javax.swing.JTextField txtToStoreName2;
    private javax.swing.JTextField txtToStoreName3;
    private javax.swing.JTextField txtToStoreName4;
    private javax.swing.JTextField txtToStoreName5;
    // End of variables declaration//GEN-END:variables

    private void setRerquestItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblMedicalHistory.getColumnCount(); i++) {
            column = tblMedicalHistory.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(50);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            }
        }
    }

    private void setDengueInfo() {
        listDengue = ctlDengue.selectDengueDefinitions("469");
        if (listDengue.isEmpty()) {
            List<DengueFeverAssesmentBO> listDengue = new ArrayList();
            listDengue.add(new DengueFeverAssesmentBO());
            tblMedicalHistory.setModel(new DengueAssestmentTableModel(listDengue));
        } else {
            tblMedicalHistory.setModel(new DengueAssestmentTableModel(listDengue));
            ListSelectionModel selectionModel = tblMedicalHistory.getSelectionModel();
            tblMedicalHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setItemsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblMedicalHistory);
        }

    }

    private void setItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblMedicalHistory.getColumnCount(); i++) {
            column = tblMedicalHistory.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(150);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            }
        }
    }

}
