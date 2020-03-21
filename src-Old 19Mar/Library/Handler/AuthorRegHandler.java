/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Handler;

import Library.BO.AuthorRegBO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Sequences;

/**
 *
 * @author razas
 */
public class AuthorRegHandler {
     
    
    public List<AuthorRegBO> selectAuthor(String authorName ){
    
      String[] columns = {"-", "Author_ID", "Author_Name", "CRTD_BY"};
        
        String query = " SELECT LBA.ID Author_ID,                 \n"
                + " LBA.DESCRIPTION Author_Name,                  \n"
                + " LBA.CRTD_BY CRTD_BY                           \n"
                + " FROM " + Database.DCMS.bookAuthor + " LBA     \n"
                + " WHERE DESCRIPTION LIKE '%"
                + authorName.toUpperCase() + "%'";
        
        List<HashMap> lisMap = Constants.dao.selectDatainList(query, columns);
        
        List<AuthorRegBO> lstData = new ArrayList();
        
        for (int i = 0; i <lisMap.size(); i++ ){
        
            HashMap map = (HashMap) lisMap.get(i);
            AuthorRegBO objBo = new  AuthorRegBO();
            
            
            objBo.setAuthorID(map.get("Author_ID").toString());
            objBo.setAuthorDescription(map.get("Author_Name").toString());
            objBo.setCrtdBy(map.get("CRTD_BY").toString());
            lstData.add(objBo);
        }
            return lstData;
    }   
    
    
       public boolean insertAuthorReg(AuthorRegBO objSave){
    
    
    String[] columns={Database.DCMS.bookAuthor, "ID" , "DESCRIPTION" };
    
        HashMap insertAuther = new HashMap();
//            insertAuther.put("ID", Sequences.authorSeq);                  
            insertAuther.put("DESCRIPTION","'" +objSave.getAuthorDescription().toUpperCase().trim()+"'");
            insertAuther.put("CRTD_BY ","'" + Constants.userId + "'");
            insertAuther.put("CRTD_DATE ","'" + Constants.today + "'");
            insertAuther.put("CRTD_TERMINAL_ID ","'" + Constants.terminalId + "'");
            
            
             List lstAuthor = new ArrayList();
             lstAuthor.add(insertAuther);
              return Constants.dao.insertData(lstAuthor, columns);
       }
}
       
//       public boolean updateAuthorReg(AuthorRegBO objSave){
       
          // String query
//                   = " Update " + Database.DCMS.bookAuthor + "\n set"
                   //+ " DESCRIPTION =       '" +objSave.getAuthorDescription().toUpperCase().trim() +"'     \n"
                  // + " WHERE ID = '" + objSave.getAuthorID().trim() + "'";
//          return Constants.dao.executeUpdate(query, false);
//       }
             
    
//}
