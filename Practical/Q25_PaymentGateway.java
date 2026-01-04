package com.Module1;

import java.util.Scanner;

//Interface
interface PaymentGateway 
{
	void makePayment(double amount);
}

//UPI Payment class
class UPIPayment implements PaymentGateway 
{
	public void makePayment(double amount) 
	{
		System.out.println("Payment of ₹" + amount + " made using UPI.");
	}
}

//Credit Card Payment class
class CreditCardPayment implements PaymentGateway 
{
	public void makePayment(double amount) 
	{
		System.out.println("Payment of ₹" + amount + " made using Credit Card.");
	}
}

//Main class (ONLY this is public)
public class Q25_PaymentGateway 
{
	public static void main(String[] args) 
	{
     
		Scanner sc = new Scanner(System.in);

	     System.out.print("Enter amount: ");
	     double amount = sc.nextDouble();
	
	     System.out.println("1. UPI");
	     System.out.println("2. Credit Card");
	     System.out.print("Choose payment method: ");
	     int choice = sc.nextInt();
	
	     PaymentGateway payment;
	
	     if (choice == 1)
	         payment = new UPIPayment();
	     else
	         payment = new CreditCardPayment();
	
	     payment.makePayment(amount);
	
	     sc.close();
	}
}
