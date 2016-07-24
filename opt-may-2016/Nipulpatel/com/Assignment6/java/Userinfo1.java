package com.Assignment6.java;

public class Userinfo1 implements MobileInterface {

	String MobileOwnerName = "nipul";
	String Address = "502 roche island ";
	String city = "cherry hill"; 

	@Override
	public String toString() {
		return "Userinfo1 [MobileOwnerName=" + MobileOwnerName + ", Address=" + Address + ", city=" + city + "]";
	}

	@Override
	public void getinfo() {
		System.out.println(MobileOwnerName);

	}

	@Override
	public void getAddress() {

		System.out.println(Address);
	}

	@Override
	public void getCity() {

		System.out.println(city);
	}

}
