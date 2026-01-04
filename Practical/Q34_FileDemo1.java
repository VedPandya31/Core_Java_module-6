package com.Module1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q34_FileDemo1 
{
	public static void main(String[] args) 
	{
		 try
	        {
	            // Writing to file
	            FileWriter fw = new FileWriter("sample.txt");
	            fw.write("Hello World\n");
	            fw.write("This is FileReader and FileWriter example.");
	            fw.close();

	            // Reading from file
	            FileReader fr = new FileReader("sample.txt");
	            int ch;

	            while ((ch = fr.read()) != -1)
	            {
	                System.out.print((char) ch);
	            }
	            fr.close();
	        }
	        catch (IOException e)
	        {
	            System.out.println(e);
	        }
	}
}
