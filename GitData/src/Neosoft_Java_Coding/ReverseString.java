package Neosoft_Java_Coding;

public class ReverseString 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		 String s = "I am learning java programming";
		 
		 int s1= s.length();
		 System.out.println(s1);
		 
		 System.out.println("String in normal order:- ["+ s +"] ");
		 
		 System.out.print("String in reverse order:- [");
		 for(int i=s1-1; i>=0; i--)
		 {
			    System.out.print(s.charAt(i));//charAt//length
		 }
		 System.out.println("]");
		 
		 System.out.println();
		 
//-------------------------------------------------------------------------------
		 
		 String[] w = s.split(" ");
		 System.out.println(w.length);
		 
		 System.out.print("Is Word in a reverse order:- [");
		 for(String a : w)
		 {
			a=a+" ";
			char[] b = a.toCharArray();
			for(int i=b.length-1; i>=0; i--)
			{
				System.out.print(b[i]);
			}
		 }
		 System.out.println("]");
		 
		 System.out.println();
		 
//--------------------------------------------------------------------------------	
		 
		 String[] v = s.split(" ");
		 
		 System.out.println("String in reverse order one by one:- ");
		 for(int i=0; i<v.length; i++)
		 {
			 System.out.print(v[i]+" ");
		 }
		 System.out.println();
		 for(int i=v.length-1; i>=0; i--)
		 {
			 System.out.print(v[i]+" ");
		 } 
	}

}
