/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

import java.util.ArrayList;

/**
 *
 * @author tomia
 */
public class Map 
{
    private String location;
    private ArrayList<RideDetails> listOfRides;
    //private 
    
    public Map(String location, ArrayList<RideDetails> listOfRides)
    {
        this.location = location;
        this.listOfRides = listOfRides;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the listOfRides
     */
    public ArrayList<RideDetails> getListOfRides() {
        return listOfRides;
    }

    /**
     * @param listOfRides the listOfRides to set
     */
    public void setListOfRides(ArrayList<RideDetails> listOfRides) {
        this.listOfRides = listOfRides;
    }
    
    
}
