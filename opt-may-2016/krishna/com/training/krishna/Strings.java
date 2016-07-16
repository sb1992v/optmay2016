package com.training.krishna;
public class Strings {

	public static void main(String[] args) {
		String str = "France vs Portugal in UFEA EURO 2016 finals";
		int length = str.length();
		System.out.println("The length of the text is " + length);
		char ch = str.charAt(1);
		System.out.println(ch);
		int pos1 = str.indexOf('P');
		int pos2 = str.indexOf("U");
		System.out.println(pos1);
		System.out.println(pos2);
		String s1 = str.substring(10);
		String s2 = str.substring(8, 15);
		System.out.println(s1);
		System.out.println(s2);
		if (str.equals("France vs Portugal in UFEA EURO 2016 finals")) {
		System.out.println(" Not Equal. Check the Case");
		}
		if (str.equalsIgnoreCase("France vs Portugal in UFEA EURO 2016 finals")) {
		System.out.println("Equal");

	}

}
}
