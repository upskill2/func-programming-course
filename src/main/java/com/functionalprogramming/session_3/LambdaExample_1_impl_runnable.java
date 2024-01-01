package com.functionalprogramming.session_3;

public class LambdaExample_1_impl_runnable {
    public static void main (String[] args) {
        MyRunnable myRunnable = new MyRunnable ();
        Thread thread = new Thread (myRunnable);
        thread.start ();
    }

}
