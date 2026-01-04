package com.Module1;

import java.util.HashMap;

//Create a HashMap to store and retrieve key-value pairs

public class Q39_CollectionDemo3 
{
	public static void main(String[] args) 
	{
        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Store key-value pairs
        map.put(101, "Rudray");
        map.put(102, "Raj");
        map.put(103, "Ved");

        // Retrieve values using keys
        System.out.println("Student with ID 101: " + map.get(101));
        System.out.println("Student with ID 102: " + map.get(102));

        // Display all key-value pairs
        System.out.println("\nAll Entries:");
        for (Integer key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }

	}
}
