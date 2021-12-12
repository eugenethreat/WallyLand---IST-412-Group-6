package WLVG_app.Ticketing;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a particular WLVG location
 *
 * @author eugene
 */
public class Park {

    private String parkName;
    private int parkId;
    private String parkAddress;
    private ArrayList<String> parkInfo;
    private LocalTime openingTime;
    private LocalTime closingTime;

    /**
     * Default constructor for park object
     */
    public Park() {
        parkName = "Default Park";
        parkId = 0;
        parkAddress = "123 John Doe Lane, State, Country, 000000";
        parkInfo = new ArrayList<>();
    }

    /**
     *
     * @param pn - parameter passed to parkName (the name of the park)
     * @param pId - parameter passed to parkId (the park's id within WLVG
     * systems)
     * @param pa - parameter passed to parkAddress (the park's physical address)
     * @param info - parameter passed to parkInfo (general information about the
     * park)
     * @param paramOpenTime - park's opening time 
     * @param paramClosingTime - park's closing time 
     */
    public Park(String pn, int pId, String pa, ArrayList<String> info, LocalTime paramOpenTime, LocalTime paramClosingTime) {
        parkName = pn;
        parkId = pId;
        parkAddress = pa;
        parkInfo = info;
        openingTime = paramOpenTime;
        closingTime = paramClosingTime;

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

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public boolean checkExpired(Ticket t) {
        boolean ticketExpired = false;

        Date ticketTime = t.getTicketValidDuring();
        
        //if the time is...
        Date parkHours = new Date(2021, 9, 10);

        if (ticketTime.after(parkHours)){
            ticketExpired = true; 
        }

        return ticketExpired;

    }

}
