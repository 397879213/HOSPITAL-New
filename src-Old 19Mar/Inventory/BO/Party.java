/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inventory.BO;

/**
 *
 * @author UsmanSaeed
 */
public class Party {
    private String partyId = "";
    private String partyRefId = "";
    private String partyDescription = "";
    private String partyAddress = "";
    private String partyPhoneNo = "";
    private String partyEmail = "";
    private String partyNtn = "";
    private String partySalesTax = "";
    private String active = "";

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyDescription() {
        return partyDescription;
    }

    public void setPartyDescription(String partyDescription) {
        this.partyDescription = partyDescription;
    }

    public String getPartyAddress() {
        return partyAddress;
    }

    public void setPartyAddress(String partyAddress) {
        this.partyAddress = partyAddress;
    }

    public String getPartyPhoneNo() {
        return partyPhoneNo;
    }

    public void setPartyPhoneNo(String partyPhoneNo) {
        this.partyPhoneNo = partyPhoneNo;
    }

    public String getPartyEmail() {
        return partyEmail;
    }

    public void setPartyEmail(String partyEmail) {
        this.partyEmail = partyEmail;
    }

    public String getPartyNtn() {
        return partyNtn;
    }

    public void setPartyNtn(String partyNtn) {
        this.partyNtn = partyNtn;
    }

    public String getPartySalesTax() {
        return partySalesTax;
    }

    public void setPartySalesTax(String partySalesTax) {
        this.partySalesTax = partySalesTax;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPartyRefId() {
        return partyRefId;
    }

    public void setPartyRefId(String partyRefId) {
        this.partyRefId = partyRefId;
    }
}
