package com.Module1;

import java.util.Scanner;

public class Q20_StringMethods 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        // Using equals()
        if (s1.equals(s2)) 
        {
            System.out.println("Strings are equal using equals()");
        } 
        else 
        {
            System.out.println("Strings are NOT equal using equals()");
        }

        // Using compareTo()
        int result = s1.compareTo(s2);

        if (result == 0) 
        {
            System.out.println("Strings are equal using compareTo()");
        } 
        else if (result > 0) 
        {
            System.out.println("First string is greater than second string");
        } else 
        {
            System.out.println("First string is smaller than second string");
        }

        sc.close();
	}
}
