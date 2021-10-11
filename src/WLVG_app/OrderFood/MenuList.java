/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.OrderFood;

import java.util.ArrayList;

/**
 *
 * @author ellen
 */
public class MenuList {
    
     private ArrayList<Menu> menus;

    /**
    * Constructor for the list of menus
    */
    public MenuList() {

    }
    
    /**
    * Adds menus to list
    */
    private void initializeMenus() {
        this.menus.add(new Menu());
        
    }
    
    /**
    * @return List of Menus
    */
    public ArrayList<Menu> getMenu() {
        
        return menus;
    }
}
