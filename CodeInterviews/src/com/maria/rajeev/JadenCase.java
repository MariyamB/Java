package com.maria.rajeev;

import java.util.Arrays;
import java.util.stream.Stream;

public class JadenCase {
	public static void main(String[] args)
	{
		
		String phrase1="my name is ichayan today is my bday";
		System.out.println(toJadenCase(phrase1));
	}

	public static String toJadenCase(String phrase) {
		String[] str = phrase.toLowerCase().split(" ");
		for(int i = 0; i < str.length; i++){
			 str[i] = str[i].substring(0, 1).toUpperCase()  + str[i].substring(1);
		}
        
		return (String.join(" ", str));
	}

}