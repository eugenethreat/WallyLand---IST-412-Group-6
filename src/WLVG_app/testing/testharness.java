
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
    private static HotelCntl hotelController;
    private static Vacancy vacancy;
    private static VacancyList vacancyList;
    
    public static void main(String[] args){
        System.out.println("testing the test harness");
        
        // ************************************
        // *****   package OrderFood  ******
        // ************************************
        
        // test stubs for FoodCntl
        boolean boolFoodStatus = false;
        if(foodController.getMenus() == menuList)
        {
            boolFoodStatus = true;
        }
        System.out.println("FoodCntl.getMenus() Success: " + boolFoodStatus);
        
        boolFoodStatus = false;
        foodController.addMenu();
        if(!(foodController.getMenus().getMenus().isEmpty())) {
            boolFoodStatus = true;
        }
        
        System.out.println("FoodCntl.addMenu() Success: " + boolFoodStatus);
    
        
        
        // test stubs for Menu
        System.out.println("MenuList.getLocation() Output: " + menu.getLocation());
        System.out.println("MenuList.getHours() Output: " + menu.getHours());
        System.out.println("MenuList.getFood1() Output: " + menu.getFood1());
        System.out.println("MenuList.getPrice1() Output: " + menu.getPrice1());
        System.out.println("MenuList.getFood2() Output: " + menu.getFood2());
        System.out.println("MenuList.getPrice2() Output: " + menu.getPrice2());
        System.out.println("MenuList.getFood3() Output: " + menu.getFood3());
        System.out.println("MenuList.getPrice3() Output: " + menu.getPrice3());
        System.out.println("MenuList.getFood4() Output: " + menu.getFood4());
        System.out.println("MenuList.getPrice4() Output: " + menu.getPrice4());
        System.out.println("MenuList.getFood5() Output: " + menu.getFood5());
        System.out.println("MenuList.getPrice5() Output: " + menu.getPrice5());
    
        
        
        // test stubs for MenuList
        System.out.println("MenuList.getMenuList() Output: " + menuList.getMenus());
}
        
        // ************************************
        // *****   package BookHotel  ******
        // ************************************
        
        // test stubs for HotelCntl
        boolean boolHotelStatus = false;
        if(hotelController.getVacancyList() == vacancyList)
        {
            boolHotelStatus = true;
        }
        System.out.println("HotelCntl.getVacancyList() Success: " + boolHotelStatus);
        
        boolHotelStatus = false;
        hotelController.addVacancy(vacancy);
        if(!(hotelController.getVacancyList().getVacancies().isEmpty())) {
            boolHotelStatus = true;
        }
        System.out.println("HotelCntl.addVacancy() Success: " + boolHotelStatus);
         
        // test stubs for VacancyList
        System.out.println("VacancyList.getVacancyList() Output: " + vacancyList.getVacancies());
        
        // test stubs for Vacancy
        System.out.println("VacancyList.getHotelName() Output: " + vacancy.getHotelName());
        System.out.println("VacancyList.getRoomType() Output: " + vacancy.getRoomType());
        System.out.println("VacancyList.getBed() Output: " + vacancy.getBed());
        System.out.println("VacancyList.getLayout() Output: " + vacancy.getLayout());
        System.out.println("VacancyList.getAmenities() Output: " + vacancy.getAmenities());
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
