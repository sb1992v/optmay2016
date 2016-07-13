package venkatesh.two95.chapter7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSortTest {

	public static void main(String[] args) {

		Set set = new TreeSet(new IdComparator());
		set.add(new Employee(8, "venkatesh", "sudha"));
		set.add(new Employee(3, "prasad", "kumar"));
		set.add(new Employee(5, "vishwa", "kamity"));

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.println(employee.getId() + " , " + employee.getFirstName() + " , " + employee.getFirstName());

		}

	}

}
