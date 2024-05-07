package com.ibm.day2.oop;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;



public class ExecutorDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executor.newFixedThreadPool(5);
		for (int i = 1; i <= 10; i++) {
			Runnable obj = new Task("Task" + i);
			executor.submit(obj);
		}
		
	}

}

