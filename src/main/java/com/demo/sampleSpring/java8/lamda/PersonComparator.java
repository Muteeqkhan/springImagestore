package com.demo.sampleSpring.java8.lamda;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getAddress().compareTo(o2.getAddress());
	}

	
}
