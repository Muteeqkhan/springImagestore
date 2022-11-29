package com.demo.sampleSpring.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachUsingLamda {

	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,8,6,2);
		
		
		Consumer consumer=(x)->{
			System.out.println(x);
		};
		
		//in this method it is accepting  the consumer type which is afuntinal interface
		list.forEach(consumer)    ; 
		
		
		ComsumerImplementation  comsumerImplementation=new ComsumerImplementation();
		list.forEach(comsumerImplementation);
		
		
		list.forEach(x->{
			System.out.println(x);
		});
		
		
		
	}
}
