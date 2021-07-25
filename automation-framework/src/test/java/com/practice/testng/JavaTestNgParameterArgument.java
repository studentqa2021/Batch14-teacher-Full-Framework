package com.practice.testng;

import java.util.Arrays;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JavaTestNgParameterArgument {


	@Test
	@Parameters("car")// name from xml
	public void gettest(String a) {//normally never allow parameter
		System.out.println(a);
	}

}


