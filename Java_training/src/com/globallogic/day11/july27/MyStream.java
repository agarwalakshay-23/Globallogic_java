package com.globallogic.day11.july27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Stream API --it is flow of data where data flows from one place to another
 * place you can perform many operation on data update the data sort the data
 * delete the data others filter
 */

public class MyStream {

	public static void main(String[] args) {

		// list
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(-10);
		ls.add(20);
		ls.add(-40);
		ls.add(-1);
		ls.add(4);
		ls.add(4);
		ls.add(6);
		ls.add(110);
		// create a stream out of list
		// Stream<Integer> st=ls.stream();
		// it will iterate and provide the object each time

		// st.forEach(obj->System.out.println(obj));

		// because you can iterate the stream only onces
		// stream has already been operated upon or closed
		// st.forEach(obj->System.out.println(obj));

		/*
		 * // args for(Object obj:ls) { System.out.println((Integer)obj); }
		 */

		// ls.stream().forEach(obj->System.out.println(obj));
		// ls.stream().forEach(obj->System.out.println(obj));

		// intermedidate operation
		// it will filter the result based on the condition
		// you filter the value and print it
		// ls.stream().filter(e->e>0).forEach(System.out::println);

		// you want to filter the value and return it
		// it will take the data one by one and it will create a list out it
		// List<Integer> positiveNumberList =
		ls.stream()

				// there can be number of element which will varies
				.filter(e -> e > 0)

				// return or false
				// it will have the same number of element
				.map(e -> e * e)
				// pass the comparator object to perform the sorting
				.sorted()
				// Returns a stream consisting of the distinct elements
				.distinct().limit(5).forEach(System.out::println);

		// .collect(Collectors.toList());
		// List<Integer> negitiveNumberList = ls.stream().filter(e -> e <
		// 0).collect(Collectors.toList());

		// positiveNumberList.stream().sorted(Collections.reverseOrder()).forEach(e ->
		// System.out.println(e));

		// System.out.println("positiveNumber " + positiveNumberList);
		// System.out.println("negitiveNumber " + negitiveNumberList);
		/*
		 * for(Integer e: ls) { if(e>0) { return e; } }
		 */

		OptionalInt sum = ls.stream().mapToInt(Integer::intValue).min();
		long total = ls.stream().count();

		System.out.println("sum is " + sum);
		System.out.println("Total Count" + total);

		// reduce to print even
		int even = ls.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);
		// max value
		Integer var = ls.stream().max(Integer::compare).get();
		System.out.println("Max:: " + var);
		// min value
		Integer var2 = ls.stream().min(Integer::compare).get();
		System.out.println("Min:: " + var2);
		// To print the peak
		ls.stream().peek(System.out::println).count();

	}

}
