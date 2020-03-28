/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler.Administration;

import BO.Administration.DocumentAtachement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;

/**
 *
 * @author admin
 */
public class DocumentAttachmentHandler {

    public boolean insertAtachedImageInfo(DocumentAtachement InrDoc) {

        String[] columns = {Database.DCMS.documentAttachment, "ID", "PATIENT_ID",
            "VISIT_NO", "IMAGE_NAME", "DOC_TYPE_ID", "ACTIVE", "CRTD_BY", "CRTD_DATE",
            "CRTD_TERMINAL_ID"};

        HashMap map = new HashMap();
        map.put("ID", "'" + InrDoc.getId() + "'");
        map.put("PATIENT_ID", "'" + InrDoc.getPatientId() + "'");
        map.put("VISIT_NO", "'" + InrDoc.getVisitNo() + "'");
        map.put("IMAGE_NAME", "'" + InrDoc.getImageName() + "'");
        map.put("DOC_TYPE_ID", "'" + InrDoc.getDocTypeId() + "'");
        map.put("ACTIVE", "'Y'");
        map.put("CRTD_BY", "'" + Constants.userId + "'");
        map.put("CRTD_DATE", Constants.today);
        map.put("CRTD_TERMINAL_ID", "'" + Constants.terminalId + "'");

        List InsertEmp = new ArrayList();
        InsertEmp.add(map);
        return Constants.dao.insertData(InsertEmp, columns);
    }

    public List<DocumentAtachement> selectUploadedImages(String patientId,
            String recentImage) {

        String[] cols = {"-", "ID", "PATIENT_ID", "VISIT_NO", "CRTD_BY_NAME",
            "IMAGE_NAME", "DOC_TYPE_ID", "DOC_DESCRIPTION", "ACTIVE", "CRTD_BY",
            "CRTD_DATE", "CRTD_TERMINAL_ID"};

        String query
                = "SELECT DA.ID,\n"
                + "       DA.PATIENT_ID,\n"
                + "       DA.VISIT_NO, DA.IMAGE_NAME,\n"
                + "       DA.DOC_TYPE_ID,\n"
                + "       DOC.DESCRIPTION DOC_DESCRIPTION,\n"
                + "       DA.ACTIVE,\n"
                + "       DA.CRTD_BY, USR.NAME CRTD_BY_NAME,\n"
                + "       DA.CRTD_DATE,\n"
                + "\n     DA.CRTD_TERMINAL_ID\n"
                + "\n FROM " + Database.DCMS.documentAttachment + "DA,"
                + "\n" + Database.DCMS.definitionTypeDetail + "DOC,"
                + "\n" + Database.DCMS.users + "USR"
                + "\n WHERE DA.PATIENT_ID = " + patientId
                + "\n AND DA.DOC_TYPE_ID = DOC.ID"
                + "\n AND DA.CRTD_BY = USR.USER_NAME"
                + "\n AND DA.RECENT_UPLOADED = '" + recentImage + "'"
                + "\n AND DA.ACTIVE = 'Y'"
                + "\n ORDER BY CRTD_DATE DESC";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);

        List<DocumentAtachement> listItems = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);

            DocumentAtachement setItems = new DocumentAtachement();
            setItems.setId(map.get("ID").toString());
            setItems.setPatientId(map.get("PATIENT_ID").toString());
            setItems.setVisitNo(map.get("VISIT_NO").toString());
            setItems.setImageName(map.get("IMAGE_NAME").toString());
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

    public boolean updateRecentUploaded(String patId) {
        String query = "UPDATE " + Database.DCMS.documentAttachment
                + "\n SET RECENT_UPLOADED = 'N'"
                + "\n WHERE RECENT_UPLOADED = 'Y'"
                + "\n AND PATIENT_ID = '" + patId + "'";
        return Constants.dao.executeUpdate(query, false);
    }

    public boolean deleteDocument(String Id) {
        String query = "UPDATE " + Database.DCMS.documentAttachment
                + "\n SET ACTIVE = 'N'"
                + "\n WHERE ACTIVE = 'Y'"
                + "\n AND ID = " + Id;
        return Constants.dao.executeUpdate(query, false);
    }

    public String selectImagePath(String id) {
        String[] columns = {"-", "PATH"};
        String query = " SELECT PATH FROM " + Database.DCMS.pacsProcessPath
                + "\n WHERE ID = " + id;

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("PATH").toString();
    }

    public String selectDocTypePK() {
        String[] columns = {"-", "ID"};
        String query = " SELECT NVL(MAX(ID) + 1, 1) ID FROM     \n"
                + Database.DCMS.documentAttachment + "     \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, columns);
        return list.get(0).get("ID").toString();
    }
}
