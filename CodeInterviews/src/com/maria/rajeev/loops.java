package com.maria.rajeev;

import java.util.Scanner;

class loops {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int s = 0;
		int s1=0;
		int p=0;
		System.out.println("Enter the value of t");
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			System.out.println("Enter the value of a :");
			int a = in.nextInt();
			System.out.println("Enter the value of b :");
			int b = in.nextInt();
			System.out.println("Enter the value of n :");
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				p =(int)Math.pow(2, i);
				s1=(p*b);
				if(i==0)
				{
                s=a;
                s=s+s1;
				System.out.println(s);
				}
				else{
					s=s+s1;
					System.out.println(s);
				}
			}
		s=0;s1=0;p=0;
		}

		in.close();
	}
}
