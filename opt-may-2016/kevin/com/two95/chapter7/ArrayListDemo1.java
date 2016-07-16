package com.two95.chapter7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add("World");
		list.add("ABC");
		for(int i=0;i<list.size();i++){
			String s1=(String)list.get(i);
			System.out.println(s1);
		}
		

	}

}
