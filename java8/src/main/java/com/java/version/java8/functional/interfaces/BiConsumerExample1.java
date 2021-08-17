package com.java.version.java8.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample1 {

	public static void main(String[] args) {

		// Using anonymous
		BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String i1, Integer i2) {
				System.out.println("Key: "+i1 + " Value: "+i2);				
			}
		};

		biConsumer.accept("abc", 100);

		// Using Lambda
		BiConsumer<String, Integer> biConsumer1 = (i1, i2) -> System.out.println("Key: "+i1 + " Value: "+i2);
		biConsumer1.accept("Ram", 32);

		// Where we are using in real time
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("abc", 200);
		map.put("aaa", 300);
		map.put("bbb", 400);
		map.put("ccc", 100);
		
		map.forEach(biConsumer1);
	}
}
