	package com.chapter7.assignment7_5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class FrequentWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your line");
		String str = sc.nextLine();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		StringTokenizer tokenizer = new StringTokenizer(str," ");
		while(tokenizer.hasMoreTokens())
		{
			String token = tokenizer.nextToken();
			if(map.get(token)==null)
			{
				map.put(token, 1);
			}
			else
			{
				map.put(token, map.get(token)+1);
			}
		}
		int highestCount = 0;
		for(int i : map.values())
		{
			if(i>highestCount)
			{
				highestCount = i;
			}
		}
		System.out.println("HIghest Count "+ highestCount);
		
		
		for(Entry<String,Integer> entry : map.entrySet())
		{
			if(entry.getValue().equals(highestCount))
			{
				System.out.println("Most frequent word is: "+entry.getKey());
			}
		}
		

	}

}
