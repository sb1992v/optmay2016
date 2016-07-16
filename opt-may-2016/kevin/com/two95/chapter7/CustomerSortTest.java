package com.two95.chapter7;
import java.util.*;
public class CustomerSortTest {

	public static void main(String[] args) {
		
		TreeSet set=new TreeSet(new LastNameComparator1());
		set.add(new Customer("Kevin","Santhosh",123456));
		set.add(new Customer("Bessel","Varghese",753159));
		set.add(new Customer("Merin","Shaji",456189));
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Customer customer=(Customer)itr.next();
			System.out.println(customer.getLastName()+" "+customer.getFirstName()+" "+customer.getSsn());;
		}
		

	}

}
