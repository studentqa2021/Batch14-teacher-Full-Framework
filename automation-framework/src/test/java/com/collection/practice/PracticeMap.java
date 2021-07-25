package com.collection.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap {
	
	static Map<String,String> mymap = new LinkedHashMap<>();
	public static void main(String[] args) {
		mymap.put("Name", "Sarower");
		mymap.put("City", "Queens");
		System.out.println(mymap);
	}
}
