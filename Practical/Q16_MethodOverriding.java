package com.Module1;

class C
{
	public void display()
	{
		System.out.println("This is First Class");
	}
}
class B extends C
{
	public void dispaly()
	{
		System.out.println("This is Second Class");
	}
}
public class Q16_MethodOverriding 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.dispaly();
//		b1 = new B();
//		b1.display();
	}
}
