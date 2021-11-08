package Neosoft_Java_Coding;

public class Peramid_Pattern2 
{

	public static void main(String[] args) 
	{
		//Square peramid
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=4; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//-----------------------------------------------------------------------------------		
		
//		for (int i = 1; i <= 4; i++)
//		// for(int i=4; i>=1; i--)
//		{
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		 for(int i=4; i>=1; i--)
//		{
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//----------------------------------------------------------------------------------------
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4; i>=1; i--)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//--------------------------------------------------------------------------------------------
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			for(int n=2; n<=i; n++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4; i>=1; i--)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			for(int n=2; n<=i; n++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//----------------------------------------------------------------------------------------
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 4; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				if(k==1)
				{
					System.out.print("*");
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			System.out.println();

		}
		
		
	}

}
