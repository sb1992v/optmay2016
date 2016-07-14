package venkatesh.collection.assignmentansarism;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("venkatesh", 24));
		list.add(new Employee("anusha", 26));
		list.add(new Employee("soorej", 27));
		list.add(new Employee("krishna", 24));

		Collections.sort(list);
		System.out.println("sorting by name using comparable interface");
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("sorting by age using comparator interface");
		Collections.sort(list,new AgeComparator());
		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
