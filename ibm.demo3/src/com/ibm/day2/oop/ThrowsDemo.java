package com.ibm.day2.oop;

public class ThrowsDemo {
	public static void PrintNums() throws InterruptedException {
		for (int i = 1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
		public static void callToPrint() throws InterruptedException {
			ThrowsDemo.PrintNums();
			
		}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Two");

	}

}
