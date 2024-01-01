package com.functionalprogramming.session_10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {

    public static void main (String[] args) {

        Path path = Paths.get ("src/main/resources/notebook.txt");

        try (Stream<String> stream = Files.lines (path)) {

            Spliterator<String> base =  stream.spliterator ();
            Spliterator<Book> booksSpliterator = new BookSpliterator (base);

            StreamSupport.stream (booksSpliterator, false)
                    .forEach (System.out::println);

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
