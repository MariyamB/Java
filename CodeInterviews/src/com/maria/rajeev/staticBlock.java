package com.maria.rajeev;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class staticBlock {
	static Scanner sc= new Scanner(System.in);
	static int B=sc.nextInt();
	static int H=sc.nextInt();
	static boolean flag=true;
	static {
	    
	    if(B>0 && H>0)
	        flag =true;
	    else 
	        flag=false;
	}


public static void main(String[] args){
	if(flag){
		int area=B*H;
		System.out.print(area);
	}
		else{
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
}//end of main

//end of class

