package com.Module1;

import java.util.ArrayList;
import java.util.HashSet;

// Implement a program using HashSet to remove duplicate elements from a list

public class Q38_CollectionDemo2 
{
	public static void main(String[] args) 
	{
		// Create a list with duplicate elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Original List: " + list);

        // Remove duplicates using HashSet
        HashSet<Integer> set = new HashSet<>(list);

        // Convert back to ArrayList
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + uniqueList);
	}
}
