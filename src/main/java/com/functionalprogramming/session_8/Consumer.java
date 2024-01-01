package com.functionalprogramming.session_8;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
    void accept (T t);

    default Consumer<T> thenAccpet (Consumer<T> consumer2){
                Objects.requireNonNull (consumer2);

        return (T t)->{
            this.accept (t);
            consumer2.accept (t);
        };
    }




}
