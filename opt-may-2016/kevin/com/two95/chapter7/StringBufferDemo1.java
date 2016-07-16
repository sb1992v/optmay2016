package com.two95.chapter7;

public class StringBufferDemo1{

	public static void main(String[] args) {
	 StringBuffer buffer=new StringBuffer();
	 buffer.append("My name is Kevin ");
	 buffer.append("I am a Pakistani.");
	 buffer.insert(17,"Santhosh.");
	 String finalText=buffer.toString();
	 System.out.println(finalText);

	}

}
