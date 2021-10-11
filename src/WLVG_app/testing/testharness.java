/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.testing;

import WLVG_app.Ticketing.Park;
import WLVG_app.Ticketing.ParkViewer;
import WLVG_app.Ticketing.Ticket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

/**
 * testharness Tests API calls and such for M02-A03
 *
 * @author eugene
 */
public class testharness {

    public static void main(String[] args) {
        System.out.println("testing the test harness");
        System.out.println("-------------------------------------------");

        boolean eugTests = eugeneTests();
        System.out.println("eugTests: " + eugTests);
    
    }   

    /**
     * Eugene Tests Ticketing module
     *
     * @return testPassed - whether all the tests are passed
     * @author eugene
     */
    public static boolean eugeneTests() {
        boolean getUserTest1 = false;
        boolean checkExpiredTest1 = false;
        boolean testsPassed = false;

        ArrayList<String> parkInfo1 = new ArrayList();
        parkInfo1.add("some dummy info");
        parkInfo1.add("some more dummy info");

        LocalTime openingTime = LocalTime.of(11, 0);
        LocalTime closingTime = LocalTime.of(20, 0);
        Park p1 = new Park("WallyLand Seoul", 1, "123 Some Street in Korea, Seoul, South Korea", parkInfo1, openingTime, closingTime);
        Park p2 = new Park("WallyLand Los Angeles", 1, "123 Hollywood BLVD, Californa, The United States of America", parkInfo1, openingTime, closingTime);
        ArrayList<Park> listOfParks = new ArrayList();
        listOfParks.add(p1);
        listOfParks.add(p2);
        
        Date timeThatWillPass = new Date(2021, 9,11);
        Date timeThatWillFail = new Date(2021, 9, 9);
                
        Ticket demo = new Ticket(1, 1, 5, timeThatWillFail);
        Ticket demoPass = new Ticket(1,1,5, timeThatWillPass);

        
        ParkViewer pv = new ParkViewer(listOfParks);

        
        //Park         
        if(p1.checkExpired(demo) == false && p1.checkExpired(demoPass) == true){
            checkExpiredTest1 = true;
        }
        
        //Other random stubs         
        System.out.println("Parkname: " + p1.getParkName());
        System.out.println("ParkId : "+ p1.getParkId() );
        System.out.println("ParkAddress: " + p1.getParkAddress());
        System.out.println("ParkInfo: " + p1.getParkInfo());
        System.out.println("openingTime: " + p1.getOpeningTime());
        System.out.println("closingTime: " + p1.getClosingTime());

      
        //ParkViewer 
        //test stubs for ParkViewer 
        pv.spawnParkView();
        pv.setController();
        pv.createParklistView();
        pv.createParkMapView();
        pv.showParks();
        pv.showParkMap();
        
        
        //Ticket 
        //getUser() test 
        if (Integer.compare(demo.getUser(), 1) == 0) {
            System.out.println("getUser() test passed");
            getUserTest1 = true; 
        } else {
            System.out.println("test failed");
        }

        //getTicketValidDuring() test
        System.out.println("ticket valid during... "+ demo.getTicketValidDuring());
        
        //check if all tests were passed and return a val 
        if(getUserTest1 && checkExpiredTest1  ){
            testsPassed = true;
        }
        
        return testsPassed;

    }

}
