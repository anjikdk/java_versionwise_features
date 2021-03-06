package com.java.version.java8.streams;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValues {

	public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        //List<String> result = language.collect(Collectors.toList());  // It will print all values including null
        List<String> result = language.filter(x -> x!=null).collect(Collectors.toList());
        // or
        //List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
