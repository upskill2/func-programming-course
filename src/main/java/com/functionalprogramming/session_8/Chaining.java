package com.functionalprogramming.session_8;


public class Chaining {

    public static void main (String[] args) {

        Consumer<String> consumer1 = s -> System.out.println (s);
        Consumer<String> consumer2 = s -> System.out.println (s);

        consumer1.accept ("Hello");
        consumer2.accept ("Hello");
        Consumer<String> consumer3 = consumer1.thenAccpet (consumer1);

        //composition

        Function<Square, Integer> function1 = square -> square.getArea ();
        Function<Integer, Double> function2 = area -> Math.sqrt (area);

        Function<Square, Double> squareToSide = function2.compose (function1);


        function2.compose (function1);
        Square square = new Square (10);

        System.out.println (squareToSide.apply (square));

        final int val = 123;

        Task lambdaTask = () -> {

            System.out.println (val);};

        java.util.function.Function<Integer, java.util.function.Function<Integer, Integer> > function = u -> v -> u +v;

        java.util.function.Function<Integer, Integer> function11 = function.apply (1);
        Integer s = function11.apply (2);
        System.out.println (s);

    }
}
