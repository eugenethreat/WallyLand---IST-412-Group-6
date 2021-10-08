/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Payments;

/**
 * Page that includes all billing info 
 * @author jackgallagher
 */
public class BillingInfo 
{
    /**
     * @param firstName first name of the purchaser
     * @param lastName last name of the purchaser
     * @param cardNumber 16 digit credit card number
     * @param expirationDate; four digit date when the credit expires
     * @param securityCode; three digit code on the back of the credit card
     * @param billingZipCode; the billing zip code of where the purchaser lives
     */
    
    
        private String firstName;
        private String lastName;
        private double cardNumber;
        private int expirationDate;
        private int securityCode;
        private int billingZipCode;

   
   /**
    * 
    * Constructor for all billing inf
    */     
    public BillingInfo(String firstName, String lastName, double cardNumber, int expirationDate, int securityCode, int billingZipCode) 
        {
       
        }

    /**
     * Getter for the first name variables
     * @return the customer's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * Setter for the customer's first name 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }/**
     * Getter for the customer's last name
     * @return the customer's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the customers last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Getter for the customer's card number
     * @return the customer's card number
     */
    public double getCardNumber() {
        return cardNumber;
    }

    /**
     * Setter for the customer's credit card number
     */
    public void setCardNumber(double cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Getter for the credit card expiration date
     * @return the card expiration date
     */
    public int getExpirationDate() {
        return expirationDate;
    }
    /**
     * Setter for the expiration date
     */
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
    /**
     * Getter for the security code
     * @return the credit card security code
     */
    public int getSecurityCode() {
        return securityCode;
    }
    /**
     * Setter for the credit card security code
     */
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    /**
     * Getter for the customer's zip code
     * @return the customer's zip code
     */
    public int getBillingZipCode() {
        return billingZipCode;
    }

    /**
     * Setter for the customer's zip code
     */
    public void setBillingZipCode(int billingZipCode) {
        this.billingZipCode = billingZipCode;
    }
        
        
        
    }
    
    
    
    
    
    
    
    
    

