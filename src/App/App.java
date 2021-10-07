/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App;

import java.util.ArrayList;

/**
 *
 * @author eugene
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Classes:
            Ticket - a ticket object 
            ParkSelector - view that lets users 
            Park - Information about a specific park 
            select list of parks 
            TicketPayment - sends payments to payment processor 
        */
        
        Park samplePark = new Park();
        ArrayList<Park> parkList = new ArrayList();
        parkList.add(samplePark);

        ParkViewer park1 = new ParkViewer(parkList);

        System.out.println("Test Completed");
    }

}
