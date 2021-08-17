package com.java.version.java8.functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

	public static void main(String[] args) {
		
		// Using ananymous
		BiPredicate<Integer, Integer> biPredicate = new BiPredicate<Integer, Integer>() {

			@Override
			public boolean test(Integer i1, Integer i2) {

				if(i1 == i2)
					return true;
				
				return false;
			}
		};
		System.out.println(biPredicate.test(10, 10));
		
		// Using Lambda
		BiPredicate<Integer, Integer> biPredicate1 = (i1, i2) -> {

			if(i1 == i2)
				return true;
			
			return false;
		};
		System.out.println(biPredicate1.test(20, 30));
	}
}
