package com.maria.rajeev;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class eof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings");
        int i=1;
        while(sc.hasNextLine()){
        System.out.println(i+" "+sc.nextLine());
        i++;
        }
    }
}
