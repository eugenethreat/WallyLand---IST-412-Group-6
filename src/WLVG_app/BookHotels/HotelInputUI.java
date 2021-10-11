/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WLVG_app.BookHotels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The UI for the inputting user requirements for a vacancy
 * @author graeme
 */
public class HotelInputUI extends JFrame{

    public HotelInputUI() {
        //Bootstrapping 
        this.setTitle("Enter Details");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 900);
        
        //Init base panel
        initBasePanel();
        
        this.setVisible(true);
    }
    
    /**
     * Base panel containing navigation elements and such
     */
    public void initBasePanel(){
        //Bootstrapping 
        JPanel pn = new JPanel();
        pn.setBackground(Color.decode("#A5ABAF"));
        
        //borderlayout -- for navbar @ bottom
        BorderLayout br = new BorderLayout();
        pn.setLayout(br);
        
        //Components 
        //initiate and add navbar
        this.add(initNavbar(), BorderLayout.SOUTH);

        //finally, add the base panel and its components.
        this.add(pn);
        
    }
    
    /**
     * Navigation panel buttons 
     * @return JPanel containing the navbar.
     */
    public JPanel initNavbar(){
        JPanel navbar = new JPanel();
        navbar.setBackground(Color.decode("#E3E9C2"));
        
        //adjust the second number to tweak #columns
        GridLayout gr = new GridLayout(1,3);
        navbar.setLayout(gr);
        
        JButton button1 = new JButton("left");
        JButton button2 = new JButton("center");
        JButton button3 = new JButton("right");
        
        navbar.add(button1);
        navbar.add(button2);
        navbar.add(button3);
        
        //this.add(navbar);
        return navbar;
    }
    
}
