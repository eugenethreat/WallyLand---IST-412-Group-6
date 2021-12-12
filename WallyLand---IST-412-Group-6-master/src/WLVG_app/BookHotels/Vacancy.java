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
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String roomType;
    private String bed;
    private String layout;
    private String amenities;
    
    /**
    * Constructor for Vacancy object
     * @param hotelName Name of hotel where vacancy exists
     * @param dateStart Date when vacancy begins
     * @param dateEnd Date when vacancy ends
     * @param roomType i.e. Single, Double, Triple, etc...
     * @param bed i.e. Twin, Double-double, etc...
     * @param layout i.e. Standard, deluxe, etc...
     * @param amenities i.e. Cabana, Villa, etc...
    */

    public Vacancy(String hotelName, LocalDate dateStart, LocalDate dateEnd, String roomType, String bed, String layout, String amenities) {
        this.hotelName = hotelName;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.roomType = roomType;
        this.bed = bed;
        this.layout = layout;
        this.amenities = amenities;
    }

    Vacancy() {
        this.hotelName = "";
        this.roomType = "";
        this.bed = "";
        this.layout = "";
        this.amenities = "";
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
     * @return the dateStart
     */
    public LocalDate getDateStart() {
        return dateStart;
    }

    /**
     * @param dateStart the dateStart to set
     */
    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * @return the dateEnd
     */
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd the dateEnd to set
     */
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
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

    /**
     * @return the amenities
     */
    public String getAmenities() {
        return amenities;
    }

    /**
     * @param amenities the amenities to set
     */
    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    
    
    
}
