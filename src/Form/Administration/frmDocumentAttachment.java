package Form.Administration;

import BO.Administration.DocumentAtachement;
import Controller.Administration.DocumentAttachmentController;
import TableModel.Administration.PreviousAttachmentsTableModel;
import TableModel.Administration.RecentUploadedAttachmentsTableModel;
import com.archimed.tool.d;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.PacsProcessPath;

public class frmDocumentAttachment extends javax.swing.JInternalFrame {

    DocumentAtachement inrDoc = new DocumentAtachement();
    DisplayLOV lov = new DisplayLOV();
    Webcam webcam = null;
    WebcamPanel panel;
    private String patientId = "001212112";
    private String docTypeId = "";
    private String visitNo = "123";
    private String path = "";
    private String id = "";
    private String fileName = "";

    DocumentAttachmentController ctlAttachment = new DocumentAttachmentController();
    List<DocumentAtachement> listRecentUploadedDocs = new ArrayList();
    List<DocumentAtachement> listPreviousUploadedDocs = new ArrayList();

    public frmDocumentAttachment() {
        initComponents();
        this.setSize(Constants.xSize - 160, Constants.ySize - 180);
        path = ctlAttachment.selectImagePath(PacsProcessPath.attchedImagePath);
        selectRecentUploadedDocs();
        selectPreviousDocsuments();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefundAmount = new javax.swing.JButton();
        pnlPatientDetail = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDocumentType = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblRecentUploaded = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnShowPic = new javax.swing.JButton();
        btnAttachPicture = new javax.swing.JButton();
        btnBrowse = new javax.swing.JButton();
        txtPath = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblPreviousAttachments = new javax.swing.JTable();

        btnRefundAmount.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnRefundAmount.setText("Browse");
        btnRefundAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefundAmountActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Patient Advance Payment History");
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
        pnlPatientDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Document Type :");

        txtDocumentType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDocumentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPatientDetailLayout = new javax.swing.GroupLayout(pnlPatientDetail);
        pnlPatientDetail.setLayout(pnlPatientDetailLayout);
        pnlPatientDetailLayout.setHorizontalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDocumentType, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        pnlPatientDetailLayout.setVerticalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDocumentType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Approval Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        lblPicture.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPicture.setForeground(new java.awt.Color(102, 0, 0));
        lblPicture.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Approval History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblRecentUploaded.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null}
            },
            new String [] {
                "ClientId","UserName","Amount", "Crtd Date"

            }
        ));
        tblRecentUploaded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecentUploadedMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRecentUploadedMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblRecentUploadedMouseReleased(evt);
            }
        });
        tblRecentUploaded.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblRecentUploadedKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblRecentUploaded);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnShowPic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnShowPic.setText("Show Picture");
        btnShowPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPicActionPerformed(evt);
            }
        });

        btnAttachPicture.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAttachPicture.setText("AttachPicture");
        btnAttachPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachPictureActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        txtPath.setEditable(false);
        txtPath.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowPic)
                .addGap(18, 18, 18)
                .addComponent(btnAttachPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowPic)
                    .addComponent(btnAttachPicture)
                    .addComponent(btnBrowse)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Approval History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPreviousAttachments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null}
            },
            new String [] {
                "ClientId","UserName","Amount", "Crtd Date"

            }
        ));
        tblPreviousAttachments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPreviousAttachmentsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPreviousAttachmentsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPreviousAttachmentsMouseReleased(evt);
            }
        });
        tblPreviousAttachments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPreviousAttachmentsKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblPreviousAttachments);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed


    private void txtDocumentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentTypeActionPerformed
        // TODO add your handling code here:
        lov.LOVDefinitionSelection(DefinitionTypes.docType, txtDocumentType.getText().trim(), this);
        docTypeId = Constants.lovID;
        txtDocumentType.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtDocumentTypeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        if (ctlAttachment.updateRecentUploaded(patientId)) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnShowPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPicActionPerformed
        // TODO add your handling code here:
        try {
            webcam = Webcam.getDefault();
            webcam.setViewSize(WebcamResolution.VGA.getSize());
            webcam.open();

            WebcamPanel panel = new WebcamPanel(webcam);
            panel.setFPSDisplayed(true);
            panel.setSize(jPanel5.getSize());
            jPanel5.add(panel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnShowPicActionPerformed

    private void btnRefundAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefundAmountActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefundAmountActionPerformed

    private void btnAttachPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachPictureActionPerformed
        // TODO add your handling code here:
        if (docTypeId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Document Type "
                    + "Prior to Attach Picture.");
            txtDocumentType.requestFocus();
            return;
        }
        if (webcam == null) {
            return;
        }
        BufferedImage image = webcam.getImage();
        try {
//            path = System.getProperty("java.io.tmpdir") + patientId + docTypeId + ".png";
//            ImageIO.write(image, "PNG", new File(path));
            File f = null;
            id = ctlAttachment.selectDocTypePK();
            fileName = patientId + visitNo + docTypeId + id;
            System.err.println("\n\nSave Path: " + fileName);
            f = new File(path + fileName);
            ImageIO.write(image, "PNG", f);
            insertDocumentInDB();
            JOptionPane.showMessageDialog(null, "Writing complete.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Unable to Capture Picture!\n"
                    + "Please Contact Administrator");
        }

        webcam.close();
    }//GEN-LAST:event_btnAttachPictureActionPerformed

    private void tblRecentUploadedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRecentUploadedKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRecentUploadedKeyReleased

    private void tblRecentUploadedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecentUploadedMouseReleased
        // TODO add your handling code here:
        if (listRecentUploadedDocs.isEmpty()
                || tblRecentUploaded.getSelectedRow() < 0) {
            return;
        }
        DocumentAtachement obj = listRecentUploadedDocs.get(
                tblRecentUploaded.getSelectedRow());
        selectImageFromFolder(obj.getImageName());
