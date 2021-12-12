/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WLVG_app.BookHotels;

import java.time.LocalDate;

/**
 * Model of the hotel vacancies
 * @author graeme
 */
public class Vacancy {

    private String hotelName;
    private String roomType;
    private String bed;
    private String layout;
    
    /**
    * Constructor for Vacancy object
     * @param hotelName Name of hotel where vacancy exists
     * @param roomType i.e. Single, Double, Triple, etc...
     * @param bed i.e. Twin, Double-double, etc...
     * @param layout i.e. Standard, deluxe, etc...
    */

    public Vacancy(String hotelName, String roomType, String bed, String layout) {
        this.hotelName = hotelName;
        this.roomType = roomType;
        this.bed = bed;
        this.layout = layout;
    }

    Vacancy() {
        this.hotelName = "";
        this.roomType = "";
        this.bed = "";
        this.layout = "";
    }

    /**
     * @return the hotelName
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * @param hotelName the hotelName to set
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the bed
     */
    public String getBed() {
        return bed;
    }

    /**
     * @param bed the bed to set
     */
    public void setBed(String bed) {
        this.bed = bed;
    }

    /**
     * @return the layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * @param layout the layout to set
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }


    
    
    
}
