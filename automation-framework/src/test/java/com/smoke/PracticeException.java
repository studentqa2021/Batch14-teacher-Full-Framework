package com.smoke;

public class PracticeException {
	//java brain = Heap
	public static void main(String[] args) throws Exception {
		String name ="sarower";//string as datatype
		// String has methods = concate = join
		String name2 ="Smarttech";
		System.out.println(name2);//smarttech
		System.out.println(name);//sarower
		name.concat(name2);
		System.out.println(name.concat(name2));// both
		System.out.println(name2);//smarttech
		System.out.println(name);//sarower
		//no change after concate = immutable <== String ==> 
		//why? 
		//1)String variable/literal ==> String pool == value never change = immutable
		// StringBuilder class =Heap = mutable
		//Stringbuffer class = Heap =mutable
	}

}
