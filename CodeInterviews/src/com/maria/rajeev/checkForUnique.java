package com.maria.rajeev;

public class checkForUnique {
	
	public static void main(String[] args)
	{
		checkForUnique i= new checkForUnique();
	   System.out.println(i.checkForUnique("Maria"));
	   

	}
	public static boolean checkForUnique(String str){
	    boolean containsUnique = false;

	    for(char c : str.toCharArray()){
	        if(str.indexOf(c) == str.lastIndexOf(c)){
	            containsUnique = true;
	        } else {
	            containsUnique = false;
	        }
	    }

	    return containsUnique;
	}

}
