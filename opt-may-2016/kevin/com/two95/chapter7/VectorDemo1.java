package com.two95.chapter7;
import java.util.*;
public class VectorDemo1 {

	public static void main(String[] args) {
		List list=new Vector();
		list.add("Kevin");
		list.add("Santhosh");
		list.add("Mooletharayil");
		list.add("Pandanad");
		list.add("Chengannur");
		for(int i=0;i<list.size();i++){
			String s1=(String)list.get(i);
			System.out.println(s1);
		}

	}

}
