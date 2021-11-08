package Neosoft_Java_Coding;

import java.util.Scanner;
/*
 * 5) Write a program to list all the integers between two integers L and R (including L and R). L and R 
can be any integer between 1 and 100. 1≤L,R≤100.
 Sample Input:
 L = 5, R = 10
 Sample Output:
 5 6 7 8 9 10
 */
public class Array_3 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number for L :-");
		int L = s.nextInt();
		System.out.println("Enter number for R :-");
		int R = s.nextInt();
		
		for(int i=L; i<=R; i++)
		{
			System.out.println(i);
		}
	}

}
