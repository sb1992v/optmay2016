package com.training.krishna;

import java.util.StringTokenizer;

public class Str {
	public static void main(String[] args) {

		{
			String str = "12345,abcd,Y,98765,ABCD";
			StringTokenizer st = new StringTokenizer(str, ",");
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				System.out.println(token);
			}
		}
	}
}