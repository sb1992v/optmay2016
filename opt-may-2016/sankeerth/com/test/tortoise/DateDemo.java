package com.test.tortoise;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd/MM/yyyy");
		String formattedDate = sdf.format(new Date());
		System.out.println(formattedDate);
	}

}
