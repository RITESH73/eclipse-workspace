package com.one;

public class Two {
		
	public static int add(int a, int b) {
		
		int sum = a + b;
		
		return sum;
	}

	
	public static int subtract(int a, int b) {
		
		int sum;
		
		if(a>b) {
			 sum = a - b;
			
		}else {
			
			 sum = b - a;
		}
				
		return sum;
	}
	
	
	public void thirdMethod() {
		System.out.println("I am for third method");
	}
}
