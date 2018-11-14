package com.example.withSingleParameter;

import com.example.withSingleParameter.MyFunctionalInterface;

public class WithSingleParameterExample {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = (num) -> {
			return num + 2;
		};
		
		System.out.println(myFunctionalInterface.incrementByTwo(17));
	}

}
