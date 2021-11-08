package Neosoft_Java_Coding;

import java.util.Scanner;

public class Sum_Of_Digit 
{

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a no");
		 int sum=0;
		 for(int i=0; i<=3; i++)
		 {
			 int b = s.nextInt();
			 sum = sum + b;
		 }
		 System.out.println(sum);
	}

}
