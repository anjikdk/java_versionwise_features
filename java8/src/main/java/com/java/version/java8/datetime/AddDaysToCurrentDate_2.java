package com.java.version.java8.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDaysToCurrentDate_2 {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {

		Date currentDate = new Date();
		System.out.println(dateFormat.format(currentDate));

		// convert date to calendar
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);

//		c.add(Calendar.DATE, 1); 
//		or
		c.add(Calendar.DAY_OF_MONTH, 1);
		
		// convert calendar to date
		Date currentDatePlusOne = c.getTime();

		System.out.println(dateFormat.format(currentDatePlusOne));
	}
}
