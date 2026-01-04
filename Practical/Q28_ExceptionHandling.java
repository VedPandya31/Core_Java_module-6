package com.Module1;

public class Q28_ExceptionHandling 
{
	public static void main(String[] args) 
	{
		int a = 10;
        int b = 0;

        try {
            // Code that may cause an exception
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Division by zero is not allowed");
        }
        finally {
            // This block always executes
            System.out.println("Program execution completed");
        }
	}
}
