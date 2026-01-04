package com.Module1;

abstract class Shape 
{
	// Abstract method
    abstract void draw();

    // Normal method
    void show() 
    {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape 
{
    // Implementing abstract method
    void draw() 
    {
        System.out.println("Drawing a circle");
    }
}

public class Q23_AbstractKeyword 
{
	public static void main(String[] args) 
	{
		 Shape s = new Circle(); // reference of abstract class
	     s.show();
	     s.draw();
	}
}
