/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

/**
 * controller for map
 * @author tomia
 */
public class MapController 
{
     private RideDetails rideList;
   /**
    * Creates UI and model
    */
    public MapController(RideDetails rideList)
    {
        this.rideList = rideList;
    }
    
    /**
    *Retrieves list of rides from Map
    */
    public RideDetails getRideList() {
        return rideList;
    }
    
}
