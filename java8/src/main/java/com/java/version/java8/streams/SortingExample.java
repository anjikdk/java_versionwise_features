package com.java.version.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java.version.java8.Util;

public class SortingExample {

	public static void main(String[] args) {
		
		List<String> list = Util.prepareListOfStrings();
		
		System.out.println("Before Sorting : "+ list);
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting : "+sortedList);
	}
}
