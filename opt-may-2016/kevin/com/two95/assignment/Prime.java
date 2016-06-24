package com.two95.assignment;

public class Prime {
	public static void main(String args[]){
		 System.out.println("The prime numbers betwen 1 and 100 are");
		for(int i=2;i<=100;i++){
			int count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
				}}
				if(count==0){
					System.out.println(" "+i);
				}
			}
		}
	}



