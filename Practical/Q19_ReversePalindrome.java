package com.Module1;

import java.util.Scanner;

public class Q19_ReversePalindrome 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.next();

	        String rev = "";

	        // Reverse the string
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        System.out.println("Reversed String: " + rev);

	        // Palindrome check
	        if (str.equals(rev)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }

	        sc.close();
	}
}
