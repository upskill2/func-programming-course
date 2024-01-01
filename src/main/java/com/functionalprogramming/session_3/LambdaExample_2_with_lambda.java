package com.functionalprogramming.session_3;

public class LambdaExample_2_with_lambda {
    public static void main (String[] args) {

        Thread thread = new Thread (() ->
                System.out.println ("Thread Executed"));


        thread.start ();
    }

}
