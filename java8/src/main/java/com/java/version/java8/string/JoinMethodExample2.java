package com.java.version.java8.string;

import java.util.List;

import com.java.version.java8.Util;

public class JoinMethodExample2 {

	public static void main(String[] args) 
	{
		List<String> list = Util.prepareListOfStrings();
		
		JoinMethodExample2 joinMethodExample = new JoinMethodExample2();
		String str = joinMethodExample.convertFromListToString(list);
		System.out.println(str);
	}
	
	public String convertFromListToString(List<String> list)
	{
		return String.join(",", list).replaceAll("([^,]+)", "\"$1\"");
		
//		return list.stream().map(s -> '"'+s+'"').collect(Collectors.joining(","));
	}
}
