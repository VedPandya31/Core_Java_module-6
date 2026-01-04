package com.Module1;

import java.util.Scanner;

//Write a program to read input from the console using Scanner

public class Q40_IODemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double per = sc.nextDouble();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + per);

        sc.close();
	}
}
