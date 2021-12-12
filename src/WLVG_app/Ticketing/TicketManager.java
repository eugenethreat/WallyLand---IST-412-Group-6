/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Ticketing;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eugene
 */
public class TicketManager {

    /*
    Needs to:
        Have a list of locations 
        Have a list of dates 
        Create tickets and store them based on userid 
     */
    private ArrayList<Park> listOfParks = new ArrayList();
    private ArrayList<Date> possibleDates = new ArrayList();

    public TicketManager() {
        //The next seven days 
        //default parks 
        GenerateDefaultParks();
        GenerateDefaultDates();

    }

    public TicketManager(ArrayList<Park> parks, ArrayList<Date> dates) {
        this.listOfParks = parks;
        this.possibleDates = dates;
    }

    //Generate the 6 defeault parks: 
    private void GenerateDefaultParks() {
        ArrayList<String> defaultParkInfo = new ArrayList();
        defaultParkInfo.add("nothing...");
        LocalTime openTime = LocalTime.of(1, 1);
        LocalTime closingTime = LocalTime.of(1, 1);

        Park park1 = new Park("WallyLand LA", 1, "123 Wallyland Lane, LA, USA", defaultParkInfo, openTime, closingTime);
        Park park2 = new Park("WallyLand Jacksonville", 1, "123 Wallyland Lane, LA, USA", defaultParkInfo, openTime, closingTime);
        Park park3 = new Park("WallyLand Paris", 1, "123 Wallyland Lane, LA, USA", defaultParkInfo, openTime, closingTime);
        Park park4 = new Park("WallyLand Tokyo", 1, "123 Wallyland Lane, LA, USA", defaultParkInfo, openTime, closingTime);
        Park park5 = new Park("WallyLand Barcelona", 1, "123 Wallyland Lane, LA, USA", defaultParkInfo, openTime, closingTime);
        Park park6 = new Park("WallyLand Shanghai", 1, "123 Wallyland Lane, LA, USA", defaultParkInfo, openTime, closingTime);

        this.listOfParks.add(park1);
        this.listOfParks.add(park2);
        this.listOfParks.add(park3);
        this.listOfParks.add(park4);
        this.listOfParks.add(park5);
        this.listOfParks.add(park6);

    }

    //Generate the default dates - the next week
    private void GenerateDefaultDates() {
        Date date1 = new Date(1, 1, 1);
        Date date2 = new Date(1, 1, 2);
        Date date3 = new Date(1, 1, 3);
        Date date4 = new Date(1, 1, 4);
        Date date5 = new Date(1, 1, 5);
        Date date6 = new Date(1, 1, 6);

        this.possibleDates.add(date1);
        this.possibleDates.add(date2);
        this.possibleDates.add(date3);
        this.possibleDates.add(date4);
        this.possibleDates.add(date5);
        this.possibleDates.add(date6);

    }

    /**
     * @return the listOfParks
     */
    public ArrayList<Park> getListOfParks() {
        return listOfParks;
    }

    /**
     * @param listOfParks the listOfParks to set
     */
    public void setListOfParks(ArrayList<Park> listOfParks) {
        this.listOfParks = listOfParks;
    }

    /**
     * @return the possibleDates
     */
    public ArrayList<Date> getPossibleDates() {
        return possibleDates;
    }

    /**
     * @param possibleDates the possibleDates to set
     */
    public void setPossibleDates(ArrayList<Date> possibleDates) {
        this.possibleDates = possibleDates;
    }

}