/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

import ca.odell.glazedlists.gui.TableFormat;

/**
 *
 * @author eugene
 */
public class RidelistTableFormat implements TableFormat<RideDetails> {

    public RidelistTableFormat() {
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0:
                return "Attraction";
            case 1:
                return "Wait Time";
            case 2:
                return "Max Capacity";
            case 3:
                return "Ride Hours";
        }
        throw new IllegalStateException("that's not a column name dummy");
    }

    @Override
    public Object getColumnValue(RideDetails e, int i) {
        switch (i) {
            case 0:
                return e.getAttraction();
            case 1:
                return e.getWaitTime();
            case 2:
                return e.getMaxCapacity();
            case 3:
                return e.getRideHours();
        }
        throw new IllegalStateException("that's not a column name dummy");
    }

}
