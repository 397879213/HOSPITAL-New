/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.DocumentAtachement;
import Handler.Administration.DocumentAttachmentHandler;
import java.awt.Image;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author admin
 */
public class DocumentAttachmentController {

    DocumentAttachmentHandler hdlAttachment = new DocumentAttachmentHandler();

    public List<DocumentAtachement> selectUploadedImages(String patientId, 
            String recentImage) {
        return hdlAttachment.selectUploadedImages(patientId, recentImage);
    }

    public List<DocumentAtachement> selectPreviousUploadedDocs(String patientId) {
        return hdlAttachment.selectPreviousUploadedDocs(patientId);
    }

    public boolean insertAtachedImageInfo(DocumentAtachement InrDoc) {
        boolean ret = hdlAttachment.insertAtachedImageInfo(InrDoc);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public String selectImagePath(String id) {
        return hdlAttachment.selectImagePath(id);
    }

    public Image selectDocumentImage(String id) {
        return hdlAttachment.selectDocumentImage(id);
    }

    public boolean updateRecentUploaded(String patId) {

        boolean ret = hdlAttachment.updateRecentUploaded(patId);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean deleteDocument(String Id) {
        boolean ret = hdlAttachment.deleteDocument(Id);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public String selectDocTypePK() {
        return hdlAttachment.selectDocTypePK();
    }

    public boolean insertDocument(String id, String patientId, String visitNo,
            String doctypeId, String path) {
        boolean ret = hdlAttachment.insertDocument(id, patientId, visitNo,
                doctypeId, path);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}
