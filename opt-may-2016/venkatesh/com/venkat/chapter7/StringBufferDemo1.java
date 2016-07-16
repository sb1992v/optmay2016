package com.venkat.chapter7;

import java.util.Date;

import com.two95.chapter7.SimpleDateFormatDemo;

public class StringBufferDemo1 {

	public static void main(String args[]) {
		Date d = new Date();
		System.out.println(d);
		StringBuffer buffer = new StringBuffer("buffer initial value");
		buffer.append("first value added");
		buffer.append("second value added");
		String finalValue = buffer.toString();
		System.out.println(finalValue);

	}

}
