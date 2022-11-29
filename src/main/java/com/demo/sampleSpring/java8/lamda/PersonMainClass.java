package com.demo.sampleSpring.java8.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonMainClass {

	
	public static void main(String[] args) {
		
		PersonComparator comparator=new PersonComparator();
		
		
		List<Person> persons=Arrays.asList(new Person(4589, "m","p","z"),new Person(856, "a", "k", "c"));
		
		Collections.sort(persons,comparator);
		persons.forEach(x->{
			System.out.println(x);
		});
		
		
		Collections.sort(persons,(p1,p2)->{
			return -(p1.getName().compareTo(p2.getName()));
		});
		persons.forEach(x->{
			System.out.println(x);
		});
		
		
		
		 Optional<Person> max = persons.stream().max((x,y)->x.getAddress().compareTo(y.getAddress()));
		System.out.println(max.get());
		
	}
}
