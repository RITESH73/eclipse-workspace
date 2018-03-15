package com.userdefinedexception;

public class ExceptionHandling{
	
	public static void main(String[] agrs) {
		try{
			ageCheck(0);
		}catch(Exception e) {
			System.out.println("Age less than zero is not valid age" +e);
		}
	}
	
	public static void ageCheck(int age) throws InvalidAgeCheck{
		
		if(age <=0) {
			//System.out.println("Invalid age, Please enter the correct age");
			
			throw new InvalidAgeCheck("Please enter the valid age");
		}else {
			
			System.out.println("Age of the ckhild is : " + age);
		}
	}
}