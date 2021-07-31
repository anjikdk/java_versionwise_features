package com.java.version.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.version.java8.Util;

/**
 * 
 * @author 91939
 *
 *  The below example we will get Exception as host names are duplicates
 *  If keys are duplicate we will get Exception so we have to handle different way, to see how to handle please refer ConvertListToMapExample3.java
 */
public class ConvertListToMapExample2 {

	public static void main(String[] args) {
		
		List<Hosting> list = Util.getListOfHostDetailsWithDuplicateName();
		
		list.add(new Hosting(6, "linode.com", 100000)); // new line

        // key = name, value - websites , but the key 'linode' is duplicated!?
        Map<String, Long> result1 = list.stream().collect(
                Collectors.toMap(Hosting::getName, Hosting::getWebsites));

        System.out.println("Result 1 : " + result1);
	}
}
