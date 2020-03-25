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

    public List<DocumentAtachement> selectRecentUploadedDocs(String patientId) {
        return hdlAttachment.selectRecentUploadedDocs(patientId);
    }
    
    public List<DocumentAtachement> selectPreviousUploadedDocs(String patientId) {
        return hdlAttachment.selectPreviousUploadedDocs(patientId);
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
    
    public boolean deleteDocument(String Id){
        boolean ret = hdlAttachment.deleteDocument(Id);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertDocument(String id, String patientId,
            String visitNo, String doctypeId, String path) {
        boolean ret = hdlAttachment.insertDocument(hdlAttachment.selectDocTypePK(),
                patientId, visitNo, doctypeId, path);
        if (ret) {
            Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

}
