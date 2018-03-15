package com.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void sofAssertion() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test one started");
		assertion.assertEquals(12, 13, "The number didn't match : ");
		System.out.println("Test one completed");
		assertion.assertAll();
	}
}
