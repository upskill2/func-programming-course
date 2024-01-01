package com.functionalprogramming.session_7;

import java.util.Optional;

public class Test {

    public static void main (String[] args) {
      Optional<String>   s = Optional.ofNullable (null);
        System.out.println (   s.orElse ("()->Hello"));
        s.orElseGet (()->"()->Hello");
        s.ifPresentOrElse (System.out::println,()-> System.out.println ("Not Present"));
        s.map (String::length).ifPresent (System.out::println);

        s.ifPresent (a -> System.out.println (a.length ()));
        s.ifPresentOrElse (a -> System.out.println (a.length ()),()-> System.out.println ("Not Present"));
    }
}
