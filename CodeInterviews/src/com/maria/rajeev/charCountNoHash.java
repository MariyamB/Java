package com.maria.rajeev;

import java.util.ArrayList;

public class charCountNoHash {
	public static void main(String[] args) {
		String word = "Mariyam";
		System.out.println(encode(word));

	}

	static char[] encode(String word) {
		char[] str = word.toLowerCase().toCharArray();
		char[] word1 = new char[10];
		char[] str1 = new char[10];
		for (int i = 0; i <= str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					word1[i] = str[i];
				}
			}
			for (int k = 0; k < str.length; k++)
				for (int l = 0; l < word1.length; l++) {
					if (str[k] == word1[l])
						str[k] = ')';
		}
		
	}
		return str;
}
}
