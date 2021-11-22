/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import java.awt.Color;
import java.awt.Dimension;
import ca.odell.glazedlists.swing.AdvancedTableModel;
import static ca.odell.glazedlists.swing.GlazedListsSwing.eventTableModelWithThreadProxyList;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author tomia
 */
public class MapUI extends JPanel {

    //path for image 
    //relative path
    String path = "src/img/park1.jpg";

    //@param the list of wait times
//    EventList<WaitTime> testList = new BasicEventList<>();
    EventList<RideDetails> rideList = new BasicEventList<>();

    JButton testValUpdate;

    /**
     * Initializes variables and sets controller
     */
    public MapUI() {
        this.setBackground(Color.decode("#F9FBB2"));
        this.setPreferredSize(new Dimension(550, 900));
        initComponents();

    }

    /**
     * Initializes frames and components used in the UI
     */
    private void initComponents() {
        //layout (rows, cols) 
        GridLayout grid = new GridLayout(2, 1);
        this.setLayout(grid);

        //init map
        JLabel mapPic = initMap();
        this.add(mapPic);

        //wait time list 
        JPanel listPanel = initWaitList();
        this.add(listPanel);
    }

    //inits the wait time list 
    public JPanel initWaitList() {
        JPanel listContainer = new JPanel();
//        testList = new BasicEventList<>();

        //sample values for thingy
        addSampleValues();

//        AdvancedTableModel<WaitTime> listModel = eventTableModelWithThreadProxyList(testList, new WaitlistTableFormat());
        AdvancedTableModel<RideDetails> rideListModel = eventTableModelWithThreadProxyList(rideList, new RidelistTableFormat());

        JTable issuesJTable = new JTable(rideListModel);
        JScrollPane issuesListScrollPane = new JScrollPane(issuesJTable);
        listContainer.add(issuesListScrollPane, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));

        testValUpdate = new JButton("load new values");

        listContainer.add(testValUpdate);

        return listContainer;

    }

    public JLabel initMap() {
        JLabel picLabel = null;

        try {
            //FOR NOW - SAMPLE IMAGE
            //abs
            //relative - fix later
//            String path = "IST 412\\IST412_group6\\Images\\toesy w my toes.jpg";

            BufferedImage myPicture = ImageIO.read(new File(path));
            picLabel = new JLabel(new ImageIcon(myPicture));
            picLabel.setPreferredSize(new Dimension(300, 300));

        } catch (IOException ex) {
            Logger.getLogger(MapUI.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return picLabel;

    }

  
    public EventList<RideDetails> getRideList() {
        return rideList;

    }

    public JButton getTestValUpdate() {
        return testValUpdate;
    }

    //changing wait times 
    private void setWaitTimes() {
//        EventList<RideDetails> rideList = mp.getRideList();
//        //gets the wait times from Tomi's code and edits the view based on that 
//
//        //to remove all values from the list 
//        rideList.clear();
//
//        Time t = new Time(100);
//
//        RideDetails r1 = new RideDetails("WallyCoaster 1", t, "10:00am-8:00pm", 10);
//        rideList.add(r1);

        //to add a new value, just add another value to the list
        //ex. testList.add(some WaitTime object)
    }

    private void addSampleValues() {
//        EventList<RideDetails> rideList = mp.getRideList();
//
//        Time t = new Time(100);
//
//        //I know this is not MVC but I'll fix it later; 
//        //TestPanel editor says CardLayout is unsupported and its bugging out 
//        GenerateWaitTimes generator = new GenerateWaitTimes();
//
//        RideDetails r1 = new RideDetails("WallyCoaster 1", generator.generateRandomTime(), "10:00am-8:00pm", 10);
//        rideList.add(r1);
//
//        RideDetails r2 = new RideDetails("WallyCups", generator.generateRandomTime(), "10:00am-8:00pm", 15);
//        rideList.add(r2);
//
//        RideDetails r3 = new RideDetails("WallyKids Coaster", generator.generateRandomTime(), "10:00am-8:00pm", 10);
//        rideList.add(r3);

    }

}
