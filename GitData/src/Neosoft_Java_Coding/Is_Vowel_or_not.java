package Neosoft_Java_Coding;

import java.util.Scanner;

public class Is_Vowel_or_not 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.next();
		System.out.println("Is string contains vowel ? ");
		System.out.println(str.toLowerCase().matches(".*[aeiou].*"));	
	}

}
