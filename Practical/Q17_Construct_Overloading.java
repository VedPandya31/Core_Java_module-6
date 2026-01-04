package com.Module1;

class Student3 {
    int id;
    String name;
    double percentage;

    // Constructor with int parameter
    Student3(int i) {
        id = i;
        name = "Not Assigned";
        percentage = 0.0;
    }

    // Constructor with int and String parameters
    Student3(int i, String n) {
        id = i;
        name = n;
        percentage = 0.0;
    }

    // Constructor with int, String and double parameters
    Student3(int i, String n, double p) {
        id = i;
        name = n;
        percentage = p;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("---------------------");
    }
}

public class Q17_Construct_Overloading 
{
	public static void main(String[] args) 
	{
		Student3 s1 = new Student3(101);
        Student3 s2 = new Student3(102, "Ved");
        Student3 s3 = new Student3(103, "Rudray", 88.5);

        s1.display();
        s2.display();
        s3.display();
	}
}
