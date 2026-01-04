package com.Module1;

class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q21_Runtime_Poly 
{
	public static void main(String[] args) 
	{	
		 Animal1 a = new Dog1();

	        // Runtime polymorphism
	        a.sound();
	}
}
