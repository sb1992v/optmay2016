package com.two95.training.chapter7.assignments;

import com.two95.training.chapter7.Customer;

public class Employee implements Comparable<Customer>{
		
		String firstName;
		String lastName;
		int age;
		int height;
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
		public Employee(String firstName, String lastName, int age, int height) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.height = height;
		}
		@Override
		public int compareTo(Customer o) {
			
			return 0;
		}

}
