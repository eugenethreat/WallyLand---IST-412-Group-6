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
import WLVG_app.ViewWaitTimes.GenerateWaitTimes;
import WLVG_app.ViewWaitTimes.MapUI;
import WLVG_app.ViewWaitTimes.RideDetails;
import WLVG_app.Views.Baseframe;
import WLVG_app.Views.PasswordStrengthPanel;
import WLVG_app.BookHotels.HotelInputPanel;
import WLVG_app.BookHotels.HotelListPanel;
import WLVG_app.Payments.PaymentScreen;
import WLVG_app.Ticketing.BuyTicketsPanel;
import WLVG_app.Ticketing.Park;
import WLVG_app.Ticketing.TicketManager;
import ca.odell.glazedlists.EventList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author eugene
 */
public class Controller {

    private Baseframe baseJFrame;
    private Model m;
    private PaymentScreen paymentScreen = new PaymentScreen(this);

    private PaymentCntl paymentController = new PaymentCntl();
    private PaymentUI paymentUI = new PaymentUI();

    private HotelInputPanel hotelInput = new HotelInputPanel(this);
    private HotelListPanel hotelList = new HotelListPanel(this);

    private String hotel;
    private String roomType;
    private String bed;
    private String layout;

    private PasswordStrengthPanel passwordStrengthUI = new PasswordStrengthPanel();
    private LoginPanel loginUI = new LoginPanel(this);
    private NavigationPanel navigationMenuUI = new NavigationPanel(this);
    private MapUI parkmapUI = new MapUI();

    private TicketManager ticketManager = new TicketManager();
    private BuyTicketsPanel ticketsPanel = new BuyTicketsPanel(this);

    private JPanel cards;

    public Controller(Baseframe bp, Model m) {
        this.baseJFrame = bp;
        this.m = m;

        //Add listeners to navButtons for switching between views 
        this.createNavButtonListeners();

        //Adding various UIs to CardView obj 
        //payment UI 
        this.baseJFrame.getCardPanel().add(paymentUI, "payment");
        //Creates listener for storing payments 
        this.createPaymentListeners();

        this.baseJFrame.getCardPanel().add(hotelInput, "hotelInput");
        this.baseJFrame.getCardPanel().add(hotelList, "hotelList");

        this.baseJFrame.getCardPanel().add(passwordStrengthUI, "pwstrength");
        this.baseJFrame.getCardPanel().add(parkmapUI, "wait_times");
        //Sample wait times for parkmapUI 
        addSampleValues();
        this.baseJFrame.getCardPanel().add(loginUI, "login");
        addLoginListener();
        this.baseJFrame.getCardPanel().add(navigationMenuUI, "navigation");
        this.baseJFrame.getCardPanel().add(ticketsPanel, "tickets");

        //All views added
        //Shows the user the login screen upon login. 
        cards = bp.getCardPanel();
        bp.getCardLayout().show(cards, "login");

        //adds listeneres to navigation menu buttons 
        addNavigationUIButtonListeners();
    }

    public void newPayment() {
        //baseJFrame.getCardLayout().show(cards, "payment");
        this.baseJFrame.setVisible(false);
        this.paymentScreen.setVisible(true);
    }
    
    public void paymentDone() {
        this.baseJFrame.setVisible(true);
    }

    public void selectHotels(String hotel, String roomType, String bed, String layout) {
        baseJFrame.getCardLayout().show(cards, "hotelList");
        this.hotel = hotel;
        this.bed = bed;
        this.roomType = roomType;
        this.layout = layout;
        hotelList.filterVacancies();
    }

    public void backToInputs() {
        baseJFrame.getCardLayout().show(cards, "hotelInput");
    }

