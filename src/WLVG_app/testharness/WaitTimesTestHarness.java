/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.testharness;

import WLVG_app.ViewWaitTimes.Map;
import WLVG_app.ViewWaitTimes.MapController;
import WLVG_app.ViewWaitTimes.MapUI;
import WLVG_app.ViewWaitTimes.RideDetails;
import static WLVG_app.testharness.testharness.eugeneTests;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author jackgallagher
 */
public class WaitTimesTestHarness {
    static private RideDetails rideList;
    static private MapUI mapUI;
    static private MapController mapCntl;
    static private Map map;
    static private ArrayList<RideDetails> listOfRides;
    
    public static void main(String[] args) {
        System.out.println("testing the test harness");
        
        Time t = null;

        rideList = new RideDetails("Wally Coaster", t, "8 AM - 6 PM", 30);
        mapUI = new MapUI();
        mapCntl = new MapController(rideList);
        map = new Map("West section", listOfRides);

        System.out.println("Testing the test harness");

        boolean boolCapacity = false;

        if (rideList.checkCapacity()) {
            boolCapacity = true;
        }

        System.out.println("rideList.checkCapacity() " + rideList.checkCapacity());

        // ************************************
        // *****   package Ticketing  ******
        // ************************************
        // test stubs for Ticketing
        eugeneTests();

        System.out.println("ALL TESTS DONE....");

}
}