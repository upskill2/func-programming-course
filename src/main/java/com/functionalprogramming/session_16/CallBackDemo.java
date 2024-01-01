package com.functionalprogramming.session_16;

import lombok.SneakyThrows;

public class CallBackDemo {

    public static void main (String[] args) throws InterruptedException {

        Runnable runnable = new Runnable () {
            @SneakyThrows
            @Override
            public void run () {
                new CallBackDemo ().runningAsync (new CallBack () {
                    @Override
                    public void call () {
                        System.out.println ("After");
                    }
                });
                System.out.println ("Before main");
            }
        };

        Thread t = new Thread (runnable);
        t.start ();

        Thread.sleep (2500);
        System.out.println ("Main");

        }

        public void runningAsync (CallBack  callBack) throws InterruptedException {
            System.out.println ("Before");
            Thread.sleep (1000);
        }
    }
