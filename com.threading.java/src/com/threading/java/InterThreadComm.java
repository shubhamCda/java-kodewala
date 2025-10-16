package com.threading.java;

class ReadAndWrite {
	private String message;

	public synchronized void writeMessage(String _message) {
		System.out.println("Message is writing: " + Thread.currentThread().getName());
		this.message = _message;
		System.out.println("Message is written..." + Thread.currentThread().getName());
		this.notify(); // notify the thread which is in waiting state on ReadAndWrite.
	}

	public synchronized void readMessage() throws InterruptedException {
		System.out.println("waiting to read message....." + Thread.currentThread().getName());
		this.wait();
		System.out.println("Message read: " + message + " " + Thread.currentThread().getName());

	}
}

class ReaderThread extends Thread {
	ReadAndWrite readAndWrite;

	public ReaderThread(ReadAndWrite readAndWrite) {
		this.readAndWrite = readAndWrite;
	}

	public void run() {
		try {
			
			readAndWrite.readMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WriterThread extends Thread {
	ReadAndWrite readAndWrite;

	public WriterThread(ReadAndWrite readAndWrite) {
		this.readAndWrite = readAndWrite;
	}

	public void run() {
		try {
			Thread.sleep(2000);
			readAndWrite.writeMessage("Hello, world");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		// wait,Notify -> Inter-Thread Communication(ITC)
		// T1(Writer Thread)-> write data and notify once done.
		// T2(Reader Thread)-> waiting till data is written by write thread
		// wait/notify are in obj class ->

		ReadAndWrite obj = new ReadAndWrite();
		ReaderThread readerThread = new ReaderThread(obj);
		WriterThread writerThread = new WriterThread(obj);

		readerThread.setName("[Reader Thread]");
		writerThread.setName("[Writer Thread]");

		readerThread.start();
		writerThread.start();

	}

}
