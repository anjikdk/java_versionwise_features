package com.java.version.java8.datetime.conversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToLocalDate_1 {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String date = "16/08/2016";

		//convert String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println(localDate);
	}
}
