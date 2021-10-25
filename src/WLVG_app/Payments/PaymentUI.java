/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Payments;

import java.awt.Color;
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
        JLabel nameLabel = new JLabel("Name: ");
        this.add(nameLabel);

        JTextField nameField = new JTextField("John Doe");
        this.add(nameField);

        //payment type buttons 
        bg = new ButtonGroup();

        JRadioButton first = new JRadioButton();
        JRadioButton second = new JRadioButton();

        JLabel paymentTypeLabel = new JLabel("Payment Type: ");
        JLabel cc = new JLabel("Credit Card: ");
        JLabel saved = new JLabel("Use saved payment information:");
        getBg().add(first);
        getBg().add(second);

        submitPaymentButton = new JButton("Submit Payment");

        this.add(paymentTypeLabel);
        this.add(cc);
        this.add(first);
        this.add(saved);
        this.add(second);
        this.add(getSubmitPaymentButton());

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

    /**
     * @return the bg
     */
    public ButtonGroup getBg() {
        return bg;
    }

}
