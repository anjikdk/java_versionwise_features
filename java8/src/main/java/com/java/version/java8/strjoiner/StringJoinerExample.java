package com.java.version.java8.strjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result = sj.toString(); //aaa,bbb,ccc
		System.out.println(result);
	}
}
