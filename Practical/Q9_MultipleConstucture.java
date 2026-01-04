package com.Module1;

class demo
{
	String sname;
	int age;
	
	public demo()
	{
		sname = "Unknown";
		age = 0;
	}
	public demo(String n)
	{
		sname = n;
		age = 0;
		
	}
	public demo(String n,int a)
	{
		sname = n;
		age = a;
	}
	void display()
	{
		System.out.println("SName is..."+sname);
		System.out.println("Age is..."+age);
	}
}

public class Q9_MultipleConstucture 
{
	public static void main(String[] args) 
	{
		demo d1 = new demo();
		demo d2 = new demo("Ved");
		demo d3 = new demo("ved",19);
		d1.display();
		d2.display();
		d3.display();
		
	}
}
