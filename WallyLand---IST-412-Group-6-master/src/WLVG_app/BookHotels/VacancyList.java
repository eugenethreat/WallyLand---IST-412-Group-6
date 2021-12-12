/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WLVG_app.BookHotels;

import java.util.ArrayList;

/**
 * List of the available vacancies
 * @author graeme
 */
public class VacancyList {
    
    private ArrayList<Vacancy> vacancies;

    /**
    * Constructor for the list of vacancies
    */
    public VacancyList() {
        vacancies = new ArrayList();
    }
    
    /**
    * Adds vacancies to list
    */
    private void initializeVacancies() {
        this.vacancies.add(new Vacancy());
    }
    
    /**
    * @return List of Vacancies
    */
    public ArrayList<Vacancy> getVacancies() {
        
        return vacancies;
        
    }
}
