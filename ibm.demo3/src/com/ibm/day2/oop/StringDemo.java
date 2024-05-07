package com.ibm.day2.oop;

public class StringDemo {
	public static void main(String[] args) {

//		String str2 = new String("abc");
//		System.out.println(str2);
//
//		String str1 = "abc";
//		System.out.println(str1);

		String str = "abcdef";
		System.out.println(str);

		System.out.println(str.length());

		System.out.println(str.charAt(2));

		String username = "vaman";
		String inputtedUsername = "Vaman";

//		if (username.equals(inputtedUsername)) {
		if (username.equalsIgnoreCase(inputtedUsername)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}


}
