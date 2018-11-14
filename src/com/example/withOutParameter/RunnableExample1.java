package com.example.withOutParameter;

public class RunnableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(() ->  {
			for(int i = 0;i<30;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		});
		thread.start();
		for(int i = 0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
