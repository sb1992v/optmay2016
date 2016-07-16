package com.two95.exceptionhandling;

public class CustomizedExceptionTest {

	public static void main(String[] args) {
		Calculator1 c=new Calculator1();
		try{
			c.divide(10, 2);
			c.divide(10, 0);
		}
		catch(MyCustomException ex){
			String message=ex.getMessage();
			System.out.println(message);
		}
		finally{
			System.out.println("This is always executed");
		}

	}

}
