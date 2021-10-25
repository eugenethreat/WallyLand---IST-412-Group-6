/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app;

import WLVG_app.Payments.PaymentCntl;
import WLVG_app.Payments.PaymentUI;
import WLVG_app.Views.Baseframe;
import WLVG_app.Views.PasswordStrengthPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author eugene
 */
public class Controller {

    Baseframe bp;
    Model m;

    PaymentUI pui = new PaymentUI();
    PasswordStrengthPanel ps = new PasswordStrengthPanel();

    PaymentCntl pc = new PaymentCntl();

    public Controller(Baseframe bp, Model m) {
        this.bp = bp;
        this.m = m;

        this.navButtonsListeners();

        //FOR M03 AO3 - SWITCH TO PASSWORD IMMEDIATELY 
//        this.switchToPasswordStrengthPanel();
//        this.switchToPaymentView();
    }

    public void newPayment() {

    }

    public void switchViews(JPanel newView) {
        bp.switchViews(newView);
    }

    //TODO: why does this just not work sometimes? 
    //loading components? 
    public void navButtonsListeners() {
        bp.getNavButtonLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ps = new PasswordStrengthPanel();

                bp.switchViews(ps);

            }
        });
        bp.getNavButtonCenter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bp.switchViews(newView);
                //TODO - home button 
            }
        });
        bp.getNavButtonRight().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PaymentUI pui = new PaymentUI();

                bp.switchViews(pui);

                JButton submitPaymentButton = pui.getSubmitPaymentButton();
                submitPaymentButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //submit a new payment based on the type

                        //get the payment type
                        ButtonGroup paymentTypePicker = pui.getBg();
                        boolean whichButton = paymentTypePicker.getSelection().isSelected();

                    }
                });

            }
        });

    }

}
