package com.java.version.java8.datetime.comparedates;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompareLocalDateTime {

	public static void main(String[] args) throws ParseException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

		LocalDateTime date1 = LocalDateTime.parse("2020-01-31 11:44:43", dtf);
		LocalDateTime date2 = LocalDateTime.parse("2020-01-31 11:44:44", dtf);

		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);

		if (date1.isEqual(date2)) {
			System.out.println("Date1 is equal Date2");
		}

		if (date1.isBefore(date2)) {
			System.out.println("Date1 is before Date2");
		}

		if (date1.isAfter(date2)) {
			System.out.println("Date1 is after Date2");
		}
	}
}
