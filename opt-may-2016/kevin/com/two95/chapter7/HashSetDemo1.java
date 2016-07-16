package com.two95.chapter7;

import java.util.*;

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("Kevin");
		set.add("Santhosh");
		set.add("Mooletharayil");
		set.add("Kevin");
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			String s1=(String)itr.next();
			System.out.println(s1);
		}

	}

}
