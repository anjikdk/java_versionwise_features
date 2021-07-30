package com.java.version.java8.streams;

import java.util.Arrays;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("rak", 30),
                new Person("ram", 20),
                new Person("raj", 40)
        );

        Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "ram".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1);
        
        Person result2 = persons.stream()
                .filter(x -> "rajesh".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);
    }
}
