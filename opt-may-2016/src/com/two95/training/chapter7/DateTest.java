package com.two95.training.chapter7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {

		Date d = new Date();
		System.out.println("java.util.date-->"+d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ii:mm", Locale.UK);
		String formattedDate = sdf.format( new Date() );
		System.out.println("Formatted Date : "+formattedDate);
		
	}
	
	/**
	 * This method gives you the current date
	 * @return the current date
	 */
	public Date getCurrentDate() {
		return new Date();
	}

}
