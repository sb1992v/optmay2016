package com.two95.ansari.assigncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SecondAssign {
	public static void main(String[] args) {
		
		String currentMax = null; 
		int maxCount = 0;
		int count = 0;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the required line");//java php java ruby java php python 
		String inp = ip.nextLine();
		StringTokenizer st = new StringTokenizer(inp, " ");
		ArrayList<String> list = new ArrayList<>();

		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
			}
		 
	        for(String s:list){   
	        	for(String in:list){
	        		if(s.equals(in)){
	        		count++;	
	        		}
	        		}if(count>maxCount){
	        			maxCount = count;
	        			currentMax = s;
	        			
	        		}count = 0;
	        	
	        	}
	          
	     
System.out.println(currentMax);
	}
}
