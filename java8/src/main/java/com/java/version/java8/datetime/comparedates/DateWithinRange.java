package com.java.version.java8.datetime.comparedates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateWithinRange {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date startDate = sdf.parse("2020-01-01");
		Date endDate = sdf.parse("2020-01-31");

		System.out.println("startDate : " + sdf.format(startDate));
		System.out.println("endDate : " + sdf.format(endDate));

		DateRangeValidator checker = new DateRangeValidator(startDate, endDate);

		Date testDate = sdf.parse("2020-01-01");
		System.out.println("testDate : " + sdf.format(testDate));

		if(checker.isWithinRange(testDate)){
			System.out.println("testDate is within the date range.");
		}else{
			System.out.println("testDate is NOT within the date range.");
		}

	}
}

class DateRangeValidator {

    private final Date startDate;
    private final Date endDate;

    public DateRangeValidator(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // inclusive startDate and endDate
    // the equals ensure the inclusive of startDate and endDate,
    // if prefer exclusive, just delete the equals
    public boolean isWithinRange(Date testDate) {

        // it works, alternatives
        /*boolean result = false;
        if ((testDate.equals(startDate) || testDate.equals(endDate)) ||
                (testDate.after(startDate) && testDate.before(endDate))) {
            result = true;
        }
        return result;*/

        // compare date and time, inclusive of startDate and endDate
        // getTime() returns number of milliseconds since January 1, 1970, 00:00:00 GMT
        return testDate.getTime() >= startDate.getTime() &&
                testDate.getTime() <= endDate.getTime();
    }
}
