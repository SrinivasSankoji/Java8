package com.jio.javainterviewpoint.innerclass;

public class MyRunnableDemoOne {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable);
		t.start();
	}
}
