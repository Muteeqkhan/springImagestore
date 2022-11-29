package com.demo.sampleSpring.java8.lamda;

import java.util.function.Consumer;

/***
 * this is the class to show how to implement the lamda expression for functional interface demointerface
 * @author muteeq.khan
 *
 */
public class DemoExample {

	
	public static void main(String[] args) {
		
		String name="muteeq";
		DemoInterface demoInterface=(n)->{
			return "hello"+ name;
		};
		String sayHello = demoInterface.sayHello(name);
		System.out.println(sayHello);
		
		
		//sayHello(String name);
		DemoInterface demoInterface2=(p)->{ //p is the parameter which the fuctional method sayhello has .we have to pass the no of parameter which the method accepts
			return "this is the second implementation for the demo ingterfce"+  p;
		};
		
		String sayHello2 = demoInterface2.sayHello("ateeq");
		System.out.println(sayHello2);
		
		
		DemoInterface  consumer=(na)->{
			int a=4;
			int b=78;
			return ""+a+""+b+na;
		};
		
		
	}
}
