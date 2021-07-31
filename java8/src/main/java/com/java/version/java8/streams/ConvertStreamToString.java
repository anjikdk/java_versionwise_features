package com.java.version.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStreamToString {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("ram", 30),
				new Person("rak", 20),
				new Person("raj", 40)
				);

		String name = persons.stream()
				.filter(x -> "ram".equals(x.getName()))
				.map(Person::getName) //convert stream to String
				.findAny()
				.orElse("");

		System.out.println("name : " + name);

		List<String> collect = persons.stream()
				.map(Person::getName)
				.collect(Collectors.toList());

		collect.forEach(System.out::println);

	}
}
