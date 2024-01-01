package com.functionalprogramming.session_4;

public class LambdaPractice_1 {

    public static void main (String[] args) {

        Name name = () -> System.out.println ("My name is: " + "Sachin");
        name.myName ();

        Math math = (int a, int b) -> System.out.println (a + b);
        math.sum (10, 20);

        LenghtOfString lenghtOfString = s -> {
            int length = s.length ();
            System.out.println ("Length of the string is: " + length);
          return length;
        };
        lenghtOfString.lenght ("Sachin");
    }
}
