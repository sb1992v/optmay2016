package com.anusha.training;

import java.util.Iterator;
import java.util.TreeSet;

public class OptJuneTest {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new LastNameComparator());    
		set.add(new OptJune("anusha", "rao", 24));    
		set.add(new OptJune("krishna", "kalyanam", 24));     
		set.add(new OptJune("venkat", "subramaniyan", 23));
		set.add(new OptJune("sooraj","menon",27));
		Iterator itr = set.iterator();     
		while (itr.hasNext()) {       
			OptJune oj = (OptJune) itr.next();       
			System.out.println(oj.getLastName() + "   "  + oj.getFirstName() + "    " + oj.getAge()); 
		}

	}

}
