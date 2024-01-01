package com.functionalprogramming.session_17;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

public class HelloRxJava {

    public static void main (String[] args) {
        Observable<String> observable = Observable.create (emitter -> {
            emitter.onNext ("Hello");
            emitter.onNext ("World");

            emitter.onComplete ();
        });

        observable.subscribe (System.out::println);
        observable.subscribe (e-> System.out.println (e.length ()));
    }


    Scheduler scheduler = new Scheduler () {
        @Override
        public Worker createWorker () {
            return null;
        }
    };

}
