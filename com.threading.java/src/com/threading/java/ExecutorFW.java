package com.threading.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//class MyThread extends Thread{
//	public void run() { //run() method does not allow us to return anything then,
//		System.out.println("in MyThread: "+Thread.currentThread().getName());
//	}
//}

class MyThread implements Callable<String> {
	public String call() { // we use callable method to return type of future object
		System.out.println("thread from call method: " + Thread.currentThread().getName());
		String status = pay();
		return status;
	}

	public String pay() {
		System.out.println("inside pay() method....");
		return "success";
	}
}

public class ExecutorFW {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Executor fW decides how many thread it wanted to execute: reusing the threads

//		ExecutorService service = Executors.newCachedThreadPool();
//		ExecutorService service = Executors.newFixedThreadPool(10);
		ExecutorService service = Executors.newSingleThreadExecutor();

		MyThread t1 = new MyThread();

//		for (int i = 0; i < 15; i++) {
//			service.submit(t1);
//		}

		for (int i = 0; i < 10; i++) {
			Future<String> future = service.submit(t1); // future obj will give us return
			System.out.println(future.get());
		}
		service.shutdown();

	}

}
