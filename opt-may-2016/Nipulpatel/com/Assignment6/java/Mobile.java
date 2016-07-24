package com.Assignment6.java;

public abstract class Mobile {
 
	String mobileName;
	String Modelnuber;
	String Carrier;
	long mobilenumber;

	public abstract void mobilename();

	public abstract void modelnumber();

	public abstract void cariar();

	public abstract void mobilenumber();

	
	// normal method ,we can create a normal method in abstract class only.
	public void MobileObj() {
		mobilename();
		modelnumber();
		cariar();
		mobilenumber();

	}

}
