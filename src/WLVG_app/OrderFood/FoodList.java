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
public class FoodList {
    
     private ArrayList<Food> foods = new ArrayList();

    /**
    * Constructor for the list of foods
    */
    public FoodList() {

    }
    
    /**
    * Adds foods to list
    */
    private void initializeFoods() {
        this.foods.add(new Food());
        
    }
    
    /**
    * @return List of Foods
    */
    public ArrayList<Food> getFood() {
        
        return foods;
    }
    
}
