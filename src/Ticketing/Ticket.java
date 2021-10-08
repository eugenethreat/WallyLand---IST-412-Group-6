/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketing;

import java.time.LocalDateTime;

/**
 * A class representing a ticket, belonging to a particular user and bound to a particular WLVG location.
 * @author eugene
 */
  
public class Ticket {
   
    private int id; 
    private int userId; 
    private int parkId; 
    private LocalDateTime validity;
    
    /**
     * Default constructor 
     */ 
    public Ticket(){
       id = 0;
       userId = 0;
       parkId = 0;
       validity = null;
   } 
    
    /**
     * @param id the ticket's own id 
     * @param userId id of the user the ticket is bound to
     * @param parkId park the ticket grants admission to
     * @param validity what days and times the ticket is
     */
        
    public Ticket(int id, int userId, int parkId, LocalDateTime validity){
        id = id;
        userId = userId;
        parkId = parkId;
        validity = validity; 
    }
    
    /**
     *  checks if the ticket is valid at the current date and time 
     * @return isValid, a boolean stating whether the ticket is currently valid or not. 
     */
    public boolean checkExpired(){
        boolean isValid = false; 
        return isValid;
    }
    
    /**
     * Checks who the ticket belongs to
     * @return the ID user bound to this particular ticket.
     */
    public int getUser(){
        return userId;
    }
    
    
}
