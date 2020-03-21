

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO.Management;
 
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class WidalReportingBo implements java.io.Serializable {


    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String parameterName = "";
    private String parameterId = "";
    private String specimen = "";
    private String remarks = "";
    private String sol20 = "";
     private String sol40 = "";
    private String sol80 = "";
    private String sol160 = "";
    private String sol320 = "";

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public String getParameterId() {
        return parameterId;
    }
    public String getSpecimen() {
        return specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }
    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSol20() {
        return sol20;
    }

    public void setSol20(String sol20) {
        this.sol20 = sol20;
    }

    public String getSol40() {
        return sol40;
    }

    public void setSol40(String sol40) {
        this.sol40 = sol40;
    }

    public String getSol80() {
        return sol80;
    }

    public void setSol80(String sol80) {
        this.sol80 = sol80;
    }

    public String getSol160() {
        return sol160;
    }

    public void setSol160(String sol160) {
        this.sol160 = sol160;
    }

    public String getSol320() {
        return sol320;
    }

    public void setSol320(String sol320) {
        this.sol320 = sol320;
    }
   
}
