package com.two95.exceptionhandling;

public class Calculator1 {
	void divide(int i,int j)throws MyCustomException{
		if(j==0){
			throw new MyCustomException("Call 1-201-357-8626 for help");
		}
		else{
			System.out.println(i+"/"+j+"="+i/j);
		}
	}

}
