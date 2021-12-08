/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.testharness;

import WLVG_app.Payments.BillingInfo;
import WLVG_app.Payments.PaymentCntl;
import WLVG_app.Payments.old_payments.FinalizedSale;
import static WLVG_app.testharness.testharness.testBillingInfo;
import static WLVG_app.testharness.testharness.testFinalizedSale;
import static WLVG_app.testharness.testharness.testPaymentCntl;
import static WLVG_app.testharness.testharness.testPaymentList;

/**
 *
 * @author jackgallagher
 */
public class PaymentTestHarness {
    
    

    public static void main(String[] args) {
        System.out.println("testing the test harness");

       
        testBillingInfo();
        testFinalizedSale();
        testPaymentCntl();
        testPaymentList();

        System.out.println("testing...");
        
        
        //String firstName, String lastName, double cardNumber, int expirationDate, int securityCode, int billingZipCode
        BillingInfo b1 = new BillingInfo("first name", "last name", 90340946, 1021, 867, 19374);
        if (b1 != null) {
            System.out.println("Billing Info was successfully implemented");
            System.out.println(b1.toString());
        }

        b1.setFirstName("jack");
        b1.setLastName("gallagher");
        b1.setCardNumber(359845684);
        b1.setExpirationDate(1997);
        b1.setSecurityCode(867);
        b1.setBillingZipCode(19374);
        System.out.println("User has successfully input their billing info.");
        System.out.println(b1);

        b1.getFirstName();
        b1.getLastName();
        b1.getCardNumber();
        b1.getExpirationDate();
        b1.getSecurityCode();
        b1.getBillingZipCode();
        System.out.println("Received all information");
        System.out.println(b1);

        b1.toString();
        System.out.println(b1);

    }

    public static void testFinalizedSale() {
        FinalizedSale f1 = new FinalizedSale("First name", "last name", "56.56", "item purchased");

        if (f1 != null) {
            System.out.println("The sale was finalized");
            System.out.println(f1.toString());
        }
    }

    public static void testPaymentCntl() {
        PaymentCntl p1 = new PaymentCntl();

        p1.getPayments();

    }
}