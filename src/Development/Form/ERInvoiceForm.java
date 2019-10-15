package Development.Form;

import Development.BO.ERInvoiceBO;
import Development.Controller.ERInvoiceController;
import Development.TableModel.InvoiceDetailClientTableModel;
import Development.TableModel.InvoiceMasterClientTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.GUIUtils;

public class ERInvoiceForm extends javax.swing.JInternalFrame {

    ERInvoiceBO objBo = new ERInvoiceBO();
    ERInvoiceController objCtl = new ERInvoiceController();
    List<ERInvoiceBO> lstInvoiceDetailClient = new ArrayList();
    List<ERInvoiceBO> lstInvoiceMasterClient = new ArrayList();
    String todate = "";
    String fromdate = "";
    String patientId = "";
    String patientName = "";
    String location = "";
    String clientId = "";
    String endTime = "";
    String startTime = "";
    String endDateTime = "";
    String startDateTime = "";
    String invoiceNum = "";
    String completeOrderNo = "";
    DisplayLOV lov = new DisplayLOV();

    public ERInvoiceForm() {

        initComponents();
        this.setSize(Constants.xSize - 7, Constants.ySize - 115);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel17 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblInvoiceMaster = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblInvoiceDetail = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Client Invoice");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(980, 710));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("From Date :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("To Date :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Client :");

        txtClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DD:MM:YY");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DD:MM:YY");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Start Time :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("End Time :");

        txtStartTime.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(102, 0, 0));
        txtStartTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartTime.setText("00:00:00");
        txtStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartTimeActionPerformed(evt);
            }
        });

        txtEndTime.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtEndTime.setForeground(new java.awt.Color(102, 0, 0));
        txtEndTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndTime.setText("23:59:59");
        txtEndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndTimeActionPerformed(evt);
            }
        });

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("HH:MM:SS");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("HH:MM:SS");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Patient ID :");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Loc :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(3, 3, 3)
                        .addComponent(txtLocation)))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatName))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblInvoiceMaster.setBackground(java.awt.SystemColor.activeCaption);
        tblInvoiceMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {"Sr","MR.No","Name","Invoice No","Invoice Date","Total Amount"}));
    tblInvoiceMaster.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblInvoiceMasterMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tblInvoiceMasterMousePressed(evt);
        }
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            tblInvoiceMasterMouseReleased(evt);
        }
    });
    tblInvoiceMaster.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblInvoiceMasterPropertyChange(evt);
        }
    });
    tblInvoiceMaster.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblInvoiceMasterKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblInvoiceMasterKeyReleased(evt);
        }
    });
    jScrollPane8.setViewportView(tblInvoiceMaster);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
    );

    jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    tblInvoiceDetail.setBackground(java.awt.SystemColor.activeCaption);
    tblInvoiceDetail.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null}
        },
        new String [] {"Sr","Invoice No","Invoice By","Description", "Price",
            "Total"}));
