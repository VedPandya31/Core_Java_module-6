package com.Module1;

import java.util.Scanner;

public class Q29_ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   // may cause ArithmeticException
            System.out.println("Result = " + result);

            int[] arr = new int[3];
            arr[5] = 10;          // may cause ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of range.");
        }
        catch (Exception e)
        {
            System.out.println("Error: Some other exception occurred.");
        }
        finally
        {
            System.out.println("Finally block executed.");
            sc.close();
        }


	}
}
