package Neosoft_Java_Coding;

/*6) int[] arr= {5, 78, 90, 4, 36, 8, 7}
Define a method for each of the followings:
a. Find max. number.
b. Find the sum of all elements in arr.
c. Find the sum of all elements which are at EVEN array locations: e.g. arr[0], arr[2], arr[4], and so on.
d. Find the sum of all ODD integers in arr: in above array, sum of 5, 7.
e. Count the number of EVEN and ODD integers in arr: in above array the answer is 5 and 2.*/



public class Array1_Multi_Process 
{

	public static void main(String[] args) 
	{
	//___________________________max num________________________________________________
		int[] a= {5, 78, 90, 4, 36, 8, 7};
		int m=a[0];
		 for(int i=1; i<a.length; i++)
		 {
			 if(a[i]>m)
			 {
				 m=a[i];
			 }
		 }
		 System.out.println("max number is:- "+m);
		 
	//___________________________Sum of array___________________________________________	
		 
		 int r=0;
		 for(int i=0; i<a.length; i++)
		 {
			 r=r+a[i];
		 }
		 System.out.println("Sum of array is:- "+r);
		 
	//___________________________Sum of all even number_________________________________
		 
		 int s=0;
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i]%2==0)
			 {
				 s=s+a[i];
			 }
		 }
		 System.out.println("Sum of all even number is:-"+s);
		 
	//___________________________Sum of all odd number__________________________________
		 
		 int n=0;
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i]%2!=0)
			 {
				 n=n+a[i];
			 }
		 }
		 System.out.println("Sum of all odd number is:- "+n);

	//______________________count the number of odd and even number______________________
		 
		int even=0;
		int odd =0;
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i]%2==0)
			 {
				 even=even+1;
				 //System.out.println(even+" :-Is even num ");
			 }
			 else if(a[i]%2!=0)
			 {
				 odd=odd+1;
				 //System.out.println(odd+" :-Is odd num ");
			 }
		 }
		 System.out.println("There are "+even+" :- even num ");
		 System.out.println("There are "+odd+" :- odd num ");
		 
    //__________________________________________________________
	}

}
