package com.two95.chapter7;

import java.util.*;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add("Kevin");
		set.add("Santhosh");
		set.add("Mooletharayil");
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
