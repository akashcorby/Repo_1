package Neosoft_Java_Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*2) Given the folloiwng string
String myString="I am working at Neosoft. Neosoft Technologies Ltd is a CMM level 5 company. Neosoft has offices in Mumbai, pune and Noida.
It's a service based company."

Write a program to count no of words in given string and also count for the word 'Neosoft'*/

//_________________KEY______________________VALUE__________________
//   Akash                       |            1 + 1= 2
//   Kumar                       |            1 + 1= 2
//   Pradhan                     |            1 + 1= 2 + 1= 3



public class String_Count_and_Word_Neosoft 
{

	public static void main(String[] args) //String[] args;
	{
		//String s = "I am working at Neosoft. Neosoft Technologies Ltd is a CMM level 5 company. Neosoft has offices in Mumbai, pune and Noida.";
		String s="Akash Kumar Pradhan Kumar Pradhan Pradhan";
		int a=s.length();
		System.out.println("Length of regular string:-"+a);
		//System.out.println(s.contains("Neosoft"));
		
		String[] w = s.split("\\s+");
		System.out.println("Number of word in a string:- "+w.length);
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(String n : w)
		{
		     if(m.get(n)==null)
		     {
		        m.put(n, 1); 
		     } 
		     else
		     {
		    	m.put(n, m.get(n)+1);
		     }
		        
		}
		System.out.println("Number of repetive string:- "+m);
		
//--------------------------------------------------------------------------------------------
		
	    char[] c = s.toCharArray();//it will take one by one character from given string
		
		Map<Character,Integer> x = new HashMap<Character,Integer>();
		
		for(char y : c)
		{
			if(x.get(y)==null)
			{
				x.put(y, 1);
			}
			else 
			{
				x.put(y, x.get(y)+1);
			}
		}
		System.out.println(x);
		
//------------------------------------------------------------------------------------------------
		//Count the number of -(letter, space, num, other, lenght)- of a given string
//		char ch[];
//		String str;
//		int letter=0,space=0,num=0,other=0,length;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter data");
//		str= sc.nextLine();
//		ch= str.toCharArray();
//		length= str.length();
		
		int letter=0,space=0,num=0,other=0,length;
		char[] ch =s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("letters:- "+letter + "Number:- "+num + "Spaces:- "+space + "others:- "+other);
		
//------------------------------------------------------------------------------------------------------------
		
		int Total;
		Total=s.length();
		System.out.println("Total lenght is" +Total);
		int Total1=s.replace("h", "").length();
		int count=Total-Total1;
		System.out.println("Number of occurence of h character:-"+count);
		
	}

}




/*System.out.print("Number of word string:- [");

int count= 1;
for(int i=0; i<s.length(); i++)
{
   if((s.charAt(i)== ' ') && (s.charAt(i+1)!=' '))
   {
	   count++;
   }
}
System.out.print(count);

System.out.println("]");*/
