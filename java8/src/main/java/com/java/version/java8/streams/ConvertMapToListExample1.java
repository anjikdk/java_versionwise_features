package com.java.version.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToListExample1 {

	public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");

        System.out.println("\n1. Convert Map Keys to List...");
        
        List<Integer> result = new ArrayList<>(map.keySet());
        
        result.forEach(System.out::println);

        System.out.println("\n2. Convert Map Values to List...");
        
        List<String> result2 = new ArrayList<>(map.values());
        
        result2.forEach(System.out::println);
    }
}
