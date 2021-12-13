/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Payments.old_payments;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * UI for payment
 *
 * @author jackgallagher
 */
public class PaymentUI extends JPanel {

    /**
     * Initializes variables and sets controller
     */
    private JButton submitPaymentButton;

    private JTextField nameField;
    private JTextField lastNameField;
    private JTextField cardNumField;
    private JTextField expDateField;
    private JTextField securityCodeField;
    private JTextField zipCodeField;

    private ButtonGroup bg;

    public PaymentUI() {
        this.setBackground(Color.decode("#7C6354"));
        initComponents();

    }

    /**
     * Initializes frames and components used in the UI
     */
    public void initComponents() {
        //Name
        JLabel nameLabel = new JLabel("First Name: ");
        this.add(nameLabel);

        nameField = new JTextField("John");
        this.add(nameField);

        JLabel lastNameLabel = new JLabel("Last Name: ");
        this.add(lastNameLabel);

        lastNameField = new JTextField("Doe");
        this.add(lastNameField);

        //payment type buttons 
        bg = new ButtonGroup();

        JRadioButton ccRadioButton = new JRadioButton("Credit Card");
        JRadioButton savedRadioButton = new JRadioButton("Use saved payment information");

        JLabel paymentTypeLabel = new JLabel("Payment Type: ");
        getBg().add(ccRadioButton);
        getBg().add(savedRadioButton);

        submitPaymentButton = new JButton("Submit Payment");

        this.add(paymentTypeLabel);
        this.add(ccRadioButton);
        this.add(savedRadioButton);
        this.add(getSubmitPaymentButton());

        ccRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCreditCardFields();
            }
        });

    }

    public void addCreditCardFields() {

        JLabel cardNumLabel = new JLabel("Card Number: ");
        this.add(cardNumLabel);
        JTextField cardNumField = new JTextField("1234 1234 1234 1234");
        this.add(cardNumField);

        JLabel expDateLabel = new JLabel("Expiration Date");
        this.add(expDateLabel);
        JTextField expDateField = new JTextField("12/34");
        this.add(expDateField);

        JLabel securityCodeLabel = new JLabel("Security Code: ");
        this.add(securityCodeLabel);
        JTextField securityCodeField = new JTextField("123");
        this.add(securityCodeField);

        JLabel zipcodeLabel = new JLabel("ZIP Code: ");
        this.add(zipcodeLabel);
        JTextField zipCodeField = new JTextField("123456");
        this.add(zipCodeField);

        this.repaint();
        this.revalidate();

    }

    /**
     * @return the submitPaymentButton
     */
    public JButton getSubmitPaymentButton() {
        return submitPaymentButton;
    }

    /**
     * @return the nameField
     */
    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getlastNameField() {
        return lastNameField;
    }

    /**
     * @return the bg
     */
    public ButtonGroup getBg() {
        return bg;
    }

    /**
     * @return the cardNumField
     */
    public JTextField getCardNumField() {
        return cardNumField;
    }

    /**
     * @return the expDateField
     */
    public JTextField getExpDateField() {
        return expDateField;
    }

    /**
     * @return the securityCodeField
     */
    public JTextField getSecurityCodeField() {
        return securityCodeField;
    }

    /**
     * @return the zipCodeField
     */
    public JTextField getZipCodeField() {
        return zipCodeField;
    }

}
