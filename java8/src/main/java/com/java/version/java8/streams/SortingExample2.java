package com.java.version.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.version.java8.Util;

public class SortingExample2 {

	public static void main(String[] args) {

		List<Hosting> hostings = Util.getListOfHostDetails();
		System.out.println("Before Sorting: "+hostings);

		// Sorting based on Host names
		List<Hosting> sortHostList = hostings.stream().sorted(Comparator.comparing(Hosting::getName)).limit(2).collect(Collectors.toList());
		System.out.println("Sorting based on host names: "+sortHostList);

		// Sorting based on Websites
		List<Hosting> sortHostList1 = hostings.stream().sorted(Comparator.comparingLong(Hosting::getWebsites)).collect(Collectors.toList());
		System.out.println("Sorting based on websites: "+sortHostList1);
	}
}
