package com.java.version.java8.strjoiner;

import java.util.List;
import java.util.StringJoiner;

import com.java.version.java8.Util;

public class StringJoinerExample_3 {

	public static void main(String[] args) {
		
		List<String> list = Util.prepareListOfStrings();
		
		StringJoiner sj = new StringJoiner(",");
		for(String s : list)
		{
			sj.add(s);
		}
		
		System.out.println(sj);
	}
}
