package com.Module1;

class Demo
{
	int add (int a, int b)
	{
		return a + b;
	}
	double add (double a, double b)
	{
		return a + b;
	}
	int add (int a, int b, int c)
	{
		return a + b +c;
	}
	String add (String a, String b)
	{
		return a + b;
	}
}

public class Q12_MethodOverloading 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		
		System.out.println("Add is..."+d1.add(10, 20));
		System.out.println("Add is..."+d1.add(10.1000, 200.6154));
		System.out.println("Add is..."+d1.add(10, 20,30));
		System.out.println("Add is..."+d1.add("Ved", "Pandya"));
	}
}
