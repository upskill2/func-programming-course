package com.functionalprogramming.session_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaPractise_5 {

    public static void main (String[] args) {

        FunctionalGeneric<String, String> functionalGeneric = (s) -> s.toUpperCase ();
        System.out.println (functionalGeneric.execute ("hello world"));


        FunctionalGeneric<Integer, String> functionalGeneric1 = (s) -> s.length ();
        System.out.println (functionalGeneric1.execute ("hello world"));

        List<String> list = new ArrayList<> ();
        list.add ("hello");
        list.add ("_");
        list.add ("");
        list.add ("world");

        Predicate<String> predicate = s -> !s.isEmpty ();
        Predicate<String> predicate1 = s -> s.contains ("_");

        List<String> newList = filterList (list, predicate);
        List<String> newList1 = filterList (list, predicate1);
        System.out.println (newList);
        System.out.println (newList1);


        List<Integer> list_c = List.of (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<Integer> consumer = i -> System.out.println (i);

        list_c.forEach (consumer);

        Supplier<String> supplier = () -> "Hello World";
        System.out.println (supplier.get ());

        Function<String, Integer> function = s -> s.length ();
        System.out.println (function.apply ("qwe"));

        UnaryOperator<Integer> unaryOperator = i -> i * 10;
        List<Integer> list1 = createUnaryList (unaryOperator, list_c);
        System.out.println (list1);

        BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Sum of a and b is: " + (a + b);
        System.out.println (biFunction.apply (10, 20));

    }

    private static <R> List<R> createUnaryList (final UnaryOperator<R> unaryOperator, final List<R> listC) {
        return listC.stream ().map (unaryOperator).toList ();
    }

    private static <T> List<T> filterList (final List<T> list, final Predicate<T> predicate) {
        return list.stream ().filter (predicate).toList ();


    }


}