tblInvoiceDetail.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblInvoiceDetailMouseClicked(evt);
    }
    public void mousePressed(java.awt.event.MouseEvent evt) {
        tblInvoiceDetailMousePressed(evt);
    }
    public void mouseReleased(java.awt.event.MouseEvent evt) {
        tblInvoiceDetailMouseReleased(evt);
    }
    });
    tblInvoiceDetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblInvoiceDetailPropertyChange(evt);
        }
    });
    tblInvoiceDetail.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblInvoiceDetailKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblInvoiceDetailKeyReleased(evt);
        }
    });
    jScrollPane9.setViewportView(tblInvoiceDetail);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 479, Short.MAX_VALUE)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 415, Short.MAX_VALUE)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
    );

    jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    btn_Exit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btn_Exit.setForeground(new java.awt.Color(153, 0, 0));
    btn_Exit.setText("Exit");
    btn_Exit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_ExitActionPerformed(evt);
        }
    });

    btn_Clear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btn_Clear.setText("Clear");
    btn_Clear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_ClearActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(431, 431, 431)
            .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_Exit)
                .addComponent(btn_Clear))
            .addGap(3, 3, 3))
    );

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
            .addComponent(lblPacsLink, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(40, Short.MAX_VALUE))
    );
    pnlPLLayout.setVerticalGroup(
        pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(3, 3, 3))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblInvoiceMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMasterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceMasterMouseClicked

    private void tblInvoiceMasterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMasterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceMasterMousePressed

    private void tblInvoiceMasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMasterMouseReleased

        int selectedRow;
        selectedRow = tblInvoiceMaster.getSelectedRow();
        objBo = lstInvoiceMasterClient.get(selectedRow);
        objBo.setFromDate(startDateTime);
        objBo.setToDate(endDateTime);
        txtLocation.setText(objBo.getLocationName());
        txtClient.setText(objBo.getClientName());
        invoiceNum = objBo.getInvoiceNo();
        completeOrderNo = objBo.getCompleteOrderNo();
        objBo.setCompleteOrderNo(completeOrderNo);
        setInvoiceDetailClient();

    }//GEN-LAST:event_tblInvoiceMasterMouseReleased

    private void tblInvoiceMasterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblInvoiceMasterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceMasterPropertyChange

    private void tblInvoiceMasterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInvoiceMasterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceMasterKeyPressed

    private void tblInvoiceMasterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInvoiceMasterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceMasterKeyReleased

    private void tblInvoiceDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailMouseClicked

    private void tblInvoiceDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailMousePressed

    private void tblInvoiceDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceDetailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailMouseReleased

    private void tblInvoiceDetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblInvoiceDetailPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailPropertyChange

    private void tblInvoiceDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInvoiceDetailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailKeyPressed

    private void tblInvoiceDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInvoiceDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInvoiceDetailKeyReleased

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed

        String query = " SELECT CL.ID ID ,CL.DESCRIPTION DESCRIPTION  FROM       \n"
                + Database.DCMS.client + "     CL                                 \n"
                + "  WHERE CL.DESCRIPTION like'%"
                + txtClient.getText().toUpperCase().trim() + "%'"
                + " ORDER BY CL.DESCRIPTION";

        lov.LOVSelection(query, this);
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            clientId = Constants.lovID;
            txtClient.setText(Constants.lovDescription);
        }
        
        setInvoiceMasterClient();
    }//GEN-LAST:event_txtClientActionPerformed

    private void txtStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartTimeActionPerformed

    private void txtEndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndTimeActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        String query = " SELECT L.ID ID, L.DESCRIPTION FROM       \n"
                + Database.DCMS.location + "     L                                 \n"
                + " WHERE L.DESCRIPTION LIKE '%"
                + txtLocation.getText().toUpperCase().trim() + "%'"
                + " ORDER BY L.ID";

        lov.LOVSelection(query, this);
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            location = Constants.lovID;
            txtLocation.setText(Constants.lovDescription);
        }
        objBo.setLocationId(location);

    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed

        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Set  Issue Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromdate = dateFormat.format(txtFromDate.getDate());
        startTime = txtStartTime.getText();
        startDateTime = fromdate + " " + startTime;
        objBo.setFromDate(startDateTime);

    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Set Issue Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        todate = dateFormat.format(txtToDate.getDate());
        endTime = txtEndTime.getText();
        endDateTime = todate + " " + endTime;
        objBo.setToDate(endDateTime);

    }//GEN-LAST:event_txtToDateActionPerformed

    private void txtPatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatNameActionPerformed
        
        txtPatientId.setText("");
        setInvoiceMasterClient();


    }//GEN-LAST:event_txtPatNameActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        
        if(GUIUtils.completePatientId(txtPatientId.getText())){
        
            patientId  = Constants.completePatientId;
        }
        
        txtPatName.setText("");
        setInvoiceMasterClient();
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed

        clear();
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    public void clear() {

        startDateTime = "";
        endDateTime = "";
        txtLocation.setText("");
        txtClient.setText("");
        txtPatName.setText("");
        txtPatientId.setText("");
        tblInvoiceMaster.clearSelection();
        lstInvoiceMasterClient.clear();
        tblInvoiceMaster.setModel(new InvoiceMasterClientTableModel(lstInvoiceMasterClient));
        lstInvoiceDetailClient.clear();
        tblInvoiceDetail.setModel(new InvoiceDetailClientTableModel(lstInvoiceDetailClient));

    }

    private void setInvoiceDetailClient() {
        lstInvoiceDetailClient = objCtl.getInvoiceDetailClient(objBo);

        if (lstInvoiceDetailClient.isEmpty()) {
            List<ERInvoiceBO> list = new ArrayList();
            ERInvoiceBO objCash = new ERInvoiceBO();
            list.add(objCash);
            tblInvoiceDetail.setModel(new InvoiceDetailClientTableModel(list));

        } else {
            tblInvoiceDetail.setModel(new InvoiceDetailClientTableModel(lstInvoiceDetailClient));

        }
        ListSelectionModel selectionModel = tblInvoiceDetail.getSelectionModel();
        tblInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthModelclientInvDetail();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblInvoiceDetail);
    }

    public void setColumnsWidthModelclientInvDetail() {
        TableColumn column = null;
        for (int i = 0; i < tblInvoiceDetail.getColumnCount(); i++) {
            column = tblInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(150);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setInvoiceMasterClient() {
        
        
        if(!clientId.isEmpty()){
        
            objBo.setClientId(clientId);
        }   else{
        
            clientId = "";
            objBo.setClientId(clientId);
        }
        if(!txtPatientId.getText().isEmpty()){
        
            objBo.setPatientId(patientId);
        }   else{
        
            patientId = "";
            objBo.setPatientId(patientId);
        }
        
        if(!txtPatName.getText().isEmpty()){
        
            objBo.setPatFullName(txtPatName.getText());
        }   else{
        
            objBo.setPatFullName("");
        }
        
        lstInvoiceMasterClient = objCtl.getInvoiceMasterClient(objBo);

        if (lstInvoiceMasterClient.isEmpty()) {
            List<ERInvoiceBO> list = new ArrayList();
            ERInvoiceBO objCash = new ERInvoiceBO();
            list.add(objCash);
            tblInvoiceMaster.setModel(new InvoiceMasterClientTableModel(list));
        } else {
            tblInvoiceMaster.setModel(new InvoiceMasterClientTableModel(lstInvoiceMasterClient));
        }
        ListSelectionModel selectionModel = tblInvoiceMaster.getSelectionModel();
        tblInvoiceMaster.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthMasterModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblInvoiceMaster);

    }

    public void setColumnsWidthMasterModel() {
        TableColumn column = null;
        for (int i = 0; i < tblInvoiceMaster.getColumnCount(); i++) {
            column = tblInvoiceMaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(90);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(100);
            } else if (i == 5) {
                column.setPreferredWidth(30);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblInvoiceDetail;
    private javax.swing.JTable tblInvoiceMaster;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtEndTime;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPatName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtStartTime;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    // End of variables declaration//GEN-END:variables

}
