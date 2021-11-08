package Neosoft_Java_Coding;

import java.util.ArrayList;

/*(3):- create arraylist having follwing values
[40,60,30,34,80,23,54,90,76]

Return the same arrayList which contains values greater than 50*/


public class ArrayList_Greater_than_50 
{
    
	public static void main(String[] args) 
	{
	 ArrayList<Integer> a = new ArrayList<Integer>();
	 a.add(40);
	 a.add(60);
	 a.add(30);
	 a.add(34);
	 a.add(80);
	 a.add(23);
	 a.add(54);
	 a.add(90);
	 a.add(76);
	 System.out.println("ArrayList number is :- "+a);
	 
	 
	 System.out.print("Number greater than 50 :- [");
	 int b = 50;
	 for(int i = 0; i<a.size(); i++)
	 {
		if(a.get(i)>b)
		{
			System.out.print(" "+a.get(i)+" ");
		}
	 }
	 System.out.println("]");

	}

}
