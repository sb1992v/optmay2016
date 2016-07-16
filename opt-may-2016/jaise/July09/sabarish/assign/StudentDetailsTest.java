package July09.sabarish.assign;
/* 
 * I have used array list to store the data since I know there is no duplicate data
 * and to sort Collections.sort was used though this is ineffective way as the time complexity
 * of Collections.sort is bad. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class StudentDetailsTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// creating student objects
		StudentDetails e1 = new StudentDetails("Jaise","John",24,169);
		StudentDetails e2 = new StudentDetails("Sooraj","Kesavdas",25,170);
		StudentDetails e3 = new StudentDetails("Roni","Jose",27,169);
		StudentDetails e4 = new StudentDetails("Kevin","Santhosh",21,172);
		StudentDetails e5 = new StudentDetails("Krishna","Kalyanam",24,168);
		StudentDetails e6 = new StudentDetails("Abhilash","Madhavram",24,178);
		StudentDetails e7 = new StudentDetails("Sankeerth","Reddy",23,178);
		StudentDetails e8 = new StudentDetails("Nipul","Patel",24,172);
		StudentDetails e9 = new StudentDetails("Venkatesh","Subramanyam",24,175);
		StudentDetails e10 = new StudentDetails("Bhavin","Patel",29,180);
		StudentDetails e11 = new StudentDetails("Diana","Sunny",25,164);
		StudentDetails e12 = new StudentDetails("Anusha","Rao",25,164);
		StudentDetails e13 = new StudentDetails("Sharanya","S",25,166);
		ArrayList<StudentDetails> list = new ArrayList<>();
		// adding Student details object to TreeSet
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		list.add(e11);
		list.add(e12);
		list.add(e13);
		System.out.println("The set contains the following details");
		for(StudentDetails st:list){
			System.out.println(st);
		}
		System.out.println("\n..............sort by last name..................\n");
		Collections.sort(list);
		for(StudentDetails st:list){
			System.out.println(st);
	}
		System.out.println("\n..............sort by first name..................\n");
		Collections.sort(list,new FirstNameComparator());
		for(StudentDetails st:list){
			System.out.println(st);
	}
		System.out.println("\n..............sort by age..................\n");
		Collections.sort(list,new AgeComparator());
		for(StudentDetails st:list){
			System.out.println(st);
	}
		System.out.println("\n..............sort by height..................\n");
		Collections.sort(list,new HeightComparator());
		for(StudentDetails st:list){
			System.out.println(st);
	}

}
}