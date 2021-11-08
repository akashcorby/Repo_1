package Neosoft_Java_Coding;

import java.util.HashMap;
import java.util.Map;

public class asdf 
{

	public static void main(String[] args) 
	{
		String s = "Akash Faharan sandip";

		String[] d = s.split(" ");
		System.out.println(d.length);
		
        char[] c = s.toCharArray();
		
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
		}
		

	}


