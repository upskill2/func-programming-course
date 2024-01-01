package com.functionalprogramming.session_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FlatMap {

    public static void main (String[] args) {

        Path path = Paths.get ("src/main/resources/notebook.txt");
        try (final Stream<String> stream = Files.lines (path)
                .flatMap (line -> Stream.of (line.split ("\n")));
        ) {
            stream.forEach (System.out::println);
        } catch (IOException e) {
            e.printStackTrace ();
        }


        System.out.println (Runtime.getRuntime ().availableProcessors ());
    }
}
