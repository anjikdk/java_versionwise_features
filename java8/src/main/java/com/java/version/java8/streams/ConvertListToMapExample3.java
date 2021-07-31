package com.java.version.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.version.java8.Util;

public class ConvertListToMapExample3 {

	public static void main(String[] args) {

		List<Hosting> list = Util.getListOfHostDetailsWithDuplicateName();

		list.add(new Hosting(6, "linode.com", 100000)); // new line

		// key = name, value - websites , but the key 'linode' is duplicated!?
		Map<String, Long> result1 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,
						(oldValue, newValue) -> oldValue));
		
		// if we want new value then try the below one
//		Map<String, Long> result1 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,
//				(oldValue, newValue) -> newValue));
		

		System.out.println("Result 1 : " + result1);
	}
}
