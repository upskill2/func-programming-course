package com.functionalprogramming.session_8;

public class FactoryMethodPattern {

    public static void main(String[] args) {

        Flooring floor = FlooringFactory.getFlooring(25, 118);
        floor.installation();

    }
}
