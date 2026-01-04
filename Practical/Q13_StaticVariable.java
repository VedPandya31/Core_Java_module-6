package com.Module1;

class SDemo
{
	static int sno;
	
	public static void show()
	{
		sno=123;
		System.out.println("Sno is..."+sno);
	}
}
public class Q13_StaticVariable 
{
	public static void main(String[] args) 
	{
		SDemo s1 = new SDemo();
		s1.sno=12;
		System.out.println("SNo is..."+s1.sno);
		
	}
}
