package com.practice.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Batch14ParallelBrowser1 {
	
	@Test
	public void getTest() {
		
		new TestingCrossbrowser().getBrower("chrome");
		
		
	}

}
