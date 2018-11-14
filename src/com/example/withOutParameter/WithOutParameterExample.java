package com.example.withOutParameter;

public class WithOutParameterExample  {

	public static void main(String[] args){
		
		MyFunctionalInterface myFunctionalInterface = () -> {return  " Arti ";};
		System.out.println(myFunctionalInterface.sayHello());
	
	}

}
