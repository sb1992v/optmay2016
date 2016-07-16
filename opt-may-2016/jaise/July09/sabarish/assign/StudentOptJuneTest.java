package July09.sabarish.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentOptJuneTest {

	public static void main(String[] args) {
		StudentOptJune s1 = new StudentOptJune("Jaise", "j.jaise1@gmail.com");
		StudentOptJune s2 = new StudentOptJune("Sooraj", "soorajkdas@ymail.com");
		StudentOptJune s3 = new StudentOptJune("Roni", "ronipjose@gmail.com");
		StudentOptJune s4 = new StudentOptJune("Abhilash", "madhavaram.tinku@gmail.com");
		StudentOptJune s5 = new StudentOptJune("Sankeerth", "sankeerh999@gmail.com");
		StudentOptJune s6 = new StudentOptJune("Krishna", "kalyanmkrish@gmail.com");
		StudentOptJune s7 = new StudentOptJune("Nipul", "nipulguru.patel@gmail.com");
		StudentOptJune s8 = new StudentOptJune("Venkatesh", "sb1992v@gmail.com");
		StudentOptJune s9 = new StudentOptJune("Saranya", "sharanya.s215@gmail.com");
		StudentOptJune s10 = new StudentOptJune("Bhavin", "bhavinmps@gmail.com");
		StudentOptJune s11 = new StudentOptJune("Diana", "dmallass@hawk.iit.edu");
		StudentOptJune s12 = new StudentOptJune("Anusha", "r.anusharao464@gmail.com");
		StudentOptJune s13 = new StudentOptJune("Kevin", "kevinsanthosh08@gmail.com");
		List<StudentOptJune> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		list.add(s11);
		list.add(s12);
		list.add(s13);
		for (@SuppressWarnings("unused") StudentOptJune student : list) {
			System.out.println(student);
		}

	}

}
