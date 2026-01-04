package com.Module1;

class Demo1 implements Printable, Showable {

    // Implementing Printable interface method
    public void print() {
        System.out.println("Printing data...");
    }

    // Implementing Showable interface method
    public void show() {
        System.out.println("Showing data...");
    }
}
public class Q24_MutipleInheritence 
{
	public static void main(String[] args) 
	{
		Demo1 d = new Demo1();

        d.print();
        d.show();
	}
}