//        setImage(obj.getId());
//        if (evt.getClickCount() % 2 == 0) {
//            if (ctlAttachment.deleteDocument(obj.getId())) {
//                selectRecentUploadedDocs();
//                JOptionPane.showMessageDialog(null, "");
//            } else {
//                JOptionPane.showMessageDialog(null, "Unable to Delete Information.\n"
//                        + "Please Contact Administrator.");
//            }
//        }
    }//GEN-LAST:event_tblRecentUploadedMouseReleased

    private void tblRecentUploadedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecentUploadedMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRecentUploadedMousePressed

    private void tblRecentUploadedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecentUploadedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRecentUploadedMouseClicked

    private void tblPreviousAttachmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousAttachmentsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreviousAttachmentsMouseClicked

    private void tblPreviousAttachmentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousAttachmentsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreviousAttachmentsMousePressed

    private void tblPreviousAttachmentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousAttachmentsMouseReleased
        // TODO add your handling code here:
        if (listPreviousUploadedDocs.isEmpty()
                || tblPreviousAttachments.getSelectedRow() < 0) {
            return;
        }
        DocumentAtachement obj = listPreviousUploadedDocs.get(
                tblPreviousAttachments.getSelectedRow());
        setImage(obj.getId());
        if (evt.getClickCount() % 2 == 0) {
            if (ctlAttachment.deleteDocument(obj.getId())) {
                selectRecentUploadedDocs();
                JOptionPane.showMessageDialog(null, "");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Delete Information.\n"
                        + "Please Contact Administrator.");
            }
        }
    }//GEN-LAST:event_tblPreviousAttachmentsMouseReleased

    private void tblPreviousAttachmentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPreviousAttachmentsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreviousAttachmentsKeyReleased

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        if (docTypeId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Document Type "
                    + "Prior to Attach Picture.");
            txtDocumentType.requestFocus();
            return;
        }
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("C:\\"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Documents", "jpg");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        String path = "";
        if (chooser.getSelectedFile() != null) {
            path = chooser.getSelectedFile().getAbsolutePath();
            txtPath.setText(path);
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to Attach"
                + " this " + path + " Picture?");
        if (confirmation != 0) {
            return;
        }
        insertDocumentInDB();
    }//GEN-LAST:event_btnBrowseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttachPicture;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefundAmount;
    private javax.swing.JButton btnShowPic;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JPanel pnlPatientDetail;
    private javax.swing.JTable tblPreviousAttachments;
    private javax.swing.JTable tblRecentUploaded;
    private javax.swing.JTextField txtDocumentType;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables

    private void selectPreviousDocsuments() {
        listPreviousUploadedDocs = ctlAttachment.selectPreviousUploadedDocs(patientId);
        if (listPreviousUploadedDocs.isEmpty()) {
            List<DocumentAtachement> listDocs = new ArrayList();
            listDocs.add(new DocumentAtachement());
            tblPreviousAttachments.setModel(new PreviousAttachmentsTableModel(listDocs));
        } else {
            tblPreviousAttachments.setModel(new PreviousAttachmentsTableModel(listPreviousUploadedDocs));
            ListSelectionModel selectionModel = tblPreviousAttachments.getSelectionModel();
            tblPreviousAttachments.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setPreviousAttachmentsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblPreviousAttachments);
        }
    }

    private void setPreviousAttachmentsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPreviousAttachments.getColumnCount(); i++) {
            column = tblPreviousAttachments.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void selectRecentUploadedDocs() {
        listRecentUploadedDocs = ctlAttachment.selectUploadedImages(patientId, "Y");
        if (listRecentUploadedDocs.isEmpty()) {
            List<DocumentAtachement> listDocs = new ArrayList();
            listDocs.add(new DocumentAtachement());
            tblRecentUploaded.setModel(new RecentUploadedAttachmentsTableModel(listDocs));
        } else {
            tblRecentUploaded.setModel(new RecentUploadedAttachmentsTableModel(listRecentUploadedDocs));
            ListSelectionModel selectionModel = tblRecentUploaded.getSelectionModel();
            tblRecentUploaded.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setRecentUploadedDocsColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblRecentUploaded);
        }
    }

    private void setRecentUploadedDocsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblRecentUploaded.getColumnCount(); i++) {
            column = tblRecentUploaded.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void setImage(String id) {
        try {
            Image procImage = ctlAttachment.selectDocumentImage(id);
            ImageIcon icon = new ImageIcon(procImage);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(lblPicture.getWidth(),
                    lblPicture.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImc = new ImageIcon(newImg);
            lblPicture.setIcon(newImc);

        } catch (NullPointerException ex) {
            lblPicture.setIcon(null);
        }
    }

    private void insertDocumentInDB() {
        inrDoc.setId(id);
        inrDoc.setPatientId(patientId);
        inrDoc.setVisitNo(visitNo);
        inrDoc.setImageName(fileName);
        if (ctlAttachment.insertAtachedImageInfo(inrDoc)) {
            JOptionPane.showMessageDialog(null, "Picture Attached Successfully!");
            txtDocumentType.setText("");
            txtPath.setText("");
            selectRecentUploadedDocs();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save picture Kindly Contact Administrator");
            webcam.close();
            return;
        }
    }

//    private static void save( String fileName, String ext) {
//
//        File file = new File(fileName + "." + ext);
//        
//        try {
//            
//            BufferedImage image = webcam.getImage();
//        String path = "";
//
//    
//            path = System.getProperty("java.io.tmpdir") + patientId + docTypeId + ".png";
//            ImageIO.write(image, "PNG", new File(path));
//
//        } catch (IOException e) {
//            System.out.println("Write error for " + file.getPath()
//                    + ": " + e.getMessage());
//        }
//    }
    private void selectImageFromFolder(String fileName) {
        int width = 422;    //width of the image
        int height = 389;   //height of the image
        BufferedImage image = null;
        File f = null;
        try {
            System.err.println("\n\nselect Path: " + path + fileName);
            f = new File(path + fileName); //image file path
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(f);
            ImageIcon icon = new ImageIcon(image);
            Image img = icon.getImage();// Resizing for Label
            Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon newImc = new ImageIcon(newImg);
            lblPicture.setIcon(newImc);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }
}
