package com.chapter7.assignment7_4;

public class Student {
		private String name;
		private String rollNo;
		public Student(String name, String rollNo) {
			super();
			this.name = name;
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String firstName) {
			this.name = firstName;
		}
		public String getRollNo() {
			return rollNo;
		}
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}

	}

