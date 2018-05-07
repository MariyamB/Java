package com.maria.rajeev;

public class Printer {
    
	public static void main(String[] args)
	{
		String a="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
		int n=a.length();
		System.out.print(printerError(a));
		System.out.println("/"+n);
	}
    public static int printerError(String s) {
    	
    	String a;
    	int count=0;
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)>='n'&&s.charAt(i)<='z')
    		{
    			count++;
    		}
    	}
    
        return count;
    }
}
