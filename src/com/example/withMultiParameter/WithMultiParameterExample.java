package com.example.withMultiParameter;

public class WithMultiParameterExample {
	
	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = (n1 ,n2) -> { return n1+n2+2; };
		System.out.println(myFunctionalInterface.incrementByTwo(10, 45));
		System.out.println(myFunctionalInterface.subtract(10, 5));
		System.out.println(myFunctionalInterface.sum(10, 5));
		System.out.println(MyFunctionalInterface.multiply(10, 20));
	}

}
