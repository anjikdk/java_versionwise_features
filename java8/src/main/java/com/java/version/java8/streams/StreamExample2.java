package com.java.version.java8.streams;

import java.util.List;

import com.java.version.java8.Util;

public class StreamExample2 {

	public static void main(String[] args) {
		
		List<String> list = Util.prepareListOfStrings();		
		list.stream().forEach(s -> System.out.println(s));
	}
}
