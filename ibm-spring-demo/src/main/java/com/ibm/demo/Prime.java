package com.ibm.demo;

public class Prime {
	private static Prime prime;

	private Prime() {
		super();
	}

	public static Prime getInstance() {
		if (null == prime)
			prime = new Prime();
		return prime;
	}

	// other business methods



//package com.ibm.demo.single;
//
//// eager loading 
//public class Prime {
//
//	private static Prime prime = new Prime();
//
//	private Prime() {
//		super();
//	}
//
//	public static Prime getInstance() {
//		return prime;
//	}
//
//	// other business methods
//
}

