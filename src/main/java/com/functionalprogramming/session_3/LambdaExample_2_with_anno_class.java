package com.functionalprogramming.session_3;

public class LambdaExample_2_with_anno_class {
    public static void main (String[] args) {

        Thread thread = new Thread (new Runnable () {
            @Override
            public void run () {
                System.out.println ("Thread Executed");
            }
        });

        thread.start ();
    }

}
