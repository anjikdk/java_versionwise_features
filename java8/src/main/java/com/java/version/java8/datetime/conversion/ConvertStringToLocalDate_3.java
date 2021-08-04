package com.java.version.java8.datetime.conversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToLocalDate_3 {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		String date = "16-Aug-2016";
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println(localDate);  //default, print ISO_LOCAL_DATE
		System.out.println(formatter.format(localDate)); // print formatter date
	}
}
