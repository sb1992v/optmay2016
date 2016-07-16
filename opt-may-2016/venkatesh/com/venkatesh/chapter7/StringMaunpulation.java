package com.venkatesh.chapter7;

import com.two95.chapter7.SimpleDateFormatDemo;

public class StringMaunpulation {

	public static void main(String args[]) {
		String str = "This is really really big text ";
		int length = str.length();
		System.out.println("The length of the text is " + length);
		char ch = str.charAt(6);
		System.out.println("Character at position 6 is:" + ch);
		int pos1 = str.indexOf("s");
		int pos2 = str.indexOf("really");
		System.out.println("Index of position 1 and 2 are:" + pos1 + pos2);
		String s1 = str.substring(22);
		String s2 = str.substring(8, 20);
		System.out.println("substring starting from index 22 is:" + s1 + " substring from index 8 to 20 is :" + s2);
		String string = "Hello";
		if (string.equals("hello")) {
			System.out.println(" Strings are equal");
		} else {
			System.out.println("Strings are unequal");
		}

		if (string.equalsIgnoreCase("hello")) {
			System.out.println("ignore case: Strings are equal");
		} else {
			System.out.println("ignore case: Strings are unequal");
		}

		String oldText = "abcdefgh";
		String newText = oldText.toUpperCase();
		System.out.println("old text:" + oldText + "new Text:" + newText);
		String str1 = "Hello";
		String str2 = s1 + "World";
		String str3 = "This" + " is " + "easy";
		System.out.println(str1 + "concatinate" + str2 + "is : " + str3);

		String a = "hi  this";
		System.out.println(a.indexOf("t"));

		System.out.println(a.charAt(6));
		System.out.println(a.substring(0, 5));

	}
}
