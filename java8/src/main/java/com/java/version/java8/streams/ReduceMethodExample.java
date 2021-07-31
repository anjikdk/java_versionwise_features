package com.java.version.java8.streams;

import java.util.Arrays;

// Stream.reduce() combine elements of a stream and produces a single value.
public class ReduceMethodExample {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// 1st argument, init value = 0
		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		// or
//		int sum = Arrays.stream(numbers).reduce(0, Integer::sum);

		System.out.println("sum : " + sum);
	}
}
