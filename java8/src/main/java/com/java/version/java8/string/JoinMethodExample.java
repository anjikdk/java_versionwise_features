package com.java.version.java8.string;

import java.util.List;

import com.java.version.java8.Util;

public class JoinMethodExample 
{
	public static void main(String[] args) 
	{
		List<String> list = Util.prepareListOfStrings();
		
		JoinMethodExample joinMethodExample = new JoinMethodExample();
		String str = joinMethodExample.convertFromListToString(list);
		System.out.println(str);
	}
	
	public String convertFromListToString(List<String> list)
	{
		return String.join(",", list);
	}
}
