/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;




import BO.Hospital.TraumaPerformVisitBO;
import Handler.Hospital.TraumaPerformVisitHandler;


import java.util.List;

/**
 *
 * @author Muhammad Talha Khan
 */
public class TraumaPerformVisitController {
    
     TraumaPerformVisitHandler performVisitHdl = new TraumaPerformVisitHandler();
    
    public List<TraumaPerformVisitBO> selectPatientSearch(String patientId, String categoryId,
    String complaintId, String fromDate, String toDate){
        return performVisitHdl.selectPatientSearch(patientId,categoryId,complaintId,fromDate,toDate);
    
}
    
     public List<TraumaPerformVisitBO> selectVisitOrders(String traumaVisitId){
        return performVisitHdl.selectVisitOrders(traumaVisitId);
    
}
     
}
