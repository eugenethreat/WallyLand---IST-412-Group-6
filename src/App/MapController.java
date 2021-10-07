/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waittime;

/**
 * controller for map
 * @author tomia
 */
public class MapController 
{
     private RideList rideList;
   /**
    * Creates UI and model
    */
    public MapController(RideList rideList)
    {
        this.rideList = rideList;
    }
    
    /**
    *Retrieves list of rides from Map
    */
    public RideList getRideList() {
        return rideList;
    }
    
}
