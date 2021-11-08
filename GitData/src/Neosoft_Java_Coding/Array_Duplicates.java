package Neosoft_Java_Coding;

/*i) Given elements in the array

int[] array=new array[] {2,6,9,10,50,60,80,50,9,34,2}

Find duplicate elements in the array

and store duplicate elements in arraylist. Print values in console. */

import java.util.ArrayList;

public class Array_Duplicates 
{

	public static void main(String[] args) 
	{
       
		 int [] s =  {2,6,9,10,50,60,80,50,9,34,2};
		 
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 for(int i=0; i<s.length; i++)
		 {
			 for(int j=i+1; j<s.length; j++)
			 {
				 if(s[i]==s[j])
				 {
                   a.add(s[j]);
				 }
				 
			 }
		 }
		 System.out.print("The duplicate array is:- "+a);
        
	}

}
