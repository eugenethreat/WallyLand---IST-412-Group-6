/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app;

import WLVG_app.Login.LoginPanel;
import WLVG_app.Login.NavigationPanel;
import WLVG_app.Payments.BillingInfo;
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
import WLVG_app.Ticketing.Ticket;
import WLVG_app.Ticketing.TicketManager;
import ca.odell.glazedlists.EventList;
import com.google.gson.Gson;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eugene
 */
public class Controller {

    //Functions as view 
    private Baseframe baseJFrame;
    private Model m;
    private PaymentScreen paymentScreen = new PaymentScreen(this);

    private HotelInputPanel hotelInput = new HotelInputPanel(this);
    private HotelListPanel hotelList = new HotelListPanel(this);

    private String hotel;
    private String roomType;
    private String bed;
    private String layout;

//    private PasswordStrengthPanel passwordStrengthUI = new PasswordStrengthPanel();
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
        this.baseJFrame.getCardPanel().add(hotelInput, "hotelInput");
        this.baseJFrame.getCardPanel().add(hotelList, "hotelList");

//        this.baseJFrame.getCardPanel().add(passwordStrengthUI, "pwstrength");
        this.baseJFrame.getCardPanel().add(parkmapUI, "wait_times");
        //Sample wait times for parkmapUI 
        addSampleValues();
        this.baseJFrame.getCardPanel().add(loginUI, "login");
        addLoginListener();
        this.baseJFrame.getCardPanel().add(navigationMenuUI, "navigation");
        this.baseJFrame.getCardPanel().add(ticketsPanel, "tickets");

        //new payment 
        this.baseJFrame.getCardPanel().add(ticketsPanel, "tickets");

        //All views added
        //Shows the user the login screen upon login. 
        cards = bp.getCardPanel();
        bp.getCardLayout().show(cards, "login");

        //adds listeners to navigation menu buttons 
        addNavigationUIButtonListeners();
        //then, hide the buttons until user is logged in
        baseJFrame.getNavButtonLeft().setVisible(false);
        baseJFrame.getNavButtonCenter().setVisible(false);
        baseJFrame.getNavButtonRight().setVisible(false);
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

        RideDetails r1 = new RideDetails("WallyCoaster Extreme", generator.generateRandomTime(), "10:00am-10:00pm", 10);
        rideList.add(r1);

        //to add a new value, just add another value to the list
        //ex. testList.add(some WaitTime object)
    }

    private void addSampleValues() {
        EventList<RideDetails> rideList = parkmapUI.getRideList();

        Time t = new Time(100);

        GenerateWaitTimes generator = new GenerateWaitTimes();

        RideDetails r1 = new RideDetails("WallyCoaster Extreme", generator.generateRandomTime(), "10:00am-10:00pm", 10);
        rideList.add(r1);

        RideDetails r2 = new RideDetails("WallyCups", generator.generateRandomTime(), "10:00am-8:00pm", 15);
        rideList.add(r2);

        RideDetails r3 = new RideDetails("WallyKids Coaster", generator.generateRandomTime(), "10:00am-6:00pm", 10);
        rideList.add(r3);
        
        RideDetails r4 = new RideDetails("Wally Water Adventure", generator.generateRandomTime(), "10:00am-6:00pm", 8);
        rideList.add(r4);

        RideDetails r5 = new RideDetails("Wally Rockin' Coaster", generator.generateRandomTime(), "10:00am-10:00pm", 28);
        rideList.add(r5);

        RideDetails r6 = new RideDetails("WallyWorld Ultimate Drop", generator.generateRandomTime(), "10:00am-10:00pm", 24);
        rideList.add(r6);

        RideDetails r7 = new RideDetails("Wally Super Shot", generator.generateRandomTime(), "10:00am-8:00pm", 2);
        rideList.add(r7);

        RideDetails r8 = new RideDetails("Wally Mighty Mountain", generator.generateRandomTime(), "10:00am-10:00pm", 10);
        rideList.add(r8);
        
        RideDetails r9 = new RideDetails("Wally Jungle Train", generator.generateRandomTime(), "10:00am-8:00pm", 12);
        rideList.add(r9);
        
        RideDetails r10 = new RideDetails("Wally Wonder Spaceship", generator.generateRandomTime(), "10:00am-10:00pm", 9);
        rideList.add(r10);
        
        RideDetails r11 = new RideDetails("Wally Winter Wonderland", generator.generateRandomTime(), "6:00pm-10:00pm", 16);
        rideList.add(r11);
        
        RideDetails r12 = new RideDetails("Wally Princess Castle", generator.generateRandomTime(), "10:00am-4:00pm", 28);
        rideList.add(r12);

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

        if (username.equals("") || (password.equals(""))) {
            JOptionPane.showMessageDialog(null, "Credentials cannot be empty - try again.");

        } else if (!username.equals("demouser") || (!password.equals("1234"))) {
            JOptionPane.showMessageDialog(null, "Incorrect credentials - try again.");

        } else {
            //successful login
            baseJFrame.getCardLayout().show(cards, "navigation");
            //show the navigation things 
            baseJFrame.getNavButtonLeft().setVisible(true);
            baseJFrame.getNavButtonCenter().setVisible(true);
            baseJFrame.getNavButtonRight().setVisible(true);
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

                for (int i = 0; i < 5; i++) {
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

    private String ticketDate;
    private String ticketLocation;
    private int ticketQuantity;

    public void setTicketLocation(String location) {
        ticketLocation = location;
    }

    public void setTicketDate(String date) {
        ticketDate = date;
    }

    public void setTicketQuantity(int quantity) {
        ticketQuantity = quantity;
    }

    public void writeNewPayment(BillingInfo bInfo) {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("billinginfo.json")) {
            gson.toJson(bInfo, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //create a new ticket object and add it to the list. 

        int demoUserid = 1;
        int parkId = 999;
        
        //which park?
        switch (ticketLocation) {
            case "WallyLand LA":
                parkId = 0;
                break;
            case "WallyLand Jacksonville":
                parkId = 1;
                break;
            case "WallyLand Paris":
                parkId = 2;
                break;
            case "WallyLand Tokyo":
                parkId = 3;
                break;
            case "WallyLand Barcelona":
                parkId = 4;
                break;
            case "WallyLand Shanghai":
                parkId = 5;
                break;
            default:
                break;
        }
        Date ticketDate = new Date();
        
        //generate the tickets! and add them to TicketManager
        for (int i = 0; i < ticketQuantity; i++) {
            int ticketId = ticketManager.getPurchasedTickets().size() + 1;
            Ticket newTicket = new Ticket(ticketId, demoUserid, parkId, ticketDate);
            ticketManager.addNewTicket(newTicket);
        }

        for (Ticket t : ticketManager.getPurchasedTickets()) {
            System.out.println(t.toString());
        }

   
    }

    //getter for jbaseframe 
    public Baseframe getbaseJFrame() {
        return baseJFrame;
    }

  

}
