/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.testharness;

import WLVG_app.BookHotels.HotelCntl;
import WLVG_app.BookHotels.Vacancy;
import WLVG_app.BookHotels.VacancyList;
import java.time.LocalDate;

/**
 *
 * @author jackgallagher
 */
public class HotelTestHarness {
     
    private static HotelCntl hotelController;
    private static Vacancy vacancy;
    private static VacancyList vacancyList;
    
    
     public static void main(String[] args) {
        System.out.println("testing the test harness");
    
        // ************************************
        // *****   package BookHotel  ******
        // ************************************
        // test stubs for HotelCntl
        hotelController = new HotelCntl();
        vacancyList = new VacancyList();

        boolean boolHotelStatus = false;
        if (hotelController.getVacancyList() == vacancyList) {
            boolHotelStatus = true;
        }

        System.out.println("HotelCntl.getVacancyList() Success: " + boolHotelStatus);

        boolHotelStatus = false;
        hotelController.addVacancy(vacancy);
        vacancy = new Vacancy("Sample Hotel", LocalDate.now(), LocalDate.MAX, "Suite", "King", "Big Suite", "minibar, roomservice. ");

        if (!(hotelController.getVacancyList()
                .getVacancies().isEmpty())) {
            boolHotelStatus = true;
        }

        System.out.println("HotelCntl.addVacancy() Success: " + boolHotelStatus);

        // test stubs for VacancyList
        System.out.println(
                "VacancyList.getVacancyList() Output: " + vacancyList.getVacancies());

        // test stubs for Vacancy
        System.out.println(
                "VacancyList.getHotelName() Output: " + vacancy.getHotelName());
        System.out.println(
                "VacancyList.getRoomType() Output: " + vacancy.getRoomType());
        System.out.println(
                "VacancyList.getBed() Output: " + vacancy.getBed());
        System.out.println(
                "VacancyList.getLayout() Output: " + vacancy.getLayout());
        System.out.println(
                "VacancyList.getAmenities() Output: " + vacancy.getAmenities());

    
}}
