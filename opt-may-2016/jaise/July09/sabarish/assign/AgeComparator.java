package July09.sabarish.assign;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		StudentDetails s1 = (StudentDetails) o1;
		StudentDetails s2 = (StudentDetails) o2;
		if (s1.getAge() > s2.getAge()) {
			return 1;
		} else if (s1.getAge() == s2.getAge()) {
			return 0;
		} else {
			return -1;
		}

	}

}
