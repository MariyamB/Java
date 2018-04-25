package com.plurasight.getoraganized;

public class Main {

    public static void main(String[] args) {
        int students=50;
        int room=0;
        if(room>0 && students/room>30)
            System.out.println("Crowded");
        else
            System.out.println("Not Crowded");
    }
}
