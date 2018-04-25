package com.maria.rajeev;

import java.util.Arrays;

public class DRoot {
	public static void main(String args[]){
		int rd=digital_root(5436537);
	      if(rd<10){
	    	  System.out.println(rd);
	      }
	      else
	    	  System.out.println(digital_root(rd));
	    	     
	}
	 public static int digital_root(int n) {
		    int c=0;
		    while(n!=0){
		    		int i=n%10;
		    		int b=n/10;
		    		c=c+i;
		    		n=b; 
		    }
		    
		    return c;
		 }
}
