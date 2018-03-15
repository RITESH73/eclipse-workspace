package com.abstractdemo;

public class Banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankActivities sbi = new SBI();
		sbi.deposit();
		sbi.withDrawal();
		sbi.intrestRate();
	}
}
// is called abstract class as it has one abstract method in it.
	abstract class BankActivities{
		
		public void deposit() {
			System.out.println("cash and direct deposit");
			
		}
		public void withDrawal() {
			
			System.out.println("cash and bank transfer are available");
		}
		// is called as abstract method.
		public abstract int intrestRate();
	}
	
	 class SBI extends BankActivities {

		@Override
		public int intrestRate() {

			System.out.println("Rate of intrest is 8");
			return 0;
		}
		
	}


