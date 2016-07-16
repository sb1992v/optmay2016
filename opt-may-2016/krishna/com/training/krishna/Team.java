package com.training.krishna;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Team {

	public static void main(String[] args) {
	
				Integer[] i = {33,31,32,33,33,31,33,32};
				List<Integer> val = Arrays.asList(i);
				Set<Integer> dub = new HashSet<Integer>(Arrays.asList(i));
				for (Integer dubli : dub) {
					System.out.println(dubli + " : " + Collections.frequency(val,dubli));
				}
				

			}

}