    //think about this better later
    public void createPaymentListeners() {
        JButton submitPaymentButton = paymentUI.getSubmitPaymentButton();
        submitPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //submit a new payment based on the type

                //get the payment type
                ButtonGroup paymentTypePicker = paymentUI.getBg();

                Enumeration<AbstractButton> buttonList = paymentTypePicker.getElements();

                while (buttonList.hasMoreElements()) {
                    JRadioButton button = (JRadioButton) buttonList.nextElement();

                    if (button.isSelected()) {
                        System.out.println(button.getText());
                        //bad string matching - replace later 

                        //GET THE VALUES FROM THE FIELDS 
                        String fName = paymentUI.getNameField().getText();
                        String lName = paymentUI.getlastNameField().getText();
//                        double ccNum = Double.parseDouble(paymentUI.getCardNumField().getText());
//                        int ccExpDate = Integer.parseInt(paymentUI.getExpDateField().getText());
//                        int ccCode = Integer.parseInt(paymentUI.getSecurityCodeField().getText());
//                        int zip = Integer.parseInt(paymentUI.getZipCodeField().getText());

                        //These should really be strings to prevent issues such as spacing getting in the way
                        double ccNum = 1.1;
                        int ccExpDate = 1;
                        int ccCode = 123;
                        int zip = 123456;

                        BillingInfo info = new BillingInfo(fName, lName, ccNum, ccExpDate, ccCode, zip);

                        paymentController.addPayment(button.getText(), info);

                    } else {
                    }

                }

                System.out.println("STORED PAYMENTS ATM");
                for (BillingInfo bi : paymentController.getPayments().getBillingInfo()) {
                    System.out.println(bi);
                }

            }
        });
    }

    //Creates the listeners for each navbar button to switch between views. 
    public void createNavButtonListeners() {
        baseJFrame.getNavButtonLeft().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                passwordStrengthUI = new PasswordStrengthPanel();
                System.out.println("showing previous card");
                //the big money
                JPanel cards = baseJFrame.getCardPanel();
                baseJFrame.getCardLayout().previous(cards);

            }
        });
        baseJFrame.getNavButtonCenter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("switching to nav");
                JPanel cards = baseJFrame.getCardPanel();
                baseJFrame.getCardLayout().show(cards, "navigation");

            }
        });
        baseJFrame.getNavButtonRight().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("showing new card");
                JPanel cards = baseJFrame.getCardPanel();
                baseJFrame.getCardLayout().next(cards);

            }
        });

    }

    //changing wait times 
    private void setWaitTimes() {
        EventList<RideDetails> rideList = parkmapUI.getRideList();
        //gets the wait times from Tomi's code and edits the view based on that 

        //to remove all values from the list 
        rideList.clear();

        //generating a new random...
        GenerateWaitTimes generator = new GenerateWaitTimes();

        RideDetails r1 = new RideDetails("WallyCoaster 5", generator.generateRandomTime(), "10:00am-8:00pm", 10);
        rideList.add(r1);

        //to add a new value, just add another value to the list
        //ex. testList.add(some WaitTime object)
    }

    private void addSampleValues() {
        EventList<RideDetails> rideList = parkmapUI.getRideList();

        Time t = new Time(100);

        GenerateWaitTimes generator = new GenerateWaitTimes();

        RideDetails r1 = new RideDetails("WallyCoaster 1", generator.generateRandomTime(), "10:00am-8:00pm", 10);
        rideList.add(r1);

        RideDetails r2 = new RideDetails("WallyCups", generator.generateRandomTime(), "10:00am-8:00pm", 15);
        rideList.add(r2);

        RideDetails r3 = new RideDetails("WallyKids Coaster", generator.generateRandomTime(), "10:00am-8:00pm", 10);
        rideList.add(r3);

        //Adds listener to button to refresh wait times 
        JButton testValUpdate = parkmapUI.getTestValUpdate();
        testValUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setWaitTimes();

            }
        });

    }

    public void checkUserCreds() {
        String username = loginUI.getUsername();
        String password = loginUI.getPassword();

        //TODO - replace with actual login logic 
        if (username.equals("") || (password.equals(""))) {
            System.out.println("Nope");
        } else {
            //successful login
            baseJFrame.getCardLayout().show(cards, "navigation");
        }
    }

    //Adds the listner to the login button that checks credentials 
    private void addLoginListener() {
        JButton loginButton = loginUI.getBtnLogin();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkUserCreds();
            }
        });

    }

    //nice long and verbose :)))))))
    private void addNavigationUIButtonListeners() {
        //Book a hotel
        JButton hotelButton = navigationMenuUI.getHotelBtn2();
        hotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baseJFrame.getCardLayout().show(cards, "hotelInput");
            }
        });

        //order food 
        JButton foodButton = navigationMenuUI.getFoodBtn2();
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("not implemented yet");
            }
        });

        //View wait times 
        JButton waitTimeButton = navigationMenuUI.getTimesBtn2();
        waitTimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baseJFrame.getCardLayout().show(cards, "wait_times");
            }
        });
        //Buy Tickets 
        JButton ticketButton = navigationMenuUI.getTicketsBtn2();
        ticketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Get what's needed to fill values
                
                ticketManager = new TicketManager();
                JComboBox dateBox = ticketsPanel.getDateComboBox();
                JComboBox locationBox = ticketsPanel.getLocationComboBox();
                JComboBox quantityBox = ticketsPanel.getQuantityComboBox();

                for (Park p : ticketManager.getListOfParks()) {
                    locationBox.addItem(p.getParkName());
                }

                for (Date d : ticketManager.getPossibleDates()) {
                    dateBox.addItem(d);
                }
                
                for(int i = 0 ; i < 5 ; i++){
                    quantityBox.addItem(i);
                }
                

                baseJFrame.getCardLayout().show(cards, "tickets");

            }
        });
    }

    public String getHotel() {
        return hotel;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getBed() {
        return bed;
    }

    public String getLayout() {
        return layout;
    }

    //@deprecated - use baseJFrame.getCardLayout().show(cards, 'name') instead! 
    /*
    public void login() {
        //bp.switchViews(navigationMenuUI);
        cards = baseJFrame.getCardPanel();
        baseJFrame.getCardLayout().show(cards, "navigation");
    }

    /*
    public void switchViews(JPanel newView) {
        baseJFrame.switchViews(newView);
    }
   
    }
    public void switchToWaitTimes() {
        //bp.switchViews(tp);
        JPanel cards = baseJFrame.getCardPanel();
        baseJFrame.getCardLayout().show(cards, "wait_times");
    }
     */
}
