package com.anusha.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class EmployeeObjectsTest {

	public static void main(String[] args) {
		
		    List<Employee> embs = new ArrayList<Employee>();
		    embs.add(new Employee("znusha", 24));
		    embs.add(new Employee("venkat", 23));
		    embs.add(new Employee("rooraj", 25));
            Collections.sort(embs);
		    for(Employee e:embs){
		    	System.out.println(e);
		    }
System.out.println("sorting by age");
		    Collections.sort(embs,new AgeComparator());
		    for(Employee e:embs){
		    	System.out.println(e);
		    }

		   
		  }
		
	

}

