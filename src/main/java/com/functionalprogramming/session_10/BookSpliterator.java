package com.functionalprogramming.session_10;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

    private String title;
    private String author;
    private int year;
    private double price;
    private final Spliterator<String> base;

    public BookSpliterator (final Spliterator<String> base) {
        this.base = base;
    }

    @Override
    public boolean tryAdvance (final Consumer<? super Book> action) {
        return this.base.tryAdvance (name -> this.title = name)
                && this.base.tryAdvance (name -> this.author = name)
                && this.base.tryAdvance (name -> this.year = Integer.parseInt (name))
                && this.base.tryAdvance (name -> this.price = Double.parseDouble (name))
                && this.base.tryAdvance (name -> action.accept (new Book (this.title, this.author, this.year, this.price)));
    }

    @Override
    public Spliterator<Book> trySplit () {
        return null;
    }

    @Override
    public long estimateSize () {
        return base.estimateSize () / 4;
    }

    @Override
    public int characteristics () {
        return base.characteristics ();
    }
}
