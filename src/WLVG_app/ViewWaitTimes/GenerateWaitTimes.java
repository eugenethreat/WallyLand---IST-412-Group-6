/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

import java.sql.Time;
import java.util.Random;

/**
 *
 * @author tomia
 */
public class GenerateWaitTimes {
    
    public GenerateWaitTimes() {

    }

    public Time generateRandomTime() {
        Random r = new Random();
        Time time = new Time(r.nextLong());
        return time;

    }

    /*
    @Deprecated - these features were removed since they were not used; 
    the only part of this class being used is the getRandomTime() function. 
    
    */
    //converting time to int
//    public void convertToInt() {
//        Random r = new Random();
//        int listOfRides = 10; //replace this with value for number of rides, I don't think I have that yet
//        for (int i = 0; i < listOfRides; i++) {
//            Time time = new Time(r.nextLong());
//            String strTime = time.toString();
//            int waitTimes = Integer.parseInt(strTime);
//            System.out.println(waitTimes);
//        }
//
//    }
    /**
     * @return the waitTime
     */
//    public int getWaitTime() {
//        return waitTime;
//    }
    /**
     * @param waitTime the waitTime to set
     */
//    public void setWaitTime(int waitTime) {
//        this.waitTime = waitTime;
//    }
}
