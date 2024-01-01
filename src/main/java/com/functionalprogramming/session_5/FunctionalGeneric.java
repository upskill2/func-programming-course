package com.functionalprogramming.session_5;

@FunctionalInterface
public interface FunctionalGeneric<R, T> {

    R execute (T s);
}
