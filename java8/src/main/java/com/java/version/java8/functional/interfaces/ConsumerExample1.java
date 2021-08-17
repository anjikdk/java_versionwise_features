package com.java.version.java8.functional.interfaces;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		
		// Using anonymous
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		consumer.accept("Bangalore is a city");
		
		// Using Lambda
		Consumer<String> consumer1 = (s) -> System.out.println(s);
		consumer1.accept("Hyderabad is a city");
	}
}
