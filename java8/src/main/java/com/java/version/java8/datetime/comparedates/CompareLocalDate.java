package com.java.version.java8.datetime.comparedates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompareLocalDate {

	public static void main(String[] args) throws ParseException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");

		LocalDate date1 = LocalDate.parse("2020-02-01", dtf);
		LocalDate date2 = LocalDate.parse("2020-01-31", dtf);

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

		// test compareTo
		if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is after Date2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 is equal to Date2");
		} else {
			System.out.println("How to get here?");
		}
	}
}
