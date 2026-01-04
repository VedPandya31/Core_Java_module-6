package com.Module1;

class student
{
	String sname;
	int sage;
	public void setData()
	{
		sname="Ved Pandya";
		sage=19;
		
	}
	public void Dispaly()
	{
		System.out.println("SName is..."+sname);
		System.out.println("SAge is..."+sage);
	}
}

public class Q8_StudentClass
{
	public static void main(String[] args) 
	{
		student s1 = new student();
		s1.setData();
		s1.Dispaly();
	}
}
