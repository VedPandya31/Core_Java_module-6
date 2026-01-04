package com.Module1;

public class Q27_Demo1 
{
	public int a = 10;          // public
    protected int b = 20;       // protected
    int c = 30;                 // default
    private int d = 40;         // private

    public void show() {
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }
}
