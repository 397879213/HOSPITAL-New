/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Administration;

import BO.Administration.BOpatientUpdateHistory;
import Handler.Administration.patientUpdateHistoryHandler;
import java.util.List;

/**
 *
 * @author Muhammad Talha Khan
 */
public class patientUpdateHistoryController {

    patientUpdateHistoryHandler updtHis = new patientUpdateHistoryHandler();
    
    public List<BOpatientUpdateHistory> selectPatSearch(String patientID){
        return updtHis.selectPatientSearch(patientID);
        }
    
     public List<BOpatientUpdateHistory> selectPatientHistory(String patientID){
       return updtHis.selectPatientHistory(patientID); 
    }
    
    
  }

