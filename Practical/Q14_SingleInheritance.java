package com.Module1;

class Student
{
	int sid;
	String sname,scity;
	public void setStudentData()
	{
		sid = 1;
		sname = "Ved";
		scity = "HMT";
	}
}
class Sport extends Student
{
	String spname;
	public void setSportData()
	{
		spname = "Cricket";
	}
	public void display()
	{
		System.out.println("SID is..."+sid);
		System.out.println("SName is..."+sname);
		System.out.println("SCity is..."+scity);
		System.out.println("Sport Name is..."+spname);
	}
}
public class Q14_SingleInheritance 
{
	public static void main(String[] args) 
	{
		Sport s1 = new Sport();
		s1.setStudentData();
		s1.setSportData();
		s1.display();
	}
}
