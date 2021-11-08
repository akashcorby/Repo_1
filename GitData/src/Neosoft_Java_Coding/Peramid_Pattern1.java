package Neosoft_Java_Coding;

public class Peramid_Pattern1 
{

	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)//i-row
		{
			for(int j=3; j>=i; j--)//j-col
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int n=2; n<=i; n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
