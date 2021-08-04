package com.java.version.java8.datetime.conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {

	public static void main(String[] args) 
	{
		Date d = new Date();
		SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(d);
		String str = form.format(d); // or if you want to save it in String str
		System.out.println(str); // and print after that
	}
}
