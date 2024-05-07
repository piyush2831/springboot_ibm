package com.ibm.day2.oop;

import java.util.Scanner;

public class ExDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input " );
		int i = sc.nextInt();
		
		System.out.println("Please enter the input " );
		int j = sc.nextInt();
		
		try {
			System.out.println(i/j);
		}catch(Exception e) {
			System.out.println("Do not enter zero");
		}
		
	}
		

}
