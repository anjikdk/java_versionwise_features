package com.java.version.java8.strjoiner;

import java.util.StringJoiner;

public class StringJoinerExample_2 {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner("/", "prefix-", "-suffix");
		sj.add("2016");
		sj.add("02");
		sj.add("26");
		String result = sj.toString(); //prefix-2016/02/26-suffix
		System.out.println(result);
	}
}
