package Neosoft_Java_Coding;

public class Array_Missing_Number 
{

	public static void main(String[] args) 
	{
         int[] a = {1,2,3,4,5,6,7,8,10};
         int n = a.length;         
         
         //sum of all number between 1-8
         int sum=0;
         //int w=10;
         for(int j=1; j<=a.length+1; j++)//1+2+3+4+5+6+7+8=36
         {
        	 sum+=j;
         }
         System.out.println(sum);
         
         //sum of all number of an array
         int sum1=0;
         for(int i=0; i<=a.length-1; i++)//1+2+3+4+6+7+8=31
         {
        	 sum1=sum1+a[i];
         }
         System.out.println(sum1);
         
         //missing number is:-
         int miss_num = sum-sum1;
         System.out.println("Missing number is:   "+miss_num);
	}

}
