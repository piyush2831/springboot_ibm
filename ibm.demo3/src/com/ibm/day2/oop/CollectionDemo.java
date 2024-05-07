package com.ibm.day2.oop;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		
	ArrayList friendsList = new ArrayList();
	System.out.println(friendsList.size());
	friendsList.add("Sonu");
	friendsList.add("Monu");
	friendsList.add("Tonu");
	System.out.println(friendsList);
	System.out.println(friendsList.size());
	
	friendsList.remove(0);
	
	System.out.println(friendsList);
	System.out.println(friendsList.size());
	
		
	}

}
