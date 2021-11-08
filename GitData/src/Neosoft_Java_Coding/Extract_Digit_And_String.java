package Neosoft_Java_Coding;

public class Extract_Digit_And_String 
{

	public static void main(String[] args) 
	{
		String s1="James Bond 007 sandip 007";
		
		char[] c = s1.toCharArray();
		
		System.out.print("String are:- [");
        for(char u : c)
        {
        	if(Character.isLetter(u))
        	{
        		System.out.print(u);
        	}
        }
        System.out.println("]");
   //------------------------------------------------------     
        System.out.print("Integer are:- [");
        for(char v : c)
        {
        	if(Character.isDigit(v))
        	{
        		System.out.print(v);
        	}
        }
        System.out.println("]");
	}

}
