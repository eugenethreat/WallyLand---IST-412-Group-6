/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookHotels;

import App.VacancyList;

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
    public VacancyList getVacancies() {
        return vacancies;
    }
    
    /**
    * Adds to list of vacancies
    */
    public void addVacancy() {
        
    }
    
    /**
    * Removes vacancy from list
    */
    public void removeVacancy() {
        
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
