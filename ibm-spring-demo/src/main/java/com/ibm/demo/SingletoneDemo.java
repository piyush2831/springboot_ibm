package com.ibm.demo;

public class SingletoneDemo {

	public static void main(String[] args) {

//		Prime obj = new Prime(); // 
//		Prime obj2 = new Prime();

		Prime obj = Prime.getInstance();
		Prime obj2 = Prime.getInstance();
		Prime obj3 = Prime.getInstance();
//
		System.out.println(obj.equals(obj2));
//
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
//		

	}

}