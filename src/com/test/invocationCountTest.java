package com.test;

import org.testng.annotations.Test;

public class invocationCountTest {
	@Test(invocationCount=10)
	public void sum() {
		
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
}
