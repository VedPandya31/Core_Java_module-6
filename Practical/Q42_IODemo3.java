package com.Module1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Create a program that reads from one file and writes the content to another file

public class Q42_IODemo3 
{
	public static void main(String[] args) 
	{
		try
        {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");

            int ch;
            while ((ch = fr.read()) != -1)
            {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("Content copied successfully.");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
	}
}
