package venkatesh.collection.assignmentansarism;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxWordInLine {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line");
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreTokens()) {
			words.add(st.nextToken());
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.size(); i++) {
			Integer count = map.get(words.get(i));
			map.put(words.get(i), count == null ? 1 : count + 1);
		}
		System.out.println(map);
		int count = 0;
		for (int i = 0; i < words.size() - 1; i++) {

			if (map.get(words.get(i)) > count) {
				count = map.get(words.get(i));

			}

		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (Objects.equals(count, entry.getValue())) {
				System.out.printf("%s occours %d times", entry.getKey(), count);
			}
		}

	}

}
