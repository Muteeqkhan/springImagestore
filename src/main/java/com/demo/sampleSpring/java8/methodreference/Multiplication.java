package com.demo.sampleSpring.java8.methodreference;

import java.util.function.Function;

import oracle.net.aso.f;

public class Multiplication {

	public int name(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Multiplication multiplication=new Multiplication();
		
		MultiplcationInterface interface1=multiplication::name;
		
		int multiply = interface1.multiply(45, 2);
		
		
		printable function=System.out::println;
			
		
	function.name("cbnm,.");
	
	}
	
}
