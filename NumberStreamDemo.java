package com.collabera.streamdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStreamDemo {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 18, 12, 23, 14, 23, 21, 10);

		int sum = nums.stream().mapToInt(Integer::intValue).sum();

		System.out.println(sum);
		System.out.println("-----");


		List<Integer> sortedNums = nums.stream().sorted() 
				.distinct()
				.collect(Collectors.toList());

		System.out.println(sortedNums);
		System.out.println("-----");

		nums.stream().sorted() 
		.distinct()
		.skip(5)
		.forEach(System.out::println);
		System.out.println("-----");

		List<Integer> sortedNumsDesc = nums.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(sortedNumsDesc);
		

	}

}
