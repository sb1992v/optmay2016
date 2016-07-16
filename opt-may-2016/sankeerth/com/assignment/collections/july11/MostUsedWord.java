package com.assignment.collections.july11;

import java.util.*;

public class MostUsedWord {

	public static void main(String[] args) {

		int count = 0;
		String repeatedWord = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String userInput = sc.nextLine();
		StringTokenizer words = new StringTokenizer(userInput, " ");
		List<String> list = new ArrayList<String>();

		while (words.hasMoreTokens()) {
			list.add(words.nextToken());
		}
		
		Set<String> set = new TreeSet<String>(list);
		for (String i : set) {
			if (Collections.frequency(list, i) > count) {
				count = Collections.frequency(list, i);
				repeatedWord = i;
			}
		}

		System.out.println("Most Repeated Word is: " + repeatedWord);
		sc.close();
	}

}
