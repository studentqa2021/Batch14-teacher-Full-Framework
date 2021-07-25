package com.collection.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySecondMaxValue {

	public static void main(String[] args) {
		int array[] = { 66, 85, 33, 99, 14, 46, 47, 86, 92, 52, 48, 36, };

		int min = array[0];
		int secondmin = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				secondmin = min;
				min = array[i];

			}

		}
		
		System.out.println("min value =" + min);
		System.out.println("Second min =" + secondmin);
		
		Integer[] values = { 66, 85, 33, 99, 14, 46, 47, 86, 92, 52, 48, 36, };
		List<Integer> list = Arrays.asList(values);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
