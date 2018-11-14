package com.example.withMultiParameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Aarti");
		list.add("Shweta");
		list.add("Neetu");
		list.add("Archid");
		
		/*One Way*/
		Collections.sort(list, (s1,s2) -> s1.compareTo(s2));
		
		/*2nd Way*/
		list.sort((s1,s2) -> s1.compareTo(s2));
		
		list.forEach((name) -> System.out.println(name));
		
		
		
	}

}
