/*Print the name and email address of all the students in our opt-june batch 
using collections, generics and for-each */


package com.github.GenericVehicleAndSorting;

import java.util.HashMap;
import java.util.Map.Entry;

public class OptJuneBatch {
	
	 
	public static void main(String[] args) {
 		
		HashMap<String, String> details = new HashMap<String, String>();
		
		details.put("Abhilash", "madhavaram.tinku@gmail.com");
		details.put("Anusha", "r.anusharao@gmail.com");
		details.put("Bhavin", "bhavinmps@gmail.com");
		details.put("Dayana", "dmallass@hawk.iit.edu");
		details.put("Jaise", "j.jaise1@gmail.com");
		details.put("Kevin", "kevinsanthish08@gmail.com");
		details.put("Krishna", "kalyanamkrish@gmail.com");
		details.put("Nipul", "nipulguru.patel@gmail.com");
		details.put("Sankeerth", "sankeerth999@gmail.com");
		details.put("Sooraj", "soorajkdas@gmail.com");
		details.put("Sharanya", "sharanya.s215@gmail.com");		
		details.put("Venkatesh", "sb1992v@gmail.com");
		
		for(Entry<String, String> entry : details.entrySet()){
			 			String key = entry.getKey();
			 			String value = entry.getValue();
			 			System.out.println( key + " ----> " +  value);
			 		}
		

		
	}

}
