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
public abstract class FoodDecorator implements FoodInfo {

    protected FoodInfo decoratedFoodInfo;

    public FoodDecorator(FoodInfo decoratedFoodInfo) {
        this.decoratedFoodInfo = decoratedFoodInfo;
    }

    @Override
    public void boilerplate() {
        decoratedFoodInfo.boilerplate();
    }

}
