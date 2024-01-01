package com.functionalprogramming.session_9;

public class IteratorPattern {

    public static void main (String[] args) {
        MyArrayList myArrayList = new MyArrayList (new Object[]{1, 2, 3, 4, 5});
        myArrayList.forEach (System.out::println);
    }
}
