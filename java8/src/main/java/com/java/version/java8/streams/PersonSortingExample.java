package com.java.version.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSortingExample {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("rak", 30),
				new Person("ram", 20),
				new Person("raj", 40)
				);

		// Sorting based on name
		List<Person> persons1 = persons.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		System.out.println(persons1);

		// Sorting based on age
		List<Person> persons2 = persons.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		System.out.println(persons2);
	}
}
