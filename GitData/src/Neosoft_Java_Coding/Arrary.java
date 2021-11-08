 package Neosoft_Java_Coding;

import java.util.Scanner;

public class Arrary 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7};
		
	//____________________asscending order_____________________________	
		
		System.out.print("The array asscending order: [ ");
		for(int i=0; i<a.length; i++)
		{	
			 System.out.print(" "+a[i]+" ");
		}
		System.out.println("]");
		
	//______________________dessending order___________________________	
		
		System.out.print("The array dessending order: [ ");
		for(int i=a.length-1; i>=0; i--)
		{	
			 System.out.print(" "+ a[i]+ " ");
		}
		System.out.println("]");
		
	//_______________________Max number of array_______________________
		
		int max=a[0];//int[] a= {1,2,3,4,5,6,7};
		for(int i=1; i<a.length; i++)
		{	
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		System.out.println("Max number of array: "+max);
		
		
	//_________________________Min number of array______________________	
		
		int min=a[0];//int[] a= {1,2,3,4,5,6,7};
		for(int i=0; i<a.length; i++)
		{	
			if(a[i]<=min)
			{
				min=a[i];
			}
		}
		System.out.println("Min number of array: "+min);
		
    //_____________________________Both Min and Max Number in an array___________________
		
		
		int mini=a[0];
		int maxi=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<mini)
			{
				mini=a[i];
			}
			
			if(a[i]>maxi)
			{
				maxi=a[i];
			}
		}
		
		System.out.println("smallest no is:- "+min);
		System.out.println("largest no is:- "+max);
		
		
	//_______________________Sum of array is_____________________________	
		
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum array is: "+sum);
		
		
	//________________________Second largest number is___________________
		
		int t;
		for(int i=0; i<a.length; i++)//int[] a= {1,2,3,4,5,6,7};
			                         
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])//1<2//1<3
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Second largest number is "+a[1]);
		
    //_________________Missing Number_____________________________________
		
        int h= a.length+1;
		
		int sum2=(h *(h+1))/2;     //n=10  sum=(n*(n+1))/2 =55
		
		for(int i=0;i<a.length;i++)
		{
			sum2= sum2 - a[i];
		}
		System.out.println("mising number is:- "+ sum2);
		
		
	//__________________Even number and Odd number_______________________
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");	
		int b=s.nextInt();
		int num=b;
			if(num % 2 == 0)
			{
				System.out.println(num+" is Even number");
			}
			else
			{
				System.out.println(num+" is Odd number");
			
			}	
			
	//________________________Reverse a number without using Array_______________________
			
			int no=12345 , rem, rev=0;
			
			while(no!=0)
			{
				rem= no%10;
				rev= rev*10+rem;
				no= no/10;
			}
			System.out.println(rev);
	//________________________Armstrong number_______________________________________________
			
			//Hint:- (1*1*1)+(5*5*5)+(3*3*3)
			//1+125+27
			//153
			
			int n=153;
			int temp=n;
			int r;
			int sum1=0;
			
			while(n>0)
			{
				r=n%10;//153%10=3->reminder
				n=n/10;//153/10=15->Quotient
				sum1=sum1+r*r*r;
			}
			if(temp==sum1)
				System.out.println(" number is armstrong");
			else
				System.out.println("not armstrong");
			
	//_____________________Fibbonacci____________________________________
			
			int k=0 , x=1 ,y=1;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Number");
			int p=sc.nextInt();
			System.out.print("1 1");
			while(k<=p)
			{
				k=x+y;//k=2//k=3//k=4
				System.out.print(" "+k+" ");//2//3//4
				x=y;//x=1//x=1//x=1
				y=k;//y=2//y=3//y=4
			}	
			
    }
}
