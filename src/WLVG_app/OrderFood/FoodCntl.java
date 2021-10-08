/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.OrderFood;

import WLVG_app.OrderFood.MenuList;

/**
 *
 * @author ellen
 */
public class FoodCntl {
    
     private final MenuList menus;
    
    /**
    * Creates UI and model
    */
    public FoodCntl() {
        menus = new MenuList();
    }
    
    /**
    * Retrieves list of menus
    * @return Existing list of menus
    */
    public MenuList getMenus() {
        return menus;
    }
    
    /**
    * Adds to list of menus
    */
    public void addMenu() {
        
    }
    
    /**
    * Removes menu from list
    */
    public void removeMenu() {
        
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
