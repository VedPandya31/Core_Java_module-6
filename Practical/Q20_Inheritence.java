package com.Module1;

class Person1 
{
    void showPerson() 
    {
        System.out.println("I am a Person 1");
    }
}

// Child class
class Person2 extends Person1 
{
    void showStudent() 
    {
        System.out.println("I am a Person 2");
    }
}

public class Q20_Inheritence 
{
	public static void main(String[] args) 
	{
		 Person2 s = new Person2();

	        // Accessing parent class method
	        s.showPerson();

	        // Accessing child class method
	        s.showStudent();
	}
}
