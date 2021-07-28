package com.java.version.java8.string;

import java.util.ArrayList;
import java.util.List;

public class JoinMethodExample2 {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Bangalore");
		list.add("Hyd");
		list.add("Vizag");
		list.add("Chennai");
		
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
