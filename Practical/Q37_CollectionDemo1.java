package com.Module1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q37_CollectionDemo1 
{
	public static void main(String[] args) 
	{
		// ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList Elements:");
        for (String lang : arrayList)
        {
            System.out.println(lang);
        }

        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("HTML");
        linkedList.add("CSS");
        linkedList.add("JavaScript");

        System.out.println("\nLinkedList Elements:");
        for (String tech : linkedList)
        {
            System.out.println(tech);
        }
	}
}
