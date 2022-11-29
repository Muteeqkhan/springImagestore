package com.demo.sampleSpring.java8.lamda;

import java.util.function.Consumer;

public class ComsumerImplementation implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}

	
}
