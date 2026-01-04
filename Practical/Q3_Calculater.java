package com.Module1;

public class Q3_Calculater
{
	public static void main(String[] args)
	{
		int a,b;
		a=10;
		b=5;
		
//		Arithmatic Operator
		
		System.out.println("Arithmatic Operator...\n");
		System.out.println("Addition is..."+(a+b));
		System.out.println("Subtraction is..."+(a-b));
		System.out.println("Multiplication is..."+(a*b));
		System.out.println("Division is..."+(a/b));
		System.out.println("Modules is..."+(a%b));
		
//		Relational Operator
		System.out.println("\nRelational Operator...");
		System.out.println("num1 == num2:"+(a==b));
		System.out.println("num1 != num2:"+(a!=b));
		System.out.println("num1 < num2:"+(a<b));
		System.out.println("num1 > num2:"+(a>b));
		System.out.println("num1 <= num2:"+(a<=b));
		System.out.println("num1 >= num2:"+(a>=b));
	}
}
