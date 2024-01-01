package com.functionalprogramming.session_8;

@FunctionalInterface
public interface Function<T, R> {

    R apply (T t);

    default <V>Function<V, R> compose (Function<V, T> function1){
      return (V v) -> apply (function1.apply (v));
    };



}
