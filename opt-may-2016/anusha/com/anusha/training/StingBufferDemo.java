package com.anusha.training;

public class StingBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer =new StringBuffer();
		buffer.append("a silly young cricket");
		buffer.append("accustomed to sing");
		buffer.append("through the worm sunnyday");
		buffer.insert(10, "Hello");
		String finalText = buffer.toString();
		System.out.println(finalText);

	}

}
