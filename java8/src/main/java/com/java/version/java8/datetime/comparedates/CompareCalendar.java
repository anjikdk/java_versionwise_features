package com.java.version.java8.datetime.comparedates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompareCalendar {

	public static void main(String[] args) throws ParseException {

	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	      Date date1 = sdf.parse("2020-02-01");
	      Date date2 = sdf.parse("2020-01-31");

	      Calendar cal1 = Calendar.getInstance();
	      Calendar cal2 = Calendar.getInstance();
	      cal1.setTime(date1);
	      cal2.setTime(date2);

	      System.out.println("date1 : " + sdf.format(date1));
	      System.out.println("date2 : " + sdf.format(date2));

	      if (cal1.after(cal2)) {
	          System.out.println("Date1 is after Date2");
	      }

	      if (cal1.before(cal2)) {
	          System.out.println("Date1 is before Date2");
	      }

	      if (cal1.equals(cal2)) {
	          System.out.println("Date1 is equal Date2");
	      }
	  }
}
