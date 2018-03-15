package com.interfaceTutorials;

public class ScientificCalculator implements cal1,cal2{

	public static void main(String[] args) {

		ScientificCalculator obj1 = new ScientificCalculator();
		
		obj1.add();
		obj1.calCos();
		obj1.calSin();
		obj1.Subtract();
		obj1.multiply();
		obj1.divide();
	}
	
	public void calSin() {
		
		System.out.println(" Write all the logics for calculating the sin");
		
	}
	
	public void calCos() {
		
		System.out.println(" Write all the logics for calculating the cos");
		
	}

	@Override
	public void add() {
		
		System.out.println(" Write all the logics for the additions");
	}

	@Override
	public void Subtract() {
		
		System.out.println(" Write all the logics for the Subtraction");
	}

	@Override
	public void multiply() {
		
		System.out.println(" Write all the logics for the multiplication");
	}

	@Override
	public void divide() {
		
		System.out.println(" Write all the logics for the division");
	}

}
