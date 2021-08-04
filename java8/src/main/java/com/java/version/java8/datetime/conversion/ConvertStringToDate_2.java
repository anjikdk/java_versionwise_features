package com.java.version.java8.datetime.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertStringToDate_2 {

	public static void main(String[] argv) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		String dateInString = "2014-10-05T15:23:01Z";

		try {

			Date date = formatter.parse(dateInString.replaceAll("Z$", "+0000"));
			System.out.println(date);

			System.out.println("time zone : " + TimeZone.getDefault().getID());
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
