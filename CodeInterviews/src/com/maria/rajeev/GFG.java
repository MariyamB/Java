package com.maria.rajeev;

//JAVA code to find the first element
//that appears even number times
import java.util.*;
class GFG {
 public static int firstEven(int arr[], int n)
 {

     HashMap<Integer, Integer> map = 
              new HashMap<Integer, Integer>();

     for (int i = 0; i < n; i++) {

         // first time occurred
         if (map.get(arr[i]) == null) 
             map.put(arr[i], 1);
          
         // toggle for repeated occurrence
         else {
        	     int count=map.get(arr[i])+1;
                 map.put(arr[i],count);
         }
     }

     int j = 0;
     for (j = 0; j < n; j++) {

         // first integer with true value
         if (map.get(arr[j]) %2 ==0)
             break;
         
     }

     return arr[j];
 }

 // Driver code
 public static void main(String[] args)
 {
     int arr[] = { 4, 4, 4, 8, 6, 6 };
     int n = arr.length;
     System.out.println(firstEven(arr, n));
 }
}