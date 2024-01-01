package com.functionalprogramming.session_10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntro {

    public static void main (String[] args) {
        List<Book> bookList = new ArrayList<> ();

        bookList.add (new Book ("The Fellowship of the Ring", "J.R.R. Tolkien", 1954, 9.99));
        bookList.add (new Book ("The Two Towers", "J.R.R. Tolkien", 1954, 9.99));
        bookList.add (new Book ("The Return of the King", "J.R.R. Tolkien", 1955, 9.99));
        bookList.add (new Book ("The Hobbit", "J.R.R. Tolkien", 1937, 9.99));

        List<Book> filteredBooks = bookList.stream ()
                .filter (book -> book.getYear () > 1950)
                .filter (book -> book.getPrice () < 10)
                .toList ();

        String str = bookList.stream ()
                .filter (book -> book.getYear () > 1950)
                .filter (book -> book.getPrice () < 10)
                .map (book -> book.getTitle ())
                .reduce ("", (a, b) -> a + b + ", ");
        System.out.println (str);

        List<Integer> listInt = List.of (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        listInt.stream ()
                .filter (i -> i % 2 == 0)
                .mapToInt (i -> i)
                .boxed ()
                .mapToDouble (i -> i)
                .mapToObj (i-> Integer.valueOf ((int) i))
                .collect(Collectors.toList());

     OptionalInt optInt =  listInt.stream().mapToInt (i -> i).max ();
     optInt.orElse ( 0);

        //     filteredBooks.forEach (book -> System.out.println (book.getTitle ()));

   //     filteredBooks.forEach (System.out::println);
        final OptionalDouble average = filteredBooks.stream ()
                .mapToDouble (Book::getPrice)
                .average ();

        IntStream intS = IntStream.range (0, 10);

        bookList.stream ()
                .mapToDouble (Book::getPrice)
                .boxed ();

        Stream<Integer> streamInt = intS
                .mapToObj (Integer::valueOf);


        Stream<Integer> infiniteS = Stream.iterate (0, i -> i + 1).limit (10);

        Stream<Integer> infiniteS2 = Stream.generate (()-> 1).limit (10);

    }
}
