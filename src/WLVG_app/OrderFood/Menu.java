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
public class Menu implements EateryBoilerplate {

    private ArrayList<Food> foods = new ArrayList();

    /**
     * Constructor for the list of foods
     */
    public Menu() {

    }

    /**
     * Adds foods to list
     */
    private void initializeFoods() {
        this.getFoods().add(new Food());

    }

    /**
     * @return List of Foods
     */
    public ArrayList<Food> getFood() {

        return getFoods();
    }

    /**
     * Prints boilerplate text for Menu
     */
//    @Override
    public void boilerplate() {
        System.out.println("Great choice! This looks delicious. When finished adding food items, proceed to checkout with your payment details.");
    }

    /*
        @Deprecated - these methods are depreciated, but are still used in the testharness class.
        Will be refactored in a future release. 
    */
    public String getLocation() {
        return "sample location";
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the hours
     */
    public void getHours() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the food1
     */
    public void getFood1() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param food1 the food1 to set
     */
    public void setFood1(String food1) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the price1
     */
    public void getPrice1() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param price1 the price1 to set
     */
    public void setPrice1(Integer price1) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the food2
     */
    public void getFood2() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param food2 the food2 to set
     */
    public void setFood2(String food2) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the price2
     */
    public void getPrice2() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param price2 the price2 to set
     */
    public void setPrice2(Integer price2) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the food3
     */
    public void getFood3() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param food3 the food3 to set
     */
    public void setFood3(String food3) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the price3
     */
    public void getPrice3() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param price3 the price3 to set
     */
    public void setPrice3(Integer price3) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the food4
     */
    public void getFood4() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param food4 the food4 to set
     */
    public void setFood4(String food4) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the price4
     */
    public void getPrice4() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param price4 the price4 to set
     */
    public void setPrice4(Integer price4) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the food5
     */
    public void getFood5() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param food5 the food5 to set
     */
    public void setFood5(String food5) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the price5
     */
    public void getPrice5() {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @param price5 the price5 to set
     */
    public void setPrice5(Integer price5) {
        System.out.println("This functionality has been removed.");
    }

    /**
     * @return the foods
     */
    public ArrayList<Food> getFoods() {
        return foods;
    }

    /**
     * @param foods the foods to set
     */
    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

}
