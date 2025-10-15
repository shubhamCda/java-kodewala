package com.threading.java;

//ex:
//1.	cook wiil do cooking once food is ready.
//2. food serving will start

class Cooking extends Thread {
	public void run() { //Running
		System.out.println("Cooking is done...");
		
		
	}//terminated
}

class Serving extends Thread {
	public void run() {
		System.out.println("Food serving started...");
	}
}

public class Driver1 {

	public static void main(String[] args) throws InterruptedException {

		Cooking t1 = new Cooking(); //New thread
		t1.start();// Runnable
//		t1.start();  //if we start thread again it will throws java.lang.IllegalThreadStateException
		t1.join(); // main thread will join t1.
		Serving t2 = new Serving();
		t2.start();
	}

}
