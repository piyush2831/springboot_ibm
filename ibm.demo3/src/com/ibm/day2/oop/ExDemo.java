package com.ibm.day2.oop;

public class ExDemo {
	public static void main(String[] args) {
		int i = 10;
	int j = 1;
		try {
				int k = i/j;
		System.out.println(k);
		} 
		catch(ArithmeticException e ) {
			System.out.println(e.getMessage());
		}
		
	}

}
