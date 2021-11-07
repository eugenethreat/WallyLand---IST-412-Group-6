/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.ViewWaitTimes;

/**
 *
 * @author eugene
 */
public class WaitTime {

    private String rideName;
    private int waitTime;

    public WaitTime() {
        rideName = "default name";
        waitTime = 0000;
    }

    public WaitTime(String rideName, int waitTime) {
        this.rideName = rideName;
        this.waitTime = waitTime;
    }

    /**
     * @return the rideName
     */
    public String getRideName() {
        return rideName;
    }

    /**
     * @param rideName the rideName to set
     */
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    /**
     * @return the waitTime
     */
    public int getWaitTime() {
        return waitTime;
    }

    /**
     * @param waitTime the waitTime to set
     */
    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

}
