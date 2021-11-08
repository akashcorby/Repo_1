package Neosoft_Java_Coding;

import java.util.Scanner;

public class Enum_Year 
{
	
	Enum_Month o;
	
	public Enum_Year(Enum_Month o) 
	{
		this.o = o;
	}

	public void  Month()
	{
		switch(o)
		{
		case JANUARY:
		    System.out.println("It's not a summer month in india");
		    break;
		
		case FEBRUARY:
			System.out.println("It's not a summer month in india");
			break;
			
		case MARCH:
			System.out.println("It's a summer month in India");
			break;
			
		case APRIL:
			System.out.println("It's a summer month in India");
			break;
			
		case MAY:
			System.out.println("It's a summer month in India");
			break;
			
		case JUNE:
			System.out.println("It's not a summer month in india");
			break;
			
		case JULY:
			System.out.println("It's not a summer month in india");
			break;
			
		case AUGUST:
			System.out.println("It's not a summer month in india");
			break;
			
		case SEPTEMBER:
			System.out.println("It's not a summer month in india");
			break;
			
		case OCTOBER:
			System.out.println("It's not a summer month in india");
			break;
			
		case NOVEMBER:
			System.out.println("It's not a summer month in india");
			break;
			
		case DECEMBER:
			System.out.println("It's not a summer month in india");
			break;
		}
	}
	
	public static void main(String[] args) 
	{
		Enum_Year e = new Enum_Year(Enum_Month.NOVEMBER);
		e.Month();
		
		Enum_Year e1 = new Enum_Year(Enum_Month.FEBRUARY);
		e1.Month();
		
	}

}
