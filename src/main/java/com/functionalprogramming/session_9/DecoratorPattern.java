package com.functionalprogramming.session_9;

public class DecoratorPattern {

    public static void main (String[] args) {
        Burger myOrder = new BurgerShop (burger -> burger.addCheese ())
                .use (new Burger ("Chicken Burger"));
    }
}
