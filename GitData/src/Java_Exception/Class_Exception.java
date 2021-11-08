package Java_Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Class_Exception
{

	public static void main(String[] args) throws Exception
	{
		 String myString=null;
		 int[] myarray=new int[] {1,2,3,100,6};		//throws // throw 
		 
		try 
		{	
     		for(int i = 0; i<myarray.length; i++)
			{	
			System.out.println("List of array:- "+myarray[i]);
			Thread.sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("11111111111111111111111111111111111111111111111111");
//______________________________________________________________________________	
		try 
		{
			for (int i=0;i<9;i++) 
			{
				System.out.println("Value of element in myaaray"+myarray[i]);			
			}
		}
		catch(Exception e) 
		{
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("222222222222222222222222222222222222222222222222222");
//______________________________________________________________________________				
		 try 
		 {
			 if (myString.contains("Neosoft")) 
			 {
				 System.out.print("I am working at Neosoft");
	         }
		 }
		 catch(Exception e) 
		 {
			 //System.out.println(e.getMessage());
			 e.printStackTrace();
		 }
		 finally 
		 {
			 System.out.println("Finally block getting executed. It will get exceuted irrespective of exception");
		 }
		 System.out.println("333333333333333333333333333333333333333333333333333");
//___________________________________________________________________________________		
		 try 
		 {
			 FileInputStream myfile=new FileInputStream("D:\\sameer\\sample.txt");
			 myfile.read();
			 
		 }
		 catch(IOException e) 
		 {
			 System.out.println(e.getMessage());
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e.getMessage());
		 }
		 finally 
		 {
			 
			 System.out.println("closing any open connections"); 			 
		 }
		 System.out.println("44444444444444444444444444444444444444444444444444444");
//__________________________________________________________________________________		
//		 try 
//		 {
//			 Exception.readingFromFile();
//		 }
//		 catch(Exception e) 
//		 {
//			 
//		 }
		 try
		 {
		 for (int i=0;i<4;i++)       //int[] myarray=new int[] {1,2,3,100,6};	
		 {
			  if (myarray[i]==100)
			  {
				  //throw new Exception("throwing execption explictly");
				  System.out.println("myarray contain 100:- "+myarray[i]);
			  }			 				
		 }
		 }
		 catch(Exception e) 
		 {
		     e.printStackTrace();
	     }
		 
		 
		 System.out.print("End of the program");
		 System.out.println("5555555555555555555555555555555555555555555555555555555");
	}
}
//_____________________________________________________________________________________________	
	
//	 private void printStackTrace() 
//	 {
//	 
//	 }
	 
//	try 
//	 {
//		Class_Exception.readingFromFile();
//	 }
//	 catch(Exception e) 
//	 {
//		e.printStackTrace(); 
//	 }
//	public static void readingFromFile() throws IOException 
//	{		
//
//			 FileInputStream myfile=new FileInputStream("D:\\sameer\\sample.txt");
//			 myfile.read();
//
//	}	
    
	
	

//Some Example of exception

//int a=50/0;//ArithmeticException 
//
//String s=null;  
//System.out.println(s.length());//NullPointerException 
//
//String s="abc";  
//int i=Integer.parseInt(s);//NumberFormatException  
//
//int a[]=new int[5];  
//a[10]=50; //ArrayIndexOutOfBoundsException  
