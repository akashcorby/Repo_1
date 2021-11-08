package Neosoft_Java_Coding;

import java.util.Scanner;

/*
 * 4) Write a program to print the sum of squares of the elements of an array of size N. N can be any 
integer between 1 and 100. 1≤N≤100
Sample Input
N = 5
Array = 4 7 2 8 5
Sample Output:
158
 */
public class Array_2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number that you want to add in an array:- ");	
		int n=s.nextInt();//3
		int sum=0;
		int m=0;
		System.out.println("Now enter a number:-");
		for(int i=0; i<=n-1; i++)
		{
			int a=s.nextInt();
			m=a*a;//m=4
			sum = sum + m;//it will take number//4
		}
		System.out.println(sum); 
	}

}
