
package WLVG_app.testing;

import WLVG_app.ViewWaitTimes.Map;
import WLVG_app.ViewWaitTimes.MapController;
import WLVG_app.ViewWaitTimes.MapUI;
import WLVG_app.ViewWaitTimes.RideList;
import java.sql.Time;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 //@author tomia
 
public class testharness
{
    static private RideList rideList;
    static private MapUI mapUI;
    static private MapController mapCntl;
    static private Map map;
    static private ArrayList<RideList> listOfRides;
    
    
    public static void main(String[] args)
    {
        Time t = null;
        
        rideList = new RideList("Wally Coaster", "8 AM - 6 PM", t, 30);
        mapUI = new MapUI();
        mapCntl = new MapController(rideList);
        map = new Map("West section", listOfRides);
        
        System.out.println("Testing the test harness");
        
        boolean boolCapacity = false;
        
        if(rideList.checkCapacity()){
            boolCapacity = true;
        }
        
        System.out.println("rideList.checkCapacity()" + rideList.checkCapacity());
    }
}
