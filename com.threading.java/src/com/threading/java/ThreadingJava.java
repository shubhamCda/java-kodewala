package com.threading.java;

import java.util.Iterator;

class FirstThread extends Thread {
	public void run() {
		System.out.println("Inside first Thread: " + Thread.currentThread().getName());
	}
}

class SecondThread extends Thread {
	public void run() {
		System.out.println("Inside second Thread: " + Thread.currentThread().getName());

	}
}

public class ThreadingJava {
	public static void main(String[] args) {
		System.out.println("main method : START");

		String currentThreadName = Thread.currentThread().getName();

		System.err.println("Thread name: " + currentThreadName);

//		FirstThread t1 = new FirstThread();
//		t1.setName("myFirstThread");
//		t1.start(); //register new thread and call run method
//		
//		SecondThread t2 = new SecondThread();
//		t2.setName("mySecondThread");
//		t2.start();

//		EvenNumber et = new EvenNumber();
//		OddNumber ot = new OddNumber();

		System.err.println("Main method : END");
	}
}
