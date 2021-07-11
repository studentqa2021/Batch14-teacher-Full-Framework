package com.practice.testng;

import org.testng.annotations.Test;

public class ArrayValueInTestNG {
	
	String [][] login={ { "Sarower", "SundayStudent123$"},{"Sobhan", "Student2019#"}};
    @Test 
    public void testCase3() {
    	
    	String a=login[0][0] + login[0][1] ;
    	String b=login[1][0] + login[1][1] ;
    	
    	System.out.println("Test "+a);
    	System.out.println("Test "+b);
    	
    }

}
