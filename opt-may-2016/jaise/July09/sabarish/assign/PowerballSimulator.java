package July09.sabarish.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PowerballSimulator {

	public static void main(String[] args) {
		System.out.println("Enter how many number of quick picks required");
		System.out.println("The number should be between 1 to 20");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n > 0) {
			StringBuffer buf = new StringBuffer();
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Integer> nums = new ArrayList<>();
			for (int i = 1; i < 66; i++) {
				list.add(new Integer(i));
			}
			Collections.shuffle(list);
			for (int i = 0; i < 5; i++) {
				nums.add(list.get(i));
			}
			Collections.sort(nums);
			for(Integer inte: nums){
				buf.append(inte);
				buf.append(" ");
			}
					
			// for powerball number
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for (int i = 1; i <= 26; i++) {
				list1.add(new Integer(i));
			}
			Collections.shuffle(list1);
			for (int i = 0; i < 1; i++) {
				buf.append(" PB ");
				buf.append(list1.get(i));

			}
			System.out.println(buf);
			n--;
		}
		
	}
}
