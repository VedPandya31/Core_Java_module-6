package com.Module1;

class Vehicle {

    Vehicle() 
    {
        System.out.println("Vehicle class constructor called");
    }

    void info() {
        System.out.println("This is Vehicle class method");
    }
}

class Car extends Vehicle 
{

    Car() 
    {
        super();   // calls Vehicle constructor
        System.out.println("Car class constructor called");
    }

    void show() 
    {
        super.info();   // calls Vehicle method
        System.out.println("This is Car class method");
    }
}

public class Q22_SuperKeyword 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
        c.show();
	}
}
