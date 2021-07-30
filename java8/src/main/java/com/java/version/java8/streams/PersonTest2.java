package com.java.version.java8.streams;

import java.util.Arrays;
import java.util.List;

public class PersonTest2 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("ram", 30),
				new Person("rak", 20),
				new Person("raj", 40)
				);

		Person result1 = persons.stream()
				.filter(p -> "rak".equals(p.getName()) && 20 == p.getAge())
				.findAny()
				.orElse(null);

		System.out.println("result 1 :" + result1);

		//or like this
		Person result2 = persons.stream()
				.filter(p -> {
					if ("rak".equals(p.getName()) && 20 == p.getAge()) {
						return true;
					}
					return false;
				}).findAny()
				.orElse(null);

		System.out.println("result 2 :" + result2);

	}
}
