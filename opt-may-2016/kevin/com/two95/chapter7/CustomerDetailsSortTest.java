package com.two95.chapter7;
import java.util.*;
public class CustomerDetailsSortTest {

	public static void main(String[] args) {
		
		TreeSet set=new TreeSet(new LastNameComparator1());
		set.add(new CustomerDetails("Kevin","Santhosh",123456));
		set.add(new CustomerDetails("Bessel","Varghese",753159));
		set.add(new CustomerDetails("Merin","Shaji",456189));
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			CustomerDetails customer=(CustomerDetails)itr.next();
			System.out.println(customer.getLastName()+" "+customer.getFirstName()+" "+customer.getSsn());;
		}
		

	}

}
