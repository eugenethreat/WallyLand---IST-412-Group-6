/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.OrderFood;


/**
 *
 * @author ellen
 */
public class Food {

    private String foodName;
    private String foodPrice;
    private String foodDescription;

    /**
     * Constructor for Food object
     *
     * @param foodName the name of the food item
     * @param foodPrice the price of the food item
     * @param foodDescription a description of the food item
     */
     
    public Food(String foodName, String foodPrice, String foodDescription) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodDescription = foodDescription;

    }
    
    public Food() {
        this.foodName = "";
        this.foodPrice = "";
        this.foodDescription = "";

    }

    /**
     * @return the foodName
     */
     
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
     
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the foodPrice
     */
    public String getFoodPrice() {
        return foodPrice;
    }

    /**
     * @param foodPrice the foodPrice to set
     */
    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

 /**
     * @return the foodDescription
     */
    public String getFoodDescription() {
        return foodDescription;
    }

/**
     * @param foodDescription the foodDescription to set
     */
    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}
