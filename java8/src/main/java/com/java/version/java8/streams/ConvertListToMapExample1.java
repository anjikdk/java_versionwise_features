package com.java.version.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.version.java8.Util;

public class ConvertListToMapExample1 {

	public static void main(String[] args) 
	{
		List<Hosting> list = Util.getListOfHostDetails();
		
		// key = id, value - websites
        Map<Integer, String> result1 = list.stream().collect(
                Collectors.toMap(Hosting::getId, Hosting::getName));

        System.out.println("Result 1 : " + result1);

        // key = name, value - websites
        Map<String, Long> result2 = list.stream().collect(
                Collectors.toMap(Hosting::getName, Hosting::getWebsites));

        System.out.println("Result 2 : " + result2);

        // Same with result1, just different syntax
        // key = id, value = name
        Map<Integer, String> result3 = list.stream().collect(
                Collectors.toMap(x -> x.getId(), x -> x.getName()));

        System.out.println("Result 3 : " + result3);
	}
}
