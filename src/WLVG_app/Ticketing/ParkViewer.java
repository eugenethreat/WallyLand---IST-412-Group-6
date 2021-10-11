/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
LATER - Swing imports 
JFrame 
JPanel 
 */
package WLVG_app.Ticketing;

import java.util.ArrayList;

/**
 * Represents the Swing class that displays the parks for users to select, view and buy tickets from. 
 * @author eugene
 */
public class ParkViewer {
    
    private ArrayList<Park> listOfParks;
    
    /**
     *
     * @param p - the list of parks to display on the panel 
     */
    public ParkViewer(ArrayList<Park> p) {
        listOfParks = p;
    }
    
    /**
    * initial panel
    * button toggle between map/list view 
    * calls createParklistView 
    * calls createParkMapView 
    */
    public void spawnParkView(){
    }
    
    /**
    * Sets controller (for linking with other modules)
    */
    public void setController(){
        
    }
    
    /**
    * Sets controller (for linking with other modules)
    */
    public void createParklistView(){
//        creates panel containing the list of parks 
    }
    
    /**
    * Creates panel containing park map 
    */
    public void createParkMapView(){

    }
    
    /**
    * Shows panel containing park list 
    */
    public void showParks(){
    }
    
    /**
    * @info Shows panel containing park map 
    */
    public void showParkMap(){
    }
    
}
