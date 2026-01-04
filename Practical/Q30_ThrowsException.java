package com.Module1;

import java.util.Scanner;

public class Q30_ThrowsException 
{
    // Method that throws custom exception
    static void checkAge(int age) throws Exception
    {
        if (age < 18)
        {
            throw new Exception("Age must be 18 or above");
        }
        else
        {
            System.out.println("You are eligible.");
        }
    }

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		try {
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        checkAge(age);
	    }
	    catch (Exception e) {
	        System.out.println("Custom Exception: " + e.getMessage());
	    }
	    finally {
	        sc.close();
	    }
	}
}
