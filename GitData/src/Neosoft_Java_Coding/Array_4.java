package Neosoft_Java_Coding;

import java.util.Scanner;
/*
 * 6) Write a program to add the corresponding elements of two arrays, each of size N and print the 
sums. N can be any integer between 1 and 100. 1≤N≤100
 
 Sample Input: N= 3
numArrayA = 3 9 8
numArrayB = 8 12 74
 Sample Output:
 11 21 82
 */
public class Array_4 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array you want to enter:- ");	
		int n=s.nextInt();
		
		int[] arr1 = new int[n];
		System.out.println("Enter arr1 number:- ");
		for(int i=0; i<=n-1; i++)
		{
			arr1[i]=s.nextInt();
		}
		
		int[] arr2 = new int[n];
		System.out.println("Enter arr2 number:- ");
		for(int i=0; i<=n-1; i++)
		{
			arr2[i]=s.nextInt();
		}
		
		int[] sum = new int[n];
		for(int i=0; i<=n-1; i++)
		{
			sum[i]=arr1[i]+arr2[i];
		}
		
		for(int t :sum)
		{
			System.out.print(t+",");
		}
	}

}
