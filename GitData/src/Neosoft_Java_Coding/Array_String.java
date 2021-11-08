package Neosoft_Java_Coding;

/*Create arraylist having following values
["Mumbai","Pune","Nagpur","Nashik","Kolhapur"] - citiesInMaharashtra

create another having following values
["Indore","Bhopal","Ujjain"] - citiesInMP

then create anotherone having values from bothe the list
["Mumbai","Pune","Nagpur","Nashik","Kolhapur","Indore","Bhopal","Ujjain"] - citiesIndia*/

import java.util.ArrayList;

public class Array_String 
{

	public static void main(String[] args) 
	{
	   ArrayList<String> a = new ArrayList<String>();
	   a.add("Mumbai");
	   a.add("Pune");
	   a.add("Nagpur");
	   a.add("Nashik");
	   a.add("Kolhapur");
	   System.out.println("Cities in Maharastra are :- "+a);
	   
	   ArrayList<String> b = new ArrayList<String>();
	   b.add("Indore");
	   b.add("Bhopal");
	   b.add("Ujjain");
	   System.out.println("Cities in MP are :- "+b);
	   
	   ArrayList<String> c = new ArrayList<String>();
	   c.addAll(a);
	   c.addAll(b);
	   System.out.println("Cities in india:- "+c);
	   
	}

}
