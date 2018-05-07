package com.maria.rajeev;

import java.util.*;
import java.util.stream.Collectors;

public class WordReverse {
	public static void reverse(String s) {
		List<String> list = Arrays.asList(s.split(" "));
		Collections.reverse(list);
		//System.out.println(list);
		System.out.println(list.stream().collect(Collectors.joining(" ")));
	}

	public static void main(String args[]) {
		// create a new string
		String s ="The world is nice";
		reverse(s);
		
	}
}
