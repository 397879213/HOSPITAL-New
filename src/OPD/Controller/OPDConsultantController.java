/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.Controller;


import OPD.BO.BOOPDConsultant;
import OPD.Handler.OPDConsultantHandler;
import java.util.List;


/**
 *
 * @author 
 */
public class OPDConsultantController {

    OPDConsultantHandler opdConsul = new OPDConsultantHandler();
    
    public List<BOOPDConsultant> selectConsultantSearch(String fromDate, String toDate,
            String userId, String SpecialityId){
        return opdConsul.selectConsultantSearch(fromDate,toDate,userId, SpecialityId);
        }
    
     public List<BOOPDConsultant> selectPatientHistory(String fromDate, String toDate, String userId){
       return opdConsul.selectPatientHistory(fromDate,toDate,userId); 
    }
    
     public List<BOOPDConsultant> selectTotalPerform(String fromDate, String toDate, String userId){
       return opdConsul.selectTotalPerform(fromDate,toDate,userId); 
    }
    
  }

