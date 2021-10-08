/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WLVG_app;

import WLVG_app.Views.Baseframe;

/**
 *
 * @author eugene
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baseframe bp = new Baseframe();
        Model m = new Model();
        
        Controller c = new Controller(bp, m);

        
    }

}
