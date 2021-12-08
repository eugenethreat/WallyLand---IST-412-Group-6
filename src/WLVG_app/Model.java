/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app;

import WLVG_app.Payments.PaymentList;
import WLVG_app.ViewWaitTimes.RideDetails;
import WLVG_app.ViewWaitTimes.GenerateWaitTimes;
import WLVG_app.ViewWaitTimes.Map;
import WLVG_app.Payments.UserList;
import WLVG_app.OrderFood.MenuList;
import WLVG_app.Ticketing.Park;
import WLVG_app.Ticketing.Ticket;
import java.util.ArrayList;
        
/**
 *
 * @author eugene
 */
public class Model 
{
    
    private Map map;
    private ArrayList<RideDetails> rideDetails;
    private UserList userList;
    private PaymentList paymentList;
    private GenerateWaitTimes waitTimes;
    private Park park;
    private MenuList menuList;
    private Ticket ticket;
    private String location;
    
   
    public Model()
    {
         map = new Map(location, rideDetails);
         paymentList = new PaymentList();
         waitTimes = new GenerateWaitTimes();
         park = new Park();
         menuList = new MenuList();
         ticket = new Ticket();
    }

    /**
     * @return the map
     */
    public Map getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(Map map) {
        this.map = map;
    }

    /**
     * @return the userList
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    /**
     * @return the paymentList
     */
    public PaymentList getPaymentList() {
        return paymentList;
    }

    /**
     * @param paymentList the paymentList to set
     */
    public void setPaymentList(PaymentList paymentList) {
        this.paymentList = paymentList;
    }

    /**
     * @return the waitTimes
     */
    public GenerateWaitTimes getWaitTimes() {
        return waitTimes;
    }

    /**
     * @param waitTimes the waitTimes to set
     */
    public void setWaitTimes(GenerateWaitTimes waitTimes) {
        this.waitTimes = waitTimes;
    }

    /**
     * @return the park
     */
    public Park getPark() {
        return park;
    }

    /**
     * @param park the park to set
     */
    public void setPark(Park park) {
        this.park = park;
    }

    /**
     * @return the menuList
     */
    public MenuList getMenuList() {
        return menuList;
    }

    /**
     * @param menuList the menuList to set
     */
    public void setMenuList(MenuList menuList) {
        this.menuList = menuList;
    }

    /**
     * @return the ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
      
}
