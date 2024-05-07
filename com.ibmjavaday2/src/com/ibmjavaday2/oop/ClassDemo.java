package com.ibmjavaday2.oop;

public class ClassDemo {
	static void gstBillPrint(double amount) {
		double gst = 18;
		double BillAmount = amount + (amount * (gst/100));
		System.out.println(BillAmount);
	}
	
	static double gstBillCalc(double amount, double gst) {
	
		double BillAmount = amount + (amount * (gst/100));
		return BillAmount;
	}
	
	
	public static void main(String[] args) {
		ClassDemo.gstBillPrint(350);
		ClassDemo.gstBillPrint(550);
		ClassDemo.gstBillPrint(950);
		
		
		System.out.println(gstBillCalc(200,6));
	}

}
;
