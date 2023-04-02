package com.testng_assertions_2ndApr_2023;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concept {
	
	@Test
	public void logicTest() {
		SoftAssert softassert = new SoftAssert();
		
		if(2 != 3) {
			System.out.println(2 + 3);
			softassert.assertTrue(true);
			
			softassert.fail();
			
			if(true != false) {
				System.out.println("My logic is true");
			}
			
		softassert.assertAll();
		}
	}

}
