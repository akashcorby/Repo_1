package Neosoft_Java_Coding;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a no");
		 int b = s.nextInt();
		 
//		 int a = 5;
		 
         int fact=1;
         
         for(int i=1; i<=b; i++)
         {
        	 fact = fact * i ;
         }
         System.out.println(fact);
	}

}
