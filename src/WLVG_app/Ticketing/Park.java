package WLVG_app.Ticketing;

import java.util.ArrayList;

/**
 * Represents a particular WLVG location
 * @author eugene
 */

public class Park {
    
    private String parkName; 
    private int parkId; 
    private String parkAddress;
    private ArrayList<String> parkInfo;

    /**
     * Default constructor for park object 
     */
    public Park(){
        parkName = "Default Park";
        parkId = 0;
        parkAddress = "123 John Doe Lane, State, Country, 000000";
        parkInfo = new ArrayList<>();
    }
    
    /**
     *
     * @param pn - parameter passed to parkName (the name of the park)
     * @param pId - parameter passed to parkId (the park's id within WLVG systems)
     * @param pa - parameter passed to parkAddress (the park's physical address)
     * @param info - parameter passed to parkInfo (general information about the park)
     */
    public Park(String pn, int pId, String pa, ArrayList<String> info){
        parkName = pn;
        parkId = pId;
        parkAddress = pa;
        parkInfo = info;
    }
            
    //Methods 
    /** 
     * @return the parkName
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * @return the parkId
     */
    public int getParkId() {
        return parkId;
    }

    /**
     * @return the parkAddress
     */
    public String getParkAddress() {
        return parkAddress;
    }

     /**
     * @return the parkInfo
     */
    public ArrayList<String> getParkInfo() {
        return parkInfo;
    }
    

}
