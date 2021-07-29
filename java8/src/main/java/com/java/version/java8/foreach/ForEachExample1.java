package com.java.version.java8.foreach;

import java.util.List;

import com.java.version.java8.Util;

public class ForEachExample1 {

	public static void main(String[] args) {
		
		ForEachExample1 forEachExample1 = new ForEachExample1();
		List<String> list = Util.prepareListOfStrings();
		
		forEachExample1.printDataFromList_1(list);
		forEachExample1.printDataFromList_2(list);
		forEachExample1.printDataFromList_3(list);
		forEachExample1.printDataFromList_4(list);
	}
	
	public void printDataFromList_1(List<String> list)
	{
		list.forEach(s -> System.out.println(s));
	}
	
	public void printDataFromList_2(List<String> list)
	{
		list.stream().forEach(s -> System.out.println(s));
	}
	
	public void printDataFromList_3(List<String> list)
	{
		list.forEach(s -> {
			if(s.startsWith("B"))
				System.out.println(s);
		});
	}
	
	public void printDataFromList_4(List<String> list)
	{
		list.stream().forEach(s -> {
			if(s.startsWith("B"))
				System.out.println(s);
		});
	}
}
