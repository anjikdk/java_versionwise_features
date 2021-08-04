package com.java.version.java8.strjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

		String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println(result);
	}
}
