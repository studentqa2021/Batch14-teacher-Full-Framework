package com.practice.testng;

import java.util.Arrays;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JavaTestNgParameterArgument {

	static void getsalary(int a){
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		
		getsalary(10);

		
	}
	
	@Test
	@Parameters("browser")
	public void gettest(String a) {

		System.out.println(a);
	}
	
}
