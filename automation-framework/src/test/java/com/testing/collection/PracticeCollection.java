package com.testing.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class PracticeCollection {
	int a=10;
	int [] b= {2,3};	//List obj = new List();//XXXXX
	//List casting ==> upcasting
	List<Integer> obj= new ArrayList<>();//upcasting
	List<Integer> obj2= new LinkedList<>();
	List<Integer> obj3= new Vector<>();
	List<Integer> obj4= new Stack<>();
	
	//Set
	Set<Double> obj5 = new HashSet<>();
	Set<Double> obj6 = new LinkedHashSet<>();
	Set<Double> obj7 = new TreeSet<>();
	
	//Map<k,v>
	
	Map<String,String> obj77 = new Hashtable<>();
	Map<String,String> obj88 = new HashMap<>();
	Map<String,String> obj66 = new LinkedHashMap<>();
	Map<String,String> obj55 = new TreeMap<>();
	
	void getValue(){
	//list======integer
		obj.add(2);
		obj.add(3);
		obj.add(4);
		System.out.println(obj);
		System.out.println(obj.size());
	//set============================ DOuble
		obj5.add(2.5);
		obj5.add(3.4);
		obj5.add(4.2);
		System.out.println(obj5);
		System.out.println(obj5.size());
	//Map ====================String,String
		
		obj66.put("Name","sarower");
		obj66.put("Country","USA");
		obj66.put("City","Queens");
		System.out.println(obj66);
		System.out.println(obj66.size());
		
		
	}
	
	
	public static void main(String[] args) {
		new PracticeCollection().getValue();
	}
	
}
