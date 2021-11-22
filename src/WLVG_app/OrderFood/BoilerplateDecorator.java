/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.OrderFood;

/**
 *
 * @author ellen
 */
public abstract class BoilerplateDecorator implements EateryBoilerplate {

    protected EateryBoilerplate decoratedEateryBoilerplate;

    public BoilerplateDecorator(EateryBoilerplate decoratedEateryBoilerplate) {
        this.decoratedEateryBoilerplate = decoratedEateryBoilerplate;
    }

    @Override
    public void boilerplate() {
        decoratedEateryBoilerplate.boilerplate();
    }

}
