package com.ibm.day2.oop;

public class StringDemo2 {
	public static void main(String[] args) {
		//String str = "abc;";
		//String str2 = new String("abcd");
		//System.out.println(str2);
		//str.equalsIgnoreCase(str2);
		//System.out.println(str);
		
		String str ="abcdeifgh";
		
		char[] chArray = str.toCharArray();
		String str2 = str.toUpperCase();
		String str3 = str2.toLowerCase();
		
		String str5 =  "abc", str6 = "Abc";
		System.out.println(str.compareTo(str6));
	}

}
