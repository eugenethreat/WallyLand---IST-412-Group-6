/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Payments.old_payments;

/**
 *
 * Page to share the finalized sale information
 *
 * @author jackgallagher
 */
public class FinalizedSale {

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param itemPurchased
     * @param paymentAmount
     */
    public FinalizedSale(String firstName, String lastName, String paymentAmount, String itemPurchased) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymentAmount = paymentAmount;
        this.itemPurchased = itemPurchased;
    }

    public String firstName;

    /**
     *
     */
    public String lastName;

    /**
     *
     */
    public String paymentAmount;

    /**
     *
     */
    public String itemPurchased;
    
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.itemPurchased + " " + this.paymentAmount;
    }

}
