package July09.sabarish.assign;

import java.util.Comparator;

public class FirstNameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		StudentDetails s1 = (StudentDetails)obj1;
		StudentDetails s2 = (StudentDetails)obj2;
		return s1.getFirstName().compareTo(s2.getFirstName());
	}

}
