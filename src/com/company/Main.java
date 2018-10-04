package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Defining number and total
        int num ;
        int total = 0;

        //calculating the total of 10 inputs
        Scanner keyboard=new Scanner(System.in);
        for(int i=1 ; i<=10 ; i++){
            System.out.println("Enter number" + " " + i);
            int b = keyboard.nextInt();
            total= total + b ;
        }
        System.out.println( "The total is . " +total );
	// write your code here
    }
}
