package Neosoft_Java_Coding;

public class MaxNum 
{
	public static void main(String[] args) 
	{
		int[] a= {4,7,6,3,9,8,0,1,5};
		//        0,1,2,3,4,5,6,7,8
		
		int max=a[0];//4
		for(int i=1; i<a.length; i++)
		{	
			    //7>=4//6>=7//3>=7//9>=7//8>=9//0>=9//1>=9//5>=9
			
			if(a[i]>=max)//i=1//i=2//i=3//i=4//i=5//i=6//i=7//i=8
			{
			    max=a[i];//max=7//max=9
			}
		}
		System.out.println("Max number of array: "+max);//max=9
	}
	
}
