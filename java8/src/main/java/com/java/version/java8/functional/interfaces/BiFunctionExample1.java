package com.java.version.java8.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionExample1 
{
	public static void main(String[] args) {
		
		// Using anonymous
		BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer i1, Integer i2) {
				return i1+i2;
			}
		};
		System.out.println(biFunction.apply(10, 20));
		
		// Using Lambda
		BiFunction<Integer, Integer, Integer> biFunction1 = (i1, i2) -> i1+i2;
		System.out.println(biFunction1.apply(500, 300));
		
		// Where we are using in real time
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("abc", 200);
		map.put("aaa", 300);
		map.put("bbb", 400);
		map.put("ccc", 100);
		
		BiFunction<String, Integer, Integer> biFunction2 = (i1, i2) -> i2+50;
		// Here replaceAll method is taking argument as BiFunction
		map.replaceAll(biFunction2);
		
		System.out.println(map);
	}
}
