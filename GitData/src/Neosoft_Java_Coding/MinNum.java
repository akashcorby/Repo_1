package Neosoft_Java_Coding;

public class MinNum {

	public static void main(String[] args) 
	{
		int[] a= {4,7,6,3,9,8,0,1,5};
		//        0,1,2,3,4,5,6,7,8
		
		int min=a[0];//4
		for(int i=1; i<a.length; i++)
		{	
			    
			//7<=4//6<=4//3<=4//9<=4//8<=4//0<=4//1<=0//5<=0
			if(a[i]<=min)//i=1//i=2//i=3//i=4//i=5//i=6//i=7//i=8
			{
			    min=a[i];//min=4//min=0
			}
		}
		System.out.println("Max number of array: "+min);//min=0

	}

}
