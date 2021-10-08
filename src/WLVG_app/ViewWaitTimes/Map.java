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
    private ArrayList<RideList> listOfRides;
    //private 
    
    public Map(String location, ArrayList<RideList> listOfRides)
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
    public ArrayList<RideList> getListOfRides() {
        return listOfRides;
    }

    /**
     * @param listOfRides the listOfRides to set
     */
    public void setListOfRides(ArrayList<RideList> listOfRides) {
        this.listOfRides = listOfRides;
    }
    
    
}
