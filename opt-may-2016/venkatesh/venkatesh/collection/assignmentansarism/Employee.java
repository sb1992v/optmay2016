package venkatesh.collection.assignmentansarism;

public class Employee implements Comparable<Employee>{

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name,int age) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
}
