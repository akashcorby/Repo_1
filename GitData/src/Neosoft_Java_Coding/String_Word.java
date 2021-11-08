package Neosoft_Java_Coding;

public class String_Word {

	public static void main(String[] args) 
	{
		String s = "Sandeep";
		String s1 = "Sandeep";
		System.out.println(s.concat(s1));
		
	    if(s==s1)//It will check the String Content
	    {
	    	System.out.println("Is equals");
	    }
	    else
	    {
	    	System.out.println("Is not equals");
	    }
	    
	    if(s.equals(s1))//It will check the String Content
	    {
	    	System.out.println("Is Equals");
	    }
	    else
	    {
	    	System.out.println("Is not equals");
	    }
	//__________________________________________________________________________________    
	    String a = new String("Akash");
		String a1 = new String("Akash");
		
		if(a==a1)//It will not check the String Content rather it will check the address 
	    {
	    	System.out.println("Is equals");
	    }
	    else
	    {
	    	System.out.println("Is not equals");
	    }
		 if(s.equals(s1))//It will check the String Content
	    {
		    System.out.println("Is equals");
		}
		 else
	    {
		    System.out.println("Is not equals");
		}
		 
	//___________________________________________________________________________________
		 
		 String n = "Neosoft";
		 String n1= "neosoft";
		 
		 System.out.println("Are they Equals ?"+ n.equalsIgnoreCase(n1));
		 System.out.println("Are they Equals ?"+ n.equals(n1));
         
		 String m = "Akash Sandip";
		 System.out.println(m.substring(6));//Substring()
		 System.out.println(m.substring(2,9));//Substring( , )
		 
	//___________________________________________________________________________________	 
		 String o = "Akash Kumar";
		 int o1= o.length();
		 System.out.println(o1);
		 System.out.println("String in normal order:- ["+ o +"] ");
		 System.out.print("String in reverse order:- [");
		 for(int i=o1-1; i>=0; i--)
		 {
			 System.out.print(""+o.charAt(i)+"");//charAt//length
		 }
		 System.out.println("]");
		 
		 if(o.contains("Kumar"))//contains
		 {
			 System.out.println("It contains kumar");
		 }
		 else
		 {
			 System.out.println("It not contains kumar");
		 }	 
		 
	//___________________________________________________________________________________
		 String p="";
		 System.out.println("Is given string is empty:- "+p.isEmpty());
		 
	}

}
