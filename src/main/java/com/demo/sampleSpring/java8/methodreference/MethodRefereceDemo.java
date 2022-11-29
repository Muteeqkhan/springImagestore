package com.demo.sampleSpring.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MethodRefereceDemo {

	public static void main(String[] args) {
//		name1();

		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

// The lambda expression passed to
// reduce() method takes two Strings
// and returns the longer String.
// The result of the reduce() method is
// an Optional because the list on which
// reduce() is called may be empty.
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

// Displaying the longest String
		longestString.ifPresent(System.out::println);

	}

//	public static void name() {
//		List<MonthyIncomeReduce> incomeReduces=new ArrayList<>();
//		
//		
//		incomeReduces.add(new MonthyIncomeReduce("jan", 15000));
//		incomeReduces.add(new MonthyIncomeReduce("feb", 15000));
//		incomeReduces.add(new MonthyIncomeReduce("mar", 15000));
//		incomeReduces.add(new MonthyIncomeReduce("apr", 15000));
//		
//		
//		Stream<MonthyIncomeReduce> stream = incomeReduces.stream();
//		Stream<Long> map = stream.map(x->x.getSalary());
//		Optional<Long> reduce = map.reduce((a,b)->a+b);
//		System.out.println(reduce.get());
//	}

	public static void name1() {
		List<Integer> list = Arrays.asList(5, 6, 8, 9, 6, 1);
		Integer reduce = list.stream().reduce(9, (a, b) -> a + b);
		System.out.println(reduce);
	}

	public static void name3() {
		String[] names = { "one", "two", "three" };
		Stream<String> stream = Arrays.stream(names);
		Optional<String> reduce = stream.reduce((f, f2) -> f + "-" + f2);
		System.out.println(reduce.get());
	}
}
