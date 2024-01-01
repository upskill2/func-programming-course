package com.functionalprogramming.session_3;

import java.util.stream.IntStream;

public class LambdaUnderTheHood {

    public static void main (String[] args) {

      /*  MyFunInterface fun1 = new MyFunInterface () {
            @Override
            public void myMethod () {
                System.out.println ("Implementation 1");
            }
        };

        MyFunInterface fun2 = new MyFunInterface () {
            @Override
            public void myMethod () {
                System.out.println ("Implementation 2");
            }
        };*/

        MyFunInterface fun1 = () -> System.out.println ("Implementation 1");
        MyFunInterface fun2 = () -> System.out.println ("Implementation 2");

       int sumOfeven =  IntStream
                .rangeClosed (0, 100)
                .filter (i -> i % 2 == 0)
                .reduce ((a, b) -> a + b)
                .getAsInt ();

        System.out.println (sumOfeven);

    }

}
