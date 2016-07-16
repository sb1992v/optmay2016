package July09.sabarish.assign;

public class StudentDetails implements Comparable {
private String firstName;
private String lastName;
private int age;
private int height;
public StudentDetails(String firstName, String lastName, int age, int height) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.height = height;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
@Override
public int compareTo(Object obj) {
	StudentDetails stu = (StudentDetails)obj;
	return this.lastName.compareTo(stu.lastName);
}
@Override
public String toString() {
	return "StudentDetails [firstName=" + firstName + ", \tlastName=" + lastName + ", \tage=" + age + ", \theight=" + height
			+ "]";
}


}
