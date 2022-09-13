package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Values of the line X1 and Y1");
        System.out.println("Enter the value of X1 :  ");
        int X1 = scan.nextInt();
        System.out.println("Enter the value of Y1 :  ");
        int Y1 = scan.nextInt();
        System.out.println("Enter the Values of the line X2 and Y2");
        System.out.println("Enter the value of X2 :  ");
        int X2 = scan.nextInt();
        System.out.println("Enter the value of Y2 :  ");
        int Y2 = scan.nextInt();
        System.out.println("Enter the Values of the line A1 and B1");
        System.out.println("Enter the value of A1 :  ");
        int A1 = scan.nextInt();
        System.out.println("Enter the value of B1 :  ");
        int B1 = scan.nextInt();
        System.out.println("Enter the Values of the line A2 and B2");
        System.out.println("Enter the value of A2 :  ");
        int A2 = scan.nextInt();
        System.out.println("Enter the value of B2 :  ");
        int B2 = scan.nextInt();
        double length1 = Math.sqrt((X2 - X1) * (Y2 - Y1) + (Y2 - Y1) * (Y2 - Y1));
        double length2 = Math.sqrt((A2 - A1) * (B2 - B1) + (B2 - B1) * (B2 - B1));

        if ( length1 == length2 ) {
            System.out.println("Length of lines are equals .");
        }else
            System.out.println("LInes are not equals. ");

    }
}
