package com.anusha.training;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		Set set= new TreeSet();
		set.add("hello");
		set.add("world");
		set.add("abc");
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			String s1 =(String)itr.next();
			System.out.println(s1);
		}

	}

}
