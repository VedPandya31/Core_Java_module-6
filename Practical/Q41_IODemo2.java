package com.Module1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Implement a file copy program using FileInputStream and FileOutputStream.

public class Q41_IODemo2 
{
	public static void main(String[] args) 
	{
		 try
	        {
	            FileInputStream fis = new FileInputStream("source.txt");
	            FileOutputStream fos = new FileOutputStream("destination.txt");

	            int data;
	            while ((data = fis.read()) != -1)
	            {
	                fos.write(data);
	            }

	            fis.close();
	            fos.close();

	            System.out.println("File copied successfully.");
	        }
	        catch (IOException e)
	        {
	            System.out.println(e);
	        }
	}
}
