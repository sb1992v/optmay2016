package com.training.krishna;

import java.util.HashMap;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>(); 
		map.put("Krishna","kalyanamkrish@gmail.com");
		map.put("Abhilash","madhavaram.tinku@gmail.com");
		map.put("Sankreeth","sankeerth999@gmail.com");
		map.put("Anushna","r.anusharao464@gmail.com");
		map.put("Nipul","nipulguru.patel@gmail.com");
		map.put("Dayana","dmallass@hawk.iit.edu");
		map.put("Sooraj","soorajkdas@ymail.com");
		map.put("Kevin","NA");
		map.put("Saranya","sharanya.s215@gmail.com");
		map.put("Bhavin","psbhavin@gmail.com");
		map.put("Jaise","j.jaise1@gmail.com");
		map.put("Venkatesh","NA");
		
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
			
		}
	}

}
