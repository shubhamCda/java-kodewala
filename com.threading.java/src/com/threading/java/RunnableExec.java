package com.threading.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExThread extends Thread {
	public void run() {
		System.out.println("inside runnable: " + Thread.currentThread().getName());
	}
}

public class RunnableExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service = Executors.newCachedThreadPool();

		ExThread t1 = new ExThread();

		for (int i = 0; i < 10; i++) {

			service.execute(t1);
		}
	}

}
