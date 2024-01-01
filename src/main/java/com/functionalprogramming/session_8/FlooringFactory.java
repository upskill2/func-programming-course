package com.functionalprogramming.session_8;

import java.util.function.Supplier;

public class FlooringFactory {

    public static Flooring getFlooring (int minTemprature, int maxTemprature) {
        Supplier<Flooring> flooring;

        if (minTemprature <= 5 && maxTemprature <= 20) {
             flooring = () -> new WoddenFlooring ();
        } else if (minTemprature <= 4) {
           flooring = () -> new CorkFlooring ();
        } else if (minTemprature <= -5) {
            flooring = () -> new ConcreteFlooring ();
        } else {
            flooring = () -> new WoddenFlooring ();
        }

        return flooring.get ();
    }
}
