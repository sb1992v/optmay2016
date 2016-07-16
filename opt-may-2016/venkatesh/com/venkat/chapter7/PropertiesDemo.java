package com.venkat.chapter7;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("isam3303", "Management Information System");
		properties.setProperty("isam5638", "fundamentals of DB");
		properties.setProperty("isam 5330", "Internet application development");

		System.out.println(properties.getProperty("isam3303"));
	}

}
