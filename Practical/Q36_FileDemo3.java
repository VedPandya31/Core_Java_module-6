package com.Module1;
import java.io.*;

//Serializable class
class Students implements Serializable
{
 int id;
 String name;

 Students(int id, String name)
 {
     this.id = id;
     this.name = name;
 }

 void display()
 {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
 }
}

public class Q36_FileDemo3 
{
	public static void main(String[] args) 
	{
		try
        {
            // ----- Serialization -----
            Students s1 = new Students(101, "Rudray");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object Serialized");

            // ----- Deserialization -----
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Students s2 = (Students) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Object Deserialized");
            s2.display();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
	}
}
