package com.ansari.assign.collections;

import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		int total = 0;
		int MAX_total = 0;
		String word = null;
		System.out.println("Please enter a line");
		Scanner sc = new Scanner(System.in);
		String br = sc.nextLine();
		System.out.println("The entered line is " + br);
		System.out.println("The maximum occured word in the line is:");
		StringTokenizer S = new StringTokenizer(br, " ");
		List<String> list = new ArrayList();
		while (S.hasMoreTokens()) {
			list.add(S.nextToken());
		}
		for (String at : list) {
			for (String in : list) {
				if (at.equals(in)) {
					total++;
				}
				if (total > MAX_total) {
					MAX_total = total;
					word = at;

				}
				total = 0;

			}

		}
		System.out.println(word + " ");

	}

}
