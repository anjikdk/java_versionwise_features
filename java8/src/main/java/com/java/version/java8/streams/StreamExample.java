package com.java.version.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java.version.java8.Util;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> list = Util.prepareListOfStrings();
		
		// filtering which city starting with B
		List<String> list1 = list.stream().filter(s -> s.startsWith("B")).collect(Collectors.toList());
		System.out.println(list1);
		
		// filtering which city contains with H
		List<String> list2 = list.stream().filter(s -> s.contains("H")).collect(Collectors.toList());
		System.out.println(list2);
	}
}
