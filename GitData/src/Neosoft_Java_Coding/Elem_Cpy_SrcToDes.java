package Neosoft_Java_Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elem_Cpy_SrcToDes 
{

	public static void main(String[] args) 
	{
		int [] d = new int[6];
		d[0]=4;
		d[1]=9;
		d[2]=5;
		d[3]=2;
		d[4]=7;
		d[5]=6;
		
		System.out.print("Integer array are:- [");
		for(int i:d)//for-each loop
		{
			System.out.print(" "+i+" ");
		}
		System.out.println("]");
		
		
		ArrayList<Integer> src = new ArrayList<Integer>(6);
		src.add(4);
		src.add(9);
		src.add(5);
		src.add(2);
		src.add(7);
		src.add(6);
		System.out.println("Source Array number are:- "+src);
		
		ArrayList<Integer> des = new ArrayList<Integer>(12);
	    des.addAll(src);
	    System.out.println("Destination Array number are:- "+des);
	}

}
