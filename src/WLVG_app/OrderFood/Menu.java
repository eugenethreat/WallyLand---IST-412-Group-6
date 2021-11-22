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
public class Menu implements EateryBoilerplate {

    private String location;
    private String hours;
    private String food1;
    private Integer price1;
    private String food2;
    private Integer price2;
    private String food3;
    private Integer price3;
    private String food4;
    private Integer price4;
    private String food5;
    private Integer price5;

    /**
     * Constructor for Menu object
     *
     * @param location Address within the theme park of the food location
     * @param hours Hours that the location is open
     * @param food1 Name representing a 1st food on the menu
     * @param price1 Number representing a 1st price on the menu
     * @param food2 Name representing a 2nd food on the menu
     * @param price2 Number representing a 2nd price on the menu
     * @param food3 Name representing a 3rd food on the menu
     * @param price3 Number representing a 3rd price on the menu
     * @param food4 Name representing a 4th food on the menu
     * @param price4 Number representing a 4th price on the menu
     * @param food5 Name representing a 5th food on the menu
     * @param price5 Number representing a 5th price on the menu
     */
    public Menu(String location, String hours, String food1, Integer price1, String food2, Integer price2, String food3, Integer price3, String food4, Integer price4, String food5, Integer price5) {
        this.location = location;
        this.hours = hours;
        this.food1 = food1;
        this.price1 = price1;
        this.food2 = food2;
        this.price2 = price2;
        this.food3 = food3;
        this.price3 = price3;
        this.food4 = food4;
        this.price4 = price4;
        this.food5 = food5;
        this.price5 = price5;

    }

    public Menu() {
        this.location = "";
        this.hours = "";
        this.food1 = "";
        this.food2 = "";
        this.food3 = "";
        this.food4 = "";
        this.food5 = "";
        this.price1 = 0;
        this.price2 = 0;
        this.price3 = 0;
        this.price4 = 0;
        this.price5 = 0;

    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @return the food1
     */
    public String getFood1() {
        return food1;
    }

    /**
     * @param food1 the food1 to set
     */
    public void setFood1(String food1) {
        this.food1 = food1;
    }

    /**
     * @return the price1
     */
    public Integer getPrice1() {
        return price1;
    }

    /**
     * @param price1 the price1 to set
     */
    public void setPrice1(Integer price1) {
        this.price1 = price1;
    }

    /**
     * @return the food2
     */
    public String getFood2() {
        return food2;
    }

    /**
     * @param food2 the food2 to set
     */
    public void setFood2(String food2) {
        this.food2 = food2;
    }

    /**
     * @return the price2
     */
    public Integer getPrice2() {
        return price2;
    }

    /**
     * @param price2 the price2 to set
     */
    public void setPrice2(Integer price2) {
        this.price2 = price2;
    }

    /**
     * @return the food3
     */
    public String getFood3() {
        return food3;
    }

    /**
     * @param food3 the food3 to set
     */
    public void setFood3(String food3) {
        this.food3 = food3;
    }

    /**
     * @return the price3
     */
    public Integer getPrice3() {
        return price3;
    }

    /**
     * @param price3 the price3 to set
     */
    public void setPrice3(Integer price3) {
        this.price3 = price3;
    }

    /**
     * @return the food4
     */
    public String getFood4() {
        return food4;
    }

    /**
     * @param food4 the food4 to set
     */
    public void setFood4(String food4) {
        this.food4 = food4;
    }

    /**
     * @return the price4
     */
    public Integer getPrice4() {
        return price4;
    }

    /**
     * @param price4 the price4 to set
     */
    public void setPrice4(Integer price4) {
        this.price4 = price4;
    }

    /**
     * @return the food5
     */
    public String getFood5() {
        return food5;
    }

    /**
     * @param food5 the food5 to set
     */
    public void setFood5(String food5) {
        this.food5 = food5;
    }

    /**
     * @return the price5
     */
    public Integer getPrice5() {
        return price5;
    }

    /**
     * @param price5 the price5 to set
     */
    public void setPrice5(Integer price5) {
        this.price5 = price5;
    }
    
    /**
    * Prints boilerplate text for Menu
    */
//    @Override
   public void boilerplate() {
      System.out.println("Great choice! This looks delicious. When finished adding food items, proceed to checkout with your payment details.");
   }

}
