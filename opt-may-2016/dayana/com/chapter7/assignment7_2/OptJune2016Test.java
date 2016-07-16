package com.chapter7.assignment7_2;

import java.util.ArrayList;
import java.util.List;

public class OptJune2016Test {

	public static void main(String[] args) {
			List students = new ArrayList<OptJuneStudent>();
			students.add(new OptJuneStudent("Dayana", "dmallass@hawk.iit.edu"));
			students.add(new OptJuneStudent("Kevin", "kevinsanthosh@gmail.com"));
			students.add(new OptJuneStudent("Sooraj", "sooraj@gmail.com"));
			students.add(new OptJuneStudent("Geethi", "geethi@gmail.com"));
			students.add(new OptJuneStudent("Athulya", "athulya@gmail.com"));
			students.add(new OptJuneStudent("Shalini", "shalini@gmail.com"));

			OptJuneStudent.display(students);

	}
}
