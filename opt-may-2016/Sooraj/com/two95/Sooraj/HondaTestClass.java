package com.two95.Sooraj;

public class HondaTestClass {
	

	public static void main(String[] args) {
		Showroom s3=new Showroom(12345, 45689, 45892);
		Honda h=new Honda();
		h.setShowroom(s3);
		System.out.println(h.getShowroom());
		h.setMileage(35);
		h.setEngine_no("56625");
		h.setCost("4000");
		String s1= h.getCost();
		String s2=h.getEngine_no();
		System.out.println("the cost is "+s1+" and the engine number is  "+s2);
		Car c=new Car();
		c.setModel("honda12");
		c.setCompany("Honda");
		c.execution();
		System.out.println(c.getModel()+  "   " +c.getCompany());
		Vehicle v=new Vehicle();
		v.setCategory("car");
		v.setCost1("5000");
		v.setNumber("50");
		v.execute();
		
		
		
		
		

	}

}
