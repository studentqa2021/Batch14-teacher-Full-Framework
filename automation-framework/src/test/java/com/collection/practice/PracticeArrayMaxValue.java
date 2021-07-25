package com.collection.practice;

public class PracticeArrayMaxValue {
	
	
	public static void main(String[] args) {
		int array[] = {  66, 85,33,99, 14, 46, 47, 86, 92, 52, 48, 36, };
		
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
		    if (array[i] > max) {
		      max = array[i];
		    }
		}
		
		System.out.println("Max value ="+max);
	}

}
