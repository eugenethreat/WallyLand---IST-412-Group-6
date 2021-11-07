/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Payments;

import java.util.ArrayList;

/**
 * Page to create the payment array list
 * @author jackgallagher
 */
public class PaymentList 
{
    
    private ArrayList<BillingInfo> payments = new ArrayList();
    
    
    /**
     * Constructor for the list of payments
     */
    public PaymentList() 
    {
        
    }
    
    /**
     * Adds the payments to the list
     */
    private void initializePayments()
    {
     
    }
    
    
    /**
     * @return List of Payments
     */
    public ArrayList<BillingInfo> getBillingInfo() 
    {
        return payments;
    }
    
    
}
