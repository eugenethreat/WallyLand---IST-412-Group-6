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
public class MenuList implements FoodInfo {
    
     private ArrayList<Menu> menus = new ArrayList();

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
    
    /**
    * Prints boilerplate text for MenuList
    */
//    @Override
   public void boilerplate() {
      System.out.println("Each of the locations listed features a different delicious cuisine from around the world. Bon apetit!");
   }
    
}
