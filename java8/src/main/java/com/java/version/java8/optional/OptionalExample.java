package com.java.version.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		Optional<String> result = list.stream()
				.filter(x -> x.length() == 1)
				.findFirst();

		if (result.isPresent()) {
			System.out.println(result.get()); // a
		}
	}
}
