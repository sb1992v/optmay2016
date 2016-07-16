package com.chapter7.assignment7_5;

import java.util.HashMap;
import java.util.Set;

public class PrintCount {

	public static void main(String[] args) {
		
		int array[] = {33,31,32,33,33,31,33,32}; 
		int k =1,n =0;
		HashMap map = new HashMap();
		for(int i: array)
		{
			map.put(i,0);
		}
		for(int i: array)
		{
			n = (int)map.get(i)+k;
			map.put(i,n);
		}
		Set<Integer> keys = map.keySet();
		for (Integer i: keys)
		{
			System.out.println("Key : "+ i + " Value : " + map.get(i));
		}
	}

}
