/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Ticketing;

import java.util.Date;

/**
 * A class representing a ticket, belonging to a particular user and bound to a particular WLVG location.
 * @author eugene
 */
  
public class Ticket {
   
    private int id; 
    private int userId; 
    private int parkId; 
    private Date ticketValidDuring;
    
    /**
     * Default constructor 
     */ 
    public Ticket(){
       id = 0;
       userId = 0;
       parkId = 0;
       ticketValidDuring = null;
   } 
    
    /**
     * @param paramId the ticket's own id 
     * @param paramUser id of the user the ticket is bound to
     * @param paramParkId park the ticket grants admission to
     * @param paramValidity what days and times the ticket is
     */
        
    public Ticket(int paramId, int paramUser, int paramParkId, Date paramValidity){
        id = paramId;
        userId = paramUser;
        parkId = paramParkId;
        ticketValidDuring = paramValidity; 
    }
    
    
    /**
     * Checks who the ticket belongs to
     * @return the ID user bound to this particular ticket.
     */
    public int getUser(){
        return userId;
    }

    /**
     * check what times the ticket is valid for 
     * @return the ticketValidDuring
     */
    public Date getTicketValidDuring() {
        return ticketValidDuring;
    }
    
    
    
    
}
