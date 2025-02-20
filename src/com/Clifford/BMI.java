package com.Clifford;

import java.util.Scanner;

public class BMI {
    public static void Calculator() {
        Scanner scanner=new Scanner(System.in);

        int weight=0,height=0;
        System.out.print("Enter your weight in kilograms(kg):");
        weight=scanner.nextInt();
        String status="Body Mass Index(BMI) status= ";

        System.out.println("Enter your height in meters(m):");
        height=scanner.nextInt();
       int index= weight/(height*height);

        System.out.println("Your Body Mass Index(BMI) is "+ index);

        if (index<18.5)
            System.out.println(status+ "Underweight");
//        else if (18.5=<index<25.0)
//            System.out.println(status+ "Normal");
//        else if (25.0=<index<30)
//            System.out.println(status+ "Overweight");
//        else if (30=<index)
//            System.out.println(status+ "Overweight");



    }
}
