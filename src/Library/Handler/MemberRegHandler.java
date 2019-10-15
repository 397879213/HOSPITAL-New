/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library.Handler;


import BO.MemberReg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;
import utilities.Keys;
import utilities.Sequences;

/**
 *
 * @author PACSLinks
 */
public class MemberRegHandler {
    
    //SELECT QUERY
    public List<MemberReg> SearchMemberReg(String memberId,String name,
            String refId, String contactNum){
        
        String[] columns={"-","ID","RF_ID","ACTIVE","NAME","AGE","GENDER","GENDER_ID","CNIC",
            "INSTITUTE_ID","INSTITUTE","DEPART_ID","DEPT","CONTACT","MAX_BOOK",
            "EMAIL","ADDRESS","CRTD_DATE","TYPE","TYPE_ID"};
        
        String query
                    ="SELECT MR.ID                              ID,          \n"
                    +"MR.MEMBER_REFERENCE_ID                    RF_ID,       \n"
                    +"MR.IS_ACTIVE                              ACTIVE,      \n"
                    +"MR.NAME                                   NAME,        \n"
                    +"MR.AGE                                    AGE,         \n"
                    +"GENDER.DESCRIPTION                        GENDER,      \n"
                    +"MR.GENDER_ID                              GENDER_ID,   \n"
                    +"MR.CNIC                                   CNIC,        \n"
                    +"MR.INSTITUTE                              INSTITUTE_ID,\n"
                    +"INSTITUTE.DESCRIPTION                     INSTITUTE,   \n"
                    +"MR.DEPARTMENT_ID                          DEPART_ID,   \n"
                    +"DEPARTMENT.DESCRIPTION                    DEPT,        \n"
                    +"MR.CONTACT_NO                             CONTACT,     \n"
                    +"MR.MAX_BOOK_LIMIT                         MAX_BOOK,    \n"
                    +"MR.EMAIL_ADDRESS                          EMAIL,       \n"
                    +"MR.ADDRESS                                ADDRESS,     \n"
                    +"TO_CHAR(MR.CRTD_DATE,'DD-MM-YYYY')        CRTD_DATE,   \n"
                    +"MR.TYPE                                   TYPE_ID,     \n"
                    +"TYPE.DESCRIPTION                          TYPE         \n"
                    +" FROM                                                  \n"
                    + Database.DCMS.member+                   "MR,           \n"
                    + Database.DCMS.definitionTypeDetail+      "GENDER,      \n"
                    + Database.DCMS.definitionTypeDetail +     "INSTITUTE,   \n"
                    + Database.DCMS.definitionTypeDetail +     "DEPARTMENT,  \n"
                    + Database.DCMS.definitionTypeDetail +     "TYPE         \n";
                   
        
        
        if (!memberId.isEmpty()) {
            query += " WHERE MR.ID = '" 
                    + memberId.trim() + "' \n";
        }
        
        if (memberId.isEmpty() && name.isEmpty() && 
                refId.isEmpty() && contactNum.isEmpty()) {
            query += " WHERE UPPER(MR.NAME) LIKE '%" 
                    + memberId.trim().toUpperCase() + "%' \n";
        }
        
        
        if(!name.isEmpty()){
                
            query += " WHERE MR.NAME LIKE('%" 
                    + name.trim().toUpperCase() + "%') \n";
        }

        if (!refId.isEmpty()) {
            query += " WHERE MR.MEMBER_REFERENCE_ID = '"
                    + refId.trim() + "'  \n";
        }
        
        if(!contactNum.isEmpty()){
            
                query += "WHERE MR.CONTACT_NO = '"
                        + contactNum.trim() +"' \n";
            }
        
//        if(name.isEmpty() && memberId.isEmpty() && refId.isEmpty()
//                && contactNum.isEmpty()){
//        
//            query += " WHERE UPPER(MR.ID) LIKE '%" 
//                    + memberId.trim().toUpperCase() + "%' \n";
//        }

                 query += "AND  MR.GENDER_ID = GENDER.ID                     \n"
                    +"AND  MR.DEPARTMENT_ID = INSTITUTE.ID                   \n"
                    +"AND  MR.DEPARTMENT_ID = DEPARTMENT.ID                  \n"
                    +"AND  MR.TYPE = TYPE.ID                                 \n";
                   
                
         List<HashMap> listmap = Constants.dao.selectDatainList(query, columns);
              
         List<MemberReg> lismreg = new ArrayList<>();
        
        for (int i =0; i < listmap.size(); i++){
            
            HashMap map = (HashMap) listmap.get(i);                              
            MemberReg objregm = new MemberReg();
            
            objregm.setMemberId(map.get("ID").toString());
            objregm.setRefId(map.get("RF_ID").toString());
            objregm.setActive(map.get("ACTIVE").toString());
            objregm.setName(map.get("NAME").toString());
            objregm.setAge(map.get("AGE").toString());
            objregm.setGender(map.get("GENDER").toString());
            objregm.setGenderId(map.get("GENDER_ID").toString());
            objregm.setCnic(map.get("CNIC").toString());
            objregm.setInstitute(map.get("INSTITUTE").toString());
            objregm.setInstituteId(map.get("INSTITUTE_ID").toString());
            objregm.setDept(map.get("DEPT").toString());
            objregm.setDepartId(map.get("DEPART_ID").toString());
            objregm.setContact(map.get("CONTACT").toString());
            objregm.setMaxBook(map.get("MAX_BOOK").toString());
            objregm.setEmail(map.get("EMAIL").toString());
            objregm.setAddress(map.get("ADDRESS").toString()); 
            objregm.setMemberSince(map.get("CRTD_DATE").toString());
            objregm.setMemberType(map.get("TYPE").toString());
            objregm.setMemberTypeId(map.get("TYPE_ID").toString());
            lismreg.add(objregm);
    }
            return lismreg;
    }         
        //UPDATE Query!
    
