package com.Module1;

public class Q4_TypeCasting 
{
	public static void main(String[] args) 
	{
		int i1=123;
		long l1;
		
		l1=i1;//implicit
		System.out.println("Implict int To long is..."+l1);
		
		int a1;
		a1=(int)l1;//explicit
		System.out.println("Expilicit long To int is..."+a1);
	}
}
