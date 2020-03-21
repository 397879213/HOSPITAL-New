/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DailyActivity.BO;

/**
 *
 * @author Raheel Ansari
 */
public class BOLocWiseClient {
    
    private String clientId;
    private String clientDescription;
    private String locationId;
    private String locationDescription;
    private String id;
    private String transectionType;

    
    public BOLocWiseClient(){
    
    }
    
    public BOLocWiseClient(String clientId, String locId){
    
        this.clientId = clientId;
        this.locationId = locId;
    }
    
    
    public String getTransectionType() {
        return transectionType;
    }

    public void setTransectionType(String transectionType) {
        this.transectionType = transectionType;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientDescription() {
        return clientDescription;
    }

    public void setClientDescription(String clientDescription) {
        this.clientDescription = clientDescription;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
}
