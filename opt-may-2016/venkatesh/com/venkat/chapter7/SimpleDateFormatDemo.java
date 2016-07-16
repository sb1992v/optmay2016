package com.venkat.chapter7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YY");
		String date = sdf.format(new Date());

		return date;
	}

	public static Date getDateAsDate(String date) {
		Date tdate = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YY");
			tdate = sdf.parse(date);

		} catch (ParseException pe) {
			System.out.println("unable to parse date");
		}

		return tdate;
	}
}
