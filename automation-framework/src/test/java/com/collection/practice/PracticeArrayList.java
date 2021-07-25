package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeArrayList {
	
	Set<Integer> myset = new HashSet<>();//upcasting >> add 2,2,3,4,5,4,6,5 
	
	public Set<Integer> getArrayValue(){
		myset.add(2);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		myset.add(5);
		myset.add(4);
		myset.add(6);
		myset.add(5);
		
		return myset;
	}
	
	
	public static void main(String[] args) {
		Set<Integer> value=new PracticeArrayList().getArrayValue();
		System.out.println(value);
	}

}
