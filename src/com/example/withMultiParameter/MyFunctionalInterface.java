package com.example.withMultiParameter;

@FunctionalInterface
public interface MyFunctionalInterface {

	public long incrementByTwo(int num1, int num2);
	
	default int sum(int a, int b) {
		return a+b;
	}
	
	default int subtract(int a, int b) {
		return a-b;
	}
	
	static int multiply(int a, int b) {
		return a*b;
	}
}
