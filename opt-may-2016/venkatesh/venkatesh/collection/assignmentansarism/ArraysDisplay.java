package venkatesh.collection.assignmentansarism;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysDisplay {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(33);
		numbers.add(31);
		numbers.add(32);
		numbers.add(33);
		numbers.add(33);
		numbers.add(31);
		numbers.add(33);
		numbers.add(32);

		Collections.sort(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}

	}

}
