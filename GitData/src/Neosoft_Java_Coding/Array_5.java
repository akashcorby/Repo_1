package Neosoft_Java_Coding;

import java.util.Scanner;

public class Array_5 
{

//	public static void main(String[] args) 
//	{
//		//1) Write a program to print the sum of two integers.
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter No for 'a':- ");	
//		int a=s.nextInt();    
//		System.out.println("Enter No for 'b':- ");	
//		int b=s.nextInt();
//		
//		int c=0;
//		c=a+b;
//		
//		System.out.println("Sum of 2 numbers are:-"+c);
//	}
	
	public static void main(String[] args) 
	{
		int[] a = new int[4];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		
		System.out.println("Array Length is :-"+a.length);
		
		int sum=0;
		for(int i=0; i<a.length; i++)//0<4//1<4//2<4//3<4//4<4
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array are:-"+sum);
	}

}
