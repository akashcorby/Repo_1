package Neosoft_Java_Coding;

import java.util.TreeSet;

/*4) create arraylist having follwing values
[40,60,30,34,80,23,54,90,76]

and then sort values in asc order
Print sorted arraylist in console*/


public class ArrayList_Sorted_Order 
{

	public static void main(String[] args) 
	{
	  int[] a = {40,60,30,34,80,23,54,90,76}; 
	  TreeSet<Integer> b = new TreeSet<Integer>();
      for(int t:a)
      {
    	  b.add(t);
      }
      System.out.println("Numbers in shorted order:- "+b);
	}

}
