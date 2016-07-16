package com.chapter7.assignment7_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class PowerBall {
	public static void main(String[] args)
	{
		HashSet<String> whiteBalls = new HashSet<String>();
		int countWhite = 0, countRed =0;
		for(int i=1; i<=69; i++)
		{
			Integer k = new Integer(i);			
			whiteBalls.add(k.toString());
		}
		
		HashSet<String> redBalls = new HashSet<String>();
		for(int j=1; j<=26; j++)
		{
			Integer p = new Integer(j);			
			redBalls.add(p.toString());
		}
		System.out.println("White balls\n=================================================");
		int size = whiteBalls.size();
		int[] item = new int[5];
		int[]wBalls = new int[5];
		for(int p = 0; p<5; p++)
		{
			item[p] = new Random().nextInt(size);
			
		}	
				
		for (int m=0; m<5; m++)
		{
			int  i =0;
			for(String str : whiteBalls)
			{
				if(i==item[m])
				{
					//System.out.println(str);
					wBalls[m] = Integer.parseInt(str);
				}
				i++;
			}
		}	
		Arrays.sort(wBalls);
		for(int m=0; m<5; m++)
		{
			System.out.println(wBalls[m]);
		}
		System.out.println("============================================================");

		System.out.println("Red ball");
		int size1 = redBalls.size();
		int temp = new Random().nextInt(size1);
		int n =0;
		for(String str:redBalls)
		{
			if(n==temp)
				System.out.println(str);
			n++;
		}
		
	}
	
	

}
