package com.Clifford;

import java.util.Scanner;

public class BMI {
    public static void Calculator() {
        Scanner scanner=new Scanner(System.in);

        int weight=0,height=0,index=0;
        System.out.print("Enter your weight in kilograms(kg):");
        weight=scanner.nextInt();

        System.out.println("Enter your height in meters(m):");
        height=scanner.nextInt();
        index= weight/(height*height);

        System.out.println("");
    }
}
