/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

import java.sql.Time;

/**
 *
 * @author tomia
 */
public class RideList 
{
    private String attraction;
    private Time waitTime;
    private int maxCapacity;
    private String rideHours;
    
    public RideList(String attraction, String rideHours, Time waitTime, int maxCapacity)
    {
        this.attraction = attraction;
        this.waitTime = waitTime;
        this.rideHours = rideHours;
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return the attraction
     */
    public String getAttraction() {
        return attraction;
    }

    /**
     * @param attraction the attraction to set
     */
    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    /**
     * @return the waitTiime
     */
    public Time getWaitTime() {
        return waitTime;
    }

    /**
     * @param waitTime the waitTime to set
     */
    public void setWaitTime(Time waitTime) {
        this.waitTime = waitTime;
    }
    
    /*
    checks to see if ride is at maxCapacity
    */
    public boolean checkCapacity()
    {
        boolean isFull = true;
        return isFull;
    }
}
