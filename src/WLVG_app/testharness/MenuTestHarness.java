/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.testharness;

import WLVG_app.OrderFood.FoodCntl;
import WLVG_app.OrderFood.Menu;
import WLVG_app.OrderFood.MenuList;
import static WLVG_app.testharness.testharness.testBillingInfo;
import static WLVG_app.testharness.testharness.testFinalizedSale;
import static WLVG_app.testharness.testharness.testPaymentCntl;
import static WLVG_app.testharness.testharness.testPaymentList;

/**
 *
 * @author jackgallagher
 */
public class MenuTestHarness 
{
    //Ordering Food 
    private static MenuList menuList;
    private static Menu menu;
    private static FoodCntl foodController;

    public static void main(String[] args) {
        System.out.println("testing the test harness");

        // ************************************
        // *****   package Payments  ******
        // ************************************
        // test stubs for Payments
        testBillingInfo();
        testFinalizedSale();
        testPaymentCntl();
        testPaymentList();

        System.out.println("testing...");

        // ************************************
        // *****   package OrderFood  ******
        // ************************************
        // test stubs for FoodCntl
        boolean boolFoodStatus = false;

        foodController = new FoodCntl();
        menu = new Menu();
        menuList = new MenuList();

        if (foodController.getMenus() == menuList) {
            boolFoodStatus = true;
        }
        System.out.println("FoodCntl.getMenus() Success: " + boolFoodStatus);

        boolFoodStatus = false;
        foodController.addMenu();
        if (!(foodController.getMenus().getMenu().isEmpty())) {
            boolFoodStatus = true;
        }

        System.out.println("FoodCntl.addMenu() Success: " + boolFoodStatus);

        // test stubs for Menu
        System.out.println("MenuList.getLocation() Output: " + menu.getLocation());
        System.out.println("MenuList.getHours() Output: " + menu.getHours());
        System.out.println("MenuList.getFood1() Output: " + menu.getFood1());
        System.out.println("MenuList.getPrice1() Output: " + menu.getPrice1());
        System.out.println("MenuList.getFood2() Output: " + menu.getFood2());
        System.out.println("MenuList.getPrice2() Output: " + menu.getPrice2());
        System.out.println("MenuList.getFood3() Output: " + menu.getFood3());
        System.out.println("MenuList.getPrice3() Output: " + menu.getPrice3());
        System.out.println("MenuList.getFood4() Output: " + menu.getFood4());
        System.out.println("MenuList.getPrice4() Output: " + menu.getPrice4());
        System.out.println("MenuList.getFood5() Output: " + menu.getFood5());
        System.out.println("MenuList.getPrice5() Output: " + menu.getPrice5());

        // test stubs for MenuList
        System.out.println("MenuList.getMenuList() Output: " + menuList.getMenu());

}
}
