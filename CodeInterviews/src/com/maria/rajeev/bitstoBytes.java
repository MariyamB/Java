package com.maria.rajeev;

public class bitstoBytes {
	public static void main(String[] args)
	{
		Integer i=-1234;
		System.out.println(bits2bytes(1234));
	}
	
	public static int bits2bytes(int a)
	{
	
	String b= Integer.toBinaryString(a);
	char[] arr=b.toCharArray();
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]=='1')
			count++;
		
	}
	return count;
	
	}
	
}
