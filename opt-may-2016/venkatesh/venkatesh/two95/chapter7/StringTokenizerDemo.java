package venkatesh.two95.chapter7;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		ArrayList<String> tokens = new ArrayList<String>();
		String str = "12345,abcd,Y,98765,ABCD";
		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) {
			tokens.add(st.nextToken());
		}

		for (String token : tokens) {
			System.out.println(token);
		}

	}

}
