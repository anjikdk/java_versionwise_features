package com.java.version.java8.functional.interfaces;

import java.util.function.Function;

public class FunctionExample 
{
	public static void main(String[] args) {
		
		// Using anonymous
		Function<String, Integer> function = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		System.out.println(function.apply("Bangalore"));
		
		// Using Lambda
		Function<String, Integer> function1 = (s) -> s.length();
		System.out.println(function1.apply("Hyderabad"));
	}
}
