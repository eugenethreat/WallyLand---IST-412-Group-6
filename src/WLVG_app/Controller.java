/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app;

import WLVG_app.Views.Baseframe;
import WLVG_app.Views.PasswordStrengthPanel;
import javax.swing.JPanel;

/**
 *
 * @author eugene
 */
public class Controller {

    Baseframe bp;
    Model m;

    public Controller(Baseframe bp, Model m) {
        this.bp = bp;
        this.m = m;
        
        //FOR M03 AO3 - SWITCH TO PASSWORD IMMEDIATELY 
        this.switchToPasswordStrengthPanel();
    }

    public void switchToPasswordStrengthPanel() {
        PasswordStrengthPanel ps = new PasswordStrengthPanel();
        this.switchViews(ps);

    }

    public void switchViews(JPanel newView) {
        bp.switchViews(newView);
    }

}
