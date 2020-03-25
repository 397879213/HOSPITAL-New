/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.DocumentAtachement;
import Inventory.BO.StoreManualIndent;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.DAO;
import static utilities.DAO.conn;
import utilities.Database;

/**
 *
 * @author admin
 */
public class DocumentAttachmentHandler {

    public List<DocumentAtachement> selectDocuments(String patientId) {

        String[] cols = {"-", "ID", "PATIENT_ID", "VISIT_NO", "CRTD_BY_NAME",
            "DOC_TYPE_ID", "DOC_DESCRIPTION", "ACTIVE", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT DA.ID,\n"
                + "       DA.PATIENT_ID,\n"
                + "       DA.VISIT_NO,\n"
                + "       DA.DOC_TYPE_ID,\n"
                + "       DOC.DESCRIPTION DOC_DESCRIPTION,\n"
                + "       DA.ACTIVE,\n"
                + "       DA.CRTD_BY, USR.NAME CRTD_BY_NAME,\n"
                + "       DA.CRTD_DATE,\n"
                + "\n     DA.CRTD_TERMINAL_ID\n"
                + "\n FROM " + Database.DCMS.documentAttachment + "DA,"
                + "\n"+ Database.DCMS.definitionTypeDetail + "DOC,"
                + "\n"+ Database.DCMS.users + "USR"
                + "\n WHERE DA.PATIENT_ID = " + patientId
                + "\n AND DA.DOC_TYPE_ID = DOC.ID"
                + "\n AND DA.CRTD_BY = USR.USER_NAME"
                + "\n AND DA.ACTIVE = 'Y'";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);

        List<DocumentAtachement> listItems = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);

            DocumentAtachement setItems = new DocumentAtachement();
            setItems.setId(map.get("ID").toString());
            setItems.setPatientId(map.get("PATIENT_ID").toString());
            setItems.setVisitNo(map.get("VISIT_NO").toString());
            setItems.setDocTypeId(map.get("DOC_TYPE_ID").toString());
            setItems.setDocTypeDescription(map.get("DOC_DESCRIPTION").toString());
            setItems.setActive(map.get("ACTIVE").toString());
            setItems.setCrtdBy(map.get("CRTD_BY").toString());
            setItems.setCrtdByName(map.get("CRTD_BY_NAME").toString());
            setItems.setCrtdDate(map.get("CRTD_DATE").toString());
            setItems.setCrtdTerminalId(map.get("CRTD_TERMINAL_ID").toString());
            listItems.add(setItems);
        }
        return listItems;
    }

    public Image selectDocumentImage(String id) {

        String query = "SELECT PICTURE FROM "
                + Database.DCMS.documentAttachment + " WHERE ID = " + id;
        System.out.println(query);
        Image image = null;
        Connection conn = null;
        try {
            if (DAO.conn == null || DAO.conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }

            // Prepare a Statement:
            PreparedStatement stmnt = DAO.conn.prepareStatement(query);
            // Execute
            ResultSet rs = stmnt.executeQuery();
            if (rs.next()) {
                try {
                    // Get as a BLOB
                    Blob aBlob = rs.getBlob(1);
                    byte[] allBytesInBlob = aBlob.getBytes(1, (int) aBlob.length());

                    image = Toolkit.getDefaultToolkit().createImage(allBytesInBlob);

                } catch (Exception ex) {
                    byte[] bytes;
                    bytes = rs.getBytes(1);
                    System.out.print("Image is not Find");

                }
            }

            // Close resources
            rs.close();
            stmnt.close();
            //conn.close();
            // Constants.dao.conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error when trying to read BLOB: " + ex);
        }
        return image;
    }
    
    
    public String selectDocTypePK() {
        String[] columns = {"-", "ID"};
        String query = " SELECT NVL(MAX(ID) + 1, 1) ID FROM     \n"
                + Database.DCMS.documentAttachment + "     \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }

    public boolean insertDocument(String id, String patientId,
            String visitNo, String doctypeId, String path) {
        boolean ret = true;
        try {
            if (conn == null || conn.isClosed()) {
                conn = Constants.dao.getConnection();
            }
            File fBlob = new File(path);
            InputStream input = new FileInputStream(fBlob);
            PreparedStatement pstmt = conn.prepareStatement("INSERT "
                    + " INTO  " + Database.DCMS.documentAttachment
                    + " (ID, PATIENT_ID, VISIT_NO, DOC_TYPE_ID,PICTURE, ACTIVE,"
                    + " CRTD_BY, CRTD_TERMINAL_ID)VALUES (?,?,?,?,?,?,?,?)");
            pstmt.setString(1, id);
            pstmt.setString(2, patientId);
            pstmt.setString(3, visitNo);
            pstmt.setString(4, doctypeId);
            pstmt.setBinaryStream(5, input, (int) fBlob.length());//);
            pstmt.setString(6, "Y");
            pstmt.setString(7, Constants.userId);
            pstmt.setString(8, Constants.terminalId);
            pstmt.execute();
//            conn.commit();
//            conn.close();
        } catch (Exception ex) {
            ret = false;
            ex.printStackTrace();
        }
        return ret;
    }
}
