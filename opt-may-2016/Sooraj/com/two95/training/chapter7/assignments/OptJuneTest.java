package com.two95.training.chapter7.assignments;

import java.util.ArrayList;
import java.util.List;

public class OptJuneTest {
	public static void main(String[] args) {
	List<OptJune> list = new ArrayList<OptJune>();
     list.add(new OptJune("Sooraj", "soorajkdas@ymail.com"));
     list.add(new OptJune("Anusha", "Anusha@ymail.com"));
     list.add(new OptJune("Venky", "venky@ymail.com"));
     list.add(new OptJune("Nipul", "nipul@ymail.com"));
     list.add(new OptJune("Sankirth", "sankirth@ymail.com"));
     
     for (OptJune s : list) {
         System.out.println(s.getName()+ "   " +s.getEmail());
     }
	}}
