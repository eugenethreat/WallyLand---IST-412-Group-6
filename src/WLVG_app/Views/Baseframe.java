/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eugene
 */
public class Baseframe extends JFrame {

    /**
     * This panel is the base component later UI elements are overlaid on.
     * Extends JFrame
     */
    
    //color scheme
    //https://coolors.co/f8fcda-e3e9c2-f9fbb2-7c6354-a5abaf
    /*
        Light yellow = #F8FCDA
        'pale spring bud' = #E3E9C2
        'lemon yellow crayola' = #F9FBB2
        'raw umber' (brown) = #7C6354
        silver chalice = #A5ABAF
    */
    
    public Baseframe() {
        //Bootstrapping 
        this.setTitle("WLVG Vacation Planner - Group 6");
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
    
    /**
     * Method that handles switching views based on user input. 
     * @param toSwitch - the JPanel (view) to switch to.
     */
    public void switchViews(JPanel toSwitch){
        
    }
    
   

}
