/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.swing.DefaultEventListModel;
import static ca.odell.glazedlists.swing.GlazedListsSwing.eventListModelWithThreadProxyList;
import java.awt.Color;
import java.awt.Dimension;
import ca.odell.glazedlists.gui.TableFormat;
import ca.odell.glazedlists.swing.AdvancedTableModel;
import static ca.odell.glazedlists.swing.GlazedListsSwing.eventTableModelWithThreadProxyList;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author tomia
 */
public class MapUI extends JPanel {

    //@param the list of wait times
    EventList<WaitTime> testList = new BasicEventList<>();

    /**
     * Initializes variables and sets controller
     */
    public MapUI() {
        this.setBackground(Color.decode("#F9FBB2"));
        this.setSize(new Dimension(550, 900));
        initComponents();

    }

    /**
     * Initializes frames and components used in the UI
     */
    private void initComponents() {
        //layout (rows, cols) 
        GridLayout grid = new GridLayout(3, 1);
        this.setLayout(grid);

        //various labels and things 
        JLabel header = new JLabel("WLVG Wait Time Viewer");
        this.add(header);

        //init map
        JLabel mapPic = initMap();
        this.add(mapPic);

        //wait time list 
        JPanel listPanel = initWaitList();
        this.add(listPanel);
    }

    //inits the wait time list 
    private JPanel initWaitList() {
        JPanel listContainer = new JPanel();
        testList = new BasicEventList<>();

        //sample values for thingy
        WaitTime first = new WaitTime("eugene", 000);
        WaitTime second = new WaitTime("Paint Me Silver - Pond", 000);
        WaitTime third = new WaitTime("bmbmbm - Black Midi", 000);
        WaitTime fourth = new WaitTime("We've Only Just Begun - Carpenters", 000);
        WaitTime fifth = new WaitTime("Oxygen - Beach Bunny", 000);

        testList.add(first);
        testList.add(second);
        testList.add(third);
        testList.add(fourth);
        testList.add(fifth);

        AdvancedTableModel<WaitTime> listModel = eventTableModelWithThreadProxyList(testList, new WaitlistTableFormat());
        JTable issuesJTable = new JTable(listModel);
        JScrollPane issuesListScrollPane = new JScrollPane(issuesJTable);
        listContainer.add(issuesListScrollPane, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));

        JButton testValUpdate = new JButton("load new values");
        testValUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testList.clear();
                WaitTime first = new WaitTime("Vape Nation 2.0 - Mom Jeans", 000);
                WaitTime second = new WaitTime("Little Death - The Beths", 000);
                WaitTime third = new WaitTime("#3 - Aphex Twin", 000);
                WaitTime fourth = new WaitTime("Slow - Black Midi", 000);
                WaitTime fifth = new WaitTime("Horses in My Dreams - PJ Harvey", 000);

                testList.add(first);
                testList.add(second);
                testList.add(third);
                testList.add(fourth);
                testList.add(fifth);

            }
        });
        listContainer.add(testValUpdate);

        return listContainer;

    }

    private JLabel initMap() {
        JLabel picLabel = null;

        try {
            //FOR NOW - SAMPLE IMAGE
            //abs
            String path = "C:\\Users\\eugene\\OneDrive - The Pennsylvania State University\\FALL21\\IST 412\\IST412_group6\\Images\\toesy w my toes.jpg";
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

    private void setWaitTimes() {
        //gets the wait times from Tomi's code and edits the view based on that 

        //to remove all values from the list 
        testList.clear();

        //to add a new value, just add another value to the list
        //ex. testList.add(some WaitTime object)
    }

}
