package com.Module1;

class Hierachy
{
	int hid;
	String hname;
	public void setHierachyData()
	{
		hid = 31;
		hname = "Ved";
	}
}

class H1 extends Hierachy
{
	int hage;
	String hsername;
	public void setH1Data() 
	{
		hage = 19;
		hsername = "Pandya";
	}
}
class H2 extends H1
{
	String hgame;
	public void setH2Data()
	{
		hgame = "Cricket";
	}
	public void display()
	{
		System.out.println("HID is..."+hid);
		System.out.println("HName is..."+hname);
		System.out.println("HAge is..."+hage);
		System.out.println("HSerName is..."+hsername);
		System.out.println("HGame is..."+hgame);
		
	}
}
public class Q15_Multilevel 
{
	public static void main(String[] args) 
	{
		H2 s1 = new H2();
		s1.setHierachyData();
		s1.setH1Data();
		s1.setH2Data();
		s1.display();
	}
}
