package Neosoft_Java_Coding;

import java.util.Scanner;
/*
 * 3) Write a program to print the sum of all the elements of an array of size N where N can be any 
integer between 1 and 100. 1≤N≤100
Sample Input:
N = 3
Array = 6 3 8
Sample Output:
17
 */
public class Array_1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number that you want to add in an array:- ");	
		int n=s.nextInt();//3
		int sum=0;
		System.out.println("Now enter a number:-");
		for(int i=0; i<=n-1; i++)
		{
			sum = sum+s.nextInt();//it will take number
		}
		System.out.println(sum);
	}
}
