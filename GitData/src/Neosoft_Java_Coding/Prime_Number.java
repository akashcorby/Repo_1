package Neosoft_Java_Coding;

import java.util.Scanner;

public class Prime_Number 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int p = s.nextInt();
		
				int a = p;
				if(a%2==0)
				{
					System.out.println("prime:- "+a);
				}
				else
				{
					System.out.println("Is not:- "+a);
				}
			
		
//		int [] p = {1,7,20,7,15,31,48};
//		for(int i=0; i<p.length; i++)
//		{
//			int a = p[i];
//			if(a%2==0)
//			{
//				System.out.println("prime:- "+a);
//			}
//			else
//			{
//				System.out.println("Is not:- "+a);
//			}
//		}
	}

}