    public boolean  UpdateMemberReg(MemberReg objSave){
    
       String query 
                   = " UPDATE " + Database.DCMS.member + "\n SET "
                   + "NAME =           '" +objSave.getName().trim() +"',      \n"
                   + "AGE =            '" +objSave.getAge().trim() +"',       \n"
                   + "GENDER_ID =      '" +objSave.getGenderId().trim() +"',  \n"
                   + "CNIC =           '" +objSave.getCnic().trim() +"',      \n"
                   + "INSTITUTE =        '" +objSave.getInstituteId().trim() +"', \n"
                   + "DEPARTMENT_ID =  '" +objSave.getDept() +"',             \n"
                   + "MAX_BOOK_LIMIT = '" +objSave.getMaxBook().trim() +"',   \n";
       
       if(!objSave.getActive().equalsIgnoreCase("Y")){
            query += "IS_ACTIVE = '"+ objSave.getActive() +"',                 \n";
       }
       
        query   +=   "CONTACT_NO =     '" +objSave.getContact().trim() +"',    \n"
                   + "EMAIL_ADDRESS =  '" +objSave.getEmail().trim() +"',      \n"
                   + "ADDRESS =        '" +objSave.getAddress().trim() +"' ,   \n"
                   + "TYPE =        '" +objSave.getMemberTypeId().trim() +"'   \n"
                   + "WHERE  ID = '" + objSave.getMemberId().trim() +    "'   \n";
               
       return Constants.dao.executeUpdate(query, false);
       
    }

    //INSERT QUERY
   
    GenerateKeys key = new GenerateKeys();
    
    public boolean insertMemberReg(MemberReg objSave){
    
    
    String[] columns={Database.DCMS.member, "ID" , "MEMBER_REFERENCE_ID" , 
        "NAME" , "AGE" , "GENDER_ID" , "CNIC" , 
        "INSTITUTE" , "DEPARTMENT_ID" , "CONTACT_NO" , 
        "MAX_BOOK_LIMIT" , "EMAIL_ADDRESS" , "ADDRESS","IS_ACTIVE","TYPE"};
    
            HashMap insertMem = new HashMap();
            insertMem.put("ID", Sequences.memberId);                   
            insertMem.put("MEMBER_REFERENCE_ID","'" +objSave.getRefId()+"'");
            insertMem.put("NAME","'" +objSave.getName()+"'");
            insertMem.put("AGE","'" +objSave.getAge()+"'");
            insertMem.put("GENDER_ID","'" +objSave.getGender()+"'");
            insertMem.put("CNIC","'" +objSave.getCnic()+"'");
            insertMem.put("PROGRAM","'" +objSave.getInstituteId()+"'");
            insertMem.put("DEPARTMENT_ID","'" +objSave.getDept()+"'");
            insertMem.put("INSTITUTE","'" +objSave.getInstituteId()+"'");
            insertMem.put("CONTACT_NO","'" +objSave.getContact()+"'");
            insertMem.put("MAX_BOOK_LIMIT","'" +objSave.getMaxBook()+"'");
            insertMem.put("EMAIL_ADDRESS","'" +objSave.getEmail()+"'");
            insertMem.put("ADDRESS","'" +objSave.getAddress()+"'");
            insertMem.put("IS_ACTIVE","'" +objSave.getActive()+"'");
            insertMem.put("TYPE","'" +objSave.getMemberTypeId()+"'");
           
             List lstMember = new ArrayList();
             lstMember.add(insertMem);
              return Constants.dao.insertData(lstMember, columns);
            
    
    }
        
        
}
