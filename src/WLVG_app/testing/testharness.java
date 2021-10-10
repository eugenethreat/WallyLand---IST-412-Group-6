/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.testing;

/**
 * testharness
 * Tests API calls and such for M02-A03
 * @author eugene
 */
public class testharness {
    
    private static HotelCntl hotelController;
    private static Vacancy vacancy;
    private static VacancyList vacancyList;
    
    public static void main(String[] args){
        System.out.println("testing the test harness");
        
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
    
}
