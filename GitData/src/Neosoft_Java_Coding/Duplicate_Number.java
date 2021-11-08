package Neosoft_Java_Coding;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate_Number 
{

	public static void main(String[] args) 
	{
		int [] s = {90, 34, 7, 99, 10,7,34,90};
		 System.out.print("Duplicates num:- [");
		 for(int i=0; i<=s.length-1; i++)
		 {
			 for(int j=i+1; j<=s.length-1; j++)
			 {
				 if(s[i]==s[j])
				 {
					System.out.print(" "+s[j]+" "); 
				 }
			 }
		 }
		 System.out.println("]");
	}

}
