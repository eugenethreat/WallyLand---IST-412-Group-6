/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WLVG_app.BookHotels;


/**
 * Controller for the "Hotel Booking" use case
 * @author graeme
 */
public class HotelCntl {
    
    private final VacancyList vacancies;
    
    /**
    * Creates UI and model
    */
    public HotelCntl() {
        vacancies = new VacancyList();
    }
    
    /**
    * Retrieves list of vacancies
    * @return Existing list of vacancies
    */
    public VacancyList getVacancyList() {
        return vacancies;
    }
    
    /**
    * Adds to list of vacancies
     * @param v
    */
    public void addVacancy(Vacancy v) {
        
    }   
    
    /**
    * Opens Input UI
    */
    public void switchToInput() {
        
    }
    
    /**
    * Opens Selection UI
    */
    public void switchToSelection() {
        
    }
    
    /**
    * Opens Reservation UI
    */
    public void switchToReservation() {
        
    }
}
