package com.java.version.java8.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		
		// Using anonymous
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String s) {
				// TODO Auto-generated method stub
				return s.startsWith("B");
			}
		};
		System.out.println(predicate.test("Bangalore"));
		
		// Using Lambda
		Predicate<String> predicate1 = (s) -> s.startsWith("H");
		System.out.println(predicate1.test("Hyderabad"));
	}
}
