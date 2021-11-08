package Neosoft_Java_Coding;

public class swap 
{

	public static void main(String[] args) 
	{
         int x=3;
         int y=4;
         int t=0;
         if(x<=y)
         {
        	t=x;
        	x=y;
        	y=t;
         }
         System.out.println("After swap "+x+ ","+y);
	}

}
