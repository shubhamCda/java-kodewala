package com.threading.java;


class NewThread extends Thread{
	public void run() {
		System.out.println("Hello, I'm a thread: " + Thread.currentThread().getName());
		
	}
}

public class RunThread {
	public static void main(String[] args) {
		NewThread t1 =  new NewThread();
		
		t1.start();
		
		System.out.println("Calling Run override:");
		
		t1.run();
	}
}
