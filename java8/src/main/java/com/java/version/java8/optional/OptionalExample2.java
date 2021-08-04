package com.java.version.java8.optional;

import java.util.Arrays;
import java.util.List;

public class OptionalExample2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		String result = list.stream()
				.filter(x -> x.length() == 1)
				.findFirst().orElse(null);

		System.out.println(result);
	}
}
