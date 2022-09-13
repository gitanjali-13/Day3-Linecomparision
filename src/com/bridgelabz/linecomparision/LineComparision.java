package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Values of the line X1 and X2");
        System.out.println("Enter the value of X1 :  ");
        int X1 = scan.nextInt();
        System.out.println("Enter the value of Y1 :  ");
        int Y1 = scan.nextInt();
        System.out.println("Enter the Values of the line Y1 and Y2");
        System.out.println("Enter the value of X2 :  ");
        int X2 = scan.nextInt();
        System.out.println("Enter the value of Y2 :  ");
        int Y2 = scan.nextInt();
        System.out.println("Enter the Values of the line X1 and X2");
        double length1 = Math.sqrt((X2 - X1) * (Y2 - Y1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.println("Length of line is" +length1);



    }
}
