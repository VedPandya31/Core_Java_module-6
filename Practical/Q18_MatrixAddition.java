package com.Module1;

import java.util.Scanner;

public class Q18_MatrixAddition 
{
	public static void main(String[] args) 
	{
		int r, c;
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int add[][] = new int[r][c];
        int sub[][] = new int[r][c];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                add[i][j] = a[i][j] + b[i][j];
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        // Display Addition
        System.out.println("Matrix Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        // Display Subtraction
        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
	}
}
