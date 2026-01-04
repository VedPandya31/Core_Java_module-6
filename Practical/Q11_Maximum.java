package com.Module1;
import java.util.Scanner;

public class Q11_Maximum {

    static int findMax(int a, int b, int c) 
    {
        int max = a;

        if(b > max) 
        {
            max = b;
        }
        if(c > max) 
        {
            max = c;
        }

        return max;
    }

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        int max = findMax(n1, n2, n3);

        System.out.println("Maximum number is: " + max);
    }
}