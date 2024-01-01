package com.functionalprogramming.session_9;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Burger {

    private String burgerType;

    public Burger (String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addCheese () {
        System.out.println ("Adding cheese to the burger");
        return this;
    }

    public Burger addTomato () {
        System.out.println ("Adding tomato to the burger");
        return this;
    }

    public Burger addLettuce () {
        System.out.println ("Adding lettuce to the burger");
        return this;
    }
}
