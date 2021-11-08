/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app;

import WLVG_app.Login.LoginPanel;
import WLVG_app.Login.NavigationPanel;
import WLVG_app.Payments.BillingInfo;
import WLVG_app.Payments.PaymentCntl;
import WLVG_app.Payments.PaymentUI;
import WLVG_app.ViewWaitTimes.MapUI;
import WLVG_app.Views.Baseframe;
import WLVG_app.Views.PasswordStrengthPanel;
import WLVG_app.Views.TestPanel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

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
    LoginPanel lp = new LoginPanel(this);
    NavigationPanel np = new NavigationPanel(this);
    //testpanel - the container panel with mapUI
    MapUI mp = new MapUI();
    TestPanel tp = new TestPanel();

    public Controller(Baseframe bp, Model m) {
//        this.bp = bp;
        this.bp = bp;
        this.m = m;

        this.navButtonsListeners();

        //FOR MO3-AO3 / BECAUSE SWING 
        //payment ui 
        this.listenerThing();

        //ADDING THE VIEWS TO CARDVIEW
        //payment UI 
        this.bp.getCardPanel().add(pui, "payment");
        //password strength checker
        this.bp.getCardPanel().add(ps, "pwstrength");
        //mapUI
        this.bp.getCardPanel().add(tp, "wait_times");
        //login
        this.bp.getCardPanel().add(lp, "login");
        //navigation/home
        this.bp.getCardPanel().add(np, "navigation");

        //SHOWS LOGIN WHEN FIRST LOADING
        JPanel cards = bp.getCardPanel();
        bp.getCardLayout().show(cards, "login");
    }

    public void newPayment() {

    }

    //think about this better later
    public void listenerThing() {
        JButton submitPaymentButton = pui.getSubmitPaymentButton();
        submitPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //submit a new payment based on the type

                //get the payment type
                ButtonGroup paymentTypePicker = pui.getBg();

                Enumeration<AbstractButton> buttonList = paymentTypePicker.getElements();

                while (buttonList.hasMoreElements()) {
                    JRadioButton button = (JRadioButton) buttonList.nextElement();

                    if (button.isSelected()) {
                        System.out.println(button.getText());
                        //bad string matching - replace later 

                        //GET THE VALUES FROM THE FIELDS 
                        String fName = pui.getNameField().getText();
                        String lName = pui.getlastNameField().getText();
//                        double ccNum = Double.parseDouble(pui.getCardNumField().getText());
//                        int ccExpDate = Integer.parseInt(pui.getExpDateField().getText());
//                        int ccCode = Integer.parseInt(pui.getSecurityCodeField().getText());
//                        int zip = Integer.parseInt(pui.getZipCodeField().getText());

                        //These should really be strings to prevent issues such as spacing getting in the way
                        double ccNum = 1.1;
                        int ccExpDate = 1;
                        int ccCode = 123;
                        int zip = 123456;

                        BillingInfo info = new BillingInfo(fName, lName, ccNum, ccExpDate, ccCode, zip);

                        pc.addPayment(button.getText(), info);

                    } else {
                    }

                }

                System.out.println("STORED PAYMENTS ATM");
                for (BillingInfo bi : pc.getPayments().getBillingInfo()) {
                    System.out.println(bi);
                }

            }
        });
    }

    public void switchViews(JPanel newView) {
        bp.switchViews(newView);
    }

    public void login() {
        //bp.switchViews(np);
        JPanel cards = bp.getCardPanel();
        bp.getCardLayout().show(cards, "navigation");

    }

    public void switchToWaitTimes() {
        //bp.switchViews(tp);
        JPanel cards = bp.getCardPanel();
        bp.getCardLayout().show(cards, "wait_times");

    }

    //These navbar buttons are for switching views
    //TODO: why does this just not work sometimes? 
    //loading components? 
    public void navButtonsListeners() {
        bp.getNavButtonLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ps = new PasswordStrengthPanel();

                //the big money
                JPanel cards = bp.getCardPanel();
                bp.getCardLayout().previous(cards);

            }
        });
        bp.getNavButtonCenter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JPanel cards = bp.getCardPanel();
                bp.getCardLayout().show(cards, "navigation");

            }
        });
        bp.getNavButtonRight().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//
                JPanel cards = bp.getCardPanel();
                bp.getCardLayout().next(cards);

            }
        });

    }

}
