package com.functionalprogramming.session_5;

import java.util.function.Function;

public class ConstructorReference {

    public static void main (String[] args) {

        Function<Runnable, Thread> threadGenerator = Thread::new;

        Runnable runnable1 = ()-> System.out.println ("Thread 1 Executed");
        Runnable runnable2 = ()-> System.out.println ("Thread 2 Executed");


        Thread thread1 = threadGenerator.apply (runnable1);
        Thread thread2 = threadGenerator.apply (runnable2);

        thread1.start ();
        thread2.start ();

        threadGenerator.apply (()-> System.out.println ("Thread 3 Executed")).start ();


    }
}
