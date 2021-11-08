package Neosoft_Java_Coding;

import java.util.Scanner;

//3) Check if array contains a number in Java?
//Hint: Your method should accept 2 parameters. Input array and number.
//i/p :- arr[] = {2,5,9,7,4,6}
//number :- 8
//o/p :- number is not in arr.

public class Array_Contain_Specific_Num 
{
	
	public void compare(int[] arr, int b )
	{
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==b)
			{
				System.out.println("Element is found :-"+arr[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an array size");	
		int a=s.nextInt();
		int[] arr = new int[a];
		for(int i=0; i<=a-1; i++)
		{
			arr[i]=s.nextInt();
		}
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter an searching number");	
		int b=s.nextInt();
		
		Array_Contain_Specific_Num   n =new   Array_Contain_Specific_Num ();
		n.compare(arr, b);
		
	}

}
