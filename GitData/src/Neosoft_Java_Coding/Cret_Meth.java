package Neosoft_Java_Coding;

import java.util.ArrayList;

/*7)Define a method which takes integer array as a parameter and returns true if that array contains integer 2 or 3, returns false otherwise: e.g. 
has23([2, 5, 6, 3]) → true
has23([4, 3]) → true
has23([4, 5, 7]) → false*/


public class Cret_Meth 
{

	
	
	public void m1(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			int b=a[i];
			System.out.println(b);
			if(b==2 || b==3)
			{	
			    System.out.println("true");
			}
			else
			{
				System.out.println("false");	
			}
			//break;
		}
	}

	public static void main(String[] args) 
	{
		int[] a= {2,5,6,3,4,7};
		Cret_Meth c = new Cret_Meth();
		c.m1(a);
	}	

}
