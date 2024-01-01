package com.functionalprogramming.session_9;

import java.util.function.Function;

public class BurgerShop {

    public BurgerShop (Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }

    private Function<Burger, Burger> decoration;

    public Burger use (Burger baseBurger) {
        System.out.println ("Using the burger shop" + baseBurger);
        return decoration.apply (baseBurger);
    }



}
