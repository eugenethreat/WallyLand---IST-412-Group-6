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
public class WaitlistTableFormat implements TableFormat<WaitTime> {

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0:
                return "Ride Name";
            case 1:
                return "Wait Time";
        }
        throw new IllegalStateException("that's not a column name dummy");
    }

    @Override
    public Object getColumnValue(WaitTime e, int i) {
        switch (i) {
            case 0:
                return e.getRideName();
            case 1:
                return e.getWaitTime();
        }
        throw new IllegalStateException("that's not a column name dummy");
    }

}
