/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Payments.old_payments;

import WLVG_app.Payments.BillingInfo;

/**
 * controller for the payment list
 *
 * @author jackgallagher
 */
public class PaymentCntl {

    private PaymentList payments = new PaymentList();
    private PaymentProcessor pp = new PaymentProcessor();

    /**
     * Creates UI and model
     */
    public PaymentCntl() {

    }

    /**
     * Retrieves list of payments
     *
     * @return Existing list of payments
     */
    public PaymentList getPayments() {
        return payments;
    }

    /**
     * Adds payment to list
     */
    public void addPayment() {

    }

    /**
     * Removes payments from the list
     */
    public void removePayment() {

    }

    public void addPayment(String text, BillingInfo info) {
        System.out.println("paymentcntl - " + text);

        //STRING MATCHING BAD!!!
        if (text.equals("Credit Card")) {
            //new card
//            System.out.println("credit card");
            pp.newCreditCardPayment();

            //adds the successful payment to the list 
            payments.getBillingInfo().add(info);

        } else {
            //saved information 
//            System.out.println("saved info");
            pp.newSavedInfoPayment();

            //adds the successful payment to the list 
            payments.getBillingInfo().add(info);
        }

    }

}
