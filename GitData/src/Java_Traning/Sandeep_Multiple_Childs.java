package Java_Traning;

public class Sandeep_Multiple_Childs 
{
	String name;//instance variable// value of the variable changing from object to object
	int roll;//same here also
	static String school;//Static variable //single copy of static variable will be share among all object created in class
	public static final int age;
	public final double height;//blank final member will not initialized while declaring variable
	
	Sandeep_Multiple_Childs()//public final double height, will initialized under constructor
	{
		height=6.1;// local variable
	}
	
	static  //while initializing static final variable it should be in static block only, not constructor or method.
	{
		System.out.println(age=20);// local variable//Static block will executed before running the main method//public static final int age will initialized under static block
	}
	
	public void play()
	{
		System.out.println("snadeep child play cricket");//local variable
	}
	public static void main(String[] args) 
	{
		Sandeep_Multiple_Childs c = new Sandeep_Multiple_Childs();
		System.out.println(c.name="chinku");
		System.out.println(c.roll=1);
		System.out.println(c.school="AFS Bagdogra School");
		
		Sandeep_Multiple_Childs c1 = new Sandeep_Multiple_Childs();
		System.out.println(c1.name="phinku");
		System.out.println(c1.roll=2);
		System.out.println(c1.school="AFS Bagdogra School");
		
		Sandeep_Multiple_Childs c2 = new Sandeep_Multiple_Childs();
		System.out.println(c2.height);
		c2.play();
	}
}
//types of variable's
//premitive variable int a=2;
//reference variable sandeep s=new sandeep();
//instance variable
//static variable
//local variable
