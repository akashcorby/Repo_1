package Neosoft_Java_Coding;

import java.util.ArrayList;

public final class Array_String_Update
{

	public static void main(String[] args) 
	{
		   final ArrayList<String> a = new ArrayList<String>();// if we declare "final" key word in an ArrayList then we can able to (add and remove) 
		   a.add("Mumbai");                                    //but we can not able to assigned one reference variable to other
		   a.add("Pune");
		   a.add("Nagpur");
		   a.add("Nashik");
		   a.add("Kolhapur");
		   System.out.println("Cities in Maharastra are :- "+a);
		   
		   ArrayList<String> b = new ArrayList<String>();
		   b.add("Kanpur");
		   b.add("Lucknow");
		   b.add("Gorakhpur");
		   System.out.println("Cities in Uttar Pradesh are :- "+b);
		   
		  //a=b;//it will give error
		  //b=a;//it will not generates error
		   
		   ArrayList<String> c = new ArrayList<String>();
		   c.addAll(a);
		   c.addAll(b);
		   //c=a;
		   //c=b;
		   System.out.println("Cities in India:- "+c);
		   
		   ArrayList<String> d = new ArrayList<String>();
		   d=c;
		   System.out.println(d);
	}

}
