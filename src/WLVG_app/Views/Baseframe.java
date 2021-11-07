/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
    private JPanel pn;
//    BASE PANEL 
    private JPanel navbar;
    private JButton navButtonLeft;
    private JButton navButtonCenter;
    private JButton navButtonRight;

    public Baseframe() {
        //Bootstrapping 
        this.setTitle("WLVG Vacation Planner - Group 6");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setpreferredsize is the way
        this.setPreferredSize(new Dimension(550, 900)); 
//        this.setVisible(true);
//        this.pack();

        //Init base panel
        initBasePanel();

        this.setVisible(true);
    }

    /**
     * Base panel containing navigation elements and such
     */
    public void initBasePanel() {
        //Bootstrapping 
        pn = new JPanel();
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
     *
     * @return JPanel containing the navbar.
     */
    public JPanel initNavbar() {
        navbar = new JPanel();
        navbar.setBackground(Color.decode("#E3E9C2"));

        //adjust the second number to tweak #columns
        GridLayout gr = new GridLayout(1, 3);
        navbar.setLayout(gr);

        navButtonLeft = new JButton("left");
        navButtonCenter = new JButton("center");
        navButtonRight = new JButton("right");

        navbar.add(navButtonLeft);
        navbar.add(navButtonCenter);
        navbar.add(navButtonRight);

        //this.add(navbar);
        return navbar;
    }

    /**
     * Method that handles switching views based on user input.
     *
     * @param toSwitch - the JPanel (view) to switch to.
     */
    public void switchViews(JPanel toSwitch) {
        //https://stackoverflow.com/a/44038268
        pn.removeAll();
        pn.repaint();
        pn.revalidate();

        this.add(toSwitch, BorderLayout.CENTER);
        
    }

    /**
     * @return the navButtonLeft
     */
    public JButton getNavButtonLeft() {
        return navButtonLeft;
    }

    /**
     * @return the navButtonCenter
     */
    public JButton getNavButtonCenter() {
        return navButtonCenter;
    }

    /**
     * @return the navButtonRight
     */
    public JButton getNavButtonRight() {
        return navButtonRight;
    }

}
