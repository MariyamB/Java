package com.maria.rajeev;

import java.util.*;

public class characterCount {
	public static void main(String[] args) {
		String str = "Prespecialized";
		char[] word = str.toCharArray();

		System.out.println(encode(word));

	}

	static HashMap encode(char word[]) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count = 0;
		 char[] word1=new char[10];
		try {
			for (int i = 0; i < word.length; i++) {
				if (!(hm.containsKey(word[i]))) {
					hm.put(word[i], 1);
					
				} else {
					count++;
					hm.put(word[i], count);
					
					
				}
			}
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
		return hm;
	}
}
