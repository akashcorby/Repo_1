package Neosoft_Java_Coding;

import java.util.Scanner;

public class Wierd 
{

	public static void main(String[] args) 
	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int N=s.nextInt();
//		if(N%2!=0)
//        {
//         System.out.println("print Weird 1");   
//        }
//       //___________________________________________________________ 
//        
//          else if(N%2==0 && (N>=2 && N<=5))
//          {
//              System.out.println("print Not Weird 1");
//          }  
//        
//      //____________________________________________________________  
//       
//       
//          else if(N%2==0 && (N>=6 && N<=20))
//          {
//              System.out.println("print Weird 2");
//          }  
//        
//      //___________________________________________________________
//        
//         if(N%2==0 && N>=20) 
//         {
//           System.out.println("print Not Weird 2");
//         }
//        
//         
//        //scanner.close();
//__________________________________________________________________________		
//		Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s1=sc.next();
//            int x=sc.nextInt();
//            //Complete this line
//            System.out.println("O/P is :- "+s1+ " "+x);
//            System.out.println("================================");
//        }
//___________________________________________________________________________ 
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int N = scanner.nextInt();
//        int a=0;
//        System.out.println("Two's table is");
//        for(int i=1; i<=10; i++)
//        {
//           a=N*i;
//           System.out.println(N+"*"+i+"="+a);
//        }

//___________________________________________________________________________
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
        
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double x=0;
            for(int j=0; j<=10; j++)
            {	
            x = Math.pow(b,j);
            
            }
            System.out.println(a+x+n);
        
    }

}
