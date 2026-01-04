package com.Module1;

public class Q27_Demo2 
{
	public static void main(String[] args) 
	{
		Q27_Demo1 obj = new Q27_Demo1();

        System.out.println(obj.a); // public ✔
        System.out.println(obj.b); // protected ✔
        System.out.println(obj.c); // default ✔
        // System.out.println(obj.d); // private ❌
	}
}
