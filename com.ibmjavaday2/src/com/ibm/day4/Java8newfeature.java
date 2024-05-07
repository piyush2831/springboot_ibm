package com.ibm.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java 8 features 
// 1. lambda methods 
// 2. functional interface 
// 3. method reference 
// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
// 4. Stream API 

public class Java8newfeature {

	public static void main(String[] args) {

		List<String> myFriends = new ArrayList<>();
		myFriends.addAll(Arrays.asList("Sonu", "Monu", "Tonu"));

//		myFriends.forEach((friend) -> {
//			System.out.println(friend);
//		});
		myFriends.forEach(friend -> System.out.println(friend));

		myFriends.forEach(System.out::println);

	}

}

//
//interface FunInt {
//
//	void m1();
//
//}
//
//public class Java8NewFeatures {
//
//	public static void main(String[] args) {
//		
//		
//
//		FunInt obj = () -> {
//			System.out.println("m1 invoked");
//		};
//		obj.m1();
//
//	}
//
